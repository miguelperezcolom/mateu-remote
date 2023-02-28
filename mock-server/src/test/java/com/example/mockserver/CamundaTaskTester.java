package com.example.mockserver;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import io.mateu.remote.dtos.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.api.ProcessInstanceApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CamundaTaskTester {

    @Test
    public void getStepTest() {

        ApiClient apiClient = CamundaApiClient.get();

        String stepId = "1c557ab9-b4f3-11ed-a424-960001f240a0"; // task id

        TaskApi taskApiInstance = new TaskApi(apiClient);
        try {

            TaskDto task = taskApiInstance.getTask(stepId);

            System.out.println(task);

            /*

            id
            name
            asignee
            created
            executionId ???
            processDefinitionId: Process_1bxh4ag:4:5eec0ed5-b4f1-11ed-a424-960001f240a0
            processInstanceId: 1c5553a6-b4f3-11ed-a424-960001f240a0
            taskDefinitionKey: Activity_1nphpgy
            suspended: false
            formKey: null
            camundaFormRef: null

             */

            FormDto form = taskApiInstance.getForm(stepId);
            System.out.println(form);
            /*
            embedded:engine://engine/:engine/task/1c557ab9-b4f3-11ed-a424-960001f240a0/rendered-form
            contextPath: null
             */

            Step step = getFormInfo(apiClient, task.getProcessDefinitionId(), task.getTaskDefinitionKey());

            System.out.println(step);


            // valores
            Map<String, VariableValueDto> variables = taskApiInstance.getFormVariables(stepId, null, false);
            System.out.println(variables);



        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }


    }

    private Step getFormInfo(ApiClient apiClient, String processDefinitionId, String taskDefinitionKey) throws ApiException, IOException, JDOMException {

        ProcessDefinitionApi processDefinitionApi = new ProcessDefinitionApi(apiClient);

        ProcessDefinitionDto def = processDefinitionApi.getProcessDefinition(processDefinitionId);

        System.out.println(def);
        /*
        class ProcessDefinitionDto {
    id: Process_1bxh4ag:4:5eec0ed5-b4f1-11ed-a424-960001f240a0
    key: Process_1bxh4ag
    category: http://bpmn.io/schema/bpmn
    description: null
    name: Term life sale flow
    version: 4
    resource: diagram_0.bpmn
    deploymentId: 5ee8b373-b4f1-11ed-a424-960001f240a0
    diagram: null
    suspended: false
    tenantId: null
    versionTag: null
    historyTimeToLive: null
    startableInTasklist: true
}
         */


        ProcessDefinitionDiagramDto bpmn = processDefinitionApi.getProcessDefinitionBpmn20Xml(processDefinitionId);
        String xml = bpmn.getBpmn20Xml();

        Namespace bpmnns = Namespace.getNamespace("http://www.omg.org/spec/BPMN/20100524/MODEL");
        Namespace camundans = Namespace.getNamespace("http://camunda.org/schema/1.0/bpmn");

        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(new StringReader(xml));
        Element definitions = doc.getRootElement();
        Element process = definitions.getChild("process", bpmnns);
        List<Element> userTasks = process.getChildren("userTask", bpmnns);
        Element task = userTasks.stream().filter(e -> taskDefinitionKey.equals(e.getAttributeValue("id"))).findFirst().get();
        List<Element> formFields = task.getChild("extensionElements", bpmnns)
                .getChild("formData", camundans).getChildren("formField", camundans);

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

        Step step = Step.builder()
                .name(task.getAttributeValue("name"))
                .view(View.builder()
                        .components(List.of(Component.builder()
                                        .data(data)
                                        .metadata(form)
                                        .rules(List.of())
                                .build()))
                        .build())
                .build();
        System.out.println(task);

        return step;
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

    private List<Field> createFields(List<Element> formFields) {
        List<Field> fields = formFields.stream().map(e -> Field.builder()
                .id(e.getAttributeValue("id"))
                .caption(e.getAttributeValue("label"))
                .type(e.getAttributeValue("type"))
                .attributes(List.of(Pair.builder()
                        .key("defaultValue")
                        .value(e.getAttributeValue("defaultValue"))
                        .build()))
                .validations(List.of())
                .build()).collect(Collectors.toList());
        return fields;
    }

}
