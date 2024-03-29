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
 * TransactionSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class TransactionSearchRequest {
  public static final String SERIALIZED_NAME_ACQUIRER_REF_NUMBER = "acquirerRefNumber";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_REF_NUMBER)
  private String acquirerRefNumber;

  public static final String SERIALIZED_NAME_BANK_NET_REF_NUMBER = "bankNetRefNumber";
  @SerializedName(SERIALIZED_NAME_BANK_NET_REF_NUMBER)
  private String bankNetRefNumber;

  public static final String SERIALIZED_NAME_PRIMARY_ACCOUNT_NUM = "primaryAccountNum";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ACCOUNT_NUM)
  private String primaryAccountNum;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT_FROM = "transAmountFrom";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT_FROM)
  private String transAmountFrom;

  public static final String SERIALIZED_NAME_TRANS_AMOUNT_TO = "transAmountTo";
  @SerializedName(SERIALIZED_NAME_TRANS_AMOUNT_TO)
  private String transAmountTo;

  public static final String SERIALIZED_NAME_TRAN_START_DATE = "tranStartDate";
  @SerializedName(SERIALIZED_NAME_TRAN_START_DATE)
  private String tranStartDate;

  public static final String SERIALIZED_NAME_TRAN_END_DATE = "tranEndDate";
  @SerializedName(SERIALIZED_NAME_TRAN_END_DATE)
  private String tranEndDate;


  public TransactionSearchRequest acquirerRefNumber(String acquirerRefNumber) {
    
    this.acquirerRefNumber = acquirerRefNumber;
    return this;
  }

   /**
   * CONDITIONAL: Acquirer Reference Number. If provided bankNetRefNumber may not be used. This field is required and applicable if primaryAccountNum is not provided.   Length: 23   Valid Values/Format: Numeric
   * @return acquirerRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05436847276000293995738", value = "CONDITIONAL: Acquirer Reference Number. If provided bankNetRefNumber may not be used. This field is required and applicable if primaryAccountNum is not provided.   Length: 23   Valid Values/Format: Numeric")

  public String getAcquirerRefNumber() {
    return acquirerRefNumber;
  }


  public void setAcquirerRefNumber(String acquirerRefNumber) {
    this.acquirerRefNumber = acquirerRefNumber;
  }


  public TransactionSearchRequest bankNetRefNumber(String bankNetRefNumber) {
    
    this.bankNetRefNumber = bankNetRefNumber;
    return this;
  }

   /**
   * CONDITIONAL: This field is comprised of the Financial Network Code + Banknet Reference Number. If provided, must provide PAN in primaryAccountNum parameter. If provided, cannot use acquirerRefNumber parameter.  Length: 9  Valid Values/Format: Alphanumeric
   * @return bankNetRefNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MPLU68FRG", value = "CONDITIONAL: This field is comprised of the Financial Network Code + Banknet Reference Number. If provided, must provide PAN in primaryAccountNum parameter. If provided, cannot use acquirerRefNumber parameter.  Length: 9  Valid Values/Format: Alphanumeric")

  public String getBankNetRefNumber() {
    return bankNetRefNumber;
  }


  public void setBankNetRefNumber(String bankNetRefNumber) {
    this.bankNetRefNumber = bankNetRefNumber;
  }


  public TransactionSearchRequest primaryAccountNum(String primaryAccountNum) {
    
    this.primaryAccountNum = primaryAccountNum;
    return this;
  }

   /**
   * CONDITIONAL: Primary Account Number. This field is required and applicable if acquirerRefNum is not provided.   Length: 11-19   Valid Values/Format: Numeric
   * @return primaryAccountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5488888888887192", value = "CONDITIONAL: Primary Account Number. This field is required and applicable if acquirerRefNum is not provided.   Length: 11-19   Valid Values/Format: Numeric")

  public String getPrimaryAccountNum() {
    return primaryAccountNum;
  }


  public void setPrimaryAccountNum(String primaryAccountNum) {
    this.primaryAccountNum = primaryAccountNum;
  }


  public TransactionSearchRequest transAmountFrom(String transAmountFrom) {
    
    this.transAmountFrom = transAmountFrom;
    return this;
  }

   /**
   * Transaction amount lower limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric
   * @return transAmountFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "Transaction amount lower limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric")

  public String getTransAmountFrom() {
    return transAmountFrom;
  }


  public void setTransAmountFrom(String transAmountFrom) {
    this.transAmountFrom = transAmountFrom;
  }


  public TransactionSearchRequest transAmountTo(String transAmountTo) {
    
    this.transAmountTo = transAmountTo;
    return this;
  }

   /**
   * Transaction amount upper limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric
   * @return transAmountTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20050", value = "Transaction amount upper limit value to be searched.   Length: 0-12   Valid Values/Format: Numeric")

  public String getTransAmountTo() {
    return transAmountTo;
  }


  public void setTransAmountTo(String transAmountTo) {
    this.transAmountTo = transAmountTo;
  }


  public TransactionSearchRequest tranStartDate(String tranStartDate) {
    
    this.tranStartDate = tranStartDate;
    return this;
  }

   /**
   * Transaction Date min search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return tranStartDate
  **/
  @ApiModelProperty(example = "2021-01-01", required = true, value = "Transaction Date min search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getTranStartDate() {
    return tranStartDate;
  }


  public void setTranStartDate(String tranStartDate) {
    this.tranStartDate = tranStartDate;
  }


  public TransactionSearchRequest tranEndDate(String tranEndDate) {
    
    this.tranEndDate = tranEndDate;
    return this;
  }

   /**
   * Transaction Date max search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return tranEndDate
  **/
  @ApiModelProperty(example = "2021-01-30", required = true, value = "Transaction Date max search range.  The search range is a maximum of 30 days, and searches can be completed for up to 730 days of history.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getTranEndDate() {
    return tranEndDate;
  }


  public void setTranEndDate(String tranEndDate) {
    this.tranEndDate = tranEndDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSearchRequest transactionSearchRequest = (TransactionSearchRequest) o;
    return Objects.equals(this.acquirerRefNumber, transactionSearchRequest.acquirerRefNumber) &&
        Objects.equals(this.bankNetRefNumber, transactionSearchRequest.bankNetRefNumber) &&
        Objects.equals(this.primaryAccountNum, transactionSearchRequest.primaryAccountNum) &&
        Objects.equals(this.transAmountFrom, transactionSearchRequest.transAmountFrom) &&
        Objects.equals(this.transAmountTo, transactionSearchRequest.transAmountTo) &&
        Objects.equals(this.tranStartDate, transactionSearchRequest.tranStartDate) &&
        Objects.equals(this.tranEndDate, transactionSearchRequest.tranEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerRefNumber, bankNetRefNumber, primaryAccountNum, transAmountFrom, transAmountTo, tranStartDate, tranEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSearchRequest {\n");
    sb.append("    acquirerRefNumber: ").append(toIndentedString(acquirerRefNumber)).append("\n");
    sb.append("    bankNetRefNumber: ").append(toIndentedString(bankNetRefNumber)).append("\n");
    sb.append("    primaryAccountNum: ").append(toIndentedString(primaryAccountNum)).append("\n");
    sb.append("    transAmountFrom: ").append(toIndentedString(transAmountFrom)).append("\n");
    sb.append("    transAmountTo: ").append(toIndentedString(transAmountTo)).append("\n");
    sb.append("    tranStartDate: ").append(toIndentedString(tranStartDate)).append("\n");
    sb.append("    tranEndDate: ").append(toIndentedString(tranEndDate)).append("\n");
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

