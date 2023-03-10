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
import java.util.List;
import org.openapitools.client.model.FetchExternalTaskTopicDto;

/**
 * FetchExternalTasksDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class FetchExternalTasksDto {
  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_MAX_TASKS = "maxTasks";
  @SerializedName(SERIALIZED_NAME_MAX_TASKS)
  private Integer maxTasks;

  public static final String SERIALIZED_NAME_USE_PRIORITY = "usePriority";
  @SerializedName(SERIALIZED_NAME_USE_PRIORITY)
  private Boolean usePriority;

  public static final String SERIALIZED_NAME_ASYNC_RESPONSE_TIMEOUT = "asyncResponseTimeout";
  @SerializedName(SERIALIZED_NAME_ASYNC_RESPONSE_TIMEOUT)
  private Long asyncResponseTimeout;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<FetchExternalTaskTopicDto> topics = null;


  public FetchExternalTasksDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * **Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.
   * @return workerId
  **/
  @ApiModelProperty(required = true, value = "**Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public FetchExternalTasksDto maxTasks(Integer maxTasks) {
    
    this.maxTasks = maxTasks;
    return this;
  }

   /**
   * **Mandatory.** The maximum number of tasks to return.
   * @return maxTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Mandatory.** The maximum number of tasks to return.")

  public Integer getMaxTasks() {
    return maxTasks;
  }


  public void setMaxTasks(Integer maxTasks) {
    this.maxTasks = maxTasks;
  }


  public FetchExternalTasksDto usePriority(Boolean usePriority) {
    
    this.usePriority = usePriority;
    return this;
  }

   /**
   * A &#x60;boolean&#x60; value, which indicates whether the task should be fetched based on its priority or arbitrarily.
   * @return usePriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `boolean` value, which indicates whether the task should be fetched based on its priority or arbitrarily.")

  public Boolean getUsePriority() {
    return usePriority;
  }


  public void setUsePriority(Boolean usePriority) {
    this.usePriority = usePriority;
  }


  public FetchExternalTasksDto asyncResponseTimeout(Long asyncResponseTimeout) {
    
    this.asyncResponseTimeout = asyncResponseTimeout;
    return this;
  }

   /**
   * The [Long Polling](https://docs.camunda.org/manual/7.18/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) timeout in milliseconds.  **Note:** The value cannot be set larger than 1.800.000 milliseconds (corresponds to 30 minutes).
   * @return asyncResponseTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Long Polling](https://docs.camunda.org/manual/7.18/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) timeout in milliseconds.  **Note:** The value cannot be set larger than 1.800.000 milliseconds (corresponds to 30 minutes).")

  public Long getAsyncResponseTimeout() {
    return asyncResponseTimeout;
  }


  public void setAsyncResponseTimeout(Long asyncResponseTimeout) {
    this.asyncResponseTimeout = asyncResponseTimeout;
  }


  public FetchExternalTasksDto topics(List<FetchExternalTaskTopicDto> topics) {
    
    this.topics = topics;
    return this;
  }

  public FetchExternalTasksDto addTopicsItem(FetchExternalTaskTopicDto topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<FetchExternalTaskTopicDto>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * A JSON array of topic objects for which external tasks should be fetched. The returned tasks may be arbitrarily distributed among these topics. Each topic object has the following properties:
   * @return topics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of topic objects for which external tasks should be fetched. The returned tasks may be arbitrarily distributed among these topics. Each topic object has the following properties:")

  public List<FetchExternalTaskTopicDto> getTopics() {
    return topics;
  }


  public void setTopics(List<FetchExternalTaskTopicDto> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchExternalTasksDto fetchExternalTasksDto = (FetchExternalTasksDto) o;
    return Objects.equals(this.workerId, fetchExternalTasksDto.workerId) &&
        Objects.equals(this.maxTasks, fetchExternalTasksDto.maxTasks) &&
        Objects.equals(this.usePriority, fetchExternalTasksDto.usePriority) &&
        Objects.equals(this.asyncResponseTimeout, fetchExternalTasksDto.asyncResponseTimeout) &&
        Objects.equals(this.topics, fetchExternalTasksDto.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, maxTasks, usePriority, asyncResponseTimeout, topics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchExternalTasksDto {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    maxTasks: ").append(toIndentedString(maxTasks)).append("\n");
    sb.append("    usePriority: ").append(toIndentedString(usePriority)).append("\n");
    sb.append("    asyncResponseTimeout: ").append(toIndentedString(asyncResponseTimeout)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

