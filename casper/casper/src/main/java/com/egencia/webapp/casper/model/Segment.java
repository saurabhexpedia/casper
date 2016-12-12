
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
    "departure_location",
    "arrival_location",
    "booking_code",
    "equipment_type",
    "marketing_designation",
    "operating_designation",
    "duration",
    "traveler_info",
    "sfpd_required",
    "departure_datetime",
    "arrival_datetime",
    "class"
})
public class Segment {

    @JsonProperty("departure_location")
    private DepartureLocation departureLocation;
    @JsonProperty("arrival_location")
    private ArrivalLocation arrivalLocation;
    @JsonProperty("booking_code")
    private String bookingCode;
    @JsonProperty("equipment_type")
    private EquipmentType equipmentType;
    @JsonProperty("marketing_designation")
    private MarketingDesignation marketingDesignation;
    @JsonProperty("operating_designation")
    private OperatingDesignation operatingDesignation;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("traveler_info")
    private List<TravelerInfo> travelerInfo = null;
    @JsonProperty("sfpd_required")
    private Boolean sfpdRequired;
    @JsonProperty("departure_datetime")
    private String departureDatetime;
    @JsonProperty("arrival_datetime")
    private String arrivalDatetime;
    @JsonProperty("class")
    private Class _class;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The sfpdRequired
     */
    @JsonProperty("sfpd_required")
    public Boolean getSfpdRequired() {
        return sfpdRequired;
    }

    /**
     * 
     * @param sfpdRequired
     *     The sfpd_required
     */
    @JsonProperty("sfpd_required")
    public void setSfpdRequired(Boolean sfpdRequired) {
        this.sfpdRequired = sfpdRequired;
    }

    /**
     * 
     * @return
     *     The departureDatetime
     */
    @JsonProperty("departure_datetime")
    public String getDepartureDatetime() {
        return departureDatetime;
    }

    /**
     * 
     * @param departureDatetime
     *     The departure_datetime
     */
    @JsonProperty("departure_datetime")
    public void setDepartureDatetime(String departureDatetime) {
        this.departureDatetime = departureDatetime;
    }

    /**
     * 
     * @return
     *     The arrivalDatetime
     */
    @JsonProperty("arrival_datetime")
    public String getArrivalDatetime() {
        return arrivalDatetime;
    }

    /**
     * 
     * @param arrivalDatetime
     *     The arrival_datetime
     */
    @JsonProperty("arrival_datetime")
    public void setArrivalDatetime(String arrivalDatetime) {
        this.arrivalDatetime = arrivalDatetime;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
