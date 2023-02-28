# ModificationApi

All URIs are relative to *http://localhost:8080/engine-rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeModification**](ModificationApi.md#executeModification) | **POST** /modification/execute | Execute Modification
[**executeModificationAsync**](ModificationApi.md#executeModificationAsync) | **POST** /modification/executeAsync | Execute Modification Async (Batch)


<a name="executeModification"></a>
# **executeModification**
> executeModification(modificationDto)

Execute Modification

Executes a modification synchronously for multiple process instances. To modify a single process instance, use the [Modify Process Instance Execution State](https://docs.camunda.org/manual/7.18/reference/rest/process-instance/post-modification/) method. To execute a modification asynchronously, use the [Execute Modification Async (Batch)](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-async/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ModificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    ModificationApi apiInstance = new ModificationApi(defaultClient);
    ModificationDto modificationDto = {"processDefinitionId":"aProcessDefinitionId","instructions":[{"type":"startAfterActivity","activityId":"aUserTask"},{"type":"cancel","activityId":"anotherTask","cancelCurrentActiveActivityInstances":true}],"processInstanceIds":["aProcessInstance","anotherProcessInstance"],"processInstanceQuery":{"processDefinitionId":"aProcessDefinitionId"},"skipCustomListeners":true,"annotation":"Modified to resolve an error."}; // ModificationDto | 
    try {
      apiInstance.executeModification(modificationDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModificationApi#executeModification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationDto** | [**ModificationDto**](ModificationDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Request successful. This method returns no content. |  -  |
**400** |  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  |  -  |

<a name="executeModificationAsync"></a>
# **executeModificationAsync**
> BatchDto executeModificationAsync(modificationDto)

Execute Modification Async (Batch)

Executes a modification asynchronously for multiple process instances. To execute a modification synchronously, use the [Execute Modification](https://docs.camunda.org/manual/7.18/reference/rest/modification/post-modification-sync/) method.  For more information about the difference between synchronous and asynchronous execution of a modification, please refer to the related section of the [user guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/process-instance-migration.md#executing-a-migration-plan).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ModificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    ModificationApi apiInstance = new ModificationApi(defaultClient);
    ModificationDto modificationDto = {"processDefinitionId":"aProcessDefinitionId","instructions":[{"type":"startAfterActivity","activityId":"aUserTask"},{"type":"cancel","activityId":"anotherTask","cancelCurrentActiveActivityInstances":true}],"processInstanceIds":["aProcessInstance","anotherProcessInstance"],"processInstanceQuery":{"processDefinitionId":"aProcessDefinitionId"},"skipCustomListeners":true,"annotation":"Modified to resolve an error."}; // ModificationDto | 
    try {
      BatchDto result = apiInstance.executeModificationAsync(modificationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModificationApi#executeModificationAsync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationDto** | [**ModificationDto**](ModificationDto.md)|  | [optional]

### Return type

[**BatchDto**](BatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request successful. |  -  |
**400** |  In case following parameters are missing: instructions, processDefinitionId, activityId or transitionId, processInstanceIds or processInstanceQuery, an exception of type &#x60;InvalidRequestException&#x60; is returned. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format.  |  -  |

