package com.example.mockserver;

import io.mateu.remote.dtos.JourneyType;
import okhttp3.*;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.AuthorizationApi;

import org.junit.jupiter.api.Test;
import org.openapitools.client.api.ProcessDefinitionApi;
import org.openapitools.client.model.ProcessDefinitionDto;
import org.openapitools.client.model.ResourceOptionsDto;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CamundaProcessDefinitionTester {

    @Test
    public void testGetAvailableOperations() {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://hetzner2:8080/engine-rest");

        AuthorizationApi apiInstance = new AuthorizationApi(defaultClient);
        try {
            ResourceOptionsDto result = apiInstance.availableOperationsAuthorization();
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
    public void testGetProcesses() {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://hetzner2/engine-rest");

        OkHttpClient client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Override public Request authenticate(Route route, Response response) throws IOException {
                        if (response.request().header("Authorization") != null) {
                            return null; // Give up, we've already attempted to authenticate.
                        }

                        System.out.println("Authenticating for response: " + response);
                        System.out.println("Challenges: " + response.challenges());
                        String credential = Credentials.basic("miguel",
                                "PF4mv9LfzwDCtZYY8Bj53c5KPfShTqVmBT78Qva75VkftWnUt8p7xwVp444vTCGv");
                        return response.request().newBuilder()
                                .header("Authorization", credential)
                                .build();
                    }
                })
                .build();

        defaultClient.setHttpClient(client);

        ProcessDefinitionApi apiInstance = new ProcessDefinitionApi(defaultClient);
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
            System.out.println(result);

            List<JourneyType> journeyTypes = result.stream().map(dto -> JourneyType.builder()
                    .id(dto.getId())
                    .name(dto.getName())
                    .description(dto.toString())
                    .build()).collect(Collectors.toList());
            System.out.println(journeyTypes);

        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#availableOperationsAuthorization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

    }

}
