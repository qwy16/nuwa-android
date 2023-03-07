package org.joinmastodon.android.api.requests.instance;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Emoji;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.List;

public class GetCustomEmojis extends MastodonAPIRequest<List<Emoji>> {
	public GetCustomEmojis(){
		super(HttpMethod.GET, "/custom_emojis", new TypeToken<>(){});
	}
}
