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
import org.openapitools.client.model.CalledProcessDefinitionDtoAllOf;
import org.openapitools.client.model.ProcessDefinitionDto;

/**
 * CalledProcessDefinitionDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CalledProcessDefinitionDto {
  public static final String SERIALIZED_NAME_CALLED_FROM_ACTIVITY_IDS = "calledFromActivityIds";
  @SerializedName(SERIALIZED_NAME_CALLED_FROM_ACTIVITY_IDS)
  private List<String> calledFromActivityIds = null;

  public static final String SERIALIZED_NAME_CALLING_PROCESS_DEFINITION_ID = "callingProcessDefinitionId";
  @SerializedName(SERIALIZED_NAME_CALLING_PROCESS_DEFINITION_ID)
  private String callingProcessDefinitionId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "deploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private String deploymentId;

  public static final String SERIALIZED_NAME_DIAGRAM = "diagram";
  @SerializedName(SERIALIZED_NAME_DIAGRAM)
  private String diagram;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_VERSION_TAG = "versionTag";
  @SerializedName(SERIALIZED_NAME_VERSION_TAG)
  private String versionTag;

  public static final String SERIALIZED_NAME_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  @SerializedName(SERIALIZED_NAME_HISTORY_TIME_TO_LIVE)
  private Integer historyTimeToLive;

  public static final String SERIALIZED_NAME_STARTABLE_IN_TASKLIST = "startableInTasklist";
  @SerializedName(SERIALIZED_NAME_STARTABLE_IN_TASKLIST)
  private Boolean startableInTasklist;


  public CalledProcessDefinitionDto calledFromActivityIds(List<String> calledFromActivityIds) {
    
    this.calledFromActivityIds = calledFromActivityIds;
    return this;
  }

  public CalledProcessDefinitionDto addCalledFromActivityIdsItem(String calledFromActivityIdsItem) {
    if (this.calledFromActivityIds == null) {
      this.calledFromActivityIds = new ArrayList<String>();
    }
    this.calledFromActivityIds.add(calledFromActivityIdsItem);
    return this;
  }

   /**
   * Ids of the CallActivities which call this process.
   * @return calledFromActivityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ids of the CallActivities which call this process.")

  public List<String> getCalledFromActivityIds() {
    return calledFromActivityIds;
  }


  public void setCalledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = calledFromActivityIds;
  }


  public CalledProcessDefinitionDto callingProcessDefinitionId(String callingProcessDefinitionId) {
    
    this.callingProcessDefinitionId = callingProcessDefinitionId;
    return this;
  }

   /**
   * The id of the calling process definition
   * @return callingProcessDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the calling process definition")

  public String getCallingProcessDefinitionId() {
    return callingProcessDefinitionId;
  }


  public void setCallingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = callingProcessDefinitionId;
  }


  public CalledProcessDefinitionDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the process definition
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CalledProcessDefinitionDto key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CalledProcessDefinitionDto category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category of the process definition.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the process definition.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CalledProcessDefinitionDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the process definition.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the process definition.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CalledProcessDefinitionDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the process definition.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the process definition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CalledProcessDefinitionDto version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the process definition that the engine assigned to it.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the process definition that the engine assigned to it.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public CalledProcessDefinitionDto resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * The file name of the process definition.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the process definition.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public CalledProcessDefinitionDto deploymentId(String deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The deployment id of the process definition.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The deployment id of the process definition.")

  public String getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public CalledProcessDefinitionDto diagram(String diagram) {
    
    this.diagram = diagram;
    return this;
  }

   /**
   * The file name of the process definition diagram, if it exists.
   * @return diagram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the process definition diagram, if it exists.")

  public String getDiagram() {
    return diagram;
  }


  public void setDiagram(String diagram) {
    this.diagram = diagram;
  }


  public CalledProcessDefinitionDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * A flag indicating whether the definition is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the definition is suspended or not.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public CalledProcessDefinitionDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the process definition.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process definition.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CalledProcessDefinitionDto versionTag(String versionTag) {
    
    this.versionTag = versionTag;
    return this;
  }

   /**
   * The version tag of the process definition.
   * @return versionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version tag of the process definition.")

  public String getVersionTag() {
    return versionTag;
  }


  public void setVersionTag(String versionTag) {
    this.versionTag = versionTag;
  }


  public CalledProcessDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

   /**
   * History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).")

  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }


  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }


  public CalledProcessDefinitionDto startableInTasklist(Boolean startableInTasklist) {
    
    this.startableInTasklist = startableInTasklist;
    return this;
  }

   /**
   * A flag indicating whether the process definition is startable in Tasklist or not.
   * @return startableInTasklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process definition is startable in Tasklist or not.")

  public Boolean getStartableInTasklist() {
    return startableInTasklist;
  }


  public void setStartableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = startableInTasklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalledProcessDefinitionDto calledProcessDefinitionDto = (CalledProcessDefinitionDto) o;
    return Objects.equals(this.calledFromActivityIds, calledProcessDefinitionDto.calledFromActivityIds) &&
        Objects.equals(this.callingProcessDefinitionId, calledProcessDefinitionDto.callingProcessDefinitionId) &&
        Objects.equals(this.id, calledProcessDefinitionDto.id) &&
        Objects.equals(this.key, calledProcessDefinitionDto.key) &&
        Objects.equals(this.category, calledProcessDefinitionDto.category) &&
        Objects.equals(this.description, calledProcessDefinitionDto.description) &&
        Objects.equals(this.name, calledProcessDefinitionDto.name) &&
        Objects.equals(this.version, calledProcessDefinitionDto.version) &&
        Objects.equals(this.resource, calledProcessDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, calledProcessDefinitionDto.deploymentId) &&
        Objects.equals(this.diagram, calledProcessDefinitionDto.diagram) &&
        Objects.equals(this.suspended, calledProcessDefinitionDto.suspended) &&
        Objects.equals(this.tenantId, calledProcessDefinitionDto.tenantId) &&
        Objects.equals(this.versionTag, calledProcessDefinitionDto.versionTag) &&
        Objects.equals(this.historyTimeToLive, calledProcessDefinitionDto.historyTimeToLive) &&
        Objects.equals(this.startableInTasklist, calledProcessDefinitionDto.startableInTasklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calledFromActivityIds, callingProcessDefinitionId, id, key, category, description, name, version, resource, deploymentId, diagram, suspended, tenantId, versionTag, historyTimeToLive, startableInTasklist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalledProcessDefinitionDto {\n");
    sb.append("    calledFromActivityIds: ").append(toIndentedString(calledFromActivityIds)).append("\n");
    sb.append("    callingProcessDefinitionId: ").append(toIndentedString(callingProcessDefinitionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    startableInTasklist: ").append(toIndentedString(startableInTasklist)).append("\n");
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

