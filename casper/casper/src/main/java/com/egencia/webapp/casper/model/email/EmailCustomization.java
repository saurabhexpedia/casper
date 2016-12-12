
package com.egencia.webapp.casper.model.email;

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
    "override_content"
})
public class EmailCustomization {

    @JsonProperty("override_content")
    private String overrideContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The overrideContent
     */
    @JsonProperty("override_content")
    public String getOverrideContent() {
        return overrideContent;
    }

    /**
     * 
     * @param overrideContent
     *     The override_content
     */
    @JsonProperty("override_content")
    public void setOverrideContent(String overrideContent) {
        this.overrideContent = overrideContent;
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
