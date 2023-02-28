package com.example.mockserver;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import com.example.mockserver.mateu.ui.camunda.queries.GetJourneyTypesQuery;
import io.mateu.remote.dtos.Journey;
import io.mateu.remote.dtos.JourneyStatus;
import io.mateu.remote.dtos.JourneyType;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.api.ProcessInstanceApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CamundaStartProcessTester {


    @Test
    public void testStartProcess() throws Exception {

        ApiClient apiClient = CamundaApiClient.get();


        List<JourneyType> journeyTypes = GetJourneyTypesQuery.builder().build().run();

        JourneyType termLife = journeyTypes.stream().filter(j -> j.getName().toLowerCase().contains("term")).findFirst().get();

        ProcessDefinitionApi apiInstance = new ProcessDefinitionApi(apiClient);
        try {
            StartProcessInstanceDto startProcessInstanceDto = new StartProcessInstanceDto();
            startProcessInstanceDto.setBusinessKey(UUID.randomUUID().toString());
            ProcessInstanceWithVariablesDto result = apiInstance.startProcessInstance(termLife.getId(), startProcessInstanceDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

    }

    @Test
    public void testRunningProcesses() throws Exception {

        ApiClient apiClient = CamundaApiClient.get();

        ProcessInstanceApi processApiInstance = new ProcessInstanceApi(apiClient);
        try {
            String businessKey = "5d1c5636-437c-45d5-8132-8c4a5636b65b";
            List<ProcessInstanceDto> result = processApiInstance.getProcessInstances(
                    null, null, 0, 100, null, businessKey,
                    null, null, null, null,
                    null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null,
                    null, null, null, null,
                    null);
            System.out.println(result);
            // si la lista está vacía devolver not found
            ProcessInstanceDto dto = result.get(0);

            JourneyStatus status = JourneyStatus.Running;
            if (dto.getEnded()) status = JourneyStatus.Finished;
            if (dto.getSuspended()) status = JourneyStatus.Pending;

            Map<JourneyStatus, String> statusMessages = Map.of(JourneyStatus.Running, "Processing. Please wait..."
                    , JourneyStatus.Finished, "You are done. Thanks ;)"
                    , JourneyStatus.Pending, "Please fill the form"
            );

            Journey j = Journey.builder()
                    .status(status)
                    .statusMessage(statusMessages.get(status))
                    .currentStepId(getStepId(businessKey, apiClient))
                    .build();

            System.out.println(j);

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

    }

    private String getStepId(String businessKey, ApiClient apiClient) throws ApiException {

        TaskApi taskApiInstance = new TaskApi(apiClient);

        List<TaskDto> tasks = taskApiInstance.getTasks(
                null, null, null, null, businessKey,
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

        // solo devuelve las tareas activas
        System.out.println(tasks);
        System.out.println(tasks.size());

        if (tasks.size() == 0) return null;

        TaskDto task = tasks.get(0);

        System.out.println(task);

        return task.getId();

        /*
        taskApiInstance.getTask(id);
        taskApiInstance.claim();
        taskApiInstance.complete();
        taskApiInstance.getForm();
        taskApiInstance.getFormVariables();
        taskApiInstance.queryTasks();
        taskApiInstance.resolve();
        taskApiInstance.setAssignee();
        taskApiInstance.submit();
        taskApiInstance.unclaim();
        taskApiInstance.updateTask();

         */

    }

}
