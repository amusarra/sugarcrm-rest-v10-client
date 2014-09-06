Welcome to SugarCRM Rest v10 Java Client
======================

![travis ci](https://secure.travis-ci.org/amusarra/sugarcrm-rest-v10-client.png?branch=master)

This project was implemented a client to access the services Rest (v10) of SugarCRM. SugarCRM 7.x REST v10 API that using version 2.0 of OAuth protocol and in particular only supports the flow Resource Owner Password Credentials Grant. For more information about Resource Owner Password Credentials Grant flow goto at [Section 4.3 of RFC 6749 OAuth 2.0](http://tools.ietf.org/html/rfc6749#section-4.3)


     +----------+
     | Resource |
     |  Owner   |
     |          |
     +----------+
          v
          |    Resource Owner
         (A) Password Credentials
          |
          v
     +---------+                                  +---------------+
     |         |>--(B)---- Resource Owner ------->|               |
     |         |         Password Credentials     | Authorization |
     | Client  |                                  |     Server    |
     |         |<--(C)---- Access Token ---------<|               |
     |         |    (w/ Optional Refresh Token)   |               |
     +---------+                                  +---------------+


**Figure 1: Resource Owner Password Credentials Flow**


The flow illustrated in Figure 1 includes the following steps:

	   (A)  The resource owner provides the client with its username and
	        password.
	
	   (B)  The client requests an access token from the authorization
	        server's token endpoint by including the credentials received
	        from the resource owner.  When making the request, the client
	        authenticates with the authorization server.
	
	   (C)  The authorization server authenticates the client and validates
	        the resource owner credentials, and if valid, issues an access
	        token.

## 1. REST API SugarCRM: How Do I Login?
To authenticate you will need to use the **oauth2/token endpoint**. This endpoint will return an access_token that you will use to authenticate for the various other endpoints. This token must be passed to the other endpoints as the **oauth-token header** or the system will not authenticate the request. It is also important to note that if you are building an integration, you should create new **OAuth Key in Admin > OAuth Keys**. 

*This will prevent the integration from conflicting with existing sessions that might log users out of the system*. An example of authenticating can be found in the [/oauth2/token](http://support.sugarcrm.com/02_Documentation/04_Sugar_Developer/Sugar_Developer_Guide_7.2/70_API/Web_Services/20_Examples/v10/oauth2_token_POST) POST example.

![LinkedIn profile](http://www.dontesta.it/blog/wp-content/uploads/2014/09/SugarCRMOAuthAdminKeys.png)
**Figure 2: OAuth Key for Antonio Musarra's Blog**

For more information read [v10+ REST SugarCRM service documentation](http://support.sugarcrm.com/02_Documentation/04_Sugar_Developer/Sugar_Developer_Guide_7.2/70_API/Web_Services/10_REST/)

## 2. Why use Apache Oltu?

### Dead Simple

Who said OAuth was difficult? Configuring [Apache Oltu](https://oltu.apache.org) is __so easy your grandma can do it__! check it out:

```
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
```

The configuration parameters specific to OAuth SugarCRM is available on the file properties __sugarcrm2api.properties__ (see Listing 1 for example).

```
##
# SugarCRM API Connection properties
##
oauth.hostname=demo.sugaropencloud.eu
oauth.port=443
oauth.method=https
oauth.apiurl=/myInstance/rest/v10
oauth.platform=antonio_musarra_blog
```
**Listing 1: SugarCRM OAuth configuration params**

That **single line** (added newlines for readability) is the only thing you need to configure Apache Oltu with SugarCRM OAuth 2.0 API for example.

You can see a complete example at [OAuthSimpleClientTest.java](https://github.com/amusarra/sugarcrm-rest-v10-client/blob/master/src/main/java/it/dontesta/sugarcrm/webservices/client/OAuthSimpleClientTest.java)

## 3. More details
In this simple example, these operations are performed.

1. Authentication via OAuth 2 and retrieval of the access token
2. Retrieving account information via id
3. Inserting a new account
4. Retrieving data on personal preference

Following are the pieces of code that retrieve data account and place a new account on SugarCRM. In the example shown you can see how **I work with objects instead of dealing directly with JSON**.

To obtain the **POJO Java** from JSON returned by SugarCRM, I have used the project [jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo/wiki) (built via maven). The POJOs are created using the json file that the tool expects to find in the directory resources/json (you can see an example [Account.json](https://github.com/amusarra/sugarcrm-rest-v10-client/blob/master/src/main/resources/json/Account.json)).


```
			OAuthClientRequest clientRequest = new OAuthClientRequest.AuthenticationRequestBuilder(
					getFullApiUrl() + PROTECTED_ACCOUNTS_RESOURCE_URL + "/" + "c24c4069-7092-b95d-c040-523cc74a3d06")
					.setParameter(OAuth.OAUTH_TOKEN, oAuthResponse.getAccessToken())
					.buildQueryMessage();

			OAuthResourceResponse resourceResponse = oAuthClient.resource(
					clientRequest, OAuth.HttpMethod.GET,
					OAuthResourceResponse.class);

				ObjectMapper mapper = new ObjectMapper();
				Account account = mapper.readValue(resourceResponse.getBody(), Account.class);

```
**Listing 2: Retrieving account information via id**

```
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

			resourceResponse = oAuthClient.resource(
					clientRequest, OAuth.HttpMethod.POST,
					OAuthResourceResponse.class);

```
**Listing 3: Inserting a new account**

Once you have build the project (and configured paraments of your SugarCRM installation) via maven can run it via the command:

```
$ java -jar target/sugarcrm-rest-v10-client-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```
**Listing 4: Running the sample**


```
Try to get Access Token from https://demo.sugaropencloud.eu:443/$myInstance$/rest/v10/oauth2/token...
Access Token: 80226ced-c546-6f15-b78a-540a6b997749, Expires in: 3600

Try to request a protected resource: https://demo.sugaropencloud.eu:443/$myInstance$/rest/v10/Accounts/c24c4069-7092-b95d-c040-523cc74a3d06?oauth_token=80226ced-c546-6f15-b78a-540a6b997749

Response is OK. Content of response: 

####### ACCOUNT OBJECT ########
Account Id: c24c4069-7092-b95d-c040-523cc74a3d06
Account Name: MMM Mortuary Corp
Account Type: Customer
Account Description: 
####### END ACCOUNT OBJECT ########

```
**Listing 5: Output of running the example**

## About me

![LinkedIn profile](https://avatars0.githubusercontent.com/u/708110?v=2&s=140)

LinkedIn profile: [amusarra](http://www.linkedin.com/in/amusarra)

Follow me: [@antonio_musarra](http://twitter.com/antonio_musarra)
