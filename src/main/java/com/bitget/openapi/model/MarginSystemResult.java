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


package com.bitget.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bitget.openapi.JSON;

/**
 * MarginSystemResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginSystemResult {
  public static final String SERIALIZED_NAME_BASE_COIN = "baseCoin";
  @SerializedName(SERIALIZED_NAME_BASE_COIN)
  private String baseCoin;

  public static final String SERIALIZED_NAME_IS_BORROWABLE = "isBorrowable";
  @SerializedName(SERIALIZED_NAME_IS_BORROWABLE)
  private Boolean isBorrowable;

  public static final String SERIALIZED_NAME_LIQUIDATION_RISK_RATIO = "liquidationRiskRatio";
  @SerializedName(SERIALIZED_NAME_LIQUIDATION_RISK_RATIO)
  private String liquidationRiskRatio;

  public static final String SERIALIZED_NAME_MAKER_FEE_RATE = "makerFeeRate";
  @SerializedName(SERIALIZED_NAME_MAKER_FEE_RATE)
  private String makerFeeRate;

  public static final String SERIALIZED_NAME_MAX_CROSS_LEVERAGE = "maxCrossLeverage";
  @SerializedName(SERIALIZED_NAME_MAX_CROSS_LEVERAGE)
  private String maxCrossLeverage;

  public static final String SERIALIZED_NAME_MAX_ISOLATED_LEVERAGE = "maxIsolatedLeverage";
  @SerializedName(SERIALIZED_NAME_MAX_ISOLATED_LEVERAGE)
  private String maxIsolatedLeverage;

  public static final String SERIALIZED_NAME_MAX_TRADE_AMOUNT = "maxTradeAmount";
  @SerializedName(SERIALIZED_NAME_MAX_TRADE_AMOUNT)
  private String maxTradeAmount;

  public static final String SERIALIZED_NAME_MIN_TRADE_AMOUNT = "minTradeAmount";
  @SerializedName(SERIALIZED_NAME_MIN_TRADE_AMOUNT)
  private String minTradeAmount;

  public static final String SERIALIZED_NAME_MIN_TRADE_U_S_D_T = "minTradeUSDT";
  @SerializedName(SERIALIZED_NAME_MIN_TRADE_U_S_D_T)
  private String minTradeUSDT;

  public static final String SERIALIZED_NAME_PRICE_SCALE = "priceScale";
  @SerializedName(SERIALIZED_NAME_PRICE_SCALE)
  private String priceScale;

  public static final String SERIALIZED_NAME_QUANTITY_SCALE = "quantityScale";
  @SerializedName(SERIALIZED_NAME_QUANTITY_SCALE)
  private String quantityScale;

  public static final String SERIALIZED_NAME_QUOTE_COIN = "quoteCoin";
  @SerializedName(SERIALIZED_NAME_QUOTE_COIN)
  private String quoteCoin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TAKER_FEE_RATE = "takerFeeRate";
  @SerializedName(SERIALIZED_NAME_TAKER_FEE_RATE)
  private String takerFeeRate;

  public static final String SERIALIZED_NAME_USER_MIN_BORROW = "userMinBorrow";
  @SerializedName(SERIALIZED_NAME_USER_MIN_BORROW)
  private String userMinBorrow;

  public static final String SERIALIZED_NAME_WARNING_RISK_RATIO = "warningRiskRatio";
  @SerializedName(SERIALIZED_NAME_WARNING_RISK_RATIO)
  private String warningRiskRatio;

  public MarginSystemResult() {
  }

  public MarginSystemResult baseCoin(String baseCoin) {
    
    this.baseCoin = baseCoin;
    return this;
  }

   /**
   * Get baseCoin
   * @return baseCoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseCoin() {
    return baseCoin;
  }


  public void setBaseCoin(String baseCoin) {
    this.baseCoin = baseCoin;
  }


  public MarginSystemResult isBorrowable(Boolean isBorrowable) {
    
    this.isBorrowable = isBorrowable;
    return this;
  }

   /**
   * Get isBorrowable
   * @return isBorrowable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBorrowable() {
    return isBorrowable;
  }


  public void setIsBorrowable(Boolean isBorrowable) {
    this.isBorrowable = isBorrowable;
  }


  public MarginSystemResult liquidationRiskRatio(String liquidationRiskRatio) {
    
    this.liquidationRiskRatio = liquidationRiskRatio;
    return this;
  }

   /**
   * Get liquidationRiskRatio
   * @return liquidationRiskRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLiquidationRiskRatio() {
    return liquidationRiskRatio;
  }


  public void setLiquidationRiskRatio(String liquidationRiskRatio) {
    this.liquidationRiskRatio = liquidationRiskRatio;
  }


  public MarginSystemResult makerFeeRate(String makerFeeRate) {
    
    this.makerFeeRate = makerFeeRate;
    return this;
  }

   /**
   * Get makerFeeRate
   * @return makerFeeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMakerFeeRate() {
    return makerFeeRate;
  }


  public void setMakerFeeRate(String makerFeeRate) {
    this.makerFeeRate = makerFeeRate;
  }


  public MarginSystemResult maxCrossLeverage(String maxCrossLeverage) {
    
    this.maxCrossLeverage = maxCrossLeverage;
    return this;
  }

   /**
   * Get maxCrossLeverage
   * @return maxCrossLeverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxCrossLeverage() {
    return maxCrossLeverage;
  }


  public void setMaxCrossLeverage(String maxCrossLeverage) {
    this.maxCrossLeverage = maxCrossLeverage;
  }


  public MarginSystemResult maxIsolatedLeverage(String maxIsolatedLeverage) {
    
    this.maxIsolatedLeverage = maxIsolatedLeverage;
    return this;
  }

   /**
   * Get maxIsolatedLeverage
   * @return maxIsolatedLeverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxIsolatedLeverage() {
    return maxIsolatedLeverage;
  }


  public void setMaxIsolatedLeverage(String maxIsolatedLeverage) {
    this.maxIsolatedLeverage = maxIsolatedLeverage;
  }


  public MarginSystemResult maxTradeAmount(String maxTradeAmount) {
    
    this.maxTradeAmount = maxTradeAmount;
    return this;
  }

   /**
   * Get maxTradeAmount
   * @return maxTradeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxTradeAmount() {
    return maxTradeAmount;
  }


  public void setMaxTradeAmount(String maxTradeAmount) {
    this.maxTradeAmount = maxTradeAmount;
  }


  public MarginSystemResult minTradeAmount(String minTradeAmount) {
    
    this.minTradeAmount = minTradeAmount;
    return this;
  }

   /**
   * Get minTradeAmount
   * @return minTradeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMinTradeAmount() {
    return minTradeAmount;
  }


  public void setMinTradeAmount(String minTradeAmount) {
    this.minTradeAmount = minTradeAmount;
  }


  public MarginSystemResult minTradeUSDT(String minTradeUSDT) {
    
    this.minTradeUSDT = minTradeUSDT;
    return this;
  }

   /**
   * Get minTradeUSDT
   * @return minTradeUSDT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMinTradeUSDT() {
    return minTradeUSDT;
  }


  public void setMinTradeUSDT(String minTradeUSDT) {
    this.minTradeUSDT = minTradeUSDT;
  }


  public MarginSystemResult priceScale(String priceScale) {
    
    this.priceScale = priceScale;
    return this;
  }

   /**
   * Get priceScale
   * @return priceScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPriceScale() {
    return priceScale;
  }


  public void setPriceScale(String priceScale) {
    this.priceScale = priceScale;
  }


  public MarginSystemResult quantityScale(String quantityScale) {
    
    this.quantityScale = quantityScale;
    return this;
  }

   /**
   * Get quantityScale
   * @return quantityScale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuantityScale() {
    return quantityScale;
  }


  public void setQuantityScale(String quantityScale) {
    this.quantityScale = quantityScale;
  }


  public MarginSystemResult quoteCoin(String quoteCoin) {
    
    this.quoteCoin = quoteCoin;
    return this;
  }

   /**
   * Get quoteCoin
   * @return quoteCoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuoteCoin() {
    return quoteCoin;
  }


  public void setQuoteCoin(String quoteCoin) {
    this.quoteCoin = quoteCoin;
  }


  public MarginSystemResult status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public MarginSystemResult symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public MarginSystemResult takerFeeRate(String takerFeeRate) {
    
    this.takerFeeRate = takerFeeRate;
    return this;
  }

   /**
   * Get takerFeeRate
   * @return takerFeeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTakerFeeRate() {
    return takerFeeRate;
  }


  public void setTakerFeeRate(String takerFeeRate) {
    this.takerFeeRate = takerFeeRate;
  }


  public MarginSystemResult userMinBorrow(String userMinBorrow) {
    
    this.userMinBorrow = userMinBorrow;
    return this;
  }

   /**
   * Get userMinBorrow
   * @return userMinBorrow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserMinBorrow() {
    return userMinBorrow;
  }


  public void setUserMinBorrow(String userMinBorrow) {
    this.userMinBorrow = userMinBorrow;
  }


  public MarginSystemResult warningRiskRatio(String warningRiskRatio) {
    
    this.warningRiskRatio = warningRiskRatio;
    return this;
  }

   /**
   * Get warningRiskRatio
   * @return warningRiskRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWarningRiskRatio() {
    return warningRiskRatio;
  }


  public void setWarningRiskRatio(String warningRiskRatio) {
    this.warningRiskRatio = warningRiskRatio;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MarginSystemResult instance itself
   */
  public MarginSystemResult putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginSystemResult marginSystemResult = (MarginSystemResult) o;
    return Objects.equals(this.baseCoin, marginSystemResult.baseCoin) &&
        Objects.equals(this.isBorrowable, marginSystemResult.isBorrowable) &&
        Objects.equals(this.liquidationRiskRatio, marginSystemResult.liquidationRiskRatio) &&
        Objects.equals(this.makerFeeRate, marginSystemResult.makerFeeRate) &&
        Objects.equals(this.maxCrossLeverage, marginSystemResult.maxCrossLeverage) &&
        Objects.equals(this.maxIsolatedLeverage, marginSystemResult.maxIsolatedLeverage) &&
        Objects.equals(this.maxTradeAmount, marginSystemResult.maxTradeAmount) &&
        Objects.equals(this.minTradeAmount, marginSystemResult.minTradeAmount) &&
        Objects.equals(this.minTradeUSDT, marginSystemResult.minTradeUSDT) &&
        Objects.equals(this.priceScale, marginSystemResult.priceScale) &&
        Objects.equals(this.quantityScale, marginSystemResult.quantityScale) &&
        Objects.equals(this.quoteCoin, marginSystemResult.quoteCoin) &&
        Objects.equals(this.status, marginSystemResult.status) &&
        Objects.equals(this.symbol, marginSystemResult.symbol) &&
        Objects.equals(this.takerFeeRate, marginSystemResult.takerFeeRate) &&
        Objects.equals(this.userMinBorrow, marginSystemResult.userMinBorrow) &&
        Objects.equals(this.warningRiskRatio, marginSystemResult.warningRiskRatio)&&
        Objects.equals(this.additionalProperties, marginSystemResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCoin, isBorrowable, liquidationRiskRatio, makerFeeRate, maxCrossLeverage, maxIsolatedLeverage, maxTradeAmount, minTradeAmount, minTradeUSDT, priceScale, quantityScale, quoteCoin, status, symbol, takerFeeRate, userMinBorrow, warningRiskRatio, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginSystemResult {\n");
    sb.append("    baseCoin: ").append(toIndentedString(baseCoin)).append("\n");
    sb.append("    isBorrowable: ").append(toIndentedString(isBorrowable)).append("\n");
    sb.append("    liquidationRiskRatio: ").append(toIndentedString(liquidationRiskRatio)).append("\n");
    sb.append("    makerFeeRate: ").append(toIndentedString(makerFeeRate)).append("\n");
    sb.append("    maxCrossLeverage: ").append(toIndentedString(maxCrossLeverage)).append("\n");
    sb.append("    maxIsolatedLeverage: ").append(toIndentedString(maxIsolatedLeverage)).append("\n");
    sb.append("    maxTradeAmount: ").append(toIndentedString(maxTradeAmount)).append("\n");
    sb.append("    minTradeAmount: ").append(toIndentedString(minTradeAmount)).append("\n");
    sb.append("    minTradeUSDT: ").append(toIndentedString(minTradeUSDT)).append("\n");
    sb.append("    priceScale: ").append(toIndentedString(priceScale)).append("\n");
    sb.append("    quantityScale: ").append(toIndentedString(quantityScale)).append("\n");
    sb.append("    quoteCoin: ").append(toIndentedString(quoteCoin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    takerFeeRate: ").append(toIndentedString(takerFeeRate)).append("\n");
    sb.append("    userMinBorrow: ").append(toIndentedString(userMinBorrow)).append("\n");
    sb.append("    warningRiskRatio: ").append(toIndentedString(warningRiskRatio)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("baseCoin");
    openapiFields.add("isBorrowable");
    openapiFields.add("liquidationRiskRatio");
    openapiFields.add("makerFeeRate");
    openapiFields.add("maxCrossLeverage");
    openapiFields.add("maxIsolatedLeverage");
    openapiFields.add("maxTradeAmount");
    openapiFields.add("minTradeAmount");
    openapiFields.add("minTradeUSDT");
    openapiFields.add("priceScale");
    openapiFields.add("quantityScale");
    openapiFields.add("quoteCoin");
    openapiFields.add("status");
    openapiFields.add("symbol");
    openapiFields.add("takerFeeRate");
    openapiFields.add("userMinBorrow");
    openapiFields.add("warningRiskRatio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarginSystemResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MarginSystemResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarginSystemResult is not found in the empty JSON string", MarginSystemResult.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("baseCoin") != null && !jsonObj.get("baseCoin").isJsonNull()) && !jsonObj.get("baseCoin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseCoin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseCoin").toString()));
      }
      if ((jsonObj.get("liquidationRiskRatio") != null && !jsonObj.get("liquidationRiskRatio").isJsonNull()) && !jsonObj.get("liquidationRiskRatio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidationRiskRatio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidationRiskRatio").toString()));
      }
      if ((jsonObj.get("makerFeeRate") != null && !jsonObj.get("makerFeeRate").isJsonNull()) && !jsonObj.get("makerFeeRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `makerFeeRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("makerFeeRate").toString()));
      }
      if ((jsonObj.get("maxCrossLeverage") != null && !jsonObj.get("maxCrossLeverage").isJsonNull()) && !jsonObj.get("maxCrossLeverage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxCrossLeverage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxCrossLeverage").toString()));
      }
      if ((jsonObj.get("maxIsolatedLeverage") != null && !jsonObj.get("maxIsolatedLeverage").isJsonNull()) && !jsonObj.get("maxIsolatedLeverage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxIsolatedLeverage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxIsolatedLeverage").toString()));
      }
      if ((jsonObj.get("maxTradeAmount") != null && !jsonObj.get("maxTradeAmount").isJsonNull()) && !jsonObj.get("maxTradeAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxTradeAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxTradeAmount").toString()));
      }
      if ((jsonObj.get("minTradeAmount") != null && !jsonObj.get("minTradeAmount").isJsonNull()) && !jsonObj.get("minTradeAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minTradeAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minTradeAmount").toString()));
      }
      if ((jsonObj.get("minTradeUSDT") != null && !jsonObj.get("minTradeUSDT").isJsonNull()) && !jsonObj.get("minTradeUSDT").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minTradeUSDT` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minTradeUSDT").toString()));
      }
      if ((jsonObj.get("priceScale") != null && !jsonObj.get("priceScale").isJsonNull()) && !jsonObj.get("priceScale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priceScale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priceScale").toString()));
      }
      if ((jsonObj.get("quantityScale") != null && !jsonObj.get("quantityScale").isJsonNull()) && !jsonObj.get("quantityScale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantityScale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantityScale").toString()));
      }
      if ((jsonObj.get("quoteCoin") != null && !jsonObj.get("quoteCoin").isJsonNull()) && !jsonObj.get("quoteCoin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteCoin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteCoin").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("takerFeeRate") != null && !jsonObj.get("takerFeeRate").isJsonNull()) && !jsonObj.get("takerFeeRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `takerFeeRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("takerFeeRate").toString()));
      }
      if ((jsonObj.get("userMinBorrow") != null && !jsonObj.get("userMinBorrow").isJsonNull()) && !jsonObj.get("userMinBorrow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userMinBorrow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userMinBorrow").toString()));
      }
      if ((jsonObj.get("warningRiskRatio") != null && !jsonObj.get("warningRiskRatio").isJsonNull()) && !jsonObj.get("warningRiskRatio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningRiskRatio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warningRiskRatio").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarginSystemResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarginSystemResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarginSystemResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarginSystemResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MarginSystemResult>() {
           @Override
           public void write(JsonWriter out, MarginSystemResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MarginSystemResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MarginSystemResult instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MarginSystemResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarginSystemResult
  * @throws IOException if the JSON string is invalid with respect to MarginSystemResult
  */
  public static MarginSystemResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarginSystemResult.class);
  }

 /**
  * Convert an instance of MarginSystemResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

