package org.joinmastodon.android.api.requests.statuses;

import com.nuwasocial.android.model.BaseModel;

import org.joinmastodon.android.api.AllFieldsAreRequired;
import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetStatusSourceText extends MastodonAPIRequest<GetStatusSourceText.Response> {
	public GetStatusSourceText(String id){
		super(HttpMethod.GET, "/statuses/"+id+"/source", Response.class);
	}

	@AllFieldsAreRequired
	public static class Response extends BaseModel{
		public String id;
		public String text;
		public String spoilerText;
	}
}
