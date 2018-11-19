package com.facebook.ads.internal.p047k;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.internal.k.ac */
class ac extends ContentObserver {
    /* renamed from: a */
    private final al f4054a;

    public ac(Handler handler, al alVar) {
        super(handler);
        this.f4054a = alVar;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        this.f4054a.m12818e();
    }
}
