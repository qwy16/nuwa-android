package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class SetStatusReblogged extends MastodonAPIRequest<Status> {
	public SetStatusReblogged(String id, boolean reblogged){
		super(HttpMethod.POST, "/statuses/"+id+"/"+(reblogged ? "reblog" : "unreblog"), Status.class);
		setRequestBody(new Object());
	}
}
