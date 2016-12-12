
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
    "passenger_type",
    "fare_basis",
    "fare_types",
    "fare_labels",
    "rules_and_regulations",
    "ticket",
    "fulfillment",
    "pricing_passenger_type_code"
})
public class TravelerInfo {

    @JsonProperty("passenger_type")
    private String passengerType;
    @JsonProperty("fare_basis")
    private String fareBasis;
    @JsonProperty("fare_types")
    private List<FareType> fareTypes = null;
    @JsonProperty("fare_labels")
    private List<FareLabel> fareLabels = null;
    @JsonProperty("rules_and_regulations")
    private RulesAndRegulations rulesAndRegulations;
    @JsonProperty("ticket")
    private Ticket ticket;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("pricing_passenger_type_code")
    private String pricingPassengerTypeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The passengerType
     */
    @JsonProperty("passenger_type")
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * 
     * @param passengerType
     *     The passenger_type
     */
    @JsonProperty("passenger_type")
    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
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
     *     The fareTypes
     */
    @JsonProperty("fare_types")
    public List<FareType> getFareTypes() {
        return fareTypes;
    }

    /**
     * 
     * @param fareTypes
     *     The fare_types
     */
    @JsonProperty("fare_types")
    public void setFareTypes(List<FareType> fareTypes) {
        this.fareTypes = fareTypes;
    }

    /**
     * 
     * @return
     *     The fareLabels
     */
    @JsonProperty("fare_labels")
    public List<FareLabel> getFareLabels() {
        return fareLabels;
    }

    /**
     * 
     * @param fareLabels
     *     The fare_labels
     */
    @JsonProperty("fare_labels")
    public void setFareLabels(List<FareLabel> fareLabels) {
        this.fareLabels = fareLabels;
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
     *     The ticket
     */
    @JsonProperty("ticket")
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * 
     * @param ticket
     *     The ticket
     */
    @JsonProperty("ticket")
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * 
     * @return
     *     The fulfillment
     */
    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * 
     * @param fulfillment
     *     The fulfillment
     */
    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    /**
     * 
     * @return
     *     The pricingPassengerTypeCode
     */
    @JsonProperty("pricing_passenger_type_code")
    public String getPricingPassengerTypeCode() {
        return pricingPassengerTypeCode;
    }

    /**
     * 
     * @param pricingPassengerTypeCode
     *     The pricing_passenger_type_code
     */
    @JsonProperty("pricing_passenger_type_code")
    public void setPricingPassengerTypeCode(String pricingPassengerTypeCode) {
        this.pricingPassengerTypeCode = pricingPassengerTypeCode;
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
