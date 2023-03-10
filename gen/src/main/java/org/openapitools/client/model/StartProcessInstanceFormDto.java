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
import org.openapitools.client.model.VariableValueDto;

/**
 * StartProcessInstanceFormDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class StartProcessInstanceFormDto {
  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, VariableValueDto> variables = null;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;


  public StartProcessInstanceFormDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public StartProcessInstanceFormDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  public StartProcessInstanceFormDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key the process instance is to be initialized with. The business key uniquely identifies the process instance in the context of the given process definition.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key the process instance is to be initialized with. The business key uniquely identifies the process instance in the context of the given process definition.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartProcessInstanceFormDto startProcessInstanceFormDto = (StartProcessInstanceFormDto) o;
    return Objects.equals(this.variables, startProcessInstanceFormDto.variables) &&
        Objects.equals(this.businessKey, startProcessInstanceFormDto.businessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, businessKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartProcessInstanceFormDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
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

