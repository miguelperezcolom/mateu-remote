

# SetRemovalTimeToHistoricProcessInstancesDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**historicProcessInstanceIds** | **List&lt;String&gt;** | The id of the process instance. |  [optional]
**historicProcessInstanceQuery** | [**HistoricProcessInstanceQueryDto**](HistoricProcessInstanceQueryDto.md) |  |  [optional]
**hierarchical** | **Boolean** | Sets the removal time to all historic process instances in the hierarchy. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. |  [optional]
**absoluteRemovalTime** | **OffsetDateTime** | The date for which the instances shall be removed. Value may not be &#x60;null&#x60;.  **Note:** Cannot be set in conjunction with &#x60;clearedRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;. |  [optional]
**clearedRemovalTime** | **Boolean** | Sets the removal time to &#x60;null&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;calculatedRemovalTime&#x60;. |  [optional]
**calculatedRemovalTime** | **Boolean** | The removal time is calculated based on the engine&#39;s configuration settings. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  **Note:** Cannot be set in conjunction with &#x60;absoluteRemovalTime&#x60; or &#x60;clearedRemovalTime&#x60;. |  [optional]



