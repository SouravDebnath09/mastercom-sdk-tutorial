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
import com.mastercard.api.mastercom.model.ReconReportDataAcknowledgeRequest;
import com.mastercard.api.mastercom.model.ReconReportDataAcknowledgeResponse;
import com.mastercard.api.mastercom.model.ReconReportDataRetrivalResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconciliationApi {
    private ApiClient localVarApiClient;

    public ReconciliationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReconciliationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for reconReportDataAcknowledge
     * @param reconDataRequest Reconciliation data request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconReportDataAcknowledgeCall(ReconReportDataAcknowledgeRequest reconDataRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = reconDataRequest;

        // create path and map variables
        String localVarPath = "/v6/reconreport/data/request";

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
    private okhttp3.Call reconReportDataAcknowledgeValidateBeforeCall(ReconReportDataAcknowledgeRequest reconDataRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reconDataRequest' is set
        if (reconDataRequest == null) {
            throw new ApiException("Missing the required parameter 'reconDataRequest' when calling reconReportDataAcknowledge(Async)");
        }
        

        okhttp3.Call localVarCall = reconReportDataAcknowledgeCall(reconDataRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * An issuer or acquirer uses this endpoint to request that Mastercom generate a reconciliation report or enhanced reconciliation report for a specified date range.   Note: The issuer or acquirer receives a unique report identifier in the response. Using the unique report identifier from this endpoint, the issuer or acquirer then retrieves the report from the Retrieve Reconciliation Report endpoint.
     * @param reconDataRequest Reconciliation data request (required)
     * @return ReconReportDataAcknowledgeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ReconReportDataAcknowledgeResponse reconReportDataAcknowledge(ReconReportDataAcknowledgeRequest reconDataRequest) throws ApiException {
        ApiResponse<ReconReportDataAcknowledgeResponse> localVarResp = reconReportDataAcknowledgeWithHttpInfo(reconDataRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * An issuer or acquirer uses this endpoint to request that Mastercom generate a reconciliation report or enhanced reconciliation report for a specified date range.   Note: The issuer or acquirer receives a unique report identifier in the response. Using the unique report identifier from this endpoint, the issuer or acquirer then retrieves the report from the Retrieve Reconciliation Report endpoint.
     * @param reconDataRequest Reconciliation data request (required)
     * @return ApiResponse&lt;ReconReportDataAcknowledgeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconReportDataAcknowledgeResponse> reconReportDataAcknowledgeWithHttpInfo(ReconReportDataAcknowledgeRequest reconDataRequest) throws ApiException {
        okhttp3.Call localVarCall = reconReportDataAcknowledgeValidateBeforeCall(reconDataRequest, null);
        Type localVarReturnType = new TypeToken<ReconReportDataAcknowledgeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * An issuer or acquirer uses this endpoint to request that Mastercom generate a reconciliation report or enhanced reconciliation report for a specified date range.   Note: The issuer or acquirer receives a unique report identifier in the response. Using the unique report identifier from this endpoint, the issuer or acquirer then retrieves the report from the Retrieve Reconciliation Report endpoint.
     * @param reconDataRequest Reconciliation data request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconReportDataAcknowledgeAsync(ReconReportDataAcknowledgeRequest reconDataRequest, final ApiCallback<ReconReportDataAcknowledgeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconReportDataAcknowledgeValidateBeforeCall(reconDataRequest, _callback);
        Type localVarReturnType = new TypeToken<ReconReportDataAcknowledgeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconReportDataRetrieval
     * @param reportIdentifier A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric (required)
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
    public okhttp3.Call reconReportDataRetrievalCall(String reportIdentifier, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v6/reconreport/data/retrieval/{reportIdentifier}"
            .replaceAll("\\{" + "reportIdentifier" + "\\}", localVarApiClient.escapeString(reportIdentifier.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call reconReportDataRetrievalValidateBeforeCall(String reportIdentifier, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportIdentifier' is set
        if (reportIdentifier == null) {
            throw new ApiException("Missing the required parameter 'reportIdentifier' when calling reconReportDataRetrieval(Async)");
        }
        

        okhttp3.Call localVarCall = reconReportDataRetrievalCall(reportIdentifier, _callback);
        return localVarCall;

    }

    /**
     * 
     * An issuer or acquirer uses this endpoint to retrieve a reconciliation report or enhanced reconciliation report.
     * @param reportIdentifier A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric (required)
     * @return ReconReportDataRetrivalResponse
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
    public ReconReportDataRetrivalResponse reconReportDataRetrieval(String reportIdentifier) throws ApiException {
        ApiResponse<ReconReportDataRetrivalResponse> localVarResp = reconReportDataRetrievalWithHttpInfo(reportIdentifier);
        return localVarResp.getData();
    }

    /**
     * 
     * An issuer or acquirer uses this endpoint to retrieve a reconciliation report or enhanced reconciliation report.
     * @param reportIdentifier A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric (required)
     * @return ApiResponse&lt;ReconReportDataRetrivalResponse&gt;
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
    public ApiResponse<ReconReportDataRetrivalResponse> reconReportDataRetrievalWithHttpInfo(String reportIdentifier) throws ApiException {
        okhttp3.Call localVarCall = reconReportDataRetrievalValidateBeforeCall(reportIdentifier, null);
        Type localVarReturnType = new TypeToken<ReconReportDataRetrivalResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * An issuer or acquirer uses this endpoint to retrieve a reconciliation report or enhanced reconciliation report.
     * @param reportIdentifier A reconciliation id that identifies the report to be retrieved.   Length: 36   Valid Values/Format: Alphanumeric (required)
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
    public okhttp3.Call reconReportDataRetrievalAsync(String reportIdentifier, final ApiCallback<ReconReportDataRetrivalResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconReportDataRetrievalValidateBeforeCall(reportIdentifier, _callback);
        Type localVarReturnType = new TypeToken<ReconReportDataRetrivalResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
