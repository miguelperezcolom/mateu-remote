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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.MigrationVariableValidationReportDtoAllOf;
import org.openapitools.client.model.VariableValueDto;

/**
 * MigrationVariableValidationReportDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class MigrationVariableValidationReportDto {
  public static final String SERIALIZED_NAME_FAILURES = "failures";
  @SerializedName(SERIALIZED_NAME_FAILURES)
  private List<String> failures = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE_INFO = "valueInfo";
  @SerializedName(SERIALIZED_NAME_VALUE_INFO)
  private Map<String, Object> valueInfo = null;


  public MigrationVariableValidationReportDto failures(List<String> failures) {
    
    this.failures = failures;
    return this;
  }

  public MigrationVariableValidationReportDto addFailuresItem(String failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<String>();
    }
    this.failures.add(failuresItem);
    return this;
  }

   /**
   * A list of variable validation report messages.
   * @return failures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of variable validation report messages.")

  public List<String> getFailures() {
    return failures;
  }


  public void setFailures(List<String> failures) {
    this.failures = failures;
  }


  public MigrationVariableValidationReportDto value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Can be any value - string, number, boolean, array or object.  **Note**: Not every endpoint supports every type.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can be any value - string, number, boolean, array or object.  **Note**: Not every endpoint supports every type.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public MigrationVariableValidationReportDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The value type of the variable.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value type of the variable.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MigrationVariableValidationReportDto valueInfo(Map<String, Object> valueInfo) {
    
    this.valueInfo = valueInfo;
    return this;
  }

  public MigrationVariableValidationReportDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<String, Object>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

   /**
   * A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * &#x60;objectTypeName&#x60;: A string representation of the object&#39;s type name. * &#x60;serializationDataFormat&#x60;: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * &#x60;filename&#x60;: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * &#x60;mimetype&#x60;: The MIME type of the file that is being uploaded. * &#x60;encoding&#x60;: The encoding of the file that is being uploaded.  The following property can be provided for all value types:  * &#x60;transient&#x60;: Indicates whether the variable should be transient or not. See [documentation](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables#transient-variables) for more informations. (Not applicable for &#x60;decision-definition&#x60;, &#x60; /process-instance/variables-async&#x60;, and &#x60;/migration/executeAsync&#x60; endpoints)
   * @return valueInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * `filename`: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * `mimetype`: The MIME type of the file that is being uploaded. * `encoding`: The encoding of the file that is being uploaded.  The following property can be provided for all value types:  * `transient`: Indicates whether the variable should be transient or not. See [documentation](https://docs.camunda.org/manual/7.18/user-guide/process-engine/variables#transient-variables) for more informations. (Not applicable for `decision-definition`, ` /process-instance/variables-async`, and `/migration/executeAsync` endpoints)")

  public Map<String, Object> getValueInfo() {
    return valueInfo;
  }


  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationVariableValidationReportDto migrationVariableValidationReportDto = (MigrationVariableValidationReportDto) o;
    return Objects.equals(this.failures, migrationVariableValidationReportDto.failures) &&
        Objects.equals(this.value, migrationVariableValidationReportDto.value) &&
        Objects.equals(this.type, migrationVariableValidationReportDto.type) &&
        Objects.equals(this.valueInfo, migrationVariableValidationReportDto.valueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures, value, type, valueInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationVariableValidationReportDto {\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
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

