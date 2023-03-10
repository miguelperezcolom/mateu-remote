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
import org.openapitools.client.model.AtomLink;
import org.openapitools.client.model.LinkableDto;

/**
 * ResourceOptionsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T18:24:37.267768300+01:00[Europe/Paris]")
public class ResourceOptionsDto {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<AtomLink> links = null;


  public ResourceOptionsDto links(List<AtomLink> links) {
    
    this.links = links;
    return this;
  }

  public ResourceOptionsDto addLinksItem(AtomLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<AtomLink>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * The links associated to this resource, with &#x60;method&#x60;, &#x60;href&#x60; and &#x60;rel&#x60;.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The links associated to this resource, with `method`, `href` and `rel`.")

  public List<AtomLink> getLinks() {
    return links;
  }


  public void setLinks(List<AtomLink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceOptionsDto resourceOptionsDto = (ResourceOptionsDto) o;
    return Objects.equals(this.links, resourceOptionsDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceOptionsDto {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

