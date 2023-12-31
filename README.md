# bitget-java-sdk-open-api

Bitget Open API
- API version: 2.0.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.upex.contract</groupId>
  <artifactId>bitget-java-sdk-open-api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'bitget-java-sdk-open-api' jar has been published to maven central.
    mavenLocal()       // Needed if the 'bitget-java-sdk-open-api' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.upex.contract:bitget-java-sdk-open-api:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/bitget-java-sdk-open-api-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.*;
import com.bitget.openapi.models.*;
import com.bitget.openapi.api.MarginCrossAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.bitget.com");
    
    // Configure API key authorization: ACCESS_KEY
    ApiKeyAuth ACCESS_KEY = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_KEY");
    ACCESS_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_KEY.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_PASSPHRASE
    ApiKeyAuth ACCESS_PASSPHRASE = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_PASSPHRASE");
    ACCESS_PASSPHRASE.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_PASSPHRASE.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_SIGN
    ApiKeyAuth ACCESS_SIGN = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_SIGN");
    ACCESS_SIGN.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_SIGN.setApiKeyPrefix("Token");

    // Configure API key authorization: ACCESS_TIMESTAMP
    ApiKeyAuth ACCESS_TIMESTAMP = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_TIMESTAMP");
    ACCESS_TIMESTAMP.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ACCESS_TIMESTAMP.setApiKeyPrefix("Token");

    // Configure API key authorization: SECRET_KEY
    ApiKeyAuth SECRET_KEY = (ApiKeyAuth) defaultClient.getAuthentication("SECRET_KEY");
    SECRET_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SECRET_KEY.setApiKeyPrefix("Token");

    MarginCrossAccountApi apiInstance = new MarginCrossAccountApi(defaultClient);
    try {
      ApiResponseResultOfVoid result = apiInstance.callVoid();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarginCrossAccountApi#callVoid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

```java
import com.bitget.openapi.ApiClient;
import com.bitget.openapi.ApiException;
import com.bitget.openapi.Configuration;
import com.bitget.openapi.auth.ApiKeyAuth;
import com.bitget.openapi.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class Example {
    public static void main(String[] args) {        
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.bitget.com");

        ApiKeyAuth SECRET_KEY = (ApiKeyAuth) defaultClient.getAuthentication("SECRET_KEY");
        SECRET_KEY.setApiKey("your value");

        ApiKeyAuth ACCESS_KEY = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_KEY");
        ACCESS_KEY.setApiKey("your value");

        ApiKeyAuth ACCESS_PASSPHRASE = (ApiKeyAuth) defaultClient.getAuthentication("ACCESS_PASSPHRASE");
        ACCESS_PASSPHRASE.setApiKey("your value");

        MixOrderApi apiInstance = new MixOrderApi(defaultClient);
        MixPlaceOrderRequest req = new MixPlaceOrderRequest();
        req.setSymbol("BTCUSDT_UMCBL");
        req.setMarginCoin("USDT");
        req.setSide("open_long");
        req.setSize(BigDecimal.valueOf(0.01));
        req.setOrderType("market");
        req.setTimeInForceValue("normal");
        try {
            ApiResponseResultOfMixPlaceOrderResult result = apiInstance.placeOrder(req);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MixOrderApi#placeOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

        try {
            ApiResponseResultOfMixDelegateOrderListResult result = apiInstance.historyProductType(
                    "umcbl",
                    "1671493129000",
                    "1673517445000",
                    "5", null, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MixOrderApi#historyProductType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.bitget.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MarginCrossAccountApi* | [**callVoid**](docs/MarginCrossAccountApi.md#callVoid) | **GET** /api/margin/v1/cross/account/void | void
*MarginCrossAccountApi* | [**marginCrossAccountAssets**](docs/MarginCrossAccountApi.md#marginCrossAccountAssets) | **GET** /api/margin/v1/cross/account/assets | assets
*MarginCrossAccountApi* | [**marginCrossAccountBorrow**](docs/MarginCrossAccountApi.md#marginCrossAccountBorrow) | **POST** /api/margin/v1/cross/account/borrow | borrow
*MarginCrossAccountApi* | [**marginCrossAccountMaxBorrowableAmount**](docs/MarginCrossAccountApi.md#marginCrossAccountMaxBorrowableAmount) | **POST** /api/margin/v1/cross/account/maxBorrowableAmount | maxBorrowableAmount
*MarginCrossAccountApi* | [**marginCrossAccountMaxTransferOutAmount**](docs/MarginCrossAccountApi.md#marginCrossAccountMaxTransferOutAmount) | **GET** /api/margin/v1/cross/account/maxTransferOutAmount | maxTransferOutAmount
*MarginCrossAccountApi* | [**marginCrossAccountRepay**](docs/MarginCrossAccountApi.md#marginCrossAccountRepay) | **POST** /api/margin/v1/cross/account/repay | repay
*MarginCrossAccountApi* | [**marginCrossAccountRiskRate**](docs/MarginCrossAccountApi.md#marginCrossAccountRiskRate) | **GET** /api/margin/v1/cross/account/riskRate | riskRate
*MarginCrossBorrowApi* | [**crossLoanList**](docs/MarginCrossBorrowApi.md#crossLoanList) | **GET** /api/margin/v1/cross/loan/list | list
*MarginCrossFinflowApi* | [**crossFinList**](docs/MarginCrossFinflowApi.md#crossFinList) | **GET** /api/margin/v1/cross/fin/list | list
*MarginCrossInterestApi* | [**crossInterestList**](docs/MarginCrossInterestApi.md#crossInterestList) | **GET** /api/margin/v1/cross/interest/list | list
*MarginCrossLiquidationApi* | [**crossLiquidationList**](docs/MarginCrossLiquidationApi.md#crossLiquidationList) | **GET** /api/margin/v1/cross/liquidation/list | list
*MarginCrossOrderApi* | [**marginCrossBatchCancelOrder**](docs/MarginCrossOrderApi.md#marginCrossBatchCancelOrder) | **POST** /api/margin/v1/cross/order/batchCancelOrder | batchCancelOrder
*MarginCrossOrderApi* | [**marginCrossBatchPlaceOrder**](docs/MarginCrossOrderApi.md#marginCrossBatchPlaceOrder) | **POST** /api/margin/v1/cross/order/batchPlaceOrder | batchPlaceOrder
*MarginCrossOrderApi* | [**marginCrossCancelOrder**](docs/MarginCrossOrderApi.md#marginCrossCancelOrder) | **POST** /api/margin/v1/cross/order/cancelOrder | cancelOrder
*MarginCrossOrderApi* | [**marginCrossFills**](docs/MarginCrossOrderApi.md#marginCrossFills) | **GET** /api/margin/v1/cross/order/fills | fills
*MarginCrossOrderApi* | [**marginCrossHistoryOrders**](docs/MarginCrossOrderApi.md#marginCrossHistoryOrders) | **GET** /api/margin/v1/cross/order/history | history
*MarginCrossOrderApi* | [**marginCrossOpenOrders**](docs/MarginCrossOrderApi.md#marginCrossOpenOrders) | **GET** /api/margin/v1/cross/order/openOrders | openOrders
*MarginCrossOrderApi* | [**marginCrossPlaceOrder**](docs/MarginCrossOrderApi.md#marginCrossPlaceOrder) | **POST** /api/margin/v1/cross/order/placeOrder | placeOrder
*MarginCrossPublicApi* | [**marginCrossPublicInterestRateAndLimit**](docs/MarginCrossPublicApi.md#marginCrossPublicInterestRateAndLimit) | **GET** /api/margin/v1/cross/public/interestRateAndLimit | interestRateAndLimit
*MarginCrossPublicApi* | [**marginCrossPublicTierData**](docs/MarginCrossPublicApi.md#marginCrossPublicTierData) | **GET** /api/margin/v1/cross/public/tierData | tierData
*MarginCrossRepayApi* | [**crossRepayList**](docs/MarginCrossRepayApi.md#crossRepayList) | **GET** /api/margin/v1/cross/repay/list | list
*MarginIsolatedAccountApi* | [**marginIsolatedAccountAssets**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountAssets) | **GET** /api/margin/v1/isolated/account/assets | assets
*MarginIsolatedAccountApi* | [**marginIsolatedAccountBorrow**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountBorrow) | **POST** /api/margin/v1/isolated/account/borrow | borrow
*MarginIsolatedAccountApi* | [**marginIsolatedAccountMaxBorrowableAmount**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountMaxBorrowableAmount) | **POST** /api/margin/v1/isolated/account/maxBorrowableAmount | maxBorrowableAmount
*MarginIsolatedAccountApi* | [**marginIsolatedAccountMaxTransferOutAmount**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountMaxTransferOutAmount) | **GET** /api/margin/v1/isolated/account/maxTransferOutAmount | maxTransferOutAmount
*MarginIsolatedAccountApi* | [**marginIsolatedAccountRepay**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountRepay) | **POST** /api/margin/v1/isolated/account/repay | repay
*MarginIsolatedAccountApi* | [**marginIsolatedAccountRiskRate**](docs/MarginIsolatedAccountApi.md#marginIsolatedAccountRiskRate) | **POST** /api/margin/v1/isolated/account/riskRate | riskRate
*MarginIsolatedBorrowApi* | [**isolatedLoanList**](docs/MarginIsolatedBorrowApi.md#isolatedLoanList) | **GET** /api/margin/v1/isolated/loan/list | list
*MarginIsolatedFinflowApi* | [**isolatedFinList**](docs/MarginIsolatedFinflowApi.md#isolatedFinList) | **GET** /api/margin/v1/isolated/fin/list | list
*MarginIsolatedInterestApi* | [**isolatedInterestList**](docs/MarginIsolatedInterestApi.md#isolatedInterestList) | **GET** /api/margin/v1/isolated/interest/list | list
*MarginIsolatedLiquidationApi* | [**isolatedLiquidationList**](docs/MarginIsolatedLiquidationApi.md#isolatedLiquidationList) | **GET** /api/margin/v1/isolated/liquidation/list | list
*MarginIsolatedOrderApi* | [**marginIsolatedBatchCancelOrder**](docs/MarginIsolatedOrderApi.md#marginIsolatedBatchCancelOrder) | **POST** /api/margin/v1/isolated/order/batchCancelOrder | batchCancelOrder
*MarginIsolatedOrderApi* | [**marginIsolatedBatchPlaceOrder**](docs/MarginIsolatedOrderApi.md#marginIsolatedBatchPlaceOrder) | **POST** /api/margin/v1/isolated/order/batchPlaceOrder | batchPlaceOrder
*MarginIsolatedOrderApi* | [**marginIsolatedCancelOrder**](docs/MarginIsolatedOrderApi.md#marginIsolatedCancelOrder) | **POST** /api/margin/v1/isolated/order/cancelOrder | cancelOrder
*MarginIsolatedOrderApi* | [**marginIsolatedFills**](docs/MarginIsolatedOrderApi.md#marginIsolatedFills) | **GET** /api/margin/v1/isolated/order/fills | fills
*MarginIsolatedOrderApi* | [**marginIsolatedHistoryOrders**](docs/MarginIsolatedOrderApi.md#marginIsolatedHistoryOrders) | **GET** /api/margin/v1/isolated/order/history | history
*MarginIsolatedOrderApi* | [**marginIsolatedOpenOrders**](docs/MarginIsolatedOrderApi.md#marginIsolatedOpenOrders) | **GET** /api/margin/v1/isolated/order/openOrders | openOrders
*MarginIsolatedOrderApi* | [**marginIsolatedPlaceOrder**](docs/MarginIsolatedOrderApi.md#marginIsolatedPlaceOrder) | **POST** /api/margin/v1/isolated/order/placeOrder | placeOrder
*MarginIsolatedPublicApi* | [**marginIsolatedPublicInterestRateAndLimit**](docs/MarginIsolatedPublicApi.md#marginIsolatedPublicInterestRateAndLimit) | **GET** /api/margin/v1/isolated/public/interestRateAndLimit | interestRateAndLimit
*MarginIsolatedPublicApi* | [**marginIsolatedPublicTierData**](docs/MarginIsolatedPublicApi.md#marginIsolatedPublicTierData) | **GET** /api/margin/v1/isolated/public/tierData | tierData
*MarginIsolatedRepayApi* | [**isolateRepayList**](docs/MarginIsolatedRepayApi.md#isolateRepayList) | **GET** /api/margin/v1/isolated/repay/list | list
*MarginPublicApi* | [**marginPublicCurrencies**](docs/MarginPublicApi.md#marginPublicCurrencies) | **GET** /api/margin/v1/public/currencies | currencies
*P2pMerchantApi* | [**merchantAdvList**](docs/P2pMerchantApi.md#merchantAdvList) | **GET** /api/p2p/v1/merchant/advList | advList
*P2pMerchantApi* | [**merchantInfo**](docs/P2pMerchantApi.md#merchantInfo) | **GET** /api/p2p/v1/merchant/merchantInfo | merchantInfo
*P2pMerchantApi* | [**merchantList**](docs/P2pMerchantApi.md#merchantList) | **GET** /api/p2p/v1/merchant/merchantList | merchantList
*P2pMerchantApi* | [**merchantOrderList**](docs/P2pMerchantApi.md#merchantOrderList) | **GET** /api/p2p/v1/merchant/orderList | orderList


## Documentation for Models

 - [ApiResponseResultOfListOfMarginCrossAssetsPopulationResult](docs/ApiResponseResultOfListOfMarginCrossAssetsPopulationResult.md)
 - [ApiResponseResultOfListOfMarginCrossLevelResult](docs/ApiResponseResultOfListOfMarginCrossLevelResult.md)
 - [ApiResponseResultOfListOfMarginCrossRateAndLimitResult](docs/ApiResponseResultOfListOfMarginCrossRateAndLimitResult.md)
 - [ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult](docs/ApiResponseResultOfListOfMarginIsolatedAssetsPopulationResult.md)
 - [ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult](docs/ApiResponseResultOfListOfMarginIsolatedAssetsRiskResult.md)
 - [ApiResponseResultOfListOfMarginIsolatedLevelResult](docs/ApiResponseResultOfListOfMarginIsolatedLevelResult.md)
 - [ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult](docs/ApiResponseResultOfListOfMarginIsolatedRateAndLimitResult.md)
 - [ApiResponseResultOfListOfMarginSystemResult](docs/ApiResponseResultOfListOfMarginSystemResult.md)
 - [ApiResponseResultOfMarginBatchCancelOrderResult](docs/ApiResponseResultOfMarginBatchCancelOrderResult.md)
 - [ApiResponseResultOfMarginBatchPlaceOrderResult](docs/ApiResponseResultOfMarginBatchPlaceOrderResult.md)
 - [ApiResponseResultOfMarginCrossAssetsResult](docs/ApiResponseResultOfMarginCrossAssetsResult.md)
 - [ApiResponseResultOfMarginCrossAssetsRiskResult](docs/ApiResponseResultOfMarginCrossAssetsRiskResult.md)
 - [ApiResponseResultOfMarginCrossBorrowLimitResult](docs/ApiResponseResultOfMarginCrossBorrowLimitResult.md)
 - [ApiResponseResultOfMarginCrossFinFlowResult](docs/ApiResponseResultOfMarginCrossFinFlowResult.md)
 - [ApiResponseResultOfMarginCrossMaxBorrowResult](docs/ApiResponseResultOfMarginCrossMaxBorrowResult.md)
 - [ApiResponseResultOfMarginCrossRepayResult](docs/ApiResponseResultOfMarginCrossRepayResult.md)
 - [ApiResponseResultOfMarginInterestInfoResult](docs/ApiResponseResultOfMarginInterestInfoResult.md)
 - [ApiResponseResultOfMarginIsolatedAssetsResult](docs/ApiResponseResultOfMarginIsolatedAssetsResult.md)
 - [ApiResponseResultOfMarginIsolatedBorrowLimitResult](docs/ApiResponseResultOfMarginIsolatedBorrowLimitResult.md)
 - [ApiResponseResultOfMarginIsolatedFinFlowResult](docs/ApiResponseResultOfMarginIsolatedFinFlowResult.md)
 - [ApiResponseResultOfMarginIsolatedInterestInfoResult](docs/ApiResponseResultOfMarginIsolatedInterestInfoResult.md)
 - [ApiResponseResultOfMarginIsolatedLiquidationInfoResult](docs/ApiResponseResultOfMarginIsolatedLiquidationInfoResult.md)
 - [ApiResponseResultOfMarginIsolatedLoanInfoResult](docs/ApiResponseResultOfMarginIsolatedLoanInfoResult.md)
 - [ApiResponseResultOfMarginIsolatedMaxBorrowResult](docs/ApiResponseResultOfMarginIsolatedMaxBorrowResult.md)
 - [ApiResponseResultOfMarginIsolatedRepayInfoResult](docs/ApiResponseResultOfMarginIsolatedRepayInfoResult.md)
 - [ApiResponseResultOfMarginIsolatedRepayResult](docs/ApiResponseResultOfMarginIsolatedRepayResult.md)
 - [ApiResponseResultOfMarginLiquidationInfoResult](docs/ApiResponseResultOfMarginLiquidationInfoResult.md)
 - [ApiResponseResultOfMarginLoanInfoResult](docs/ApiResponseResultOfMarginLoanInfoResult.md)
 - [ApiResponseResultOfMarginOpenOrderInfoResult](docs/ApiResponseResultOfMarginOpenOrderInfoResult.md)
 - [ApiResponseResultOfMarginPlaceOrderResult](docs/ApiResponseResultOfMarginPlaceOrderResult.md)
 - [ApiResponseResultOfMarginRepayInfoResult](docs/ApiResponseResultOfMarginRepayInfoResult.md)
 - [ApiResponseResultOfMarginTradeDetailInfoResult](docs/ApiResponseResultOfMarginTradeDetailInfoResult.md)
 - [ApiResponseResultOfMerchantAdvResult](docs/ApiResponseResultOfMerchantAdvResult.md)
 - [ApiResponseResultOfMerchantInfoResult](docs/ApiResponseResultOfMerchantInfoResult.md)
 - [ApiResponseResultOfMerchantOrderResult](docs/ApiResponseResultOfMerchantOrderResult.md)
 - [ApiResponseResultOfMerchantPersonInfo](docs/ApiResponseResultOfMerchantPersonInfo.md)
 - [ApiResponseResultOfVoid](docs/ApiResponseResultOfVoid.md)
 - [FiatPaymentDetailInfo](docs/FiatPaymentDetailInfo.md)
 - [FiatPaymentInfo](docs/FiatPaymentInfo.md)
 - [MarginBatchCancelOrderRequest](docs/MarginBatchCancelOrderRequest.md)
 - [MarginBatchCancelOrderResult](docs/MarginBatchCancelOrderResult.md)
 - [MarginBatchOrdersRequest](docs/MarginBatchOrdersRequest.md)
 - [MarginBatchPlaceOrderFailureResult](docs/MarginBatchPlaceOrderFailureResult.md)
 - [MarginBatchPlaceOrderResult](docs/MarginBatchPlaceOrderResult.md)
 - [MarginCancelOrderFailureResult](docs/MarginCancelOrderFailureResult.md)
 - [MarginCancelOrderRequest](docs/MarginCancelOrderRequest.md)
 - [MarginCancelOrderResult](docs/MarginCancelOrderResult.md)
 - [MarginCrossAssetsPopulationResult](docs/MarginCrossAssetsPopulationResult.md)
 - [MarginCrossAssetsResult](docs/MarginCrossAssetsResult.md)
 - [MarginCrossAssetsRiskResult](docs/MarginCrossAssetsRiskResult.md)
 - [MarginCrossBorrowLimitResult](docs/MarginCrossBorrowLimitResult.md)
 - [MarginCrossFinFlowInfo](docs/MarginCrossFinFlowInfo.md)
 - [MarginCrossFinFlowResult](docs/MarginCrossFinFlowResult.md)
 - [MarginCrossLevelResult](docs/MarginCrossLevelResult.md)
 - [MarginCrossLimitRequest](docs/MarginCrossLimitRequest.md)
 - [MarginCrossMaxBorrowRequest](docs/MarginCrossMaxBorrowRequest.md)
 - [MarginCrossMaxBorrowResult](docs/MarginCrossMaxBorrowResult.md)
 - [MarginCrossRateAndLimitResult](docs/MarginCrossRateAndLimitResult.md)
 - [MarginCrossRepayRequest](docs/MarginCrossRepayRequest.md)
 - [MarginCrossRepayResult](docs/MarginCrossRepayResult.md)
 - [MarginCrossVipResult](docs/MarginCrossVipResult.md)
 - [MarginInterestInfo](docs/MarginInterestInfo.md)
 - [MarginInterestInfoResult](docs/MarginInterestInfoResult.md)
 - [MarginIsolatedAssetsPopulationResult](docs/MarginIsolatedAssetsPopulationResult.md)
 - [MarginIsolatedAssetsResult](docs/MarginIsolatedAssetsResult.md)
 - [MarginIsolatedAssetsRiskRequest](docs/MarginIsolatedAssetsRiskRequest.md)
 - [MarginIsolatedAssetsRiskResult](docs/MarginIsolatedAssetsRiskResult.md)
 - [MarginIsolatedBorrowLimitResult](docs/MarginIsolatedBorrowLimitResult.md)
 - [MarginIsolatedFinFlowInfo](docs/MarginIsolatedFinFlowInfo.md)
 - [MarginIsolatedFinFlowResult](docs/MarginIsolatedFinFlowResult.md)
 - [MarginIsolatedInterestInfo](docs/MarginIsolatedInterestInfo.md)
 - [MarginIsolatedInterestInfoResult](docs/MarginIsolatedInterestInfoResult.md)
 - [MarginIsolatedLevelResult](docs/MarginIsolatedLevelResult.md)
 - [MarginIsolatedLimitRequest](docs/MarginIsolatedLimitRequest.md)
 - [MarginIsolatedLiquidationInfo](docs/MarginIsolatedLiquidationInfo.md)
 - [MarginIsolatedLiquidationInfoResult](docs/MarginIsolatedLiquidationInfoResult.md)
 - [MarginIsolatedLoanInfo](docs/MarginIsolatedLoanInfo.md)
 - [MarginIsolatedLoanInfoResult](docs/MarginIsolatedLoanInfoResult.md)
 - [MarginIsolatedMaxBorrowRequest](docs/MarginIsolatedMaxBorrowRequest.md)
 - [MarginIsolatedMaxBorrowResult](docs/MarginIsolatedMaxBorrowResult.md)
 - [MarginIsolatedRateAndLimitResult](docs/MarginIsolatedRateAndLimitResult.md)
 - [MarginIsolatedRepayInfo](docs/MarginIsolatedRepayInfo.md)
 - [MarginIsolatedRepayInfoResult](docs/MarginIsolatedRepayInfoResult.md)
 - [MarginIsolatedRepayRequest](docs/MarginIsolatedRepayRequest.md)
 - [MarginIsolatedRepayResult](docs/MarginIsolatedRepayResult.md)
 - [MarginIsolatedVipResult](docs/MarginIsolatedVipResult.md)
 - [MarginLiquidationInfo](docs/MarginLiquidationInfo.md)
 - [MarginLiquidationInfoResult](docs/MarginLiquidationInfoResult.md)
 - [MarginLoanInfo](docs/MarginLoanInfo.md)
 - [MarginLoanInfoResult](docs/MarginLoanInfoResult.md)
 - [MarginOpenOrderInfoResult](docs/MarginOpenOrderInfoResult.md)
 - [MarginOrderInfo](docs/MarginOrderInfo.md)
 - [MarginOrderRequest](docs/MarginOrderRequest.md)
 - [MarginPlaceOrderResult](docs/MarginPlaceOrderResult.md)
 - [MarginRepayInfo](docs/MarginRepayInfo.md)
 - [MarginRepayInfoResult](docs/MarginRepayInfoResult.md)
 - [MarginSystemResult](docs/MarginSystemResult.md)
 - [MarginTradeDetailInfo](docs/MarginTradeDetailInfo.md)
 - [MarginTradeDetailInfoResult](docs/MarginTradeDetailInfoResult.md)
 - [MerchantAdvInfo](docs/MerchantAdvInfo.md)
 - [MerchantAdvResult](docs/MerchantAdvResult.md)
 - [MerchantAdvUserLimitInfo](docs/MerchantAdvUserLimitInfo.md)
 - [MerchantInfo](docs/MerchantInfo.md)
 - [MerchantInfoResult](docs/MerchantInfoResult.md)
 - [MerchantOrderInfo](docs/MerchantOrderInfo.md)
 - [MerchantOrderPaymentInfo](docs/MerchantOrderPaymentInfo.md)
 - [MerchantOrderResult](docs/MerchantOrderResult.md)
 - [MerchantPersonInfo](docs/MerchantPersonInfo.md)
 - [OrderPaymentDetailInfo](docs/OrderPaymentDetailInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ACCESS_KEY

- **Type**: API key
- **API key parameter name**: ACCESS-KEY
- **Location**: HTTP header

### ACCESS_PASSPHRASE

- **Type**: API key
- **API key parameter name**: ACCESS-PASSPHRASE
- **Location**: HTTP header

### ACCESS_SIGN

- **Type**: API key
- **API key parameter name**: ACCESS-SIGN
- **Location**: HTTP header

### ACCESS_TIMESTAMP

- **Type**: API key
- **API key parameter name**: ACCESS-TIMESTAMP
- **Location**: HTTP header

### SECRET_KEY

- **Type**: API key
- **API key parameter name**: SECRET-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



