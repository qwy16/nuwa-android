package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class EditStatus extends MastodonAPIRequest<Status> {
	public EditStatus(CreateStatus.Request req, String id){
		super(HttpMethod.PUT, "/statuses/"+id, Status.class);
		setRequestBody(req);
	}
}
