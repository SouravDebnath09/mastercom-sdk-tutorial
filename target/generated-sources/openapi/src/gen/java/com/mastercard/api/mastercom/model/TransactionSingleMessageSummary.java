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
import com.mastercard.api.mastercom.model.SingleMessageSummaryDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionSingleMessageSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class TransactionSingleMessageSummary {
  public static final String SERIALIZED_NAME_AUTH_TRANSACTION_ID = "authTransactionId";
  @SerializedName(SERIALIZED_NAME_AUTH_TRANSACTION_ID)
  private String authTransactionId;

  public static final String SERIALIZED_NAME_CLEARING_TRANSACTION_ID = "clearingTransactionId";
  @SerializedName(SERIALIZED_NAME_CLEARING_TRANSACTION_ID)
  private String clearingTransactionId;

  public static final String SERIALIZED_NAME_SINGLE_MESSAGE_SUMMARY_DETAILS = "singleMessageSummaryDetails";
  @SerializedName(SERIALIZED_NAME_SINGLE_MESSAGE_SUMMARY_DETAILS)
  private SingleMessageSummaryDetails singleMessageSummaryDetails;


  public TransactionSingleMessageSummary authTransactionId(String authTransactionId) {
    
    this.authTransactionId = authTransactionId;
    return this;
  }

   /**
   * Authorization Transaction Identifier
   * @return authTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hqCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTzSfaIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y=", value = "Authorization Transaction Identifier")

  public String getAuthTransactionId() {
    return authTransactionId;
  }


  public void setAuthTransactionId(String authTransactionId) {
    this.authTransactionId = authTransactionId;
  }


  public TransactionSingleMessageSummary clearingTransactionId(String clearingTransactionId) {
    
    this.clearingTransactionId = clearingTransactionId;
    return this;
  }

   /**
   * Authorization Transaction Identifier
   * @return clearingTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ccCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTzSfaIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y=", value = "Authorization Transaction Identifier")

  public String getClearingTransactionId() {
    return clearingTransactionId;
  }


  public void setClearingTransactionId(String clearingTransactionId) {
    this.clearingTransactionId = clearingTransactionId;
  }


  public TransactionSingleMessageSummary singleMessageSummaryDetails(SingleMessageSummaryDetails singleMessageSummaryDetails) {
    
    this.singleMessageSummaryDetails = singleMessageSummaryDetails;
    return this;
  }

   /**
   * Get singleMessageSummaryDetails
   * @return singleMessageSummaryDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SingleMessageSummaryDetails getSingleMessageSummaryDetails() {
    return singleMessageSummaryDetails;
  }


  public void setSingleMessageSummaryDetails(SingleMessageSummaryDetails singleMessageSummaryDetails) {
    this.singleMessageSummaryDetails = singleMessageSummaryDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSingleMessageSummary transactionSingleMessageSummary = (TransactionSingleMessageSummary) o;
    return Objects.equals(this.authTransactionId, transactionSingleMessageSummary.authTransactionId) &&
        Objects.equals(this.clearingTransactionId, transactionSingleMessageSummary.clearingTransactionId) &&
        Objects.equals(this.singleMessageSummaryDetails, transactionSingleMessageSummary.singleMessageSummaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authTransactionId, clearingTransactionId, singleMessageSummaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSingleMessageSummary {\n");
    sb.append("    authTransactionId: ").append(toIndentedString(authTransactionId)).append("\n");
    sb.append("    clearingTransactionId: ").append(toIndentedString(clearingTransactionId)).append("\n");
    sb.append("    singleMessageSummaryDetails: ").append(toIndentedString(singleMessageSummaryDetails)).append("\n");
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
