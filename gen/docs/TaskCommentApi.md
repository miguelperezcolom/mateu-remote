# TaskCommentApi

All URIs are relative to *http://localhost:8080/engine-rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](TaskCommentApi.md#createComment) | **POST** /task/{id}/comment/create | Create
[**getComment**](TaskCommentApi.md#getComment) | **GET** /task/{id}/comment/{commentId} | Get
[**getComments**](TaskCommentApi.md#getComments) | **GET** /task/{id}/comment | Get List


<a name="createComment"></a>
# **createComment**
> CommentDto createComment(id, commentDto)

Create

Creates a comment for a task by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCommentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    TaskCommentApi apiInstance = new TaskCommentApi(defaultClient);
    String id = "id_example"; // String | The id of the task to add the comment to.
    CommentDto commentDto = {"message":"a task comment","processInstanceId":"96dc383f-23eb-11e6-8e4a-f6aefe19b687"}; // CommentDto | **Note:** Only the `message` and `processInstanceId` properties will be used. Every other property passed to this endpoint will be ignored.
    try {
      CommentDto result = apiInstance.createComment(id, commentDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCommentApi#createComment");
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
 **id** | **String**| The id of the task to add the comment to. |
 **commentDto** | [**CommentDto**](CommentDto.md)| **Note:** Only the &#x60;message&#x60; and &#x60;processInstanceId&#x60; properties will be used. Every other property passed to this endpoint will be ignored. | [optional]

### Return type

[**CommentDto**](CommentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request successful. |  -  |
**400** | The task does not exist or no comment message was submitted. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. |  -  |
**403** | The history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. |  -  |

<a name="getComment"></a>
# **getComment**
> CommentDto getComment(id, commentId)

Get

Retrieves a task comment by task id and comment id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCommentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    TaskCommentApi apiInstance = new TaskCommentApi(defaultClient);
    String id = "id_example"; // String | The id of the task.
    String commentId = "commentId_example"; // String | The id of the comment to be retrieved.
    try {
      CommentDto result = apiInstance.getComment(id, commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCommentApi#getComment");
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
 **id** | **String**| The id of the task. |
 **commentId** | **String**| The id of the comment to be retrieved. |

### Return type

[**CommentDto**](CommentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request successful. |  -  |
**404** | The task or comment with given task and comment id does not exist, or the history of the engine is disabled. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. |  -  |

<a name="getComments"></a>
# **getComments**
> List&lt;CommentDto&gt; getComments(id)

Get List

Gets the comments for a task by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TaskCommentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    TaskCommentApi apiInstance = new TaskCommentApi(defaultClient);
    String id = "id_example"; // String | The id of the task to retrieve the comments for.
    try {
      List<CommentDto> result = apiInstance.getComments(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskCommentApi#getComments");
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
 **id** | **String**| The id of the task to retrieve the comments for. |

### Return type

[**List&lt;CommentDto&gt;**](CommentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request successful. |  -  |
**404** | No task exists for the given task id. See the [Introduction](https://docs.camunda.org/manual/7.18/reference/rest/overview/#error-handling) for the error response format. |  -  |

