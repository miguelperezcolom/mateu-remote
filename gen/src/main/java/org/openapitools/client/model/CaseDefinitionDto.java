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
 * CaseDefinitionDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CaseDefinitionDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

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

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_HISTORY_TIME_TO_LIVE = "historyTimeToLive";
  @SerializedName(SERIALIZED_NAME_HISTORY_TIME_TO_LIVE)
  private Integer historyTimeToLive;


  public CaseDefinitionDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the case definition
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case definition")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CaseDefinitionDto key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the case definition, i.e., the id of the CMMN 2.0 XML case definition.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the case definition, i.e., the id of the CMMN 2.0 XML case definition.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CaseDefinitionDto category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category of the case definition.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the case definition.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CaseDefinitionDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the case definition.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the case definition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CaseDefinitionDto version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the case definition that the engine assigned to it.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the case definition that the engine assigned to it.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public CaseDefinitionDto resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * The file name of the case definition.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the case definition.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public CaseDefinitionDto deploymentId(String deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The deployment id of the case definition.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The deployment id of the case definition.")

  public String getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public CaseDefinitionDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the case definition.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the case definition.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public CaseDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

   /**
   * History time to live value of the case definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "History time to live value of the case definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.18/user-guide/process-engine/history/#history-cleanup).")

  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }


  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseDefinitionDto caseDefinitionDto = (CaseDefinitionDto) o;
    return Objects.equals(this.id, caseDefinitionDto.id) &&
        Objects.equals(this.key, caseDefinitionDto.key) &&
        Objects.equals(this.category, caseDefinitionDto.category) &&
        Objects.equals(this.name, caseDefinitionDto.name) &&
        Objects.equals(this.version, caseDefinitionDto.version) &&
        Objects.equals(this.resource, caseDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, caseDefinitionDto.deploymentId) &&
        Objects.equals(this.tenantId, caseDefinitionDto.tenantId) &&
        Objects.equals(this.historyTimeToLive, caseDefinitionDto.historyTimeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, category, name, version, resource, deploymentId, tenantId, historyTimeToLive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseDefinitionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
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

