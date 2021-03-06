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
import org.threeten.bp.OffsetDateTime;

/**
 * An audit comment associated with an issue
 */
@ApiModel(description = "An audit comment associated with an issue")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueAuditComment {
  @SerializedName("auditTime")
  private OffsetDateTime auditTime = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("issueId")
  private Long issueId = null;

  @SerializedName("issueInstanceId")
  private String issueInstanceId = null;

  @SerializedName("issueName")
  private String issueName = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectVersionId")
  private Long projectVersionId = null;

  @SerializedName("projectVersionName")
  private String projectVersionName = null;

  @SerializedName("seqNumber")
  private Integer seqNumber = null;

  @SerializedName("userName")
  private String userName = null;

   /**
   * Get auditTime
   * @return auditTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getAuditTime() {
    return auditTime;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "")
  public String getComment() {
    return comment;
  }

   /**
   * Get issueId
   * @return issueId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getIssueId() {
    return issueId;
  }

   /**
   * Get issueInstanceId
   * @return issueInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getIssueInstanceId() {
    return issueInstanceId;
  }

   /**
   * Get issueName
   * @return issueName
  **/
  @ApiModelProperty(value = "")
  public String getIssueName() {
    return issueName;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }

   /**
   * Get projectVersionId
   * @return projectVersionId
  **/
  @ApiModelProperty(value = "")
  public Long getProjectVersionId() {
    return projectVersionId;
  }

   /**
   * Get projectVersionName
   * @return projectVersionName
  **/
  @ApiModelProperty(value = "")
  public String getProjectVersionName() {
    return projectVersionName;
  }

   /**
   * Get seqNumber
   * @return seqNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSeqNumber() {
    return seqNumber;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "")
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
    IssueAuditComment issueAuditComment = (IssueAuditComment) o;
    return Objects.equals(this.auditTime, issueAuditComment.auditTime) &&
        Objects.equals(this.comment, issueAuditComment.comment) &&
        Objects.equals(this.issueId, issueAuditComment.issueId) &&
        Objects.equals(this.issueInstanceId, issueAuditComment.issueInstanceId) &&
        Objects.equals(this.issueName, issueAuditComment.issueName) &&
        Objects.equals(this.projectName, issueAuditComment.projectName) &&
        Objects.equals(this.projectVersionId, issueAuditComment.projectVersionId) &&
        Objects.equals(this.projectVersionName, issueAuditComment.projectVersionName) &&
        Objects.equals(this.seqNumber, issueAuditComment.seqNumber) &&
        Objects.equals(this.userName, issueAuditComment.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditTime, comment, issueId, issueInstanceId, issueName, projectName, projectVersionId, projectVersionName, seqNumber, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueAuditComment {\n");
    
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    issueInstanceId: ").append(toIndentedString(issueInstanceId)).append("\n");
    sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersionId: ").append(toIndentedString(projectVersionId)).append("\n");
    sb.append("    projectVersionName: ").append(toIndentedString(projectVersionName)).append("\n");
    sb.append("    seqNumber: ").append(toIndentedString(seqNumber)).append("\n");
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

