package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.facebook.internal.a */
public class C1697a {
    /* renamed from: a */
    private static C1697a f4690a;
    /* renamed from: b */
    private UUID f4691b;
    /* renamed from: c */
    private Intent f4692c;
    /* renamed from: d */
    private int f4693d;

    /* renamed from: a */
    public static C1697a m5856a() {
        return f4690a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static synchronized com.facebook.internal.C1697a m5857a(java.util.UUID r4, int r5) {
        /*
        r0 = com.facebook.internal.C1697a.class;
        monitor-enter(r0);
        r1 = com.facebook.internal.C1697a.m5856a();	 Catch:{ all -> 0x0022 }
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x000a:
        r3 = r1.m5861c();	 Catch:{ all -> 0x0022 }
        r4 = r3.equals(r4);	 Catch:{ all -> 0x0022 }
        if (r4 == 0) goto L_0x0020;
    L_0x0014:
        r4 = r1.m5862d();	 Catch:{ all -> 0x0022 }
        if (r4 == r5) goto L_0x001b;
    L_0x001a:
        goto L_0x0020;
    L_0x001b:
        com.facebook.internal.C1697a.m5858a(r2);	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);
        return r1;
    L_0x0020:
        monitor-exit(r0);
        return r2;
    L_0x0022:
        r4 = move-exception;
        monitor-exit(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.a(java.util.UUID, int):com.facebook.internal.a");
    }

    /* renamed from: a */
    private static synchronized boolean m5858a(C1697a c1697a) {
        synchronized (C1697a.class) {
            C1697a a = C1697a.m5856a();
            f4690a = c1697a;
            c1697a = a != null ? true : null;
        }
        return c1697a;
    }

    public C1697a(int i) {
        this(i, UUID.randomUUID());
    }

    public C1697a(int i, UUID uuid) {
        this.f4691b = uuid;
        this.f4693d = i;
    }

    /* renamed from: b */
    public Intent m5860b() {
        return this.f4692c;
    }

    /* renamed from: c */
    public UUID m5861c() {
        return this.f4691b;
    }

    /* renamed from: d */
    public int m5862d() {
        return this.f4693d;
    }

    /* renamed from: a */
    public void m5859a(Intent intent) {
        this.f4692c = intent;
    }

    /* renamed from: e */
    public boolean m5863e() {
        return C1697a.m5858a(this);
    }
}
