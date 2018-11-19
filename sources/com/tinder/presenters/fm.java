package com.tinder.presenters;

import com.tinder.pushnotifications.view.InAppNotificationView.Listener;

final /* synthetic */ class fm implements Listener {
    /* renamed from: a */
    private final df f49901a;
    /* renamed from: b */
    private final boolean f49902b;

    fm(df dfVar, boolean z) {
        this.f49901a = dfVar;
        this.f49902b = z;
    }

    public void onInAppNotificationClicked() {
        this.f49901a.m64835c(this.f49902b);
    }
}
