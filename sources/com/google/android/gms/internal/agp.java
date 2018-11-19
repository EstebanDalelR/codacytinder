package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;

@zzzv
public final class agp {
    /* renamed from: a */
    private final Object f15209a = new Object();
    /* renamed from: b */
    private agq f15210b = null;
    /* renamed from: c */
    private boolean f15211c = false;

    @Nullable
    /* renamed from: a */
    public final Activity m19132a() {
        synchronized (this.f15209a) {
            if (this.f15210b != null) {
                Activity a = this.f15210b.m19142a();
                return a;
            }
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m19133a(android.content.Context r5) {
        /*
        r4 = this;
        r0 = r4.f15209a;
        monitor-enter(r0);
        r1 = r4.f15211c;	 Catch:{ all -> 0x0048 }
        if (r1 != 0) goto L_0x0046;
    L_0x0007:
        r1 = com.google.android.gms.internal.alo.au;	 Catch:{ all -> 0x0048 }
        r2 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0048 }
        r1 = r2.m19334a(r1);	 Catch:{ all -> 0x0048 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0048 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x001b:
        r1 = 0;
        r2 = r5.getApplicationContext();	 Catch:{ all -> 0x0048 }
        if (r2 != 0) goto L_0x0023;
    L_0x0022:
        r2 = r5;
    L_0x0023:
        r3 = r2 instanceof android.app.Application;	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x002a;
    L_0x0027:
        r1 = r2;
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0048 }
    L_0x002a:
        if (r1 != 0) goto L_0x0033;
    L_0x002c:
        r5 = "Can not cast Context to Application";
        com.google.android.gms.internal.hx.m19916e(r5);	 Catch:{ all -> 0x0048 }
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0033:
        r2 = r4.f15210b;	 Catch:{ all -> 0x0048 }
        if (r2 != 0) goto L_0x003e;
    L_0x0037:
        r2 = new com.google.android.gms.internal.agq;	 Catch:{ all -> 0x0048 }
        r2.<init>();	 Catch:{ all -> 0x0048 }
        r4.f15210b = r2;	 Catch:{ all -> 0x0048 }
    L_0x003e:
        r2 = r4.f15210b;	 Catch:{ all -> 0x0048 }
        r2.m19143a(r1, r5);	 Catch:{ all -> 0x0048 }
        r5 = 1;
        r4.f15211c = r5;	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agp.a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m19134a(zzhj zzhj) {
        synchronized (this.f15209a) {
            if (((Boolean) aja.m19221f().m19334a(alo.au)).booleanValue()) {
                if (this.f15210b == null) {
                    this.f15210b = new agq();
                }
                this.f15210b.m19144a(zzhj);
                return;
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final Context m19135b() {
        synchronized (this.f15209a) {
            if (this.f15210b != null) {
                Context b = this.f15210b.m19145b();
                return b;
            }
            return null;
        }
    }
}
