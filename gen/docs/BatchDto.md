

# BatchDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the batch. |  [optional]
**type** | **String** | The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types. |  [optional]
**totalJobs** | **Integer** | The total jobs of a batch is the number of batch execution jobs required to complete the batch. |  [optional]
**jobsCreated** | **Integer** | The number of batch execution jobs already created by the seed job. |  [optional]
**batchJobsPerSeed** | **Integer** | The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see &#x60;totalJobs&#x60; property). |  [optional]
**invocationsPerBatchJob** | **Integer** | Every batch execution job invokes the command executed by the batch &#x60;invocationsPerBatchJob&#x60; times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job. |  [optional]
**seedJobDefinitionId** | **String** | The job definition id for the seed jobs of this batch. |  [optional]
**monitorJobDefinitionId** | **String** | The job definition id for the monitor jobs of this batch. |  [optional]
**batchJobDefinitionId** | **String** | The job definition id for the batch execution jobs of this batch. |  [optional]
**suspended** | **Boolean** | Indicates whether this batch is suspended or not. |  [optional]
**tenantId** | **String** | The tenant id of the batch. |  [optional]
**createUserId** | **String** | The id of the user that created the batch. |  [optional]
**startTime** | **OffsetDateTime** | The time the batch was started. Default format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. For further information, please see the [documentation] (https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) |  [optional]
**executionStartTime** | **OffsetDateTime** | The time the batch execution was started, i.e., at least one batch job has been executed. Default format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. For further information, please see the [documentation] (https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) |  [optional]



