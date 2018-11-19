package com.google.android.gms.internal;

import android.content.Context;

@zzzv
public final class dd implements zzgt {
    /* renamed from: a */
    private final Context f23256a;
    /* renamed from: b */
    private final Object f23257b;
    /* renamed from: c */
    private String f23258c;
    /* renamed from: d */
    private boolean f23259d;

    public dd(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f23256a = context;
        this.f23258c = str;
        this.f23259d = false;
        this.f23257b = new Object();
    }

    /* renamed from: a */
    public final void m27280a(String str) {
        this.f23258c = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m27281a(boolean r4) {
        /*
        r3 = this;
        r0 = com.google.android.gms.ads.internal.ar.z();
        r1 = r3.f23256a;
        r0 = r0.m19598a(r1);
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r3.f23257b;
        monitor-enter(r0);
        r1 = r3.f23259d;	 Catch:{ all -> 0x003f }
        if (r1 != r4) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0016:
        r3.f23259d = r4;	 Catch:{ all -> 0x003f }
        r4 = r3.f23258c;	 Catch:{ all -> 0x003f }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0022:
        r4 = r3.f23259d;	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0032;
    L_0x0026:
        r4 = com.google.android.gms.ads.internal.ar.z();	 Catch:{ all -> 0x003f }
        r1 = r3.f23256a;	 Catch:{ all -> 0x003f }
        r2 = r3.f23258c;	 Catch:{ all -> 0x003f }
        r4.m19595a(r1, r2);	 Catch:{ all -> 0x003f }
        goto L_0x003d;
    L_0x0032:
        r4 = com.google.android.gms.ads.internal.ar.z();	 Catch:{ all -> 0x003f }
        r1 = r3.f23256a;	 Catch:{ all -> 0x003f }
        r2 = r3.f23258c;	 Catch:{ all -> 0x003f }
        r4.m19599b(r1, r2);	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dd.a(boolean):void");
    }

    public final void zza(agd agd) {
        m27281a(agd.f15174a);
    }
}
