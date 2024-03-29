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
import com.mastercard.api.mastercom.model.ExpeditedBillingDrfDocumentStructure;
import com.mastercard.api.mastercom.model.SmsLinkedCaseFilingDrfDocumentStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * When CaseFilingEbdfDocuments is used for automatic EBDF document generation of expeditedBillingDrfDocument  (form name of Dispute Resolution Form - Pre-Compliance/Compliance)  or smsLinkedCaseFilingDrfDocument no other documents should be attached on the call. Attaching documents will lead to call failure.
 */
@ApiModel(description = "When CaseFilingEbdfDocuments is used for automatic EBDF document generation of expeditedBillingDrfDocument  (form name of Dispute Resolution Form - Pre-Compliance/Compliance)  or smsLinkedCaseFilingDrfDocument no other documents should be attached on the call. Attaching documents will lead to call failure.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CaseFilingEbdfStructure {
  public static final String SERIALIZED_NAME_EXPEDITED_BILLING_DRF_DOCUMENT = "expeditedBillingDrfDocument";
  @SerializedName(SERIALIZED_NAME_EXPEDITED_BILLING_DRF_DOCUMENT)
  private ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument;

  public static final String SERIALIZED_NAME_SMS_LINKED_CASE_FILING_DRF_DOCUMENT = "smsLinkedCaseFilingDrfDocument";
  @SerializedName(SERIALIZED_NAME_SMS_LINKED_CASE_FILING_DRF_DOCUMENT)
  private SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument;


  public CaseFilingEbdfStructure expeditedBillingDrfDocument(ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument) {
    
    this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
    return this;
  }

   /**
   * Get expeditedBillingDrfDocument
   * @return expeditedBillingDrfDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpeditedBillingDrfDocumentStructure getExpeditedBillingDrfDocument() {
    return expeditedBillingDrfDocument;
  }


  public void setExpeditedBillingDrfDocument(ExpeditedBillingDrfDocumentStructure expeditedBillingDrfDocument) {
    this.expeditedBillingDrfDocument = expeditedBillingDrfDocument;
  }


  public CaseFilingEbdfStructure smsLinkedCaseFilingDrfDocument(SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument) {
    
    this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
    return this;
  }

   /**
   * Get smsLinkedCaseFilingDrfDocument
   * @return smsLinkedCaseFilingDrfDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmsLinkedCaseFilingDrfDocumentStructure getSmsLinkedCaseFilingDrfDocument() {
    return smsLinkedCaseFilingDrfDocument;
  }


  public void setSmsLinkedCaseFilingDrfDocument(SmsLinkedCaseFilingDrfDocumentStructure smsLinkedCaseFilingDrfDocument) {
    this.smsLinkedCaseFilingDrfDocument = smsLinkedCaseFilingDrfDocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseFilingEbdfStructure caseFilingEbdfStructure = (CaseFilingEbdfStructure) o;
    return Objects.equals(this.expeditedBillingDrfDocument, caseFilingEbdfStructure.expeditedBillingDrfDocument) &&
        Objects.equals(this.smsLinkedCaseFilingDrfDocument, caseFilingEbdfStructure.smsLinkedCaseFilingDrfDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expeditedBillingDrfDocument, smsLinkedCaseFilingDrfDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseFilingEbdfStructure {\n");
    sb.append("    expeditedBillingDrfDocument: ").append(toIndentedString(expeditedBillingDrfDocument)).append("\n");
    sb.append("    smsLinkedCaseFilingDrfDocument: ").append(toIndentedString(smsLinkedCaseFilingDrfDocument)).append("\n");
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

