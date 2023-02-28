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

/**
 * CleanableHistoricProcessInstanceReportResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CleanableHistoricProcessInstanceReportResultDto {
  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_NAME = "processDefinitionName";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_NAME)
  private String processDefinitionName;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_VERSION = "processDefinitionVersion";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_VERSION)
  private Integer processDefinitionVersion;

  public static final String SERIALIZED_NAME_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  @SerializedName(SERIALIZED_NAME_HISTORY_TIME_TO_LIVE)
  private Integer historyTimeToLive;

  public static final String SERIALIZED_NAME_FINISHED_PROCESS_INSTANCE_COUNT = "finishedProcessInstanceCount";
  @SerializedName(SERIALIZED_NAME_FINISHED_PROCESS_INSTANCE_COUNT)
  private Long finishedProcessInstanceCount;

  public static final String SERIALIZED_NAME_CLEANABLE_PROCESS_INSTANCE_COUNT = "cleanableProcessInstanceCount";
  @SerializedName(SERIALIZED_NAME_CLEANABLE_PROCESS_INSTANCE_COUNT)
  private Long cleanableProcessInstanceCount;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;


  public CleanableHistoricProcessInstanceReportResultDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public CleanableHistoricProcessInstanceReportResultDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public CleanableHistoricProcessInstanceReportResultDto processDefinitionName(String processDefinitionName) {
    
    this.processDefinitionName = processDefinitionName;
    return this;
  }

   /**
   * The name of the process definition.
   * @return processDefinitionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the process definition.")

  public String getProcessDefinitionName() {
    return processDefinitionName;
  }


  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }


  public CleanableHistoricProcessInstanceReportResultDto processDefinitionVersion(Integer processDefinitionVersion) {
    
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

   /**
   * The version of the process definition.
   * @return processDefinitionVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the process definition.")

  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }


  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }


  public CleanableHistoricProcessInstanceReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

   /**
   * The history time to live of the process definition.
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The history time to live of the process definition.")

  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }


  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }


  public CleanableHistoricProcessInstanceReportResultDto finishedProcessInstanceCount(Long finishedProcessInstanceCount) {
    
    this.finishedProcessInstanceCount = finishedProcessInstanceCount;
    return this;
  }

   /**
   * The count of the finished historic process instances.
   * @return finishedProcessInstanceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the finished historic process instances.")

  public Long getFinishedProcessInstanceCount() {
    return finishedProcessInstanceCount;
  }


  public void setFinishedProcessInstanceCount(Long finishedProcessInstanceCount) {
    this.finishedProcessInstanceCount = finishedProcessInstanceCount;
  }


  public CleanableHistoricProcessInstanceReportResultDto cleanableProcessInstanceCount(Long cleanableProcessInstanceCount) {
    
    this.cleanableProcessInstanceCount = cleanableProcessInstanceCount;
    return this;
  }

   /**
   * The count of the cleanable historic process instances, referring to history time to live.
   * @return cleanableProcessInstanceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the cleanable historic process instances, referring to history time to live.")

  public Long getCleanableProcessInstanceCount() {
    return cleanableProcessInstanceCount;
  }


  public void setCleanableProcessInstanceCount(Long cleanableProcessInstanceCount) {
    this.cleanableProcessInstanceCount = cleanableProcessInstanceCount;
  }


  public CleanableHistoricProcessInstanceReportResultDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the process definition.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process definition.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanableHistoricProcessInstanceReportResultDto cleanableHistoricProcessInstanceReportResultDto = (CleanableHistoricProcessInstanceReportResultDto) o;
    return Objects.equals(this.processDefinitionId, cleanableHistoricProcessInstanceReportResultDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, cleanableHistoricProcessInstanceReportResultDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, cleanableHistoricProcessInstanceReportResultDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, cleanableHistoricProcessInstanceReportResultDto.processDefinitionVersion) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricProcessInstanceReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedProcessInstanceCount, cleanableHistoricProcessInstanceReportResultDto.finishedProcessInstanceCount) &&
        Objects.equals(this.cleanableProcessInstanceCount, cleanableHistoricProcessInstanceReportResultDto.cleanableProcessInstanceCount) &&
        Objects.equals(this.tenantId, cleanableHistoricProcessInstanceReportResultDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionName, processDefinitionVersion, historyTimeToLive, finishedProcessInstanceCount, cleanableProcessInstanceCount, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricProcessInstanceReportResultDto {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedProcessInstanceCount: ").append(toIndentedString(finishedProcessInstanceCount)).append("\n");
    sb.append("    cleanableProcessInstanceCount: ").append(toIndentedString(cleanableProcessInstanceCount)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
