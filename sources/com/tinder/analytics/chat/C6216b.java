package com.tinder.analytics.chat;

import com.tinder.pushnotifications.model.TinderNotification.NotificationOrigin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.chat.b */
public final /* synthetic */ class C6216b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f22779a = new int[NotificationOrigin.values().length];

    static {
        f22779a[NotificationOrigin.FOREGROUND.ordinal()] = 1;
        f22779a[NotificationOrigin.BACKGROUND.ordinal()] = 2;
        f22779a[NotificationOrigin.UNDEFINED.ordinal()] = 3;
    }
}
