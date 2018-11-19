package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.aj.C4836a;
import com.google.android.m4b.maps.bx.C7483s;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bc.n */
public final class C6440n implements C4761l, C5148a {
    /* renamed from: a */
    private final bg f23904a;
    /* renamed from: b */
    private aj f23905b;
    /* renamed from: c */
    private List<aj> f23906c;
    /* renamed from: d */
    private C7483s f23907d;
    /* renamed from: e */
    private float f23908e;
    /* renamed from: f */
    private C5052d f23909f;
    /* renamed from: g */
    private com.google.android.m4b.maps.bx.aj f23910g;
    /* renamed from: h */
    private final C7446m f23911h;

    /* renamed from: a */
    public final void mo4951a(long j) {
    }

    /* renamed from: a */
    public final void mo4953a(C5052d c5052d) {
    }

    /* renamed from: a */
    public final void mo4956a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo4957a(float f, float f2, af afVar, C6570b c6570b) {
        return false;
    }

    /* renamed from: b */
    public final void mo4958b() {
    }

    /* renamed from: b */
    public final void mo4959b(int i) {
    }

    /* renamed from: d */
    public final void mo4961d() {
    }

    public C6440n(C7446m c7446m, bg bgVar) {
        this.f23911h = c7446m;
        this.f23904a = bgVar;
        mo4985a(-1);
    }

    /* renamed from: a */
    public final void mo4984a() {
        synchronized (this.f23911h) {
            this.f23911h.m32082a((C4761l) this);
        }
        this.f23911h.m32092b();
    }

    /* renamed from: a */
    private static aj m28206a(List<LatLng> list) {
        C4836a c4836a = new C4836a();
        for (LatLng b : list) {
            c4836a.m21514a(C4754b.m21100b(b));
        }
        list = c4836a.m21516c();
        return !list.m21533c(list.m21538g()).m21537f() ? list.m21539h() : list;
    }

    /* renamed from: a */
    public final synchronized void mo4954a(C5052d c5052d, com.google.android.m4b.maps.bx.aj ajVar) {
        this.f23909f = c5052d;
        this.f23910g = ajVar;
        this.f23907d.mo7041a(c5052d, ajVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void mo4952a(com.google.android.m4b.maps.bz.C6570b r2, com.google.android.m4b.maps.ca.C5052d r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f23904a;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0015;
    L_0x0005:
        r0 = r1.f23904a;	 Catch:{ all -> 0x0017 }
        r0 = r0.mo7187h();	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0015;
    L_0x000e:
        r0 = r1.f23907d;	 Catch:{ all -> 0x0017 }
        r0.mo7044a(r2, r3);	 Catch:{ all -> 0x0017 }
        monitor-exit(r1);
        return;
    L_0x0015:
        monitor-exit(r1);
        return;
    L_0x0017:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.n.a(com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.ca.d):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void mo4955a(com.google.android.m4b.maps.ca.C5052d r2, com.google.android.m4b.maps.bz.C6570b r3, com.google.android.m4b.maps.bx.C5009j r4) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f23904a;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0015;
    L_0x0005:
        r0 = r1.f23904a;	 Catch:{ all -> 0x0017 }
        r0 = r0.mo7187h();	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0015;
    L_0x000e:
        r0 = r1.f23907d;	 Catch:{ all -> 0x0017 }
        r0.mo5222a(r2, r3, r4);	 Catch:{ all -> 0x0017 }
        monitor-exit(r1);
        return;
    L_0x0015:
        monitor-exit(r1);
        return;
    L_0x0017:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.n.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: c */
    public final synchronized boolean mo4960c() {
        boolean z;
        if (this.f23904a != null && this.f23904a.mo7187h()) {
            if (!this.f23907d.e_()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: e */
    public final String mo4962e() {
        return this.f23904a.getId();
    }

    /* renamed from: f */
    public final float mo4963f() {
        return this.f23908e;
    }

    /* renamed from: a */
    public final void mo4985a(int i) {
        if ((i & 3) != 0) {
            this.f23905b = C6440n.m28206a(this.f23904a.mo7181b());
            this.f23906c = new ArrayList();
            Iterator a = this.f23904a.mo7182c().mo4785a();
            while (a.hasNext()) {
                this.f23906c.add(C6440n.m28206a((List) a.next()));
            }
            this.f23907d = new C7483s(this.f23905b, this.f23906c, (int) this.f23904a.mo7185f(), C4754b.m21093a(this.f23904a.mo7183d()), C4754b.m21093a(this.f23904a.mo7184e()), true);
            if (!(this.f23909f == null || this.f23910g == null)) {
                this.f23907d.mo7041a(this.f23909f, this.f23910g);
            }
        }
        if ((i & 16) != 0) {
            this.f23907d.m32518c(C4754b.m21093a(this.f23904a.mo7184e()));
        }
        if ((i & 8) != 0) {
            this.f23907d.m32516b(C4754b.m21093a(this.f23904a.mo7183d()));
        }
        if ((i & 4) != 0) {
            this.f23907d.m32520d((int) this.f23904a.mo7185f());
        }
        if ((i & 64) != 0) {
            synchronized (this.f23911h) {
                this.f23908e = this.f23904a.mo7186g();
                this.f23911h.m32093c();
            }
        }
        this.f23911h.m32092b();
    }
}
