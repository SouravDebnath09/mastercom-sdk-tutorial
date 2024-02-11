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
 * CONDITIONAL: Unless specified as REQUIRED, fileAttachment object is OPTIONAL. When fileAttachment is provided, then fileName and file parameters are required. The base64 encoded string must represent a ZIP, JPG, TIFF, or PDF file. Please note: ZIP files may contain JPG, TIFF or PDF files.
 */
@ApiModel(description = "CONDITIONAL: Unless specified as REQUIRED, fileAttachment object is OPTIONAL. When fileAttachment is provided, then fileName and file parameters are required. The base64 encoded string must represent a ZIP, JPG, TIFF, or PDF file. Please note: ZIP files may contain JPG, TIFF or PDF files.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class DocumentStructure {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String file;


  public DocumentStructure filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * File name of image.   Length: 1-16   Valid Values/Format: Alphanumeric
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testimage111111.tif", value = "File name of image.   Length: 1-16   Valid Values/Format: Alphanumeric")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public DocumentStructure file(String file) {
    
    this.file = file;
    return this;
  }

   /**
   * File converted to a base64 encoded string.   Length: 1-22000000   Valid Values/Format: Alphanumeric
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is an image file stored in a base64 encoded string", value = "File converted to a base64 encoded string.   Length: 1-22000000   Valid Values/Format: Alphanumeric")

  public String getFile() {
    return file;
  }


  public void setFile(String file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentStructure documentStructure = (DocumentStructure) o;
    return Objects.equals(this.filename, documentStructure.filename) &&
        Objects.equals(this.file, documentStructure.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentStructure {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

