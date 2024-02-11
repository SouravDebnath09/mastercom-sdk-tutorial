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
import com.mastercard.api.mastercom.model.ChargebackAmountNameValueDetail;
import com.mastercard.api.mastercom.model.ChargebackDocIndicatorsNameValueDetail;
import com.mastercard.api.mastercom.model.ChargebackMessageTextsNameValueDetail;
import com.mastercard.api.mastercom.model.ChargebackReasonCodesNameValueDetail;
import com.mastercard.api.mastercom.model.CurrenciesNameValueDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoadDataForChargebackResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class LoadDataForChargebackResponse {
  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<CurrenciesNameValueDetail> currencies = null;

  public static final String SERIALIZED_NAME_DOC_INDICATORS = "docIndicators";
  @SerializedName(SERIALIZED_NAME_DOC_INDICATORS)
  private List<ChargebackDocIndicatorsNameValueDetail> docIndicators = null;

  public static final String SERIALIZED_NAME_MESSAGE_TEXTS = "messageTexts";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXTS)
  private List<ChargebackMessageTextsNameValueDetail> messageTexts = null;

  public static final String SERIALIZED_NAME_REASON_CODES = "reasonCodes";
  @SerializedName(SERIALIZED_NAME_REASON_CODES)
  private List<ChargebackReasonCodesNameValueDetail> reasonCodes = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private ChargebackAmountNameValueDetail amount;


  public LoadDataForChargebackResponse currencies(List<CurrenciesNameValueDetail> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public LoadDataForChargebackResponse addCurrenciesItem(CurrenciesNameValueDetail currenciesItem) {
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


  public LoadDataForChargebackResponse docIndicators(List<ChargebackDocIndicatorsNameValueDetail> docIndicators) {
    
    this.docIndicators = docIndicators;
    return this;
  }

  public LoadDataForChargebackResponse addDocIndicatorsItem(ChargebackDocIndicatorsNameValueDetail docIndicatorsItem) {
    if (this.docIndicators == null) {
      this.docIndicators = new ArrayList<ChargebackDocIndicatorsNameValueDetail>();
    }
    this.docIndicators.add(docIndicatorsItem);
    return this;
  }

   /**
   * List of valid doc indicators
   * @return docIndicators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of valid doc indicators")

  public List<ChargebackDocIndicatorsNameValueDetail> getDocIndicators() {
    return docIndicators;
  }


  public void setDocIndicators(List<ChargebackDocIndicatorsNameValueDetail> docIndicators) {
    this.docIndicators = docIndicators;
  }


  public LoadDataForChargebackResponse messageTexts(List<ChargebackMessageTextsNameValueDetail> messageTexts) {
    
    this.messageTexts = messageTexts;
    return this;
  }

  public LoadDataForChargebackResponse addMessageTextsItem(ChargebackMessageTextsNameValueDetail messageTextsItem) {
    if (this.messageTexts == null) {
      this.messageTexts = new ArrayList<ChargebackMessageTextsNameValueDetail>();
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

  public List<ChargebackMessageTextsNameValueDetail> getMessageTexts() {
    return messageTexts;
  }


  public void setMessageTexts(List<ChargebackMessageTextsNameValueDetail> messageTexts) {
    this.messageTexts = messageTexts;
  }


  public LoadDataForChargebackResponse reasonCodes(List<ChargebackReasonCodesNameValueDetail> reasonCodes) {
    
    this.reasonCodes = reasonCodes;
    return this;
  }

  public LoadDataForChargebackResponse addReasonCodesItem(ChargebackReasonCodesNameValueDetail reasonCodesItem) {
    if (this.reasonCodes == null) {
      this.reasonCodes = new ArrayList<ChargebackReasonCodesNameValueDetail>();
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

  public List<ChargebackReasonCodesNameValueDetail> getReasonCodes() {
    return reasonCodes;
  }


  public void setReasonCodes(List<ChargebackReasonCodesNameValueDetail> reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  public LoadDataForChargebackResponse amount(ChargebackAmountNameValueDetail amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChargebackAmountNameValueDetail getAmount() {
    return amount;
  }


  public void setAmount(ChargebackAmountNameValueDetail amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadDataForChargebackResponse loadDataForChargebackResponse = (LoadDataForChargebackResponse) o;
    return Objects.equals(this.currencies, loadDataForChargebackResponse.currencies) &&
        Objects.equals(this.docIndicators, loadDataForChargebackResponse.docIndicators) &&
        Objects.equals(this.messageTexts, loadDataForChargebackResponse.messageTexts) &&
        Objects.equals(this.reasonCodes, loadDataForChargebackResponse.reasonCodes) &&
        Objects.equals(this.amount, loadDataForChargebackResponse.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies, docIndicators, messageTexts, reasonCodes, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadDataForChargebackResponse {\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    docIndicators: ").append(toIndentedString(docIndicators)).append("\n");
    sb.append("    messageTexts: ").append(toIndentedString(messageTexts)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

