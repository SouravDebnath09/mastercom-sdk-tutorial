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
 * LoadDataForChargebacksRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class LoadDataForChargebacksRequest {
  /**
   * The type of chargeback.The default value is CHARGEBACK   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT
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

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;


  public LoadDataForChargebacksRequest chargebackType(ChargebackTypeEnum chargebackType) {
    
    this.chargebackType = chargebackType;
    return this;
  }

   /**
   * The type of chargeback.The default value is CHARGEBACK   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT
   * @return chargebackType
  **/
  @ApiModelProperty(example = "CHARGEBACK", required = true, value = "The type of chargeback.The default value is CHARGEBACK   Length: 10-18   Valid Values/Format: CHARGEBACK, SECOND_PRESENTMENT")

  public ChargebackTypeEnum getChargebackType() {
    return chargebackType;
  }


  public void setChargebackType(ChargebackTypeEnum chargebackType) {
    this.chargebackType = chargebackType;
  }


  public LoadDataForChargebacksRequest reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason Code    Length: 4   Valid Values/Format: Numeric
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4853", value = "Reason Code    Length: 4   Valid Values/Format: Numeric")

  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public LoadDataForChargebacksRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency in with the chargeback will be created.   Length: 3   Valid Values/Format: A-Z (uppercase alphabetic letter)
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency in with the chargeback will be created.   Length: 3   Valid Values/Format: A-Z (uppercase alphabetic letter)")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadDataForChargebacksRequest loadDataForChargebacksRequest = (LoadDataForChargebacksRequest) o;
    return Objects.equals(this.chargebackType, loadDataForChargebacksRequest.chargebackType) &&
        Objects.equals(this.reasonCode, loadDataForChargebacksRequest.reasonCode) &&
        Objects.equals(this.currency, loadDataForChargebacksRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackType, reasonCode, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadDataForChargebacksRequest {\n");
    sb.append("    chargebackType: ").append(toIndentedString(chargebackType)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

