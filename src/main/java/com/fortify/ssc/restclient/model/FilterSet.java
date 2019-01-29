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
import com.fortify.ssc.restclient.model.FolderDto;
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

/**
 * basic info on a filter set (does not include filters)
 */
@ApiModel(description = "basic info on a filter set (does not include filters)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class FilterSet {
  @SerializedName("defaultFilterSet")
  private Boolean defaultFilterSet = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("folders")
  private List<FolderDto> folders = new ArrayList<FolderDto>();

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("title")
  private String title = null;

   /**
   * whether this filter set is the default within its issue template
   * @return defaultFilterSet
  **/
  @ApiModelProperty(example = "false", required = true, value = "whether this filter set is the default within its issue template")
  public Boolean isDefaultFilterSet() {
    return defaultFilterSet;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public FilterSet folders(List<FolderDto> folders) {
    this.folders = folders;
    return this;
  }

  public FilterSet addFoldersItem(FolderDto foldersItem) {
    this.folders.add(foldersItem);
    return this;
  }

   /**
   * List of folders defined in filter set
   * @return folders
  **/
  @ApiModelProperty(required = true, value = "List of folders defined in filter set")
  public List<FolderDto> getFolders() {
    return folders;
  }

  public void setFolders(List<FolderDto> folders) {
    this.folders = folders;
  }

   /**
   * GUID of filter set
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "GUID of filter set")
  public String getGuid() {
    return guid;
  }

   /**
   * name of filter set
   * @return title
  **/
  @ApiModelProperty(required = true, value = "name of filter set")
  public String getTitle() {
    return title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSet filterSet = (FilterSet) o;
    return Objects.equals(this.defaultFilterSet, filterSet.defaultFilterSet) &&
        Objects.equals(this.description, filterSet.description) &&
        Objects.equals(this.folders, filterSet.folders) &&
        Objects.equals(this.guid, filterSet.guid) &&
        Objects.equals(this.title, filterSet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultFilterSet, description, folders, guid, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSet {\n");
    
    sb.append("    defaultFilterSet: ").append(toIndentedString(defaultFilterSet)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
