
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
    "class",
    "booking_code",
    "scheduled_departure_datetime",
    "scheduled_arrival_datetime",
    "distance",
    "departure_location",
    "arrival_location",
    "marketing_designation",
    "equipment_type",
    "baggage_allowance",
    "traveler_info",
    "operating_designation",
    "messages"
})
public class Segment {

    @JsonProperty("class")
    private Class _class;
    @JsonProperty("booking_code")
    private String bookingCode;
    @JsonProperty("scheduled_departure_datetime")
    private String scheduledDepartureDatetime;
    @JsonProperty("scheduled_arrival_datetime")
    private String scheduledArrivalDatetime;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("departure_location")
    private DepartureLocation departureLocation;
    @JsonProperty("arrival_location")
    private ArrivalLocation arrivalLocation;
    @JsonProperty("marketing_designation")
    private MarketingDesignation marketingDesignation;
    @JsonProperty("equipment_type")
    private EquipmentType equipmentType;
    @JsonProperty("baggage_allowance")
    private BaggageAllowance baggageAllowance;
    @JsonProperty("traveler_info")
    private List<TravelerInfo> travelerInfo = null;
    @JsonProperty("operating_designation")
    private OperatingDesignation operatingDesignation;
    @JsonProperty("messages")
    private List<Message> messages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _class
     */
    @JsonProperty("class")
    public Class getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    @JsonProperty("class")
    public void setClass_(Class _class) {
        this._class = _class;
    }

    /**
     * 
     * @return
     *     The bookingCode
     */
    @JsonProperty("booking_code")
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * 
     * @param bookingCode
     *     The booking_code
     */
    @JsonProperty("booking_code")
    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    /**
     * 
     * @return
     *     The scheduledDepartureDatetime
     */
    @JsonProperty("scheduled_departure_datetime")
    public String getScheduledDepartureDatetime() {
        return scheduledDepartureDatetime;
    }

    /**
     * 
     * @param scheduledDepartureDatetime
     *     The scheduled_departure_datetime
     */
    @JsonProperty("scheduled_departure_datetime")
    public void setScheduledDepartureDatetime(String scheduledDepartureDatetime) {
        this.scheduledDepartureDatetime = scheduledDepartureDatetime;
    }

    /**
     * 
     * @return
     *     The scheduledArrivalDatetime
     */
    @JsonProperty("scheduled_arrival_datetime")
    public String getScheduledArrivalDatetime() {
        return scheduledArrivalDatetime;
    }

    /**
     * 
     * @param scheduledArrivalDatetime
     *     The scheduled_arrival_datetime
     */
    @JsonProperty("scheduled_arrival_datetime")
    public void setScheduledArrivalDatetime(String scheduledArrivalDatetime) {
        this.scheduledArrivalDatetime = scheduledArrivalDatetime;
    }

    /**
     * 
     * @return
     *     The distance
     */
    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The departureLocation
     */
    @JsonProperty("departure_location")
    public DepartureLocation getDepartureLocation() {
        return departureLocation;
    }

    /**
     * 
     * @param departureLocation
     *     The departure_location
     */
    @JsonProperty("departure_location")
    public void setDepartureLocation(DepartureLocation departureLocation) {
        this.departureLocation = departureLocation;
    }

    /**
     * 
     * @return
     *     The arrivalLocation
     */
    @JsonProperty("arrival_location")
    public ArrivalLocation getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * 
     * @param arrivalLocation
     *     The arrival_location
     */
    @JsonProperty("arrival_location")
    public void setArrivalLocation(ArrivalLocation arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    /**
     * 
     * @return
     *     The marketingDesignation
     */
    @JsonProperty("marketing_designation")
    public MarketingDesignation getMarketingDesignation() {
        return marketingDesignation;
    }

    /**
     * 
     * @param marketingDesignation
     *     The marketing_designation
     */
    @JsonProperty("marketing_designation")
    public void setMarketingDesignation(MarketingDesignation marketingDesignation) {
        this.marketingDesignation = marketingDesignation;
    }

    /**
     * 
     * @return
     *     The equipmentType
     */
    @JsonProperty("equipment_type")
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /**
     * 
     * @param equipmentType
     *     The equipment_type
     */
    @JsonProperty("equipment_type")
    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 
     * @return
     *     The baggageAllowance
     */
    @JsonProperty("baggage_allowance")
    public BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * 
     * @param baggageAllowance
     *     The baggage_allowance
     */
    @JsonProperty("baggage_allowance")
    public void setBaggageAllowance(BaggageAllowance baggageAllowance) {
        this.baggageAllowance = baggageAllowance;
    }

    /**
     * 
     * @return
     *     The travelerInfo
     */
    @JsonProperty("traveler_info")
    public List<TravelerInfo> getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * 
     * @param travelerInfo
     *     The traveler_info
     */
    @JsonProperty("traveler_info")
    public void setTravelerInfo(List<TravelerInfo> travelerInfo) {
        this.travelerInfo = travelerInfo;
    }

    /**
     * 
     * @return
     *     The operatingDesignation
     */
    @JsonProperty("operating_designation")
    public OperatingDesignation getOperatingDesignation() {
        return operatingDesignation;
    }

    /**
     * 
     * @param operatingDesignation
     *     The operating_designation
     */
    @JsonProperty("operating_designation")
    public void setOperatingDesignation(OperatingDesignation operatingDesignation) {
        this.operatingDesignation = operatingDesignation;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
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
