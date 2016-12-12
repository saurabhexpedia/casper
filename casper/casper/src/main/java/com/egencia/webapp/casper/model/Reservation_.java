
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
    "booking",
    "pricing"
})
public class Reservation_ {

    @JsonProperty("booking")
    private Booking_ booking;
    @JsonProperty("pricing")
    private Pricing__ pricing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The booking
     */
    @JsonProperty("booking")
    public Booking_ getBooking() {
        return booking;
    }

    /**
     * 
     * @param booking
     *     The booking
     */
    @JsonProperty("booking")
    public void setBooking(Booking_ booking) {
        this.booking = booking;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    @JsonProperty("pricing")
    public Pricing__ getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    @JsonProperty("pricing")
    public void setPricing(Pricing__ pricing) {
        this.pricing = pricing;
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
