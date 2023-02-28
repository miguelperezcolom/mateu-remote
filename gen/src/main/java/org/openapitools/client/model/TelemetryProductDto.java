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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.TelemetryInternalsDto;

/**
 * TelemetryProductDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class TelemetryProductDto {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_EDITION = "edition";
  @SerializedName(SERIALIZED_NAME_EDITION)
  private String edition;

  public static final String SERIALIZED_NAME_INTERNALS = "internals";
  @SerializedName(SERIALIZED_NAME_INTERNALS)
  private Map<String, TelemetryInternalsDto> internals = null;


  public TelemetryProductDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product (i.e., Camunda BPM Runtime).
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the product (i.e., Camunda BPM Runtime).")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TelemetryProductDto version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the process engine (i.e., 7.X.Y).
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the process engine (i.e., 7.X.Y).")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public TelemetryProductDto edition(String edition) {
    
    this.edition = edition;
    return this;
  }

   /**
   * The edition of the product (i.e., either community or enterprise).
   * @return edition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The edition of the product (i.e., either community or enterprise).")

  public String getEdition() {
    return edition;
  }


  public void setEdition(String edition) {
    this.edition = edition;
  }


  public TelemetryProductDto internals(Map<String, TelemetryInternalsDto> internals) {
    
    this.internals = internals;
    return this;
  }

  public TelemetryProductDto putInternalsItem(String key, TelemetryInternalsDto internalsItem) {
    if (this.internals == null) {
      this.internals = new HashMap<String, TelemetryInternalsDto>();
    }
    this.internals.put(key, internalsItem);
    return this;
  }

   /**
   * Internal data and metrics collected by the product.
   * @return internals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal data and metrics collected by the product.")

  public Map<String, TelemetryInternalsDto> getInternals() {
    return internals;
  }


  public void setInternals(Map<String, TelemetryInternalsDto> internals) {
    this.internals = internals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryProductDto telemetryProductDto = (TelemetryProductDto) o;
    return Objects.equals(this.name, telemetryProductDto.name) &&
        Objects.equals(this.version, telemetryProductDto.version) &&
        Objects.equals(this.edition, telemetryProductDto.edition) &&
        Objects.equals(this.internals, telemetryProductDto.internals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, edition, internals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryProductDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    internals: ").append(toIndentedString(internals)).append("\n");
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

