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
 * CommentDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CommentDtoAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REMOVAL_TIME = "removalTime";
  @SerializedName(SERIALIZED_NAME_REMOVAL_TIME)
  private OffsetDateTime removalTime;

  public static final String SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  @SerializedName(SERIALIZED_NAME_ROOT_PROCESS_INSTANCE_ID)
  private String rootProcessInstanceId;


  public CommentDtoAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the task comment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task comment.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CommentDtoAllOf userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user who created the comment.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user who created the comment.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CommentDtoAllOf taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * The id of the task to which the comment belongs.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task to which the comment belongs.")

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public CommentDtoAllOf processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The id of the process instance the comment is related to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance the comment is related to.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public CommentDtoAllOf time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * The time when the comment was created. [Default format]($(docsUrl)/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the comment was created. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public CommentDtoAllOf message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The content of the comment.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the comment.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CommentDtoAllOf removalTime(OffsetDateTime removalTime) {
    
    this.removalTime = removalTime;
    return this;
  }

   /**
   * The time after which the comment should be removed by the History Cleanup job. [Default format]($(docsUrl)/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the comment should be removed by the History Cleanup job. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")

  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }


  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }


  public CommentDtoAllOf rootProcessInstanceId(String rootProcessInstanceId) {
    
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing the task.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing the task.")

  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }


  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentDtoAllOf commentDtoAllOf = (CommentDtoAllOf) o;
    return Objects.equals(this.id, commentDtoAllOf.id) &&
        Objects.equals(this.userId, commentDtoAllOf.userId) &&
        Objects.equals(this.taskId, commentDtoAllOf.taskId) &&
        Objects.equals(this.processInstanceId, commentDtoAllOf.processInstanceId) &&
        Objects.equals(this.time, commentDtoAllOf.time) &&
        Objects.equals(this.message, commentDtoAllOf.message) &&
        Objects.equals(this.removalTime, commentDtoAllOf.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, commentDtoAllOf.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, taskId, processInstanceId, time, message, removalTime, rootProcessInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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

