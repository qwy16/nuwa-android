package org.joinmastodon.android.api.requests.accounts;

import androidx.annotation.NonNull;

import com.google.gson.reflect.TypeToken;
import com.nuwasocial.android.model.Relationship;

import org.joinmastodon.android.api.MastodonAPIRequest;

import java.util.Collection;
import java.util.List;

public class GetAccountRelationships extends MastodonAPIRequest<List<Relationship>> {
	public GetAccountRelationships(@NonNull Collection<String> ids){
		super(HttpMethod.GET, "/accounts/relationships", new TypeToken<>(){});
		for(String id:ids)
			addQueryParameter("id[]", id);
	}
}
