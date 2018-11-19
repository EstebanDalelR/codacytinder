package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class fp extends BroadcastReceiver {
    /* renamed from: a */
    private /* synthetic */ fk f16070a;

    private fp(fk fkVar) {
        this.f16070a = fkVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f16070a.f16062c = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f16070a.f16062c = false;
        }
    }
}
