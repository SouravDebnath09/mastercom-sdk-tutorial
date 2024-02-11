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
import java.util.ArrayList;
import java.util.List;

/**
 * CaseFilingDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CaseFilingDetails {
  public static final String SERIALIZED_NAME_CLAIM_ID = "claimId";
  @SerializedName(SERIALIZED_NAME_CLAIM_ID)
  private String claimId;

  public static final String SERIALIZED_NAME_CLAIM_TYPE = "claimType";
  @SerializedName(SERIALIZED_NAME_CLAIM_TYPE)
  private String claimType;

  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_CASE_TYPE = "caseType";
  @SerializedName(SERIALIZED_NAME_CASE_TYPE)
  private String caseType;

  public static final String SERIALIZED_NAME_CHARGEBACK_REF_NUM = "chargebackRefNum";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_REF_NUM)
  private List<String> chargebackRefNum = null;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CUSTOMER_FILING_NUMBER = "customerFilingNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FILING_NUMBER)
  private String customerFilingNumber;

  public static final String SERIALIZED_NAME_CREDIT_DATE = "creditDate";
  @SerializedName(SERIALIZED_NAME_CREDIT_DATE)
  private String creditDate;

  public static final String SERIALIZED_NAME_CHARGEBACK_DATE = "chargebackDate";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_DATE)
  private String chargebackDate;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_DISPUTE_AMOUNT = "disputeAmount";
  @SerializedName(SERIALIZED_NAME_DISPUTE_AMOUNT)
  private String disputeAmount;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_FILING_AGAINTST_ICA = "filingAgaintstIca";
  @SerializedName(SERIALIZED_NAME_FILING_AGAINTST_ICA)
  private String filingAgaintstIca;

  public static final String SERIALIZED_NAME_FILING_AS = "filingAs";
  @SerializedName(SERIALIZED_NAME_FILING_AS)
  private String filingAs;

  public static final String SERIALIZED_NAME_FILING_ICA = "filingIca";
  @SerializedName(SERIALIZED_NAME_FILING_ICA)
  private String filingIca;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_PRIMARY_ACCOUNT_NUM = "primaryAccountNum";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ACCOUNT_NUM)
  private String primaryAccountNum;

  public static final String SERIALIZED_NAME_VIOLATION_CODE = "violationCode";
  @SerializedName(SERIALIZED_NAME_VIOLATION_CODE)
  private String violationCode;

  public static final String SERIALIZED_NAME_VIOLATION_DATE = "violationDate";
  @SerializedName(SERIALIZED_NAME_VIOLATION_DATE)
  private String violationDate;

  public static final String SERIALIZED_NAME_RULING_DATE = "rulingDate";
  @SerializedName(SERIALIZED_NAME_RULING_DATE)
  private String rulingDate;

  public static final String SERIALIZED_NAME_RULING_STATUS = "rulingStatus";
  @SerializedName(SERIALIZED_NAME_RULING_STATUS)
  private String rulingStatus;

  public static final String SERIALIZED_NAME_VIRTUAL_ACCOUNT_NUM = "virtualAccountNum";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_ACCOUNT_NUM)
  private String virtualAccountNum;


  public CaseFilingDetails claimId(String claimId) {
    
    this.claimId = claimId;
    return this;
  }

   /**
   * Claim identifier associated with the standard claimId
   * @return claimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200002020654", value = "Claim identifier associated with the standard claimId")

  public String getClaimId() {
    return claimId;
  }


  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }


  public CaseFilingDetails claimType(String claimType) {
    
    this.claimType = claimType;
    return this;
  }

   /**
   * Claim Type
   * @return claimType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Standard", value = "Claim Type")

  public String getClaimType() {
    return claimType;
  }


  public void setClaimType(String claimType) {
    this.claimType = claimType;
  }


  public CaseFilingDetails caseId(String caseId) {
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Identifier assigned to the case filing
   * @return caseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "536092", value = "Identifier assigned to the case filing")

  public String getCaseId() {
    return caseId;
  }


  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  public CaseFilingDetails caseType(String caseType) {
    
    this.caseType = caseType;
    return this;
  }

   /**
   * Type of Case Filing. The following number values represent each case type.  1-Pre-arbitration  2-Arbitration  3-Pre-compliance 4-Compliance
   * @return caseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Type of Case Filing. The following number values represent each case type.  1-Pre-arbitration  2-Arbitration  3-Pre-compliance 4-Compliance")

  public String getCaseType() {
    return caseType;
  }


  public void setCaseType(String caseType) {
    this.caseType = caseType;
  }


  public CaseFilingDetails chargebackRefNum(List<String> chargebackRefNum) {
    
    this.chargebackRefNum = chargebackRefNum;
    return this;
  }

  public CaseFilingDetails addChargebackRefNumItem(String chargebackRefNumItem) {
    if (this.chargebackRefNum == null) {
      this.chargebackRefNum = new ArrayList<String>();
    }
    this.chargebackRefNum.add(chargebackRefNumItem);
    return this;
  }

   /**
   * A list of Chargeback Reference numbers
   * @return chargebackRefNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234123456", value = "A list of Chargeback Reference numbers")

  public List<String> getChargebackRefNum() {
    return chargebackRefNum;
  }


  public void setChargebackRefNum(List<String> chargebackRefNum) {
    this.chargebackRefNum = chargebackRefNum;
  }


  public CaseFilingDetails currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The case currency. Value should be standard alpha currency code.   For domestic transactions: domestic currency or USD   For cross-border transactions: USD or EUR, per Global Clearing Management System rules   Length: 3   Valid values/format: USD, EUR, GBP, MXN etc and A-Z (uppercase alphabetic letter)  
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The case currency. Value should be standard alpha currency code.   For domestic transactions: domestic currency or USD   For cross-border transactions: USD or EUR, per Global Clearing Management System rules   Length: 3   Valid values/format: USD, EUR, GBP, MXN etc and A-Z (uppercase alphabetic letter)  ")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public CaseFilingDetails customerFilingNumber(String customerFilingNumber) {
    
    this.customerFilingNumber = customerFilingNumber;
    return this;
  }

   /**
   * Customer filing number which is the filing party&#39;s internal number
   * @return customerFilingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5482", value = "Customer filing number which is the filing party's internal number")

  public String getCustomerFilingNumber() {
    return customerFilingNumber;
  }


  public void setCustomerFilingNumber(String customerFilingNumber) {
    this.customerFilingNumber = customerFilingNumber;
  }


  public CaseFilingDetails creditDate(String creditDate) {
    
    this.creditDate = creditDate;
    return this;
  }

   /**
   * Credit date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd
   * @return creditDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-14", value = "Credit date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd")

  public String getCreditDate() {
    return creditDate;
  }


  public void setCreditDate(String creditDate) {
    this.creditDate = creditDate;
  }


  public CaseFilingDetails chargebackDate(String chargebackDate) {
    
    this.chargebackDate = chargebackDate;
    return this;
  }

   /**
   * Chargeback date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd
   * @return chargebackDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-12", value = "Chargeback date when the violationCode is 1.4 in the case of pre-compliance or compliance case filing. The format should be yyyy-MM-dd")

  public String getChargebackDate() {
    return chargebackDate;
  }


  public void setChargebackDate(String chargebackDate) {
    this.chargebackDate = chargebackDate;
  }


  public CaseFilingDetails reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason code is returned when the case type is pre-arbitration or arbitration.
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4853", value = "Reason code is returned when the case type is pre-arbitration or arbitration.")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public CaseFilingDetails disputeAmount(String disputeAmount) {
    
    this.disputeAmount = disputeAmount;
    return this;
  }

   /**
   * Dispute amount.  The currency will be determined by the ICA region entered in the Filed ICA and Filed Against ICA
   * @return disputeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "Dispute amount.  The currency will be determined by the ICA region entered in the Filed ICA and Filed Against ICA")

  public String getDisputeAmount() {
    return disputeAmount;
  }


  public void setDisputeAmount(String disputeAmount) {
    this.disputeAmount = disputeAmount;
  }


  public CaseFilingDetails dueDate(String dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Due date when the response is required.  The format should be yyyy-MM-dd
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-14", value = "Due date when the response is required.  The format should be yyyy-MM-dd")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  public CaseFilingDetails filingAgaintstIca(String filingAgaintstIca) {
    
    this.filingAgaintstIca = filingAgaintstIca;
    return this;
  }

   /**
   * Filed Against ICA
   * @return filingAgaintstIca
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001111", value = "Filed Against ICA")

  public String getFilingAgaintstIca() {
    return filingAgaintstIca;
  }


  public void setFilingAgaintstIca(String filingAgaintstIca) {
    this.filingAgaintstIca = filingAgaintstIca;
  }


  public CaseFilingDetails filingAs(String filingAs) {
    
    this.filingAs = filingAs;
    return this;
  }

   /**
   * Filing case as Issuer or Acquirer. Following values represents each type I-ISSUER  A-ACQUIRER
   * @return filingAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Filing case as Issuer or Acquirer. Following values represents each type I-ISSUER  A-ACQUIRER")

  public String getFilingAs() {
    return filingAs;
  }


  public void setFilingAs(String filingAs) {
    this.filingAs = filingAs;
  }


  public CaseFilingDetails filingIca(String filingIca) {
    
    this.filingIca = filingIca;
    return this;
  }

   /**
   * Filing ICA
   * @return filingIca
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "002222", value = "Filing ICA")

  public String getFilingIca() {
    return filingIca;
  }


  public void setFilingIca(String filingIca) {
    this.filingIca = filingIca;
  }


  public CaseFilingDetails merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant name for filing pre-arbitration and arbitration case
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test name", value = "Merchant name for filing pre-arbitration and arbitration case")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public CaseFilingDetails primaryAccountNum(String primaryAccountNum) {
    
    this.primaryAccountNum = primaryAccountNum;
    return this;
  }

   /**
   * The primary account number
   * @return primaryAccountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5123123412341234", value = "The primary account number")

  public String getPrimaryAccountNum() {
    return primaryAccountNum;
  }


  public void setPrimaryAccountNum(String primaryAccountNum) {
    this.primaryAccountNum = primaryAccountNum;
  }


  public CaseFilingDetails violationCode(String violationCode) {
    
    this.violationCode = violationCode;
    return this;
  }

   /**
   * Violation code
   * @return violationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D.2", value = "Violation code")

  public String getViolationCode() {
    return violationCode;
  }


  public void setViolationCode(String violationCode) {
    this.violationCode = violationCode;
  }


  public CaseFilingDetails violationDate(String violationDate) {
    
    this.violationDate = violationDate;
    return this;
  }

   /**
   * Violation Date
   * @return violationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-14", value = "Violation Date")

  public String getViolationDate() {
    return violationDate;
  }


  public void setViolationDate(String violationDate) {
    this.violationDate = violationDate;
  }


  public CaseFilingDetails rulingDate(String rulingDate) {
    
    this.rulingDate = rulingDate;
    return this;
  }

   /**
   * Ruling Date
   * @return rulingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-02-14", value = "Ruling Date")

  public String getRulingDate() {
    return rulingDate;
  }


  public void setRulingDate(String rulingDate) {
    this.rulingDate = rulingDate;
  }


  public CaseFilingDetails rulingStatus(String rulingStatus) {
    
    this.rulingStatus = rulingStatus;
    return this;
  }

   /**
   * Ruling Status.  Valid values are Reviewed, Filed In Error, Declined, Expired, Favor Sender, Favor Receiver
   * @return rulingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Reviewed", value = "Ruling Status.  Valid values are Reviewed, Filed In Error, Declined, Expired, Favor Sender, Favor Receiver")

  public String getRulingStatus() {
    return rulingStatus;
  }


  public void setRulingStatus(String rulingStatus) {
    this.rulingStatus = rulingStatus;
  }


  public CaseFilingDetails virtualAccountNum(String virtualAccountNum) {
    
    this.virtualAccountNum = virtualAccountNum;
    return this;
  }

   /**
   * The virtual account number
   * @return virtualAccountNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5123123424999876", value = "The virtual account number")

  public String getVirtualAccountNum() {
    return virtualAccountNum;
  }


  public void setVirtualAccountNum(String virtualAccountNum) {
    this.virtualAccountNum = virtualAccountNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingDetails caseFilingDetails = (CaseFilingDetails) o;
    return Objects.equals(this.claimId, caseFilingDetails.claimId) &&
        Objects.equals(this.claimType, caseFilingDetails.claimType) &&
        Objects.equals(this.caseId, caseFilingDetails.caseId) &&
        Objects.equals(this.caseType, caseFilingDetails.caseType) &&
        Objects.equals(this.chargebackRefNum, caseFilingDetails.chargebackRefNum) &&
        Objects.equals(this.currencyCode, caseFilingDetails.currencyCode) &&
        Objects.equals(this.customerFilingNumber, caseFilingDetails.customerFilingNumber) &&
        Objects.equals(this.creditDate, caseFilingDetails.creditDate) &&
        Objects.equals(this.chargebackDate, caseFilingDetails.chargebackDate) &&
        Objects.equals(this.reasonCode, caseFilingDetails.reasonCode) &&
        Objects.equals(this.disputeAmount, caseFilingDetails.disputeAmount) &&
        Objects.equals(this.dueDate, caseFilingDetails.dueDate) &&
        Objects.equals(this.filingAgaintstIca, caseFilingDetails.filingAgaintstIca) &&
        Objects.equals(this.filingAs, caseFilingDetails.filingAs) &&
        Objects.equals(this.filingIca, caseFilingDetails.filingIca) &&
        Objects.equals(this.merchantName, caseFilingDetails.merchantName) &&
        Objects.equals(this.primaryAccountNum, caseFilingDetails.primaryAccountNum) &&
        Objects.equals(this.violationCode, caseFilingDetails.violationCode) &&
        Objects.equals(this.violationDate, caseFilingDetails.violationDate) &&
        Objects.equals(this.rulingDate, caseFilingDetails.rulingDate) &&
        Objects.equals(this.rulingStatus, caseFilingDetails.rulingStatus) &&
        Objects.equals(this.virtualAccountNum, caseFilingDetails.virtualAccountNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, claimType, caseId, caseType, chargebackRefNum, currencyCode, customerFilingNumber, creditDate, chargebackDate, reasonCode, disputeAmount, dueDate, filingAgaintstIca, filingAs, filingIca, merchantName, primaryAccountNum, violationCode, violationDate, rulingDate, rulingStatus, virtualAccountNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingDetails {\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    claimType: ").append(toIndentedString(claimType)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
    sb.append("    chargebackRefNum: ").append(toIndentedString(chargebackRefNum)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    customerFilingNumber: ").append(toIndentedString(customerFilingNumber)).append("\n");
    sb.append("    creditDate: ").append(toIndentedString(creditDate)).append("\n");
    sb.append("    chargebackDate: ").append(toIndentedString(chargebackDate)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    disputeAmount: ").append(toIndentedString(disputeAmount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    filingAgaintstIca: ").append(toIndentedString(filingAgaintstIca)).append("\n");
    sb.append("    filingAs: ").append(toIndentedString(filingAs)).append("\n");
    sb.append("    filingIca: ").append(toIndentedString(filingIca)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    primaryAccountNum: ").append(toIndentedString(primaryAccountNum)).append("\n");
    sb.append("    violationCode: ").append(toIndentedString(violationCode)).append("\n");
    sb.append("    violationDate: ").append(toIndentedString(violationDate)).append("\n");
    sb.append("    rulingDate: ").append(toIndentedString(rulingDate)).append("\n");
    sb.append("    rulingStatus: ").append(toIndentedString(rulingStatus)).append("\n");
    sb.append("    virtualAccountNum: ").append(toIndentedString(virtualAccountNum)).append("\n");
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

