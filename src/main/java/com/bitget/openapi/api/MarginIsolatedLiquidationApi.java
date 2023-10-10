/*
 * Bitget Open API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bitget.openapi.api;

import com.bitget.openapi.ApiCallback;
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.ApiResponse;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.Pair;
import com.bitget.openapi.ProgressRequestBody;
import com.bitget.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.bitget.openapi.model.ApiResponseResultOfMarginIsolatedLiquidationInfoResult;
import com.bitget.openapi.model.ApiResponseResultOfVoid;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MarginIsolatedLiquidationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MarginIsolatedLiquidationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarginIsolatedLiquidationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for isolatedLiquidationList
     * @param symbol symbol (required)
     * @param startTime startTime (required)
     * @param endTime endTime (optional)
     * @param pageSize pageSize (optional)
     * @param pageId pageId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Gateway Frequency Limit </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isolatedLiquidationListCall(String symbol, String startTime, String endTime, String pageSize, String pageId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/margin/v1/isolated/liquidation/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (symbol != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("symbol", symbol));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startTime", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endTime", endTime));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (pageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageId", pageId));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ACCESS_KEY", "ACCESS_PASSPHRASE", "ACCESS_SIGN", "ACCESS_TIMESTAMP", "SECRET_KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call isolatedLiquidationListValidateBeforeCall(String symbol, String startTime, String endTime, String pageSize, String pageId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling isolatedLiquidationList(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling isolatedLiquidationList(Async)");
        }

        return isolatedLiquidationListCall(symbol, startTime, endTime, pageSize, pageId, _callback);

    }

    /**
     * list
     * Get liquidation List
     * @param symbol symbol (required)
     * @param startTime startTime (required)
     * @param endTime endTime (optional)
     * @param pageSize pageSize (optional)
     * @param pageId pageId (optional)
     * @return ApiResponseResultOfMarginIsolatedLiquidationInfoResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Gateway Frequency Limit </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseResultOfMarginIsolatedLiquidationInfoResult isolatedLiquidationList(String symbol, String startTime, String endTime, String pageSize, String pageId) throws ApiException {
        ApiResponse<ApiResponseResultOfMarginIsolatedLiquidationInfoResult> localVarResp = isolatedLiquidationListWithHttpInfo(symbol, startTime, endTime, pageSize, pageId);
        return localVarResp.getData();
    }

    /**
     * list
     * Get liquidation List
     * @param symbol symbol (required)
     * @param startTime startTime (required)
     * @param endTime endTime (optional)
     * @param pageSize pageSize (optional)
     * @param pageId pageId (optional)
     * @return ApiResponse&lt;ApiResponseResultOfMarginIsolatedLiquidationInfoResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Gateway Frequency Limit </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseResultOfMarginIsolatedLiquidationInfoResult> isolatedLiquidationListWithHttpInfo(String symbol, String startTime, String endTime, String pageSize, String pageId) throws ApiException {
        okhttp3.Call localVarCall = isolatedLiquidationListValidateBeforeCall(symbol, startTime, endTime, pageSize, pageId, null);
        Type localVarReturnType = new TypeToken<ApiResponseResultOfMarginIsolatedLiquidationInfoResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * Get liquidation List
     * @param symbol symbol (required)
     * @param startTime startTime (required)
     * @param endTime endTime (optional)
     * @param pageSize pageSize (optional)
     * @param pageId pageId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Gateway Frequency Limit </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call isolatedLiquidationListAsync(String symbol, String startTime, String endTime, String pageSize, String pageId, final ApiCallback<ApiResponseResultOfMarginIsolatedLiquidationInfoResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = isolatedLiquidationListValidateBeforeCall(symbol, startTime, endTime, pageSize, pageId, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseResultOfMarginIsolatedLiquidationInfoResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
