
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
    "PRODUCT_DETAILS_CONSTRUCT"
})
public class ProviderDetails {

    @JsonProperty("PRODUCT_DETAILS_CONSTRUCT")
    private String pRODUCTDETAILSCONSTRUCT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pRODUCTDETAILSCONSTRUCT
     */
    @JsonProperty("PRODUCT_DETAILS_CONSTRUCT")
    public String getPRODUCTDETAILSCONSTRUCT() {
        return pRODUCTDETAILSCONSTRUCT;
    }

    /**
     * 
     * @param pRODUCTDETAILSCONSTRUCT
     *     The PRODUCT_DETAILS_CONSTRUCT
     */
    @JsonProperty("PRODUCT_DETAILS_CONSTRUCT")
    public void setPRODUCTDETAILSCONSTRUCT(String pRODUCTDETAILSCONSTRUCT) {
        this.pRODUCTDETAILSCONSTRUCT = pRODUCTDETAILSCONSTRUCT;
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
