
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
    "code",
    "type",
    "name",
    "city",
    "romanized_city",
    "metro",
    "terminal",
    "gate"
})
public class DepartureLocation {

    @JsonProperty("code")
    private String code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("romanized_city")
    private String romanizedCity;
    @JsonProperty("metro")
    private String metro;
    @JsonProperty("terminal")
    private String terminal;
    @JsonProperty("gate")
    private String gate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The romanizedCity
     */
    @JsonProperty("romanized_city")
    public String getRomanizedCity() {
        return romanizedCity;
    }

    /**
     * 
     * @param romanizedCity
     *     The romanized_city
     */
    @JsonProperty("romanized_city")
    public void setRomanizedCity(String romanizedCity) {
        this.romanizedCity = romanizedCity;
    }

    /**
     * 
     * @return
     *     The metro
     */
    @JsonProperty("metro")
    public String getMetro() {
        return metro;
    }

    /**
     * 
     * @param metro
     *     The metro
     */
    @JsonProperty("metro")
    public void setMetro(String metro) {
        this.metro = metro;
    }

    /**
     * 
     * @return
     *     The terminal
     */
    @JsonProperty("terminal")
    public String getTerminal() {
        return terminal;
    }

    /**
     * 
     * @param terminal
     *     The terminal
     */
    @JsonProperty("terminal")
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * 
     * @return
     *     The gate
     */
    @JsonProperty("gate")
    public String getGate() {
        return gate;
    }

    /**
     * 
     * @param gate
     *     The gate
     */
    @JsonProperty("gate")
    public void setGate(String gate) {
        this.gate = gate;
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
