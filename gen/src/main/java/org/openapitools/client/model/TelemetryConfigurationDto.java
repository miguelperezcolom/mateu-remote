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
 * TelemetryConfigurationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class TelemetryConfigurationDto {
  public static final String SERIALIZED_NAME_ENABLE_TELEMETRY = "enableTelemetry";
  @SerializedName(SERIALIZED_NAME_ENABLE_TELEMETRY)
  private Boolean enableTelemetry;


  public TelemetryConfigurationDto enableTelemetry(Boolean enableTelemetry) {
    
    this.enableTelemetry = enableTelemetry;
    return this;
  }

   /**
   * Specifies if the telemetry data should be sent or not.
   * @return enableTelemetry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the telemetry data should be sent or not.")

  public Boolean getEnableTelemetry() {
    return enableTelemetry;
  }


  public void setEnableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = enableTelemetry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryConfigurationDto telemetryConfigurationDto = (TelemetryConfigurationDto) o;
    return Objects.equals(this.enableTelemetry, telemetryConfigurationDto.enableTelemetry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTelemetry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryConfigurationDto {\n");
    sb.append("    enableTelemetry: ").append(toIndentedString(enableTelemetry)).append("\n");
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

