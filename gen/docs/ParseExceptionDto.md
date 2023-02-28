

# ParseExceptionDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**Map&lt;String, ResourceReportDto&gt;**](ResourceReportDto.md) | A JSON Object containing list of errors and warnings occurred during deployment. |  [optional]
**type** | **String** | An exception class indicating the occurred error. |  [optional]
**message** | **String** | A detailed message of the error. |  [optional]
**code** | **BigDecimal** | The code allows your client application to identify the error in an automated fashion. You can look up the meaning of all built-in codes and learn how to add custom codes in the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/error-handling/#exception-codes). |  [optional]



