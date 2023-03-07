package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetStatusByID extends MastodonAPIRequest<Status> {
	public GetStatusByID(String id){
		super(HttpMethod.GET, "/statuses/"+id, Status.class);
	}
}
