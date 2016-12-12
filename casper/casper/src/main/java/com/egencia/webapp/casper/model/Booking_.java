
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
    "provider",
    "provider_details"
})
public class Booking_ {

    @JsonProperty("provider")
    private String provider;
    @JsonProperty("provider_details")
    private ProviderDetails_ providerDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The provider
     */
    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * 
     * @return
     *     The providerDetails
     */
    @JsonProperty("provider_details")
    public ProviderDetails_ getProviderDetails() {
        return providerDetails;
    }

    /**
     * 
     * @param providerDetails
     *     The provider_details
     */
    @JsonProperty("provider_details")
    public void setProviderDetails(ProviderDetails_ providerDetails) {
        this.providerDetails = providerDetails;
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
