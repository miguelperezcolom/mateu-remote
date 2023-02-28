package com.example.mockserver.mateu.ui.camunda.commands;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import com.example.mockserver.mateu.ui.camunda.queries.GetStepQuery;
import io.mateu.remote.dtos.Field;
import io.mateu.remote.dtos.Form;
import io.mateu.remote.dtos.Step;
import lombok.*;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.api.TaskApi;
import org.openapitools.client.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
public class RunStepActionCommand {

    private String journeyId;

    private String stepId;

    private String actionId;

    private Map<String, Object> data;

    public void run() throws Exception {
        ApiClient apiClient = CamundaApiClient.get();

        if ("complete".equals(actionId)) {

            TaskApi taskApiInstance = new TaskApi(apiClient);
            try {

                Map<String, VariableValueDto> variables = taskApiInstance
                        .getFormVariables(stepId, null, true);

                if (variables.size() == 0) { // es un camunda form
                    for (String key : data.keySet()) {
                        VariableValueDto value = new VariableValueDto();
                        value.setType("string");
                        value.setValue(data.get(key));
                        //todo: ver si hay que añadir algo comom ValueInfo
                        //value.setValueInfo();
                        variables.put(key, value);
                    }
                } else {
                    List<String> keysToRemove = new ArrayList<>();
                    for (String key: variables.keySet()) {
                        if (data.containsKey(key)) {
                            VariableValueDto value = variables.get(key);
                            value.setValue(data.get(key));
                            //todo: ver si hay que añadir algo comom ValueInfo
                            //value.setValueInfo();
                            variables.put(key, value);
                        } else {
                            keysToRemove.add(key);
                        }
                    }
                    keysToRemove.forEach(k -> variables.remove(k));
                }

                CompleteTaskDto dto = new CompleteTaskDto();
                dto.setVariables(variables);
                taskApiInstance.complete(stepId, dto);

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

            } catch (ApiException e) {
                System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
                System.err.println("Status code: " + e.getCode());
                System.err.println("Reason: " + e.getResponseBody());
                System.err.println("Response headers: " + e.getResponseHeaders());
                throw e;
            }

        } else {
            throw new Exception("Unkonwn action " + actionId);
        }

    }
}
