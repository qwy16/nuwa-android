package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class SetStatusBookmarked extends MastodonAPIRequest<Status> {
	public SetStatusBookmarked(String id, boolean bookmarked){
		super(HttpMethod.POST, "/statuses/"+id+"/"+(bookmarked ? "bookmark" : "unbookmark"), Status.class);
		setRequestBody(new Object());
	}
}
