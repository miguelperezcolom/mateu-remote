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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * HistoricDetailDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class HistoricDetailDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_ACTIVITY_INSTANCE_ID = "activityInstanceId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INSTANCE_ID)
  private String activityInstanceId;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_CASE_DEFINITION_KEY = "caseDefinitionKey";
  @SerializedName(SERIALIZED_NAME_CASE_DEFINITION_KEY)
  private String caseDefinitionKey;

  public static final String SERIALIZED_NAME_CASE_DEFINITION_ID = "caseDefinitionId";
  @SerializedName(SERIALIZED_NAME_CASE_DEFINITION_ID)
  private String caseDefinitionId;

  public static final String SERIALIZED_NAME_CASE_INSTANCE_ID = "caseInstanceId";
  @SerializedName(SERIALIZED_NAME_CASE_INSTANCE_ID)
  private String caseInstanceId;

  public static final String SERIALIZED_NAME_CASE_EXECUTION_ID = "caseExecutionId";
  @SerializedName(SERIALIZED_NAME_CASE_EXECUTION_ID)
  private String caseExecutionId;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_USER_OPERATION_ID = "userOperationId";
  @SerializedName(SERIALIZED_NAME_USER_OPERATION_ID)
  private String userOperationId;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_REMOVAL_TIME = "removalTime";
  @SerializedName(SERIALIZED_NAME_REMOVAL_TIME)
  private OffsetDateTime removalTime;

  public static final String SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  @SerializedName(SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID)
  private String rootProcessInstanceId;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_FIELD_VALUE = "fieldValue";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE)
  private Object fieldValue;

  public static final String SERIALIZED_NAME_VARIABLE_NAME = "variableName";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME)
  private String variableName;

  public static final String SERIALIZED_NAME_VARIABLE_INSTANCE_ID = "variableInstanceId";
  @SerializedName(SERIALIZED_NAME_VARIABLE_INSTANCE_ID)
  private String variableInstanceId;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variableType";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private String variableType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;

  public static final String SERIALIZED_NAME_VALUE_INFO = "valueInfo";
  @SerializedName(SERIALIZED_NAME_VALUE_INFO)
  private Map<String, Object> valueInfo = null;

  public static final String SERIALIZED_NAME_INITIAL = "initial";
  @SerializedName(SERIALIZED_NAME_INITIAL)
  private Boolean initial;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;


  public HistoricDetailDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the historic detail.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the historic detail.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HistoricDetailDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the historic detail. Either &#x60;formField&#x60; for a submitted form field value or &#x60;variableUpdate&#x60; for variable updates.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the historic detail. Either `formField` for a submitted form field value or `variableUpdate` for variable updates.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HistoricDetailDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition that this historic detail belongs to.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition that this historic detail belongs to.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public HistoricDetailDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition that this historic detail belongs to.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition that this historic detail belongs to.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public HistoricDetailDto processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The id of the process instance the historic detail belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance the historic detail belongs to.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public HistoricDetailDto activityInstanceId(String activityInstanceId) {
    
    this.activityInstanceId = activityInstanceId;
    return this;
  }

   /**
   * The id of the activity instance the historic detail belongs to.
   * @return activityInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity instance the historic detail belongs to.")

  public String getActivityInstanceId() {
    return activityInstanceId;
  }


  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }


  public HistoricDetailDto executionId(String executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * The id of the execution the historic detail belongs to.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the execution the historic detail belongs to.")

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public HistoricDetailDto caseDefinitionKey(String caseDefinitionKey) {
    
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

   /**
   * The key of the case definition that this historic detail belongs to.
   * @return caseDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the case definition that this historic detail belongs to.")

  public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }


  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }


  public HistoricDetailDto caseDefinitionId(String caseDefinitionId) {
    
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

   /**
   * The id of the case definition that this historic detail belongs to.
   * @return caseDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case definition that this historic detail belongs to.")

  public String getCaseDefinitionId() {
    return caseDefinitionId;
  }


  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }


  public HistoricDetailDto caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * The id of the case instance the historic detail belongs to.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case instance the historic detail belongs to.")

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public HistoricDetailDto caseExecutionId(String caseExecutionId) {
    
    this.caseExecutionId = caseExecutionId;
    return this;
  }

   /**
   * The id of the case execution the historic detail belongs to.
   * @return caseExecutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case execution the historic detail belongs to.")

  public String getCaseExecutionId() {
    return caseExecutionId;
  }


  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }


  public HistoricDetailDto taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * The id of the task the historic detail belongs to.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task the historic detail belongs to.")

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public HistoricDetailDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The id of the tenant that this historic detail belongs to.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant that this historic detail belongs to.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public HistoricDetailDto userOperationId(String userOperationId) {
    
    this.userOperationId = userOperationId;
    return this;
  }

   /**
   * The id of user operation which links historic detail with [user operation log](https://docs.camunda.org/manual/7.18/reference/rest/history/user-operation-log/) entries.
   * @return userOperationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of user operation which links historic detail with [user operation log](https://docs.camunda.org/manual/7.18/reference/rest/history/user-operation-log/) entries.")

  public String getUserOperationId() {
    return userOperationId;
  }


  public void setUserOperationId(String userOperationId) {
    this.userOperationId = userOperationId;
  }


  public HistoricDetailDto time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * The time when this historic detail occurred. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when this historic detail occurred. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public HistoricDetailDto removalTime(OffsetDateTime removalTime) {
    
    this.removalTime = removalTime;
    return this;
  }

   /**
   * The time after which the historic detail should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the historic detail should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }


  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }


  public HistoricDetailDto rootProcessInstanceId(String rootProcessInstanceId) {
    
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing this historic detail.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing this historic detail.")

  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }


  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }


  public HistoricDetailDto fieldId(String fieldId) {
    
    this.fieldId = fieldId;
    return this;
  }

   /**
   * The id of the form field.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;formField&#x60;.
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the form field.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.")

  public String getFieldId() {
    return fieldId;
  }


  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public HistoricDetailDto fieldValue(Object fieldValue) {
    
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * The submitted form field value. The value differs depending on the form field&#39;s type and on the &#x60;deserializeValue&#x60; parameter.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;formField&#x60;.
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The submitted form field value. The value differs depending on the form field's type and on the `deserializeValue` parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.")

  public Object getFieldValue() {
    return fieldValue;
  }


  public void setFieldValue(Object fieldValue) {
    this.fieldValue = fieldValue;
  }


  public HistoricDetailDto variableName(String variableName) {
    
    this.variableName = variableName;
    return this;
  }

   /**
   * The name of the variable which has been updated.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return variableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the variable which has been updated.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public String getVariableName() {
    return variableName;
  }


  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  public HistoricDetailDto variableInstanceId(String variableInstanceId) {
    
    this.variableInstanceId = variableInstanceId;
    return this;
  }

   /**
   * The id of the associated variable instance.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return variableInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the associated variable instance.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public String getVariableInstanceId() {
    return variableInstanceId;
  }


  public void setVariableInstanceId(String variableInstanceId) {
    this.variableInstanceId = variableInstanceId;
  }


  public HistoricDetailDto variableType(String variableType) {
    
    this.variableType = variableType;
    return this;
  }

   /**
   * The value type of the variable.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return variableType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value type of the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public String getVariableType() {
    return variableType;
  }


  public void setVariableType(String variableType) {
    this.variableType = variableType;
  }


  public HistoricDetailDto value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The variable&#39;s value. Value differs depending on the variable&#39;s type and on the deserializeValues parameter.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The variable's value. Value differs depending on the variable's type and on the deserializeValues parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public HistoricDetailDto valueInfo(Map<String, Object> valueInfo) {
    
    this.valueInfo = valueInfo;
    return this;
  }

  public HistoricDetailDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<String, Object>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

   /**
   * A JSON object containing additional, value-type-dependent properties. For variables of type &#x60;Object&#x60;, the following properties are returned:  * &#x60;objectTypeName&#x60;: A string representation of the object&#39;s type name. * &#x60;serializationDataFormat&#x60;: The serialization format used to store the variable.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return valueInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing additional, value-type-dependent properties. For variables of type `Object`, the following properties are returned:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public Map<String, Object> getValueInfo() {
    return valueInfo;
  }


  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }


  public HistoricDetailDto initial(Boolean initial) {
    
    this.initial = initial;
    return this;
  }

   /**
   * Returns &#x60;true&#x60; for variable updates that contains the initial values of the variables.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return initial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns `true` for variable updates that contains the initial values of the variables.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public Boolean getInitial() {
    return initial;
  }


  public void setInitial(Boolean initial) {
    this.initial = initial;
  }


  public HistoricDetailDto revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * The revision of the historic variable update.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The revision of the historic variable update.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public HistoricDetailDto errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * An error message in case a Java Serialized Object could not be de-serialized.  **Note:** This property is only set for a &#x60;HistoricVariableUpdate&#x60; historic details. In these cases, the value of the &#x60;type&#x60; property is &#x60;variableUpdate&#x60;.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An error message in case a Java Serialized Object could not be de-serialized.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDetailDto historicDetailDto = (HistoricDetailDto) o;
    return Objects.equals(this.id, historicDetailDto.id) &&
        Objects.equals(this.type, historicDetailDto.type) &&
        Objects.equals(this.processDefinitionKey, historicDetailDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicDetailDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicDetailDto.processInstanceId) &&
        Objects.equals(this.activityInstanceId, historicDetailDto.activityInstanceId) &&
        Objects.equals(this.executionId, historicDetailDto.executionId) &&
        Objects.equals(this.caseDefinitionKey, historicDetailDto.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionId, historicDetailDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, historicDetailDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicDetailDto.caseExecutionId) &&
        Objects.equals(this.taskId, historicDetailDto.taskId) &&
        Objects.equals(this.tenantId, historicDetailDto.tenantId) &&
        Objects.equals(this.userOperationId, historicDetailDto.userOperationId) &&
        Objects.equals(this.time, historicDetailDto.time) &&
        Objects.equals(this.removalTime, historicDetailDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicDetailDto.rootProcessInstanceId) &&
        Objects.equals(this.fieldId, historicDetailDto.fieldId) &&
        Objects.equals(this.fieldValue, historicDetailDto.fieldValue) &&
        Objects.equals(this.variableName, historicDetailDto.variableName) &&
        Objects.equals(this.variableInstanceId, historicDetailDto.variableInstanceId) &&
        Objects.equals(this.variableType, historicDetailDto.variableType) &&
        Objects.equals(this.value, historicDetailDto.value) &&
        Objects.equals(this.valueInfo, historicDetailDto.valueInfo) &&
        Objects.equals(this.initial, historicDetailDto.initial) &&
        Objects.equals(this.revision, historicDetailDto.revision) &&
        Objects.equals(this.errorMessage, historicDetailDto.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, processDefinitionKey, processDefinitionId, processInstanceId, activityInstanceId, executionId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, tenantId, userOperationId, time, removalTime, rootProcessInstanceId, fieldId, fieldValue, variableName, variableInstanceId, variableType, value, valueInfo, initial, revision, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDetailDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userOperationId: ").append(toIndentedString(userOperationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableInstanceId: ").append(toIndentedString(variableInstanceId)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

