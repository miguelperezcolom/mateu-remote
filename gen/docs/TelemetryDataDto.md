

# TelemetryDataDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installation** | **String** | An id which is unique for each installation of Camunda. It is stored once per database so all engines connected to the same database will have the same installation ID. The ID is used to identify a single installation of Camunda Platform. |  [optional]
**product** | [**Map&lt;String, TelemetryProductDto&gt;**](TelemetryProductDto.md) | Information about the product collection telemetry data. |  [optional]



