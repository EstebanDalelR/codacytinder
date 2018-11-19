package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class ed extends Handler {
    public ed(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            ar.i().m27296a(e, "AdMobHandler.handleMessage");
        }
    }
}
