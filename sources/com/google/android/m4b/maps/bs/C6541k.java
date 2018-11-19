package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bw.C4976e;
import java.lang.ref.SoftReference;

/* renamed from: com.google.android.m4b.maps.bs.k */
public final class C6541k implements C4904l {
    /* renamed from: b */
    private static az f24268b = new aa();
    /* renamed from: a */
    private C4976e<ba, C4903a> f24269a;

    /* renamed from: com.google.android.m4b.maps.bs.k$a */
    static class C4903a {
        /* renamed from: a */
        final SoftReference<az> f18005a;
        /* renamed from: b */
        final az f18006b;

        public C4903a(az azVar) {
            SoftReference softReference = null;
            this.f18006b = bo.m32233a(azVar) ? azVar : null;
            if (this.f18006b == null) {
                softReference = new SoftReference(azVar);
            }
            this.f18005a = softReference;
        }
    }

    public C6541k(int i) {
        this.f24269a = new C4976e(i);
    }

    /* renamed from: a */
    public final void mo5153a(ba baVar, az azVar) {
        synchronized (this.f24269a) {
            this.f24269a.m22255c(baVar, new C4903a(azVar));
        }
    }

    public final void a_(ba baVar) {
        mo5153a(baVar, f24268b);
    }

    /* renamed from: b */
    public final boolean mo5157b(ba baVar) {
        return mo5158c(baVar) != null ? true : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final com.google.android.m4b.maps.bo.az mo5158c(com.google.android.m4b.maps.bo.ba r5) {
        /*
        r4 = this;
        r0 = r4.f24269a;
        monitor-enter(r0);
        r1 = r4.f24269a;	 Catch:{ all -> 0x002e }
        r1 = r1.m22251b(r5);	 Catch:{ all -> 0x002e }
        r1 = (com.google.android.m4b.maps.bs.C6541k.C4903a) r1;	 Catch:{ all -> 0x002e }
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x000e:
        r3 = r1.f18006b;	 Catch:{ all -> 0x002e }
        if (r3 == 0) goto L_0x0015;
    L_0x0012:
        r2 = r1.f18006b;	 Catch:{ all -> 0x002e }
        goto L_0x0023;
    L_0x0015:
        r3 = r1.f18005a;	 Catch:{ all -> 0x002e }
        if (r3 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0023;
    L_0x001a:
        r1 = r1.f18005a;	 Catch:{ all -> 0x002e }
        r1 = r1.get();	 Catch:{ all -> 0x002e }
        r2 = r1;
        r2 = (com.google.android.m4b.maps.bo.az) r2;	 Catch:{ all -> 0x002e }
    L_0x0023:
        if (r2 != 0) goto L_0x002a;
    L_0x0025:
        r1 = r4.f24269a;	 Catch:{ all -> 0x002e }
        r1.m22254c(r5);	 Catch:{ all -> 0x002e }
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r2;
    L_0x002c:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r2;
    L_0x002e:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.k.c(com.google.android.m4b.maps.bo.ba):com.google.android.m4b.maps.bo.az");
    }

    /* renamed from: a */
    public final boolean mo5154a() {
        synchronized (this.f24269a) {
            this.f24269a.m22247a();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5155a(az azVar) {
        return azVar == f24268b ? true : null;
    }
}
