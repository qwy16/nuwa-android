package org.joinmastodon.android.api.requests.instance;

import com.nuwasocial.android.model.Instance;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetInstance extends MastodonAPIRequest<Instance> {
	public GetInstance(){
		super(HttpMethod.GET, "/instance", Instance.class);
	}
}
