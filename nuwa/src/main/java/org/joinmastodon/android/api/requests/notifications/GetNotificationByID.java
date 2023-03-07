package org.joinmastodon.android.api.requests.notifications;

import com.nuwasocial.android.model.Notification;

import org.joinmastodon.android.api.MastodonAPIRequest;

public class GetNotificationByID extends MastodonAPIRequest<Notification> {
	public GetNotificationByID(String id){
		super(HttpMethod.GET, "/notifications/"+id, Notification.class);
	}
}
