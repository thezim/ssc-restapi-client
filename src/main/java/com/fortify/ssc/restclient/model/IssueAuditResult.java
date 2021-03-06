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
import com.fortify.ssc.restclient.model.CustomTag;
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
 * Issue audit result contains the most rescent issue audit information after performing issue audit.
 */
@ApiModel(description = "Issue audit result contains the most rescent issue audit information after performing issue audit.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueAuditResult {
  @SerializedName("customTagValues")
  private List<CustomTag> customTagValues = new ArrayList<CustomTag>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issueInstanceId")
  private String issueInstanceId = null;

  @SerializedName("projectVersionId")
  private Long projectVersionId = null;

  @SerializedName("revision")
  private Integer revision = null;

  @SerializedName("suppressed")
  private Boolean suppressed = null;

  @SerializedName("userName")
  private String userName = null;

  public IssueAuditResult customTagValues(List<CustomTag> customTagValues) {
    this.customTagValues = customTagValues;
    return this;
  }

  public IssueAuditResult addCustomTagValuesItem(CustomTag customTagValuesItem) {
    this.customTagValues.add(customTagValuesItem);
    return this;
  }

   /**
   * Custom tag values that are set for the issue.
   * @return customTagValues
  **/
  @ApiModelProperty(required = true, value = "Custom tag values that are set for the issue.")
  public List<CustomTag> getCustomTagValues() {
    return customTagValues;
  }

  public void setCustomTagValues(List<CustomTag> customTagValues) {
    this.customTagValues = customTagValues;
  }

   /**
   * Audited issue ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Audited issue ID.")
  public Long getId() {
    return id;
  }

   /**
   * Issue instance ID.
   * @return issueInstanceId
  **/
  @ApiModelProperty(required = true, value = "Issue instance ID.")
  public String getIssueInstanceId() {
    return issueInstanceId;
  }

   /**
   * ID of the project version the audited issue belongs to.
   * @return projectVersionId
  **/
  @ApiModelProperty(required = true, value = "ID of the project version the audited issue belongs to.")
  public Long getProjectVersionId() {
    return projectVersionId;
  }

   /**
   * Audited issue revision.
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "Audited issue revision.")
  public Integer getRevision() {
    return revision;
  }

   /**
   * Is issue suppressed.
   * @return suppressed
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is issue suppressed.")
  public Boolean isSuppressed() {
    return suppressed;
  }

   /**
   * User assigned to the audited issue.
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "User assigned to the audited issue.")
  public String getUserName() {
    return userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueAuditResult issueAuditResult = (IssueAuditResult) o;
    return Objects.equals(this.customTagValues, issueAuditResult.customTagValues) &&
        Objects.equals(this.id, issueAuditResult.id) &&
        Objects.equals(this.issueInstanceId, issueAuditResult.issueInstanceId) &&
        Objects.equals(this.projectVersionId, issueAuditResult.projectVersionId) &&
        Objects.equals(this.revision, issueAuditResult.revision) &&
        Objects.equals(this.suppressed, issueAuditResult.suppressed) &&
        Objects.equals(this.userName, issueAuditResult.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTagValues, id, issueInstanceId, projectVersionId, revision, suppressed, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueAuditResult {\n");
    
    sb.append("    customTagValues: ").append(toIndentedString(customTagValues)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueInstanceId: ").append(toIndentedString(issueInstanceId)).append("\n");
    sb.append("    projectVersionId: ").append(toIndentedString(projectVersionId)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

