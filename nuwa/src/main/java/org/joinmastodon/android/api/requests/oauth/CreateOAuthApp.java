package org.joinmastodon.android.api.requests.oauth;

import com.nuwasocial.android.model.Application;

import org.joinmastodon.android.api.MastodonAPIRequest;
import org.joinmastodon.android.api.session.AccountSessionManager;

public class CreateOAuthApp extends MastodonAPIRequest<Application> {
	public CreateOAuthApp(){
		super(HttpMethod.POST, "/apps", Application.class);
		setRequestBody(new Request());
	}

	private static class Request{
		public String clientName="Mastodon for Android";
		public String redirectUris= AccountSessionManager.REDIRECT_URI;
		public String scopes= AccountSessionManager.SCOPE;
		public String website="https://app.joinmastodon.org/android";
	}
}
