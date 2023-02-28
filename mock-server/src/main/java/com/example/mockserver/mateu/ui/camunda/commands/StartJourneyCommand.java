package com.example.mockserver.mateu.ui.camunda.commands;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import lombok.*;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.model.ProcessDefinitionDto;
import org.openapitools.client.model.ProcessInstanceWithVariablesDto;
import org.openapitools.client.model.StartProcessInstanceDto;

@Builder
public class StartJourneyCommand {

    private String journeyTypeId;

    private String journeyId;

    public void run() throws ApiException {
        ApiClient apiClient = CamundaApiClient.get();

        ProcessDefinitionApi processDefinitionApiInstance = new ProcessDefinitionApi(apiClient);
        try {

            ProcessDefinitionDto processDefinition = processDefinitionApiInstance.getProcessDefinition(journeyTypeId);
            processDefinition = processDefinitionApiInstance.getProcessDefinitionByKey(processDefinition.getKey());


            StartProcessInstanceDto startProcessInstanceDto = new StartProcessInstanceDto();
            startProcessInstanceDto.setBusinessKey(journeyId);
            ProcessInstanceWithVariablesDto result = processDefinitionApiInstance
                    .startProcessInstance(processDefinition.getId(), startProcessInstanceDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            throw e;
        }
    }
}
