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
import com.mastercard.api.mastercom.model.ChargebackStatusRequestStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChargebackStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class ChargebackStatusRequest {
  public static final String SERIALIZED_NAME_CHARGEBACK_LIST = "chargebackList";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_LIST)
  private List<ChargebackStatusRequestStructure> chargebackList = new ArrayList<ChargebackStatusRequestStructure>();


  public ChargebackStatusRequest chargebackList(List<ChargebackStatusRequestStructure> chargebackList) {
    
    this.chargebackList = chargebackList;
    return this;
  }

  public ChargebackStatusRequest addChargebackListItem(ChargebackStatusRequestStructure chargebackListItem) {
    this.chargebackList.add(chargebackListItem);
    return this;
  }

   /**
   * A list of Chargeback Ids to query, maximum list size is 2000
   * @return chargebackList
  **/
  @ApiModelProperty(required = true, value = "A list of Chargeback Ids to query, maximum list size is 2000")

  public List<ChargebackStatusRequestStructure> getChargebackList() {
    return chargebackList;
  }


  public void setChargebackList(List<ChargebackStatusRequestStructure> chargebackList) {
    this.chargebackList = chargebackList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackStatusRequest chargebackStatusRequest = (ChargebackStatusRequest) o;
    return Objects.equals(this.chargebackList, chargebackStatusRequest.chargebackList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackStatusRequest {\n");
    sb.append("    chargebackList: ").append(toIndentedString(chargebackList)).append("\n");
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

