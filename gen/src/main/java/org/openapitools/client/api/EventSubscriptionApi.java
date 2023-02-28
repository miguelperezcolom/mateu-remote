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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CountResultDto;
import org.openapitools.client.model.EventSubscriptionDto;
import org.openapitools.client.model.ExceptionDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventSubscriptionApi {
    private ApiClient localVarApiClient;

    public EventSubscriptionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventSubscriptionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getEventSubscriptions
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventSubscriptionsCall(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, String sortBy, String sortOrder, Integer firstResult, Integer maxResults, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/event-subscription";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (eventSubscriptionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventSubscriptionId", eventSubscriptionId));
        }

        if (eventName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventName", eventName));
        }

        if (eventType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventType", eventType));
        }

        if (executionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("executionId", executionId));
        }

        if (processInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("processInstanceId", processInstanceId));
        }

        if (activityId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("activityId", activityId));
        }

        if (tenantIdIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantIdIn", tenantIdIn));
        }

        if (withoutTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("withoutTenantId", withoutTenantId));
        }

        if (includeEventSubscriptionsWithoutTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeEventSubscriptionsWithoutTenantId", includeEventSubscriptionsWithoutTenantId));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        if (firstResult != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstResult", firstResult));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEventSubscriptionsValidateBeforeCall(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, String sortBy, String sortOrder, Integer firstResult, Integer maxResults, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getEventSubscriptionsCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sortBy, sortOrder, firstResult, maxResults, _callback);
        return localVarCall;

    }

    /**
     * Get List
     * Queries for event subscriptions that fulfill given parameters. The size of the result set can be retrieved by using the [Get Event Subscriptions count](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query-count/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return List&lt;EventSubscriptionDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public List<EventSubscriptionDto> getEventSubscriptions(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, String sortBy, String sortOrder, Integer firstResult, Integer maxResults) throws ApiException {
        ApiResponse<List<EventSubscriptionDto>> localVarResp = getEventSubscriptionsWithHttpInfo(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sortBy, sortOrder, firstResult, maxResults);
        return localVarResp.getData();
    }

    /**
     * Get List
     * Queries for event subscriptions that fulfill given parameters. The size of the result set can be retrieved by using the [Get Event Subscriptions count](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query-count/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @return ApiResponse&lt;List&lt;EventSubscriptionDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<EventSubscriptionDto>> getEventSubscriptionsWithHttpInfo(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, String sortBy, String sortOrder, Integer firstResult, Integer maxResults) throws ApiException {
        okhttp3.Call localVarCall = getEventSubscriptionsValidateBeforeCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sortBy, sortOrder, firstResult, maxResults, null);
        Type localVarReturnType = new TypeToken<List<EventSubscriptionDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get List (asynchronously)
     * Queries for event subscriptions that fulfill given parameters. The size of the result set can be retrieved by using the [Get Event Subscriptions count](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query-count/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventSubscriptionsAsync(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, String sortBy, String sortOrder, Integer firstResult, Integer maxResults, final ApiCallback<List<EventSubscriptionDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventSubscriptionsValidateBeforeCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sortBy, sortOrder, firstResult, maxResults, _callback);
        Type localVarReturnType = new TypeToken<List<EventSubscriptionDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEventSubscriptionsCount
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventSubscriptionsCountCall(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/event-subscription/count";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (eventSubscriptionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventSubscriptionId", eventSubscriptionId));
        }

        if (eventName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventName", eventName));
        }

        if (eventType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("eventType", eventType));
        }

        if (executionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("executionId", executionId));
        }

        if (processInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("processInstanceId", processInstanceId));
        }

        if (activityId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("activityId", activityId));
        }

        if (tenantIdIn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantIdIn", tenantIdIn));
        }

        if (withoutTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("withoutTenantId", withoutTenantId));
        }

        if (includeEventSubscriptionsWithoutTenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeEventSubscriptionsWithoutTenantId", includeEventSubscriptionsWithoutTenantId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEventSubscriptionsCountValidateBeforeCall(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getEventSubscriptionsCountCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, _callback);
        return localVarCall;

    }

    /**
     * Get List Count
     * Queries for the number of event subscriptions that fulfill given parameters. Takes the same parameters as the [Get Event Subscriptions](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @return CountResultDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public CountResultDto getEventSubscriptionsCount(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId) throws ApiException {
        ApiResponse<CountResultDto> localVarResp = getEventSubscriptionsCountWithHttpInfo(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId);
        return localVarResp.getData();
    }

    /**
     * Get List Count
     * Queries for the number of event subscriptions that fulfill given parameters. Takes the same parameters as the [Get Event Subscriptions](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @return ApiResponse&lt;CountResultDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CountResultDto> getEventSubscriptionsCountWithHttpInfo(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId) throws ApiException {
        okhttp3.Call localVarCall = getEventSubscriptionsCountValidateBeforeCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, null);
        Type localVarReturnType = new TypeToken<CountResultDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get List Count (asynchronously)
     * Queries for the number of event subscriptions that fulfill given parameters. Takes the same parameters as the [Get Event Subscriptions](https://docs.camunda.org/manual/7.18/reference/rest/event-subscription/get-query/) method.
     * @param eventSubscriptionId Only select subscription with the given id. (optional)
     * @param eventName Only select subscriptions for events with the given name. (optional)
     * @param eventType Only select subscriptions for events with the given type. Valid values: &#x60;message&#x60;, &#x60;signal&#x60;, &#x60;compensate&#x60; and &#x60;conditional&#x60;. (optional)
     * @param executionId Only select subscriptions that belong to an execution with the given id. (optional)
     * @param processInstanceId Only select subscriptions that belong to a process instance with the given id. (optional)
     * @param activityId Only select subscriptions that belong to an activity with the given id. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids. (optional)
     * @param withoutTenantId Only select subscriptions which have no tenant id. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param includeEventSubscriptionsWithoutTenantId Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventSubscriptionsCountAsync(String eventSubscriptionId, String eventName, String eventType, String executionId, String processInstanceId, String activityId, String tenantIdIn, Boolean withoutTenantId, Boolean includeEventSubscriptionsWithoutTenantId, final ApiCallback<CountResultDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventSubscriptionsCountValidateBeforeCall(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, _callback);
        Type localVarReturnType = new TypeToken<CountResultDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}