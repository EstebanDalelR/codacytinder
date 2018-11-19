package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class ahl {
    /* renamed from: a */
    private final Runnable f15274a = new ahm(this);
    /* renamed from: b */
    private final Object f15275b = new Object();
    @Nullable
    /* renamed from: c */
    private ahr f15276c;
    @Nullable
    /* renamed from: d */
    private Context f15277d;
    @Nullable
    /* renamed from: e */
    private zzio f15278e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final void m19177b() {
        /*
        r6 = this;
        r0 = r6.f15275b;
        monitor-enter(r0);
        r1 = r6.f15277d;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x002e;
    L_0x0007:
        r1 = r6.f15276c;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002e;
    L_0x000c:
        r1 = new com.google.android.gms.internal.aho;	 Catch:{ all -> 0x0030 }
        r1.<init>(r6);	 Catch:{ all -> 0x0030 }
        r2 = new com.google.android.gms.internal.ahp;	 Catch:{ all -> 0x0030 }
        r2.<init>(r6);	 Catch:{ all -> 0x0030 }
        r3 = new com.google.android.gms.internal.ahr;	 Catch:{ all -> 0x0030 }
        r4 = r6.f15277d;	 Catch:{ all -> 0x0030 }
        r5 = com.google.android.gms.ads.internal.ar.s();	 Catch:{ all -> 0x0030 }
        r5 = r5.m19836a();	 Catch:{ all -> 0x0030 }
        r3.<init>(r4, r5, r1, r2);	 Catch:{ all -> 0x0030 }
        r6.f15276c = r3;	 Catch:{ all -> 0x0030 }
        r1 = r6.f15276c;	 Catch:{ all -> 0x0030 }
        r1.i();	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x002e:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0030:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahl.b():void");
    }

    /* renamed from: c */
    private final void m19180c() {
        synchronized (this.f15275b) {
            if (this.f15276c == null) {
                return;
            }
            if (this.f15276c.isConnected() || this.f15276c.isConnecting()) {
                this.f15276c.disconnect();
            }
            this.f15276c = null;
            this.f15278e = null;
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final zzii m19182a(zzil zzil) {
        synchronized (this.f15275b) {
            if (this.f15278e == null) {
                zzii zzii = new zzii();
                return zzii;
            }
            try {
                zzii = this.f15278e.zza(zzil);
                return zzii;
            } catch (Throwable e) {
                hx.m19912b("Unable to call into cache service.", e);
                return new zzii();
            }
        }
    }

    /* renamed from: a */
    public final void m19183a() {
        if (((Boolean) aja.m19221f().m19334a(alo.cp)).booleanValue()) {
            synchronized (this.f15275b) {
                m19177b();
                ar.e();
                fk.f16060a.removeCallbacks(this.f15274a);
                ar.e();
                fk.f16060a.postDelayed(this.f15274a, ((Long) aja.m19221f().m19334a(alo.cq)).longValue());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m19184a(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r2.f15275b;
        monitor-enter(r0);
        r1 = r2.f15277d;	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x000c:
        r3 = r3.getApplicationContext();	 Catch:{ all -> 0x0048 }
        r2.f15277d = r3;	 Catch:{ all -> 0x0048 }
        r3 = com.google.android.gms.internal.alo.co;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0048 }
        r3 = r1.m19334a(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r2.m19177b();	 Catch:{ all -> 0x0048 }
        goto L_0x0046;
    L_0x0028:
        r3 = com.google.android.gms.internal.alo.cn;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.aja.m19221f();	 Catch:{ all -> 0x0048 }
        r3 = r1.m19334a(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = new com.google.android.gms.internal.ahn;	 Catch:{ all -> 0x0048 }
        r3.<init>(r2);	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.ar.h();	 Catch:{ all -> 0x0048 }
        r1.m19134a(r3);	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahl.a(android.content.Context):void");
    }
}
