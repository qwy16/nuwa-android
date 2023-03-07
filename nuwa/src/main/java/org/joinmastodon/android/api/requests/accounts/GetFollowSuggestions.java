package org.joinmastodon.android.api.requests.accounts;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.FollowSuggestion;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class GetFollowSuggestions extends MastodonAPIRequest<List<FollowSuggestion>> {
	public GetFollowSuggestions(int limit){
		super(HttpMethod.GET, "/suggestions", new TypeToken<>(){});
		addQueryParameter("limit", limit+"");
	}

	@Override
	protected String getPathPrefix(){
		return "/api/v2";
	}
}
