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


import org.openapitools.client.model.AttachmentDto;
import org.openapitools.client.model.AuthorizationExceptionDto;
import org.openapitools.client.model.ExceptionDto;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskAttachmentApi {
    private ApiClient localVarApiClient;

    public TaskAttachmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskAttachmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addAttachment
     * @param id The id of the task to add the attachment to. (required)
     * @param attachmentName The name of the attachment. (optional)
     * @param attachmentDescription The description of the attachment. (optional)
     * @param attachmentType The type of the attachment. (optional)
     * @param url The url to the remote content of the attachment. (optional)
     * @param content The content of the attachment. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The task does not exists or task id is null. No content or url to remote content exists. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttachmentCall(String id, String attachmentName, String attachmentDescription, String attachmentType, String url, File content, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/attachment/create"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (attachmentName != null) {
            localVarFormParams.put("attachment-name", attachmentName);
        }

        if (attachmentDescription != null) {
            localVarFormParams.put("attachment-description", attachmentDescription);
        }

        if (attachmentType != null) {
            localVarFormParams.put("attachment-type", attachmentType);
        }

        if (url != null) {
            localVarFormParams.put("url", url);
        }

        if (content != null) {
            localVarFormParams.put("content", content);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addAttachmentValidateBeforeCall(String id, String attachmentName, String attachmentDescription, String attachmentType, String url, File content, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addAttachment(Async)");
        }
        

        okhttp3.Call localVarCall = addAttachmentCall(id, attachmentName, attachmentDescription, attachmentType, url, content, _callback);
        return localVarCall;

    }

    /**
     * Create
     * Creates an attachment for a task.
     * @param id The id of the task to add the attachment to. (required)
     * @param attachmentName The name of the attachment. (optional)
     * @param attachmentDescription The description of the attachment. (optional)
     * @param attachmentType The type of the attachment. (optional)
     * @param url The url to the remote content of the attachment. (optional)
     * @param content The content of the attachment. (optional)
     * @return AttachmentDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The task does not exists or task id is null. No content or url to remote content exists. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public AttachmentDto addAttachment(String id, String attachmentName, String attachmentDescription, String attachmentType, String url, File content) throws ApiException {
        ApiResponse<AttachmentDto> localVarResp = addAttachmentWithHttpInfo(id, attachmentName, attachmentDescription, attachmentType, url, content);
        return localVarResp.getData();
    }

    /**
     * Create
     * Creates an attachment for a task.
     * @param id The id of the task to add the attachment to. (required)
     * @param attachmentName The name of the attachment. (optional)
     * @param attachmentDescription The description of the attachment. (optional)
     * @param attachmentType The type of the attachment. (optional)
     * @param url The url to the remote content of the attachment. (optional)
     * @param content The content of the attachment. (optional)
     * @return ApiResponse&lt;AttachmentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The task does not exists or task id is null. No content or url to remote content exists. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttachmentDto> addAttachmentWithHttpInfo(String id, String attachmentName, String attachmentDescription, String attachmentType, String url, File content) throws ApiException {
        okhttp3.Call localVarCall = addAttachmentValidateBeforeCall(id, attachmentName, attachmentDescription, attachmentType, url, content, null);
        Type localVarReturnType = new TypeToken<AttachmentDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create (asynchronously)
     * Creates an attachment for a task.
     * @param id The id of the task to add the attachment to. (required)
     * @param attachmentName The name of the attachment. (optional)
     * @param attachmentDescription The description of the attachment. (optional)
     * @param attachmentType The type of the attachment. (optional)
     * @param url The url to the remote content of the attachment. (optional)
     * @param content The content of the attachment. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The task does not exists or task id is null. No content or url to remote content exists. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAttachmentAsync(String id, String attachmentName, String attachmentDescription, String attachmentType, String url, File content, final ApiCallback<AttachmentDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = addAttachmentValidateBeforeCall(id, attachmentName, attachmentDescription, attachmentType, url, content, _callback);
        Type localVarReturnType = new TypeToken<AttachmentDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAttachment
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be removed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A Task Attachment for the given task id and attachment id does not exist. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttachmentCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/attachment/{attachmentId}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "attachmentId" + "\\}", localVarApiClient.escapeString(attachmentId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAttachmentValidateBeforeCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteAttachment(Async)");
        }
        
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new ApiException("Missing the required parameter 'attachmentId' when calling deleteAttachment(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAttachmentCall(id, attachmentId, _callback);
        return localVarCall;

    }

    /**
     * Delete
     * Removes an attachment from a task by id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be removed. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A Task Attachment for the given task id and attachment id does not exist. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteAttachment(String id, String attachmentId) throws ApiException {
        deleteAttachmentWithHttpInfo(id, attachmentId);
    }

    /**
     * Delete
     * Removes an attachment from a task by id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be removed. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A Task Attachment for the given task id and attachment id does not exist. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteAttachmentWithHttpInfo(String id, String attachmentId) throws ApiException {
        okhttp3.Call localVarCall = deleteAttachmentValidateBeforeCall(id, attachmentId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete (asynchronously)
     * Removes an attachment from a task by id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be removed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The history of the engine is disabled. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A Task Attachment for the given task id and attachment id does not exist. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAttachmentAsync(String id, String attachmentId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAttachmentValidateBeforeCall(id, attachmentId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttachment
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment for the given task and attachment id does not exist or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/attachment/{attachmentId}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "attachmentId" + "\\}", localVarApiClient.escapeString(attachmentId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttachmentValidateBeforeCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAttachment(Async)");
        }
        
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new ApiException("Missing the required parameter 'attachmentId' when calling getAttachment(Async)");
        }
        

        okhttp3.Call localVarCall = getAttachmentCall(id, attachmentId, _callback);
        return localVarCall;

    }

    /**
     * Get
     * Retrieves a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @return AttachmentDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment for the given task and attachment id does not exist or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public AttachmentDto getAttachment(String id, String attachmentId) throws ApiException {
        ApiResponse<AttachmentDto> localVarResp = getAttachmentWithHttpInfo(id, attachmentId);
        return localVarResp.getData();
    }

    /**
     * Get
     * Retrieves a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @return ApiResponse&lt;AttachmentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment for the given task and attachment id does not exist or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttachmentDto> getAttachmentWithHttpInfo(String id, String attachmentId) throws ApiException {
        okhttp3.Call localVarCall = getAttachmentValidateBeforeCall(id, attachmentId, null);
        Type localVarReturnType = new TypeToken<AttachmentDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get (asynchronously)
     * Retrieves a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment for the given task and attachment id does not exist or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentAsync(String id, String attachmentId, final ApiCallback<AttachmentDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttachmentValidateBeforeCall(id, attachmentId, _callback);
        Type localVarReturnType = new TypeToken<AttachmentDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttachmentData
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment content for the given task id and attachment id does not exist, or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentDataCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/attachment/{attachmentId}/data"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "attachmentId" + "\\}", localVarApiClient.escapeString(attachmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream", "text/plain", "application/json"
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
    private okhttp3.Call getAttachmentDataValidateBeforeCall(String id, String attachmentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAttachmentData(Async)");
        }
        
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new ApiException("Missing the required parameter 'attachmentId' when calling getAttachmentData(Async)");
        }
        

        okhttp3.Call localVarCall = getAttachmentDataCall(id, attachmentId, _callback);
        return localVarCall;

    }

    /**
     * Get (Binary)
     * Retrieves the binary content of a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment content for the given task id and attachment id does not exist, or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public File getAttachmentData(String id, String attachmentId) throws ApiException {
        ApiResponse<File> localVarResp = getAttachmentDataWithHttpInfo(id, attachmentId);
        return localVarResp.getData();
    }

    /**
     * Get (Binary)
     * Retrieves the binary content of a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment content for the given task id and attachment id does not exist, or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> getAttachmentDataWithHttpInfo(String id, String attachmentId) throws ApiException {
        okhttp3.Call localVarCall = getAttachmentDataValidateBeforeCall(id, attachmentId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get (Binary) (asynchronously)
     * Retrieves the binary content of a task attachment by task id and attachment id.
     * @param id The id of the task. (required)
     * @param attachmentId The id of the attachment to be retrieved. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The attachment content for the given task id and attachment id does not exist, or the history of the engine is disabled.  See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentDataAsync(String id, String attachmentId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttachmentDataValidateBeforeCall(id, attachmentId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAttachments
     * @param id The id of the task to retrieve the attachments for. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No task exists for the given task id. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentsCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/task/{id}/attachment"
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttachmentsValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAttachments(Async)");
        }
        

        okhttp3.Call localVarCall = getAttachmentsCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get List
     * Gets the attachments for a task.
     * @param id The id of the task to retrieve the attachments for. (required)
     * @return List&lt;AttachmentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No task exists for the given task id. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public List<AttachmentDto> getAttachments(String id) throws ApiException {
        ApiResponse<List<AttachmentDto>> localVarResp = getAttachmentsWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get List
     * Gets the attachments for a task.
     * @param id The id of the task to retrieve the attachments for. (required)
     * @return ApiResponse&lt;List&lt;AttachmentDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No task exists for the given task id. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AttachmentDto>> getAttachmentsWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getAttachmentsValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<List<AttachmentDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get List (asynchronously)
     * Gets the attachments for a task.
     * @param id The id of the task to retrieve the attachments for. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No task exists for the given task id. See the [Introduction](/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttachmentsAsync(String id, final ApiCallback<List<AttachmentDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttachmentsValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<List<AttachmentDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
