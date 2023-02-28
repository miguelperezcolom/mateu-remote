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
import org.openapitools.client.model.ExternalTaskQueryDtoSorting;
import org.threeten.bp.OffsetDateTime;

/**
 * A JSON object with the following properties:
 */
@ApiModel(description = "A JSON object with the following properties:")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class ExternalTaskQueryDto {
  public static final String SERIALIZED_NAME_EXTERNAL_TASK_ID = "externalTaskId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TASK_ID)
  private String externalTaskId;

  public static final String SERIALIZED_NAME_EXTERNAL_TASK_ID_IN = "externalTaskIdIn";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TASK_ID_IN)
  private List<String> externalTaskIdIn = null;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NOT_LOCKED = "notLocked";
  @SerializedName(SERIALIZED_NAME_NOT_LOCKED)
  private Boolean notLocked;

  public static final String SERIALIZED_NAME_WITH_RETRIES_LEFT = "withRetriesLeft";
  @SerializedName(SERIALIZED_NAME_WITH_RETRIES_LEFT)
  private Boolean withRetriesLeft;

  public static final String SERIALIZED_NAME_NO_RETRIES_LEFT = "noRetriesLeft";
  @SerializedName(SERIALIZED_NAME_NO_RETRIES_LEFT)
  private Boolean noRetriesLeft;

  public static final String SERIALIZED_NAME_LOCK_EXPIRATION_AFTER = "lockExpirationAfter";
  @SerializedName(SERIALIZED_NAME_LOCK_EXPIRATION_AFTER)
  private OffsetDateTime lockExpirationAfter;

  public static final String SERIALIZED_NAME_LOCK_EXPIRATION_BEFORE = "lockExpirationBefore";
  @SerializedName(SERIALIZED_NAME_LOCK_EXPIRATION_BEFORE)
  private OffsetDateTime lockExpirationBefore;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_ID_IN = "activityIdIn";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID_IN)
  private List<String> activityIdIn = null;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID_IN = "processInstanceIdIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID_IN)
  private List<String> processInstanceIdIn = null;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_TENANT_ID_IN = "tenantIdIn";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_IN)
  private List<String> tenantIdIn = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_PRIORITY_HIGHER_THAN_OR_EQUALS = "priorityHigherThanOrEquals";
  @SerializedName(SERIALIZED_NAME_PRIORITY_HIGHER_THAN_OR_EQUALS)
  private Long priorityHigherThanOrEquals;

  public static final String SERIALIZED_NAME_PRIORITY_LOWER_THAN_OR_EQUALS = "priorityLowerThanOrEquals";
  @SerializedName(SERIALIZED_NAME_PRIORITY_LOWER_THAN_OR_EQUALS)
  private Long priorityLowerThanOrEquals;

  public static final String SERIALIZED_NAME_SORTING = "sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private List<ExternalTaskQueryDtoSorting> sorting = null;


  public ExternalTaskQueryDto externalTaskId(String externalTaskId) {
    
    this.externalTaskId = externalTaskId;
    return this;
  }

   /**
   * Filter by an external task&#39;s id.
   * @return externalTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by an external task's id.")

  public String getExternalTaskId() {
    return externalTaskId;
  }


  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }


  public ExternalTaskQueryDto externalTaskIdIn(List<String> externalTaskIdIn) {
    
    this.externalTaskIdIn = externalTaskIdIn;
    return this;
  }

  public ExternalTaskQueryDto addExternalTaskIdInItem(String externalTaskIdInItem) {
    if (this.externalTaskIdIn == null) {
      this.externalTaskIdIn = new ArrayList<String>();
    }
    this.externalTaskIdIn.add(externalTaskIdInItem);
    return this;
  }

   /**
   * Filter by the comma-separated list of external task ids.
   * @return externalTaskIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the comma-separated list of external task ids.")

  public List<String> getExternalTaskIdIn() {
    return externalTaskIdIn;
  }


  public void setExternalTaskIdIn(List<String> externalTaskIdIn) {
    this.externalTaskIdIn = externalTaskIdIn;
  }


  public ExternalTaskQueryDto topicName(String topicName) {
    
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


  public ExternalTaskQueryDto workerId(String workerId) {
    
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


  public ExternalTaskQueryDto locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Only include external tasks that are currently locked (i.e., they have a lock time and it has not expired). Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include external tasks that are currently locked (i.e., they have a lock time and it has not expired). Value may only be `true`, as `false` matches any external task.")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public ExternalTaskQueryDto notLocked(Boolean notLocked) {
    
    this.notLocked = notLocked;
    return this;
  }

   /**
   * Only include external tasks that are currently not locked (i.e., they have no lock or it has expired). Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return notLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include external tasks that are currently not locked (i.e., they have no lock or it has expired). Value may only be `true`, as `false` matches any external task.")

  public Boolean getNotLocked() {
    return notLocked;
  }


  public void setNotLocked(Boolean notLocked) {
    this.notLocked = notLocked;
  }


  public ExternalTaskQueryDto withRetriesLeft(Boolean withRetriesLeft) {
    
    this.withRetriesLeft = withRetriesLeft;
    return this;
  }

   /**
   * Only include external tasks that have a positive (&amp;gt; 0) number of retries (or &#x60;null&#x60;). Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return withRetriesLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include external tasks that have a positive (&gt; 0) number of retries (or `null`). Value may only be `true`, as `false` matches any external task.")

  public Boolean getWithRetriesLeft() {
    return withRetriesLeft;
  }


  public void setWithRetriesLeft(Boolean withRetriesLeft) {
    this.withRetriesLeft = withRetriesLeft;
  }


  public ExternalTaskQueryDto noRetriesLeft(Boolean noRetriesLeft) {
    
    this.noRetriesLeft = noRetriesLeft;
    return this;
  }

   /**
   * Only include external tasks that have 0 retries. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return noRetriesLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include external tasks that have 0 retries. Value may only be `true`, as `false` matches any external task.")

  public Boolean getNoRetriesLeft() {
    return noRetriesLeft;
  }


  public void setNoRetriesLeft(Boolean noRetriesLeft) {
    this.noRetriesLeft = noRetriesLeft;
  }


  public ExternalTaskQueryDto lockExpirationAfter(OffsetDateTime lockExpirationAfter) {
    
    this.lockExpirationAfter = lockExpirationAfter;
    return this;
  }

   /**
   * Restrict to external tasks that have a lock that expires after a given date. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
   * @return lockExpirationAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict to external tasks that have a lock that expires after a given date. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")

  public OffsetDateTime getLockExpirationAfter() {
    return lockExpirationAfter;
  }


  public void setLockExpirationAfter(OffsetDateTime lockExpirationAfter) {
    this.lockExpirationAfter = lockExpirationAfter;
  }


  public ExternalTaskQueryDto lockExpirationBefore(OffsetDateTime lockExpirationBefore) {
    
    this.lockExpirationBefore = lockExpirationBefore;
    return this;
  }

   /**
   * Restrict to external tasks that have a lock that expires before a given date. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
   * @return lockExpirationBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict to external tasks that have a lock that expires before a given date. By [default](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")

  public OffsetDateTime getLockExpirationBefore() {
    return lockExpirationBefore;
  }


  public void setLockExpirationBefore(OffsetDateTime lockExpirationBefore) {
    this.lockExpirationBefore = lockExpirationBefore;
  }


  public ExternalTaskQueryDto activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * Filter by the id of the activity that an external task is created for.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the id of the activity that an external task is created for.")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public ExternalTaskQueryDto activityIdIn(List<String> activityIdIn) {
    
    this.activityIdIn = activityIdIn;
    return this;
  }

  public ExternalTaskQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<String>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

   /**
   * Filter by the comma-separated list of ids of the activities that an external task is created for.
   * @return activityIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the comma-separated list of ids of the activities that an external task is created for.")

  public List<String> getActivityIdIn() {
    return activityIdIn;
  }


  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }


  public ExternalTaskQueryDto executionId(String executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * Filter by the id of the execution that an external task belongs to.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the id of the execution that an external task belongs to.")

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public ExternalTaskQueryDto processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Filter by the id of the process instance that an external task belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the id of the process instance that an external task belongs to.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public ExternalTaskQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public ExternalTaskQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<String>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

   /**
   * Filter by a comma-separated list of process instance ids that an external task may belong to.
   * @return processInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a comma-separated list of process instance ids that an external task may belong to.")

  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }


  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }


  public ExternalTaskQueryDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Filter by the id of the process definition that an external task belongs to.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the id of the process definition that an external task belongs to.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ExternalTaskQueryDto tenantIdIn(List<String> tenantIdIn) {
    
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public ExternalTaskQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<String>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

   /**
   * Filter by a comma-separated list of tenant ids. An external task must have one of the given tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a comma-separated list of tenant ids. An external task must have one of the given tenant ids.")

  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }


  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }


  public ExternalTaskQueryDto active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Only include active tasks. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include active tasks. Value may only be `true`, as `false` matches any external task.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ExternalTaskQueryDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * Only include suspended tasks. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; matches any external task.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include suspended tasks. Value may only be `true`, as `false` matches any external task.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ExternalTaskQueryDto priorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
    return this;
  }

   /**
   * Only include jobs with a priority higher than or equal to the given value. Value must be a valid &#x60;long&#x60; value.
   * @return priorityHigherThanOrEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include jobs with a priority higher than or equal to the given value. Value must be a valid `long` value.")

  public Long getPriorityHigherThanOrEquals() {
    return priorityHigherThanOrEquals;
  }


  public void setPriorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
  }


  public ExternalTaskQueryDto priorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
    return this;
  }

   /**
   * Only include jobs with a priority lower than or equal to the given value. Value must be a valid &#x60;long&#x60; value.
   * @return priorityLowerThanOrEquals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include jobs with a priority lower than or equal to the given value. Value must be a valid `long` value.")

  public Long getPriorityLowerThanOrEquals() {
    return priorityLowerThanOrEquals;
  }


  public void setPriorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
  }


  public ExternalTaskQueryDto sorting(List<ExternalTaskQueryDtoSorting> sorting) {
    
    this.sorting = sorting;
    return this;
  }

  public ExternalTaskQueryDto addSortingItem(ExternalTaskQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<ExternalTaskQueryDtoSorting>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * A JSON array of criteria to sort the result by. Each element of the array is a JSON object that                     specifies one ordering. The position in the array identifies the rank of an ordering, i.e., whether                     it is primary, secondary, etc. The ordering objects have the following properties:                      **Note:** The &#x60;sorting&#x60; properties will not be applied to the External Task count query.
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of criteria to sort the result by. Each element of the array is a JSON object that                     specifies one ordering. The position in the array identifies the rank of an ordering, i.e., whether                     it is primary, secondary, etc. The ordering objects have the following properties:                      **Note:** The `sorting` properties will not be applied to the External Task count query.")

  public List<ExternalTaskQueryDtoSorting> getSorting() {
    return sorting;
  }


  public void setSorting(List<ExternalTaskQueryDtoSorting> sorting) {
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
    ExternalTaskQueryDto externalTaskQueryDto = (ExternalTaskQueryDto) o;
    return Objects.equals(this.externalTaskId, externalTaskQueryDto.externalTaskId) &&
        Objects.equals(this.externalTaskIdIn, externalTaskQueryDto.externalTaskIdIn) &&
        Objects.equals(this.topicName, externalTaskQueryDto.topicName) &&
        Objects.equals(this.workerId, externalTaskQueryDto.workerId) &&
        Objects.equals(this.locked, externalTaskQueryDto.locked) &&
        Objects.equals(this.notLocked, externalTaskQueryDto.notLocked) &&
        Objects.equals(this.withRetriesLeft, externalTaskQueryDto.withRetriesLeft) &&
        Objects.equals(this.noRetriesLeft, externalTaskQueryDto.noRetriesLeft) &&
        Objects.equals(this.lockExpirationAfter, externalTaskQueryDto.lockExpirationAfter) &&
        Objects.equals(this.lockExpirationBefore, externalTaskQueryDto.lockExpirationBefore) &&
        Objects.equals(this.activityId, externalTaskQueryDto.activityId) &&
        Objects.equals(this.activityIdIn, externalTaskQueryDto.activityIdIn) &&
        Objects.equals(this.executionId, externalTaskQueryDto.executionId) &&
        Objects.equals(this.processInstanceId, externalTaskQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, externalTaskQueryDto.processInstanceIdIn) &&
        Objects.equals(this.processDefinitionId, externalTaskQueryDto.processDefinitionId) &&
        Objects.equals(this.tenantIdIn, externalTaskQueryDto.tenantIdIn) &&
        Objects.equals(this.active, externalTaskQueryDto.active) &&
        Objects.equals(this.suspended, externalTaskQueryDto.suspended) &&
        Objects.equals(this.priorityHigherThanOrEquals, externalTaskQueryDto.priorityHigherThanOrEquals) &&
        Objects.equals(this.priorityLowerThanOrEquals, externalTaskQueryDto.priorityLowerThanOrEquals) &&
        Objects.equals(this.sorting, externalTaskQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalTaskId, externalTaskIdIn, topicName, workerId, locked, notLocked, withRetriesLeft, noRetriesLeft, lockExpirationAfter, lockExpirationBefore, activityId, activityIdIn, executionId, processInstanceId, processInstanceIdIn, processDefinitionId, tenantIdIn, active, suspended, priorityHigherThanOrEquals, priorityLowerThanOrEquals, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskQueryDto {\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    externalTaskIdIn: ").append(toIndentedString(externalTaskIdIn)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    notLocked: ").append(toIndentedString(notLocked)).append("\n");
    sb.append("    withRetriesLeft: ").append(toIndentedString(withRetriesLeft)).append("\n");
    sb.append("    noRetriesLeft: ").append(toIndentedString(noRetriesLeft)).append("\n");
    sb.append("    lockExpirationAfter: ").append(toIndentedString(lockExpirationAfter)).append("\n");
    sb.append("    lockExpirationBefore: ").append(toIndentedString(lockExpirationBefore)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    priorityHigherThanOrEquals: ").append(toIndentedString(priorityHigherThanOrEquals)).append("\n");
    sb.append("    priorityLowerThanOrEquals: ").append(toIndentedString(priorityLowerThanOrEquals)).append("\n");
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

