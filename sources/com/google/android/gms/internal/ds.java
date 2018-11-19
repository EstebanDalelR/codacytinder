package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

final class ds {
    /* renamed from: a */
    private final Object f16026a;
    /* renamed from: b */
    private volatile int f16027b;
    /* renamed from: c */
    private volatile long f16028c;

    private ds() {
        this.f16026a = new Object();
        this.f16027b = dt.f16029a;
        this.f16028c = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m19636a(int r5, int r6) {
        /*
        r4 = this;
        r4.m19637d();
        r0 = com.google.android.gms.ads.internal.ar.k();
        r0 = r0.currentTimeMillis();
        r2 = r4.f16026a;
        monitor-enter(r2);
        r3 = r4.f16027b;	 Catch:{ all -> 0x0020 }
        if (r3 == r5) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0014:
        r4.f16027b = r6;	 Catch:{ all -> 0x0020 }
        r5 = r4.f16027b;	 Catch:{ all -> 0x0020 }
        r6 = com.google.android.gms.internal.dt.f16031c;	 Catch:{ all -> 0x0020 }
        if (r5 != r6) goto L_0x001e;
    L_0x001c:
        r4.f16028c = r0;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0020:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ds.a(int, int):void");
    }

    /* renamed from: d */
    private final void m19637d() {
        long currentTimeMillis = ar.k().currentTimeMillis();
        synchronized (this.f16026a) {
            if (this.f16027b == dt.f16031c) {
                if (this.f16028c + ((Long) aja.m19221f().m19334a(alo.cM)).longValue() <= currentTimeMillis) {
                    this.f16027b = dt.f16029a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m19638a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = dt.f16029a;
            i2 = dt.f16030b;
        } else {
            i = dt.f16030b;
            i2 = dt.f16029a;
        }
        m19636a(i, i2);
    }

    /* renamed from: a */
    public final boolean m19639a() {
        m19637d();
        return this.f16027b == dt.f16030b;
    }

    /* renamed from: b */
    public final boolean m19640b() {
        m19637d();
        return this.f16027b == dt.f16031c;
    }

    /* renamed from: c */
    public final void m19641c() {
        m19636a(dt.f16030b, dt.f16031c);
    }
}
