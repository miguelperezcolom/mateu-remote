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


import org.openapitools.client.model.AuthorizationExceptionDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.SignalDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalApi {
    private ApiClient localVarApiClient;

    public SignalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SignalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for throwSignal
     * @param signalDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:  * no name was given * the variable value or type is invalid, for example if the value could not be parsed to an integer value or the passed variable type is not supported * a tenant id and an execution id is specified.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not allowed to throw a signal event.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned if a single execution is specified and no such execution exists or has not subscribed to the signal.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call throwSignalCall(SignalDto signalDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = signalDto;

        // create path and map variables
        String localVarPath = "/signal";

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
    private okhttp3.Call throwSignalValidateBeforeCall(SignalDto signalDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = throwSignalCall(signalDto, _callback);
        return localVarCall;

    }

    /**
     * Event
     * A signal is an event of global scope (broadcast semantics) and is delivered to all active handlers. Internally this maps to the engine&#39;s signal event received builder method &#x60;RuntimeService#createSignalEvent()&#x60;. For more information about the signal behavior, see the [Signal Events](https://docs.camunda.org/manual/7.18/reference/bpmn20/events/signal-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).
     * @param signalDto  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:  * no name was given * the variable value or type is invalid, for example if the value could not be parsed to an integer value or the passed variable type is not supported * a tenant id and an execution id is specified.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not allowed to throw a signal event.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned if a single execution is specified and no such execution exists or has not subscribed to the signal.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public void throwSignal(SignalDto signalDto) throws ApiException {
        throwSignalWithHttpInfo(signalDto);
    }

    /**
     * Event
     * A signal is an event of global scope (broadcast semantics) and is delivered to all active handlers. Internally this maps to the engine&#39;s signal event received builder method &#x60;RuntimeService#createSignalEvent()&#x60;. For more information about the signal behavior, see the [Signal Events](https://docs.camunda.org/manual/7.18/reference/bpmn20/events/signal-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).
     * @param signalDto  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:  * no name was given * the variable value or type is invalid, for example if the value could not be parsed to an integer value or the passed variable type is not supported * a tenant id and an execution id is specified.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not allowed to throw a signal event.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned if a single execution is specified and no such execution exists or has not subscribed to the signal.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> throwSignalWithHttpInfo(SignalDto signalDto) throws ApiException {
        okhttp3.Call localVarCall = throwSignalValidateBeforeCall(signalDto, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Event (asynchronously)
     * A signal is an event of global scope (broadcast semantics) and is delivered to all active handlers. Internally this maps to the engine&#39;s signal event received builder method &#x60;RuntimeService#createSignalEvent()&#x60;. For more information about the signal behavior, see the [Signal Events](https://docs.camunda.org/manual/7.18/reference/bpmn20/events/signal-events/) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).
     * @param signalDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:  * no name was given * the variable value or type is invalid, for example if the value could not be parsed to an integer value or the passed variable type is not supported * a tenant id and an execution id is specified.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not allowed to throw a signal event.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Returned if a single execution is specified and no such execution exists or has not subscribed to the signal.  See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call throwSignalAsync(SignalDto signalDto, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = throwSignalValidateBeforeCall(signalDto, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}