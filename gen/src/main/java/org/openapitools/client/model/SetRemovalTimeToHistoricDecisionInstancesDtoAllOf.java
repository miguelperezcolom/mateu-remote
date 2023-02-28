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
import org.openapitools.client.model.HistoricDecisionInstanceQueryDto;

/**
 * SetRemovalTimeToHistoricDecisionInstancesDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {
  public static final String SERIALIZED_NAME_HIERARCHICAL = "hierarchical";
  @SerializedName(SERIALIZED_NAME_HIERARCHICAL)
  private Boolean hierarchical;

  public static final String SERIALIZED_NAME_HISTORIC_DECISION_INSTANCE_QUERY = "historicDecisionInstanceQuery";
  @SerializedName(SERIALIZED_NAME_HISTORIC_DECISION_INSTANCE_QUERY)
  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

  public static final String SERIALIZED_NAME_HISTORIC_DECISION_INSTANCE_IDS = "historicDecisionInstanceIds";
  @SerializedName(SERIALIZED_NAME_HISTORIC_DECISION_INSTANCE_IDS)
  private List<String> historicDecisionInstanceIds = null;


  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf hierarchical(Boolean hierarchical) {
    
    this.hierarchical = hierarchical;
    return this;
  }

   /**
   * Sets the removal time to all historic decision instances in the hierarchy. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return hierarchical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the removal time to all historic decision instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.")

  public Boolean getHierarchical() {
    return hierarchical;
  }


  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }


  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
    return this;
  }

   /**
   * Get historicDecisionInstanceQuery
   * @return historicDecisionInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HistoricDecisionInstanceQueryDto getHistoricDecisionInstanceQuery() {
    return historicDecisionInstanceQuery;
  }


  public void setHistoricDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
  }


  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
    if (this.historicDecisionInstanceIds == null) {
      this.historicDecisionInstanceIds = new ArrayList<String>();
    }
    this.historicDecisionInstanceIds.add(historicDecisionInstanceIdsItem);
    return this;
  }

   /**
   * The ids of the historic decision instances to set the removal time for.
   * @return historicDecisionInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the historic decision instances to set the removal time for.")

  public List<String> getHistoricDecisionInstanceIds() {
    return historicDecisionInstanceIds;
  }


  public void setHistoricDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricDecisionInstancesDtoAllOf setRemovalTimeToHistoricDecisionInstancesDtoAllOf = (SetRemovalTimeToHistoricDecisionInstancesDtoAllOf) o;
    return Objects.equals(this.hierarchical, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.hierarchical) &&
        Objects.equals(this.historicDecisionInstanceQuery, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceQuery) &&
        Objects.equals(this.historicDecisionInstanceIds, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchical, historicDecisionInstanceQuery, historicDecisionInstanceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
    sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
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

