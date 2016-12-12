
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
    "breakdown",
    "traveler_prices"
})
public class Pricing__ {

    @JsonProperty("breakdown")
    private List<Breakdown_______> breakdown = null;
    @JsonProperty("traveler_prices")
    private List<TravelerPrice_> travelerPrices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The breakdown
     */
    @JsonProperty("breakdown")
    public List<Breakdown_______> getBreakdown() {
        return breakdown;
    }

    /**
     * 
     * @param breakdown
     *     The breakdown
     */
    @JsonProperty("breakdown")
    public void setBreakdown(List<Breakdown_______> breakdown) {
        this.breakdown = breakdown;
    }

    /**
     * 
     * @return
     *     The travelerPrices
     */
    @JsonProperty("traveler_prices")
    public List<TravelerPrice_> getTravelerPrices() {
        return travelerPrices;
    }

    /**
     * 
     * @param travelerPrices
     *     The traveler_prices
     */
    @JsonProperty("traveler_prices")
    public void setTravelerPrices(List<TravelerPrice_> travelerPrices) {
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
