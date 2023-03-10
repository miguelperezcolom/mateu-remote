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
 * Defines by which selection criterion to activate or suspend job definitions. The selection criteria are mutually exclusive and can only be one of: * &#x60;processDefinitionId&#x60; * &#x60;processDefinitionKey&#x60;
 */
@ApiModel(description = "Defines by which selection criterion to activate or suspend job definitions. The selection criteria are mutually exclusive and can only be one of: * `processDefinitionId` * `processDefinitionKey`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class JobDefinitionsSuspensionStateDtoAllOf {
  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_TENANT_ID = "processDefinitionTenantId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_TENANT_ID)
  private String processDefinitionTenantId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_WITHOUT_TENANT_ID = "processDefinitionWithoutTenantId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
  private Boolean processDefinitionWithoutTenantId;


  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The process definition id of the job definitions to activate or suspend.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process definition id of the job definitions to activate or suspend.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The process definition key of the job definitions to activate or suspend.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process definition key of the job definitions to activate or suspend.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
    
    this.processDefinitionTenantId = processDefinitionTenantId;
    return this;
  }

   /**
   * Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with &#x60;processDefinitionKey&#x60;.
   * @return processDefinitionTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.")

  public String getProcessDefinitionTenantId() {
    return processDefinitionTenantId;
  }


  public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
  }


  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

   /**
   * Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.  Note that this parameter will only be considered  in combination with &#x60;processDefinitionKey&#x60;.
   * @return processDefinitionWithoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.")

  public Boolean getProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }


  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionsSuspensionStateDtoAllOf jobDefinitionsSuspensionStateDtoAllOf = (JobDefinitionsSuspensionStateDtoAllOf) o;
    return Objects.equals(this.processDefinitionId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionWithoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionsSuspensionStateDtoAllOf {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
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

