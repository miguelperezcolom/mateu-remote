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
 * CalledProcessDefinitionDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CalledProcessDefinitionDtoAllOf {
  public static final String SERIALIZED_NAME_CALLED_FROM_ACTIVITY_IDS = "calledFromActivityIds";
  @SerializedName(SERIALIZED_NAME_CALLED_FROM_ACTIVITY_IDS)
  private List<String> calledFromActivityIds = null;

  public static final String SERIALIZED_NAME_CALLING_PROCESS_DEFINITION_ID = "callingProcessDefinitionId";
  @SerializedName(SERIALIZED_NAME_CALLING_PROCESS_DEFINITION_ID)
  private String callingProcessDefinitionId;


  public CalledProcessDefinitionDtoAllOf calledFromActivityIds(List<String> calledFromActivityIds) {
    
    this.calledFromActivityIds = calledFromActivityIds;
    return this;
  }

  public CalledProcessDefinitionDtoAllOf addCalledFromActivityIdsItem(String calledFromActivityIdsItem) {
    if (this.calledFromActivityIds == null) {
      this.calledFromActivityIds = new ArrayList<String>();
    }
    this.calledFromActivityIds.add(calledFromActivityIdsItem);
    return this;
  }

   /**
   * Ids of the CallActivities which call this process.
   * @return calledFromActivityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ids of the CallActivities which call this process.")

  public List<String> getCalledFromActivityIds() {
    return calledFromActivityIds;
  }


  public void setCalledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = calledFromActivityIds;
  }


  public CalledProcessDefinitionDtoAllOf callingProcessDefinitionId(String callingProcessDefinitionId) {
    
    this.callingProcessDefinitionId = callingProcessDefinitionId;
    return this;
  }

   /**
   * The id of the calling process definition
   * @return callingProcessDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the calling process definition")

  public String getCallingProcessDefinitionId() {
    return callingProcessDefinitionId;
  }


  public void setCallingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = callingProcessDefinitionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalledProcessDefinitionDtoAllOf calledProcessDefinitionDtoAllOf = (CalledProcessDefinitionDtoAllOf) o;
    return Objects.equals(this.calledFromActivityIds, calledProcessDefinitionDtoAllOf.calledFromActivityIds) &&
        Objects.equals(this.callingProcessDefinitionId, calledProcessDefinitionDtoAllOf.callingProcessDefinitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calledFromActivityIds, callingProcessDefinitionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalledProcessDefinitionDtoAllOf {\n");
    sb.append("    calledFromActivityIds: ").append(toIndentedString(calledFromActivityIds)).append("\n");
    sb.append("    callingProcessDefinitionId: ").append(toIndentedString(callingProcessDefinitionId)).append("\n");
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

