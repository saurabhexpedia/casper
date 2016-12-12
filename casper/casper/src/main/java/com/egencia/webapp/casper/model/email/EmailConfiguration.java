
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
    "locale",
    "attach_pdf"
})
public class EmailConfiguration {

    @JsonProperty("locale")
    private String locale;
    @JsonProperty("attach_pdf")
    private Boolean attachPdf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The attachPdf
     */
    @JsonProperty("attach_pdf")
    public Boolean getAttachPdf() {
        return attachPdf;
    }

    /**
     * 
     * @param attachPdf
     *     The attach_pdf
     */
    @JsonProperty("attach_pdf")
    public void setAttachPdf(Boolean attachPdf) {
        this.attachPdf = attachPdf;
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
