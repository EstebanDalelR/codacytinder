package com.tinder.analytics.fireworks;

import p000a.p001a.C0001a;

/* renamed from: com.tinder.analytics.fireworks.s */
public class C7331s implements FireworksSyncListener {
    public void onSyncCompleted() {
        C0001a.c("Fireworks sync completed", new Object[0]);
    }

    public void onSyncError(Throwable th) {
        C0001a.c(th, "Fireworks sync error", new Object[0]);
    }
}
