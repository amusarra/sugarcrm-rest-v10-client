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

import java.util.HashMap;
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
    "email_address",
    "invalid_email",
    "opt_out",
    "primary_address",
    "reply_to_address"
})
public class Email {

    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("invalid_email")
    private Boolean invalidEmail;
    @JsonProperty("opt_out")
    private Boolean optOut;
    @JsonProperty("primary_address")
    private Boolean primaryAddress;
    @JsonProperty("reply_to_address")
    private Boolean replyToAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The emailAddress
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The email_address
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
     *     The optOut
     */
    @JsonProperty("opt_out")
    public Boolean getOptOut() {
        return optOut;
    }

    /**
     * 
     * @param optOut
     *     The opt_out
     */
    @JsonProperty("opt_out")
    public void setOptOut(Boolean optOut) {
        this.optOut = optOut;
    }

    /**
     * 
     * @return
     *     The primaryAddress
     */
    @JsonProperty("primary_address")
    public Boolean getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * 
     * @param primaryAddress
     *     The primary_address
     */
    @JsonProperty("primary_address")
    public void setPrimaryAddress(Boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    /**
     * 
     * @return
     *     The replyToAddress
     */
    @JsonProperty("reply_to_address")
    public Boolean getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * 
     * @param replyToAddress
     *     The reply_to_address
     */
    @JsonProperty("reply_to_address")
    public void setReplyToAddress(Boolean replyToAddress) {
        this.replyToAddress = replyToAddress;
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
