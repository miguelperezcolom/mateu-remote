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
 * IncidentStatisticsResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class IncidentStatisticsResultDto {
  public static final String SERIALIZED_NAME_INCIDENT_TYPE = "incidentType";
  @SerializedName(SERIALIZED_NAME_INCIDENT_TYPE)
  private String incidentType;

  public static final String SERIALIZED_NAME_INCIDENT_COUNT = "incidentCount";
  @SerializedName(SERIALIZED_NAME_INCIDENT_COUNT)
  private Integer incidentCount;


  public IncidentStatisticsResultDto incidentType(String incidentType) {
    
    this.incidentType = incidentType;
    return this;
  }

   /**
   * The type of the incident the number of incidents is aggregated for. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the incident the number of incidents is aggregated for. See the [User Guide](https://docs.camunda.org/manual/7.18/user-guide/process-engine/incidents/#incident-types) for a list of incident types.")

  public String getIncidentType() {
    return incidentType;
  }


  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }


  public IncidentStatisticsResultDto incidentCount(Integer incidentCount) {
    
    this.incidentCount = incidentCount;
    return this;
  }

   /**
   * The total number of incidents for the corresponding incident type.
   * @return incidentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of incidents for the corresponding incident type.")

  public Integer getIncidentCount() {
    return incidentCount;
  }


  public void setIncidentCount(Integer incidentCount) {
    this.incidentCount = incidentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatisticsResultDto incidentStatisticsResultDto = (IncidentStatisticsResultDto) o;
    return Objects.equals(this.incidentType, incidentStatisticsResultDto.incidentType) &&
        Objects.equals(this.incidentCount, incidentStatisticsResultDto.incidentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentType, incidentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatisticsResultDto {\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentCount: ").append(toIndentedString(incidentCount)).append("\n");
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

