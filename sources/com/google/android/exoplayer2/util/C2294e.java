package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.util.e */
public final class C2294e {
    /* renamed from: a */
    private boolean f6897a;

    /* renamed from: a */
    public synchronized boolean m8332a() {
        if (this.f6897a) {
            return false;
        }
        this.f6897a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public synchronized boolean m8333b() {
        boolean z;
        z = this.f6897a;
        this.f6897a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized void m8334c() throws InterruptedException {
        while (!this.f6897a) {
            wait();
        }
    }
}
