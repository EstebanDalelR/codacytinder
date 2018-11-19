package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class af extends Handler {
    /* renamed from: a */
    private /* synthetic */ aa f7455a;

    af(aa aaVar, Looper looper) {
        this.f7455a = aaVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f7455a.m14242r();
                return;
            case 2:
                this.f7455a.m14241q();
                return;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GoogleApiClientImpl", stringBuilder.toString());
                return;
        }
    }
}
