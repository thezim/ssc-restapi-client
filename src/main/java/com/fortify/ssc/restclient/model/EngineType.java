/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Types of the analyzers (engines) that produces issues
 */
@ApiModel(description = "Types of the analyzers (engines) that produces issues")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class EngineType {
  @SerializedName("name")
  private String name = null;

  @SerializedName("servedByPlugin")
  private Boolean servedByPlugin = null;

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get servedByPlugin
   * @return servedByPlugin
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isServedByPlugin() {
    return servedByPlugin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineType engineType = (EngineType) o;
    return Objects.equals(this.name, engineType.name) &&
        Objects.equals(this.servedByPlugin, engineType.servedByPlugin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, servedByPlugin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    servedByPlugin: ").append(toIndentedString(servedByPlugin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

