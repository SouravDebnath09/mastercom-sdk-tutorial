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
 * CreateClaimRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CreateClaimRequest {
  public static final String SERIALIZED_NAME_DISPUTED_AMOUNT = "disputedAmount";
  @SerializedName(SERIALIZED_NAME_DISPUTED_AMOUNT)
  private String disputedAmount;

  public static final String SERIALIZED_NAME_DISPUTED_CURRENCY = "disputedCurrency";
  @SerializedName(SERIALIZED_NAME_DISPUTED_CURRENCY)
  private String disputedCurrency;

  /**
   * Type of claim to be created.   Length: 8   Valid Values/Format: Standard
   */
  @JsonAdapter(ClaimTypeEnum.Adapter.class)
  public enum ClaimTypeEnum {
    STANDARD("Standard");

    private String value;

    ClaimTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClaimTypeEnum fromValue(String value) {
      for (ClaimTypeEnum b : ClaimTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClaimTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClaimTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClaimTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClaimTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLAIM_TYPE = "claimType";
  @SerializedName(SERIALIZED_NAME_CLAIM_TYPE)
  private ClaimTypeEnum claimType;

  public static final String SERIALIZED_NAME_CLEARING_TRANSACTION_ID = "clearingTransactionId";
  @SerializedName(SERIALIZED_NAME_CLEARING_TRANSACTION_ID)
  private String clearingTransactionId;

  public static final String SERIALIZED_NAME_AUTH_TRANSACTION_ID = "authTransactionId";
  @SerializedName(SERIALIZED_NAME_AUTH_TRANSACTION_ID)
  private String authTransactionId;


  public CreateClaimRequest disputedAmount(String disputedAmount) {
    
    this.disputedAmount = disputedAmount;
    return this;
  }

   /**
   * Amount disputed in the claim   Length: 4-12   Valid Values/Format: Numeric
   * @return disputedAmount
  **/
  @ApiModelProperty(example = "100.00", required = true, value = "Amount disputed in the claim   Length: 4-12   Valid Values/Format: Numeric")

  public String getDisputedAmount() {
    return disputedAmount;
  }


  public void setDisputedAmount(String disputedAmount) {
    this.disputedAmount = disputedAmount;
  }


  public CreateClaimRequest disputedCurrency(String disputedCurrency) {
    
    this.disputedCurrency = disputedCurrency;
    return this;
  }

   /**
   * Currency of amount disputed in the claim. disputedCurrency can be provided as standard alpha code or numeric code   Length: 3   Valid Values/Format: A-Z (Uppercase Alphabetic Letter) / Numeric
   * @return disputedCurrency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "Currency of amount disputed in the claim. disputedCurrency can be provided as standard alpha code or numeric code   Length: 3   Valid Values/Format: A-Z (Uppercase Alphabetic Letter) / Numeric")

  public String getDisputedCurrency() {
    return disputedCurrency;
  }


  public void setDisputedCurrency(String disputedCurrency) {
    this.disputedCurrency = disputedCurrency;
  }


  public CreateClaimRequest claimType(ClaimTypeEnum claimType) {
    
    this.claimType = claimType;
    return this;
  }

   /**
   * Type of claim to be created.   Length: 8   Valid Values/Format: Standard
   * @return claimType
  **/
  @ApiModelProperty(example = "Standard", required = true, value = "Type of claim to be created.   Length: 8   Valid Values/Format: Standard")

  public ClaimTypeEnum getClaimType() {
    return claimType;
  }


  public void setClaimType(ClaimTypeEnum claimType) {
    this.claimType = claimType;
  }


  public CreateClaimRequest clearingTransactionId(String clearingTransactionId) {
    
    this.clearingTransactionId = clearingTransactionId;
    return this;
  }

   /**
   * The Clearing Transaction Identifier from Clearing Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return clearingTransactionId
  **/
  @ApiModelProperty(example = "ccCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTzSfaIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y=", required = true, value = "The Clearing Transaction Identifier from Clearing Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)")

  public String getClearingTransactionId() {
    return clearingTransactionId;
  }


  public void setClearingTransactionId(String clearingTransactionId) {
    this.clearingTransactionId = clearingTransactionId;
  }


  public CreateClaimRequest authTransactionId(String authTransactionId) {
    
    this.authTransactionId = authTransactionId;
    return this;
  }

   /**
   * The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return authTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aaCnaMDqmto4wnL+BSUKSdzROqGJ7YELoKhEvluycwKNg3XTzSfaIJhFDkl9hW081B5tTqFFiAwCpcocPdB2My4t7DtSTk63VXDl1CySA8Y=", value = "The Authorization Transaction Identifier from Authorization Summary Results.   Length: N/A   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)")

  public String getAuthTransactionId() {
    return authTransactionId;
  }


  public void setAuthTransactionId(String authTransactionId) {
    this.authTransactionId = authTransactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClaimRequest createClaimRequest = (CreateClaimRequest) o;
    return Objects.equals(this.disputedAmount, createClaimRequest.disputedAmount) &&
        Objects.equals(this.disputedCurrency, createClaimRequest.disputedCurrency) &&
        Objects.equals(this.claimType, createClaimRequest.claimType) &&
        Objects.equals(this.clearingTransactionId, createClaimRequest.clearingTransactionId) &&
        Objects.equals(this.authTransactionId, createClaimRequest.authTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputedAmount, disputedCurrency, claimType, clearingTransactionId, authTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClaimRequest {\n");
    sb.append("    disputedAmount: ").append(toIndentedString(disputedAmount)).append("\n");
    sb.append("    disputedCurrency: ").append(toIndentedString(disputedCurrency)).append("\n");
    sb.append("    claimType: ").append(toIndentedString(claimType)).append("\n");
    sb.append("    clearingTransactionId: ").append(toIndentedString(clearingTransactionId)).append("\n");
    sb.append("    authTransactionId: ").append(toIndentedString(authTransactionId)).append("\n");
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

