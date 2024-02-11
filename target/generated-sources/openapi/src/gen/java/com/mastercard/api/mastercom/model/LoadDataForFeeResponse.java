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
import com.mastercard.api.mastercom.model.CurrenciesNameValueDetail;
import com.mastercard.api.mastercom.model.FeeCountryCodesNameValueDetail;
import com.mastercard.api.mastercom.model.FeeMessageTextsNameValueDetail;
import com.mastercard.api.mastercom.model.FeeReasonCodesNameValueDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadDataForFeeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class LoadDataForFeeResponse {
  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<CurrenciesNameValueDetail> currencies = null;

  public static final String SERIALIZED_NAME_REASON_CODES = "reasonCodes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<FeeReasonCodesNameValueDetail> reasonCodes = null;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "countryCodes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<FeeCountryCodesNameValueDetail> countryCodes = null;

  public static final String SERIALIZED_NAME_MESSAGE_TEXTS = "messageTexts";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXTS)
  private List<FeeMessageTextsNameValueDetail> messageTexts = null;


  public LoadDataForFeeResponse currencies(List<CurrenciesNameValueDetail> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public LoadDataForFeeResponse addCurrenciesItem(CurrenciesNameValueDetail currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<CurrenciesNameValueDetail>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * List of valid currencies
   * @return currencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of valid currencies")

  public List<CurrenciesNameValueDetail> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<CurrenciesNameValueDetail> currencies) {
    this.currencies = currencies;
  }


  public LoadDataForFeeResponse reasonCodes(List<FeeReasonCodesNameValueDetail> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public LoadDataForFeeResponse addReasonCodesItem(FeeReasonCodesNameValueDetail reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<FeeReasonCodesNameValueDetail>();
    }
    this.reasonCodes.add(reasonCodesItem);
    return this;
  }

   /**
   * List of valid reason codes
   * @return reasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of valid reason codes")

  public List<FeeReasonCodesNameValueDetail> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<FeeReasonCodesNameValueDetail> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  public LoadDataForFeeResponse countryCodes(List<FeeCountryCodesNameValueDetail> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public LoadDataForFeeResponse addCountryCodesItem(FeeCountryCodesNameValueDetail countryCodesItem) {
    if (this.countryCodes == null) {
      this.countryCodes = new ArrayList<FeeCountryCodesNameValueDetail>();
    }
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * List of valid country codes
   * @return countryCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of valid country codes")

  public List<FeeCountryCodesNameValueDetail> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<FeeCountryCodesNameValueDetail> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public LoadDataForFeeResponse messageTexts(List<FeeMessageTextsNameValueDetail> messageTexts) {
    
    this.messageTexts = messageTexts;
    return this;
  }

  public LoadDataForFeeResponse addMessageTextsItem(FeeMessageTextsNameValueDetail messageTextsItem) {
    if (this.messageTexts == null) {
      this.messageTexts = new ArrayList<FeeMessageTextsNameValueDetail>();
    }
    this.messageTexts.add(messageTextsItem);
    return this;
  }

   /**
   * List of valid message texts
   * @return messageTexts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of valid message texts")

  public List<FeeMessageTextsNameValueDetail> getMessageTexts() {
    return messageTexts;
  }


  public void setMessageTexts(List<FeeMessageTextsNameValueDetail> messageTexts) {
    this.messageTexts = messageTexts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadDataForFeeResponse loadDataForFeeResponse = (LoadDataForFeeResponse) o;
    return Objects.equals(this.currencies, loadDataForFeeResponse.currencies) &&
        Objects.equals(this.reasonCodes, loadDataForFeeResponse.reasonCodes) &&
        Objects.equals(this.countryCodes, loadDataForFeeResponse.countryCodes) &&
        Objects.equals(this.messageTexts, loadDataForFeeResponse.messageTexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies, reasonCodes, countryCodes, messageTexts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadDataForFeeResponse {\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    messageTexts: ").append(toIndentedString(messageTexts)).append("\n");
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

