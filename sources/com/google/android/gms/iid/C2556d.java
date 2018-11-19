package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.iid.d */
final class C2556d {
    /* renamed from: a */
    final Intent f7767a;
    /* renamed from: b */
    private final PendingResult f7768b;
    /* renamed from: c */
    private boolean f7769c = false;
    /* renamed from: d */
    private final ScheduledFuture<?> f7770d;

    C2556d(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f7767a = intent;
        this.f7768b = pendingResult;
        this.f7770d = scheduledExecutorService.schedule(new C2557e(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    final synchronized void m9306a() {
        if (!this.f7769c) {
            this.f7768b.finish();
            this.f7770d.cancel(false);
            this.f7769c = true;
        }
    }
}
