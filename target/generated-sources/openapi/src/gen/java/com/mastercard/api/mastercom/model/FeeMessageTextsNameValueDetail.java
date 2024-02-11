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
 * FeeMessageTextsNameValueDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class FeeMessageTextsNameValueDetail {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public FeeMessageTextsNameValueDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the element
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LOST/STOLEN CARD TRANSACTION FEE", value = "The name of the element")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FeeMessageTextsNameValueDetail value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the element
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LOST/STOLEN CARD TRANSACTION FEE", value = "The value of the element")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeMessageTextsNameValueDetail feeMessageTextsNameValueDetail = (FeeMessageTextsNameValueDetail) o;
    return Objects.equals(this.name, feeMessageTextsNameValueDetail.name) &&
        Objects.equals(this.value, feeMessageTextsNameValueDetail.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeMessageTextsNameValueDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

