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
 * TaskEscalationDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class TaskEscalationDto {
  public static final String SERIALIZED_NAME_ESCALATION_CODE = "escalationCode";
  @SerializedName(SERIALIZED_NAME_ESCALATION_CODE)
  private String escalationCode;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, VariableValueDto> variables = null;


  public TaskEscalationDto escalationCode(String escalationCode) {
    
    this.escalationCode = escalationCode;
    return this;
  }

   /**
   * An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.
   * @return escalationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.")

  public String getEscalationCode() {
    return escalationCode;
  }


  public void setEscalationCode(String escalationCode) {
    this.escalationCode = escalationCode;
  }


  public TaskEscalationDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public TaskEscalationDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs.")

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskEscalationDto taskEscalationDto = (TaskEscalationDto) o;
    return Objects.equals(this.escalationCode, taskEscalationDto.escalationCode) &&
        Objects.equals(this.variables, taskEscalationDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalationCode, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskEscalationDto {\n");
    sb.append("    escalationCode: ").append(toIndentedString(escalationCode)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

