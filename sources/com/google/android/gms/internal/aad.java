package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class aad extends aat {
    public aad(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        super(ubVar, str, str2, nxVar, i, 24);
    }

    /* renamed from: c */
    private final void m26965c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.m20220m();
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r0.getInfo();	 Catch:{ IOException -> 0x0038 }
        r1 = r0.getId();	 Catch:{ IOException -> 0x0038 }
        r1 = com.google.android.gms.internal.vk.m20253a(r1);	 Catch:{ IOException -> 0x0038 }
        if (r1 == 0) goto L_0x0038;	 Catch:{ IOException -> 0x0038 }
    L_0x0017:
        r2 = r4.b;	 Catch:{ IOException -> 0x0038 }
        monitor-enter(r2);	 Catch:{ IOException -> 0x0038 }
        r3 = r4.b;	 Catch:{ all -> 0x0035 }
        r3.f26969S = r1;	 Catch:{ all -> 0x0035 }
        r1 = r4.b;	 Catch:{ all -> 0x0035 }
        r0 = r0.isLimitAdTrackingEnabled();	 Catch:{ all -> 0x0035 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0035 }
        r1.f26971U = r0;	 Catch:{ all -> 0x0035 }
        r0 = r4.b;	 Catch:{ all -> 0x0035 }
        r1 = 5;	 Catch:{ all -> 0x0035 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0035 }
        r0.f26970T = r1;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        return;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aad.c():void");
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        if (this.a.m20214g()) {
            m26965c();
            return;
        }
        synchronized (this.b) {
            this.b.f26969S = (String) this.c.invoke(null, new Object[]{this.a.m20204a()});
        }
    }

    /* renamed from: b */
    public final Void mo4166b() throws Exception {
        if (this.a.m20209b()) {
            return super.mo4166b();
        }
        if (this.a.m20214g()) {
            m26965c();
        }
        return null;
    }

    public final /* synthetic */ Object call() throws Exception {
        return mo4166b();
    }
}
