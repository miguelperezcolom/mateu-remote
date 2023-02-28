package com.example.mockserver.mateu.ui.camunda.queries;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import io.mateu.remote.dtos.Journey;
import io.mateu.remote.dtos.JourneyStatus;
import io.mateu.remote.dtos.JourneyType;
import lombok.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.api.ProcessInstanceApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.ProcessDefinitionDiagramDto;
import org.openapitools.client.model.ProcessDefinitionDto;
import org.openapitools.client.model.ProcessInstanceDto;
import org.openapitools.client.model.TaskDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@Builder
public class GetJourneyQuery {

    private final Namespace bpmnNs = Namespace.getNamespace("http://www.omg.org/spec/BPMN/20100524/MODEL");
    private final Namespace camundaNs = Namespace.getNamespace("http://camunda.org/schema/1.0/bpmn");

    private String journeyId;

    public Journey run() throws Exception {

        ApiClient apiClient = CamundaApiClient.get();

        ProcessInstanceApi processApiInstance = new ProcessInstanceApi(apiClient);
        try {
            List<ProcessInstanceDto> result = processApiInstance.getProcessInstances(
                    null, null, 0, 100, null, journeyId,
                    null, null, null, null,
                    null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null,
                    null, null, null, null,
                    null);

            if (result == null || result.size() == 0) {
                //throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Journey not found");

                return Journey.builder()
                        .type("")
                        .status(JourneyStatus.Finished)
                        .statusMessage("Finished")
                        .currentStepId(null)
                        .currentStepDefinitionId(null)
                        .build();
            }

            ProcessInstanceDto processDto = result.get(0);

            String currentStepId = getStepId(apiClient);
            String currentStepDefinitionId = getStepDefinitionId(apiClient);


            JourneyStatus status = getStatus(apiClient, processDto, currentStepId);

            Map<JourneyStatus, String> statusMessages = Map.of(JourneyStatus.Running, "Processing. Please wait..."
                    , JourneyStatus.Finished, "You are done. Thanks ;)"
                    , JourneyStatus.Pending, "Please fill the form"
            );

            Journey j = Journey.builder()
                    .type(processDto.getDefinitionId())
                    .status(status)
                    .statusMessage(statusMessages.get(status))
                    .currentStepId(currentStepId)
                    .currentStepDefinitionId(currentStepDefinitionId)
                    .build();

            return j;

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            throw e;
        }
    }

    private JourneyStatus getStatus(ApiClient apiClient, ProcessInstanceDto processDto, String currentStepId) throws IOException, JDOMException, ApiException {
        JourneyStatus status = JourneyStatus.Pending;
        if (processDto.getEnded()) status = JourneyStatus.Finished;
        if (processDto.getSuspended()) status = JourneyStatus.Running;
        if (JourneyStatus.Pending.equals(status)) {
            if (currentStepId == null || !isUserTask(apiClient, processDto.getDefinitionId(), currentStepId)) {
                status = JourneyStatus.Running;
            }
        }
        return status;
    }

    private boolean isUserTask(ApiClient apiClient, String processDefinitionId, String stepId) throws ApiException, IOException, JDOMException {
        ProcessDefinitionApi processDefinitionApi = new ProcessDefinitionApi(apiClient);
        TaskApi taskApiInstance = new TaskApi(apiClient);
        TaskDto taskDto = taskApiInstance.getTask(stepId);

        ProcessDefinitionDiagramDto bpmn = processDefinitionApi.getProcessDefinitionBpmn20Xml(processDefinitionId);
        String xml = bpmn.getBpmn20Xml();

        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(new StringReader(xml));
        Element definitions = doc.getRootElement();
        Element process = definitions.getChild("process", bpmnNs);
        List<Element> userTasks = process.getChildren("userTask", bpmnNs);
        Optional<Element> task = userTasks.stream().filter(e -> taskDto.getTaskDefinitionKey().equals(e.getAttributeValue("id"))).findFirst();

        return task.isPresent();
    }

    private String getStepId(ApiClient apiClient) throws ApiException {
        TaskApi taskApiInstance = new TaskApi(apiClient);

        List<TaskDto> tasks = taskApiInstance.getTasks(
                null, null, null, null, journeyId,
                null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, 0, 100);

        //todo: filtrar solo las tareas de usuario?

        // solo devuelve las tareas activas
        if (tasks.size() == 0) return null;

        TaskDto task = tasks.get(0);

        return task.getId();
    }

    private String getStepDefinitionId(ApiClient apiClient) throws ApiException {
        TaskApi taskApiInstance = new TaskApi(apiClient);

        List<TaskDto> tasks = taskApiInstance.getTasks(
                null, null, null, null, journeyId,
                null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null, 0, 100);

        //todo: filtrar solo las tareas de usuario?

        // solo devuelve las tareas activas
        if (tasks.size() == 0) return null;

        TaskDto task = tasks.get(0);

        return task.getTaskDefinitionKey();
    }
}
