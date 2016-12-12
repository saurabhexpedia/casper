
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
    "origin",
    "destination",
    "links",
    "current_bound"
})
public class Bound {

    @JsonProperty("origin")
    private Origin origin;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("links")
    private Links_ links;
    @JsonProperty("current_bound")
    private Boolean currentBound;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The origin
     */
    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The destination
     */
    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public Links_ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links_ links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The currentBound
     */
    @JsonProperty("current_bound")
    public Boolean getCurrentBound() {
        return currentBound;
    }

    /**
     * 
     * @param currentBound
     *     The current_bound
     */
    @JsonProperty("current_bound")
    public void setCurrentBound(Boolean currentBound) {
        this.currentBound = currentBound;
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
