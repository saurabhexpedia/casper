
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
    "results",
    "filters",
    "bounds"
})
public class SearchResponse {

    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("bounds")
    private List<Bound> bounds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The results
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The filters
     */
    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    /**
     * 
     * @param filters
     *     The filters
     */
    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * 
     * @return
     *     The bounds
     */
    @JsonProperty("bounds")
    public List<Bound> getBounds() {
        return bounds;
    }

    /**
     * 
     * @param bounds
     *     The bounds
     */
    @JsonProperty("bounds")
    public void setBounds(List<Bound> bounds) {
        this.bounds = bounds;
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
