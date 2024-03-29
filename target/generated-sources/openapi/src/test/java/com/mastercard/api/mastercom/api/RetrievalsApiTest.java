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


package com.mastercard.api.mastercom.api;

import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.model.AcquirerFulfillmentRequest;
import com.mastercard.api.mastercom.model.AcquirerFulfillmentResponse;
import com.mastercard.api.mastercom.model.CreateRetrievalRequest;
import com.mastercard.api.mastercom.model.CreateRetrievalResponse;
import com.mastercard.api.mastercom.model.DocumentResponseStructure;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.IssuerFulfillmentRequest;
import com.mastercard.api.mastercom.model.LoadDataForRetrievalResponse;
import com.mastercard.api.mastercom.model.RetrievalResponse;
import com.mastercard.api.mastercom.model.RetrievalStatusRequest;
import com.mastercard.api.mastercom.model.RetrievalStatusResponse;
import com.mastercard.api.mastercom.model.RetrievalsImageStatusRequest;
import com.mastercard.api.mastercom.model.RetrievalsImageStatusResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetrievalsApi
 */
@Ignore
public class RetrievalsApiTest {

    private final RetrievalsApi api = new RetrievalsApi();

    
    /**
     * 
     *
     * After receiving a retrieval request from an issuer, an acquirer uses this endpoint to either provide a copy or substitute draft of the transaction information document (TID) or provide a reason for failing to fulfill the retrieval request.   Note: If the API call to this endpoint times out, customers should use the Retrieval Fulfillment Status or Retrieve Claims endpoint to determine the success or failure of document processing.   NOTE: Below acquirerResponseCd codes will be accepted starting on February 26th, 2023.&lt;br&gt;  A - Funds Movement Request&lt;br&gt;  B - Refunded&lt;br&gt;  C - Initiating Refund&lt;br&gt;  E - Reject Collaboration&lt;br&gt;  F - IIAS Unfulfillable&lt;br&gt;  G - IIAS Invalid request information&lt;br&gt;  H - IIAS Fulfilled outside MasterCom system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acqFulfillRetrievalRequestTest() throws ApiException {
        String claimId = null;
        String requestId = null;
        AcquirerFulfillmentRequest body = null;
        AcquirerFulfillmentResponse response = api.acqFulfillRetrievalRequest(claimId, requestId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Prior to creating a chargeback, an issuer uses this endpoint to create a retrieval request for the acquirer to fulfill by providing a copy of the transaction information document (TID). The TID is used to satisfy a cardholder&#39;s inquiry or to satisfy an issuer&#39;s investigation of an original transaction.   NOTE: an issuer is not required to create a retrieval request in order to create a first chargeback on a claim.   NOTE: Below retrievalRequestReason codes will be accepted until October 23th, 2021.&lt;br&gt;  6305 - Cardholder does not agree with amount billed&lt;br&gt;  6321 - Cardholder does not recognize transaction&lt;br&gt;  6322 - Request Transaction Certificate for a chip transaction&lt;br&gt;  6323 - Cardholder needs information for personal records&lt;br&gt;  6341 - Fraud investigation&lt;br&gt;  6342 - Potential chargeback or compliance documentation is required&lt;br&gt;  6343 - IIAS Audit (for healthcare transactions only)&lt;br&gt;  6390 - Identifies a syntax error return   NOTE: Below retrievalRequestReason code will be accepted for creation of retrieval request starting on October 24th, 2021.&lt;br&gt;  6343 - IIAS Audit (for healthcare transactions only)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRetrievalRequestTest() throws ApiException {
        String claimId = null;
        CreateRetrievalRequest body = null;
        CreateRetrievalResponse response = api.createRetrievalRequest(claimId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * An issuer uses this endpoint to retrieve values associated with a claim in preparation for creating a retrieval request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataForCreateRetrievalRequestTest() throws ApiException {
        String claimId = null;
        LoadDataForRetrievalResponse response = api.getDataForCreateRetrievalRequest(claimId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to retrieve all documents from acquirers associated with retrieval request fulfillment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRetrievalDocTest() throws ApiException {
        String claimId = null;
        String requestId = null;
        String format = null;
        DocumentResponseStructure response = api.getRetrievalDoc(claimId, requestId, format);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * After an acquirer fulfills a retrieval request, an issuer uses this endpoint to approve or reject a retrieval request fulfillment. The issuer approves the fulfillment or rejects the fulfillment if the documentation does not meet requirements.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issuerResponseRetrievalRequestTest() throws ApiException {
        String claimId = null;
        String requestId = null;
        IssuerFulfillmentRequest body = null;
        RetrievalResponse response = api.issuerResponseRetrievalRequest(claimId, requestId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to search for documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for retrieval requests.   Note: For customers with high volumes of fulfillments or large numbers of BINs, Mastercom recommends using the Retrieval Fullfilment Status endpoint rather than the Retrieval Fullfilment Image Status endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFulfillmentImageStatusTest() throws ApiException {
        RetrievalsImageStatusRequest body = null;
        RetrievalsImageStatusResponse response = api.retrieveFulfillmentImageStatus(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to search for the status of documents that are associated with a specific list of retrieval requests.   Note: issuers and acquirers may send a maximum of 2,000 retrieval fulfillment IDs within a single request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFulfillmentStatusTest() throws ApiException {
        RetrievalStatusRequest body = null;
        RetrievalStatusResponse response = api.retrieveFulfillmentStatus(body);

        // TODO: test validations
    }
    
}
