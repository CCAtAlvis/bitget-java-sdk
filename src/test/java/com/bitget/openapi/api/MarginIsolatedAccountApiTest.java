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
 * API tests for MarginIsolatedAccountApi
 */
public class MarginIsolatedAccountApiTest {

    private final MarginIsolatedAccountApi api = new MarginIsolatedAccountApi(ApiConfig.getConfig());

    /**
     * assets
     *
     * Get Assets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountAssetsTest() throws ApiException {
        String symbol = "BTCUSDT";
        ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult response = api.marginIsolatedAccountAssets(symbol);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        for(MarginIsolatedAssetsPopulationResult item : response.getData()){
            assertThat(item).isNotNull();
            assertThat(item.getAvailable()).isNotNull();
            assertThat(item.getBorrow()).isNotNull();
            assertThat(item.getCoin()).isNotNull();
            assertThat(item.getCtime()).isNotNull();
            assertThat(item.getFrozen()).isNotNull();
            assertThat(item.getInterest()).isNotNull();
            assertThat(item.getNet()).isNotNull();
            assertThat(item.getTotalAmount()).isNotNull();
        }
    }

    /**
     * borrow
     *
     * borrow
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountBorrowTest() throws ApiException {
        MarginIsolatedLimitRequest marginIsolatedLimitRequest = new MarginIsolatedLimitRequest();
        marginIsolatedLimitRequest.setBorrowAmount("1");
        marginIsolatedLimitRequest.setSymbol("BTCUSDT");
        marginIsolatedLimitRequest.setCoin("USDT");
        ApiResponseResultOfMarginIsolatedBorrowLimitResult response = api.marginIsolatedAccountBorrow(marginIsolatedLimitRequest);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        assertThat(response.getData().getCoin()).isNotNull();
        assertThat(response.getData().getBorrowAmount()).isNotNull();
    }

    /**
     * maxBorrowableAmount
     *
     * Get MaxBorrowableAmount
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountMaxBorrowableAmountTest() throws ApiException {
        MarginIsolatedMaxBorrowRequest marginIsolatedMaxBorrowRequest = new MarginIsolatedMaxBorrowRequest();
        marginIsolatedMaxBorrowRequest.setSymbol("BTCUSDT");
        marginIsolatedMaxBorrowRequest.setCoin("USDT");
        ApiResponseResultOfMarginIsolatedMaxBorrowResult response = api.marginIsolatedAccountMaxBorrowableAmount(marginIsolatedMaxBorrowRequest);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData().getCoin()).isNotNull();
        assertThat(response.getData().getMaxBorrowableAmount()).isNotNull();
        assertThat(response.getData().getSymbol()).isNotNull();

    }

    /**
     * maxTransferOutAmount
     *
     * Get Max TransferOutAmount
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountMaxTransferOutAmountTest() throws ApiException {
        String coin = "USDT";
        String symbol = "BTCUSDT";
        ApiResponseResultOfMarginIsolatedAssetsResult response = api.marginIsolatedAccountMaxTransferOutAmount(coin, symbol);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        assertThat(response.getData().getCoin()).isNotNull();
        assertThat(response.getData().getMaxTransferOutAmount()).isNotNull();
        assertThat(response.getData().getSymbol()).isNotNull();

    }

    /**
     * repay
     *
     * repay
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountRepayTest() throws ApiException {
        MarginIsolatedRepayRequest marginIsolatedRepayRequest = new MarginIsolatedRepayRequest();
        marginIsolatedRepayRequest.setCoin("USDT");
        marginIsolatedRepayRequest.setRepayAmount("1");
        marginIsolatedRepayRequest.setSymbol("BTCUSDT");
        ApiResponseResultOfMarginIsolatedRepayResult response = api.marginIsolatedAccountRepay(marginIsolatedRepayRequest);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        assertThat(response.getData()).isNotNull();
        assertThat(response.getData().getCoin()).isNotNull();
        assertThat(response.getData().getRepayAmount()).isNotNull();
        assertThat(response.getData().getSymbol()).isNotNull();

    }

    /**
     * riskRate
     *
     * riskRate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void marginIsolatedAccountRiskRateTest() throws ApiException {
        MarginIsolatedAssetsRiskRequest marginIsolatedAssetsRiskRequest = new MarginIsolatedAssetsRiskRequest();
        marginIsolatedAssetsRiskRequest.setSymbol("BTCUSDT");
        marginIsolatedAssetsRiskRequest.setPageNum("1");
        marginIsolatedAssetsRiskRequest.setPageSize("100");
        ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult response = api.marginIsolatedAccountRiskRate(marginIsolatedAssetsRiskRequest);
        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo(("00000"));
        for(MarginIsolatedAssetsRiskResult item : response.getData()){
            assertThat(item).isNotNull();
            assertThat(item.getRiskRate()).isNotNull();
            assertThat(item.getSymbol()).isNotNull();
        }
    }

}