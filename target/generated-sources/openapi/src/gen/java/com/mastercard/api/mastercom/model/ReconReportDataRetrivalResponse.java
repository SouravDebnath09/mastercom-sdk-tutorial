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
 * ReconReportDataRetrivalResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class ReconReportDataRetrivalResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;


  public ReconReportDataRetrivalResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of polling request. This can be Available, Unavailable or Failed. Failed status occurs if the data processing underwent some kind of error leading to unavailability of the report.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Available", value = "Status of polling request. This can be Available, Unavailable or Failed. Failed status occurs if the data processing underwent some kind of error leading to unavailability of the report.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ReconReportDataRetrivalResponse data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Base64 encoded String containing binary data for the CSV document. Decode the field to get a byte array that can be converted into a CSV file or String/Stream
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is an CSV file stored in a base64 encoded string", value = "Base64 encoded String containing binary data for the CSV document. Decode the field to get a byte array that can be converted into a CSV file or String/Stream")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconReportDataRetrivalResponse reconReportDataRetrivalResponse = (ReconReportDataRetrivalResponse) o;
    return Objects.equals(this.status, reconReportDataRetrivalResponse.status) &&
        Objects.equals(this.data, reconReportDataRetrivalResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReconReportDataRetrivalResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

