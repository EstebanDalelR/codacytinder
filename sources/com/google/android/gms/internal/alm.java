package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.support.annotation.Nullable;

@zzzv
public final class alm {
    /* renamed from: a */
    private final Object f15416a = new Object();
    /* renamed from: b */
    private final ConditionVariable f15417b = new ConditionVariable();
    /* renamed from: c */
    private volatile boolean f15418c = false;
    @Nullable
    /* renamed from: d */
    private SharedPreferences f15419d = null;
    /* renamed from: e */
    private Context f15420e;

    /* renamed from: a */
    public final <T> T m19334a(ald<T> ald) {
        if (this.f15417b.block(5000)) {
            if (!this.f15418c || this.f15419d == null) {
                synchronized (this.f15416a) {
                    if (this.f15418c) {
                        if (this.f15419d == null) {
                        }
                    }
                    T b = ald.m19324b();
                    return b;
                }
            }
            return hg.m19844a(this.f15420e, new aln(this, ald));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m19335a(android.content.Context r4) {
        /*
        r3 = this;
        r0 = r3.f15418c;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r3.f15416a;
        monitor-enter(r0);
        r1 = r3.f15418c;	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x000e:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x0051 }
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        r1 = r4;
        goto L_0x001a;
    L_0x0016:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x0051 }
    L_0x001a:
        r3.f15420e = r1;	 Catch:{ all -> 0x0051 }
        r1 = com.google.android.gms.common.C2513p.getRemoteContext(r4);	 Catch:{ all -> 0x004a }
        if (r1 != 0) goto L_0x002b;
    L_0x0022:
        if (r4 == 0) goto L_0x002b;
    L_0x0024:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x004a }
        if (r1 != 0) goto L_0x002b;
    L_0x002a:
        r1 = r4;
    L_0x002b:
        if (r1 != 0) goto L_0x0034;
    L_0x002d:
        r4 = r3.f15417b;	 Catch:{ all -> 0x0051 }
        r4.open();	 Catch:{ all -> 0x0051 }
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x0034:
        com.google.android.gms.internal.aja.m19219d();	 Catch:{ all -> 0x004a }
        r4 = "google_ads_flags";
        r2 = 0;
        r4 = r1.getSharedPreferences(r4, r2);	 Catch:{ all -> 0x004a }
        r3.f15419d = r4;	 Catch:{ all -> 0x004a }
        r4 = 1;
        r3.f15418c = r4;	 Catch:{ all -> 0x004a }
        r4 = r3.f15417b;	 Catch:{ all -> 0x0051 }
        r4.open();	 Catch:{ all -> 0x0051 }
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x004a:
        r4 = move-exception;
        r1 = r3.f15417b;	 Catch:{ all -> 0x0051 }
        r1.open();	 Catch:{ all -> 0x0051 }
        throw r4;	 Catch:{ all -> 0x0051 }
    L_0x0051:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alm.a(android.content.Context):void");
    }
}
