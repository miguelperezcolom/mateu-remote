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
import org.openapitools.client.model.ExtendLockOnExternalTaskDtoAllOf;
import org.openapitools.client.model.HandleExternalTaskDto;

/**
 * ExtendLockOnExternalTaskDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class ExtendLockOnExternalTaskDto {
  public static final String SERIALIZED_NAME_NEW_DURATION = "newDuration";
  @SerializedName(SERIALIZED_NAME_NEW_DURATION)
  private Long newDuration;

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;


  public ExtendLockOnExternalTaskDto newDuration(Long newDuration) {
    
    this.newDuration = newDuration;
    return this;
  }

   /**
   * An amount of time (in milliseconds). This is the new lock duration starting from the current moment.
   * @return newDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An amount of time (in milliseconds). This is the new lock duration starting from the current moment.")

  public Long getNewDuration() {
    return newDuration;
  }


  public void setNewDuration(Long newDuration) {
    this.newDuration = newDuration;
  }


  public ExtendLockOnExternalTaskDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendLockOnExternalTaskDto extendLockOnExternalTaskDto = (ExtendLockOnExternalTaskDto) o;
    return Objects.equals(this.newDuration, extendLockOnExternalTaskDto.newDuration) &&
        Objects.equals(this.workerId, extendLockOnExternalTaskDto.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDuration, workerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendLockOnExternalTaskDto {\n");
    sb.append("    newDuration: ").append(toIndentedString(newDuration)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

