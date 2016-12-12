
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
    "user_id",
    "company_id",
    "main_traveler",
    "occasional_traveler",
    "first_name",
    "last_name",
    "romanized_first_name",
    "romanized_last_name",
    "email",
    "customer_care"
})
public class Traveler {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("company_id")
    private Integer companyId;
    @JsonProperty("main_traveler")
    private Boolean mainTraveler;
    @JsonProperty("occasional_traveler")
    private Boolean occasionalTraveler;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("romanized_first_name")
    private String romanizedFirstName;
    @JsonProperty("romanized_last_name")
    private String romanizedLastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("customer_care")
    private CustomerCare customerCare;
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
     *     The mainTraveler
     */
    @JsonProperty("main_traveler")
    public Boolean getMainTraveler() {
        return mainTraveler;
    }

    /**
     * 
     * @param mainTraveler
     *     The main_traveler
     */
    @JsonProperty("main_traveler")
    public void setMainTraveler(Boolean mainTraveler) {
        this.mainTraveler = mainTraveler;
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

    /**
     * 
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The romanizedFirstName
     */
    @JsonProperty("romanized_first_name")
    public String getRomanizedFirstName() {
        return romanizedFirstName;
    }

    /**
     * 
     * @param romanizedFirstName
     *     The romanized_first_name
     */
    @JsonProperty("romanized_first_name")
    public void setRomanizedFirstName(String romanizedFirstName) {
        this.romanizedFirstName = romanizedFirstName;
    }

    /**
     * 
     * @return
     *     The romanizedLastName
     */
    @JsonProperty("romanized_last_name")
    public String getRomanizedLastName() {
        return romanizedLastName;
    }

    /**
     * 
     * @param romanizedLastName
     *     The romanized_last_name
     */
    @JsonProperty("romanized_last_name")
    public void setRomanizedLastName(String romanizedLastName) {
        this.romanizedLastName = romanizedLastName;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The customerCare
     */
    @JsonProperty("customer_care")
    public CustomerCare getCustomerCare() {
        return customerCare;
    }

    /**
     * 
     * @param customerCare
     *     The customer_care
     */
    @JsonProperty("customer_care")
    public void setCustomerCare(CustomerCare customerCare) {
        this.customerCare = customerCare;
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
