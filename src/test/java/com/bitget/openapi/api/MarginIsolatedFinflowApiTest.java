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

import com.bitget.openapi.ApiConfig;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.model.ApiResponseResultOfMarginIsolatedFinFlowResult;
import com.bitget.openapi.model.ApiResponseResultOfVoid;
import com.bitget.openapi.model.MarginCrossFinFlowInfo;
import com.bitget.openapi.model.MarginIsolatedFinFlowInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * API tests for MarginIsolatedFinflowApi
 */
public class MarginIsolatedFinflowApiTest {

    private final MarginIsolatedFinflowApi api = new MarginIsolatedFinflowApi(ApiConfig.getConfig());

    /**
     * list
     *
     * Get finance flow List
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void finList1Test() throws ApiException {
        String symbol = "BTCUSDT";
        String marginType = null;
        String startTime = "1677274167003";
        String coin = null;
        String endTime = "1680057356760";
        String pageSize = "10";
        String pageId = null;
        String loanId = null;
        ApiResponseResultOfMarginIsolatedFinFlowResult response = api.isolatedFinList(symbol, startTime, coin, marginType, endTime, loanId, pageSize, pageId);
        assertThat(response).isNotNull();
        assertThat(response.getData()).isNotNull();
        if (response.getData().getResultList() != null && response.getData().getResultList().size() > 0) {
            for(MarginIsolatedFinFlowInfo item : response.getData().getResultList()) {
                assertThat(item.getCoin()).isNotBlank();
                assertThat(item.getAmount()).isNotBlank();
                assertThat(item.getMarginId()).isNotBlank();
                assertThat(item.getMarginType()).isNotBlank();
                assertThat(item.getBalance()).isNotBlank();
                assertThat(item.getSymbol()).isNotBlank();
                assertThat(item.getSymbol()).isEqualTo(symbol);
            }
        }
    }

}
