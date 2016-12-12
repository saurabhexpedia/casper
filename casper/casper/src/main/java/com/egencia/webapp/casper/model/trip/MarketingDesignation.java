
package com.egencia.webapp.casper.model.trip;

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
    "carrier_code",
    "carrier_name",
    "number",
    "low_cost_carrier",
    "seat_selection"
})
public class MarketingDesignation {

    @JsonProperty("carrier_code")
    private String carrierCode;
    @JsonProperty("carrier_name")
    private String carrierName;
    @JsonProperty("number")
    private String number;
    @JsonProperty("low_cost_carrier")
    private Boolean lowCostCarrier;
    @JsonProperty("seat_selection")
    private Boolean seatSelection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The carrierCode
     */
    @JsonProperty("carrier_code")
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 
     * @param carrierCode
     *     The carrier_code
     */
    @JsonProperty("carrier_code")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /**
     * 
     * @return
     *     The carrierName
     */
    @JsonProperty("carrier_name")
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * 
     * @param carrierName
     *     The carrier_name
     */
    @JsonProperty("carrier_name")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * 
     * @return
     *     The number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The lowCostCarrier
     */
    @JsonProperty("low_cost_carrier")
    public Boolean getLowCostCarrier() {
        return lowCostCarrier;
    }

    /**
     * 
     * @param lowCostCarrier
     *     The low_cost_carrier
     */
    @JsonProperty("low_cost_carrier")
    public void setLowCostCarrier(Boolean lowCostCarrier) {
        this.lowCostCarrier = lowCostCarrier;
    }

    /**
     * 
     * @return
     *     The seatSelection
     */
    @JsonProperty("seat_selection")
    public Boolean getSeatSelection() {
        return seatSelection;
    }

    /**
     * 
     * @param seatSelection
     *     The seat_selection
     */
    @JsonProperty("seat_selection")
    public void setSeatSelection(Boolean seatSelection) {
        this.seatSelection = seatSelection;
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
