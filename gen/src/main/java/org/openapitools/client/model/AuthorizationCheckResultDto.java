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
 * AuthorizationCheckResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class AuthorizationCheckResultDto {
  public static final String SERIALIZED_NAME_PERMISSION_NAME = "permissionName";
  @SerializedName(SERIALIZED_NAME_PERMISSION_NAME)
  private String permissionName;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_IS_AUTHORIZED = "isAuthorized";
  @SerializedName(SERIALIZED_NAME_IS_AUTHORIZED)
  private Boolean isAuthorized;


  public AuthorizationCheckResultDto permissionName(String permissionName) {
    
    this.permissionName = permissionName;
    return this;
  }

   /**
   * Name of the permission which was checked.
   * @return permissionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the permission which was checked.")

  public String getPermissionName() {
    return permissionName;
  }


  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public AuthorizationCheckResultDto resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * The name of the resource for which the permission check was performed.
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the resource for which the permission check was performed.")

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public AuthorizationCheckResultDto resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * The id of the resource for which the permission check was performed.
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the resource for which the permission check was performed.")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AuthorizationCheckResultDto isAuthorized(Boolean isAuthorized) {
    
    this.isAuthorized = isAuthorized;
    return this;
  }

   /**
   * True / false for isAuthorized.
   * @return isAuthorized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True / false for isAuthorized.")

  public Boolean getIsAuthorized() {
    return isAuthorized;
  }


  public void setIsAuthorized(Boolean isAuthorized) {
    this.isAuthorized = isAuthorized;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationCheckResultDto authorizationCheckResultDto = (AuthorizationCheckResultDto) o;
    return Objects.equals(this.permissionName, authorizationCheckResultDto.permissionName) &&
        Objects.equals(this.resourceName, authorizationCheckResultDto.resourceName) &&
        Objects.equals(this.resourceId, authorizationCheckResultDto.resourceId) &&
        Objects.equals(this.isAuthorized, authorizationCheckResultDto.isAuthorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionName, resourceName, resourceId, isAuthorized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCheckResultDto {\n");
    sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
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

