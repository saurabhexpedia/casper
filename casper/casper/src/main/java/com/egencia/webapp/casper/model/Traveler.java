
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
    "user_id",
    "company_id",
    "occasional_traveler"
})
public class Traveler {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("company_id")
    private Integer companyId;
    @JsonProperty("occasional_traveler")
    private Boolean occasionalTraveler;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The companyId
     */
    @JsonProperty("company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 
     * @param companyId
     *     The company_id
     */
    @JsonProperty("company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 
     * @return
     *     The occasionalTraveler
     */
    @JsonProperty("occasional_traveler")
    public Boolean getOccasionalTraveler() {
        return occasionalTraveler;
    }

    /**
     * 
     * @param occasionalTraveler
     *     The occasional_traveler
     */
    @JsonProperty("occasional_traveler")
    public void setOccasionalTraveler(Boolean occasionalTraveler) {
        this.occasionalTraveler = occasionalTraveler;
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
