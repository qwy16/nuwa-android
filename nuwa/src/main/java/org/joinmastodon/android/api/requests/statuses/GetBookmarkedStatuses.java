package org.joinmastodon.android.api.requests.statuses;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.requests.HeaderPaginationRequest;

public class GetBookmarkedStatuses extends HeaderPaginationRequest<Status> {
	public GetBookmarkedStatuses(String maxID, int limit){
		super(HttpMethod.GET, "/bookmarks", new TypeToken<>(){});
		if(maxID!=null)
			addQueryParameter("max_id", maxID);
		if(limit>0)
			addQueryParameter("limit", limit+"");
	}
}
