
package com.egencia.webapp.casper.model.trip;

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
    "ancillaries",
    "overall_restrictions"
})
public class BaggageAllowance {

    @JsonProperty("ancillaries")
    private List<Ancillary> ancillaries = null;
    @JsonProperty("overall_restrictions")
    private String overallRestrictions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ancillaries
     */
    @JsonProperty("ancillaries")
    public List<Ancillary> getAncillaries() {
        return ancillaries;
    }

    /**
     * 
     * @param ancillaries
     *     The ancillaries
     */
    @JsonProperty("ancillaries")
    public void setAncillaries(List<Ancillary> ancillaries) {
        this.ancillaries = ancillaries;
    }

    /**
     * 
     * @return
     *     The overallRestrictions
     */
    @JsonProperty("overall_restrictions")
    public String getOverallRestrictions() {
        return overallRestrictions;
    }

    /**
     * 
     * @param overallRestrictions
     *     The overall_restrictions
     */
    @JsonProperty("overall_restrictions")
    public void setOverallRestrictions(String overallRestrictions) {
        this.overallRestrictions = overallRestrictions;
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
