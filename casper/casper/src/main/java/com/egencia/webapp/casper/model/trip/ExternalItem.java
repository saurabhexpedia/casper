
package com.egencia.webapp.casper.model.trip;

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
    "external_system",
    "group_id",
    "line_id"
})
public class ExternalItem {

    @JsonProperty("external_system")
    private String externalSystem;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("line_id")
    private String lineId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The externalSystem
     */
    @JsonProperty("external_system")
    public String getExternalSystem() {
        return externalSystem;
    }

    /**
     * 
     * @param externalSystem
     *     The external_system
     */
    @JsonProperty("external_system")
    public void setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The group_id
     */
    @JsonProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The lineId
     */
    @JsonProperty("line_id")
    public String getLineId() {
        return lineId;
    }

    /**
     * 
     * @param lineId
     *     The line_id
     */
    @JsonProperty("line_id")
    public void setLineId(String lineId) {
        this.lineId = lineId;
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
