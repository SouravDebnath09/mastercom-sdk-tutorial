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
import com.mastercard.api.mastercom.model.ClaimDetail;
import com.mastercard.api.mastercom.model.ClaimResponse;
import com.mastercard.api.mastercom.model.CreateClaimRequest;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.UpdateClaimRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClaimsApi
 */
@Ignore
public class ClaimsApiTest {

    private final ClaimsApi api = new ClaimsApi();

    
    /**
     * 
     *
     * Issuers use this endpoint to create a new claim, which is required before creating a retrieval request or a first chargeback. If an issuer attempts to create a duplicate claim on an original transaction, the issuer receives a error message with the claim ID of the existing claim. Acquirers are not able to create claims. They receive claims from disputes that issuers initiate.   Note: issuers must have a first presentment in order to create a claim.   Note: issuers cannot create claims on first presentments that acquirers have reversed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClaimTest() throws ApiException {
        CreateClaimRequest body = null;
        ClaimResponse response = api.createClaim(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers and acquirers use this endpoint to retrieve details for an existing claim, including any cases with which the claim is associated.   Note: the Retrieve endpoint for claims contains document statuses (completed, pending, failed, unavailable, and document not applicable) for all documents attached to dispute events within a claim. Issuers and acquirers do not have to make a separate call to obtain document statuses, making the use of this endpoint efficient.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClaimDetailTest() throws ApiException {
        String claimId = null;
        ClaimDetail response = api.getClaimDetail(claimId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Issuers use this endpoint to take an action (reopen or close) on an existing claim.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClaimTest() throws ApiException {
        String claimId = null;
        UpdateClaimRequest body = null;
        ClaimResponse response = api.updateClaim(claimId, body);

        // TODO: test validations
    }
    
}
