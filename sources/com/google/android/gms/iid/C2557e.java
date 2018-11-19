package com.google.android.gms.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.e */
final class C2557e implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Intent f7771a;
    /* renamed from: b */
    private /* synthetic */ C2556d f7772b;

    C2557e(C2556d c2556d, Intent intent) {
        this.f7772b = c2556d;
        this.f7771a = intent;
    }

    public final void run() {
        String action = this.f7771a.getAction();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(action).length() + 61);
        stringBuilder.append("Service took too long to process intent: ");
        stringBuilder.append(action);
        stringBuilder.append(" App may get closed.");
        Log.w("EnhancedIntentService", stringBuilder.toString());
        this.f7772b.m9306a();
    }
}
