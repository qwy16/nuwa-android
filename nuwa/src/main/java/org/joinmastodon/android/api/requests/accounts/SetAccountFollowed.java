package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Relationship;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class SetAccountFollowed extends MastodonAPIRequest<Relationship> {
	public SetAccountFollowed(String id, boolean followed, boolean showReblogs){
		super(HttpMethod.POST, "/accounts/"+id+"/"+(followed ? "follow" : "unfollow"), Relationship.class);
		if(followed)
			setRequestBody(new Request(showReblogs, null));
		else
			setRequestBody(new Object());
	}

	private static class Request{
		public Boolean reblogs, notify;

		public Request(Boolean reblogs, Boolean notify){
			this.reblogs=reblogs;
			this.notify=notify;
		}
	}
}
