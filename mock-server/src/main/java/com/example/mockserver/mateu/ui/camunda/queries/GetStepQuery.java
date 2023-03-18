package com.example.mockserver.mateu.ui.camunda.queries;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import com.example.mockserver.mateu.ui.camunda.forms.dtos.CamundaForm;
import com.google.gson.Gson;
import io.mateu.remote.dtos.*;
import lombok.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.DeploymentApi;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.DeploymentDto;
import org.openapitools.client.model.ProcessDefinitionDiagramDto;
import org.openapitools.client.model.TaskDto;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Builder
public class GetStepQuery {

    private final Namespace bpmnNs = Namespace.getNamespace("http://www.omg.org/spec/BPMN/20100524/MODEL");
    private final Namespace camundaNs = Namespace.getNamespace("http://camunda.org/schema/1.0/bpmn");

    private String journeyId;

    private String stepId;

    public Step run() throws Exception {

        ApiClient apiClient = CamundaApiClient.get();

        TaskApi taskApiInstance = new TaskApi(apiClient);
        try {

            TaskDto task = taskApiInstance.getTask(stepId);

            Step step = getStep(apiClient, task.getProcessDefinitionId(), task.getTaskDefinitionKey(), task.getId());

           return step;

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            throw e;
        }
    }

    private Step getStep(ApiClient apiClient, String processDefinitionId, String taskDefinitionKey, String taskId) throws ApiException, IOException, JDOMException {

        ProcessDefinitionApi processDefinitionApi = new ProcessDefinitionApi(apiClient);

        ProcessDefinitionDiagramDto bpmn = processDefinitionApi.getProcessDefinitionBpmn20Xml(processDefinitionId);
        String xml = bpmn.getBpmn20Xml();

        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(new StringReader(xml));
        Element definitions = doc.getRootElement();
        Element process = definitions.getChild("process", bpmnNs);
        List<Element> userTasks = process.getChildren("userTask", bpmnNs);
        Element task = userTasks.stream().filter(e -> taskDefinitionKey.equals(e.getAttributeValue("id"))).findFirst().get();

        Step step = null;
        if (task.getAttribute("formKey", camundaNs) != null) { // es un formulario html?
            step = Step.builder()
                    .name(task.getAttributeValue("name"))
                    .view(View.builder()
                            .components(List.of(Component.builder()
                                    .data(Map.of())
                                    .metadata(Form.builder()
                                            .title(task.getAttributeValue("name"))
                                            .subtitle(task.getAttributeValue("id"))
                                            .sections(List.of())
                                            .actions(List.of())
                                            .mainActions(List.of())
                                            .build())
                                    .rules(List.of())
                                    .build()))
                            .build())
                    .build();
        } else if (task.getAttribute("formRef", camundaNs) != null) { // es un formulario de camunda

            String camundaFormRef = task.getAttributeValue("formRef", camundaNs);

            TaskApi taskApi = new TaskApi(apiClient);
            File deployedForm = taskApi.getDeployedForm(taskId); // embedded forms

            String json = readFromInputStream(new FileInputStream(deployedForm));

            Gson gson = new Gson();
            CamundaForm camundaForm = gson.fromJson(json, CamundaForm.class);

            Map<String, Object> data = Arrays.stream(camundaForm.getComponents())
                    .filter(e -> e.getDefaultValue() != null)
                    .map(e -> Pair.builder()
                            .key(e.getKey())
                            .value(e.getDefaultValue())
                            .build())
                    .collect(Collectors.toMap(Pair::getKey, Pair::getValue));

            Form form = Form.builder()
                    .title(task.getAttributeValue("name"))
                    .subtitle(task.getAttributeValue("id"))
                    .sections(createSections(camundaForm))
                    .actions(List.of())
                    .mainActions(List.of(Action.builder()
                            .type(ActionType.Primary)
                            .id("complete")
                            .caption("Complete")
                            .build()))
                    .build();

            step = Step.builder()
                    .name(task.getAttributeValue("name"))
                    .view(View.builder()
                            .components(List.of(Component.builder()
                                    .data(data)
                                    .metadata(form)
                                    .rules(getRules(camundaForm))
                                    .build()))
                            .build())
                    .build();

        } else if (task.getChild("extensionElements", bpmnNs) != null
                && task.getChild("extensionElements", bpmnNs).getChild("formData", camundaNs) != null
                && task.getChild("extensionElements", bpmnNs).getChild("formData", camundaNs)
                .getChildren("formField", camundaNs) != null) {
            List<Element> formFields = task.getChild("extensionElements", bpmnNs)
                    .getChild("formData", camundaNs).getChildren("formField", camundaNs);

            Map<String, Object> data = formFields.stream()
                    .filter(e -> e.getAttribute("defaultValue") != null)
                    .map(e -> Pair.builder()
                            .key(e.getAttributeValue("id"))
                            .value(e.getAttributeValue("defaultValue"))
                            .build())
                    .collect(Collectors.toMap(Pair::getKey, Pair::getValue));

            Form form = Form.builder()
                    .title(task.getAttributeValue("name"))
                    .subtitle(task.getAttributeValue("id"))
                    .sections(createSections(formFields))
                    .actions(List.of())
                    .mainActions(List.of(Action.builder()
                            .type(ActionType.Primary)
                            .id("complete")
                            .caption("Complete")
                            .build()))
                    .build();

            step = Step.builder()
                    .name(task.getAttributeValue("name"))
                    .view(View.builder()
                            .components(List.of(Component.builder()
                                    .data(data)
                                    .metadata(form)
                                    .rules(List.of())
                                    .build()))
                            .build())
                    .build();
        } else {
            Form form = Form.builder()
                    .title(task.getAttributeValue("name"))
                    .subtitle(task.getAttributeValue("id"))
                    .sections(List.of())
                    .actions(List.of())
                    .mainActions(List.of(Action.builder()
                            .type(ActionType.Primary)
                            .id("complete")
                            .caption("Complete")
                            .build()))
                    .build();

            step = Step.builder()
                    .name(task.getAttributeValue("name"))
                    .view(View.builder()
                            .components(List.of(Component.builder()
                                    .data(Map.of())
                                    .metadata(form)
                                    .rules(List.of())
                                    .build()))
                            .build())
                    .build();
        }


        return step;
    }

