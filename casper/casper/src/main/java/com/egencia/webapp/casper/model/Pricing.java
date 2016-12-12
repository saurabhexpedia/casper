
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
    "amount",
    "currency",
    "breakdown",
    "checkout_total",
    "rounded_amount"
})
public class Pricing {

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("breakdown")
    private List<Breakdown> breakdown = null;
    @JsonProperty("checkout_total")
    private CheckoutTotal checkoutTotal;
    @JsonProperty("rounded_amount")
    private Integer roundedAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The breakdown
     */
    @JsonProperty("breakdown")
    public List<Breakdown> getBreakdown() {
        return breakdown;
    }

    /**
     * 
     * @param breakdown
     *     The breakdown
     */
    @JsonProperty("breakdown")
    public void setBreakdown(List<Breakdown> breakdown) {
        this.breakdown = breakdown;
    }

    /**
     * 
     * @return
     *     The checkoutTotal
     */
    @JsonProperty("checkout_total")
    public CheckoutTotal getCheckoutTotal() {
        return checkoutTotal;
    }

    /**
     * 
     * @param checkoutTotal
     *     The checkout_total
     */
    @JsonProperty("checkout_total")
    public void setCheckoutTotal(CheckoutTotal checkoutTotal) {
        this.checkoutTotal = checkoutTotal;
    }

    /**
     * 
     * @return
     *     The roundedAmount
     */
    @JsonProperty("rounded_amount")
    public Integer getRoundedAmount() {
        return roundedAmount;
    }

    /**
     * 
     * @param roundedAmount
     *     The rounded_amount
     */
    @JsonProperty("rounded_amount")
    public void setRoundedAmount(Integer roundedAmount) {
        this.roundedAmount = roundedAmount;
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
