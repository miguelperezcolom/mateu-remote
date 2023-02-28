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

/**
 * SetRemovalTimeToHistoricBatchesDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class SetRemovalTimeToHistoricBatchesDtoAllOf {
  public static final String SERIALIZED_NAME_HISTORIC_BATCH_QUERY = "historicBatchQuery";
  @SerializedName(SERIALIZED_NAME_HISTORIC_BATCH_QUERY)
  private Object historicBatchQuery;

  public static final String SERIALIZED_NAME_HISTORIC_BATCH_IDS = "historicBatchIds";
  @SerializedName(SERIALIZED_NAME_HISTORIC_BATCH_IDS)
  private List<String> historicBatchIds = null;


  public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchQuery(Object historicBatchQuery) {
    
    this.historicBatchQuery = historicBatchQuery;
    return this;
  }

   /**
   * Query for the historic batches to set the removal time for.
   * @return historicBatchQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query for the historic batches to set the removal time for.")

  public Object getHistoricBatchQuery() {
    return historicBatchQuery;
  }


  public void setHistoricBatchQuery(Object historicBatchQuery) {
    this.historicBatchQuery = historicBatchQuery;
  }


  public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchIds(List<String> historicBatchIds) {
    
    this.historicBatchIds = historicBatchIds;
    return this;
  }

  public SetRemovalTimeToHistoricBatchesDtoAllOf addHistoricBatchIdsItem(String historicBatchIdsItem) {
    if (this.historicBatchIds == null) {
      this.historicBatchIds = new ArrayList<String>();
    }
    this.historicBatchIds.add(historicBatchIdsItem);
    return this;
  }

   /**
   * The ids of the historic batches to set the removal time for.
   * @return historicBatchIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the historic batches to set the removal time for.")

  public List<String> getHistoricBatchIds() {
    return historicBatchIds;
  }


  public void setHistoricBatchIds(List<String> historicBatchIds) {
    this.historicBatchIds = historicBatchIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricBatchesDtoAllOf setRemovalTimeToHistoricBatchesDtoAllOf = (SetRemovalTimeToHistoricBatchesDtoAllOf) o;
    return Objects.equals(this.historicBatchQuery, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchQuery) &&
        Objects.equals(this.historicBatchIds, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicBatchQuery, historicBatchIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricBatchesDtoAllOf {\n");
    sb.append("    historicBatchQuery: ").append(toIndentedString(historicBatchQuery)).append("\n");
    sb.append("    historicBatchIds: ").append(toIndentedString(historicBatchIds)).append("\n");
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
