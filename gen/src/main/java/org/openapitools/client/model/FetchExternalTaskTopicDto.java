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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FetchExternalTaskTopicDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class FetchExternalTaskTopicDto {
  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_LOCK_DURATION = "lockDuration";
  @SerializedName(SERIALIZED_NAME_LOCK_DURATION)
  private Long lockDuration;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<String> variables = null;

  public static final String SERIALIZED_NAME_LOCAL_VARIABLES = "localVariables";
  @SerializedName(SERIALIZED_NAME_LOCAL_VARIABLES)
  private Boolean localVariables = false;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID_IN = "processDefinitionIdIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID_IN)
  private List<String> processDefinitionIdIn = null;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY_IN = "processDefinitionKeyIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY_IN)
  private List<String> processDefinitionKeyIn = null;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_VERSION_TAG = "processDefinitionVersionTag";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_VERSION_TAG)
  private String processDefinitionVersionTag;

  public static final String SERIALIZED_NAME_WITHOUT_TENANT_ID = "withoutTenantId";
  @SerializedName(SERIALIZED_NAME_WITHOUT_TENANT_ID)
  private Boolean withoutTenantId = false;

  public static final String SERIALIZED_NAME_TENANT_ID_IN = "tenantIdIn";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_IN)
  private List<String> tenantIdIn = null;

  public static final String SERIALIZED_NAME_PROCESS_VARIABLES = "processVariables";
  @SerializedName(SERIALIZED_NAME_PROCESS_VARIABLES)
  private Map<String, Object> processVariables = null;

  public static final String SERIALIZED_NAME_DESERIALIZE_VALUES = "deserializeValues";
  @SerializedName(SERIALIZED_NAME_DESERIALIZE_VALUES)
  private Boolean deserializeValues = false;

  public static final String SERIALIZED_NAME_INCLUDE_EXTENSION_PROPERTIES = "includeExtensionProperties";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EXTENSION_PROPERTIES)
  private Boolean includeExtensionProperties = false;


  public FetchExternalTaskTopicDto topicName(String topicName) {
    
    this.topicName = topicName;
    return this;
  }

   /**
   * **Mandatory.** The topic&#39;s name.
   * @return topicName
  **/
  @ApiModelProperty(required = true, value = "**Mandatory.** The topic's name.")

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public FetchExternalTaskTopicDto lockDuration(Long lockDuration) {
    
    this.lockDuration = lockDuration;
    return this;
  }

   /**
   * **Mandatory.** The duration to lock the external tasks for in milliseconds.
   * @return lockDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "**Mandatory.** The duration to lock the external tasks for in milliseconds.")

  public Long getLockDuration() {
    return lockDuration;
  }


  public void setLockDuration(Long lockDuration) {
    this.lockDuration = lockDuration;
  }


  public FetchExternalTaskTopicDto variables(List<String> variables) {
    
    this.variables = variables;
    return this;
  }

  public FetchExternalTaskTopicDto addVariablesItem(String variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<String>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * A JSON array of &#x60;String&#x60; values that represent variable names. For each result task belonging to this topic, the given variables are returned as well if they are accessible from the external task&#39;s execution. If not provided - all variables will be fetched.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of `String` values that represent variable names. For each result task belonging to this topic, the given variables are returned as well if they are accessible from the external task's execution. If not provided - all variables will be fetched.")

  public List<String> getVariables() {
    return variables;
  }


  public void setVariables(List<String> variables) {
    this.variables = variables;
  }


  public FetchExternalTaskTopicDto localVariables(Boolean localVariables) {
    
    this.localVariables = localVariables;
    return this;
  }

   /**
   * If &#x60;true&#x60; only local variables will be fetched.
   * @return localVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true` only local variables will be fetched.")

  public Boolean getLocalVariables() {
    return localVariables;
  }


  public void setLocalVariables(Boolean localVariables) {
    this.localVariables = localVariables;
  }


  public FetchExternalTaskTopicDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * A &#x60;String&#x60; value which enables the filtering of tasks based on process instance business key.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `String` value which enables the filtering of tasks based on process instance business key.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public FetchExternalTaskTopicDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Filter tasks based on process definition id.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on process definition id.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public FetchExternalTaskTopicDto processDefinitionIdIn(List<String> processDefinitionIdIn) {
    
    this.processDefinitionIdIn = processDefinitionIdIn;
    return this;
  }

  public FetchExternalTaskTopicDto addProcessDefinitionIdInItem(String processDefinitionIdInItem) {
    if (this.processDefinitionIdIn == null) {
      this.processDefinitionIdIn = new ArrayList<String>();
    }
    this.processDefinitionIdIn.add(processDefinitionIdInItem);
    return this;
  }

   /**
   * Filter tasks based on process definition ids.
   * @return processDefinitionIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on process definition ids.")

  public List<String> getProcessDefinitionIdIn() {
    return processDefinitionIdIn;
  }


  public void setProcessDefinitionIdIn(List<String> processDefinitionIdIn) {
    this.processDefinitionIdIn = processDefinitionIdIn;
  }


  public FetchExternalTaskTopicDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Filter tasks based on process definition key.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on process definition key.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public FetchExternalTaskTopicDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public FetchExternalTaskTopicDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<String>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

   /**
   * Filter tasks based on process definition keys.
   * @return processDefinitionKeyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on process definition keys.")

  public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }


  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }


  public FetchExternalTaskTopicDto processDefinitionVersionTag(String processDefinitionVersionTag) {
    
    this.processDefinitionVersionTag = processDefinitionVersionTag;
    return this;
  }

   /**
   * Filter tasks based on process definition version tag.
   * @return processDefinitionVersionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on process definition version tag.")

  public String getProcessDefinitionVersionTag() {
    return processDefinitionVersionTag;
  }


  public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
  }


  public FetchExternalTaskTopicDto withoutTenantId(Boolean withoutTenantId) {
    
    this.withoutTenantId = withoutTenantId;
    return this;
  }

   /**
   * Filter tasks without tenant id.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks without tenant id.")

  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }


  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  public FetchExternalTaskTopicDto tenantIdIn(List<String> tenantIdIn) {
    
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public FetchExternalTaskTopicDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<String>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

   /**
   * Filter tasks based on tenant ids.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter tasks based on tenant ids.")

  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }


  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }


  public FetchExternalTaskTopicDto processVariables(Map<String, Object> processVariables) {
    
    this.processVariables = processVariables;
    return this;
  }

  public FetchExternalTaskTopicDto putProcessVariablesItem(String key, Object processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new HashMap<String, Object>();
    }
    this.processVariables.put(key, processVariablesItem);
    return this;
  }

   /**
   * A &#x60;JSON&#x60; object used for filtering tasks based on process instance variable values. A property name of the object represents a process variable name, while the property value represents the process variable value to filter tasks by.
   * @return processVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `JSON` object used for filtering tasks based on process instance variable values. A property name of the object represents a process variable name, while the property value represents the process variable value to filter tasks by.")

  public Map<String, Object> getProcessVariables() {
    return processVariables;
  }


  public void setProcessVariables(Map<String, Object> processVariables) {
    this.processVariables = processVariables;
  }


  public FetchExternalTaskTopicDto deserializeValues(Boolean deserializeValues) {
    
    this.deserializeValues = deserializeValues;
    return this;
  }

   /**
   * Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default &#x60;false&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.
   * @return deserializeValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `false`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.")

  public Boolean getDeserializeValues() {
    return deserializeValues;
  }


  public void setDeserializeValues(Boolean deserializeValues) {
    this.deserializeValues = deserializeValues;
  }


  public FetchExternalTaskTopicDto includeExtensionProperties(Boolean includeExtensionProperties) {
    
    this.includeExtensionProperties = includeExtensionProperties;
    return this;
  }

   /**
   * Determines whether custom extension properties defined in the BPMN activity of the external task (e.g. via the Extensions tab in the Camunda modeler) should be included in the response. Default: false
   * @return includeExtensionProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether custom extension properties defined in the BPMN activity of the external task (e.g. via the Extensions tab in the Camunda modeler) should be included in the response. Default: false")

  public Boolean getIncludeExtensionProperties() {
    return includeExtensionProperties;
  }


  public void setIncludeExtensionProperties(Boolean includeExtensionProperties) {
    this.includeExtensionProperties = includeExtensionProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchExternalTaskTopicDto fetchExternalTaskTopicDto = (FetchExternalTaskTopicDto) o;
    return Objects.equals(this.topicName, fetchExternalTaskTopicDto.topicName) &&
        Objects.equals(this.lockDuration, fetchExternalTaskTopicDto.lockDuration) &&
        Objects.equals(this.variables, fetchExternalTaskTopicDto.variables) &&
        Objects.equals(this.localVariables, fetchExternalTaskTopicDto.localVariables) &&
        Objects.equals(this.businessKey, fetchExternalTaskTopicDto.businessKey) &&
        Objects.equals(this.processDefinitionId, fetchExternalTaskTopicDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionIdIn, fetchExternalTaskTopicDto.processDefinitionIdIn) &&
        Objects.equals(this.processDefinitionKey, fetchExternalTaskTopicDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, fetchExternalTaskTopicDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionVersionTag, fetchExternalTaskTopicDto.processDefinitionVersionTag) &&
        Objects.equals(this.withoutTenantId, fetchExternalTaskTopicDto.withoutTenantId) &&
        Objects.equals(this.tenantIdIn, fetchExternalTaskTopicDto.tenantIdIn) &&
        Objects.equals(this.processVariables, fetchExternalTaskTopicDto.processVariables) &&
        Objects.equals(this.deserializeValues, fetchExternalTaskTopicDto.deserializeValues) &&
        Objects.equals(this.includeExtensionProperties, fetchExternalTaskTopicDto.includeExtensionProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicName, lockDuration, variables, localVariables, businessKey, processDefinitionId, processDefinitionIdIn, processDefinitionKey, processDefinitionKeyIn, processDefinitionVersionTag, withoutTenantId, tenantIdIn, processVariables, deserializeValues, includeExtensionProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchExternalTaskTopicDto {\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionIdIn: ").append(toIndentedString(processDefinitionIdIn)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    deserializeValues: ").append(toIndentedString(deserializeValues)).append("\n");
    sb.append("    includeExtensionProperties: ").append(toIndentedString(includeExtensionProperties)).append("\n");
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

