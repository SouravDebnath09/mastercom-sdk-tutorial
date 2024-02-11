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
import com.mastercard.api.mastercom.model.ChargebackImageStatusResponseStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChargebackImageStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class ChargebackImageStatusResponse {
  public static final String SERIALIZED_NAME_CHARGEBACK_IMAGE_STATUS_LIST = "chargebackImageStatusList";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_IMAGE_STATUS_LIST)
  private List<ChargebackImageStatusResponseStructure> chargebackImageStatusList = null;


  public ChargebackImageStatusResponse chargebackImageStatusList(List<ChargebackImageStatusResponseStructure> chargebackImageStatusList) {
    
    this.chargebackImageStatusList = chargebackImageStatusList;
    return this;
  }

  public ChargebackImageStatusResponse addChargebackImageStatusListItem(ChargebackImageStatusResponseStructure chargebackImageStatusListItem) {
    if (this.chargebackImageStatusList == null) {
      this.chargebackImageStatusList = new ArrayList<ChargebackImageStatusResponseStructure>();
    }
    this.chargebackImageStatusList.add(chargebackImageStatusListItem);
    return this;
  }

   /**
   * A list of chargeback image statuses
   * @return chargebackImageStatusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of chargeback image statuses")

  public List<ChargebackImageStatusResponseStructure> getChargebackImageStatusList() {
    return chargebackImageStatusList;
  }


  public void setChargebackImageStatusList(List<ChargebackImageStatusResponseStructure> chargebackImageStatusList) {
    this.chargebackImageStatusList = chargebackImageStatusList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackImageStatusResponse chargebackImageStatusResponse = (ChargebackImageStatusResponse) o;
    return Objects.equals(this.chargebackImageStatusList, chargebackImageStatusResponse.chargebackImageStatusList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackImageStatusList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackImageStatusResponse {\n");
    sb.append("    chargebackImageStatusList: ").append(toIndentedString(chargebackImageStatusList)).append("\n");
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

