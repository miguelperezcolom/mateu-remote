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
import org.openapitools.client.model.BatchDto;
import org.openapitools.client.model.CountResultDto;
import org.openapitools.client.model.DeleteHistoricDecisionInstancesDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.HistoricDecisionInstanceDto;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.SetRemovalTimeToHistoricDecisionInstancesDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoricDecisionInstanceApi
 */
@Ignore
public class HistoricDecisionInstanceApiTest {

    private final HistoricDecisionInstanceApi api = new HistoricDecisionInstanceApi();

    
    /**
     * Delete Async (POST)
     *
     * Delete multiple historic decision instances asynchronously (batch). At least &#x60;historicDecisionInstanceIds&#x60; or &#x60;historicDecisionInstanceQuery&#x60;  has to be provided. If both are provided then all instances matching query  criterion and instances from the list will be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAsyncTest() throws ApiException {
        DeleteHistoricDecisionInstancesDto deleteHistoricDecisionInstancesDto = null;
        BatchDto response = api.deleteAsync(deleteHistoricDecisionInstancesDto);

        // TODO: test validations
    }
    
    /**
     * Get Historic Decision Instance
     *
     * Retrieves a historic decision instance by id, according to the  &#x60;HistoricDecisionInstance&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricDecisionInstanceTest() throws ApiException {
        String id = null;
        Boolean includeInputs = null;
        Boolean includeOutputs = null;
        Boolean disableBinaryFetching = null;
        Boolean disableCustomObjectDeserialization = null;
        HistoricDecisionInstanceDto response = api.getHistoricDecisionInstance(id, includeInputs, includeOutputs, disableBinaryFetching, disableCustomObjectDeserialization);

        // TODO: test validations
    }
    
    /**
     * Get Historic Decision Instances
     *
     * Queries for historic decision instances that fulfill the given parameters.  The size of the result set can be retrieved by using the  [Get Historic Decision Instance Count](https://docs.camunda.org/manual/7.18/reference/rest/history/decision-instance/get-decision-instance-query-count/)  method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricDecisionInstancesTest() throws ApiException {
        String decisionInstanceId = null;
        String decisionInstanceIdIn = null;
        String decisionDefinitionId = null;
        String decisionDefinitionIdIn = null;
        String decisionDefinitionKey = null;
        String decisionDefinitionKeyIn = null;
        String decisionDefinitionName = null;
        String decisionDefinitionNameLike = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processInstanceId = null;
        String caseDefinitionId = null;
        String caseDefinitionKey = null;
        String caseInstanceId = null;
        String activityIdIn = null;
        String activityInstanceIdIn = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        OffsetDateTime evaluatedBefore = null;
        OffsetDateTime evaluatedAfter = null;
        String userId = null;
        String rootDecisionInstanceId = null;
        Boolean rootDecisionInstancesOnly = null;
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionKey = null;
        Boolean includeInputs = null;
        Boolean includeOutputs = null;
        Boolean disableBinaryFetching = null;
        Boolean disableCustomObjectDeserialization = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<HistoricDecisionInstanceDto> response = api.getHistoricDecisionInstances(decisionInstanceId, decisionInstanceIdIn, decisionDefinitionId, decisionDefinitionIdIn, decisionDefinitionKey, decisionDefinitionKeyIn, decisionDefinitionName, decisionDefinitionNameLike, processDefinitionId, processDefinitionKey, processInstanceId, caseDefinitionId, caseDefinitionKey, caseInstanceId, activityIdIn, activityInstanceIdIn, tenantIdIn, withoutTenantId, evaluatedBefore, evaluatedAfter, userId, rootDecisionInstanceId, rootDecisionInstancesOnly, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey, includeInputs, includeOutputs, disableBinaryFetching, disableCustomObjectDeserialization, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get Historic Decision Instance Count
     *
     * Queries for the number of historic decision instances that fulfill the given parameters.  Takes the same parameters as the  [Get Historic Decision Instances](https://docs.camunda.org/manual/7.18/reference/rest/history/decision-instance/get-decision-instance-query/)  method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricDecisionInstancesCountTest() throws ApiException {
        String decisionInstanceId = null;
        String decisionInstanceIdIn = null;
        String decisionDefinitionId = null;
        String decisionDefinitionIdIn = null;
        String decisionDefinitionKey = null;
        String decisionDefinitionKeyIn = null;
        String decisionDefinitionName = null;
        String decisionDefinitionNameLike = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processInstanceId = null;
        String caseDefinitionId = null;
        String caseDefinitionKey = null;
        String caseInstanceId = null;
        String activityIdIn = null;
        String activityInstanceIdIn = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        OffsetDateTime evaluatedBefore = null;
        OffsetDateTime evaluatedAfter = null;
        String userId = null;
        String rootDecisionInstanceId = null;
        Boolean rootDecisionInstancesOnly = null;
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionKey = null;
        CountResultDto response = api.getHistoricDecisionInstancesCount(decisionInstanceId, decisionInstanceIdIn, decisionDefinitionId, decisionDefinitionIdIn, decisionDefinitionKey, decisionDefinitionKeyIn, decisionDefinitionName, decisionDefinitionNameLike, processDefinitionId, processDefinitionKey, processInstanceId, caseDefinitionId, caseDefinitionKey, caseInstanceId, activityIdIn, activityInstanceIdIn, tenantIdIn, withoutTenantId, evaluatedBefore, evaluatedAfter, userId, rootDecisionInstanceId, rootDecisionInstancesOnly, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey);

        // TODO: test validations
    }
    
    /**
     * Set Removal Time Async (POST)
     *
     * Sets the removal time to multiple historic decision instances asynchronously (batch).  At least &#x60;historicDecisionInstanceIds&#x60; or &#x60;historicDecisionInstanceQuery&#x60; has to be provided. If both are provided, all instances matching query criterion and instances from the list will be updated with a removal time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRemovalTimeAsyncHistoricDecisionInstanceTest() throws ApiException {
        SetRemovalTimeToHistoricDecisionInstancesDto setRemovalTimeToHistoricDecisionInstancesDto = null;
        BatchDto response = api.setRemovalTimeAsyncHistoricDecisionInstance(setRemovalTimeToHistoricDecisionInstancesDto);

        // TODO: test validations
    }
    
}
