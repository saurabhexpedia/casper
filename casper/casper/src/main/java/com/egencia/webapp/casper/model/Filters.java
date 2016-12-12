
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
    "marketing_carriers",
    "first_departure",
    "last_departure",
    "first_arrival",
    "last_arrival",
    "number_of_stops",
    "connecting_airports",
    "departure_airports",
    "arrival_airports"
})
public class Filters {

    @JsonProperty("marketing_carriers")
    private List<String> marketingCarriers = null;
    @JsonProperty("first_departure")
    private String firstDeparture;
    @JsonProperty("last_departure")
    private String lastDeparture;
    @JsonProperty("first_arrival")
    private String firstArrival;
    @JsonProperty("last_arrival")
    private String lastArrival;
    @JsonProperty("number_of_stops")
    private List<Integer> numberOfStops = null;
    @JsonProperty("connecting_airports")
    private List<String> connectingAirports = null;
    @JsonProperty("departure_airports")
    private List<String> departureAirports = null;
    @JsonProperty("arrival_airports")
    private List<String> arrivalAirports = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The marketingCarriers
     */
    @JsonProperty("marketing_carriers")
    public List<String> getMarketingCarriers() {
        return marketingCarriers;
    }

    /**
     * 
     * @param marketingCarriers
     *     The marketing_carriers
     */
    @JsonProperty("marketing_carriers")
    public void setMarketingCarriers(List<String> marketingCarriers) {
        this.marketingCarriers = marketingCarriers;
    }

    /**
     * 
     * @return
     *     The firstDeparture
     */
    @JsonProperty("first_departure")
    public String getFirstDeparture() {
        return firstDeparture;
    }

    /**
     * 
     * @param firstDeparture
     *     The first_departure
     */
    @JsonProperty("first_departure")
    public void setFirstDeparture(String firstDeparture) {
        this.firstDeparture = firstDeparture;
    }

    /**
     * 
     * @return
     *     The lastDeparture
     */
    @JsonProperty("last_departure")
    public String getLastDeparture() {
        return lastDeparture;
    }

    /**
     * 
     * @param lastDeparture
     *     The last_departure
     */
    @JsonProperty("last_departure")
    public void setLastDeparture(String lastDeparture) {
        this.lastDeparture = lastDeparture;
    }

    /**
     * 
     * @return
     *     The firstArrival
     */
    @JsonProperty("first_arrival")
    public String getFirstArrival() {
        return firstArrival;
    }

    /**
     * 
     * @param firstArrival
     *     The first_arrival
     */
    @JsonProperty("first_arrival")
    public void setFirstArrival(String firstArrival) {
        this.firstArrival = firstArrival;
    }

    /**
     * 
     * @return
     *     The lastArrival
     */
    @JsonProperty("last_arrival")
    public String getLastArrival() {
        return lastArrival;
    }

    /**
     * 
     * @param lastArrival
     *     The last_arrival
     */
    @JsonProperty("last_arrival")
    public void setLastArrival(String lastArrival) {
        this.lastArrival = lastArrival;
    }

    /**
     * 
     * @return
     *     The numberOfStops
     */
    @JsonProperty("number_of_stops")
    public List<Integer> getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * 
     * @param numberOfStops
     *     The number_of_stops
     */
    @JsonProperty("number_of_stops")
    public void setNumberOfStops(List<Integer> numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    /**
     * 
     * @return
     *     The connectingAirports
     */
    @JsonProperty("connecting_airports")
    public List<String> getConnectingAirports() {
        return connectingAirports;
    }

    /**
     * 
     * @param connectingAirports
     *     The connecting_airports
     */
    @JsonProperty("connecting_airports")
    public void setConnectingAirports(List<String> connectingAirports) {
        this.connectingAirports = connectingAirports;
    }

    /**
     * 
     * @return
     *     The departureAirports
     */
    @JsonProperty("departure_airports")
    public List<String> getDepartureAirports() {
        return departureAirports;
    }

    /**
     * 
     * @param departureAirports
     *     The departure_airports
     */
    @JsonProperty("departure_airports")
    public void setDepartureAirports(List<String> departureAirports) {
        this.departureAirports = departureAirports;
    }

    /**
     * 
     * @return
     *     The arrivalAirports
     */
    @JsonProperty("arrival_airports")
    public List<String> getArrivalAirports() {
        return arrivalAirports;
    }

    /**
     * 
     * @param arrivalAirports
     *     The arrival_airports
     */
    @JsonProperty("arrival_airports")
    public void setArrivalAirports(List<String> arrivalAirports) {
        this.arrivalAirports = arrivalAirports;
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
