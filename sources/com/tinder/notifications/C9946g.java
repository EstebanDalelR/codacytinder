package com.tinder.notifications;

import com.tinder.domain.pushnotifications.model.PushNotificationType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.g */
public final /* synthetic */ class C9946g {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32793a = new int[PushNotificationType.values().length];

    static {
        f32793a[PushNotificationType.NEW_MATCHES.ordinal()] = 1;
        f32793a[PushNotificationType.MESSAGES.ordinal()] = 2;
        f32793a[PushNotificationType.MESSAGE_LIKES.ordinal()] = 3;
        f32793a[PushNotificationType.SUPER_LIKES.ordinal()] = 4;
        f32793a[PushNotificationType.LIKES_YOU.ordinal()] = 5;
        f32793a[PushNotificationType.TOP_PICKS.ordinal()] = 6;
        f32793a[PushNotificationType.PLACES.ordinal()] = 7;
    }
}
