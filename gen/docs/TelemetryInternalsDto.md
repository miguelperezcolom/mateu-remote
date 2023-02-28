

# TelemetryInternalsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**database** | [**Map&lt;String, AbstractVendorVersionInformationDto&gt;**](AbstractVendorVersionInformationDto.md) | Vendor and version of the connected database. |  [optional]
**applicationServer** | [**Map&lt;String, AbstractVendorVersionInformationDto&gt;**](AbstractVendorVersionInformationDto.md) | Vendor and version of the application server. |  [optional]
**licenseKey** | [**Map&lt;String, TelemetryLicenseKeyDto&gt;**](TelemetryLicenseKeyDto.md) | Information about the Camunda license key. |  [optional]
**camundaIntegration** | **List&lt;String&gt;** | List of Camunda integrations used (e.g., Camunda Spring Boot Starter, Camunda Run, WildFly/JBoss subsystem, Camunda EJB). |  [optional]
**commands** | [**Map&lt;String, TelemetryCountDto&gt;**](TelemetryCountDto.md) | The count of executed commands after the last retrieved data. |  [optional]
**metrics** | [**Map&lt;String, TelemetryCountDto&gt;**](TelemetryCountDto.md) | The collected metrics are the number of root process instance executions started, the number of activity instances started or also known as flow node instances, and the number of executed decision instances and elements. |  [optional]
**webapps** | **List&lt;String&gt;** | The webapps enabled in this installation of Camunda. |  [optional]
**jdk** | [**Map&lt;String, AbstractVendorVersionInformationDto&gt;**](AbstractVendorVersionInformationDto.md) | Vendor and version of the installed JDK. |  [optional]



