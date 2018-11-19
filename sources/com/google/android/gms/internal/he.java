package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

@zzzv
public final class he {
    /* renamed from: a */
    private long f16133a;
    /* renamed from: b */
    private long f16134b = Long.MIN_VALUE;
    /* renamed from: c */
    private Object f16135c = new Object();

    public he(long j) {
        this.f16133a = j;
    }

    /* renamed from: a */
    public final boolean m19841a() {
        synchronized (this.f16135c) {
            long elapsedRealtime = ar.k().elapsedRealtime();
            if (this.f16134b + this.f16133a > elapsedRealtime) {
                return false;
            }
            this.f16134b = elapsedRealtime;
            return true;
        }
    }
}
