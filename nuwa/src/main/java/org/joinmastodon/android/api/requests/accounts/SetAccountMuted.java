package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Relationship;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class SetAccountMuted extends MastodonAPIRequest<Relationship> {
	public SetAccountMuted(String id, boolean muted){
		super(HttpMethod.POST, "/accounts/"+id+"/"+(muted ? "mute" : "unmute"), Relationship.class);
		setRequestBody(new Object());
	}
}
