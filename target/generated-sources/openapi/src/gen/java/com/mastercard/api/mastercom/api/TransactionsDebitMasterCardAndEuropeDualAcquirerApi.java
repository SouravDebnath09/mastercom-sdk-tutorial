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


import com.mastercard.api.mastercom.model.Errors;
import com.mastercard.api.mastercom.model.TransactionSingleMessageDetail;
import com.mastercard.api.mastercom.model.TransactionSingleMessageSummaryList;
import com.mastercard.api.mastercom.model.TransactionSingleSearchRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionsDebitMasterCardAndEuropeDualAcquirerApi {
    private ApiClient localVarApiClient;

    public TransactionsDebitMasterCardAndEuropeDualAcquirerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsDebitMasterCardAndEuropeDualAcquirerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for transactionDebitMCMessageDetail
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
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
    public okhttp3.Call transactionDebitMCMessageDetailCall(String claimId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v6/{claim-id}/transactions/debitmc/detail"
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
    private okhttp3.Call transactionDebitMCMessageDetailValidateBeforeCall(String claimId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'claimId' is set
        if (claimId == null) {
            throw new ApiException("Missing the required parameter 'claimId' when calling transactionDebitMCMessageDetail(Async)");
        }
        

        okhttp3.Call localVarCall = transactionDebitMCMessageDetailCall(claimId, _callback);
        return localVarCall;

    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve details for the Mastercard Debit or Europe Dual Acquirer original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @return TransactionSingleMessageDetail
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
    public TransactionSingleMessageDetail transactionDebitMCMessageDetail(String claimId) throws ApiException {
        ApiResponse<TransactionSingleMessageDetail> localVarResp = transactionDebitMCMessageDetailWithHttpInfo(claimId);
        return localVarResp.getData();
    }

    /**
     * 
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve details for the Mastercard Debit or Europe Dual Acquirer original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
     * @return ApiResponse&lt;TransactionSingleMessageDetail&gt;
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
    public ApiResponse<TransactionSingleMessageDetail> transactionDebitMCMessageDetailWithHttpInfo(String claimId) throws ApiException {
        okhttp3.Call localVarCall = transactionDebitMCMessageDetailValidateBeforeCall(claimId, null);
        Type localVarReturnType = new TypeToken<TransactionSingleMessageDetail>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * After an issuer creates a claim, the issuer uses this endpoint to retrieve details for the Mastercard Debit or Europe Dual Acquirer original transaction involved in the claim.
     * @param claimId Claim Id.   Length: 1-19   Valid Values/Format: Numeric (required)
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
    public okhttp3.Call transactionDebitMCMessageDetailAsync(String claimId, final ApiCallback<TransactionSingleMessageDetail> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionDebitMCMessageDetailValidateBeforeCall(claimId, _callback);
        Type localVarReturnType = new TypeToken<TransactionSingleMessageDetail>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transactionMessageSearchDebitMC
     * @param body Transaction DebitMC Message Search Request (required)
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
    public okhttp3.Call transactionMessageSearchDebitMCCall(TransactionSingleSearchRequest body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v6/transactions/debitmc/search";

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
    private okhttp3.Call transactionMessageSearchDebitMCValidateBeforeCall(TransactionSingleSearchRequest body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling transactionMessageSearchDebitMC(Async)");
        }
        

        okhttp3.Call localVarCall = transactionMessageSearchDebitMCCall(body, _callback);
        return localVarCall;

    }

    /**
     * 
     * An issuer uses this endpoint to search for information about an Mastercard Debit or Europe Dual Acquirer original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.
     * @param body Transaction DebitMC Message Search Request (required)
     * @return TransactionSingleMessageSummaryList
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
    public TransactionSingleMessageSummaryList transactionMessageSearchDebitMC(TransactionSingleSearchRequest body) throws ApiException {
        ApiResponse<TransactionSingleMessageSummaryList> localVarResp = transactionMessageSearchDebitMCWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 
     * An issuer uses this endpoint to search for information about an Mastercard Debit or Europe Dual Acquirer original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.
     * @param body Transaction DebitMC Message Search Request (required)
     * @return ApiResponse&lt;TransactionSingleMessageSummaryList&gt;
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
    public ApiResponse<TransactionSingleMessageSummaryList> transactionMessageSearchDebitMCWithHttpInfo(TransactionSingleSearchRequest body) throws ApiException {
        okhttp3.Call localVarCall = transactionMessageSearchDebitMCValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TransactionSingleMessageSummaryList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * An issuer uses this endpoint to search for information about an Mastercard Debit or Europe Dual Acquirer original transaction. An issuer may use this information to take an action on the original transaction, such as creating a claim.
     * @param body Transaction DebitMC Message Search Request (required)
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
    public okhttp3.Call transactionMessageSearchDebitMCAsync(TransactionSingleSearchRequest body, final ApiCallback<TransactionSingleMessageSummaryList> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionMessageSearchDebitMCValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TransactionSingleMessageSummaryList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
