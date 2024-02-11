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
 * CreateRetrievalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-11T16:27:04.249+05:30[Asia/Kolkata]")
public class CreateRetrievalRequest {
  /**
   * Retrieval Request Reason Codes.   NOTE: Below retrievalRequestReason code will be accepted for creation of retrieval request starting on October 24th, 2021.&lt;br&gt;  6343 - IIAS Audit (for healthcare transactions only)   Length: 1-4   Valid Values/Format: 6343 - IIAS Audit (for healthcare transactions only)
   */
  @JsonAdapter(RetrievalRequestReasonEnum.Adapter.class)
  public enum RetrievalRequestReasonEnum {
    _6343("6343");

    private String value;

    RetrievalRequestReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RetrievalRequestReasonEnum fromValue(String value) {
      for (RetrievalRequestReasonEnum b : RetrievalRequestReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RetrievalRequestReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RetrievalRequestReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RetrievalRequestReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RetrievalRequestReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RETRIEVAL_REQUEST_REASON = "retrievalRequestReason";
  @SerializedName(SERIALIZED_NAME_RETRIEVAL_REQUEST_REASON)
  private RetrievalRequestReasonEnum retrievalRequestReason;

  /**
   * Documentation Needed Indicator.   Length: 1   Valid Values/Format: 2 - Copy or image (photocopy, microfilm, fax) of original document, 4 - Substitute draft
   */
  @JsonAdapter(DocNeededEnum.Adapter.class)
  public enum DocNeededEnum {
    _2("2"),
    
    _4("4");

    private String value;

    DocNeededEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocNeededEnum fromValue(String value) {
      for (DocNeededEnum b : DocNeededEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocNeededEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocNeededEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocNeededEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocNeededEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOC_NEEDED = "docNeeded";
  @SerializedName(SERIALIZED_NAME_DOC_NEEDED)
  private DocNeededEnum docNeeded;

  public static final String SERIALIZED_NAME_INSTRUCTIONS_FOR_HEALTHCARE = "instructionsForHealthcare";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS_FOR_HEALTHCARE)
  private String instructionsForHealthcare;


  public CreateRetrievalRequest retrievalRequestReason(RetrievalRequestReasonEnum retrievalRequestReason) {
    
    this.retrievalRequestReason = retrievalRequestReason;
    return this;
  }

   /**
   * Retrieval Request Reason Codes.   NOTE: Below retrievalRequestReason code will be accepted for creation of retrieval request starting on October 24th, 2021.&lt;br&gt;  6343 - IIAS Audit (for healthcare transactions only)   Length: 1-4   Valid Values/Format: 6343 - IIAS Audit (for healthcare transactions only)
   * @return retrievalRequestReason
  **/
  @ApiModelProperty(example = "6343", required = true, value = "Retrieval Request Reason Codes.   NOTE: Below retrievalRequestReason code will be accepted for creation of retrieval request starting on October 24th, 2021.<br>  6343 - IIAS Audit (for healthcare transactions only)   Length: 1-4   Valid Values/Format: 6343 - IIAS Audit (for healthcare transactions only)")

  public RetrievalRequestReasonEnum getRetrievalRequestReason() {
    return retrievalRequestReason;
  }


  public void setRetrievalRequestReason(RetrievalRequestReasonEnum retrievalRequestReason) {
    this.retrievalRequestReason = retrievalRequestReason;
  }


  public CreateRetrievalRequest docNeeded(DocNeededEnum docNeeded) {
    
    this.docNeeded = docNeeded;
    return this;
  }

   /**
   * Documentation Needed Indicator.   Length: 1   Valid Values/Format: 2 - Copy or image (photocopy, microfilm, fax) of original document, 4 - Substitute draft
   * @return docNeeded
  **/
  @ApiModelProperty(example = "2", required = true, value = "Documentation Needed Indicator.   Length: 1   Valid Values/Format: 2 - Copy or image (photocopy, microfilm, fax) of original document, 4 - Substitute draft")

  public DocNeededEnum getDocNeeded() {
    return docNeeded;
  }


  public void setDocNeeded(DocNeededEnum docNeeded) {
    this.docNeeded = docNeeded;
  }


  public CreateRetrievalRequest instructionsForHealthcare(String instructionsForHealthcare) {
    
    this.instructionsForHealthcare = instructionsForHealthcare;
    return this;
  }

   /**
   * Instructions for Healthcare.   CONDITIONAL: Required when retrievalRequestReason &#x3D; 6343.   Length: 16-200   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&amp;*()_+{}|:\&quot;&lt;&gt;?,./;&#39;[]-&#x3D;)
   * @return instructionsForHealthcare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Instructions to acquirer for fulfilling the retrieval request", value = "Instructions for Healthcare.   CONDITIONAL: Required when retrievalRequestReason = 6343.   Length: 16-200   Valid Values/Format: Alphanumeric, Special Char (~!@#$%^&*()_+{}|:\"<>?,./;'[]-=)")

  public String getInstructionsForHealthcare() {
    return instructionsForHealthcare;
  }


  public void setInstructionsForHealthcare(String instructionsForHealthcare) {
    this.instructionsForHealthcare = instructionsForHealthcare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRetrievalRequest createRetrievalRequest = (CreateRetrievalRequest) o;
    return Objects.equals(this.retrievalRequestReason, createRetrievalRequest.retrievalRequestReason) &&
        Objects.equals(this.docNeeded, createRetrievalRequest.docNeeded) &&
        Objects.equals(this.instructionsForHealthcare, createRetrievalRequest.instructionsForHealthcare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retrievalRequestReason, docNeeded, instructionsForHealthcare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRetrievalRequest {\n");
    sb.append("    retrievalRequestReason: ").append(toIndentedString(retrievalRequestReason)).append("\n");
    sb.append("    docNeeded: ").append(toIndentedString(docNeeded)).append("\n");
    sb.append("    instructionsForHealthcare: ").append(toIndentedString(instructionsForHealthcare)).append("\n");
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

