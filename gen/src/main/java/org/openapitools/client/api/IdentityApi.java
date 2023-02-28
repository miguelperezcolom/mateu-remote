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


import org.openapitools.client.model.AuthenticationResult;
import org.openapitools.client.model.BasicUserCredentialsDto;
import org.openapitools.client.model.CheckPasswordPolicyResultDto;
import org.openapitools.client.model.ExceptionDto;
import org.openapitools.client.model.IdentityServiceGroupInfoDto;
import org.openapitools.client.model.PasswordPolicyDto;
import org.openapitools.client.model.PasswordPolicyRequestDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdentityApi {
    private ApiClient localVarApiClient;

    public IdentityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IdentityApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for checkPassword
     * @param passwordPolicyRequestDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. The checked password is myPassword which is not complex enough to match all of the policy rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found to check the password against. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkPasswordCall(PasswordPolicyRequestDto passwordPolicyRequestDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = passwordPolicyRequestDto;

        // create path and map variables
        String localVarPath = "/identity/password-policy";

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
    private okhttp3.Call checkPasswordValidateBeforeCall(PasswordPolicyRequestDto passwordPolicyRequestDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = checkPasswordCall(passwordPolicyRequestDto, _callback);
        return localVarCall;

    }

    /**
     * Validate Password
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. A password can be checked for compliancy via this end point. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @param passwordPolicyRequestDto  (optional)
     * @return CheckPasswordPolicyResultDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. The checked password is myPassword which is not complex enough to match all of the policy rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found to check the password against. </td><td>  -  </td></tr>
     </table>
     */
    public CheckPasswordPolicyResultDto checkPassword(PasswordPolicyRequestDto passwordPolicyRequestDto) throws ApiException {
        ApiResponse<CheckPasswordPolicyResultDto> localVarResp = checkPasswordWithHttpInfo(passwordPolicyRequestDto);
        return localVarResp.getData();
    }

    /**
     * Validate Password
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. A password can be checked for compliancy via this end point. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @param passwordPolicyRequestDto  (optional)
     * @return ApiResponse&lt;CheckPasswordPolicyResultDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. The checked password is myPassword which is not complex enough to match all of the policy rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found to check the password against. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CheckPasswordPolicyResultDto> checkPasswordWithHttpInfo(PasswordPolicyRequestDto passwordPolicyRequestDto) throws ApiException {
        okhttp3.Call localVarCall = checkPasswordValidateBeforeCall(passwordPolicyRequestDto, null);
        Type localVarReturnType = new TypeToken<CheckPasswordPolicyResultDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validate Password (asynchronously)
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. A password can be checked for compliancy via this end point. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @param passwordPolicyRequestDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. The checked password is myPassword which is not complex enough to match all of the policy rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found to check the password against. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call checkPasswordAsync(PasswordPolicyRequestDto passwordPolicyRequestDto, final ApiCallback<CheckPasswordPolicyResultDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkPasswordValidateBeforeCall(passwordPolicyRequestDto, _callback);
        Type localVarReturnType = new TypeToken<CheckPasswordPolicyResultDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupInfo
     * @param userId The id of the user to get the groups for. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If the &#x60;userId&#x60; query parameter is missing. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupInfoCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/identity/groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
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
    private okhttp3.Call getGroupInfoValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getGroupInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupInfoCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Get a User&#39;s Groups
     * Gets the groups of a user by id and includes all users that share a group with the given user.
     * @param userId The id of the user to get the groups for. (required)
     * @return IdentityServiceGroupInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If the &#x60;userId&#x60; query parameter is missing. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public IdentityServiceGroupInfoDto getGroupInfo(String userId) throws ApiException {
        ApiResponse<IdentityServiceGroupInfoDto> localVarResp = getGroupInfoWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Get a User&#39;s Groups
     * Gets the groups of a user by id and includes all users that share a group with the given user.
     * @param userId The id of the user to get the groups for. (required)
     * @return ApiResponse&lt;IdentityServiceGroupInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If the &#x60;userId&#x60; query parameter is missing. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdentityServiceGroupInfoDto> getGroupInfoWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = getGroupInfoValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<IdentityServiceGroupInfoDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a User&#39;s Groups (asynchronously)
     * Gets the groups of a user by id and includes all users that share a group with the given user.
     * @param userId The id of the user to get the groups for. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If the &#x60;userId&#x60; query parameter is missing. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupInfoAsync(String userId, final ApiCallback<IdentityServiceGroupInfoDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGroupInfoValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<IdentityServiceGroupInfoDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPasswordPolicy
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPasswordPolicyCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/identity/password-policy";

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
    private okhttp3.Call getPasswordPolicyValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPasswordPolicyCall(_callback);
        return localVarCall;

    }

    /**
     * Get Password Policy
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. This end point returns a JSON representation of the list of policy rules. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @return PasswordPolicyDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found. </td><td>  -  </td></tr>
     </table>
     */
    public PasswordPolicyDto getPasswordPolicy() throws ApiException {
        ApiResponse<PasswordPolicyDto> localVarResp = getPasswordPolicyWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Password Policy
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. This end point returns a JSON representation of the list of policy rules. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @return ApiResponse&lt;PasswordPolicyDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PasswordPolicyDto> getPasswordPolicyWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPasswordPolicyValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PasswordPolicyDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Password Policy (asynchronously)
     * A password policy consists of a list of rules that new passwords must follow to be policy compliant. This end point returns a JSON representation of the list of policy rules. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.18/user-guide/security/).
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No password policy was found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPasswordPolicyAsync(final ApiCallback<PasswordPolicyDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPasswordPolicyValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PasswordPolicyDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for verifyUser
     * @param basicUserCredentialsDto  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If body does not contain username or password. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyUserCall(BasicUserCredentialsDto basicUserCredentialsDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = basicUserCredentialsDto;

        // create path and map variables
        String localVarPath = "/identity/verify";

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
    private okhttp3.Call verifyUserValidateBeforeCall(BasicUserCredentialsDto basicUserCredentialsDto, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = verifyUserCall(basicUserCredentialsDto, _callback);
        return localVarCall;

    }

    /**
     * Verify User
     * Verifies that user credentials are valid.
     * @param basicUserCredentialsDto  (optional)
     * @return AuthenticationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If body does not contain username or password. </td><td>  -  </td></tr>
     </table>
     */
    public AuthenticationResult verifyUser(BasicUserCredentialsDto basicUserCredentialsDto) throws ApiException {
        ApiResponse<AuthenticationResult> localVarResp = verifyUserWithHttpInfo(basicUserCredentialsDto);
        return localVarResp.getData();
    }

    /**
     * Verify User
     * Verifies that user credentials are valid.
     * @param basicUserCredentialsDto  (optional)
     * @return ApiResponse&lt;AuthenticationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If body does not contain username or password. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AuthenticationResult> verifyUserWithHttpInfo(BasicUserCredentialsDto basicUserCredentialsDto) throws ApiException {
        okhttp3.Call localVarCall = verifyUserValidateBeforeCall(basicUserCredentialsDto, null);
        Type localVarReturnType = new TypeToken<AuthenticationResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Verify User (asynchronously)
     * Verifies that user credentials are valid.
     * @param basicUserCredentialsDto  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> If body does not contain username or password. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifyUserAsync(BasicUserCredentialsDto basicUserCredentialsDto, final ApiCallback<AuthenticationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifyUserValidateBeforeCall(basicUserCredentialsDto, _callback);
        Type localVarReturnType = new TypeToken<AuthenticationResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}