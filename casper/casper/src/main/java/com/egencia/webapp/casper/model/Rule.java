
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
    "exchange",
    "refund"
})
public class Rule {

    @JsonProperty("exchange")
    private Exchange exchange;
    @JsonProperty("refund")
    private Refund refund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The exchange
     */
    @JsonProperty("exchange")
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * 
     * @param exchange
     *     The exchange
     */
    @JsonProperty("exchange")
    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    /**
     * 
     * @return
     *     The refund
     */
    @JsonProperty("refund")
    public Refund getRefund() {
        return refund;
    }

    /**
     * 
     * @param refund
     *     The refund
     */
    @JsonProperty("refund")
    public void setRefund(Refund refund) {
        this.refund = refund;
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
