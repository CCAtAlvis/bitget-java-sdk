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
import com.bitget.openapi.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * API tests for MarginIsolatedPublicApi
 */
public class MarginIsolatedPublicApiTest {

    private final MarginIsolatedPublicApi api = new MarginIsolatedPublicApi(ApiConfig.getConfig());

    /**
     * interestRateAndLimit
     *
     * Get InterestRateAndLimit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedPublicInterestRateAndLimitTest() throws ApiException {
        String symbol = "BTCUSDT";
        ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult response = api.marginIsolatedPublicInterestRateAndLimit(symbol);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        for (MarginIsolatedRateAndLimitResult item : response.getData()) {
            assertThat(item).isNotNull();
            assertThat(item.getBaseBorrowAble()).isNotNull();
            assertThat(item.getBaseDailyInterestRate()).isNotBlank();
            assertThat(item.getBaseCoin()).isNotBlank();
            assertThat(item.getLeverage()).isNotBlank();
            assertThat(item.getBaseYearlyInterestRate()).isNotBlank();
            assertThat(item.getBaseMaxBorrowableAmount()).isNotNull();
            assertThat(item.getBaseTransferInAble()).isNotNull();
            assertThat(item.getBaseVips()).isNotNull();
            for(MarginIsolatedVipResult marginCrossVipResult : item.getBaseVips()){
                assertThat(marginCrossVipResult).isNotNull();
                assertThat(marginCrossVipResult.getDailyInterestRate()).isNotNull();
                assertThat(marginCrossVipResult.getYearlyInterestRate()).isNotNull();
                assertThat(marginCrossVipResult.getDiscountRate()).isNotNull();
                assertThat(marginCrossVipResult.getLevel()).isNotNull();
            }
            assertThat(item.getQuoteBorrowAble()).isNotNull();
            assertThat(item.getQuoteCoin()).isNotNull();
            assertThat(item.getQuoteDailyInterestRate()).isNotNull();
            assertThat(item.getQuoteYearlyInterestRate()).isNotNull();
            assertThat(item.getQuoteMaxBorrowableAmount()).isNotNull();
            assertThat(item.getQuoteTransferInAble()).isNotNull();
            assertThat(item.getQuoteVips()).isNotNull();
            for(MarginIsolatedVipResult marginIsolatedVipResult : item.getQuoteVips()){
                assertThat(marginIsolatedVipResult).isNotNull();
                assertThat(marginIsolatedVipResult.getDailyInterestRate()).isNotNull();
                assertThat(marginIsolatedVipResult.getYearlyInterestRate()).isNotNull();
                assertThat(marginIsolatedVipResult.getDiscountRate()).isNotNull();
                assertThat(marginIsolatedVipResult.getLevel()).isNotNull();
            }
        }
    }

    /**
     * tierData
     *
     * Get TierData
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedPublicTierDataTest() throws ApiException {
        String symbol = "BTCUSDT";
        ApiResponseResultOfListOfMarginIsolatedLevelResult response = api.marginIsolatedPublicTierData(symbol);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        for(MarginIsolatedLevelResult item : response.getData()){
            assertThat(item).isNotNull();
            assertThat(item.getQuoteCoin()).isNotNull();
            assertThat(item.getSymbol()).isNotNull();
            assertThat(item.getBaseCoin()).isNotNull();
            assertThat(item.getQuoteMaxBorrowableAmount()).isNotNull();
            assertThat(item.getBaseMaxBorrowableAmount()).isNotNull();
            assertThat(item.getInitRate()).isNotNull();
            assertThat(item.getLeverage()).isNotNull();
            assertThat(item.getMaintainMarginRate()).isNotNull();
            assertThat(item.getTier()).isNotNull();
        }
    }

}
