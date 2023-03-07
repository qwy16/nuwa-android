package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.StatusContext;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetStatusContext extends MastodonAPIRequest<StatusContext> {
	public GetStatusContext(String id){
		super(HttpMethod.GET, "/statuses/"+id+"/context", StatusContext.class);
	}
}
