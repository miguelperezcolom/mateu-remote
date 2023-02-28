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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HistoricExternalTaskLogQueryDtoSorting;

/**
 * A Historic External Task Log instance query which defines a list of Historic External Task Log instances
 */
@ApiModel(description = "A Historic External Task Log instance query which defines a list of Historic External Task Log instances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class HistoricExternalTaskLogQueryDto {
  public static final String SERIALIZED_NAME_LOG_ID = "logId";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private String logId;

  public static final String SERIALIZED_NAME_EXTERNAL_TASK_ID = "externalTaskId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TASK_ID)
  private String externalTaskId;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ACTIVITY_ID_IN = "activityIdIn";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID_IN)
  private List<String> activityIdIn = null;

  public static final String SERIALIZED_NAME_ACTIVITY_INSTANCE_ID_IN = "activityInstanceIdIn";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INSTANCE_ID_IN)
  private List<String> activityInstanceIdIn = null;

  public static final String SERIALIZED_NAME_EXECUTION_ID_IN = "executionIdIn";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID_IN)
  private List<String> executionIdIn = null;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_TENANT_ID_IN = "tenantIdIn";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_IN)
  private List<String> tenantIdIn = null;

  public static final String SERIALIZED_NAME_WITHOUT_TENANT_ID = "withoutTenantId";
  @SerializedName(SERIALIZED_NAME_WITHOUT_TENANT_ID)
  private Boolean withoutTenantId;

  public static final String SERIALIZED_NAME_PRIORITY_LOWER_THAN_OR_EQUALS = "priorityLowerThanOrEquals";
  @SerializedName(SERIALIZED_NAME_PRIORITY_LOWER_THAN_OR_EQUALS)
  private Long priorityLowerThanOrEquals;

  public static final String SERIALIZED_NAME_PRIORITY_HIGHER_THAN_OR_EQUALS = "priorityHigherThanOrEquals";
  @SerializedName(SERIALIZED_NAME_PRIORITY_HIGHER_THAN_OR_EQUALS)
  private Long priorityHigherThanOrEquals;

  public static final String SERIALIZED_NAME_CREATION_LOG = "creationLog";
  @SerializedName(SERIALIZED_NAME_CREATION_LOG)
  private Boolean creationLog;

  public static final String SERIALIZED_NAME_FAILURE_LOG = "failureLog";
  @SerializedName(SERIALIZED_NAME_FAILURE_LOG)
  private Boolean failureLog;

  public static final String SERIALIZED_NAME_SUCCESS_LOG = "successLog";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LOG)
  private Boolean successLog;

  public static final String SERIALIZED_NAME_DELETION_LOG = "deletionLog";
  @SerializedName(SERIALIZED_NAME_DELETION_LOG)
  private Boolean deletionLog;

  public static final String SERIALIZED_NAME_SORTING = "sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private List<HistoricExternalTaskLogQueryDtoSorting> sorting = null;


  public HistoricExternalTaskLogQueryDto logId(String logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Filter by historic external task log id.
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by historic external task log id.")

  public String getLogId() {
    return logId;
  }


  public void setLogId(String logId) {
    this.logId = logId;
  }


  public HistoricExternalTaskLogQueryDto externalTaskId(String externalTaskId) {
    
    this.externalTaskId = externalTaskId;
    return this;
  }

   /**
   * Filter by external task id.
   * @return externalTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by external task id.")

  public String getExternalTaskId() {
    return externalTaskId;
  }


  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }


  public HistoricExternalTaskLogQueryDto topicName(String topicName) {
    
    this.topicName = topicName;
    return this;
  }

   /**
   * Filter by an external task topic.
   * @return topicName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an external task topic.")

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public HistoricExternalTaskLogQueryDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * Filter by the id of the worker that the task was most recently locked by.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the id of the worker that the task was most recently locked by.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public HistoricExternalTaskLogQueryDto errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Filter by external task exception message.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by external task exception message.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public HistoricExternalTaskLogQueryDto activityIdIn(List<String> activityIdIn) {
    
    this.activityIdIn = activityIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<String>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

   /**
   * Only include historic external task logs which belong to one of the passed activity ids.
   * @return activityIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic external task logs which belong to one of the passed activity ids.")

  public List<String> getActivityIdIn() {
    return activityIdIn;
  }


  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }


  public HistoricExternalTaskLogQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<String>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

   /**
   * Only include historic external task logs which belong to one of the passed activity instance ids.
   * @return activityInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic external task logs which belong to one of the passed activity instance ids.")

  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }


  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }


  public HistoricExternalTaskLogQueryDto executionIdIn(List<String> executionIdIn) {
    
    this.executionIdIn = executionIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<String>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

   /**
   * Only include historic external task logs which belong to one of the passed execution ids.
   * @return executionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic external task logs which belong to one of the passed execution ids.")

  public List<String> getExecutionIdIn() {
    return executionIdIn;
  }


  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }


  public HistoricExternalTaskLogQueryDto processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Filter by process instance id.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by process instance id.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public HistoricExternalTaskLogQueryDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Filter by process definition id.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by process definition id.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public HistoricExternalTaskLogQueryDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Filter by process definition key.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by process definition key.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public HistoricExternalTaskLogQueryDto tenantIdIn(List<String> tenantIdIn) {
    
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<String>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

   /**
   * Only include historic external task log entries which belong to one of the passed and comma-separated tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic external task log entries which belong to one of the passed and comma-separated tenant ids.")

  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }


  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }


  public HistoricExternalTaskLogQueryDto withoutTenantId(Boolean withoutTenantId) {
    
    this.withoutTenantId = withoutTenantId;
    return this;
  }

   /**
   * Only include historic external task log entries that belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic external task log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }


  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  public HistoricExternalTaskLogQueryDto priorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
    return this;
  }

   /**
   * Only include logs for which the associated external task had a priority lower than or equal to the given value. Value must be a valid &#x60;long&#x60; value.
   * @return priorityLowerThanOrEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include logs for which the associated external task had a priority lower than or equal to the given value. Value must be a valid `long` value.")

  public Long getPriorityLowerThanOrEquals() {
    return priorityLowerThanOrEquals;
  }


  public void setPriorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
  }


  public HistoricExternalTaskLogQueryDto priorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
    return this;
  }

   /**
   * Only include logs for which the associated external task had a priority higher than or equal to the given value. Value must be a valid &#x60;long&#x60; value.
   * @return priorityHigherThanOrEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include logs for which the associated external task had a priority higher than or equal to the given value. Value must be a valid `long` value.")

  public Long getPriorityHigherThanOrEquals() {
    return priorityHigherThanOrEquals;
  }


  public void setPriorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
  }


  public HistoricExternalTaskLogQueryDto creationLog(Boolean creationLog) {
    
    this.creationLog = creationLog;
    return this;
  }

   /**
   * Only include creation logs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return creationLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include creation logs. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getCreationLog() {
    return creationLog;
  }


  public void setCreationLog(Boolean creationLog) {
    this.creationLog = creationLog;
  }


  public HistoricExternalTaskLogQueryDto failureLog(Boolean failureLog) {
    
    this.failureLog = failureLog;
    return this;
  }

   /**
   * Only include failure logs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return failureLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include failure logs. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getFailureLog() {
    return failureLog;
  }


  public void setFailureLog(Boolean failureLog) {
    this.failureLog = failureLog;
  }


  public HistoricExternalTaskLogQueryDto successLog(Boolean successLog) {
    
    this.successLog = successLog;
    return this;
  }

   /**
   * Only include success logs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return successLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include success logs. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getSuccessLog() {
    return successLog;
  }


  public void setSuccessLog(Boolean successLog) {
    this.successLog = successLog;
  }


  public HistoricExternalTaskLogQueryDto deletionLog(Boolean deletionLog) {
    
    this.deletionLog = deletionLog;
    return this;
  }

   /**
   * Only include deletion logs. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return deletionLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include deletion logs. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getDeletionLog() {
    return deletionLog;
  }


  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }


  public HistoricExternalTaskLogQueryDto sorting(List<HistoricExternalTaskLogQueryDtoSorting> sorting) {
    
    this.sorting = sorting;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addSortingItem(HistoricExternalTaskLogQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<HistoricExternalTaskLogQueryDtoSorting>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for &#x60;count&#x60; endpoints.
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.")

  public List<HistoricExternalTaskLogQueryDtoSorting> getSorting() {
    return sorting;
  }


  public void setSorting(List<HistoricExternalTaskLogQueryDtoSorting> sorting) {
    this.sorting = sorting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricExternalTaskLogQueryDto historicExternalTaskLogQueryDto = (HistoricExternalTaskLogQueryDto) o;
    return Objects.equals(this.logId, historicExternalTaskLogQueryDto.logId) &&
        Objects.equals(this.externalTaskId, historicExternalTaskLogQueryDto.externalTaskId) &&
        Objects.equals(this.topicName, historicExternalTaskLogQueryDto.topicName) &&
        Objects.equals(this.workerId, historicExternalTaskLogQueryDto.workerId) &&
        Objects.equals(this.errorMessage, historicExternalTaskLogQueryDto.errorMessage) &&
        Objects.equals(this.activityIdIn, historicExternalTaskLogQueryDto.activityIdIn) &&
        Objects.equals(this.activityInstanceIdIn, historicExternalTaskLogQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.executionIdIn, historicExternalTaskLogQueryDto.executionIdIn) &&
        Objects.equals(this.processInstanceId, historicExternalTaskLogQueryDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicExternalTaskLogQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicExternalTaskLogQueryDto.processDefinitionKey) &&
        Objects.equals(this.tenantIdIn, historicExternalTaskLogQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicExternalTaskLogQueryDto.withoutTenantId) &&
        Objects.equals(this.priorityLowerThanOrEquals, historicExternalTaskLogQueryDto.priorityLowerThanOrEquals) &&
        Objects.equals(this.priorityHigherThanOrEquals, historicExternalTaskLogQueryDto.priorityHigherThanOrEquals) &&
        Objects.equals(this.creationLog, historicExternalTaskLogQueryDto.creationLog) &&
        Objects.equals(this.failureLog, historicExternalTaskLogQueryDto.failureLog) &&
        Objects.equals(this.successLog, historicExternalTaskLogQueryDto.successLog) &&
        Objects.equals(this.deletionLog, historicExternalTaskLogQueryDto.deletionLog) &&
        Objects.equals(this.sorting, historicExternalTaskLogQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logId, externalTaskId, topicName, workerId, errorMessage, activityIdIn, activityInstanceIdIn, executionIdIn, processInstanceId, processDefinitionId, processDefinitionKey, tenantIdIn, withoutTenantId, priorityLowerThanOrEquals, priorityHigherThanOrEquals, creationLog, failureLog, successLog, deletionLog, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricExternalTaskLogQueryDto {\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    priorityLowerThanOrEquals: ").append(toIndentedString(priorityLowerThanOrEquals)).append("\n");
    sb.append("    priorityHigherThanOrEquals: ").append(toIndentedString(priorityHigherThanOrEquals)).append("\n");
    sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
    sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
    sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
    sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

