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
import org.threeten.bp.OffsetDateTime;

/**
 * HistoricProcessInstanceDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class HistoricProcessInstanceDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  @SerializedName(SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID)
  private String rootProcessInstanceId;

  public static final String SERIALIZED_NAME_SUPER_PROCESS_INSTANCE_ID = "superProcessInstanceId";
  @SerializedName(SERIALIZED_NAME_SUPER_PROCESS_INSTANCE_ID)
  private String superProcessInstanceId;

  public static final String SERIALIZED_NAME_SUPER_CASE_INSTANCE_ID = "superCaseInstanceId";
  @SerializedName(SERIALIZED_NAME_SUPER_CASE_INSTANCE_ID)
  private String superCaseInstanceId;

  public static final String SERIALIZED_NAME_CASE_INSTANCE_ID = "caseInstanceId";
  @SerializedName(SERIALIZED_NAME_CASE_INSTANCE_ID)
  private String caseInstanceId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_NAME = "processDefinitionName";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_NAME)
  private String processDefinitionName;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_VERSION = "processDefinitionVersion";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_VERSION)
  private Integer processDefinitionVersion;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_REMOVAL_TIME = "removalTime";
  @SerializedName(SERIALIZED_NAME_REMOVAL_TIME)
  private OffsetDateTime removalTime;

  public static final String SERIALIZED_NAME_DURATION_IN_MILLIS = "durationInMillis";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MILLIS)
  private Long durationInMillis;

  public static final String SERIALIZED_NAME_START_USER_ID = "startUserId";
  @SerializedName(SERIALIZED_NAME_START_USER_ID)
  private String startUserId;

  public static final String SERIALIZED_NAME_START_ACTIVITY_ID = "startActivityId";
  @SerializedName(SERIALIZED_NAME_START_ACTIVITY_ID)
  private String startActivityId;

  public static final String SERIALIZED_NAME_DELETE_REASON = "deleteReason";
  @SerializedName(SERIALIZED_NAME_DELETE_REASON)
  private String deleteReason;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  /**
   * Last state of the process instance, possible values are:  &#x60;ACTIVE&#x60; - running process instance  &#x60;SUSPENDED&#x60; - suspended process instances  &#x60;COMPLETED&#x60; - completed through normal end event  &#x60;EXTERNALLY_TERMINATED&#x60; - terminated externally, for instance through REST API  &#x60;INTERNALLY_TERMINATED&#x60; - terminated internally, for instance by terminating boundary event
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    COMPLETED("COMPLETED"),
    
    EXTERNALLY_TERMINATED("EXTERNALLY_TERMINATED"),
    
    INTERNALLY_TERMINATED("INTERNALLY_TERMINATED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;


  public HistoricProcessInstanceDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the process instance.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HistoricProcessInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process.")

  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }


  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }


  public HistoricProcessInstanceDto superProcessInstanceId(String superProcessInstanceId) {
    
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

   /**
   * The id of the parent process instance, if it exists.
   * @return superProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent process instance, if it exists.")

  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }


  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }


  public HistoricProcessInstanceDto superCaseInstanceId(String superCaseInstanceId) {
    
    this.superCaseInstanceId = superCaseInstanceId;
    return this;
  }

   /**
   * The id of the parent case instance, if it exists.
   * @return superCaseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent case instance, if it exists.")

  public String getSuperCaseInstanceId() {
    return superCaseInstanceId;
  }


  public void setSuperCaseInstanceId(String superCaseInstanceId) {
    this.superCaseInstanceId = superCaseInstanceId;
  }


  public HistoricProcessInstanceDto caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * The id of the parent case instance, if it exists.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent case instance, if it exists.")

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public HistoricProcessInstanceDto processDefinitionName(String processDefinitionName) {
    
    this.processDefinitionName = processDefinitionName;
    return this;
  }

   /**
   * The name of the process definition that this process instance belongs to.
   * @return processDefinitionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the process definition that this process instance belongs to.")

  public String getProcessDefinitionName() {
    return processDefinitionName;
  }


  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }


  public HistoricProcessInstanceDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition that this process instance belongs to.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition that this process instance belongs to.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public HistoricProcessInstanceDto processDefinitionVersion(Integer processDefinitionVersion) {
    
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

   /**
   * The version of the process definition that this process instance belongs to.
   * @return processDefinitionVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the process definition that this process instance belongs to.")

  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }


  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }


  public HistoricProcessInstanceDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition that this process instance belongs to.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition that this process instance belongs to.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public HistoricProcessInstanceDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public HistoricProcessInstanceDto startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The time the instance was started. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the instance was started. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public HistoricProcessInstanceDto endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The time the instance ended. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the instance ended. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public HistoricProcessInstanceDto removalTime(OffsetDateTime removalTime) {
    
    this.removalTime = removalTime;
    return this;
  }

   /**
   * The time after which the instance should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the instance should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.18/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }


  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }


  public HistoricProcessInstanceDto durationInMillis(Long durationInMillis) {
    
    this.durationInMillis = durationInMillis;
    return this;
  }

   /**
   * The time the instance took to finish (in milliseconds).
   * @return durationInMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the instance took to finish (in milliseconds).")

  public Long getDurationInMillis() {
    return durationInMillis;
  }


  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }


  public HistoricProcessInstanceDto startUserId(String startUserId) {
    
    this.startUserId = startUserId;
    return this;
  }

   /**
   * The id of the user who started the process instance.
   * @return startUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user who started the process instance.")

  public String getStartUserId() {
    return startUserId;
  }


  public void setStartUserId(String startUserId) {
    this.startUserId = startUserId;
  }


  public HistoricProcessInstanceDto startActivityId(String startActivityId) {
    
    this.startActivityId = startActivityId;
    return this;
  }

   /**
   * The id of the initial activity that was executed (e.g., a start event).
   * @return startActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the initial activity that was executed (e.g., a start event).")

  public String getStartActivityId() {
    return startActivityId;
  }


  public void setStartActivityId(String startActivityId) {
    this.startActivityId = startActivityId;
  }


  public HistoricProcessInstanceDto deleteReason(String deleteReason) {
    
    this.deleteReason = deleteReason;
    return this;
  }

   /**
   * The provided delete reason in case the process instance was canceled during execution.
   * @return deleteReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The provided delete reason in case the process instance was canceled during execution.")

  public String getDeleteReason() {
    return deleteReason;
  }


  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }


  public HistoricProcessInstanceDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the process instance.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process instance.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public HistoricProcessInstanceDto state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Last state of the process instance, possible values are:  &#x60;ACTIVE&#x60; - running process instance  &#x60;SUSPENDED&#x60; - suspended process instances  &#x60;COMPLETED&#x60; - completed through normal end event  &#x60;EXTERNALLY_TERMINATED&#x60; - terminated externally, for instance through REST API  &#x60;INTERNALLY_TERMINATED&#x60; - terminated internally, for instance by terminating boundary event
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last state of the process instance, possible values are:  `ACTIVE` - running process instance  `SUSPENDED` - suspended process instances  `COMPLETED` - completed through normal end event  `EXTERNALLY_TERMINATED` - terminated externally, for instance through REST API  `INTERNALLY_TERMINATED` - terminated internally, for instance by terminating boundary event")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricProcessInstanceDto historicProcessInstanceDto = (HistoricProcessInstanceDto) o;
    return Objects.equals(this.id, historicProcessInstanceDto.id) &&
        Objects.equals(this.rootProcessInstanceId, historicProcessInstanceDto.rootProcessInstanceId) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceDto.superProcessInstanceId) &&
        Objects.equals(this.superCaseInstanceId, historicProcessInstanceDto.superCaseInstanceId) &&
        Objects.equals(this.caseInstanceId, historicProcessInstanceDto.caseInstanceId) &&
        Objects.equals(this.processDefinitionName, historicProcessInstanceDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionKey, historicProcessInstanceDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersion, historicProcessInstanceDto.processDefinitionVersion) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceDto.processDefinitionId) &&
        Objects.equals(this.businessKey, historicProcessInstanceDto.businessKey) &&
        Objects.equals(this.startTime, historicProcessInstanceDto.startTime) &&
        Objects.equals(this.endTime, historicProcessInstanceDto.endTime) &&
        Objects.equals(this.removalTime, historicProcessInstanceDto.removalTime) &&
        Objects.equals(this.durationInMillis, historicProcessInstanceDto.durationInMillis) &&
        Objects.equals(this.startUserId, historicProcessInstanceDto.startUserId) &&
        Objects.equals(this.startActivityId, historicProcessInstanceDto.startActivityId) &&
        Objects.equals(this.deleteReason, historicProcessInstanceDto.deleteReason) &&
        Objects.equals(this.tenantId, historicProcessInstanceDto.tenantId) &&
        Objects.equals(this.state, historicProcessInstanceDto.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rootProcessInstanceId, superProcessInstanceId, superCaseInstanceId, caseInstanceId, processDefinitionName, processDefinitionKey, processDefinitionVersion, processDefinitionId, businessKey, startTime, endTime, removalTime, durationInMillis, startUserId, startActivityId, deleteReason, tenantId, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    superCaseInstanceId: ").append(toIndentedString(superCaseInstanceId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    startUserId: ").append(toIndentedString(startUserId)).append("\n");
    sb.append("    startActivityId: ").append(toIndentedString(startActivityId)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
