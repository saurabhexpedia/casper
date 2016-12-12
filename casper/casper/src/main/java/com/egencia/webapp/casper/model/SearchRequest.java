
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
    "origin_destination_requests",
    "refundable_fares_only",
    "travelers"
})
public class SearchRequest {

    @JsonProperty("origin_destination_requests")
    private List<OriginDestinationRequest> originDestinationRequests = null;
    @JsonProperty("refundable_fares_only")
    private Boolean refundableFaresOnly;
    @JsonProperty("travelers")
    private List<Traveler> travelers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The originDestinationRequests
     */
    @JsonProperty("origin_destination_requests")
    public List<OriginDestinationRequest> getOriginDestinationRequests() {
        return originDestinationRequests;
    }

    /**
     * 
     * @param originDestinationRequests
     *     The origin_destination_requests
     */
    @JsonProperty("origin_destination_requests")
    public void setOriginDestinationRequests(List<OriginDestinationRequest> originDestinationRequests) {
        this.originDestinationRequests = originDestinationRequests;
    }

    /**
     * 
     * @return
     *     The refundableFaresOnly
     */
    @JsonProperty("refundable_fares_only")
    public Boolean getRefundableFaresOnly() {
        return refundableFaresOnly;
    }

    /**
     * 
     * @param refundableFaresOnly
     *     The refundable_fares_only
     */
    @JsonProperty("refundable_fares_only")
    public void setRefundableFaresOnly(Boolean refundableFaresOnly) {
        this.refundableFaresOnly = refundableFaresOnly;
    }

    /**
     * 
     * @return
     *     The travelers
     */
    @JsonProperty("travelers")
    public List<Traveler> getTravelers() {
        return travelers;
    }

    /**
     * 
     * @param travelers
     *     The travelers
     */
    @JsonProperty("travelers")
    public void setTravelers(List<Traveler> travelers) {
        this.travelers = travelers;
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
