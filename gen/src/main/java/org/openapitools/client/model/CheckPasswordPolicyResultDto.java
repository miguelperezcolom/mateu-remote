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
import org.openapitools.client.model.CheckPasswordPolicyResultDtoAllOf;
import org.openapitools.client.model.PasswordPolicyDto;
import org.openapitools.client.model.PasswordPolicyRuleDto;

/**
 * CheckPasswordPolicyResultDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class CheckPasswordPolicyResultDto {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<PasswordPolicyRuleDto> rules = null;


  public CheckPasswordPolicyResultDto valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * &#x60;true&#x60; if the password is compliant with the policy, otherwise &#x60;false&#x60;.
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if the password is compliant with the policy, otherwise `false`.")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public CheckPasswordPolicyResultDto rules(List<PasswordPolicyRuleDto> rules) {
    
    this.rules = rules;
    return this;
  }

  public CheckPasswordPolicyResultDto addRulesItem(PasswordPolicyRuleDto rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PasswordPolicyRuleDto>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * An array of password policy rules. Each element of the array is representing one rule of the policy.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of password policy rules. Each element of the array is representing one rule of the policy.")

  public List<PasswordPolicyRuleDto> getRules() {
    return rules;
  }


  public void setRules(List<PasswordPolicyRuleDto> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPasswordPolicyResultDto checkPasswordPolicyResultDto = (CheckPasswordPolicyResultDto) o;
    return Objects.equals(this.valid, checkPasswordPolicyResultDto.valid) &&
        Objects.equals(this.rules, checkPasswordPolicyResultDto.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPasswordPolicyResultDto {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

