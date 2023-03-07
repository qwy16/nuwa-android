package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Relationship;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class SetAccountBlocked extends MastodonAPIRequest<Relationship> {
	public SetAccountBlocked(String id, boolean blocked){
		super(HttpMethod.POST, "/accounts/"+id+"/"+(blocked ? "block" : "unblock"), Relationship.class);
		setRequestBody(new Object());
	}
}
