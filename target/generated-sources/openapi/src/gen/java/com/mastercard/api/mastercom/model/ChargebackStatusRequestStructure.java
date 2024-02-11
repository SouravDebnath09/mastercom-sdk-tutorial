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
 * ChargebackStatusRequestStructure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class ChargebackStatusRequestStructure {
  public static final String SERIALIZED_NAME_CLAIM_ID = "claimId";
  @SerializedName(SERIALIZED_NAME_CLAIM_ID)
  private String claimId;

  public static final String SERIALIZED_NAME_CHARGEBACK_ID = "chargebackId";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_ID)
  private String chargebackId;


  public ChargebackStatusRequestStructure claimId(String claimId) {
    
    this.claimId = claimId;
    return this;
  }

   /**
   * Claim Id.   Length: 1-19   Valid Values/Format: Numeric
   * @return claimId
  **/
  @ApiModelProperty(example = "200002020654", required = true, value = "Claim Id.   Length: 1-19   Valid Values/Format: Numeric")

  public String getClaimId() {
    return claimId;
  }


  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }


  public ChargebackStatusRequestStructure chargebackId(String chargebackId) {
    
    this.chargebackId = chargebackId;
    return this;
  }

   /**
   * Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric
   * @return chargebackId
  **/
  @ApiModelProperty(example = "300018439680", required = true, value = "Chargeback Id.   Length: 1-19   Valid Values/Format: Numeric")

  public String getChargebackId() {
    return chargebackId;
  }


  public void setChargebackId(String chargebackId) {
    this.chargebackId = chargebackId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackStatusRequestStructure chargebackStatusRequestStructure = (ChargebackStatusRequestStructure) o;
    return Objects.equals(this.claimId, chargebackStatusRequestStructure.claimId) &&
        Objects.equals(this.chargebackId, chargebackStatusRequestStructure.chargebackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, chargebackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackStatusRequestStructure {\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    chargebackId: ").append(toIndentedString(chargebackId)).append("\n");
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

