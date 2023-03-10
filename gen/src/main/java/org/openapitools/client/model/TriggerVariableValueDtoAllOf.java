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
 * TriggerVariableValueDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class TriggerVariableValueDtoAllOf {
  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local;


  public TriggerVariableValueDtoAllOf local(Boolean local) {
    
    this.local = local;
    return this;
  }

   /**
   * Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.
   * @return local
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.")

  public Boolean getLocal() {
    return local;
  }


  public void setLocal(Boolean local) {
    this.local = local;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerVariableValueDtoAllOf triggerVariableValueDtoAllOf = (TriggerVariableValueDtoAllOf) o;
    return Objects.equals(this.local, triggerVariableValueDtoAllOf.local);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerVariableValueDtoAllOf {\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
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

