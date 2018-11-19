package com.tinder.managers;

import android.os.Bundle;
import android.support.v4.app.NotificationCompat.C0382c;
import com.leanplum.LeanplumPushNotificationCustomizer;
import com.tinder.R;

/* renamed from: com.tinder.managers.p */
final /* synthetic */ class C3934p implements LeanplumPushNotificationCustomizer {
    /* renamed from: a */
    static final LeanplumPushNotificationCustomizer f12408a = new C3934p();

    private C3934p() {
    }

    public void customize(C0382c c0382c, Bundle bundle) {
        c0382c.m1410a((int) R.drawable.ic_stat_notification);
    }
}
