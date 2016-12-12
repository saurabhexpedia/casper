
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
    "user_id",
    "booking_reference",
    "fare_basis",
    "rules_and_regulations",
    "status",
    "meal_requested"
})
public class TravelerInfo {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("booking_reference")
    private String bookingReference;
    @JsonProperty("fare_basis")
    private String fareBasis;
    @JsonProperty("rules_and_regulations")
    private RulesAndRegulations rulesAndRegulations;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("meal_requested")
    private String mealRequested;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The bookingReference
     */
    @JsonProperty("booking_reference")
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * 
     * @param bookingReference
     *     The booking_reference
     */
    @JsonProperty("booking_reference")
    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    /**
     * 
     * @return
     *     The fareBasis
     */
    @JsonProperty("fare_basis")
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * 
     * @param fareBasis
     *     The fare_basis
     */
    @JsonProperty("fare_basis")
    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    /**
     * 
     * @return
     *     The rulesAndRegulations
     */
    @JsonProperty("rules_and_regulations")
    public RulesAndRegulations getRulesAndRegulations() {
        return rulesAndRegulations;
    }

    /**
     * 
     * @param rulesAndRegulations
     *     The rules_and_regulations
     */
    @JsonProperty("rules_and_regulations")
    public void setRulesAndRegulations(RulesAndRegulations rulesAndRegulations) {
        this.rulesAndRegulations = rulesAndRegulations;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The mealRequested
     */
    @JsonProperty("meal_requested")
    public String getMealRequested() {
        return mealRequested;
    }

    /**
     * 
     * @param mealRequested
     *     The meal_requested
     */
    @JsonProperty("meal_requested")
    public void setMealRequested(String mealRequested) {
        this.mealRequested = mealRequested;
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
