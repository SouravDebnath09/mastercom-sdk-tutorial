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
import com.mastercard.api.mastercom.model.ChargebackImageStatusRequest;
import com.mastercard.api.mastercom.model.ChargebackImageStatusResponse;
import com.mastercard.api.mastercom.model.ChargebackMarkProcessedRequest;
import com.mastercard.api.mastercom.model.ChargebackMarkProcessedResponse;
import com.mastercard.api.mastercom.model.ChargebackResponse;
import com.mastercard.api.mastercom.model.ChargebackStatusRequest;
import com.mastercard.api.mastercom.model.ChargebackStatusResponse;
import com.mastercard.api.mastercom.model.CreateChargebackSingleRequest;
import com.mastercard.api.mastercom.model.CreateChargebackSingleReversalRequest;
import com.mastercard.api.mastercom.model.DocumentResponseStructure;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.UpdateChargebackRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChargebacksDebitMasterCardAndEuropeDualAcquirerApi
 */
@Ignore
public class ChargebacksDebitMasterCardAndEuropeDualAcquirerApiTest {

    private final ChargebacksDebitMasterCardAndEuropeDualAcquirerApi api = new ChargebacksDebitMasterCardAndEuropeDualAcquirerApi();

    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to acknowledge a chargeback or second presentment. Acknowledging a chargeback or second presentment moves the claim from the Unworked queue to the Worked queue. Acknowledging the chargeback or second presentment does not close the claim. Issuers and acquirers may take further actions on acknowledged claims.   Note: for efficient processing, issuers and acquirers should send 100 acknowledgments or fewer in a single request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acknowledgeChargebacksDebitMCTest() throws ApiException {
        ChargebackMarkProcessedRequest body = null;
        ChargebackMarkProcessedResponse response = api.acknowledgeChargebacksDebitMC(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers use this endpoint to create chargebacks for Debit Mastercard or Europe Dual Acquirer transactions and optionally to upload supporting documents. Issuers should only use this endpoint when the transaction has a single-message issuer, dual-message acquirer, and a transaction without a PIN.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChargebackDebitMCTest() throws ApiException {
        String claimId = null;
        CreateChargebackSingleRequest body = null;
        ChargebackResponse response = api.createChargebackDebitMC(claimId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers use this endpoint to reverse an existing Debit Mastercard or Europe Dual Acquirer chargeback when they create a chargeback in error.   Note: issuers may only create reversals on chargebacks after the chargebacks are processed by Mastercard Debit Switch (MDS).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChargebackReversalDebitMCTest() throws ApiException {
        String claimId = null;
        String chargebackId = null;
        CreateChargebackSingleReversalRequest body = null;
        ChargebackResponse response = api.createChargebackReversalDebitMC(claimId, chargebackId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to retrieve documents in a desired format associated with any type of chargeback.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChargebackDocDebitMCTest() throws ApiException {
        String claimId = null;
        String chargebackId = null;
        String format = null;
        DocumentResponseStructure response = api.getChargebackDocDebitMC(claimId, chargebackId, format);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to search for documents that have a specific status (completed, pending, failed, unavailable, and document not applicable) for chargebacks.   Note: For customers with high volumes of chargebacks or large numbers of BINs, Mastercom recommends using the Chargebacks Status endpoint rather than the Chargebacks Image Status endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveChargebackImageStatusDebitMCTest() throws ApiException {
        ChargebackImageStatusRequest body = null;
        ChargebackImageStatusResponse response = api.retrieveChargebackImageStatusDebitMC(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to search for the status of documents of a specific list of claim IDs and chargeback IDs.   Note: issuers and acquirers may send a maximum of 2,000 chargeback IDs within a single request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveChargebackStatusDebitMCTest() throws ApiException {
        ChargebackStatusRequest body = null;
        ChargebackStatusResponse response = api.retrieveChargebackStatusDebitMC(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers use this endpoint to update an existing Debit Mastercard or Europe Dual Acquirer chargeback with memos or documents if they did not attach memos or documents when creating the chargeback.   Note: If the API call to this endpoint times out, customers should use the Chargeback Status or Retrieve Claim endpoint to determine the success or failure of document processing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChargebackDebitMCTest() throws ApiException {
        String claimId = null;
        String chargebackId = null;
        UpdateChargebackRequest body = null;
        ChargebackResponse response = api.updateChargebackDebitMC(claimId, chargebackId, body);

        // TODO: test validations
    }
    
}
