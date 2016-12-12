
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
    "email_type",
    "notification_type",
    "trip_id",
    "transport_properties",
    "to",
    "email_configuration",
    "email_customization"
})
public class EmailRequest {

    @JsonProperty("email_type")
    private String emailType;
    @JsonProperty("notification_type")
    private String notificationType;
    @JsonProperty("trip_id")
    private String tripId;
    @JsonProperty("transport_properties")
    private TransportProperties transportProperties;
    @JsonProperty("to")
    private To to;
    @JsonProperty("email_configuration")
    private EmailConfiguration emailConfiguration;
    @JsonProperty("email_customization")
    private EmailCustomization emailCustomization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The emailType
     */
    @JsonProperty("email_type")
    public String getEmailType() {
        return emailType;
    }

    /**
     * 
     * @param emailType
     *     The email_type
     */
    @JsonProperty("email_type")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * 
     * @return
     *     The notificationType
     */
    @JsonProperty("notification_type")
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * 
     * @param notificationType
     *     The notification_type
     */
    @JsonProperty("notification_type")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * 
     * @return
     *     The tripId
     */
    @JsonProperty("trip_id")
    public String getTripId() {
        return tripId;
    }

    /**
     * 
     * @param tripId
     *     The trip_id
     */
    @JsonProperty("trip_id")
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    /**
     * 
     * @return
     *     The transportProperties
     */
    @JsonProperty("transport_properties")
    public TransportProperties getTransportProperties() {
        return transportProperties;
    }

    /**
     * 
     * @param transportProperties
     *     The transport_properties
     */
    @JsonProperty("transport_properties")
    public void setTransportProperties(TransportProperties transportProperties) {
        this.transportProperties = transportProperties;
    }

    /**
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(To to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The emailConfiguration
     */
    @JsonProperty("email_configuration")
    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * 
     * @param emailConfiguration
     *     The email_configuration
     */
    @JsonProperty("email_configuration")
    public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * 
     * @return
     *     The emailCustomization
     */
    @JsonProperty("email_customization")
    public EmailCustomization getEmailCustomization() {
        return emailCustomization;
    }

    /**
     * 
     * @param emailCustomization
     *     The email_customization
     */
    @JsonProperty("email_customization")
    public void setEmailCustomization(EmailCustomization emailCustomization) {
        this.emailCustomization = emailCustomization;
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
