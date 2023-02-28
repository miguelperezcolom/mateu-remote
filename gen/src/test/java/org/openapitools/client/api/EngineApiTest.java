/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.18.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ProcessEngineDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EngineApi
 */
@Ignore
public class EngineApiTest {

    private final EngineApi api = new EngineApi();

    
    /**
     * Get List
     *
     * Retrieves the names of all process engines available on your platform. **Note**: You cannot prepend &#x60;/engine/{name}&#x60; to this method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessEngineNamesTest() throws ApiException {
        List<ProcessEngineDto> response = api.getProcessEngineNames();

        // TODO: test validations
    }
    
}
