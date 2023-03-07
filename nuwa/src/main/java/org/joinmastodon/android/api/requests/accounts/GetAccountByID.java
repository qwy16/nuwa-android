package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Account;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetAccountByID extends MastodonAPIRequest<Account> {
	public GetAccountByID(String id){
		super(HttpMethod.GET, "/accounts/"+id, Account.class);
	}
}
