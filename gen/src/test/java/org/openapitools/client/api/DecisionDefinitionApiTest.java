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
import org.openapitools.client.model.DecisionDefinitionDiagramDto;
import org.openapitools.client.model.DecisionDefinitionDto;
import org.openapitools.client.model.EvaluateDecisionDto;
import org.openapitools.client.model.ExceptionDto;
import java.io.File;
import org.openapitools.client.model.HistoryTimeToLiveDto;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.VariableValueDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DecisionDefinitionApi
 */
@Ignore
public class DecisionDefinitionApiTest {

    private final DecisionDefinitionApi api = new DecisionDefinitionApi();

    
    /**
     * Evaluate By Id
     *
     * Evaluates a given decision and returns the result. The input values of the decision have to be supplied in the request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateDecisionByIdTest() throws ApiException {
        String id = null;
        EvaluateDecisionDto evaluateDecisionDto = null;
        List<Map<String, VariableValueDto>> response = api.evaluateDecisionById(id, evaluateDecisionDto);

        // TODO: test validations
    }
    
    /**
     * Evaluate By Key
     *
     * Evaluates the latest version of the decision definition which belongs to no tenant. The input values of the decision have to be supplied in the request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateDecisionByKeyTest() throws ApiException {
        String key = null;
        EvaluateDecisionDto evaluateDecisionDto = null;
        List<Map<String, VariableValueDto>> response = api.evaluateDecisionByKey(key, evaluateDecisionDto);

        // TODO: test validations
    }
    
    /**
     * Evaluate By Key And Tenant
     *
     * Evaluates the latest version of the decision definition for tenant. The input values of the decision have to be supplied in the request body.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void evaluateDecisionByKeyAndTenantTest() throws ApiException {
        String key = null;
        String tenantId = null;
        EvaluateDecisionDto evaluateDecisionDto = null;
        List<Map<String, VariableValueDto>> response = api.evaluateDecisionByKeyAndTenant(key, tenantId, evaluateDecisionDto);

        // TODO: test validations
    }
    
    /**
     * Get Decision Definition By Id
     *
     * Retrieves a decision definition by id, according to the &#x60;DecisionDefinition&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionByIdTest() throws ApiException {
        String id = null;
        DecisionDefinitionDto response = api.getDecisionDefinitionById(id);

        // TODO: test validations
    }
    
    /**
     * Get Decision Definition By Key
     *
     * Retrieves the latest version of the decision definition which belongs to no tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionByKeyTest() throws ApiException {
        String key = null;
        DecisionDefinitionDto response = api.getDecisionDefinitionByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get Decision Definition By Key And Tenant Id
     *
     * Retrieves the latest version of the decision definition for tenant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionByKeyAndTenantIdTest() throws ApiException {
        String key = null;
        String tenantId = null;
        DecisionDefinitionDto response = api.getDecisionDefinitionByKeyAndTenantId(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get Diagram
     *
     * Retrieves the diagram of a decision definition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDiagramTest() throws ApiException {
        String id = null;
        File response = api.getDecisionDefinitionDiagram(id);

        // TODO: test validations
    }
    
    /**
     * Get Diagram By Key
     *
     * Returns the diagram for the latest version of the decision definition which belongs to no tenant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDiagramByKeyTest() throws ApiException {
        String key = null;
        File response = api.getDecisionDefinitionDiagramByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get Diagram By Key And Tenant
     *
     * Returns the XML of the latest version of the decision definition for tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDiagramByKeyAndTenantTest() throws ApiException {
        String key = null;
        String tenantId = null;
        File response = api.getDecisionDefinitionDiagramByKeyAndTenant(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get XML By Id
     *
     * Retrieves the DMN XML of a decision definition.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDmnXmlByIdTest() throws ApiException {
        String id = null;
        DecisionDefinitionDiagramDto response = api.getDecisionDefinitionDmnXmlById(id);

        // TODO: test validations
    }
    
    /**
     * Get XML By Key
     *
     * Retrieves the XML for the latest version of the decision definition which belongs to no tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDmnXmlByKeyTest() throws ApiException {
        String key = null;
        DecisionDefinitionDiagramDto response = api.getDecisionDefinitionDmnXmlByKey(key);

        // TODO: test validations
    }
    
    /**
     * Get XML By Key and Tenant
     *
     * Retrieves the XML of the latest version of the decision definition for tenant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionDmnXmlByKeyAndTenantTest() throws ApiException {
        String key = null;
        String tenantId = null;
        DecisionDefinitionDiagramDto response = api.getDecisionDefinitionDmnXmlByKeyAndTenant(key, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get List
     *
     * Queries for decision definitions that fulfill given parameters. Parameters may be the properties of decision definitions, such as the name, key or version. The size of the result set can be retrieved by using the [Get Decision Definition Count](https://docs.camunda.org/manual/7.18/reference/rest/decision-definition/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionsTest() throws ApiException {
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        String decisionDefinitionId = null;
        String decisionDefinitionIdIn = null;
        String name = null;
        String nameLike = null;
        String deploymentId = null;
        OffsetDateTime deployedAfter = null;
        OffsetDateTime deployedAt = null;
        String key = null;
        String keyLike = null;
        String category = null;
        String categoryLike = null;
        Integer version = null;
        Boolean latestVersion = null;
        String resourceName = null;
        String resourceNameLike = null;
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionKey = null;
        Boolean withoutDecisionRequirementsDefinition = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDecisionDefinitionsWithoutTenantId = null;
        String versionTag = null;
        String versionTagLike = null;
        List<DecisionDefinitionDto> response = api.getDecisionDefinitions(sortBy, sortOrder, firstResult, maxResults, decisionDefinitionId, decisionDefinitionIdIn, name, nameLike, deploymentId, deployedAfter, deployedAt, key, keyLike, category, categoryLike, version, latestVersion, resourceName, resourceNameLike, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey, withoutDecisionRequirementsDefinition, tenantIdIn, withoutTenantId, includeDecisionDefinitionsWithoutTenantId, versionTag, versionTagLike);

        // TODO: test validations
    }
    
    /**
     * Get List Count
     *
     * Requests the number of decision definitions that fulfill the query criteria. Takes the same filtering parameters as the [Get Decision Definition](https://docs.camunda.org/manual/7.18/reference/rest/decision-definition/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDecisionDefinitionsCountTest() throws ApiException {
        String decisionDefinitionId = null;
        String decisionDefinitionIdIn = null;
        String name = null;
        String nameLike = null;
        String deploymentId = null;
        OffsetDateTime deployedAfter = null;
        OffsetDateTime deployedAt = null;
        String key = null;
        String keyLike = null;
        String category = null;
        String categoryLike = null;
        Integer version = null;
        Boolean latestVersion = null;
        String resourceName = null;
        String resourceNameLike = null;
        String decisionRequirementsDefinitionId = null;
        String decisionRequirementsDefinitionKey = null;
        Boolean withoutDecisionRequirementsDefinition = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDecisionDefinitionsWithoutTenantId = null;
        String versionTag = null;
        String versionTagLike = null;
        CountResultDto response = api.getDecisionDefinitionsCount(decisionDefinitionId, decisionDefinitionIdIn, name, nameLike, deploymentId, deployedAfter, deployedAt, key, keyLike, category, categoryLike, version, latestVersion, resourceName, resourceNameLike, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey, withoutDecisionRequirementsDefinition, tenantIdIn, withoutTenantId, includeDecisionDefinitionsWithoutTenantId, versionTag, versionTagLike);

        // TODO: test validations
    }
    
    /**
     * Update History Time to Live
     *
     * Updates history time to live for decision definition. The field is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHistoryTimeToLiveByDecisionDefinitionIdTest() throws ApiException {
        String id = null;
        HistoryTimeToLiveDto historyTimeToLiveDto = null;
        api.updateHistoryTimeToLiveByDecisionDefinitionId(id, historyTimeToLiveDto);

        // TODO: test validations
    }
    
    /**
     * Update History Time to Live By Key
     *
     * Updates the latest version of the decision definition which belongs to no tenant. The field is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHistoryTimeToLiveByDecisionDefinitionKeyTest() throws ApiException {
        String key = null;
        HistoryTimeToLiveDto historyTimeToLiveDto = null;
        api.updateHistoryTimeToLiveByDecisionDefinitionKey(key, historyTimeToLiveDto);

        // TODO: test validations
    }
    
    /**
     * Update History Time to Live By Key And Tenant
     *
     * Updates the latest version of the decision definition for tenant. The field is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHistoryTimeToLiveByDecisionDefinitionKeyAndTenantTest() throws ApiException {
        String key = null;
        String tenantId = null;
        HistoryTimeToLiveDto historyTimeToLiveDto = null;
        api.updateHistoryTimeToLiveByDecisionDefinitionKeyAndTenant(key, tenantId, historyTimeToLiveDto);

        // TODO: test validations
    }
    
}
