/*
 * #%L
 * SugarCRM Rest v10 Example Client
 * %%
 * Copyright (C) 2014 Antonio Musarra's Blog
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package it.dontesta.sugarcrm.webservices.client.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "my_favorite",
    "following",
    "id",
    "name",
    "date_entered",
    "date_modified",
    "modified_user_id",
    "modified_by_name",
    "created_by",
    "created_by_name",
    "doc_owner",
    "user_favorites",
    "description",
    "deleted",
    "assigned_user_id",
    "assigned_user_name",
    "team_count",
    "team_name",
    "email",
    "email1",
    "email2",
    "invalid_email",
    "email_opt_out",
    "email_addresses_non_primary",
    "facebook",
    "twitter",
    "googleplus",
    "account_type",
    "industry",
    "annual_revenue",
    "phone_fax",
    "billing_address_street",
    "billing_address_street_2",
    "billing_address_street_3",
    "billing_address_street_4",
    "billing_address_city",
    "billing_address_state",
    "billing_address_postalcode",
    "billing_address_country",
    "rating",
    "phone_office",
    "phone_alternate",
    "website",
    "ownership",
    "employees",
    "ticker_symbol",
    "shipping_address_street",
    "shipping_address_street_2",
    "shipping_address_street_3",
    "shipping_address_street_4",
    "shipping_address_city",
    "shipping_address_state",
    "shipping_address_postalcode",
    "shipping_address_country",
    "parent_id",
    "sic_code",
    "duns_num",
    "parent_name",
    "campaign_id",
    "campaign_name",
    "_acl",
    "_module"
})
public class Account {

    @JsonProperty("my_favorite")
    private Boolean myFavorite;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("date_entered")
    private String dateEntered;
    @JsonProperty("date_modified")
    private String dateModified;
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
    @JsonProperty("modified_by_name")
    private String modifiedByName;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("created_by_name")
    private String createdByName;
    @JsonProperty("doc_owner")
    private String docOwner;
    @JsonProperty("user_favorites")
    private String userFavorites;
    @JsonProperty("description")
    private String description;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
    @JsonProperty("assigned_user_name")
    private String assignedUserName;
    @JsonProperty("team_count")
    private String teamCount;
    @JsonProperty("team_name")
    private List<TeamName> teamName = new ArrayList<TeamName>();
    @JsonProperty("email")
    private List<Email> email = new ArrayList<Email>();
    @JsonProperty("email1")
    private String email1;
    @JsonProperty("email2")
    private String email2;
    @JsonProperty("invalid_email")
    private Boolean invalidEmail;
    @JsonProperty("email_opt_out")
    private Boolean emailOptOut;
    @JsonProperty("email_addresses_non_primary")
    private String emailAddressesNonPrimary;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("googleplus")
    private String googleplus;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("annual_revenue")
    private String annualRevenue;
    @JsonProperty("phone_fax")
    private String phoneFax;
    @JsonProperty("billing_address_street")
    private String billingAddressStreet;
    @JsonProperty("billing_address_street_2")
    private String billingAddressStreet2;
    @JsonProperty("billing_address_street_3")
    private String billingAddressStreet3;
    @JsonProperty("billing_address_street_4")
    private String billingAddressStreet4;
    @JsonProperty("billing_address_city")
    private String billingAddressCity;
    @JsonProperty("billing_address_state")
    private String billingAddressState;
    @JsonProperty("billing_address_postalcode")
    private String billingAddressPostalcode;
    @JsonProperty("billing_address_country")
    private String billingAddressCountry;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("phone_office")
    private String phoneOffice;
    @JsonProperty("phone_alternate")
    private String phoneAlternate;
    @JsonProperty("website")
    private String website;
    @JsonProperty("ownership")
    private String ownership;
    @JsonProperty("employees")
    private String employees;
    @JsonProperty("ticker_symbol")
    private String tickerSymbol;
    @JsonProperty("shipping_address_street")
    private String shippingAddressStreet;
    @JsonProperty("shipping_address_street_2")
    private String shippingAddressStreet2;
    @JsonProperty("shipping_address_street_3")
    private String shippingAddressStreet3;
    @JsonProperty("shipping_address_street_4")
    private String shippingAddressStreet4;
    @JsonProperty("shipping_address_city")
    private String shippingAddressCity;
    @JsonProperty("shipping_address_state")
    private String shippingAddressState;
    @JsonProperty("shipping_address_postalcode")
    private String shippingAddressPostalcode;
    @JsonProperty("shipping_address_country")
    private String shippingAddressCountry;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("sic_code")
    private String sicCode;
    @JsonProperty("duns_num")
    private String dunsNum;
    @JsonProperty("parent_name")
    private String parentName;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("campaign_name")
    private String campaignName;
    @JsonProperty("_acl")
    private it.dontesta.sugarcrm.webservices.client.model.Acl Acl;
    @JsonProperty("_module")
    private String Module;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The myFavorite
     */
    @JsonProperty("my_favorite")
    public Boolean getMyFavorite() {
        return myFavorite;
    }

    /**
     * 
     * @param myFavorite
     *     The my_favorite
     */
    @JsonProperty("my_favorite")
    public void setMyFavorite(Boolean myFavorite) {
        this.myFavorite = myFavorite;
    }

    /**
     * 
     * @return
     *     The following
     */
    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    /**
     * 
     * @param following
     *     The following
     */
    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
     *     The dateEntered
     */
    @JsonProperty("date_entered")
    public String getDateEntered() {
        return dateEntered;
    }

    /**
     * 
     * @param dateEntered
     *     The date_entered
     */
    @JsonProperty("date_entered")
    public void setDateEntered(String dateEntered) {
        this.dateEntered = dateEntered;
    }

    /**
     * 
     * @return
     *     The dateModified
     */
    @JsonProperty("date_modified")
    public String getDateModified() {
        return dateModified;
    }

    /**
     * 
     * @param dateModified
     *     The date_modified
     */
    @JsonProperty("date_modified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * 
     * @return
     *     The modifiedUserId
     */
    @JsonProperty("modified_user_id")
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    /**
     * 
     * @param modifiedUserId
     *     The modified_user_id
     */
    @JsonProperty("modified_user_id")
    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    /**
     * 
     * @return
     *     The modifiedByName
     */
    @JsonProperty("modified_by_name")
    public String getModifiedByName() {
        return modifiedByName;
    }

    /**
     * 
     * @param modifiedByName
     *     The modified_by_name
     */
    @JsonProperty("modified_by_name")
    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    @JsonProperty("created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    @JsonProperty("created_by")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 
     * @return
     *     The createdByName
     */
    @JsonProperty("created_by_name")
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * 
     * @param createdByName
     *     The created_by_name
     */
    @JsonProperty("created_by_name")
    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    /**
     * 
     * @return
     *     The docOwner
     */
    @JsonProperty("doc_owner")
    public String getDocOwner() {
        return docOwner;
    }

    /**
     * 
     * @param docOwner
     *     The doc_owner
     */
    @JsonProperty("doc_owner")
    public void setDocOwner(String docOwner) {
        this.docOwner = docOwner;
    }

    /**
     * 
     * @return
     *     The userFavorites
     */
    @JsonProperty("user_favorites")
    public String getUserFavorites() {
        return userFavorites;
    }

    /**
     * 
     * @param userFavorites
     *     The user_favorites
     */
    @JsonProperty("user_favorites")
    public void setUserFavorites(String userFavorites) {
        this.userFavorites = userFavorites;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The deleted
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted
     *     The deleted
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 
     * @return
     *     The assignedUserId
     */
    @JsonProperty("assigned_user_id")
    public String getAssignedUserId() {
        return assignedUserId;
    }

    /**
     * 
     * @param assignedUserId
     *     The assigned_user_id
     */
    @JsonProperty("assigned_user_id")
    public void setAssignedUserId(String assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    /**
     * 
     * @return
     *     The assignedUserName
     */
    @JsonProperty("assigned_user_name")
    public String getAssignedUserName() {
        return assignedUserName;
    }

    /**
     * 
     * @param assignedUserName
     *     The assigned_user_name
     */
    @JsonProperty("assigned_user_name")
    public void setAssignedUserName(String assignedUserName) {
        this.assignedUserName = assignedUserName;
    }

    /**
     * 
     * @return
     *     The teamCount
     */
    @JsonProperty("team_count")
    public String getTeamCount() {
        return teamCount;
    }

    /**
     * 
     * @param teamCount
     *     The team_count
     */
    @JsonProperty("team_count")
    public void setTeamCount(String teamCount) {
        this.teamCount = teamCount;
    }

    /**
     * 
     * @return
     *     The teamName
     */
    @JsonProperty("team_name")
    public List<TeamName> getTeamName() {
        return teamName;
    }

    /**
     * 
     * @param teamName
     *     The team_name
     */
    @JsonProperty("team_name")
    public void setTeamName(List<TeamName> teamName) {
        this.teamName = teamName;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public List<Email> getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(List<Email> email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The email1
     */
    @JsonProperty("email1")
    public String getEmail1() {
        return email1;
    }

    /**
     * 
     * @param email1
     *     The email1
     */
    @JsonProperty("email1")
    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    /**
     * 
     * @return
     *     The email2
     */
    @JsonProperty("email2")
    public String getEmail2() {
        return email2;
    }

    /**
     * 
     * @param email2
     *     The email2
     */
    @JsonProperty("email2")
    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    /**
     * 
     * @return
     *     The invalidEmail
     */
    @JsonProperty("invalid_email")
    public Boolean getInvalidEmail() {
        return invalidEmail;
    }

    /**
     * 
     * @param invalidEmail
     *     The invalid_email
     */
    @JsonProperty("invalid_email")
    public void setInvalidEmail(Boolean invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    /**
     * 
     * @return
     *     The emailOptOut
     */
    @JsonProperty("email_opt_out")
    public Boolean getEmailOptOut() {
        return emailOptOut;
    }

    /**
     * 
     * @param emailOptOut
     *     The email_opt_out
     */
    @JsonProperty("email_opt_out")
    public void setEmailOptOut(Boolean emailOptOut) {
        this.emailOptOut = emailOptOut;
    }

    /**
     * 
     * @return
     *     The emailAddressesNonPrimary
     */
    @JsonProperty("email_addresses_non_primary")
    public String getEmailAddressesNonPrimary() {
        return emailAddressesNonPrimary;
    }

    /**
     * 
     * @param emailAddressesNonPrimary
     *     The email_addresses_non_primary
     */
    @JsonProperty("email_addresses_non_primary")
    public void setEmailAddressesNonPrimary(String emailAddressesNonPrimary) {
        this.emailAddressesNonPrimary = emailAddressesNonPrimary;
    }

    /**
     * 
     * @return
     *     The facebook
     */
    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    /**
     * 
     * @param facebook
     *     The facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * 
     * @return
     *     The googleplus
     */
    @JsonProperty("googleplus")
    public String getGoogleplus() {
        return googleplus;
    }

    /**
     * 
     * @param googleplus
     *     The googleplus
     */
    @JsonProperty("googleplus")
    public void setGoogleplus(String googleplus) {
        this.googleplus = googleplus;
    }

    /**
     * 
     * @return
     *     The accountType
     */
    @JsonProperty("account_type")
    public String getAccountType() {
        return accountType;
    }

    /**
     * 
     * @param accountType
     *     The account_type
     */
    @JsonProperty("account_type")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 
     * @return
     *     The industry
     */
    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    /**
     * 
     * @param industry
     *     The industry
     */
    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 
     * @return
     *     The annualRevenue
     */
    @JsonProperty("annual_revenue")
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * 
     * @param annualRevenue
     *     The annual_revenue
     */
    @JsonProperty("annual_revenue")
    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * 
     * @return
     *     The phoneFax
     */
    @JsonProperty("phone_fax")
    public String getPhoneFax() {
        return phoneFax;
    }

    /**
     * 
     * @param phoneFax
     *     The phone_fax
     */
    @JsonProperty("phone_fax")
    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
    }

    /**
     * 
     * @return
     *     The billingAddressStreet
     */
    @JsonProperty("billing_address_street")
    public String getBillingAddressStreet() {
        return billingAddressStreet;
    }

    /**
     * 
     * @param billingAddressStreet
     *     The billing_address_street
     */
    @JsonProperty("billing_address_street")
    public void setBillingAddressStreet(String billingAddressStreet) {
        this.billingAddressStreet = billingAddressStreet;
    }

    /**
     * 
     * @return
     *     The billingAddressStreet2
     */
    @JsonProperty("billing_address_street_2")
    public String getBillingAddressStreet2() {
        return billingAddressStreet2;
    }

    /**
     * 
     * @param billingAddressStreet2
     *     The billing_address_street_2
     */
    @JsonProperty("billing_address_street_2")
    public void setBillingAddressStreet2(String billingAddressStreet2) {
        this.billingAddressStreet2 = billingAddressStreet2;
    }

    /**
     * 
     * @return
     *     The billingAddressStreet3
     */
    @JsonProperty("billing_address_street_3")
    public String getBillingAddressStreet3() {
        return billingAddressStreet3;
    }

    /**
     * 
     * @param billingAddressStreet3
     *     The billing_address_street_3
     */
    @JsonProperty("billing_address_street_3")
    public void setBillingAddressStreet3(String billingAddressStreet3) {
        this.billingAddressStreet3 = billingAddressStreet3;
    }

    /**
     * 
     * @return
     *     The billingAddressStreet4
     */
    @JsonProperty("billing_address_street_4")
    public String getBillingAddressStreet4() {
        return billingAddressStreet4;
    }

    /**
     * 
     * @param billingAddressStreet4
     *     The billing_address_street_4
     */
    @JsonProperty("billing_address_street_4")
    public void setBillingAddressStreet4(String billingAddressStreet4) {
        this.billingAddressStreet4 = billingAddressStreet4;
    }

    /**
     * 
     * @return
     *     The billingAddressCity
     */
    @JsonProperty("billing_address_city")
    public String getBillingAddressCity() {
        return billingAddressCity;
    }

    /**
     * 
     * @param billingAddressCity
     *     The billing_address_city
     */
    @JsonProperty("billing_address_city")
    public void setBillingAddressCity(String billingAddressCity) {
        this.billingAddressCity = billingAddressCity;
    }

    /**
     * 
     * @return
     *     The billingAddressState
     */
    @JsonProperty("billing_address_state")
    public String getBillingAddressState() {
        return billingAddressState;
    }

    /**
     * 
     * @param billingAddressState
     *     The billing_address_state
     */
    @JsonProperty("billing_address_state")
    public void setBillingAddressState(String billingAddressState) {
        this.billingAddressState = billingAddressState;
    }

    /**
     * 
     * @return
     *     The billingAddressPostalcode
     */
    @JsonProperty("billing_address_postalcode")
    public String getBillingAddressPostalcode() {
        return billingAddressPostalcode;
    }

    /**
     * 
     * @param billingAddressPostalcode
     *     The billing_address_postalcode
     */
    @JsonProperty("billing_address_postalcode")
    public void setBillingAddressPostalcode(String billingAddressPostalcode) {
        this.billingAddressPostalcode = billingAddressPostalcode;
    }

    /**
     * 
     * @return
     *     The billingAddressCountry
     */
    @JsonProperty("billing_address_country")
    public String getBillingAddressCountry() {
        return billingAddressCountry;
    }

    /**
     * 
     * @param billingAddressCountry
     *     The billing_address_country
     */
    @JsonProperty("billing_address_country")
    public void setBillingAddressCountry(String billingAddressCountry) {
        this.billingAddressCountry = billingAddressCountry;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The phoneOffice
     */
    @JsonProperty("phone_office")
    public String getPhoneOffice() {
        return phoneOffice;
    }

    /**
     * 
     * @param phoneOffice
     *     The phone_office
     */
    @JsonProperty("phone_office")
    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    /**
     * 
     * @return
     *     The phoneAlternate
     */
    @JsonProperty("phone_alternate")
    public String getPhoneAlternate() {
        return phoneAlternate;
    }

    /**
     * 
     * @param phoneAlternate
     *     The phone_alternate
     */
    @JsonProperty("phone_alternate")
    public void setPhoneAlternate(String phoneAlternate) {
        this.phoneAlternate = phoneAlternate;
    }

    /**
     * 
     * @return
     *     The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 
     * @return
     *     The ownership
     */
    @JsonProperty("ownership")
    public String getOwnership() {
        return ownership;
    }

    /**
     * 
     * @param ownership
     *     The ownership
     */
    @JsonProperty("ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    /**
     * 
     * @return
     *     The employees
     */
    @JsonProperty("employees")
    public String getEmployees() {
        return employees;
    }

    /**
     * 
     * @param employees
     *     The employees
     */
    @JsonProperty("employees")
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    /**
     * 
     * @return
     *     The tickerSymbol
     */
    @JsonProperty("ticker_symbol")
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * 
     * @param tickerSymbol
     *     The ticker_symbol
     */
    @JsonProperty("ticker_symbol")
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    /**
     * 
     * @return
     *     The shippingAddressStreet
     */
    @JsonProperty("shipping_address_street")
    public String getShippingAddressStreet() {
        return shippingAddressStreet;
    }

    /**
     * 
     * @param shippingAddressStreet
     *     The shipping_address_street
     */
    @JsonProperty("shipping_address_street")
    public void setShippingAddressStreet(String shippingAddressStreet) {
        this.shippingAddressStreet = shippingAddressStreet;
    }

    /**
     * 
     * @return
     *     The shippingAddressStreet2
     */
    @JsonProperty("shipping_address_street_2")
    public String getShippingAddressStreet2() {
        return shippingAddressStreet2;
    }

    /**
     * 
     * @param shippingAddressStreet2
     *     The shipping_address_street_2
     */
    @JsonProperty("shipping_address_street_2")
    public void setShippingAddressStreet2(String shippingAddressStreet2) {
        this.shippingAddressStreet2 = shippingAddressStreet2;
    }

    /**
     * 
     * @return
     *     The shippingAddressStreet3
     */
    @JsonProperty("shipping_address_street_3")
    public String getShippingAddressStreet3() {
        return shippingAddressStreet3;
    }

    /**
     * 
     * @param shippingAddressStreet3
     *     The shipping_address_street_3
     */
    @JsonProperty("shipping_address_street_3")
    public void setShippingAddressStreet3(String shippingAddressStreet3) {
        this.shippingAddressStreet3 = shippingAddressStreet3;
    }

    /**
     * 
     * @return
     *     The shippingAddressStreet4
     */
    @JsonProperty("shipping_address_street_4")
    public String getShippingAddressStreet4() {
        return shippingAddressStreet4;
    }

    /**
     * 
     * @param shippingAddressStreet4
     *     The shipping_address_street_4
     */
    @JsonProperty("shipping_address_street_4")
    public void setShippingAddressStreet4(String shippingAddressStreet4) {
        this.shippingAddressStreet4 = shippingAddressStreet4;
    }

    /**
     * 
     * @return
     *     The shippingAddressCity
     */
    @JsonProperty("shipping_address_city")
    public String getShippingAddressCity() {
        return shippingAddressCity;
    }

    /**
     * 
     * @param shippingAddressCity
     *     The shipping_address_city
     */
    @JsonProperty("shipping_address_city")
    public void setShippingAddressCity(String shippingAddressCity) {
        this.shippingAddressCity = shippingAddressCity;
    }

    /**
     * 
     * @return
     *     The shippingAddressState
     */
    @JsonProperty("shipping_address_state")
    public String getShippingAddressState() {
        return shippingAddressState;
    }

    /**
     * 
     * @param shippingAddressState
     *     The shipping_address_state
     */
    @JsonProperty("shipping_address_state")
    public void setShippingAddressState(String shippingAddressState) {
        this.shippingAddressState = shippingAddressState;
    }

    /**
     * 
     * @return
     *     The shippingAddressPostalcode
     */
    @JsonProperty("shipping_address_postalcode")
    public String getShippingAddressPostalcode() {
        return shippingAddressPostalcode;
    }

    /**
     * 
     * @param shippingAddressPostalcode
     *     The shipping_address_postalcode
     */
    @JsonProperty("shipping_address_postalcode")
    public void setShippingAddressPostalcode(String shippingAddressPostalcode) {
        this.shippingAddressPostalcode = shippingAddressPostalcode;
    }

    /**
     * 
     * @return
     *     The shippingAddressCountry
     */
    @JsonProperty("shipping_address_country")
    public String getShippingAddressCountry() {
        return shippingAddressCountry;
    }

    /**
     * 
     * @param shippingAddressCountry
     *     The shipping_address_country
     */
    @JsonProperty("shipping_address_country")
    public void setShippingAddressCountry(String shippingAddressCountry) {
        this.shippingAddressCountry = shippingAddressCountry;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parent_id
     */
    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The sicCode
     */
    @JsonProperty("sic_code")
    public String getSicCode() {
        return sicCode;
    }

    /**
     * 
     * @param sicCode
     *     The sic_code
     */
    @JsonProperty("sic_code")
    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    /**
     * 
     * @return
     *     The dunsNum
     */
    @JsonProperty("duns_num")
    public String getDunsNum() {
        return dunsNum;
    }

    /**
     * 
     * @param dunsNum
     *     The duns_num
     */
    @JsonProperty("duns_num")
    public void setDunsNum(String dunsNum) {
        this.dunsNum = dunsNum;
    }

    /**
     * 
     * @return
     *     The parentName
     */
    @JsonProperty("parent_name")
    public String getParentName() {
        return parentName;
    }

    /**
     * 
     * @param parentName
     *     The parent_name
     */
    @JsonProperty("parent_name")
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * 
     * @return
     *     The campaignId
     */
    @JsonProperty("campaign_id")
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * 
     * @param campaignId
     *     The campaign_id
     */
    @JsonProperty("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * 
     * @return
     *     The campaignName
     */
    @JsonProperty("campaign_name")
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * 
     * @param campaignName
     *     The campaign_name
     */
    @JsonProperty("campaign_name")
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * 
     * @return
     *     The Acl
     */
    @JsonProperty("_acl")
    public it.dontesta.sugarcrm.webservices.client.model.Acl getAcl() {
        return Acl;
    }

    /**
     * 
     * @param Acl
     *     The _acl
     */
    @JsonProperty("_acl")
    public void setAcl(it.dontesta.sugarcrm.webservices.client.model.Acl Acl) {
        this.Acl = Acl;
    }

    /**
     * 
     * @return
     *     The Module
     */
    @JsonProperty("_module")
    public String getModule() {
        return Module;
    }

    /**
     * 
     * @param Module
     *     The _module
     */
    @JsonProperty("_module")
    public void setModule(String Module) {
        this.Module = Module;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
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
