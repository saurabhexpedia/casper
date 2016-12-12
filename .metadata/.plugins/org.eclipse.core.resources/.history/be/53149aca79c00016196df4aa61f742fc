
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
    "booking",
    "pricing",
    "fees"
})
public class Reservation {

    @JsonProperty("booking")
    private Booking booking;
    @JsonProperty("pricing")
    private Pricing_ pricing;
    @JsonProperty("fees")
    private List<Fee> fees = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The booking
     */
    @JsonProperty("booking")
    public Booking getBooking() {
        return booking;
    }

    /**
     * 
     * @param booking
     *     The booking
     */
    @JsonProperty("booking")
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    @JsonProperty("pricing")
    public Pricing_ getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    @JsonProperty("pricing")
    public void setPricing(Pricing_ pricing) {
        this.pricing = pricing;
    }

    /**
     * 
     * @return
     *     The fees
     */
    @JsonProperty("fees")
    public List<Fee> getFees() {
        return fees;
    }

    /**
     * 
     * @param fees
     *     The fees
     */
    @JsonProperty("fees")
    public void setFees(List<Fee> fees) {
        this.fees = fees;
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
