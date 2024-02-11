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
import com.mastercard.api.mastercom.model.ChargebackEbdfStructure;
import com.mastercard.api.mastercom.model.DocumentStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateChargebackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CreateChargebackRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  /**
   * Provide the chargeback.   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT
   */
  @JsonAdapter(ChargebackTypeEnum.Adapter.class)
  public enum ChargebackTypeEnum {
    CHARGEBACK("CHARGEBACK"),
    
    SECOND_PRESENTMENT("SECOND_PRESENTMENT");

    private String value;

    ChargebackTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargebackTypeEnum fromValue(String value) {
      for (ChargebackTypeEnum b : ChargebackTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChargebackTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargebackTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargebackTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChargebackTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHARGEBACK_TYPE = "chargebackType";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_TYPE)
  private ChargebackTypeEnum chargebackType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DOCUMENT_INDICATOR = "documentIndicator";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_INDICATOR)
  private String documentIndicator;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_CRED_POSTED_AS_PURCHASE = "credPostedAsPurchase";
  @SerializedName(SERIALIZED_NAME_CRED_POSTED_AS_PURCHASE)
  private Boolean credPostedAsPurchase;

  public static final String SERIALIZED_NAME_IS_PARTIAL_CHARGEBACK = "isPartialChargeback";
  @SerializedName(SERIALIZED_NAME_IS_PARTIAL_CHARGEBACK)
  private Boolean isPartialChargeback;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT = "messageText";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT)
  private String messageText;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private String settlementDate;

  public static final String SERIALIZED_NAME_DISPUTE_CHARGEBACK_I_D = "disputeChargebackID";
  @SerializedName(SERIALIZED_NAME_DISPUTE_CHARGEBACK_I_D)
  private String disputeChargebackID;

  public static final String SERIALIZED_NAME_LOCAL_TAX1_I_V_A = "localTax1IVA";
  @SerializedName(SERIALIZED_NAME_LOCAL_TAX1_I_V_A)
  private String localTax1IVA;

  public static final String SERIALIZED_NAME_INSTALLMENT_FEE = "installmentFee";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_FEE)
  private String installmentFee;

  public static final String SERIALIZED_NAME_EDIT_EXCLUSION_CODE = "editExclusionCode";
  @SerializedName(SERIALIZED_NAME_EDIT_EXCLUSION_CODE)
  private String editExclusionCode;

  public static final String SERIALIZED_NAME_REFUND_NOT_RECEIVED_INDICATOR = "refundNotReceivedIndicator";
  @SerializedName(SERIALIZED_NAME_REFUND_NOT_RECEIVED_INDICATOR)
  private String refundNotReceivedIndicator;

  public static final String SERIALIZED_NAME_INCLUDE_CURRENCY_CONVERSION_ASSESSMENT_C_C_A = "includeCurrencyConversionAssessmentCCA";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CURRENCY_CONVERSION_ASSESSMENT_C_C_A)
  private String includeCurrencyConversionAssessmentCCA;

  public static final String SERIALIZED_NAME_FILE_ATTACHMENT = "fileAttachment";
  @SerializedName(SERIALIZED_NAME_FILE_ATTACHMENT)
  private DocumentStructure fileAttachment;

  public static final String SERIALIZED_NAME_CHARGEBACK_EBDF_DOCUMENTS = "chargebackEbdfDocuments";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_EBDF_DOCUMENTS)
  private ChargebackEbdfStructure chargebackEbdfDocuments;


  public CreateChargebackRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of CB should be OT amount (DE4). US Issuers should always submit in USD. For more details refer to the GCMS Reference Manual.   Length: 1-12   Valid Values/Format: Numeric
   * @return amount
  **/
  @ApiModelProperty(example = "100.00", required = true, value = "Amount of CB should be OT amount (DE4). US Issuers should always submit in USD. For more details refer to the GCMS Reference Manual.   Length: 1-12   Valid Values/Format: Numeric")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CreateChargebackRequest chargebackType(ChargebackTypeEnum chargebackType) {
    
    this.chargebackType = chargebackType;
    return this;
  }

   /**
   * Provide the chargeback.   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT
   * @return chargebackType
  **/
  @ApiModelProperty(example = "CHARGEBACK", required = true, value = "Provide the chargeback.   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT")

  public ChargebackTypeEnum getChargebackType() {
    return chargebackType;
  }


  public void setChargebackType(ChargebackTypeEnum chargebackType) {
    this.chargebackType = chargebackType;
  }


  public CreateChargebackRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The chargeback currency. The data should be standard currency alpha code or numeric code. Currency should correspond with the amount submitted for chargeback creation Length: 3 Valid Values/Format: A-Z (Uppercase Alphabetic Letter) OR Numeric
   * @return currency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "The chargeback currency. The data should be standard currency alpha code or numeric code. Currency should correspond with the amount submitted for chargeback creation Length: 3 Valid Values/Format: A-Z (Uppercase Alphabetic Letter) OR Numeric")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CreateChargebackRequest documentIndicator(String documentIndicator) {
    
    this.documentIndicator = documentIndicator;
    return this;
  }

   /**
   * Document Indicator defines if a document is required for the dispute.   Length: 4-5   Valid Values/Format: true / false
   * @return documentIndicator
  **/
  @ApiModelProperty(example = "true", required = true, value = "Document Indicator defines if a document is required for the dispute.   Length: 4-5   Valid Values/Format: true / false")

  public String getDocumentIndicator() {
    return documentIndicator;
  }


  public void setDocumentIndicator(String documentIndicator) {
    this.documentIndicator = documentIndicator;
  }


  public CreateChargebackRequest reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Chargeback Reason Code provides the chargeback receiver with the reason for sending the chargeback.   Length: 1-4   Valid Values/Format: Numeric
   * @return reasonCode
  **/
  @ApiModelProperty(example = "4853", required = true, value = "Chargeback Reason Code provides the chargeback receiver with the reason for sending the chargeback.   Length: 1-4   Valid Values/Format: Numeric")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public CreateChargebackRequest credPostedAsPurchase(Boolean credPostedAsPurchase) {
    
    this.credPostedAsPurchase = credPostedAsPurchase;
    return this;
  }

   /**
   * Indicator to notify this is a credit posted as a purchase.   Only applicable to reason codes of 4853 and 4860.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false
   * @return credPostedAsPurchase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicator to notify this is a credit posted as a purchase.   Only applicable to reason codes of 4853 and 4860.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false")

  public Boolean getCredPostedAsPurchase() {
    return credPostedAsPurchase;
  }


  public void setCredPostedAsPurchase(Boolean credPostedAsPurchase) {
    this.credPostedAsPurchase = credPostedAsPurchase;
  }


  public CreateChargebackRequest isPartialChargeback(Boolean isPartialChargeback) {
    
    this.isPartialChargeback = isPartialChargeback;
    return this;
  }

   /**
   * Indicates a partial chargeback.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false
   * @return isPartialChargeback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates a partial chargeback.  Defaults to false.   Length: 4-5   Valid Values/Format: true / false")

  public Boolean getIsPartialChargeback() {
    return isPartialChargeback;
  }


  public void setIsPartialChargeback(Boolean isPartialChargeback) {
    this.isPartialChargeback = isPartialChargeback;
  }


  public CreateChargebackRequest messageText(String messageText) {
    
    this.messageText = messageText;
    return this;
  }

   /**
   * Member message text to be used for the chargeback.   Length: 0-100   Valid Values/Format: Only Alphanumeric
   * @return messageText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a test message text", value = "Member message text to be used for the chargeback.   Length: 0-100   Valid Values/Format: Only Alphanumeric")

  public String getMessageText() {
    return messageText;
  }


  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }


  public CreateChargebackRequest settlementDate(String settlementDate) {
    
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * CONDITIONAL: Required for Argentina and Uruguay&#39;s Settlement Service participation ID codes (LA00003201, LA00003202, LA00085801, LA00085802, LA00084011, LA00084012). The date may not be prior to the current date or beyond 90 days from the current date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)
   * @return settlementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-22", value = "CONDITIONAL: Required for Argentina and Uruguay's Settlement Service participation ID codes (LA00003201, LA00003202, LA00085801, LA00085802, LA00084011, LA00084012). The date may not be prior to the current date or beyond 90 days from the current date.   Length: 10   Valid Values/Format: Date (yyyy-MM-dd)")

  public String getSettlementDate() {
    return settlementDate;
  }


  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
  }


  public CreateChargebackRequest disputeChargebackID(String disputeChargebackID) {
    
    this.disputeChargebackID = disputeChargebackID;
    return this;
  }

   /**
   * Accepts a chargeback ID when &#39;chargebackType&#39; is set to &#39;SECOND_PRESENTMENT&#39;   Length: 1-19   Valid Values/Format: Numeric
   * @return disputeChargebackID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300045678811", value = "Accepts a chargeback ID when 'chargebackType' is set to 'SECOND_PRESENTMENT'   Length: 1-19   Valid Values/Format: Numeric")

  public String getDisputeChargebackID() {
    return disputeChargebackID;
  }


  public void setDisputeChargebackID(String disputeChargebackID) {
    this.disputeChargebackID = disputeChargebackID;
  }


  public CreateChargebackRequest localTax1IVA(String localTax1IVA) {
    
    this.localTax1IVA = localTax1IVA;
    return this;
  }

   /**
   * Applies only to LAC installments (Argentina and Uruguay). PDS 1015. Contains the VAT amount for the installment fee.   Length: 4-6   Valid Values/Format: Numeric (2 Decimals)
   * @return localTax1IVA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.60", value = "Applies only to LAC installments (Argentina and Uruguay). PDS 1015. Contains the VAT amount for the installment fee.   Length: 4-6   Valid Values/Format: Numeric (2 Decimals)")

  public String getLocalTax1IVA() {
    return localTax1IVA;
  }


  public void setLocalTax1IVA(String localTax1IVA) {
    this.localTax1IVA = localTax1IVA;
  }


  public CreateChargebackRequest installmentFee(String installmentFee) {
    
    this.installmentFee = installmentFee;
    return this;
  }

   /**
   * Applies only to LAC installments (Argentina and Uruguay). PDS 1028. Contains the VAT amount for the installment fee.   Length: 1-12   Valid Values/Format: Numeric
   * @return installmentFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.2", value = "Applies only to LAC installments (Argentina and Uruguay). PDS 1028. Contains the VAT amount for the installment fee.   Length: 1-12   Valid Values/Format: Numeric")

  public String getInstallmentFee() {
    return installmentFee;
  }


  public void setInstallmentFee(String installmentFee) {
    this.installmentFee = installmentFee;
  }


  public CreateChargebackRequest editExclusionCode(String editExclusionCode) {
    
    this.editExclusionCode = editExclusionCode;
    return this;
  }

   /**
   * Edit exclusion code to bypass clearing system edits.   Length: 1-2   Valid Values/Format: Alphanumeric / Spaces. (Y,B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,BA,BB,BC,BD,BE,BF,BG,BH,BI,BJ,BK,BL,BM,BN,BO,BP,BQ,BR,BS,BT,BU,BV,BW,BX,BY,BZ,SPACES).
   * @return editExclusionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BO", value = "Edit exclusion code to bypass clearing system edits.   Length: 1-2   Valid Values/Format: Alphanumeric / Spaces. (Y,B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,BA,BB,BC,BD,BE,BF,BG,BH,BI,BJ,BK,BL,BM,BN,BO,BP,BQ,BR,BS,BT,BU,BV,BW,BX,BY,BZ,SPACES).")

  public String getEditExclusionCode() {
    return editExclusionCode;
  }


  public void setEditExclusionCode(String editExclusionCode) {
    this.editExclusionCode = editExclusionCode;
  }


  public CreateChargebackRequest refundNotReceivedIndicator(String refundNotReceivedIndicator) {
    
    this.refundNotReceivedIndicator = refundNotReceivedIndicator;
    return this;
  }

   /**
   * Cardholder/Issuer did not receive refund when a first chargeback was rejected by Collaboration with reason code 5000 indicating refund provided. 20 days after rejection of CB through collaboration.   CONDITIONAL: this field is only applicable if chargebackType is CHARGEBACK.   Length: 4-5   Valid Values/Format: true, false
   * @return refundNotReceivedIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Cardholder/Issuer did not receive refund when a first chargeback was rejected by Collaboration with reason code 5000 indicating refund provided. 20 days after rejection of CB through collaboration.   CONDITIONAL: this field is only applicable if chargebackType is CHARGEBACK.   Length: 4-5   Valid Values/Format: true, false")

  public String getRefundNotReceivedIndicator() {
    return refundNotReceivedIndicator;
  }


  public void setRefundNotReceivedIndicator(String refundNotReceivedIndicator) {
    this.refundNotReceivedIndicator = refundNotReceivedIndicator;
  }


  public CreateChargebackRequest includeCurrencyConversionAssessmentCCA(String includeCurrencyConversionAssessmentCCA) {
    
    this.includeCurrencyConversionAssessmentCCA = includeCurrencyConversionAssessmentCCA;
    return this;
  }

   /**
   * Currency Conversion Assessment amount applied for full first chargeback, to indicate, if Currency Conversion Assessment was included or not for qualified transactions.
   * @return includeCurrencyConversionAssessmentCCA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Currency Conversion Assessment amount applied for full first chargeback, to indicate, if Currency Conversion Assessment was included or not for qualified transactions.")

  public String getIncludeCurrencyConversionAssessmentCCA() {
    return includeCurrencyConversionAssessmentCCA;
  }


  public void setIncludeCurrencyConversionAssessmentCCA(String includeCurrencyConversionAssessmentCCA) {
    this.includeCurrencyConversionAssessmentCCA = includeCurrencyConversionAssessmentCCA;
  }


  public CreateChargebackRequest fileAttachment(DocumentStructure fileAttachment) {
    
    this.fileAttachment = fileAttachment;
    return this;
  }

   /**
   * Get fileAttachment
   * @return fileAttachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocumentStructure getFileAttachment() {
    return fileAttachment;
  }


  public void setFileAttachment(DocumentStructure fileAttachment) {
    this.fileAttachment = fileAttachment;
  }


  public CreateChargebackRequest chargebackEbdfDocuments(ChargebackEbdfStructure chargebackEbdfDocuments) {
    
    this.chargebackEbdfDocuments = chargebackEbdfDocuments;
    return this;
  }

   /**
   * Get chargebackEbdfDocuments
   * @return chargebackEbdfDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChargebackEbdfStructure getChargebackEbdfDocuments() {
    return chargebackEbdfDocuments;
  }


  public void setChargebackEbdfDocuments(ChargebackEbdfStructure chargebackEbdfDocuments) {
    this.chargebackEbdfDocuments = chargebackEbdfDocuments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChargebackRequest createChargebackRequest = (CreateChargebackRequest) o;
    return Objects.equals(this.amount, createChargebackRequest.amount) &&
        Objects.equals(this.chargebackType, createChargebackRequest.chargebackType) &&
        Objects.equals(this.currency, createChargebackRequest.currency) &&
        Objects.equals(this.documentIndicator, createChargebackRequest.documentIndicator) &&
        Objects.equals(this.reasonCode, createChargebackRequest.reasonCode) &&
        Objects.equals(this.credPostedAsPurchase, createChargebackRequest.credPostedAsPurchase) &&
        Objects.equals(this.isPartialChargeback, createChargebackRequest.isPartialChargeback) &&
        Objects.equals(this.messageText, createChargebackRequest.messageText) &&
        Objects.equals(this.settlementDate, createChargebackRequest.settlementDate) &&
        Objects.equals(this.disputeChargebackID, createChargebackRequest.disputeChargebackID) &&
        Objects.equals(this.localTax1IVA, createChargebackRequest.localTax1IVA) &&
        Objects.equals(this.installmentFee, createChargebackRequest.installmentFee) &&
        Objects.equals(this.editExclusionCode, createChargebackRequest.editExclusionCode) &&
        Objects.equals(this.refundNotReceivedIndicator, createChargebackRequest.refundNotReceivedIndicator) &&
        Objects.equals(this.includeCurrencyConversionAssessmentCCA, createChargebackRequest.includeCurrencyConversionAssessmentCCA) &&
        Objects.equals(this.fileAttachment, createChargebackRequest.fileAttachment) &&
        Objects.equals(this.chargebackEbdfDocuments, createChargebackRequest.chargebackEbdfDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chargebackType, currency, documentIndicator, reasonCode, credPostedAsPurchase, isPartialChargeback, messageText, settlementDate, disputeChargebackID, localTax1IVA, installmentFee, editExclusionCode, refundNotReceivedIndicator, includeCurrencyConversionAssessmentCCA, fileAttachment, chargebackEbdfDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChargebackRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargebackType: ").append(toIndentedString(chargebackType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    documentIndicator: ").append(toIndentedString(documentIndicator)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    credPostedAsPurchase: ").append(toIndentedString(credPostedAsPurchase)).append("\n");
    sb.append("    isPartialChargeback: ").append(toIndentedString(isPartialChargeback)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    disputeChargebackID: ").append(toIndentedString(disputeChargebackID)).append("\n");
    sb.append("    localTax1IVA: ").append(toIndentedString(localTax1IVA)).append("\n");
    sb.append("    installmentFee: ").append(toIndentedString(installmentFee)).append("\n");
    sb.append("    editExclusionCode: ").append(toIndentedString(editExclusionCode)).append("\n");
    sb.append("    refundNotReceivedIndicator: ").append(toIndentedString(refundNotReceivedIndicator)).append("\n");
    sb.append("    includeCurrencyConversionAssessmentCCA: ").append(toIndentedString(includeCurrencyConversionAssessmentCCA)).append("\n");
    sb.append("    fileAttachment: ").append(toIndentedString(fileAttachment)).append("\n");
    sb.append("    chargebackEbdfDocuments: ").append(toIndentedString(chargebackEbdfDocuments)).append("\n");
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

