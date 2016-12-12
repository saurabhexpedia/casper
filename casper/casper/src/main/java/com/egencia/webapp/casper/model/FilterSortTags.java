
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
    "default_order",
    "marketing_carrier_codes",
    "number_of_stops",
    "price",
    "duration",
    "connecting_airports",
    "arrival_airport",
    "departure_airport",
    "departure_time",
    "arrival_time"
})
public class FilterSortTags {

    @JsonProperty("default_order")
    private Integer defaultOrder;
    @JsonProperty("marketing_carrier_codes")
    private List<String> marketingCarrierCodes = null;
    @JsonProperty("number_of_stops")
    private Integer numberOfStops;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("connecting_airports")
    private List<String> connectingAirports = null;
    @JsonProperty("arrival_airport")
    private String arrivalAirport;
    @JsonProperty("departure_airport")
    private String departureAirport;
    @JsonProperty("departure_time")
    private String departureTime;
    @JsonProperty("arrival_time")
    private String arrivalTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The defaultOrder
     */
    @JsonProperty("default_order")
    public Integer getDefaultOrder() {
        return defaultOrder;
    }

    /**
     * 
     * @param defaultOrder
     *     The default_order
     */
    @JsonProperty("default_order")
    public void setDefaultOrder(Integer defaultOrder) {
        this.defaultOrder = defaultOrder;
    }

    /**
     * 
     * @return
     *     The marketingCarrierCodes
     */
    @JsonProperty("marketing_carrier_codes")
    public List<String> getMarketingCarrierCodes() {
        return marketingCarrierCodes;
    }

    /**
     * 
     * @param marketingCarrierCodes
     *     The marketing_carrier_codes
     */
    @JsonProperty("marketing_carrier_codes")
    public void setMarketingCarrierCodes(List<String> marketingCarrierCodes) {
        this.marketingCarrierCodes = marketingCarrierCodes;
    }

    /**
     * 
     * @return
     *     The numberOfStops
     */
    @JsonProperty("number_of_stops")
    public Integer getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * 
     * @param numberOfStops
     *     The number_of_stops
     */
    @JsonProperty("number_of_stops")
    public void setNumberOfStops(Integer numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
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
     *     The arrivalAirport
     */
    @JsonProperty("arrival_airport")
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * 
     * @param arrivalAirport
     *     The arrival_airport
     */
    @JsonProperty("arrival_airport")
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /**
     * 
     * @return
     *     The departureAirport
     */
    @JsonProperty("departure_airport")
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * 
     * @param departureAirport
     *     The departure_airport
     */
    @JsonProperty("departure_airport")
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    @JsonProperty("departure_time")
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departure_time
     */
    @JsonProperty("departure_time")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    @JsonProperty("arrival_time")
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrival_time
     */
    @JsonProperty("arrival_time")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
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
