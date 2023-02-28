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
import org.threeten.bp.OffsetDateTime;

/**
 * JobConditionQueryParameterDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class JobConditionQueryParameterDto {
  /**
   * Comparison operator to be used.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    GT("gt"),
    
    LT("lt");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private OffsetDateTime value;


  public JobConditionQueryParameterDto operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Comparison operator to be used.
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comparison operator to be used.")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public JobConditionQueryParameterDto value(OffsetDateTime value) {
    
    this.value = value;
    return this;
  }

   /**
   * Date value to compare with.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date value to compare with.")

  public OffsetDateTime getValue() {
    return value;
  }


  public void setValue(OffsetDateTime value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConditionQueryParameterDto jobConditionQueryParameterDto = (JobConditionQueryParameterDto) o;
    return Objects.equals(this.operator, jobConditionQueryParameterDto.operator) &&
        Objects.equals(this.value, jobConditionQueryParameterDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConditionQueryParameterDto {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

