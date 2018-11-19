package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.ad;

final class bc extends Handler {
    /* renamed from: a */
    private /* synthetic */ bb f7490a;

    public bc(bb bbVar, Looper looper) {
        this.f7490a = bbVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        ad.m9054b(z);
        this.f7490a.m8974b((zzcl) message.obj);
    }
}
