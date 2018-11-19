package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.p124x.C5550r;
import java.util.concurrent.Executor;

public class an {
    /* renamed from: a */
    private static final String f19054a = "an";
    /* renamed from: b */
    private final Executor f19055b;
    /* renamed from: c */
    private boolean f19056c = null;
    /* renamed from: d */
    private C5550r f19057d = null;
    /* renamed from: e */
    private C5550r f19058e = null;

    /* renamed from: com.google.android.m4b.maps.cg.an$1 */
    class C51361 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ an f19053a;

        C51361(an anVar) {
            this.f19053a = anVar;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            r5 = this;
            r0 = r5.f19053a;
            monitor-enter(r0);
            r1 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r1 = r1.f19056c;	 Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x007e;
        L_0x000b:
            r1 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r1 = r1.f19058e;	 Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x001c;
        L_0x0013:
            r1 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r1 = r1.f19057d;	 Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x001c;
        L_0x001b:
            goto L_0x007e;
        L_0x001c:
            r1 = 2;
            r2 = com.google.android.m4b.maps.aa.au.m20524a(r1);	 Catch:{ all -> 0x0080 }
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3 = r3.f19058e;	 Catch:{ all -> 0x0080 }
            r4 = 0;
            if (r3 == 0) goto L_0x0038;
        L_0x002a:
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3 = r3.f19058e;	 Catch:{ all -> 0x0080 }
            r2.add(r3);	 Catch:{ all -> 0x0080 }
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3.f19058e = null;	 Catch:{ all -> 0x0080 }
        L_0x0038:
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3 = r3.f19057d;	 Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x004e;
        L_0x0040:
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3 = r3.f19057d;	 Catch:{ all -> 0x0080 }
            r2.add(r3);	 Catch:{ all -> 0x0080 }
            r3 = r5.f19053a;	 Catch:{ all -> 0x0080 }
            r3.f19057d = null;	 Catch:{ all -> 0x0080 }
        L_0x004e:
            monitor-exit(r0);	 Catch:{ all -> 0x0080 }
            r0 = com.google.android.m4b.maps.cg.an.f19054a;
            r0 = com.google.android.m4b.maps.ay.C4728u.m21050a(r0, r1);
            if (r0 == 0) goto L_0x0062;
        L_0x0059:
            r0 = com.google.android.m4b.maps.cg.an.f19054a;
            r1 = "onMapLoaded";
            android.util.Log.v(r0, r1);
        L_0x0062:
            r0 = r2.iterator();
        L_0x0066:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x007d;
        L_0x006c:
            r1 = r0.next();
            r1 = (com.google.android.m4b.maps.p124x.C5550r) r1;
            r1.mo5801a();	 Catch:{ RemoteException -> 0x0076 }
            goto L_0x0066;
        L_0x0076:
            r0 = move-exception;
            r1 = new com.google.android.m4b.maps.model.RuntimeRemoteException;
            r1.<init>(r0);
            throw r1;
        L_0x007d:
            return;
        L_0x007e:
            monitor-exit(r0);	 Catch:{ all -> 0x0080 }
            return;
        L_0x0080:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0080 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.an.1.run():void");
        }
    }

    public an(Executor executor) {
        this.f19055b = executor;
    }

    /* renamed from: a */
    public final void m22861a(boolean z) {
        synchronized (this) {
            this.f19056c = z;
        }
        m22858b();
    }

    /* renamed from: a */
    public final void m22860a(C5550r c5550r) {
        synchronized (this) {
            this.f19057d = c5550r;
        }
        m22858b();
    }

    /* renamed from: b */
    public final void m22862b(C5550r c5550r) {
        synchronized (this) {
            this.f19058e = c5550r;
        }
        m22858b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m22858b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f19056c;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x001a;
    L_0x0005:
        r0 = r2.f19058e;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000e;
    L_0x0009:
        r0 = r2.f19057d;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x001a;
    L_0x000e:
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
        r0 = r2.f19055b;
        r1 = new com.google.android.m4b.maps.cg.an$1;
        r1.<init>(r2);
        r0.execute(r1);
        return;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
        return;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.an.b():void");
    }
}
