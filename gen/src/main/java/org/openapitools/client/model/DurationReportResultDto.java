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
 * DurationReportResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class DurationReportResultDto {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period;

  /**
   * The unit of the given period. Possible values are &#x60;MONTH&#x60; and &#x60;QUARTER&#x60;.
   */
  @JsonAdapter(PeriodUnitEnum.Adapter.class)
  public enum PeriodUnitEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodUnitEnum fromValue(String value) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodUnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD_UNIT = "periodUnit";
  @SerializedName(SERIALIZED_NAME_PERIOD_UNIT)
  private PeriodUnitEnum periodUnit;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Long minimum;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Long maximum;

  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Long average;


  public DurationReportResultDto period(Integer period) {
    
    this.period = period;
    return this;
  }

   /**
   * Specifies a timespan within a year. **Note:** The period must be interpreted in conjunction with the returned &#x60;periodUnit&#x60;.
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a timespan within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.")

  public Integer getPeriod() {
    return period;
  }


  public void setPeriod(Integer period) {
    this.period = period;
  }


  public DurationReportResultDto periodUnit(PeriodUnitEnum periodUnit) {
    
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * The unit of the given period. Possible values are &#x60;MONTH&#x60; and &#x60;QUARTER&#x60;.
   * @return periodUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of the given period. Possible values are `MONTH` and `QUARTER`.")

  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }


  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }


  public DurationReportResultDto minimum(Long minimum) {
    
    this.minimum = minimum;
    return this;
  }

   /**
   * The smallest duration in milliseconds of all completed process instances which were started in the given period.
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The smallest duration in milliseconds of all completed process instances which were started in the given period.")

  public Long getMinimum() {
    return minimum;
  }


  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }


  public DurationReportResultDto maximum(Long maximum) {
    
    this.maximum = maximum;
    return this;
  }

   /**
   * The greatest duration in milliseconds of all completed process instances which were started in the given period.
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The greatest duration in milliseconds of all completed process instances which were started in the given period.")

  public Long getMaximum() {
    return maximum;
  }


  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }


  public DurationReportResultDto average(Long average) {
    
    this.average = average;
    return this;
  }

   /**
   * The average duration in milliseconds of all completed process instances which were started in the given period.
   * @return average
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average duration in milliseconds of all completed process instances which were started in the given period.")

  public Long getAverage() {
    return average;
  }


  public void setAverage(Long average) {
    this.average = average;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationReportResultDto durationReportResultDto = (DurationReportResultDto) o;
    return Objects.equals(this.period, durationReportResultDto.period) &&
        Objects.equals(this.periodUnit, durationReportResultDto.periodUnit) &&
        Objects.equals(this.minimum, durationReportResultDto.minimum) &&
        Objects.equals(this.maximum, durationReportResultDto.maximum) &&
        Objects.equals(this.average, durationReportResultDto.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodUnit, minimum, maximum, average);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationReportResultDto {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

