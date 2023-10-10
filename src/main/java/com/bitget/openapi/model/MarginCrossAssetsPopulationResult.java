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
 * MarginCrossAssetsPopulationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginCrossAssetsPopulationResult {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public static final String SERIALIZED_NAME_BORROW = "borrow";
  @SerializedName(SERIALIZED_NAME_BORROW)
  private String borrow;

  public static final String SERIALIZED_NAME_COIN = "coin";
  @SerializedName(SERIALIZED_NAME_COIN)
  private String coin;

  public static final String SERIALIZED_NAME_CTIME = "ctime";
  @SerializedName(SERIALIZED_NAME_CTIME)
  private String ctime;

  public static final String SERIALIZED_NAME_FROZEN = "frozen";
  @SerializedName(SERIALIZED_NAME_FROZEN)
  private String frozen;

  public static final String SERIALIZED_NAME_INTEREST = "interest";
  @SerializedName(SERIALIZED_NAME_INTEREST)
  private String interest;

  public static final String SERIALIZED_NAME_NET = "net";
  @SerializedName(SERIALIZED_NAME_NET)
  private String net;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "totalAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public MarginCrossAssetsPopulationResult() {
  }

  public MarginCrossAssetsPopulationResult available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }


  public MarginCrossAssetsPopulationResult borrow(String borrow) {
    
    this.borrow = borrow;
    return this;
  }

   /**
   * Get borrow
   * @return borrow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBorrow() {
    return borrow;
  }


  public void setBorrow(String borrow) {
    this.borrow = borrow;
  }


  public MarginCrossAssetsPopulationResult coin(String coin) {
    
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


  public MarginCrossAssetsPopulationResult ctime(String ctime) {
    
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


  public MarginCrossAssetsPopulationResult frozen(String frozen) {
    
    this.frozen = frozen;
    return this;
  }

   /**
   * Get frozen
   * @return frozen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrozen() {
    return frozen;
  }


  public void setFrozen(String frozen) {
    this.frozen = frozen;
  }


  public MarginCrossAssetsPopulationResult interest(String interest) {
    
    this.interest = interest;
    return this;
  }

   /**
   * Get interest
   * @return interest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterest() {
    return interest;
  }


  public void setInterest(String interest) {
    this.interest = interest;
  }


  public MarginCrossAssetsPopulationResult net(String net) {
    
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNet() {
    return net;
  }


  public void setNet(String net) {
    this.net = net;
  }


  public MarginCrossAssetsPopulationResult totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
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
   * @return the MarginCrossAssetsPopulationResult instance itself
   */
  public MarginCrossAssetsPopulationResult putAdditionalProperty(String key, Object value) {
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
    MarginCrossAssetsPopulationResult marginCrossAssetsPopulationResult = (MarginCrossAssetsPopulationResult) o;
    return Objects.equals(this.available, marginCrossAssetsPopulationResult.available) &&
        Objects.equals(this.borrow, marginCrossAssetsPopulationResult.borrow) &&
        Objects.equals(this.coin, marginCrossAssetsPopulationResult.coin) &&
        Objects.equals(this.ctime, marginCrossAssetsPopulationResult.ctime) &&
        Objects.equals(this.frozen, marginCrossAssetsPopulationResult.frozen) &&
        Objects.equals(this.interest, marginCrossAssetsPopulationResult.interest) &&
        Objects.equals(this.net, marginCrossAssetsPopulationResult.net) &&
        Objects.equals(this.totalAmount, marginCrossAssetsPopulationResult.totalAmount)&&
        Objects.equals(this.additionalProperties, marginCrossAssetsPopulationResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, borrow, coin, ctime, frozen, interest, net, totalAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginCrossAssetsPopulationResult {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    borrow: ").append(toIndentedString(borrow)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("available");
    openapiFields.add("borrow");
    openapiFields.add("coin");
    openapiFields.add("ctime");
    openapiFields.add("frozen");
    openapiFields.add("interest");
    openapiFields.add("net");
    openapiFields.add("totalAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarginCrossAssetsPopulationResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MarginCrossAssetsPopulationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarginCrossAssetsPopulationResult is not found in the empty JSON string", MarginCrossAssetsPopulationResult.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("available") != null && !jsonObj.get("available").isJsonNull()) && !jsonObj.get("available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available").toString()));
      }
      if ((jsonObj.get("borrow") != null && !jsonObj.get("borrow").isJsonNull()) && !jsonObj.get("borrow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `borrow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("borrow").toString()));
      }
      if ((jsonObj.get("coin") != null && !jsonObj.get("coin").isJsonNull()) && !jsonObj.get("coin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coin").toString()));
      }
      if ((jsonObj.get("ctime") != null && !jsonObj.get("ctime").isJsonNull()) && !jsonObj.get("ctime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ctime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ctime").toString()));
      }
      if ((jsonObj.get("frozen") != null && !jsonObj.get("frozen").isJsonNull()) && !jsonObj.get("frozen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frozen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frozen").toString()));
      }
      if ((jsonObj.get("interest") != null && !jsonObj.get("interest").isJsonNull()) && !jsonObj.get("interest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interest").toString()));
      }
      if ((jsonObj.get("net") != null && !jsonObj.get("net").isJsonNull()) && !jsonObj.get("net").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `net` to be a primitive type in the JSON string but got `%s`", jsonObj.get("net").toString()));
      }
      if ((jsonObj.get("totalAmount") != null && !jsonObj.get("totalAmount").isJsonNull()) && !jsonObj.get("totalAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalAmount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarginCrossAssetsPopulationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarginCrossAssetsPopulationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarginCrossAssetsPopulationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarginCrossAssetsPopulationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<MarginCrossAssetsPopulationResult>() {
           @Override
           public void write(JsonWriter out, MarginCrossAssetsPopulationResult value) throws IOException {
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
           public MarginCrossAssetsPopulationResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MarginCrossAssetsPopulationResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MarginCrossAssetsPopulationResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarginCrossAssetsPopulationResult
  * @throws IOException if the JSON string is invalid with respect to MarginCrossAssetsPopulationResult
  */
  public static MarginCrossAssetsPopulationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarginCrossAssetsPopulationResult.class);
  }

 /**
  * Convert an instance of MarginCrossAssetsPopulationResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

