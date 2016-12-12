
package com.egencia.webapp.casper.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier_name",
    "carrier_code",
    "number"
})
public class OperatingDesignation {

    @JsonProperty("carrier_name")
    private String carrierName;
    @JsonProperty("carrier_code")
    private String carrierCode;
    @JsonProperty("number")
    private String number;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The carrierName
     */
    @JsonProperty("carrier_name")
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 
     * @param carrierName
     *     The carrier_name
     */
    @JsonProperty("carrier_name")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * 
     * @return
     *     The carrierCode
     */
    @JsonProperty("carrier_code")
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 
     * @param carrierCode
     *     The carrier_code
     */
    @JsonProperty("carrier_code")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /**
     * 
     * @return
     *     The number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
