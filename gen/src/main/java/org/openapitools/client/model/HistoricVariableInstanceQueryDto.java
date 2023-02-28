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
import org.openapitools.client.model.HistoricVariableInstanceQueryDtoSorting;

/**
 * A Historic Variable Instance instance query which defines a list of Historic Variable Instance instances
 */
@ApiModel(description = "A Historic Variable Instance instance query which defines a list of Historic Variable Instance instances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class HistoricVariableInstanceQueryDto {
  public static final String SERIALIZED_NAME_VARIABLE_NAME = "variableName";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME)
  private String variableName;

  public static final String SERIALIZED_NAME_VARIABLE_NAME_LIKE = "variableNameLike";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME_LIKE)
  private String variableNameLike;

  public static final String SERIALIZED_NAME_VARIABLE_VALUE = "variableValue";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUE)
  private Object variableValue;

  public static final String SERIALIZED_NAME_VARIABLE_NAMES_IGNORE_CASE = "variableNamesIgnoreCase";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAMES_IGNORE_CASE)
  private Boolean variableNamesIgnoreCase;

  public static final String SERIALIZED_NAME_VARIABLE_VALUES_IGNORE_CASE = "variableValuesIgnoreCase";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES_IGNORE_CASE)
  private Boolean variableValuesIgnoreCase;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE_IN = "variableTypeIn";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE_IN)
  private List<String> variableTypeIn = null;

  public static final String SERIALIZED_NAME_INCLUDE_DELETED = "includeDeleted";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DELETED)
  private Boolean includeDeleted;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID_IN = "processInstanceIdIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID_IN)
  private List<String> processInstanceIdIn = null;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_EXECUTION_ID_IN = "executionIdIn";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID_IN)
  private List<String> executionIdIn = null;

  public static final String SERIALIZED_NAME_CASE_INSTANCE_ID = "caseInstanceId";
  @SerializedName(SERIALIZED_NAME_CASE_INSTANCE_ID)
  private String caseInstanceId;

  public static final String SERIALIZED_NAME_CASE_EXECUTION_ID_IN = "caseExecutionIdIn";
  @SerializedName(SERIALIZED_NAME_CASE_EXECUTION_ID_IN)
  private List<String> caseExecutionIdIn = null;

  public static final String SERIALIZED_NAME_CASE_ACTIVITY_ID_IN = "caseActivityIdIn";
  @SerializedName(SERIALIZED_NAME_CASE_ACTIVITY_ID_IN)
  private List<String> caseActivityIdIn = null;

  public static final String SERIALIZED_NAME_TASK_ID_IN = "taskIdIn";
  @SerializedName(SERIALIZED_NAME_TASK_ID_IN)
  private List<String> taskIdIn = null;

  public static final String SERIALIZED_NAME_ACTIVITY_INSTANCE_ID_IN = "activityInstanceIdIn";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INSTANCE_ID_IN)
  private List<String> activityInstanceIdIn = null;

  public static final String SERIALIZED_NAME_TENANT_ID_IN = "tenantIdIn";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_IN)
  private List<String> tenantIdIn = null;

  public static final String SERIALIZED_NAME_WITHOUT_TENANT_ID = "withoutTenantId";
  @SerializedName(SERIALIZED_NAME_WITHOUT_TENANT_ID)
  private Boolean withoutTenantId;

  public static final String SERIALIZED_NAME_VARIABLE_NAME_IN = "variableNameIn";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAME_IN)
  private List<String> variableNameIn = null;

  public static final String SERIALIZED_NAME_SORTING = "sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private List<HistoricVariableInstanceQueryDtoSorting> sorting = null;


  public HistoricVariableInstanceQueryDto variableName(String variableName) {
    
    this.variableName = variableName;
    return this;
  }

   /**
   * Filter by variable name.
   * @return variableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by variable name.")

  public String getVariableName() {
    return variableName;
  }


  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }


  public HistoricVariableInstanceQueryDto variableNameLike(String variableNameLike) {
    
    this.variableNameLike = variableNameLike;
    return this;
  }

   /**
   * Restrict to variables with a name like the parameter.
   * @return variableNameLike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict to variables with a name like the parameter.")

  public String getVariableNameLike() {
    return variableNameLike;
  }


  public void setVariableNameLike(String variableNameLike) {
    this.variableNameLike = variableNameLike;
  }


  public HistoricVariableInstanceQueryDto variableValue(Object variableValue) {
    
    this.variableValue = variableValue;
    return this;
  }

   /**
   * Filter by variable value. May be &#x60;String&#x60;, &#x60;Number&#x60; or &#x60;Boolean&#x60;.
   * @return variableValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by variable value. May be `String`, `Number` or `Boolean`.")

  public Object getVariableValue() {
    return variableValue;
  }


  public void setVariableValue(Object variableValue) {
    this.variableValue = variableValue;
  }


  public HistoricVariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

   /**
   * Match the variable name provided in &#x60;variableName&#x60; and &#x60;variableNameLike&#x60; case- insensitively. If set to &#x60;true&#x60; **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match the variable name provided in `variableName` and `variableNameLike` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.")

  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }


  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }


  public HistoricVariableInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

   /**
   * Match the variable value provided in &#x60;variableValue&#x60; case-insensitively. If set to &#x60;true&#x60; **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match the variable value provided in `variableValue` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.")

  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }


  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }


  public HistoricVariableInstanceQueryDto variableTypeIn(List<String> variableTypeIn) {
    
    this.variableTypeIn = variableTypeIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addVariableTypeInItem(String variableTypeInItem) {
    if (this.variableTypeIn == null) {
      this.variableTypeIn = new ArrayList<String>();
    }
    this.variableTypeIn.add(variableTypeInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and comma- separated variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type &#39;serializable&#39;.
   * @return variableTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and comma- separated variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type 'serializable'.")

  public List<String> getVariableTypeIn() {
    return variableTypeIn;
  }


  public void setVariableTypeIn(List<String> variableTypeIn) {
    this.variableTypeIn = variableTypeIn;
  }


  public HistoricVariableInstanceQueryDto includeDeleted(Boolean includeDeleted) {
    
    this.includeDeleted = includeDeleted;
    return this;
  }

   /**
   * Include variables that has already been deleted during the execution.
   * @return includeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include variables that has already been deleted during the execution.")

  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }


  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }


  public HistoricVariableInstanceQueryDto processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Filter by the process instance the variable belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the process instance the variable belongs to.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public HistoricVariableInstanceQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<String>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed  process instance ids.
   * @return processInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed  process instance ids.")

  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }


  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }


  public HistoricVariableInstanceQueryDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Filter by the process definition the variable belongs to.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the process definition the variable belongs to.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public HistoricVariableInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Filter by a key of the process definition the variable belongs to.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a key of the process definition the variable belongs to.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public HistoricVariableInstanceQueryDto executionIdIn(List<String> executionIdIn) {
    
    this.executionIdIn = executionIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<String>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and  execution ids.
   * @return executionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and  execution ids.")

  public List<String> getExecutionIdIn() {
    return executionIdIn;
  }


  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }


  public HistoricVariableInstanceQueryDto caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * Filter by the case instance the variable belongs to.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the case instance the variable belongs to.")

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public HistoricVariableInstanceQueryDto caseExecutionIdIn(List<String> caseExecutionIdIn) {
    
    this.caseExecutionIdIn = caseExecutionIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addCaseExecutionIdInItem(String caseExecutionIdInItem) {
    if (this.caseExecutionIdIn == null) {
      this.caseExecutionIdIn = new ArrayList<String>();
    }
    this.caseExecutionIdIn.add(caseExecutionIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and  case execution ids.
   * @return caseExecutionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and  case execution ids.")

  public List<String> getCaseExecutionIdIn() {
    return caseExecutionIdIn;
  }


  public void setCaseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
  }


  public HistoricVariableInstanceQueryDto caseActivityIdIn(List<String> caseActivityIdIn) {
    
    this.caseActivityIdIn = caseActivityIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addCaseActivityIdInItem(String caseActivityIdInItem) {
    if (this.caseActivityIdIn == null) {
      this.caseActivityIdIn = new ArrayList<String>();
    }
    this.caseActivityIdIn.add(caseActivityIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and  case activity ids.
   * @return caseActivityIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and  case activity ids.")

  public List<String> getCaseActivityIdIn() {
    return caseActivityIdIn;
  }


  public void setCaseActivityIdIn(List<String> caseActivityIdIn) {
    this.caseActivityIdIn = caseActivityIdIn;
  }


  public HistoricVariableInstanceQueryDto taskIdIn(List<String> taskIdIn) {
    
    this.taskIdIn = taskIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addTaskIdInItem(String taskIdInItem) {
    if (this.taskIdIn == null) {
      this.taskIdIn = new ArrayList<String>();
    }
    this.taskIdIn.add(taskIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and  task ids.
   * @return taskIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and  task ids.")

  public List<String> getTaskIdIn() {
    return taskIdIn;
  }


  public void setTaskIdIn(List<String> taskIdIn) {
    this.taskIdIn = taskIdIn;
  }


  public HistoricVariableInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<String>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and  activity instance ids.
   * @return activityInstanceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and  activity instance ids.")

  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }


  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }


  public HistoricVariableInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<String>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed and comma- separated tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed and comma- separated tenant ids.")

  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }


  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }


  public HistoricVariableInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    
    this.withoutTenantId = withoutTenantId;
    return this;
  }

   /**
   * Only include historic variable instances that belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }


  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  public HistoricVariableInstanceQueryDto variableNameIn(List<String> variableNameIn) {
    
    this.variableNameIn = variableNameIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addVariableNameInItem(String variableNameInItem) {
    if (this.variableNameIn == null) {
      this.variableNameIn = new ArrayList<String>();
    }
    this.variableNameIn.add(variableNameInItem);
    return this;
  }

   /**
   * Only include historic variable instances which belong to one of the passed  variable names.
   * @return variableNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include historic variable instances which belong to one of the passed  variable names.")

  public List<String> getVariableNameIn() {
    return variableNameIn;
  }


  public void setVariableNameIn(List<String> variableNameIn) {
    this.variableNameIn = variableNameIn;
  }


  public HistoricVariableInstanceQueryDto sorting(List<HistoricVariableInstanceQueryDtoSorting> sorting) {
    
    this.sorting = sorting;
    return this;
  }

  public HistoricVariableInstanceQueryDto addSortingItem(HistoricVariableInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<HistoricVariableInstanceQueryDtoSorting>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * An array of criteria to sort the result by. Each element of the array is                      an object that specifies one ordering. The position in the array                      identifies the rank of an ordering, i.e., whether it is primary, secondary,                      etc. Sorting has no effect for &#x60;count&#x60; endpoints
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of criteria to sort the result by. Each element of the array is                      an object that specifies one ordering. The position in the array                      identifies the rank of an ordering, i.e., whether it is primary, secondary,                      etc. Sorting has no effect for `count` endpoints")

  public List<HistoricVariableInstanceQueryDtoSorting> getSorting() {
    return sorting;
  }


  public void setSorting(List<HistoricVariableInstanceQueryDtoSorting> sorting) {
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
    HistoricVariableInstanceQueryDto historicVariableInstanceQueryDto = (HistoricVariableInstanceQueryDto) o;
    return Objects.equals(this.variableName, historicVariableInstanceQueryDto.variableName) &&
        Objects.equals(this.variableNameLike, historicVariableInstanceQueryDto.variableNameLike) &&
        Objects.equals(this.variableValue, historicVariableInstanceQueryDto.variableValue) &&
        Objects.equals(this.variableNamesIgnoreCase, historicVariableInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, historicVariableInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.variableTypeIn, historicVariableInstanceQueryDto.variableTypeIn) &&
        Objects.equals(this.includeDeleted, historicVariableInstanceQueryDto.includeDeleted) &&
        Objects.equals(this.processInstanceId, historicVariableInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, historicVariableInstanceQueryDto.processInstanceIdIn) &&
        Objects.equals(this.processDefinitionId, historicVariableInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicVariableInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.executionIdIn, historicVariableInstanceQueryDto.executionIdIn) &&
        Objects.equals(this.caseInstanceId, historicVariableInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionIdIn, historicVariableInstanceQueryDto.caseExecutionIdIn) &&
        Objects.equals(this.caseActivityIdIn, historicVariableInstanceQueryDto.caseActivityIdIn) &&
        Objects.equals(this.taskIdIn, historicVariableInstanceQueryDto.taskIdIn) &&
        Objects.equals(this.activityInstanceIdIn, historicVariableInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, historicVariableInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicVariableInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.variableNameIn, historicVariableInstanceQueryDto.variableNameIn) &&
        Objects.equals(this.sorting, historicVariableInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableNameLike, variableValue, variableNamesIgnoreCase, variableValuesIgnoreCase, variableTypeIn, includeDeleted, processInstanceId, processInstanceIdIn, processDefinitionId, processDefinitionKey, executionIdIn, caseInstanceId, caseExecutionIdIn, caseActivityIdIn, taskIdIn, activityInstanceIdIn, tenantIdIn, withoutTenantId, variableNameIn, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricVariableInstanceQueryDto {\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
    sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    variableTypeIn: ").append(toIndentedString(variableTypeIn)).append("\n");
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionIdIn: ").append(toIndentedString(caseExecutionIdIn)).append("\n");
    sb.append("    caseActivityIdIn: ").append(toIndentedString(caseActivityIdIn)).append("\n");
    sb.append("    taskIdIn: ").append(toIndentedString(taskIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    variableNameIn: ").append(toIndentedString(variableNameIn)).append("\n");
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

