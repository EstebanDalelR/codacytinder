package com.tinder.activities;

import com.tinder.presenters.df;
import com.tinder.pushnotifications.view.InAppNotificationView.Listener;

final /* synthetic */ class ab implements Listener {
    /* renamed from: a */
    private final df f26205a;

    private ab(df dfVar) {
        this.f26205a = dfVar;
    }

    /* renamed from: a */
    static Listener m31107a(df dfVar) {
        return new ab(dfVar);
    }

    public void onInAppNotificationClicked() {
        this.f26205a.x();
    }
}
