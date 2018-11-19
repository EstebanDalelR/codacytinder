package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.ec;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.z */
final class C2410z extends TimerTask {
    /* renamed from: a */
    private /* synthetic */ CountDownLatch f7321a;
    /* renamed from: b */
    private /* synthetic */ Timer f7322b;
    /* renamed from: c */
    private /* synthetic */ C4269a f7323c;

    C2410z(C4269a c4269a, CountDownLatch countDownLatch, Timer timer) {
        this.f7323c = c4269a;
        this.f7321a = countDownLatch;
        this.f7322b = timer;
    }

    public final void run() {
        if (((long) ((Integer) aja.f().a(alo.bZ)).intValue()) != this.f7321a.getCount()) {
            ec.b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f7321a.getCount() == 0) {
                this.f7322b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f7323c.f13842e.f7163c.getPackageName()).concat("_adsTrace_");
        try {
            ec.b("Starting method tracing");
            this.f7321a.countDown();
            long currentTimeMillis = ar.m8654k().currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(concat).length() + 20);
            stringBuilder.append(concat);
            stringBuilder.append(currentTimeMillis);
            Debug.startMethodTracing(stringBuilder.toString(), ((Integer) aja.f().a(alo.ca)).intValue());
        } catch (Throwable e) {
            ec.c("Exception occurred while starting method tracing.", e);
        }
    }
}
