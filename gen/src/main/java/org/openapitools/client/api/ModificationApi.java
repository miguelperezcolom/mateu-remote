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


import org.openapitools.client.model.BatchDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.ModificationDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModificationApi {
    private ApiClient localVarApiClient;

    public ModificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModificationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for executeModification
     * @param modificationDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. This method returns no content. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeModificationCall(ModificationDto modificationDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = modificationDto;

        // create path and map variables
        String localVarPath = "/modification/execute";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeModificationValidateBeforeCall(ModificationDto modificationDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = executeModificationCall(modificationDto, _callback);
        return localVarCall;

    }

    /**
     * Execute Modification
     * Executes a modification synchronously for multiple process instances. To modify a single process instance, use the [Modify Process Instance Execution State](https://docs.camunda.org/manual/7.18/reference/rest/process-instance/post-modification/) method. To execute a modification asynchronously, use the [Execute Modification Async (Batch)](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-async/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. This method returns no content. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public void executeModification(ModificationDto modificationDto) throws ApiException {
        executeModificationWithHttpInfo(modificationDto);
    }

    /**
     * Execute Modification
     * Executes a modification synchronously for multiple process instances. To modify a single process instance, use the [Modify Process Instance Execution State](https://docs.camunda.org/manual/7.18/reference/rest/process-instance/post-modification/) method. To execute a modification asynchronously, use the [Execute Modification Async (Batch)](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-async/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. This method returns no content. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> executeModificationWithHttpInfo(ModificationDto modificationDto) throws ApiException {
        okhttp3.Call localVarCall = executeModificationValidateBeforeCall(modificationDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Execute Modification (asynchronously)
     * Executes a modification synchronously for multiple process instances. To modify a single process instance, use the [Modify Process Instance Execution State](https://docs.camunda.org/manual/7.18/reference/rest/process-instance/post-modification/) method. To execute a modification asynchronously, use the [Execute Modification Async (Batch)](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-async/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. This method returns no content. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeModificationAsync(ModificationDto modificationDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeModificationValidateBeforeCall(modificationDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for executeModificationAsync
     * @param modificationDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeModificationAsyncCall(ModificationDto modificationDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = modificationDto;

        // create path and map variables
        String localVarPath = "/modification/executeAsync";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeModificationAsyncValidateBeforeCall(ModificationDto modificationDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = executeModificationAsyncCall(modificationDto, _callback);
        return localVarCall;

    }

    /**
     * Execute Modification Async (Batch)
     * Executes a modification asynchronously for multiple process instances. To execute a modification synchronously, use the [Execute Modification](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-sync/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @return BatchDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public BatchDto executeModificationAsync(ModificationDto modificationDto) throws ApiException {
        ApiResponse<BatchDto> localVarResp = executeModificationAsyncWithHttpInfo(modificationDto);
        return localVarResp.getData();
    }

    /**
     * Execute Modification Async (Batch)
     * Executes a modification asynchronously for multiple process instances. To execute a modification synchronously, use the [Execute Modification](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-sync/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @return ApiResponse&lt;BatchDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchDto> executeModificationAsyncWithHttpInfo(ModificationDto modificationDto) throws ApiException {
        okhttp3.Call localVarCall = executeModificationAsyncValidateBeforeCall(modificationDto, null);
        Type localVarReturnType = new TypeToken<BatchDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Execute Modification Async (Batch) (asynchronously)
     * Executes a modification asynchronously for multiple process instances. To execute a modification synchronously, use the [Execute Modification](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-sync/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).
     * @param modificationDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeModificationAsyncAsync(ModificationDto modificationDto, final ApiCallback<BatchDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeModificationAsyncValidateBeforeCall(modificationDto, _callback);
        Type localVarReturnType = new TypeToken<BatchDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}