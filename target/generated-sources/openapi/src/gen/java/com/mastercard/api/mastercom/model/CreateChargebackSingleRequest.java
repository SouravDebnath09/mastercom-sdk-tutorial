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
import com.mastercard.api.mastercom.model.DocumentStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateChargebackSingleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CreateChargebackSingleRequest {
  /**
   * The brand of service or program.   Length: 2   Valid Values/Format: MC - Mastercard, CI - Cirrus®, MS - Maestro®, MD - Debit Mastercard ®card, PL - Plus®, PV(L) - Private Label, VI - VISA
   */
  @JsonAdapter(BrandEnum.Adapter.class)
  public enum BrandEnum {
    MC("MC"),
    
    CI("CI"),
    
    MS("MS"),
    
    MD("MD"),
    
    PL("PL"),
    
    PV("PV"),
    
    VI("VI");

    private String value;

    BrandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BrandEnum fromValue(String value) {
      for (BrandEnum b : BrandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BrandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BrandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BrandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BrandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private BrandEnum brand;

  public static final String SERIALIZED_NAME_REPLACEMENT_AMOUNT = "replacementAmount";
  @SerializedName(SERIALIZED_NAME_REPLACEMENT_AMOUNT)
  private String replacementAmount;

  public static final String SERIALIZED_NAME_REVERSAL_REASON_CODE = "reversalReasonCode";
  @SerializedName(SERIALIZED_NAME_REVERSAL_REASON_CODE)
  private String reversalReasonCode;

  /**
   * The usage code indicates the type of chargeback record processed.   Length: 1   Valid Values/Format: 1 &#x3D; first chargeback, 2 &#x3D; second presentment
   */
  @JsonAdapter(UsageCodeEnum.Adapter.class)
  public enum UsageCodeEnum {
    _1("1"),
    
    _2("2");

    private String value;

    UsageCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsageCodeEnum fromValue(String value) {
      for (UsageCodeEnum b : UsageCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsageCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsageCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGE_CODE = "usageCode";
  @SerializedName(SERIALIZED_NAME_USAGE_CODE)
  private UsageCodeEnum usageCode;

  /**
   * If 0.00 is entered in the Replacement Amount local field, you will be requested to define the Chargeback as Single or Double. Select chargebackType, either Single Chargeback or Double Chargeback. A double chargeback is used to reverse a credit posted as a debit.   Length: 1   Valid Values/Format: S or D
   */
  @JsonAdapter(ChargebackTypeEnum.Adapter.class)
  public enum ChargebackTypeEnum {
    S("S"),
    
    D("D");

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

  public static final String SERIALIZED_NAME_ACQUIRER_FIRST_REFERENCE_NUMBER = "acquirerFirstReferenceNumber";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_FIRST_REFERENCE_NUMBER)
  private String acquirerFirstReferenceNumber;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private String additionalInformation;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CONTACT_FAX = "adjustmentContactFax";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CONTACT_FAX)
  private String adjustmentContactFax;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CONTACT_NAME = "adjustmentContactName";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CONTACT_NAME)
  private String adjustmentContactName;

  public static final String SERIALIZED_NAME_ADJUSTMENT_CONTACT_PHONE = "adjustmentContactPhone";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT_CONTACT_PHONE)
  private String adjustmentContactPhone;

  public static final String SERIALIZED_NAME_CONTROL_NUMBER = "controlNumber";
  @SerializedName(SERIALIZED_NAME_CONTROL_NUMBER)
  private String controlNumber;

  /**
   * Data Record Text.   Length: 2-3   Valid Values/Format: R3,RS7   Note: RS5 (Guarantee No Show) is not supported, customers must use field reversalReasonCode 53 instead
   */
  @JsonAdapter(DataRecordTextEnum.Adapter.class)
  public enum DataRecordTextEnum {
    R3("R3"),
    
    RS7("RS7");

    private String value;

    DataRecordTextEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataRecordTextEnum fromValue(String value) {
      for (DataRecordTextEnum b : DataRecordTextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataRecordTextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataRecordTextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataRecordTextEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataRecordTextEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_RECORD_TEXT = "dataRecordText";
  @SerializedName(SERIALIZED_NAME_DATA_RECORD_TEXT)
  private DataRecordTextEnum dataRecordText;

  /**
   * CONDITIONAL: Required when brand is MD and for the following reversalReasonCodes when brand is not MD...70, 71.   Length: 1   Valid Values/Format: 0-No Documentation, 1-Document will follow
   */
  @JsonAdapter(DocumentIndicatorEnum.Adapter.class)
  public enum DocumentIndicatorEnum {
    _0("0"),
    
    _1("1");

    private String value;

    DocumentIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentIndicatorEnum fromValue(String value) {
      for (DocumentIndicatorEnum b : DocumentIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocumentIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_INDICATOR = "documentIndicator";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_INDICATOR)
  private DocumentIndicatorEnum documentIndicator;

  /**
   * CONDITIONAL: This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 4
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    _1("1"),
    
    _2("2"),
    
    _4("4");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private DocumentTypeEnum documentType;

  /**
   * CONDITIONAL: The supporting documentation was illegible. This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6
   */
  @JsonAdapter(IllegibleItemCdEnum.Adapter.class)
  public enum IllegibleItemCdEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6");

    private String value;

    IllegibleItemCdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IllegibleItemCdEnum fromValue(String value) {
      for (IllegibleItemCdEnum b : IllegibleItemCdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IllegibleItemCdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IllegibleItemCdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IllegibleItemCdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IllegibleItemCdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ILLEGIBLE_ITEM_CD = "illegibleItemCd";
  @SerializedName(SERIALIZED_NAME_ILLEGIBLE_ITEM_CD)
  private IllegibleItemCdEnum illegibleItemCd;

  /**
   * CONDITIONAL: The type of card program bearing the account number. This field is mandatory when reversalReasonCode is 49.   Length: 4-5   Valid Values/Format: QMAP, GMAP, INVAL.
   */
  @JsonAdapter(ProgramEnum.Adapter.class)
  public enum ProgramEnum {
    QMAP("QMAP"),
    
    GMAP("GMAP"),
    
    INVAL("INVAL");

    private String value;

    ProgramEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProgramEnum fromValue(String value) {
      for (ProgramEnum b : ProgramEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProgramEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProgramEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProgramEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProgramEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROGRAM = "program";
  @SerializedName(SERIALIZED_NAME_PROGRAM)
  private ProgramEnum program;

  public static final String SERIALIZED_NAME_RETRIEVAL_REQUEST_DATE = "retrievalRequestDate";
  @SerializedName(SERIALIZED_NAME_RETRIEVAL_REQUEST_DATE)
  private String retrievalRequestDate;

  public static final String SERIALIZED_NAME_SECURITY_BULLETIN_NUMBER = "securityBulletinNumber";
  @SerializedName(SERIALIZED_NAME_SECURITY_BULLETIN_NUMBER)
  private String securityBulletinNumber;

  public static final String SERIALIZED_NAME_FILE_ATTACHMENT = "fileAttachment";
  @SerializedName(SERIALIZED_NAME_FILE_ATTACHMENT)
  private DocumentStructure fileAttachment;

  public static final String SERIALIZED_NAME_REFUND_NOT_RECEIVED_INDICATOR = "refundNotReceivedIndicator";
  @SerializedName(SERIALIZED_NAME_REFUND_NOT_RECEIVED_INDICATOR)
  private String refundNotReceivedIndicator;


  public CreateChargebackSingleRequest brand(BrandEnum brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of service or program.   Length: 2   Valid Values/Format: MC - Mastercard, CI - Cirrus®, MS - Maestro®, MD - Debit Mastercard ®card, PL - Plus®, PV(L) - Private Label, VI - VISA
   * @return brand
  **/
  @ApiModelProperty(example = "MD", required = true, value = "The brand of service or program.   Length: 2   Valid Values/Format: MC - Mastercard, CI - Cirrus®, MS - Maestro®, MD - Debit Mastercard ®card, PL - Plus®, PV(L) - Private Label, VI - VISA")

  public BrandEnum getBrand() {
    return brand;
  }


  public void setBrand(BrandEnum brand) {
    this.brand = brand;
  }


  public CreateChargebackSingleRequest replacementAmount(String replacementAmount) {
    
    this.replacementAmount = replacementAmount;
    return this;
  }

   /**
   * Replacement Amount.  The replacement amount should reflect the final amount of the transaction value that should remain applied to the cardholder balance.   Length: 3-12   Valid Values/Format: Numeric
   * @return replacementAmount
  **/
  @ApiModelProperty(example = "100.00", required = true, value = "Replacement Amount.  The replacement amount should reflect the final amount of the transaction value that should remain applied to the cardholder balance.   Length: 3-12   Valid Values/Format: Numeric")

  public String getReplacementAmount() {
    return replacementAmount;
  }


  public void setReplacementAmount(String replacementAmount) {
    this.replacementAmount = replacementAmount;
  }


  public CreateChargebackSingleRequest reversalReasonCode(String reversalReasonCode) {
    
    this.reversalReasonCode = reversalReasonCode;
    return this;
  }

   /**
   * MDS dispute reason code for creating the dispute item   Length: 1-2   Valid Values/Format: Alphanumeric
   * @return reversalReasonCode
  **/
  @ApiModelProperty(example = "71", required = true, value = "MDS dispute reason code for creating the dispute item   Length: 1-2   Valid Values/Format: Alphanumeric")

  public String getReversalReasonCode() {
    return reversalReasonCode;
  }


  public void setReversalReasonCode(String reversalReasonCode) {
    this.reversalReasonCode = reversalReasonCode;
  }


  public CreateChargebackSingleRequest usageCode(UsageCodeEnum usageCode) {
    
    this.usageCode = usageCode;
    return this;
  }

   /**
   * The usage code indicates the type of chargeback record processed.   Length: 1   Valid Values/Format: 1 &#x3D; first chargeback, 2 &#x3D; second presentment
   * @return usageCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "The usage code indicates the type of chargeback record processed.   Length: 1   Valid Values/Format: 1 = first chargeback, 2 = second presentment")

  public UsageCodeEnum getUsageCode() {
    return usageCode;
  }


  public void setUsageCode(UsageCodeEnum usageCode) {
    this.usageCode = usageCode;
  }


  public CreateChargebackSingleRequest chargebackType(ChargebackTypeEnum chargebackType) {
    
    this.chargebackType = chargebackType;
    return this;
  }

   /**
   * If 0.00 is entered in the Replacement Amount local field, you will be requested to define the Chargeback as Single or Double. Select chargebackType, either Single Chargeback or Double Chargeback. A double chargeback is used to reverse a credit posted as a debit.   Length: 1   Valid Values/Format: S or D
   * @return chargebackType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S", value = "If 0.00 is entered in the Replacement Amount local field, you will be requested to define the Chargeback as Single or Double. Select chargebackType, either Single Chargeback or Double Chargeback. A double chargeback is used to reverse a credit posted as a debit.   Length: 1   Valid Values/Format: S or D")

  public ChargebackTypeEnum getChargebackType() {
    return chargebackType;
  }


  public void setChargebackType(ChargebackTypeEnum chargebackType) {
    this.chargebackType = chargebackType;
  }


  public CreateChargebackSingleRequest acquirerFirstReferenceNumber(String acquirerFirstReferenceNumber) {
    
    this.acquirerFirstReferenceNumber = acquirerFirstReferenceNumber;
    return this;
  }

   /**
   * CONDITIONAL: Mandatory when brand is MD and reason code is 34 (Duplicate processing). A unique identifier assigned by the acquirer of Debit Mastercard transactions.   Length: 23   Valid Values/Format: Numeric
   * @return acquirerFirstReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05103246259000000000126", value = "CONDITIONAL: Mandatory when brand is MD and reason code is 34 (Duplicate processing). A unique identifier assigned by the acquirer of Debit Mastercard transactions.   Length: 23   Valid Values/Format: Numeric")

  public String getAcquirerFirstReferenceNumber() {
    return acquirerFirstReferenceNumber;
  }


  public void setAcquirerFirstReferenceNumber(String acquirerFirstReferenceNumber) {
    this.acquirerFirstReferenceNumber = acquirerFirstReferenceNumber;
  }


  public CreateChargebackSingleRequest additionalInformation(String additionalInformation) {
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Any additional information or note may be entered in this field.   Length: 1-38   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMTM Manual", value = "Any additional information or note may be entered in this field.   Length: 1-38   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)")

  public String getAdditionalInformation() {
    return additionalInformation;
  }


  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public CreateChargebackSingleRequest adjustmentContactFax(String adjustmentContactFax) {
    
    this.adjustmentContactFax = adjustmentContactFax;
    return this;
  }

   /**
   * CONDITIONAL: The chargeback contact fax number. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-15   Valid Values/Format: Numeric, Special Char(-)
   * @return adjustmentContactFax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "555-555-5555", value = "CONDITIONAL: The chargeback contact fax number. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-15   Valid Values/Format: Numeric, Special Char(-)")

  public String getAdjustmentContactFax() {
    return adjustmentContactFax;
  }


  public void setAdjustmentContactFax(String adjustmentContactFax) {
    this.adjustmentContactFax = adjustmentContactFax;
  }


  public CreateChargebackSingleRequest adjustmentContactName(String adjustmentContactName) {
    
    this.adjustmentContactName = adjustmentContactName;
    return this;
  }

   /**
   * CONDITIONAL: The chargeback contact name. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-24   Valid Values/Format: Character and Space
   * @return adjustmentContactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Smith", value = "CONDITIONAL: The chargeback contact name. Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98.   Length: 1-24   Valid Values/Format: Character and Space")

  public String getAdjustmentContactName() {
    return adjustmentContactName;
  }


  public void setAdjustmentContactName(String adjustmentContactName) {
    this.adjustmentContactName = adjustmentContactName;
  }


  public CreateChargebackSingleRequest adjustmentContactPhone(String adjustmentContactPhone) {
    
    this.adjustmentContactPhone = adjustmentContactPhone;
    return this;
  }

   /**
   * CONDITIONAL: The chargeback contact phone number.  Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98   Length: 1-15   Valid Values/Format: Numeric
   * @return adjustmentContactPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5555555555", value = "CONDITIONAL: The chargeback contact phone number.  Required when brand not MD and reversalReasonCode in one of the following...12, 30, 69, 70, 71, 73, 75, 79, 80, 95, 96, 97, 98   Length: 1-15   Valid Values/Format: Numeric")

  public String getAdjustmentContactPhone() {
    return adjustmentContactPhone;
  }


  public void setAdjustmentContactPhone(String adjustmentContactPhone) {
    this.adjustmentContactPhone = adjustmentContactPhone;
  }


  public CreateChargebackSingleRequest controlNumber(String controlNumber) {
    
    this.controlNumber = controlNumber;
    return this;
  }

   /**
   * Control Number.  Used to identify the specific transaction for internal auditing and tracing purposes.   Length: 1-5   Valid Values/Format: Numeric
   * @return controlNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99999", value = "Control Number.  Used to identify the specific transaction for internal auditing and tracing purposes.   Length: 1-5   Valid Values/Format: Numeric")

  public String getControlNumber() {
    return controlNumber;
  }


  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }


  public CreateChargebackSingleRequest dataRecordText(DataRecordTextEnum dataRecordText) {
    
    this.dataRecordText = dataRecordText;
    return this;
  }

   /**
   * Data Record Text.   Length: 2-3   Valid Values/Format: R3,RS7   Note: RS5 (Guarantee No Show) is not supported, customers must use field reversalReasonCode 53 instead
   * @return dataRecordText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R3", value = "Data Record Text.   Length: 2-3   Valid Values/Format: R3,RS7   Note: RS5 (Guarantee No Show) is not supported, customers must use field reversalReasonCode 53 instead")

  public DataRecordTextEnum getDataRecordText() {
    return dataRecordText;
  }


  public void setDataRecordText(DataRecordTextEnum dataRecordText) {
    this.dataRecordText = dataRecordText;
  }


  public CreateChargebackSingleRequest documentIndicator(DocumentIndicatorEnum documentIndicator) {
    
    this.documentIndicator = documentIndicator;
    return this;
  }

   /**
   * CONDITIONAL: Required when brand is MD and for the following reversalReasonCodes when brand is not MD...70, 71.   Length: 1   Valid Values/Format: 0-No Documentation, 1-Document will follow
   * @return documentIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "CONDITIONAL: Required when brand is MD and for the following reversalReasonCodes when brand is not MD...70, 71.   Length: 1   Valid Values/Format: 0-No Documentation, 1-Document will follow")

  public DocumentIndicatorEnum getDocumentIndicator() {
    return documentIndicator;
  }


  public void setDocumentIndicator(DocumentIndicatorEnum documentIndicator) {
    this.documentIndicator = documentIndicator;
  }


  public CreateChargebackSingleRequest documentType(DocumentTypeEnum documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * CONDITIONAL: This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 4
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "CONDITIONAL: This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 4")

  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }


  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public CreateChargebackSingleRequest illegibleItemCd(IllegibleItemCdEnum illegibleItemCd) {
    
    this.illegibleItemCd = illegibleItemCd;
    return this;
  }

   /**
   * CONDITIONAL: The supporting documentation was illegible. This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6
   * @return illegibleItemCd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "CONDITIONAL: The supporting documentation was illegible. This field is mandatory when reversalReasonCode is 02.   Length: 1   Valid Values/Format: 1, 2, 3, 4, 5, 6")

  public IllegibleItemCdEnum getIllegibleItemCd() {
    return illegibleItemCd;
  }


  public void setIllegibleItemCd(IllegibleItemCdEnum illegibleItemCd) {
    this.illegibleItemCd = illegibleItemCd;
  }


  public CreateChargebackSingleRequest program(ProgramEnum program) {
    
    this.program = program;
    return this;
  }

   /**
   * CONDITIONAL: The type of card program bearing the account number. This field is mandatory when reversalReasonCode is 49.   Length: 4-5   Valid Values/Format: QMAP, GMAP, INVAL.
   * @return program
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVAL", value = "CONDITIONAL: The type of card program bearing the account number. This field is mandatory when reversalReasonCode is 49.   Length: 4-5   Valid Values/Format: QMAP, GMAP, INVAL.")

  public ProgramEnum getProgram() {
    return program;
  }


  public void setProgram(ProgramEnum program) {
    this.program = program;
  }


  public CreateChargebackSingleRequest retrievalRequestDate(String retrievalRequestDate) {
    
    this.retrievalRequestDate = retrievalRequestDate;
    return this;
  }

   /**
   * CONDITIONAL: The date of the retrieval request.  This field is mandatory when brand is MD and reversalReasonCode is 02.   Length: 6   Valid Values/Format: Date
   * @return retrievalRequestDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "010129", value = "CONDITIONAL: The date of the retrieval request.  This field is mandatory when brand is MD and reversalReasonCode is 02.   Length: 6   Valid Values/Format: Date")

  public String getRetrievalRequestDate() {
    return retrievalRequestDate;
  }


  public void setRetrievalRequestDate(String retrievalRequestDate) {
    this.retrievalRequestDate = retrievalRequestDate;
  }


  public CreateChargebackSingleRequest securityBulletinNumber(String securityBulletinNumber) {
    
    this.securityBulletinNumber = securityBulletinNumber;
    return this;
  }

   /**
   * OPTIONAL: This is three-digit Global Security Bulletin number using a YMM format (for example, bulletin number 6 June 2008 would be entered as 806).  Mandatory when brand is MD and reason code is 49. YMM is the format.   Length: 3   Valid Values/Format: Numeric
   * @return securityBulletinNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "122", value = "OPTIONAL: This is three-digit Global Security Bulletin number using a YMM format (for example, bulletin number 6 June 2008 would be entered as 806).  Mandatory when brand is MD and reason code is 49. YMM is the format.   Length: 3   Valid Values/Format: Numeric")

  public String getSecurityBulletinNumber() {
    return securityBulletinNumber;
  }


  public void setSecurityBulletinNumber(String securityBulletinNumber) {
    this.securityBulletinNumber = securityBulletinNumber;
  }


  public CreateChargebackSingleRequest fileAttachment(DocumentStructure fileAttachment) {
    
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


  public CreateChargebackSingleRequest refundNotReceivedIndicator(String refundNotReceivedIndicator) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChargebackSingleRequest createChargebackSingleRequest = (CreateChargebackSingleRequest) o;
    return Objects.equals(this.brand, createChargebackSingleRequest.brand) &&
        Objects.equals(this.replacementAmount, createChargebackSingleRequest.replacementAmount) &&
        Objects.equals(this.reversalReasonCode, createChargebackSingleRequest.reversalReasonCode) &&
        Objects.equals(this.usageCode, createChargebackSingleRequest.usageCode) &&
        Objects.equals(this.chargebackType, createChargebackSingleRequest.chargebackType) &&
        Objects.equals(this.acquirerFirstReferenceNumber, createChargebackSingleRequest.acquirerFirstReferenceNumber) &&
        Objects.equals(this.additionalInformation, createChargebackSingleRequest.additionalInformation) &&
        Objects.equals(this.adjustmentContactFax, createChargebackSingleRequest.adjustmentContactFax) &&
        Objects.equals(this.adjustmentContactName, createChargebackSingleRequest.adjustmentContactName) &&
        Objects.equals(this.adjustmentContactPhone, createChargebackSingleRequest.adjustmentContactPhone) &&
        Objects.equals(this.controlNumber, createChargebackSingleRequest.controlNumber) &&
        Objects.equals(this.dataRecordText, createChargebackSingleRequest.dataRecordText) &&
        Objects.equals(this.documentIndicator, createChargebackSingleRequest.documentIndicator) &&
        Objects.equals(this.documentType, createChargebackSingleRequest.documentType) &&
        Objects.equals(this.illegibleItemCd, createChargebackSingleRequest.illegibleItemCd) &&
        Objects.equals(this.program, createChargebackSingleRequest.program) &&
        Objects.equals(this.retrievalRequestDate, createChargebackSingleRequest.retrievalRequestDate) &&
        Objects.equals(this.securityBulletinNumber, createChargebackSingleRequest.securityBulletinNumber) &&
        Objects.equals(this.fileAttachment, createChargebackSingleRequest.fileAttachment) &&
        Objects.equals(this.refundNotReceivedIndicator, createChargebackSingleRequest.refundNotReceivedIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, replacementAmount, reversalReasonCode, usageCode, chargebackType, acquirerFirstReferenceNumber, additionalInformation, adjustmentContactFax, adjustmentContactName, adjustmentContactPhone, controlNumber, dataRecordText, documentIndicator, documentType, illegibleItemCd, program, retrievalRequestDate, securityBulletinNumber, fileAttachment, refundNotReceivedIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChargebackSingleRequest {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    replacementAmount: ").append(toIndentedString(replacementAmount)).append("\n");
    sb.append("    reversalReasonCode: ").append(toIndentedString(reversalReasonCode)).append("\n");
    sb.append("    usageCode: ").append(toIndentedString(usageCode)).append("\n");
    sb.append("    chargebackType: ").append(toIndentedString(chargebackType)).append("\n");
    sb.append("    acquirerFirstReferenceNumber: ").append(toIndentedString(acquirerFirstReferenceNumber)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    adjustmentContactFax: ").append(toIndentedString(adjustmentContactFax)).append("\n");
    sb.append("    adjustmentContactName: ").append(toIndentedString(adjustmentContactName)).append("\n");
    sb.append("    adjustmentContactPhone: ").append(toIndentedString(adjustmentContactPhone)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    dataRecordText: ").append(toIndentedString(dataRecordText)).append("\n");
    sb.append("    documentIndicator: ").append(toIndentedString(documentIndicator)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    illegibleItemCd: ").append(toIndentedString(illegibleItemCd)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    retrievalRequestDate: ").append(toIndentedString(retrievalRequestDate)).append("\n");
    sb.append("    securityBulletinNumber: ").append(toIndentedString(securityBulletinNumber)).append("\n");
    sb.append("    fileAttachment: ").append(toIndentedString(fileAttachment)).append("\n");
    sb.append("    refundNotReceivedIndicator: ").append(toIndentedString(refundNotReceivedIndicator)).append("\n");
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

