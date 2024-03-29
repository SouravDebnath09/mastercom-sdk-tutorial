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
import com.mastercard.api.mastercom.model.CreateFeeRequest;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.FeeResponse;
import com.mastercard.api.mastercom.model.LoadDataForFeeResponse;
import com.mastercard.api.mastercom.model.LoadDataForFeesRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeesApi
 */
@Ignore
public class FeesApiTest {

    private final FeesApi api = new FeesApi();

    
    /**
     * 
     *
     * Senders (issuers or acquirers) use this endpoint to create a fee collection for receivers (issuers or acquirers). Receivers use this endpoint to reply to a fee collection.   Note: Senders should create fee collections using this endpoint only (a) when permitted by chargeback rules and (b) when the fee collections are related to disputes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeeTest() throws ApiException {
        String claimId = null;
        CreateFeeRequest body = null;
        FeeResponse response = api.createFee(claimId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Senders (issuers or acquirers) use this endpoint to obtain information about a potential fee collection associated with a claim.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataForCreateFeeTest() throws ApiException {
        String claimId = null;
        LoadDataForFeesRequest body = null;
        LoadDataForFeeResponse response = api.getDataForCreateFee(claimId, body);

        // TODO: test validations
    }
    
}
