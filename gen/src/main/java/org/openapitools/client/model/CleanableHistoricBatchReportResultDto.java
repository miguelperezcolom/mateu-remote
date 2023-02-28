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
 * CleanableHistoricBatchReportResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CleanableHistoricBatchReportResultDto {
  public static final String SERIALIZED_NAME_BATCH_TYPE = "batchType";
  @SerializedName(SERIALIZED_NAME_BATCH_TYPE)
  private String batchType;

  public static final String SERIALIZED_NAME_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  @SerializedName(SERIALIZED_NAME_HISTORY_TIME_TO_LIVE)
  private Integer historyTimeToLive;

  public static final String SERIALIZED_NAME_FINISHED_BATCHES_COUNT = "finishedBatchesCount";
  @SerializedName(SERIALIZED_NAME_FINISHED_BATCHES_COUNT)
  private Long finishedBatchesCount;

  public static final String SERIALIZED_NAME_CLEANABLE_BATCHES_COUNT = "cleanableBatchesCount";
  @SerializedName(SERIALIZED_NAME_CLEANABLE_BATCHES_COUNT)
  private Long cleanableBatchesCount;


  public CleanableHistoricBatchReportResultDto batchType(String batchType) {
    
    this.batchType = batchType;
    return this;
  }

   /**
   * The type of the batch operation.
   * @return batchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the batch operation.")

  public String getBatchType() {
    return batchType;
  }


  public void setBatchType(String batchType) {
    this.batchType = batchType;
  }


  public CleanableHistoricBatchReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

   /**
   * The history time to live of the batch operation.
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The history time to live of the batch operation.")

  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }


  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }


  public CleanableHistoricBatchReportResultDto finishedBatchesCount(Long finishedBatchesCount) {
    
    this.finishedBatchesCount = finishedBatchesCount;
    return this;
  }

   /**
   * The count of the finished batch operations.
   * @return finishedBatchesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the finished batch operations.")

  public Long getFinishedBatchesCount() {
    return finishedBatchesCount;
  }


  public void setFinishedBatchesCount(Long finishedBatchesCount) {
    this.finishedBatchesCount = finishedBatchesCount;
  }


  public CleanableHistoricBatchReportResultDto cleanableBatchesCount(Long cleanableBatchesCount) {
    
    this.cleanableBatchesCount = cleanableBatchesCount;
    return this;
  }

   /**
   * The count of the cleanable historic batch operations, referring to history time to live.
   * @return cleanableBatchesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of the cleanable historic batch operations, referring to history time to live.")

  public Long getCleanableBatchesCount() {
    return cleanableBatchesCount;
  }


  public void setCleanableBatchesCount(Long cleanableBatchesCount) {
    this.cleanableBatchesCount = cleanableBatchesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanableHistoricBatchReportResultDto cleanableHistoricBatchReportResultDto = (CleanableHistoricBatchReportResultDto) o;
    return Objects.equals(this.batchType, cleanableHistoricBatchReportResultDto.batchType) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricBatchReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedBatchesCount, cleanableHistoricBatchReportResultDto.finishedBatchesCount) &&
        Objects.equals(this.cleanableBatchesCount, cleanableHistoricBatchReportResultDto.cleanableBatchesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchType, historyTimeToLive, finishedBatchesCount, cleanableBatchesCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricBatchReportResultDto {\n");
    sb.append("    batchType: ").append(toIndentedString(batchType)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedBatchesCount: ").append(toIndentedString(finishedBatchesCount)).append("\n");
    sb.append("    cleanableBatchesCount: ").append(toIndentedString(cleanableBatchesCount)).append("\n");
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
