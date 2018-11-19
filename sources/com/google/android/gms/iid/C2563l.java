package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.iid.l */
final class C2563l extends Handler {
    /* renamed from: a */
    private /* synthetic */ C2562k f7799a;

    C2563l(C2562k c2562k, Looper looper) {
        this.f7799a = c2562k;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f7799a.m9326a(message);
    }
}
