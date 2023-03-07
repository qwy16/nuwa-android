package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Account;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetOwnAccount extends MastodonAPIRequest<Account> {
	public GetOwnAccount(){
		super(HttpMethod.GET, "/accounts/verify_credentials", Account.class);
	}
}
