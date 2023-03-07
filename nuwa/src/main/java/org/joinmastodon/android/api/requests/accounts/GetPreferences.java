package org.joinmastodon.android.api.requests.accounts;

import com.nuwasocial.android.model.Preferences;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetPreferences extends MastodonAPIRequest<Preferences> {
    public GetPreferences(){
        super(HttpMethod.GET, "/preferences", Preferences.class);
    }
}
