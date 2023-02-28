# ConditionApi

All URIs are relative to *http://localhost:8080/engine-rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**evaluateCondition**](ConditionApi.md#evaluateCondition) | **POST** /condition | Evaluate


<a name="evaluateCondition"></a>
# **evaluateCondition**
> List&lt;ProcessInstanceDto&gt; evaluateCondition(evaluationConditionDto)

Evaluate

Triggers evaluation of conditions for conditional start event(s).  Internally this maps to the engines condition evaluation builder method ConditionEvaluationBuilder#evaluateStartConditions().  For more information see the [Conditional Start Events](https://docs.camunda.org/manual/7.18/reference/bpmn20/events/conditional-events/#conditional-start-event) section of the [BPMN 2.0 Implementation Reference](https://docs.camunda.org/manual/7.18/reference/bpmn20/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/engine-rest");

    ConditionApi apiInstance = new ConditionApi(defaultClient);
    EvaluationConditionDto evaluationConditionDto = {"variables":{"temperature":{"value":24,"type":"Integer","valueInfo":{"transient":true}},"city":{"value":"Parma","type":"String"}},"businessKey":"aBusinessKey","tenantId":"aTenantId"}; // EvaluationConditionDto | 
    try {
      List<ProcessInstanceDto> result = apiInstance.evaluateCondition(evaluationConditionDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConditionApi#evaluateCondition");
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
 **evaluationConditionDto** | [**EvaluationConditionDto**](EvaluationConditionDto.md)|  | [optional]

### Return type

[**List&lt;ProcessInstanceDto&gt;**](ProcessInstanceDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request successful. |  -  |
**400** | If both tenantId and withoutTenantId are supplied. |  -  |
**403** | If the user is not allowed to start the process instance of the process definition, which start condition was evaluated to &#x60;true&#x60;. |  -  |

