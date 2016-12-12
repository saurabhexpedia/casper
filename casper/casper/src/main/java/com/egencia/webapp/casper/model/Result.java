
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
    "pricing",
    "origin_destination",
    "reservations",
    "selectable",
    "links",
    "filter_sort_tags",
    "reservation"
})
public class Result {

    @JsonProperty("pricing")
    private Pricing pricing;
    @JsonProperty("origin_destination")
    private OriginDestination originDestination;
    @JsonProperty("reservations")
    private List<Reservation> reservations = null;
    @JsonProperty("selectable")
    private Boolean selectable;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("filter_sort_tags")
    private FilterSortTags filterSortTags;
    @JsonProperty("reservation")
    private Reservation_ reservation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The originDestination
     */
    @JsonProperty("origin_destination")
    public OriginDestination getOriginDestination() {
        return originDestination;
    }

    /**
     * 
     * @param originDestination
     *     The origin_destination
     */
    @JsonProperty("origin_destination")
    public void setOriginDestination(OriginDestination originDestination) {
        this.originDestination = originDestination;
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
     *     The selectable
     */
    @JsonProperty("selectable")
    public Boolean getSelectable() {
        return selectable;
    }

    /**
     * 
     * @param selectable
     *     The selectable
     */
    @JsonProperty("selectable")
    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The filterSortTags
     */
    @JsonProperty("filter_sort_tags")
    public FilterSortTags getFilterSortTags() {
        return filterSortTags;
    }

    /**
     * 
     * @param filterSortTags
     *     The filter_sort_tags
     */
    @JsonProperty("filter_sort_tags")
    public void setFilterSortTags(FilterSortTags filterSortTags) {
        this.filterSortTags = filterSortTags;
    }

    /**
     * 
     * @return
     *     The reservation
     */
    @JsonProperty("reservation")
    public Reservation_ getReservation() {
        return reservation;
    }

    /**
     * 
     * @param reservation
     *     The reservation
     */
    @JsonProperty("reservation")
    public void setReservation(Reservation_ reservation) {
        this.reservation = reservation;
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
