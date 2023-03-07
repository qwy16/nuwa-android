package org.joinmastodon.android.api.requests.trends;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Card;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class GetTrendingLinks extends MastodonAPIRequest<List<Card>> {
	public GetTrendingLinks(){
		super(HttpMethod.GET, "/trends/links", new TypeToken<>(){});
	}
}
