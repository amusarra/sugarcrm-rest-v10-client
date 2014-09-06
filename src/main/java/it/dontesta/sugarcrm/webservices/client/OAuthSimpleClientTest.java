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
package it.dontesta.sugarcrm.webservices.client;

import it.dontesta.sugarcrm.webservices.client.model.Account;
import it.dontesta.sugarcrm.webservices.client.model.Email;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthRuntimeException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

/**
 * Simple example that shows how to get OAuth 2.0 access token from SugarCRM
 * using Amber OAuth 2.0 library
 * 
 * @author amusarra
 * 
 */
public class OAuthSimpleClientTest {

	private static final String ACCESS_TOKEN_RESOURCE = "%s://%s:%s%s/oauth2/token";
	private static final String DEFAULT_ROOT_API_RESOURCE = "%s://%s:%s%s";
	private static final String DEFAULT_API_RESOURCE = "/rest/v10";
	private static final String DEFAULT_HOST = "demo.sugarcrm.com";
	private static final String DEFAULT_METHOD = "https";
	private static final String DEFAULT_PLATFORM = "base";

	private static final String DEFAULT_PORT = "443";
	private static String apiUrl;
	private static String host;
	private static String method;
	private static String platform;
	private static String port;

	/**
	 * @return the apiUrl
	 */
	public static String getApiUrl() {
		return apiUrl;
	}

	/**
	 * @return the host
	 */
	public static String getHost() {
		return host;
	}

	/**
	 * @return the method
	 */
	public static String getMethod() {
		return method;
	}

	/**
	 * @return the platform
	 */
	public static String getPlatform() {
		return platform;
	}

	/**
	 * @return the port
	 */
	public static String getPort() {
		return port;
	}

	/**
	 * The values given above are used by default. The file
	 * 'sugarcrm2api.properties' must be in the classpath
	 * 
	 * @return
	 */
	protected static Properties loadProperties() {
		final Properties prop = new Properties();
		try {
			final InputStream propertiesStream = OAuthSimpleClientTest.class
					.getResourceAsStream("/sugarcrm2api.properties");
			if (propertiesStream != null)
				prop.load(propertiesStream);
		} catch (IOException e) {
			throw new OAuthRuntimeException("Error while reading properties file", e);
		}
		return prop;
	}

