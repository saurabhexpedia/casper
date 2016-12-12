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
    "departure_date_time",
    "origin_location",
    "destination_location"
})
public class OriginDestinationRequest {

    @JsonProperty("departure_date_time")
    private DepartureDateTime departureDateTime;
    @JsonProperty("origin_location")
    private OriginLocation originLocation;
    @JsonProperty("destination_location")
    private DestinationLocation destinationLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The departureDateTime
     */
    @JsonProperty("departure_date_time")
    public DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 
     * @param departureDateTime
     *     The departure_date_time
     */
    @JsonProperty("departure_date_time")
    public void setDepartureDateTime(DepartureDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /**
     * 
     * @return
     *     The originLocation
     */
    @JsonProperty("origin_location")
    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * 
     * @param originLocation
     *     The origin_location
     */
    @JsonProperty("origin_location")
    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    /**
     * 
     * @return
     *     The destinationLocation
     */
    @JsonProperty("destination_location")
    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * 
     * @param destinationLocation
     *     The destination_location
     */
    @JsonProperty("destination_location")
    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
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
