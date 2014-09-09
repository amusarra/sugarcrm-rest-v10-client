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
/**
 * 
 */
package it.dontesta.sugarcrm.webservices.client.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)

/**
 * @author amusarra
 *
 */
public class Accounts {

    @JsonProperty("next_offset")
	private long nextOffset;

    @JsonProperty("records")
    private List<Account> accounts = new ArrayList<Account>();
	
    /**
	 * @return the nextOffset
	 */
    @JsonProperty("next_offset")
	public long getNextOffset() {
		return nextOffset;
	}

	/**
	 * @param nextOffset the nextOffset to set
	 */
    @JsonProperty("next_offset")
	public void setNextOffset(long nextOffset) {
		this.nextOffset = nextOffset;
	}

	/**
	 * @return the accounts
	 */
    @JsonProperty("records")
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
    @JsonProperty("records")
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
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
}
