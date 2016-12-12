
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
    "segments",
    "duration"
})
public class OriginDestination {

    @JsonProperty("segments")
    private List<Segment> segments = null;
    @JsonProperty("duration")
    private Integer duration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The segments
     */
    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * 
     * @param segments
     *     The segments
     */
    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
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
