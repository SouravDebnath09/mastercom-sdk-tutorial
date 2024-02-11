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
import com.mastercard.api.mastercom.model.AuthorizationDetail;
import com.mastercard.api.mastercom.model.ClearingDetail;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.TransactionSearchRequest;
import com.mastercard.api.mastercom.model.TransactionSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
@Ignore
public class TransactionsApiTest {

    private final TransactionsApi api = new TransactionsApi();

    
    /**
     * 
     *
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve clearing details for the original transaction involved in the claim. Acquirers may also use this endpoint to retrieve clearing details associated with an original transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionClearingDetailTest() throws ApiException {
        String claimId = null;
        String transactionId = null;
        ClearingDetail response = api.getTransactionClearingDetail(claimId, transactionId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve authorization details for the original transaction involved in the claim.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAuthorizationDetailTest() throws ApiException {
        String claimId = null;
        String transactionId = null;
        AuthorizationDetail response = api.retrieveAuthorizationDetail(claimId, transactionId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * An issuer uses this endpoint to search for information about an original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.   Note: Mastercom retrieves transactions normally when the clearing occurs within 150 days of authorization. To find late presentments and Brazilian installment transactions, provide the acquirer reference number (ARN) and the clearing date associated with the ARN of the first presentment in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionSearchTest() throws ApiException {
        TransactionSearchRequest body = null;
        TransactionSummary response = api.transactionSearch(body);

        // TODO: test validations
    }
    
}
