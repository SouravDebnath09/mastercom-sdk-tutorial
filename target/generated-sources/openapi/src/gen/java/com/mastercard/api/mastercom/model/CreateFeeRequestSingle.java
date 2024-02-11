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
 * CreateFeeRequestSingle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CreateFeeRequestSingle {
  public static final String SERIALIZED_NAME_ACQUIRER_CUSTOMER_ID = "acquirerCustomerId";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_CUSTOMER_ID)
  private String acquirerCustomerId;

  /**
   * Condition Indicator identifies the Message Reason Code (MRC) for a chargeback..   Length: 1   Valid Values/Format: A, B, C, D
   */
  @JsonAdapter(ConditionIndicatorEnum.Adapter.class)
  public enum ConditionIndicatorEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D");

    private String value;

    ConditionIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionIndicatorEnum fromValue(String value) {
      for (ConditionIndicatorEnum b : ConditionIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConditionIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONDITION_INDICATOR = "conditionIndicator";
  @SerializedName(SERIALIZED_NAME_CONDITION_INDICATOR)
  private ConditionIndicatorEnum conditionIndicator;

  public static final String SERIALIZED_NAME_CONTROL_NUMBER = "controlNumber";
  @SerializedName(SERIALIZED_NAME_CONTROL_NUMBER)
  private String controlNumber;

  /**
   * Determines whether the progressive handling fee is being applied to a First Chargeback.   Length: 3   Valid Values/Format: 700
   */
  @JsonAdapter(FunctionCodeEnum.Adapter.class)
  public enum FunctionCodeEnum {
    _700("700");

    private String value;

    FunctionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FunctionCodeEnum fromValue(String value) {
      for (FunctionCodeEnum b : FunctionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FunctionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FunctionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FunctionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FunctionCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FUNCTION_CODE = "functionCode";
  @SerializedName(SERIALIZED_NAME_FUNCTION_CODE)
  private FunctionCodeEnum functionCode;

  public static final String SERIALIZED_NAME_HANDLING_FEE = "handlingFee";
  @SerializedName(SERIALIZED_NAME_HANDLING_FEE)
  private String handlingFee;

  /**
   * Reason code for applying handling fee.   Length: 2   Valid Values/Format: 22 - First Chargeback Handling Fee
   */
  @JsonAdapter(ReasonCodeEnum.Adapter.class)
  public enum ReasonCodeEnum {
    _22("22");

    private String value;

    ReasonCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonCodeEnum fromValue(String value) {
      for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private ReasonCodeEnum reasonCode;

  public static final String SERIALIZED_NAME_DECLINE_DATE = "declineDate";
  @SerializedName(SERIALIZED_NAME_DECLINE_DATE)
  private String declineDate;

  public static final String SERIALIZED_NAME_ISSUER_CUSTOMER_I_D = "issuerCustomerID";
  @SerializedName(SERIALIZED_NAME_ISSUER_CUSTOMER_I_D)
  private String issuerCustomerID;


  public CreateFeeRequestSingle acquirerCustomerId(String acquirerCustomerId) {
    
    this.acquirerCustomerId = acquirerCustomerId;
    return this;
  }

   /**
   * Acquirer ICA number that is taken from the transaction and supplied by Single Message Transaction Manager.   Length: 1-6   Valid Values/Format: Numeric
   * @return acquirerCustomerId
  **/
  @ApiModelProperty(example = "003501", required = true, value = "Acquirer ICA number that is taken from the transaction and supplied by Single Message Transaction Manager.   Length: 1-6   Valid Values/Format: Numeric")

  public String getAcquirerCustomerId() {
    return acquirerCustomerId;
  }


  public void setAcquirerCustomerId(String acquirerCustomerId) {
    this.acquirerCustomerId = acquirerCustomerId;
  }


  public CreateFeeRequestSingle conditionIndicator(ConditionIndicatorEnum conditionIndicator) {
    
    this.conditionIndicator = conditionIndicator;
    return this;
  }

   /**
   * Condition Indicator identifies the Message Reason Code (MRC) for a chargeback..   Length: 1   Valid Values/Format: A, B, C, D
   * @return conditionIndicator
  **/
  @ApiModelProperty(example = "A", required = true, value = "Condition Indicator identifies the Message Reason Code (MRC) for a chargeback..   Length: 1   Valid Values/Format: A, B, C, D")

  public ConditionIndicatorEnum getConditionIndicator() {
    return conditionIndicator;
  }


  public void setConditionIndicator(ConditionIndicatorEnum conditionIndicator) {
    this.conditionIndicator = conditionIndicator;
  }


  public CreateFeeRequestSingle controlNumber(String controlNumber) {
    
    this.controlNumber = controlNumber;
    return this;
  }

   /**
   * Allows the issuer to identify the progressive handling fee message being created. The control number must be 20 positions in length and right-justified, zero-filled if less.   Length: 1-20   Valid Values/Format: Alphanumeric
   * @return controlNumber
  **/
  @ApiModelProperty(example = "12345678901234567890", required = true, value = "Allows the issuer to identify the progressive handling fee message being created. The control number must be 20 positions in length and right-justified, zero-filled if less.   Length: 1-20   Valid Values/Format: Alphanumeric")

  public String getControlNumber() {
    return controlNumber;
  }


  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }


  public CreateFeeRequestSingle functionCode(FunctionCodeEnum functionCode) {
    
    this.functionCode = functionCode;
    return this;
  }

   /**
   * Determines whether the progressive handling fee is being applied to a First Chargeback.   Length: 3   Valid Values/Format: 700
   * @return functionCode
  **/
  @ApiModelProperty(example = "700", required = true, value = "Determines whether the progressive handling fee is being applied to a First Chargeback.   Length: 3   Valid Values/Format: 700")

  public FunctionCodeEnum getFunctionCode() {
    return functionCode;
  }


  public void setFunctionCode(FunctionCodeEnum functionCode) {
    this.functionCode = functionCode;
  }


  public CreateFeeRequestSingle handlingFee(String handlingFee) {
    
    this.handlingFee = handlingFee;
    return this;
  }

   /**
   * Any monetary amount can be entered in this field. There is a USD 25 limit for the First Chargeback (Reason Code 22).   Length: 4-9   Valid Values/Format: Numeric
   * @return handlingFee
  **/
  @ApiModelProperty(example = "25", required = true, value = "Any monetary amount can be entered in this field. There is a USD 25 limit for the First Chargeback (Reason Code 22).   Length: 4-9   Valid Values/Format: Numeric")

  public String getHandlingFee() {
    return handlingFee;
  }


  public void setHandlingFee(String handlingFee) {
    this.handlingFee = handlingFee;
  }


  public CreateFeeRequestSingle reasonCode(ReasonCodeEnum reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason code for applying handling fee.   Length: 2   Valid Values/Format: 22 - First Chargeback Handling Fee
   * @return reasonCode
  **/
  @ApiModelProperty(example = "22", required = true, value = "Reason code for applying handling fee.   Length: 2   Valid Values/Format: 22 - First Chargeback Handling Fee")

  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
  }


  public CreateFeeRequestSingle declineDate(String declineDate) {
    
    this.declineDate = declineDate;
    return this;
  }

   /**
   * This is the date the authorization request was declined. This field is required when conditionIndicator is A.   Length: 6   Valid Values/Format: Date(MMDDYY)
   * @return declineDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "013019", value = "This is the date the authorization request was declined. This field is required when conditionIndicator is A.   Length: 6   Valid Values/Format: Date(MMDDYY)")

  public String getDeclineDate() {
    return declineDate;
  }


  public void setDeclineDate(String declineDate) {
    this.declineDate = declineDate;
  }


  public CreateFeeRequestSingle issuerCustomerID(String issuerCustomerID) {
    
    this.issuerCustomerID = issuerCustomerID;
    return this;
  }

   /**
   * Issuer ICA number that is taken from the transaction and supplied by Single Message Transaction Manager.   Length: 1-6   Valid Values/Format: Numeric
   * @return issuerCustomerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "Issuer ICA number that is taken from the transaction and supplied by Single Message Transaction Manager.   Length: 1-6   Valid Values/Format: Numeric")

  public String getIssuerCustomerID() {
    return issuerCustomerID;
  }


  public void setIssuerCustomerID(String issuerCustomerID) {
    this.issuerCustomerID = issuerCustomerID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeeRequestSingle createFeeRequestSingle = (CreateFeeRequestSingle) o;
    return Objects.equals(this.acquirerCustomerId, createFeeRequestSingle.acquirerCustomerId) &&
        Objects.equals(this.conditionIndicator, createFeeRequestSingle.conditionIndicator) &&
        Objects.equals(this.controlNumber, createFeeRequestSingle.controlNumber) &&
        Objects.equals(this.functionCode, createFeeRequestSingle.functionCode) &&
        Objects.equals(this.handlingFee, createFeeRequestSingle.handlingFee) &&
        Objects.equals(this.reasonCode, createFeeRequestSingle.reasonCode) &&
        Objects.equals(this.declineDate, createFeeRequestSingle.declineDate) &&
        Objects.equals(this.issuerCustomerID, createFeeRequestSingle.issuerCustomerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerCustomerId, conditionIndicator, controlNumber, functionCode, handlingFee, reasonCode, declineDate, issuerCustomerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeeRequestSingle {\n");
    sb.append("    acquirerCustomerId: ").append(toIndentedString(acquirerCustomerId)).append("\n");
    sb.append("    conditionIndicator: ").append(toIndentedString(conditionIndicator)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    handlingFee: ").append(toIndentedString(handlingFee)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    declineDate: ").append(toIndentedString(declineDate)).append("\n");
    sb.append("    issuerCustomerID: ").append(toIndentedString(issuerCustomerID)).append("\n");
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

