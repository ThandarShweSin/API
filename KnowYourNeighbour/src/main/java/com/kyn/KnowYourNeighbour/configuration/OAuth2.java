package com.kyn.KnowYourNeighbour.configuration;

import java.util.ArrayList;
import java.util.List;

public class OAuth2 {

	private List<String> authorizedRedirectUris = new ArrayList<String>();

	public List<String> getAuthorizedRedirectUris() {
		return authorizedRedirectUris;
	}

	public void setAuthorizedRedirectUris(List<String> authorizedRedirectUris) {
		this.authorizedRedirectUris = authorizedRedirectUris;
	}
	
	
}
