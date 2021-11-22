package com.kyn.KnowYourNeighbour.oauth2users;


import java.util.Map;

import com.kyn.KnowYourNeighbour.dao.AuthProvider;
import com.kyn.KnowYourNeighbour.exception.OAuthAuthenticationException;





public class OAuth2UsersFactory {
	public static OAuth2Users getInstance(String registerId, Map<String, Object> attributes) throws OAuthAuthenticationException {
		if(registerId.equalsIgnoreCase(AuthProvider.google.toString())) {
			return new GoogleOAuth2Users(attributes);
		}
		else {
			throw new OAuthAuthenticationException("Login with" + registerId + "is not supported yet!!!");
		}
	}
}