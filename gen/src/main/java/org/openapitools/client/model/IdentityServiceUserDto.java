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
 * IdentityServiceUserDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class IdentityServiceUserDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public IdentityServiceUserDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the user.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentityServiceUserDto firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The firstname of the user.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The firstname of the user.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IdentityServiceUserDto lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The lastname of the user.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lastname of the user.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IdentityServiceUserDto displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The displayName is generated from the id or firstName and lastName if available.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The displayName is generated from the id or firstName and lastName if available.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityServiceUserDto identityServiceUserDto = (IdentityServiceUserDto) o;
    return Objects.equals(this.id, identityServiceUserDto.id) &&
        Objects.equals(this.firstName, identityServiceUserDto.firstName) &&
        Objects.equals(this.lastName, identityServiceUserDto.lastName) &&
        Objects.equals(this.displayName, identityServiceUserDto.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityServiceUserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

