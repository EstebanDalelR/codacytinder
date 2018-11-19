package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.C6529z;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.C8075m;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.as;
import com.google.android.m4b.maps.cg.av;
import com.google.android.m4b.maps.cg.ax;
import com.google.android.m4b.maps.cg.ax.C6602a;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bc.j */
public final class C7445j implements C4761l, C6602a {
    /* renamed from: a */
    private float f27266a;
    /* renamed from: b */
    private final av f27267b;
    /* renamed from: c */
    private final C7446m f27268c;
    /* renamed from: d */
    private final C8075m f27269d;
    /* renamed from: e */
    private final ax f27270e;

    C7445j(ax axVar, av avVar, C8075m c8075m, C7446m c7446m) {
        this.f27270e = axVar;
        this.f27267b = avVar;
        this.f27268c = c7446m;
        this.f27269d = c8075m;
        mo7036a(-1);
    }

    /* renamed from: a */
    public final void mo7035a() {
        synchronized (this.f27268c) {
            this.f27268c.m32082a((C4761l) this);
        }
        this.f27268c.m32092b();
    }

    /* renamed from: a */
    public final void mo4954a(C5052d c5052d, aj ajVar) {
        this.f27269d.mo7041a(c5052d, ajVar);
    }

    /* renamed from: a */
    public final void mo4953a(C5052d c5052d) {
        this.f27269d.mo7040a(c5052d);
    }

    /* renamed from: a */
    public final void mo4956a(boolean z) {
        this.f27269d.mo7042a(z);
    }

    /* renamed from: b */
    public final void mo4958b() {
        this.f27269d.c_();
    }

    /* renamed from: b */
    public final void mo4959b(int i) {
        this.f27269d.mo7038a(i);
    }

    /* renamed from: a */
    public final void mo4952a(C6570b c6570b, C5052d c5052d) {
        synchronized (this) {
            if (this.f27270e.m32862e()) {
                this.f27269d.mo7044a(c6570b, c5052d);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo4955a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        synchronized (this) {
            if (this.f27270e.m32862e()) {
                this.f27269d.mo5222a(c5052d, c6570b, c5009j);
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo4957a(float r10, float r11, com.google.android.m4b.maps.bo.af r12, com.google.android.m4b.maps.bz.C6570b r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f27270e;	 Catch:{ all -> 0x0026 }
        r0 = r0.m32862e();	 Catch:{ all -> 0x0026 }
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r9);	 Catch:{ all -> 0x0026 }
        return r1;
    L_0x000c:
        monitor-exit(r9);	 Catch:{ all -> 0x0026 }
        r0 = r9.f27269d;
        r8 = r0.m34324a(r12, r13, r9);
        r0 = r8.isEmpty();
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        return r1;
    L_0x001a:
        r2 = r9.f27268c;
        r3 = r10;
        r4 = r11;
        r5 = r12;
        r6 = r13;
        r7 = r9;
        r2.m32079a(r3, r4, r5, r6, r7, r8);
        r10 = 1;
        return r10;
    L_0x0026:
        r10 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0026 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.j.a(float, float, com.google.android.m4b.maps.bo.af, com.google.android.m4b.maps.bz.b):boolean");
    }

    /* renamed from: a */
    public final void m32055a(float f, float f2, af afVar, C6570b c6570b, List<as> list, List<as> list2) {
        f = this.f27269d.m34324a(afVar, c6570b, this);
        list.addAll(f);
        if (this.f27270e.m32863f() != null) {
            list2.addAll(f);
        }
    }

    /* renamed from: a */
    public final void mo4951a(long j) {
        this.f27269d.mo7039a(j);
    }

    /* renamed from: c */
    public final boolean mo4960c() {
        return this.f27269d.e_();
    }

    /* renamed from: a */
    public final void mo7037a(C4662a c4662a) {
        this.f27269d.m32452a(new C6529z(c4662a));
        this.f27268c.m32092b();
    }

    /* renamed from: e */
    public final String mo4962e() {
        return this.f27270e.m32860c();
    }

    /* renamed from: d */
    public final synchronized void mo4961d() {
        as c = this.f27267b.m22902c();
        if (c != null && c.m32852a() == this.f27270e) {
            this.f27267b.m22901b();
        }
        this.f27269d.mo7040a(null);
    }

    /* renamed from: f */
    public final float mo4963f() {
        return this.f27266a;
    }

    /* renamed from: g */
    public final ax m32071g() {
        return this.f27270e;
    }

    /* renamed from: a */
    public final void mo7036a(int i) {
        if ((i & 2) != 0) {
            synchronized (this.f27268c) {
                this.f27266a = this.f27270e.m32861d();
                this.f27268c.m32093c();
            }
        }
    }
}
