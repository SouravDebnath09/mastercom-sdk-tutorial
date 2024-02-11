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

import com.mastercard.api.mastercom.ApiCallback;
import com.mastercard.api.mastercom.ApiClient;
import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.ApiResponse;
import com.mastercard.api.mastercom.Configuration;
import com.mastercard.api.mastercom.Pair;
import com.mastercard.api.mastercom.ProgressRequestBody;
import com.mastercard.api.mastercom.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mastercard.api.mastercom.model.CreateFraudMasterCardRequest;
import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.FraudResponse;
import com.mastercard.api.mastercom.model.LoadDataForFraudResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FraudApi {
    private ApiClient localVarApiClient;

    public FraudApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FraudApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createFraudMasterCard
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fraud MasterCard Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFraudMasterCardCall(String claimId, CreateFraudMasterCardRequest body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v6/claims/{claim-id}/fraud/mastercard"
            .replaceAll("\\{" + "claim-id" + "\\}", localVarApiClient.escapeString(claimId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createFraudMasterCardValidateBeforeCall(String claimId, CreateFraudMasterCardRequest body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling createFraudMasterCard(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFraudMasterCard(Async)");
        }
        

        okhttp3.Call localVarCall = createFraudMasterCardCall(claimId, body, _callback);
        return localVarCall;

    }

    /**
     * 
     * An issuer uses this endpoint to create a new fraud item when the issuer determines that a transaction was fraudulent.   Note: Mastercom allows issuers to create fraud items in the Fraud and Loss database. However, issuers must use the Fraud and Loss application to make further updates to fraud items.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fraud MasterCard Request (required)
     * @return FraudResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public FraudResponse createFraudMasterCard(String claimId, CreateFraudMasterCardRequest body) throws ApiException {
        ApiResponse<FraudResponse> localVarResp = createFraudMasterCardWithHttpInfo(claimId, body);
        return localVarResp.getData();
    }

    /**
     * 
     * An issuer uses this endpoint to create a new fraud item when the issuer determines that a transaction was fraudulent.   Note: Mastercom allows issuers to create fraud items in the Fraud and Loss database. However, issuers must use the Fraud and Loss application to make further updates to fraud items.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fraud MasterCard Request (required)
     * @return ApiResponse&lt;FraudResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FraudResponse> createFraudMasterCardWithHttpInfo(String claimId, CreateFraudMasterCardRequest body) throws ApiException {
        okhttp3.Call localVarCall = createFraudMasterCardValidateBeforeCall(claimId, body, null);
        Type localVarReturnType = new TypeToken<FraudResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * An issuer uses this endpoint to create a new fraud item when the issuer determines that a transaction was fraudulent.   Note: Mastercom allows issuers to create fraud items in the Fraud and Loss database. However, issuers must use the Fraud and Loss application to make further updates to fraud items.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param body Create Fraud MasterCard Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFraudMasterCardAsync(String claimId, CreateFraudMasterCardRequest body, final ApiCallback<FraudResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFraudMasterCardValidateBeforeCall(claimId, body, _callback);
        Type localVarReturnType = new TypeToken<FraudResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDataForCreateFraud
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataForCreateFraudCall(String claimId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v6/claims/{claim-id}/fraud/loaddataforfraud"
            .replaceAll("\\{" + "claim-id" + "\\}", localVarApiClient.escapeString(claimId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDataForCreateFraudValidateBeforeCall(String claimId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling getDataForCreateFraud(Async)");
        }
        

        okhttp3.Call localVarCall = getDataForCreateFraudCall(claimId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Issuers use this endpoint to obtain fraud-related information associated with a claim before creating a fraud item for the claim.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @return LoadDataForFraudResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public LoadDataForFraudResponse getDataForCreateFraud(String claimId) throws ApiException {
        ApiResponse<LoadDataForFraudResponse> localVarResp = getDataForCreateFraudWithHttpInfo(claimId);
        return localVarResp.getData();
    }

    /**
     * 
     * Issuers use this endpoint to obtain fraud-related information associated with a claim before creating a fraud item for the claim.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @return ApiResponse&lt;LoadDataForFraudResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LoadDataForFraudResponse> getDataForCreateFraudWithHttpInfo(String claimId) throws ApiException {
        okhttp3.Call localVarCall = getDataForCreateFraudValidateBeforeCall(claimId, null);
        Type localVarReturnType = new TypeToken<LoadDataForFraudResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Issuers use this endpoint to obtain fraud-related information associated with a claim before creating a fraud item for the claim.
     * @param claimId Claim Id for the fraud item.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataForCreateFraudAsync(String claimId, final ApiCallback<LoadDataForFraudResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataForCreateFraudValidateBeforeCall(claimId, _callback);
        Type localVarReturnType = new TypeToken<LoadDataForFraudResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
