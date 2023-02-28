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
import org.openapitools.client.model.ExternalTaskQueryDto;
import org.openapitools.client.model.HistoricProcessInstanceQueryDto;
import org.openapitools.client.model.ProcessInstanceQueryDto;

/**
 * SetRetriesForExternalTasksDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class SetRetriesForExternalTasksDto {
  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  public static final String SERIALIZED_NAME_EXTERNAL_TASK_IDS = "externalTaskIds";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TASK_IDS)
  private List<String> externalTaskIds = null;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_IDS = "processInstanceIds";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_IDS)
  private List<String> processInstanceIds = null;

  public static final String SERIALIZED_NAME_EXTERNAL_TASK_QUERY = "externalTaskQuery";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TASK_QUERY)
  private ExternalTaskQueryDto externalTaskQuery;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_QUERY = "processInstanceQuery";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_QUERY)
  private ProcessInstanceQueryDto processInstanceQuery;

  public static final String SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
  @SerializedName(SERIALIZED_NAME_HISTORIC_PROCESS_INSTANCE_QUERY)
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;


  public SetRetriesForExternalTasksDto retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * The number of retries to set for the external task.  Must be &gt;&#x3D; 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. Can not be null.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of retries to set for the external task.  Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. Can not be null.")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public SetRetriesForExternalTasksDto externalTaskIds(List<String> externalTaskIds) {
    
    this.externalTaskIds = externalTaskIds;
    return this;
  }

  public SetRetriesForExternalTasksDto addExternalTaskIdsItem(String externalTaskIdsItem) {
    if (this.externalTaskIds == null) {
      this.externalTaskIds = new ArrayList<String>();
    }
    this.externalTaskIds.add(externalTaskIdsItem);
    return this;
  }

   /**
   * The ids of the external tasks to set the number of retries for.
   * @return externalTaskIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the external tasks to set the number of retries for.")

  public List<String> getExternalTaskIds() {
    return externalTaskIds;
  }


  public void setExternalTaskIds(List<String> externalTaskIds) {
    this.externalTaskIds = externalTaskIds;
  }


  public SetRetriesForExternalTasksDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public SetRetriesForExternalTasksDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<String>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * The ids of process instances containing the tasks to set the number of retries for.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of process instances containing the tasks to set the number of retries for.")

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public SetRetriesForExternalTasksDto externalTaskQuery(ExternalTaskQueryDto externalTaskQuery) {
    
    this.externalTaskQuery = externalTaskQuery;
    return this;
  }

   /**
   * Get externalTaskQuery
   * @return externalTaskQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalTaskQueryDto getExternalTaskQuery() {
    return externalTaskQuery;
  }


  public void setExternalTaskQuery(ExternalTaskQueryDto externalTaskQuery) {
    this.externalTaskQuery = externalTaskQuery;
  }


  public SetRetriesForExternalTasksDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    
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


  public SetRetriesForExternalTasksDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    
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
    SetRetriesForExternalTasksDto setRetriesForExternalTasksDto = (SetRetriesForExternalTasksDto) o;
    return Objects.equals(this.retries, setRetriesForExternalTasksDto.retries) &&
        Objects.equals(this.externalTaskIds, setRetriesForExternalTasksDto.externalTaskIds) &&
        Objects.equals(this.processInstanceIds, setRetriesForExternalTasksDto.processInstanceIds) &&
        Objects.equals(this.externalTaskQuery, setRetriesForExternalTasksDto.externalTaskQuery) &&
        Objects.equals(this.processInstanceQuery, setRetriesForExternalTasksDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, setRetriesForExternalTasksDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retries, externalTaskIds, processInstanceIds, externalTaskQuery, processInstanceQuery, historicProcessInstanceQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRetriesForExternalTasksDto {\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    externalTaskIds: ").append(toIndentedString(externalTaskIds)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    externalTaskQuery: ").append(toIndentedString(externalTaskQuery)).append("\n");
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