    private List<Rule> getRules(CamundaForm camundaForm) {
        List<Rule> rules = new ArrayList<>();
        for (com.example.mockserver.mateu.ui.camunda.forms.dtos.Component component : camundaForm.getComponents()) {
            if (component.getConditional() != null) {
                if (component.getConditional().getHide() != null && !"".equals(component.getConditional().getHide().trim())) {

                    String js = component.getConditional().getHide();
                    if (js.startsWith("=")) js = js.substring(1);
                    js = "!(" + js + ")";

                    rules.add(Rule.builder()
                                    .filter(js)
                                    .action(RuleAction.Hide)
                                    .data(new String[] {component.getKey()})
                                    .result(RuleResult.Continue)
                            .build());
                }
            }
        }
        return rules;
    }

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    private List<Section> createSections(List<Element> formFields) {
        List<Section> sections = List.of(Section.builder()
                .caption("")
                .actions(List.of())
                .type(SectionType.Card)
                .fieldGroups(List.of(FieldGroup.builder()
                        .caption("")
                        .fields(createFields(formFields))
                        .build()))
                .build());
        return sections;
    }

    private List<Section> createSections(CamundaForm camundaForm) {
        List<Section> sections = List.of(Section.builder()
                .caption("")
                .actions(List.of())
                .type(SectionType.Card)
                .fieldGroups(List.of(FieldGroup.builder()
                        .caption("")
                        .fields(createFields(camundaForm))
                        .build()))
                .build());
        return sections;
    }

    private List<Field> createFields(List<Element> formFields) {

        List<Field> fields = formFields.stream().map(e -> Field.builder()
                .id(e.getAttributeValue("id"))
                .caption(e.getAttributeValue("label"))
                .type(e.getAttributeValue("type"))
                .attributes(getAttributes(e))
                .validations(createValidations(e))
                .build()).collect(Collectors.toList());
        return fields;
    }

    private List<Field> createFields(CamundaForm camundaForm) {

        List<Field> fields = Arrays.stream(camundaForm.getComponents()).map(e -> Field.builder()
                .id(e.getKey())
                .caption(e.getLabel())
                .type(mapCamundaType(e.getType()))
                .description(e.getDescription())
                .attributes(getAttributes(e))
                .validations(createValidations(e))
                .build()).collect(Collectors.toList());
        return fields;
    }

    private String mapCamundaType(String type) {
        Map<String, String> map = Map.of(
                "textfield", "string",
                "number", "long",
                "select", "enum"
        );

        return map.getOrDefault(type, "string");
    }

    private List<Validation> createValidations(com.example.mockserver.mateu.ui.camunda.forms.dtos.Component component) {
        /*
        <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
         */
        if (component.getValidate() == null || !component.getValidate().isRequired()) return List.of();
        return List.of(Validation.builder()
                .type(ValidationType.NotEmpty)
                .data(null)
                .build());
    }

    private List<Validation> createValidations(Element efield) {
        /*
        <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
         */
        if (efield.getChild("validation", camundaNs) == null) return List.of();
        return efield.getChild("validation", camundaNs).getChildren("constraint", camundaNs).stream().map(e -> Validation.builder()
                .type(getValidationType(e.getAttributeValue("name")))
                .data(null)
                .build()).filter(v -> v.getType() != null).collect(Collectors.toList());
    }

    private ValidationType getValidationType(String name) {
        if ("required".equals(name)) return ValidationType.NotEmpty;
        else return null;
    }

    private List<Pair> getAttributes(Element eField) {
        List<Pair> attributes = eField.getChildren("value", camundaNs).stream()
                .map(e -> Pair.builder()
                        .key("choice")
                        .value(Pair.builder()
                                .key(e.getAttributeValue("name"))
                                .value(e.getAttributeValue("id"))
                                .build())
                        .build())
                .collect(Collectors.toList());

        return  attributes;
    }

    private List<Pair> getAttributes(com.example.mockserver.mateu.ui.camunda.forms.dtos.Component component) {

        if (component.getValues() == null) return List.of();

        List<Pair> attributes = Arrays.stream(component.getValues())
                .map(e -> Pair.builder()
                        .key("choice")
                        .value(Pair.builder()
                                .key(e.getLabel())
                                .value(e.getValue())
                                .build())
                        .build())
                .collect(Collectors.toList());

        return  attributes;
    }


}
