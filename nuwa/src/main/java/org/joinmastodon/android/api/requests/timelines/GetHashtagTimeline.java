package org.joinmastodon.android.api.requests.timelines;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Status;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class GetHashtagTimeline extends MastodonAPIRequest<List<Status>> {
	public GetHashtagTimeline(String hashtag, String maxID, String minID, int limit){
		super(HttpMethod.GET, "/timelines/tag/"+hashtag, new TypeToken<>(){});
		if(maxID!=null)
			addQueryParameter("max_id", maxID);
		if(minID!=null)
			addQueryParameter("min_id", minID);
		if(limit>0)
			addQueryParameter("limit", ""+limit);
	}
}
