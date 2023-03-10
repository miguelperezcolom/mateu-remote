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
 * DeploymentDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class DeploymentDtoAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TIME = "deploymentTime";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TIME)
  private OffsetDateTime deploymentTime;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DeploymentDtoAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DeploymentDtoAllOf tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the deployment.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the deployment.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public DeploymentDtoAllOf deploymentTime(OffsetDateTime deploymentTime) {
    
    this.deploymentTime = deploymentTime;
    return this;
  }

   /**
   * The time when the deployment was created.
   * @return deploymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the deployment was created.")

  public OffsetDateTime getDeploymentTime() {
    return deploymentTime;
  }


  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
  }


  public DeploymentDtoAllOf source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the deployment.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the deployment.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public DeploymentDtoAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the deployment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDtoAllOf deploymentDtoAllOf = (DeploymentDtoAllOf) o;
    return Objects.equals(this.id, deploymentDtoAllOf.id) &&
        Objects.equals(this.tenantId, deploymentDtoAllOf.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDtoAllOf.deploymentTime) &&
        Objects.equals(this.source, deploymentDtoAllOf.source) &&
        Objects.equals(this.name, deploymentDtoAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

