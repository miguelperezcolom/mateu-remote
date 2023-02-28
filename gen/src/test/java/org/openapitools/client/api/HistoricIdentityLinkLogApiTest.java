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
import org.openapitools.client.model.CountResultDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.HistoricIdentityLinkLogDto;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoricIdentityLinkLogApi
 */
@Ignore
public class HistoricIdentityLinkLogApiTest {

    private final HistoricIdentityLinkLogApi api = new HistoricIdentityLinkLogApi();

    
    /**
     * Get Identity Link Logs
     *
     * Queries for historic identity link logs that fulfill given parameters. The size of the result set can be retrieved by using the [Get Identity-Link-Log Count](https://docs.camunda.org/manual/7.18/reference/rest/history/identity-links/get-identity-link-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricIdentityLinksTest() throws ApiException {
        String type = null;
        String userId = null;
        String groupId = null;
        OffsetDateTime dateBefore = null;
        OffsetDateTime dateAfter = null;
        String taskId = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String operationType = null;
        String assignerId = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<HistoricIdentityLinkLogDto> response = api.getHistoricIdentityLinks(type, userId, groupId, dateBefore, dateAfter, taskId, processDefinitionId, processDefinitionKey, operationType, assignerId, tenantIdIn, withoutTenantId, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get Identity Link Log Count
     *
     * Queries for the number of historic identity link logs that fulfill the given parameters. Takes the same parameters as the [Get Identity-Link-Logs](https://docs.camunda.org/manual/7.18/reference/rest/history/identity-links/get-identity-link-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricIdentityLinksCountTest() throws ApiException {
        String type = null;
        String userId = null;
        String groupId = null;
        OffsetDateTime dateBefore = null;
        OffsetDateTime dateAfter = null;
        String taskId = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String operationType = null;
        String assignerId = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        CountResultDto response = api.getHistoricIdentityLinksCount(type, userId, groupId, dateBefore, dateAfter, taskId, processDefinitionId, processDefinitionKey, operationType, assignerId, tenantIdIn, withoutTenantId);

        // TODO: test validations
    }
    
}
