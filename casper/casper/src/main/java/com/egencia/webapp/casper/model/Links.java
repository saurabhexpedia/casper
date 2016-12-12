
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
    "inbound",
    "next",
    "previous"
})
public class Links {

    @JsonProperty("inbound")
    private String inbound;
    @JsonProperty("next")
    private String next;
    @JsonProperty("previous")
    private String previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The inbound
     */
    @JsonProperty("inbound")
    public String getInbound() {
        return inbound;
    }

    /**
     * 
     * @param inbound
     *     The inbound
     */
    @JsonProperty("inbound")
    public void setInbound(String inbound) {
        this.inbound = inbound;
    }

    /**
     * 
     * @return
     *     The next
     */
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    /**
     * 
     * @param next
     *     The next
     */
    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * @return
     *     The previous
     */
    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * 
     * @param previous
     *     The previous
     */
    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
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
