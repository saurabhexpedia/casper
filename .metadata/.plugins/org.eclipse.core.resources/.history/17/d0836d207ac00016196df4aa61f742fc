
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
    "type",
    "provider",
    "booked_by",
    "main_contact"
})
public class Booking {

    @JsonProperty("type")
    private String type;
    @JsonProperty("provider")
    private String provider;
    @JsonProperty("booked_by")
    private BookedBy bookedBy;
    @JsonProperty("main_contact")
    private MainContact mainContact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

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
     *     The bookedBy
     */
    @JsonProperty("booked_by")
    public BookedBy getBookedBy() {
        return bookedBy;
    }

    /**
     * 
     * @param bookedBy
     *     The booked_by
     */
    @JsonProperty("booked_by")
    public void setBookedBy(BookedBy bookedBy) {
        this.bookedBy = bookedBy;
    }

    /**
     * 
     * @return
     *     The mainContact
     */
    @JsonProperty("main_contact")
    public MainContact getMainContact() {
        return mainContact;
    }

    /**
     * 
     * @param mainContact
     *     The main_contact
     */
    @JsonProperty("main_contact")
    public void setMainContact(MainContact mainContact) {
        this.mainContact = mainContact;
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
