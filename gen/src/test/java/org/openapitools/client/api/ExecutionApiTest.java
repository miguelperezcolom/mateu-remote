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
import org.openapitools.client.model.CreateIncidentDto;
import org.openapitools.client.model.EventSubscriptionDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.ExecutionDto;
import org.openapitools.client.model.ExecutionQueryDto;
import org.openapitools.client.model.ExecutionTriggerDto;
import java.io.File;
import org.openapitools.client.model.IncidentDto;
import org.openapitools.client.model.PatchVariablesDto;
import org.openapitools.client.model.VariableValueDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExecutionApi
 */
@Ignore
public class ExecutionApiTest {

    private final ExecutionApi api = new ExecutionApi();

    
    /**
     * Create Incident
     *
     * Creates a custom incident with given properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIncidentTest() throws ApiException {
        String id = null;
        CreateIncidentDto createIncidentDto = null;
        IncidentDto response = api.createIncident(id, createIncidentDto);

        // TODO: test validations
    }
    
    /**
     * Delete Local Execution Variable
     *
     * Deletes a variable in the context of a given execution by id. Deletion does not propagate upwards in the execution hierarchy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocalExecutionVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        api.deleteLocalExecutionVariable(id, varName);

        // TODO: test validations
    }
    
    /**
     * Get Execution
     *
     * Retrieves an execution by id, according to the &#x60;Execution&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionTest() throws ApiException {
        String id = null;
        ExecutionDto response = api.getExecution(id);

        // TODO: test validations
    }
    
    /**
     * Get Executions
     *
     * Queries for the executions that fulfill given parameters. Parameters may be static as well as dynamic runtime properties of executions. The size of the result set can be retrieved by using the [Get Execution Count](https://docs.camunda.org/manual/7.18/reference/rest/execution/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionsTest() throws ApiException {
        String businessKey = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processInstanceId = null;
        String activityId = null;
        String signalEventSubscriptionName = null;
        String messageEventSubscriptionName = null;
        Boolean active = null;
        Boolean suspended = null;
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String tenantIdIn = null;
        String variables = null;
        String processVariables = null;
        Boolean variableNamesIgnoreCase = null;
        Boolean variableValuesIgnoreCase = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<ExecutionDto> response = api.getExecutions(businessKey, processDefinitionId, processDefinitionKey, processInstanceId, activityId, signalEventSubscriptionName, messageEventSubscriptionName, active, suspended, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, variables, processVariables, variableNamesIgnoreCase, variableValuesIgnoreCase, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get Execution Count
     *
     * Queries for the number of executions that fulfill given parameters. Takes the same parameters as the [Get Executions](https://docs.camunda.org/manual/7.18/reference/rest/execution/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExecutionsCountTest() throws ApiException {
        String businessKey = null;
        String processDefinitionId = null;
        String processDefinitionKey = null;
        String processInstanceId = null;
        String activityId = null;
        String signalEventSubscriptionName = null;
        String messageEventSubscriptionName = null;
        Boolean active = null;
        Boolean suspended = null;
        String incidentId = null;
        String incidentType = null;
        String incidentMessage = null;
        String incidentMessageLike = null;
        String tenantIdIn = null;
        String variables = null;
        String processVariables = null;
        Boolean variableNamesIgnoreCase = null;
        Boolean variableValuesIgnoreCase = null;
        CountResultDto response = api.getExecutionsCount(businessKey, processDefinitionId, processDefinitionKey, processInstanceId, activityId, signalEventSubscriptionName, messageEventSubscriptionName, active, suspended, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, variables, processVariables, variableNamesIgnoreCase, variableValuesIgnoreCase);

        // TODO: test validations
    }
    
    /**
     * Get Local Execution Variable
     *
     * Retrieves a variable from the context of a given execution by id. Does not traverse the parent execution hierarchy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocalExecutionVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        Boolean deserializeValue = null;
        VariableValueDto response = api.getLocalExecutionVariable(id, varName, deserializeValue);

        // TODO: test validations
    }
    
    /**
     * Get Local Execution Variable (Binary)
     *
     * Retrieves a binary variable from the context of a given execution by id. Does not traverse the parent execution hierarchy. Applicable for byte array and file variables.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocalExecutionVariableBinaryTest() throws ApiException {
        String id = null;
        String varName = null;
        File response = api.getLocalExecutionVariableBinary(id, varName);

        // TODO: test validations
    }
    
    /**
     * Get Local Execution Variables
     *
     * Retrieves all variables of a given execution by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocalExecutionVariablesTest() throws ApiException {
        String id = null;
        Boolean deserializeValues = null;
        Map<String, VariableValueDto> response = api.getLocalExecutionVariables(id, deserializeValues);

        // TODO: test validations
    }
    
    /**
     * Get Message Event Subscription
     *
     * Retrieves a message event subscription for a given execution by id and a message name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageEventSubscriptionTest() throws ApiException {
        String id = null;
        String messageName = null;
        EventSubscriptionDto response = api.getMessageEventSubscription(id, messageName);

        // TODO: test validations
    }
    
    /**
     * Update/Delete Local Execution Variables
     *
     * Updates or deletes the variables in the context of an execution by id. The updates do not propagate upwards in the execution hierarchy. Updates precede deletions. So, if a variable is updated AND deleted, the deletion overrides the update.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyLocalExecutionVariablesTest() throws ApiException {
        String id = null;
        PatchVariablesDto patchVariablesDto = null;
        api.modifyLocalExecutionVariables(id, patchVariablesDto);

        // TODO: test validations
    }
    
    /**
     * Put Local Execution Variable
     *
     * Sets a variable in the context of a given execution by id. Update does not propagate upwards in the execution hierarchy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLocalExecutionVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        VariableValueDto variableValueDto = null;
        api.putLocalExecutionVariable(id, varName, variableValueDto);

        // TODO: test validations
    }
    
    /**
     * Get Executions (POST)
     *
     * Queries for executions that fulfill given parameters through a JSON object. This method is slightly more powerful than the [Get Executions](https://docs.camunda.org/manual/7.18/reference/rest/execution/get-query/) method because it allows to filter by multiple instance and execution variables of types &#x60;String&#x60;, &#x60;Number&#x60; or &#x60;Boolean&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryExecutionsTest() throws ApiException {
        Integer firstResult = null;
        Integer maxResults = null;
        ExecutionQueryDto executionQueryDto = null;
        List<ExecutionDto> response = api.queryExecutions(firstResult, maxResults, executionQueryDto);

        // TODO: test validations
    }
    
    /**
     * Get Execution Count (POST)
     *
     * Queries for the number of executions that fulfill given parameters. This method takes the same message body as the [Get Executions POST](https://docs.camunda.org/manual/7.18/reference/rest/execution/post-query/) method and therefore it is slightly more powerful than the [Get Execution Count](https://docs.camunda.org/manual/7.18/reference/rest/execution/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryExecutionsCountTest() throws ApiException {
        ExecutionQueryDto executionQueryDto = null;
        CountResultDto response = api.queryExecutionsCount(executionQueryDto);

        // TODO: test validations
    }
    
    /**
     * Post Local Execution Variable (Binary)
     *
     * Sets the serialized value for a binary variable or the binary value for a file variable in the context of a given execution by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setLocalExecutionVariableBinaryTest() throws ApiException {
        String id = null;
        String varName = null;
        File data = null;
        String valueType = null;
        api.setLocalExecutionVariableBinary(id, varName, data, valueType);

        // TODO: test validations
    }
    
    /**
     * Trigger Execution
     *
     * Signals an execution by id. Can for example be used to explicitly skip user tasks or signal asynchronous continuations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void signalExecutionTest() throws ApiException {
        String id = null;
        ExecutionTriggerDto executionTriggerDto = null;
        api.signalExecution(id, executionTriggerDto);

        // TODO: test validations
    }
    
    /**
     * Trigger Message Event Subscription
     *
     * Delivers a message to a specific execution by id, to trigger an existing message event subscription. Inject process variables as the message&#39;s payload.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void triggerEventTest() throws ApiException {
        String id = null;
        String messageName = null;
        ExecutionTriggerDto executionTriggerDto = null;
        api.triggerEvent(id, messageName, executionTriggerDto);

        // TODO: test validations
    }
    
}
