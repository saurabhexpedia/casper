
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
    "plating_carrier_code"
})
public class Ticket {

    @JsonProperty("plating_carrier_code")
    private String platingCarrierCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The platingCarrierCode
     */
    @JsonProperty("plating_carrier_code")
    public String getPlatingCarrierCode() {
        return platingCarrierCode;
    }

    /**
     * 
     * @param platingCarrierCode
     *     The plating_carrier_code
     */
    @JsonProperty("plating_carrier_code")
    public void setPlatingCarrierCode(String platingCarrierCode) {
        this.platingCarrierCode = platingCarrierCode;
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
