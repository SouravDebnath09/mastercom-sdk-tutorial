/*
 * MasterCom
 * MasterCom
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.mastercom.model;

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
 * GetQueueContentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class GetQueueContentRequest {
  public static final String SERIALIZED_NAME_QUEUE_NAME = "queueName";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  private String queueName;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE_FROM = "lastModifiedDateFrom";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE_FROM)
  private String lastModifiedDateFrom;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE_TO = "lastModifiedDateTo";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE_TO)
  private String lastModifiedDateTo;

  public static final String SERIALIZED_NAME_PAGE_NB = "pageNb";
  @SerializedName(SERIALIZED_NAME_PAGE_NB)
  private String pageNb;


  public GetQueueContentRequest queueName(String queueName) {
    
    this.queueName = queueName;
    return this;
  }

   /**
   * The queue to be queried for a list of claims.   Length: 1-30   Valid Values/Format: Alpha
   * @return queueName
  **/
  @ApiModelProperty(example = "Rejects", required = true, value = "The queue to be queried for a list of claims.   Length: 1-30   Valid Values/Format: Alpha")

  public String getQueueName() {
    return queueName;
  }


  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  public GetQueueContentRequest lastModifiedDateFrom(String lastModifiedDateFrom) {
    
    this.lastModifiedDateFrom = lastModifiedDateFrom;
    return this;
  }

   /**
   * Start of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateFrom is provided then lastModifiedDateTo is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm)
   * @return lastModifiedDateFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-15T12:01", value = "Start of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateFrom is provided then lastModifiedDateTo is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm)")

  public String getLastModifiedDateFrom() {
    return lastModifiedDateFrom;
  }


  public void setLastModifiedDateFrom(String lastModifiedDateFrom) {
    this.lastModifiedDateFrom = lastModifiedDateFrom;
  }


  public GetQueueContentRequest lastModifiedDateTo(String lastModifiedDateTo) {
    
    this.lastModifiedDateTo = lastModifiedDateTo;
    return this;
  }

   /**
   * End of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateTo is provided then lastModifiedDateFrom is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm)
   * @return lastModifiedDateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-15T12:01", value = "End of claim’s last modified date range.   CONDITIONAL: If lastModifiedDateTo is provided then lastModifiedDateFrom is required.   Length: 16   Valid Values/Format: Date (yyyy-MM-ddTHH:mm)")

  public String getLastModifiedDateTo() {
    return lastModifiedDateTo;
  }


  public void setLastModifiedDateTo(String lastModifiedDateTo) {
    this.lastModifiedDateTo = lastModifiedDateTo;
  }


  public GetQueueContentRequest pageNb(String pageNb) {
    
    this.pageNb = pageNb;
    return this;
  }

   /**
   * The queue data will be retrieved in separate sets.  The pageNb field indicates which page should be returned.  The total page counts available in a date range will be returned in the pageCount field. Possible values are 1,2,3 etc. If page number is not provided, value will default to 1.   Length: 1-3   Valid Values/Format: Numeric
   * @return pageNb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The queue data will be retrieved in separate sets.  The pageNb field indicates which page should be returned.  The total page counts available in a date range will be returned in the pageCount field. Possible values are 1,2,3 etc. If page number is not provided, value will default to 1.   Length: 1-3   Valid Values/Format: Numeric")

  public String getPageNb() {
    return pageNb;
  }


  public void setPageNb(String pageNb) {
    this.pageNb = pageNb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQueueContentRequest getQueueContentRequest = (GetQueueContentRequest) o;
    return Objects.equals(this.queueName, getQueueContentRequest.queueName) &&
        Objects.equals(this.lastModifiedDateFrom, getQueueContentRequest.lastModifiedDateFrom) &&
        Objects.equals(this.lastModifiedDateTo, getQueueContentRequest.lastModifiedDateTo) &&
        Objects.equals(this.pageNb, getQueueContentRequest.pageNb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, lastModifiedDateFrom, lastModifiedDateTo, pageNb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQueueContentRequest {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    lastModifiedDateFrom: ").append(toIndentedString(lastModifiedDateFrom)).append("\n");
    sb.append("    lastModifiedDateTo: ").append(toIndentedString(lastModifiedDateTo)).append("\n");
    sb.append("    pageNb: ").append(toIndentedString(pageNb)).append("\n");
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
