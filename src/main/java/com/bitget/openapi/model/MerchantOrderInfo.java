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
import com.bitget.openapi.model.MerchantOrderPaymentInfo;
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
 * MerchantOrderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantOrderInfo {
  public static final String SERIALIZED_NAME_ADV_NO = "advNo";
  @SerializedName(SERIALIZED_NAME_ADV_NO)
  private String advNo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BUYER_REAL_NAME = "buyerRealName";
  @SerializedName(SERIALIZED_NAME_BUYER_REAL_NAME)
  private String buyerRealName;

  public static final String SERIALIZED_NAME_COIN = "coin";
  @SerializedName(SERIALIZED_NAME_COIN)
  private String coin;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_CTIME = "ctime";
  @SerializedName(SERIALIZED_NAME_CTIME)
  private String ctime;

  public static final String SERIALIZED_NAME_FIAT = "fiat";
  @SerializedName(SERIALIZED_NAME_FIAT)
  private String fiat;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_NO = "orderNo";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_PAYMENT_INFO = "paymentInfo";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INFO)
  private MerchantOrderPaymentInfo paymentInfo;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "paymentTime";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private String paymentTime;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_RELEASE_COIN_TIME = "releaseCoinTime";
  @SerializedName(SERIALIZED_NAME_RELEASE_COIN_TIME)
  private String releaseCoinTime;

  public static final String SERIALIZED_NAME_REPRESENT_TIME = "representTime";
  @SerializedName(SERIALIZED_NAME_REPRESENT_TIME)
  private String representTime;

  public static final String SERIALIZED_NAME_SELLER_REAL_NAME = "sellerRealName";
  @SerializedName(SERIALIZED_NAME_SELLER_REAL_NAME)
  private String sellerRealName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WITHDRAW_TIME = "withdrawTime";
  @SerializedName(SERIALIZED_NAME_WITHDRAW_TIME)
  private String withdrawTime;

  public MerchantOrderInfo() {
  }

  public MerchantOrderInfo advNo(String advNo) {
    
    this.advNo = advNo;
    return this;
  }

   /**
   * Get advNo
   * @return advNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdvNo() {
    return advNo;
  }


  public void setAdvNo(String advNo) {
    this.advNo = advNo;
  }


  public MerchantOrderInfo amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public MerchantOrderInfo buyerRealName(String buyerRealName) {
    
    this.buyerRealName = buyerRealName;
    return this;
  }

   /**
   * Get buyerRealName
   * @return buyerRealName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuyerRealName() {
    return buyerRealName;
  }


  public void setBuyerRealName(String buyerRealName) {
    this.buyerRealName = buyerRealName;
  }


  public MerchantOrderInfo coin(String coin) {
    
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoin() {
    return coin;
  }


  public void setCoin(String coin) {
    this.coin = coin;
  }


  public MerchantOrderInfo count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public MerchantOrderInfo ctime(String ctime) {
    
    this.ctime = ctime;
    return this;
  }

   /**
   * Get ctime
   * @return ctime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCtime() {
    return ctime;
  }


  public void setCtime(String ctime) {
    this.ctime = ctime;
  }


  public MerchantOrderInfo fiat(String fiat) {
    
    this.fiat = fiat;
    return this;
  }

   /**
   * Get fiat
   * @return fiat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFiat() {
    return fiat;
  }


  public void setFiat(String fiat) {
    this.fiat = fiat;
  }


  public MerchantOrderInfo orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public MerchantOrderInfo orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public MerchantOrderInfo paymentInfo(MerchantOrderPaymentInfo paymentInfo) {
    
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Get paymentInfo
   * @return paymentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantOrderPaymentInfo getPaymentInfo() {
    return paymentInfo;
  }


  public void setPaymentInfo(MerchantOrderPaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  public MerchantOrderInfo paymentTime(String paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * Get paymentTime
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(String paymentTime) {
    this.paymentTime = paymentTime;
  }


  public MerchantOrderInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public MerchantOrderInfo releaseCoinTime(String releaseCoinTime) {
    
    this.releaseCoinTime = releaseCoinTime;
    return this;
  }

   /**
   * Get releaseCoinTime
   * @return releaseCoinTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseCoinTime() {
    return releaseCoinTime;
  }


  public void setReleaseCoinTime(String releaseCoinTime) {
    this.releaseCoinTime = releaseCoinTime;
  }


  public MerchantOrderInfo representTime(String representTime) {
    
    this.representTime = representTime;
    return this;
  }

   /**
   * Get representTime
   * @return representTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRepresentTime() {
    return representTime;
  }


  public void setRepresentTime(String representTime) {
    this.representTime = representTime;
  }


  public MerchantOrderInfo sellerRealName(String sellerRealName) {
    
    this.sellerRealName = sellerRealName;
    return this;
  }

   /**
   * Get sellerRealName
   * @return sellerRealName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSellerRealName() {
    return sellerRealName;
  }


  public void setSellerRealName(String sellerRealName) {
    this.sellerRealName = sellerRealName;
  }


  public MerchantOrderInfo status(String status) {
    
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


  public MerchantOrderInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MerchantOrderInfo withdrawTime(String withdrawTime) {
    
    this.withdrawTime = withdrawTime;
    return this;
  }

   /**
   * Get withdrawTime
   * @return withdrawTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWithdrawTime() {
    return withdrawTime;
  }


  public void setWithdrawTime(String withdrawTime) {
    this.withdrawTime = withdrawTime;
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
   * @return the MerchantOrderInfo instance itself
   */
  public MerchantOrderInfo putAdditionalProperty(String key, Object value) {
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
    MerchantOrderInfo merchantOrderInfo = (MerchantOrderInfo) o;
    return Objects.equals(this.advNo, merchantOrderInfo.advNo) &&
        Objects.equals(this.amount, merchantOrderInfo.amount) &&
        Objects.equals(this.buyerRealName, merchantOrderInfo.buyerRealName) &&
        Objects.equals(this.coin, merchantOrderInfo.coin) &&
        Objects.equals(this.count, merchantOrderInfo.count) &&
        Objects.equals(this.ctime, merchantOrderInfo.ctime) &&
        Objects.equals(this.fiat, merchantOrderInfo.fiat) &&
        Objects.equals(this.orderId, merchantOrderInfo.orderId) &&
        Objects.equals(this.orderNo, merchantOrderInfo.orderNo) &&
        Objects.equals(this.paymentInfo, merchantOrderInfo.paymentInfo) &&
        Objects.equals(this.paymentTime, merchantOrderInfo.paymentTime) &&
        Objects.equals(this.price, merchantOrderInfo.price) &&
        Objects.equals(this.releaseCoinTime, merchantOrderInfo.releaseCoinTime) &&
        Objects.equals(this.representTime, merchantOrderInfo.representTime) &&
        Objects.equals(this.sellerRealName, merchantOrderInfo.sellerRealName) &&
        Objects.equals(this.status, merchantOrderInfo.status) &&
        Objects.equals(this.type, merchantOrderInfo.type) &&
        Objects.equals(this.withdrawTime, merchantOrderInfo.withdrawTime)&&
        Objects.equals(this.additionalProperties, merchantOrderInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advNo, amount, buyerRealName, coin, count, ctime, fiat, orderId, orderNo, paymentInfo, paymentTime, price, releaseCoinTime, representTime, sellerRealName, status, type, withdrawTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOrderInfo {\n");
    sb.append("    advNo: ").append(toIndentedString(advNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    buyerRealName: ").append(toIndentedString(buyerRealName)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    fiat: ").append(toIndentedString(fiat)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    releaseCoinTime: ").append(toIndentedString(releaseCoinTime)).append("\n");
    sb.append("    representTime: ").append(toIndentedString(representTime)).append("\n");
    sb.append("    sellerRealName: ").append(toIndentedString(sellerRealName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    withdrawTime: ").append(toIndentedString(withdrawTime)).append("\n");
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
    openapiFields.add("advNo");
    openapiFields.add("amount");
    openapiFields.add("buyerRealName");
    openapiFields.add("coin");
    openapiFields.add("count");
    openapiFields.add("ctime");
    openapiFields.add("fiat");
    openapiFields.add("orderId");
    openapiFields.add("orderNo");
    openapiFields.add("paymentInfo");
    openapiFields.add("paymentTime");
    openapiFields.add("price");
    openapiFields.add("releaseCoinTime");
    openapiFields.add("representTime");
    openapiFields.add("sellerRealName");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("withdrawTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantOrderInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantOrderInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantOrderInfo is not found in the empty JSON string", MerchantOrderInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("advNo") != null && !jsonObj.get("advNo").isJsonNull()) && !jsonObj.get("advNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `advNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("advNo").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("buyerRealName") != null && !jsonObj.get("buyerRealName").isJsonNull()) && !jsonObj.get("buyerRealName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerRealName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerRealName").toString()));
      }
      if ((jsonObj.get("coin") != null && !jsonObj.get("coin").isJsonNull()) && !jsonObj.get("coin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coin").toString()));
      }
      if ((jsonObj.get("count") != null && !jsonObj.get("count").isJsonNull()) && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      if ((jsonObj.get("ctime") != null && !jsonObj.get("ctime").isJsonNull()) && !jsonObj.get("ctime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ctime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ctime").toString()));
      }
      if ((jsonObj.get("fiat") != null && !jsonObj.get("fiat").isJsonNull()) && !jsonObj.get("fiat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fiat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fiat").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("orderNo") != null && !jsonObj.get("orderNo").isJsonNull()) && !jsonObj.get("orderNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNo").toString()));
      }
      // validate the optional field `paymentInfo`
      if (jsonObj.get("paymentInfo") != null && !jsonObj.get("paymentInfo").isJsonNull()) {
        MerchantOrderPaymentInfo.validateJsonObject(jsonObj.getAsJsonObject("paymentInfo"));
      }
      if ((jsonObj.get("paymentTime") != null && !jsonObj.get("paymentTime").isJsonNull()) && !jsonObj.get("paymentTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTime").toString()));
      }
      if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if ((jsonObj.get("releaseCoinTime") != null && !jsonObj.get("releaseCoinTime").isJsonNull()) && !jsonObj.get("releaseCoinTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `releaseCoinTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("releaseCoinTime").toString()));
      }
      if ((jsonObj.get("representTime") != null && !jsonObj.get("representTime").isJsonNull()) && !jsonObj.get("representTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `representTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("representTime").toString()));
      }
      if ((jsonObj.get("sellerRealName") != null && !jsonObj.get("sellerRealName").isJsonNull()) && !jsonObj.get("sellerRealName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerRealName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerRealName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("withdrawTime") != null && !jsonObj.get("withdrawTime").isJsonNull()) && !jsonObj.get("withdrawTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withdrawTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withdrawTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantOrderInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantOrderInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantOrderInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantOrderInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantOrderInfo>() {
           @Override
           public void write(JsonWriter out, MerchantOrderInfo value) throws IOException {
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
           public MerchantOrderInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantOrderInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantOrderInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantOrderInfo
  * @throws IOException if the JSON string is invalid with respect to MerchantOrderInfo
  */
  public static MerchantOrderInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantOrderInfo.class);
  }

 /**
  * Convert an instance of MerchantOrderInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

