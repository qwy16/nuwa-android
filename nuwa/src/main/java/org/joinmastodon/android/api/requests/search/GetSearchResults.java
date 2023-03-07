package org.joinmastodon.android.api.requests.search;

import com.nuwasocial.android.model.SearchResults;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetSearchResults extends MastodonAPIRequest<SearchResults> {
	public GetSearchResults(String query, Type type, boolean resolve){
		super(HttpMethod.GET, "/search", SearchResults.class);
		addQueryParameter("q", query);
		if(type!=null)
			addQueryParameter("type", type.name().toLowerCase());
		if(resolve)
			addQueryParameter("resolve", "true");
	}

	@Override
	protected String getPathPrefix(){
		return "/api/v2";
	}

	public enum Type{
		ACCOUNTS,
		HASHTAGS,
		STATUSES
	}
}
