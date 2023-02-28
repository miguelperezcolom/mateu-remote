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


import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.IdentityLinkDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskIdentityLinkApi {
    private ApiClient localVarApiClient;

    public TaskIdentityLinkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskIdentityLinkApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addIdentityLink
     * @param id The id of the task to add a link to. (required)
     * @param identityLinkDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addIdentityLinkCall(String id, IdentityLinkDto identityLinkDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = identityLinkDto;

        // create path and map variables
        String localVarPath = "/task/{id}/identity-links"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call addIdentityLinkValidateBeforeCall(String id, IdentityLinkDto identityLinkDto, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addIdentityLink(Async)");
        }
        

        okhttp3.Call localVarCall = addIdentityLinkCall(id, identityLinkDto, _callback);
        return localVarCall;

    }

    /**
     * Add
     * Adds an identity link to a task by id. Can be used to link any user or group to a task and specify a relation.
     * @param id The id of the task to add a link to. (required)
     * @param identityLinkDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public void addIdentityLink(String id, IdentityLinkDto identityLinkDto) throws ApiException {
        addIdentityLinkWithHttpInfo(id, identityLinkDto);
    }

    /**
     * Add
     * Adds an identity link to a task by id. Can be used to link any user or group to a task and specify a relation.
     * @param id The id of the task to add a link to. (required)
     * @param identityLinkDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addIdentityLinkWithHttpInfo(String id, IdentityLinkDto identityLinkDto) throws ApiException {
        okhttp3.Call localVarCall = addIdentityLinkValidateBeforeCall(id, identityLinkDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add (asynchronously)
     * Adds an identity link to a task by id. Can be used to link any user or group to a task and specify a relation.
     * @param id The id of the task to add a link to. (required)
     * @param identityLinkDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addIdentityLinkAsync(String id, IdentityLinkDto identityLinkDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addIdentityLinkValidateBeforeCall(id, identityLinkDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteIdentityLink
     * @param id The id of the task to remove a link from. (required)
     * @param identityLinkDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIdentityLinkCall(String id, IdentityLinkDto identityLinkDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = identityLinkDto;

        // create path and map variables
        String localVarPath = "/task/{id}/identity-links/delete"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call deleteIdentityLinkValidateBeforeCall(String id, IdentityLinkDto identityLinkDto, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteIdentityLink(Async)");
        }
        

        okhttp3.Call localVarCall = deleteIdentityLinkCall(id, identityLinkDto, _callback);
        return localVarCall;

    }

    /**
     * Delete
     * Removes an identity link from a task by id
     * @param id The id of the task to remove a link from. (required)
     * @param identityLinkDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteIdentityLink(String id, IdentityLinkDto identityLinkDto) throws ApiException {
        deleteIdentityLinkWithHttpInfo(id, identityLinkDto);
    }

    /**
     * Delete
     * Removes an identity link from a task by id
     * @param id The id of the task to remove a link from. (required)
     * @param identityLinkDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteIdentityLinkWithHttpInfo(String id, IdentityLinkDto identityLinkDto) throws ApiException {
        okhttp3.Call localVarCall = deleteIdentityLinkValidateBeforeCall(id, identityLinkDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete (asynchronously)
     * Removes an identity link from a task by id
     * @param id The id of the task to remove a link from. (required)
     * @param identityLinkDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIdentityLinkAsync(String id, IdentityLinkDto identityLinkDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteIdentityLinkValidateBeforeCall(id, identityLinkDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIdentityLinks
     * @param id The id of the task to retrieve the identity links for. (required)
     * @param type Filter by the type of links to include. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIdentityLinksCall(String id, String type, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/identity-links"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
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
    private okhttp3.Call getIdentityLinksValidateBeforeCall(String id, String type, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getIdentityLinks(Async)");
        }
        

        okhttp3.Call localVarCall = getIdentityLinksCall(id, type, _callback);
        return localVarCall;

    }

    /**
     * Get List
     * Gets the identity links for a task by id, which are the users and groups that are in *some* relation to it (including assignee and owner).
     * @param id The id of the task to retrieve the identity links for. (required)
     * @param type Filter by the type of links to include. (optional)
     * @return List&lt;IdentityLinkDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public List<IdentityLinkDto> getIdentityLinks(String id, String type) throws ApiException {
        ApiResponse<List<IdentityLinkDto>> localVarResp = getIdentityLinksWithHttpInfo(id, type);
        return localVarResp.getData();
    }

    /**
     * Get List
     * Gets the identity links for a task by id, which are the users and groups that are in *some* relation to it (including assignee and owner).
     * @param id The id of the task to retrieve the identity links for. (required)
     * @param type Filter by the type of links to include. (optional)
     * @return ApiResponse&lt;List&lt;IdentityLinkDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<IdentityLinkDto>> getIdentityLinksWithHttpInfo(String id, String type) throws ApiException {
        okhttp3.Call localVarCall = getIdentityLinksValidateBeforeCall(id, type, null);
        Type localVarReturnType = new TypeToken<List<IdentityLinkDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get List (asynchronously)
     * Gets the identity links for a task by id, which are the users and groups that are in *some* relation to it (including assignee and owner).
     * @param id The id of the task to retrieve the identity links for. (required)
     * @param type Filter by the type of links to include. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Task with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIdentityLinksAsync(String id, String type, final ApiCallback<List<IdentityLinkDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIdentityLinksValidateBeforeCall(id, type, _callback);
        Type localVarReturnType = new TypeToken<List<IdentityLinkDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
