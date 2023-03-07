package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class DeleteStatus extends MastodonAPIRequest<Status> {
	public DeleteStatus(String id){
		super(HttpMethod.DELETE, "/statuses/"+id, Status.class);
	}
}
