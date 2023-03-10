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
 * ProcessInstanceDtoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class ProcessInstanceDtoAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DEFINITION_ID = "definitionId";
  @SerializedName(SERIALIZED_NAME_DEFINITION_ID)
  private String definitionId;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;

  public static final String SERIALIZED_NAME_CASE_INSTANCE_ID = "caseInstanceId";
  @SerializedName(SERIALIZED_NAME_CASE_INSTANCE_ID)
  private String caseInstanceId;

  public static final String SERIALIZED_NAME_ENDED = "ended";
  @SerializedName(SERIALIZED_NAME_ENDED)
  private Boolean ended;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;


  public ProcessInstanceDtoAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the process instance.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProcessInstanceDtoAllOf definitionId(String definitionId) {
    
    this.definitionId = definitionId;
    return this;
  }

   /**
   * The id of the process definition that this process instance belongs to.
   * @return definitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition that this process instance belongs to.")

  public String getDefinitionId() {
    return definitionId;
  }


  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }


  public ProcessInstanceDtoAllOf businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public ProcessInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * The id of the case instance associated with the process instance.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case instance associated with the process instance.")

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public ProcessInstanceDtoAllOf ended(Boolean ended) {
    
    this.ended = ended;
    return this;
  }

   /**
   * A flag indicating whether the process instance has ended or not. Deprecated: will always be false!
   * @return ended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process instance has ended or not. Deprecated: will always be false!")

  public Boolean getEnded() {
    return ended;
  }


  public void setEnded(Boolean ended) {
    this.ended = ended;
  }


  public ProcessInstanceDtoAllOf suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * A flag indicating whether the process instance is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process instance is suspended or not.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ProcessInstanceDtoAllOf tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the process instance.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process instance.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceDtoAllOf processInstanceDtoAllOf = (ProcessInstanceDtoAllOf) o;
    return Objects.equals(this.id, processInstanceDtoAllOf.id) &&
        Objects.equals(this.definitionId, processInstanceDtoAllOf.definitionId) &&
        Objects.equals(this.businessKey, processInstanceDtoAllOf.businessKey) &&
        Objects.equals(this.caseInstanceId, processInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.ended, processInstanceDtoAllOf.ended) &&
        Objects.equals(this.suspended, processInstanceDtoAllOf.suspended) &&
        Objects.equals(this.tenantId, processInstanceDtoAllOf.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, definitionId, businessKey, caseInstanceId, ended, suspended, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

