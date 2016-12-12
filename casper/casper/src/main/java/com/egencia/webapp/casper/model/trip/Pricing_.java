
package com.egencia.webapp.casper.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "traveler_prices"
})
public class Pricing_ {

    @JsonProperty("traveler_prices")
    private List<TravelerPrice> travelerPrices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The travelerPrices
     */
    @JsonProperty("traveler_prices")
    public List<TravelerPrice> getTravelerPrices() {
        return travelerPrices;
    }

    /**
     * 
     * @param travelerPrices
     *     The traveler_prices
     */
    @JsonProperty("traveler_prices")
    public void setTravelerPrices(List<TravelerPrice> travelerPrices) {
        this.travelerPrices = travelerPrices;
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