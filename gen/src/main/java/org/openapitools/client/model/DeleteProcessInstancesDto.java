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
import org.openapitools.client.model.HistoricProcessInstanceQueryDto;
import org.openapitools.client.model.ProcessInstanceQueryDto;

/**
 * DeleteProcessInstancesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class DeleteProcessInstancesDto {
  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_IDS = "processInstanceIds";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_IDS)
  private List<String> processInstanceIds = null;

  public static final String SERIALIZED_NAME_DELETE_REASON = "deleteReason";
  @SerializedName(SERIALIZED_NAME_DELETE_REASON)
  private String deleteReason;

  public static final String SERIALIZED_NAME_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
  @SerializedName(SERIALIZED_NAME_SKIP_CUSTOM_LISTENERS)
  private Boolean skipCustomListeners;

  public static final String SERIALIZED_NAME_SKIP_SUBPROCESSES = "skipSubprocesses";
  @SerializedName(SERIALIZED_NAME_SKIP_SUBPROCESSES)
  private Boolean skipSubprocesses;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_QUERY)
  private ProcessInstanceQueryDto processInstanceQuery;

  public static final String SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
  @SerializedName(SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY)
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;


  public DeleteProcessInstancesDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public DeleteProcessInstancesDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<String>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * A list process instance ids to delete.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list process instance ids to delete.")

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public DeleteProcessInstancesDto deleteReason(String deleteReason) {
    
    this.deleteReason = deleteReason;
    return this;
  }

   /**
   * A string with delete reason.
   * @return deleteReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string with delete reason.")

  public String getDeleteReason() {
    return deleteReason;
  }


  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }


  public DeleteProcessInstancesDto skipCustomListeners(Boolean skipCustomListeners) {
    
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

   /**
   * Skip execution listener invocation for activities that are started or ended as part of this request.
   * @return skipCustomListeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution listener invocation for activities that are started or ended as part of this request.")

  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }


  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }


  public DeleteProcessInstancesDto skipSubprocesses(Boolean skipSubprocesses) {
    
    this.skipSubprocesses = skipSubprocesses;
    return this;
  }

   /**
   * Skip deletion of the subprocesses related to deleted processes as part of this request.
   * @return skipSubprocesses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip deletion of the subprocesses related to deleted processes as part of this request.")

  public Boolean getSkipSubprocesses() {
    return skipSubprocesses;
  }


  public void setSkipSubprocesses(Boolean skipSubprocesses) {
    this.skipSubprocesses = skipSubprocesses;
  }


  public DeleteProcessInstancesDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

   /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }


  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }


  public DeleteProcessInstancesDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    return this;
  }

   /**
   * Get historicProcessInstanceQuery
   * @return historicProcessInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
    return historicProcessInstanceQuery;
  }


  public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteProcessInstancesDto deleteProcessInstancesDto = (DeleteProcessInstancesDto) o;
    return Objects.equals(this.processInstanceIds, deleteProcessInstancesDto.processInstanceIds) &&
        Objects.equals(this.deleteReason, deleteProcessInstancesDto.deleteReason) &&
        Objects.equals(this.skipCustomListeners, deleteProcessInstancesDto.skipCustomListeners) &&
        Objects.equals(this.skipSubprocesses, deleteProcessInstancesDto.skipSubprocesses) &&
        Objects.equals(this.processInstanceQuery, deleteProcessInstancesDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, deleteProcessInstancesDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceIds, deleteReason, skipCustomListeners, skipSubprocesses, processInstanceQuery, historicProcessInstanceQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteProcessInstancesDto {\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipSubprocesses: ").append(toIndentedString(skipSubprocesses)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
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

