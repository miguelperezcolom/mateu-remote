package com.example.mockserver.mateu.ui.camunda.queries;

import com.example.mockserver.mateu.ui.camunda.CamundaApiClient;
import io.mateu.remote.dtos.JourneyType;
import lombok.*;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.model.ProcessDefinitionDto;

import java.util.List;
import java.util.stream.Collectors;


@Builder
public class GetJourneyTypesQuery {

    public List<JourneyType> run() throws Exception {

        ApiClient apiClient = CamundaApiClient.get();

        ProcessDefinitionApi apiInstance = new ProcessDefinitionApi(apiClient);
        try {
            List<ProcessDefinitionDto> result = apiInstance.getProcessDefinitions(
                    null, null, null, null, null,
                    null, null, null, null, null, null,
                    null, null, true, null, null,
                    null, null, null, null, null,
                    null, null, null, null,
                    null, null, null, null,
                    null, null, null, null, null,
                    0, 100);

            List<JourneyType> journeyTypes = result.stream().filter(dto -> !dto.getSuspended()).map(dto -> JourneyType.builder()
                    .id(dto.getId())
                    .name(dto.getName())
                    .description(dto.toString())
                    .build()).collect(Collectors.toList());
            return journeyTypes;

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            throw e;
        }
    }
}
