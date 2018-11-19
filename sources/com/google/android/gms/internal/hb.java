package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.ad;

@zzzv
public final class hb {
    /* renamed from: a */
    private HandlerThread f16127a = null;
    /* renamed from: b */
    private Handler f16128b = null;
    /* renamed from: c */
    private int f16129c = 0;
    /* renamed from: d */
    private final Object f16130d = new Object();

    /* renamed from: a */
    public final Looper m19836a() {
        Looper looper;
        synchronized (this.f16130d) {
            if (this.f16129c != 0) {
                ad.a(this.f16127a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f16127a == null) {
                ec.m27332a("Starting the looper thread.");
                this.f16127a = new HandlerThread("LooperProvider");
                this.f16127a.start();
                this.f16128b = new Handler(this.f16127a.getLooper());
                ec.m27332a("Looper thread started.");
            } else {
                ec.m27332a("Resuming the looper thread");
                this.f16130d.notifyAll();
            }
            this.f16129c++;
            looper = this.f16127a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public final Handler m19837b() {
        return this.f16128b;
    }
}
