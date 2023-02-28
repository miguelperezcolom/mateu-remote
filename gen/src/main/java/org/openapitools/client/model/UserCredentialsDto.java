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
 * UserCredentialsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class UserCredentialsDto {
  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_AUTHENTICATED_USER_PASSWORD = "authenticatedUserPassword";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED_USER_PASSWORD)
  private String authenticatedUserPassword;


  public UserCredentialsDto password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The users new password.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The users new password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UserCredentialsDto authenticatedUserPassword(String authenticatedUserPassword) {
    
    this.authenticatedUserPassword = authenticatedUserPassword;
    return this;
  }

   /**
   * The password of the authenticated user who changes the password of the user (i.e., the user with passed id as path parameter).
   * @return authenticatedUserPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password of the authenticated user who changes the password of the user (i.e., the user with passed id as path parameter).")

  public String getAuthenticatedUserPassword() {
    return authenticatedUserPassword;
  }


  public void setAuthenticatedUserPassword(String authenticatedUserPassword) {
    this.authenticatedUserPassword = authenticatedUserPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCredentialsDto userCredentialsDto = (UserCredentialsDto) o;
    return Objects.equals(this.password, userCredentialsDto.password) &&
        Objects.equals(this.authenticatedUserPassword, userCredentialsDto.authenticatedUserPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, authenticatedUserPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentialsDto {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authenticatedUserPassword: ").append(toIndentedString(authenticatedUserPassword)).append("\n");
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

