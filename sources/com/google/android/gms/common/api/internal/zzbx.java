package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zzbx extends BroadcastReceiver {
    /* renamed from: a */
    private Context f7539a;
    /* renamed from: b */
    private final aw f7540b;

    public zzbx(aw awVar) {
        this.f7540b = awVar;
    }

    /* renamed from: a */
    public final synchronized void m9013a() {
        if (this.f7539a != null) {
            this.f7539a.unregisterReceiver(this);
        }
        this.f7539a = null;
    }

    /* renamed from: a */
    public final void m9014a(Context context) {
        this.f7539a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f7540b.mo2520a();
            m9013a();
        }
    }
}
