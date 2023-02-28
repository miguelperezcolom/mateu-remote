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
 * ProcessInstanceQueryDtoSorting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class ProcessInstanceQueryDtoSorting {
  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   */
  @JsonAdapter(SortByEnum.Adapter.class)
  public enum SortByEnum {
    INSTANCEID("instanceId"),
    
    DEFINITIONID("definitionId"),
    
    DEFINITIONKEY("definitionKey"),
    
    BUSINESSKEY("businessKey"),
    
    TENANTID("tenantId");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortByEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private SortByEnum sortBy;

  /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortOrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrderEnum sortOrder;


  public ProcessInstanceQueryDtoSorting sortBy(SortByEnum sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.")

  public SortByEnum getSortBy() {
    return sortBy;
  }


  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  public ProcessInstanceQueryDtoSorting sortOrder(SortOrderEnum sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Sort the results in a given order. Values may be &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Must be used in conjunction with the sortBy parameter.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.")

  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceQueryDtoSorting processInstanceQueryDtoSorting = (ProcessInstanceQueryDtoSorting) o;
    return Objects.equals(this.sortBy, processInstanceQueryDtoSorting.sortBy) &&
        Objects.equals(this.sortOrder, processInstanceQueryDtoSorting.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceQueryDtoSorting {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

