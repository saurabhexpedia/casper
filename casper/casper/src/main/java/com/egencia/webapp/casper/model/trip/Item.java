
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
    "item_type",
    "travelers",
    "external_item",
    "approval_setting",
    "locale",
    "company",
    "messages",
    "pricing",
    "reservations",
    "currency_exchange",
    "origin_destinations"
})
public class Item {

    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("travelers")
    private List<Traveler> travelers = null;
    @JsonProperty("external_item")
    private ExternalItem externalItem;
    @JsonProperty("approval_setting")
    private String approvalSetting;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("company")
    private Company company;
    @JsonProperty("messages")
    private List<Object> messages = null;
    @JsonProperty("pricing")
    private Pricing pricing;
    @JsonProperty("reservations")
    private List<Reservation> reservations = null;
    @JsonProperty("currency_exchange")
    private CurrencyExchange currencyExchange;
    @JsonProperty("origin_destinations")
    private List<OriginDestination> originDestinations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The itemType
     */
    @JsonProperty("item_type")
    public String getItemType() {
        return itemType;
    }

    /**
     * 
     * @param itemType
     *     The item_type
     */
    @JsonProperty("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
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

    /**
     * 
     * @return
     *     The externalItem
     */
    @JsonProperty("external_item")
    public ExternalItem getExternalItem() {
        return externalItem;
    }

    /**
     * 
     * @param externalItem
     *     The external_item
     */
    @JsonProperty("external_item")
    public void setExternalItem(ExternalItem externalItem) {
        this.externalItem = externalItem;
    }

    /**
     * 
     * @return
     *     The approvalSetting
     */
    @JsonProperty("approval_setting")
    public String getApprovalSetting() {
        return approvalSetting;
    }

    /**
     * 
     * @param approvalSetting
     *     The approval_setting
     */
    @JsonProperty("approval_setting")
    public void setApprovalSetting(String approvalSetting) {
        this.approvalSetting = approvalSetting;
    }

    /**
     * 
     * @return
     *     The locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The company
     */
    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The messages
     */
    @JsonProperty("messages")
    public List<Object> getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    @JsonProperty("messages")
    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    /**
     * 
     * @return
     *     The pricing
     */
    @JsonProperty("pricing")
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * 
     * @param pricing
     *     The pricing
     */
    @JsonProperty("pricing")
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    /**
     * 
     * @return
     *     The reservations
     */
    @JsonProperty("reservations")
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * 
     * @param reservations
     *     The reservations
     */
    @JsonProperty("reservations")
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    /**
     * 
     * @return
     *     The currencyExchange
     */
    @JsonProperty("currency_exchange")
    public CurrencyExchange getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * 
     * @param currencyExchange
     *     The currency_exchange
     */
    @JsonProperty("currency_exchange")
    public void setCurrencyExchange(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    /**
     * 
     * @return
     *     The originDestinations
     */
    @JsonProperty("origin_destinations")
    public List<OriginDestination> getOriginDestinations() {
        return originDestinations;
    }

    /**
     * 
     * @param originDestinations
     *     The origin_destinations
     */
    @JsonProperty("origin_destinations")
    public void setOriginDestinations(List<OriginDestination> originDestinations) {
        this.originDestinations = originDestinations;
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
