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
import com.bitget.openapi.model.ApiResponseResultOfMarginIsolatedInterestInfoResult;
import com.bitget.openapi.model.ApiResponseResultOfVoid;
import com.bitget.openapi.model.MarginIsolatedFinFlowInfo;
import com.bitget.openapi.model.MarginIsolatedInterestInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * API tests for MarginIsolatedInterestApi
 */
public class MarginIsolatedInterestApiTest {

    private final MarginIsolatedInterestApi api = new MarginIsolatedInterestApi(ApiConfig.getConfig());

    /**
     * list
     *
     * Get interest List
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void interestList1Test() throws ApiException {
        String symbol = "BTCUSDT";
        String startTime = "1677274167003";
        String coin = null;
        String pageSize = "10";
        String pageId = null;
        ApiResponseResultOfMarginIsolatedInterestInfoResult response = api.isolatedInterestList(symbol, startTime, coin, pageSize, pageId);
        assertThat(response).isNotNull();
        assertThat(response.getData()).isNotNull();
        if (response.getData().getResultList() != null && response.getData().getResultList().size() > 0) {
            for(MarginIsolatedInterestInfo item : response.getData().getResultList()) {
                assertThat(item.getType()).isNotBlank();
                assertThat(item.getAmount()).isNotBlank();
                assertThat(item.getInterestId()).isNotBlank();
                assertThat(item.getSymbol()).isNotBlank();
                assertThat(item.getInterestCoin()).isNotBlank();
                assertThat(item.getLoanCoin()).isNotBlank();
                assertThat(item.getSymbol()).isEqualTo(symbol);
            }
        }
    }

}
