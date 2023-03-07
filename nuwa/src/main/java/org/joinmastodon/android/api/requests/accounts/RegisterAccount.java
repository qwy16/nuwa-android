package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Token;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class RegisterAccount extends MastodonAPIRequest<Token> {
	public RegisterAccount(String username, String email, String password, String locale, String reason){
		super(HttpMethod.POST, "/accounts", Token.class);
		setRequestBody(new Body(username, email, password, locale, reason));
	}

	private static class Body{
		public String username, email, password, locale, reason;
		public boolean agreement=true;

		public Body(String username, String email, String password, String locale, String reason){
			this.username=username;
			this.email=email;
			this.password=password;
			this.locale=locale;
			this.reason=reason;
		}
	}
}