	public static void main(String[] args) throws OAuthSystemException,
			IOException {

		try {

			final String PROTECTED_ACCOUNTS_RESOURCE_URL = "/Accounts";
			final String PROTECTED_ME_PREFERENCES_RESOURCE_URL = "/me/preferences?oauth_token=";

			// Replace these with your own api key and secret
			final String API_KEY = "antonio_musarra_blog";
			final String API_SECRET = "antonio_musarra_blog";
			final String API_USERNAME = "admin";
			final String API_PASSWORD = "Admin2014";
			final String REQUEST_PARAM_DEFAULT_PLATFORM = "platform";

			System.out.println("Try to get Access Token from "
					+ getAccessTokenEndpoint()
					+ "...");

			OAuthClientRequest request = OAuthClientRequest
					.tokenLocation(getAccessTokenEndpoint())
					.setGrantType(GrantType.PASSWORD)
					.setClientId(API_KEY)
					.setClientSecret(API_SECRET)
					.setUsername(API_USERNAME)
					.setPassword(API_PASSWORD)
					.setParameter(REQUEST_PARAM_DEFAULT_PLATFORM, getPlatform())
					.buildBodyMessage();

			OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
			OAuthJSONAccessTokenResponse oAuthResponse = oAuthClient.accessToken(request);

			System.out.println("Access Token: "
					+ oAuthResponse.getAccessToken() + ", Expires in: "
					+ oAuthResponse.getExpiresIn());
			
			OAuthClientRequest clientRequest = new OAuthClientRequest.AuthenticationRequestBuilder(
					getFullApiUrl() + PROTECTED_ACCOUNTS_RESOURCE_URL + "/" + "c24c4069-7092-b95d-c040-523cc74a3d06")
					.setParameter(OAuth.OAUTH_TOKEN, oAuthResponse.getAccessToken())
					.buildQueryMessage();

			System.out.println("Try to request a protected resource: "
					+ clientRequest.getLocationUri());
			
			OAuthResourceResponse resourceResponse = oAuthClient.resource(
					clientRequest, OAuth.HttpMethod.GET,
					OAuthResourceResponse.class);

			if (resourceResponse.getResponseCode() == 200) {
				System.out.println("Response is OK. Content of response: ");

				ObjectMapper mapper = new ObjectMapper();
				Account account = mapper.readValue(resourceResponse.getBody(), Account.class);

				System.out.println("####### ACCOUNT OBJECT ########");
				System.out.println("Account Id: " + account.getId());
				System.out.println("Account Name: " + account.getName());
				System.out.println("Account Type: " + account.getAccountType());
				System.out.println("Account Description: " + account.getDescription());
				System.out.println("####### END ACCOUNT OBJECT ########");

				System.out.println("####### ACCOUNT JSON RESPONSE ########");
				System.out.println(new GsonBuilder()
						.setPrettyPrinting()
						.create()
						.toJson(new JsonParser().parse(resourceResponse
								.getBody())));
				System.out.println("####### END ACCOUNT JSON RESPONSE ########");
			} else {
				System.err.println("Response is KO with HTTP status code " + resourceResponse.getResponseCode());
				System.err.println(resourceResponse.getBody());
			}

			
			clientRequest = new OAuthClientRequest.AuthenticationRequestBuilder(
					getFullApiUrl() + PROTECTED_ME_PREFERENCES_RESOURCE_URL)
					.setParameter(OAuth.OAUTH_TOKEN, oAuthResponse.getAccessToken())
					.buildQueryMessage();

			System.out.println("Try to request a protected resource: "
					+ clientRequest.getLocationUri());
			
			resourceResponse = oAuthClient.resource(
					clientRequest, OAuth.HttpMethod.GET,
					OAuthResourceResponse.class);
		
			if (resourceResponse.getResponseCode() == 200) {
				System.out.println("Response is OK. Content of response: ");

				System.out.println("####### MY PREFERENCES JSON RESPONSE ########");
				System.out.println(new GsonBuilder()
						.setPrettyPrinting()
						.create()
						.toJson(new JsonParser().parse(resourceResponse
								.getBody())));
				System.out.println("####### END MY PREFERENCES JSON RESPONSE ########");
			} else {
				System.err.println("Response is KO with HTTP status code " + resourceResponse.getResponseCode());
				System.err.println(resourceResponse.getBody());
			}

			Account newAccountObject = new Account();
			newAccountObject.setName("Antonio Musarra's Blog");
			newAccountObject.setAccountType("Customer");
			newAccountObject.setDescription("New account inserted by java rest client");
			
			List<Email> emailList = new ArrayList<Email>();
			Email email = new Email();
			email.setEmailAddress("antonio.musarra@shirus.it");
			email.setPrimaryAddress(true);
			emailList.add(email);
			newAccountObject.setEmail(emailList);

			clientRequest = new OAuthClientRequest.AuthenticationRequestBuilder(
					getFullApiUrl() + PROTECTED_ACCOUNTS_RESOURCE_URL)
					.setParameter(OAuth.OAUTH_TOKEN, oAuthResponse.getAccessToken())
					.buildQueryMessage();
			clientRequest.setBody(new ObjectMapper().writer().writeValueAsString(newAccountObject));
			
			System.out.println("Try to request a protected resource: "
					+ clientRequest.getLocationUri());
			
			resourceResponse = oAuthClient.resource(
					clientRequest, OAuth.HttpMethod.POST,
					OAuthResourceResponse.class);

			if (resourceResponse.getResponseCode() == 200) {
				System.out.println("Response is OK. Content of response: ");

				ObjectMapper mapper = new ObjectMapper();
				Account account = mapper.readValue(resourceResponse.getBody(), Account.class);

				System.out.println("####### ACCOUNT OBJECT INSERTED ########");
				System.out.println("Account Id: " + account.getId());
				System.out.println("Account Name: " + account.getName());
				System.out.println("Account Type: " + account.getAccountType());
				System.out.println("Account Description: " + account.getDescription());
				System.out.println("####### END ACCOUNT OBJECT INSERTED ########");

				System.out.println("####### ACCOUNT JSON RESPONSE ########");
				System.out.println(new GsonBuilder()
						.setPrettyPrinting()
						.create()
						.toJson(new JsonParser().parse(resourceResponse
								.getBody())));
				System.out.println("####### END ACCOUNT JSON RESPONSE ########");
			} else {
				System.err.println("Response is KO with HTTP status code " + resourceResponse.getResponseCode());
				System.err.println(resourceResponse.getBody());
			}

		} catch (OAuthProblemException e) {
			System.out.println("OAuth error: " + e.getError());
			System.out
					.println("OAuth error description: " + e.getDescription());
		}
	}

	/**
	 * 
	 * @return
	 */
	public static String getFullApiUrl() {
		return String.format(DEFAULT_ROOT_API_RESOURCE, getMethod(), getHost(),
				getPort(), getApiUrl());
	}
	
	/**
	 * @param apiUrl
	 *            the apiUrl to set
	 */
	public static void setApiUrl(String apiUrl) {
		OAuthSimpleClientTest.apiUrl = apiUrl;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public static void setHost(String host) {
		OAuthSimpleClientTest.host = host;
	}

	/**
	 * @param method
	 *            the method to set
	 */
	public static void setMethod(String method) {
		OAuthSimpleClientTest.method = method;
	}

	/**
	 * @param platform
	 *            the platform to set
	 */
	public static void setPlatform(String platform) {
		OAuthSimpleClientTest.platform = platform;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public static void setPort(String port) {
		OAuthSimpleClientTest.port = port;
	}

	public static String getAccessTokenEndpoint() {
		setConnectionParams();
		return String.format(ACCESS_TOKEN_RESOURCE, getMethod(), getHost(),
				getPort(), getApiUrl());
	}

	/**
	 * Loads the host, port, and method from the properties file the first time
	 * this method is run.
	 */
	private static void setConnectionParams() {
		if (null == getHost() || null == getPort() || null == getPort()) {
			Properties prop = loadProperties();
			setHost(prop.getProperty("oauth.hostname", DEFAULT_HOST));
			setPort(prop.getProperty("oauth.port", DEFAULT_PORT));
			setMethod(prop.getProperty("oauth.method", DEFAULT_METHOD));
			setApiUrl(prop.getProperty("oauth.apiurl", DEFAULT_API_RESOURCE));
			setPlatform(prop.getProperty("oauth.platform", DEFAULT_PLATFORM));
		}
	}
}
