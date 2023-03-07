package org.joinmastodon.android.api.requests.trends;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Hashtag;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class GetTrendingHashtags extends MastodonAPIRequest<List<Hashtag>> {
	public GetTrendingHashtags(int limit){
		super(HttpMethod.GET, "/trends", new TypeToken<>(){});
		addQueryParameter("limit", limit+"");
	}
}
