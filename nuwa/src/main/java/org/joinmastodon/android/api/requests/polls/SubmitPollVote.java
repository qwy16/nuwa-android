package org.joinmastodon.android.api.requests.polls;

import com.nuwasocial.android.model.Poll;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class SubmitPollVote extends MastodonAPIRequest<Poll> {
	public SubmitPollVote(String pollID, List<Integer> choices){
		super(HttpMethod.POST, "/polls/"+pollID+"/votes", Poll.class);
		setRequestBody(new Body(choices));
	}

	private static class Body{
		public List<Integer> choices;

		public Body(List<Integer> choices){
			this.choices=choices;
		}
	}
}
