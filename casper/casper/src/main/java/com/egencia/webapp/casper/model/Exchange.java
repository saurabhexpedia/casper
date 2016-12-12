
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
    "possible",
    "penalties",
    "has_restriction",
    "label"
})
public class Exchange {

    @JsonProperty("possible")
    private Boolean possible;
    @JsonProperty("penalties")
    private Penalties penalties;
    @JsonProperty("has_restriction")
    private Boolean hasRestriction;
    @JsonProperty("label")
    private String label;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The possible
     */
    @JsonProperty("possible")
    public Boolean getPossible() {
        return possible;
    }

    /**
     * 
     * @param possible
     *     The possible
     */
    @JsonProperty("possible")
    public void setPossible(Boolean possible) {
        this.possible = possible;
    }

    /**
     * 
     * @return
     *     The penalties
     */
    @JsonProperty("penalties")
    public Penalties getPenalties() {
        return penalties;
    }

    /**
     * 
     * @param penalties
     *     The penalties
     */
    @JsonProperty("penalties")
    public void setPenalties(Penalties penalties) {
        this.penalties = penalties;
    }

    /**
     * 
     * @return
     *     The hasRestriction
     */
    @JsonProperty("has_restriction")
    public Boolean getHasRestriction() {
        return hasRestriction;
    }

    /**
     * 
     * @param hasRestriction
     *     The has_restriction
     */
    @JsonProperty("has_restriction")
    public void setHasRestriction(Boolean hasRestriction) {
        this.hasRestriction = hasRestriction;
    }

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
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
