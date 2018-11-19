package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class aj extends Handler {
    /* renamed from: a */
    private /* synthetic */ ah f7457a;

    aj(ah ahVar, Looper looper) {
        this.f7457a = ahVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((ai) message.obj).m8932a(this.f7457a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GACStateManager", stringBuilder.toString());
                return;
        }
    }
}
