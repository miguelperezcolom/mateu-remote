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
 * FormDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class FormDto {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CONTEXT_PATH = "contextPath";
  @SerializedName(SERIALIZED_NAME_CONTEXT_PATH)
  private String contextPath;


  public FormDto key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The form key.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The form key.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public FormDto contextPath(String contextPath) {
    
    this.contextPath = contextPath;
    return this;
  }

   /**
   * The context path of the process application. If the task (or the process definition) does not belong to a process application deployment or a process definition at all, this property is not set.
   * @return contextPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The context path of the process application. If the task (or the process definition) does not belong to a process application deployment or a process definition at all, this property is not set.")

  public String getContextPath() {
    return contextPath;
  }


  public void setContextPath(String contextPath) {
    this.contextPath = contextPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDto formDto = (FormDto) o;
    return Objects.equals(this.key, formDto.key) &&
        Objects.equals(this.contextPath, formDto.contextPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, contextPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDto {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
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

