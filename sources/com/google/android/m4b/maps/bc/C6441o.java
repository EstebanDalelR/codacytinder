package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.aj.C4836a;
import com.google.android.m4b.maps.bx.C7482p;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bc.o */
public final class C6441o implements C4761l, C5148a {
    /* renamed from: a */
    private final bg f23912a;
    /* renamed from: b */
    private final List<aj> f23913b = new ArrayList();
    /* renamed from: c */
    private final List<C7482p> f23914c = new ArrayList();
    /* renamed from: d */
    private float f23915d;
    /* renamed from: e */
    private final C7446m f23916e;

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

    public C6441o(C7446m c7446m, bg bgVar) {
        this.f23916e = c7446m;
        this.f23912a = bgVar;
        mo4985a(-1);
    }

    /* renamed from: a */
    public final void mo4984a() {
        synchronized (this.f23916e) {
            this.f23916e.m32082a((C4761l) this);
        }
        this.f23916e.m32092b();
    }

    /* renamed from: g */
    private synchronized void m28223g() {
        List<LatLng> b = this.f23912a.mo7181b();
        List list = this.f23913b;
        list.clear();
        C4836a c4836a = new C4836a();
        af afVar = null;
        for (LatLng b2 : b) {
            af b3 = C4754b.m21100b(b2);
            if (afVar != null) {
                if (Math.abs(b3.m21490f() - afVar.m21490f()) > 536870912) {
                    float g;
                    if (b3.m21490f() - afVar.m21490f() > 536870912) {
                        g = ((float) (b3.m21492g() - afVar.m21492g())) / ((float) ((b3.m21490f() - afVar.m21490f()) - 1073741824));
                        af afVar2 = new af(-536870912, (int) (((float) afVar.m21492g()) + (((float) (-536870912 - afVar.m21490f())) * g)));
                        afVar = new af(536870911, (int) (((float) b3.m21492g()) + (g * ((float) (536870912 - b3.m21490f())))));
                        c4836a.m21514a(afVar2);
                        list.add(c4836a.m21516c());
                        c4836a = new C4836a();
                        c4836a.m21514a(afVar);
                        c4836a.m21514a(b3);
                    } else if (b3.m21490f() - afVar.m21490f() < -536870912) {
                        g = ((float) (afVar.m21492g() - b3.m21492g())) / ((float) ((afVar.m21490f() - b3.m21490f()) - 1073741824));
                        af afVar3 = new af(536870911, (int) (((float) afVar.m21492g()) + (((float) (536870911 - afVar.m21490f())) * g)));
                        afVar = new af(-536870912, (int) (((float) b3.m21492g()) + (g * ((float) (-536870912 - b3.m21490f())))));
                        c4836a.m21514a(afVar3);
                        list.add(c4836a.m21516c());
                        c4836a = new C4836a();
                        c4836a.m21514a(afVar);
                        c4836a.m21514a(b3);
                    } else {
                        throw new AssertionError();
                    }
                    afVar = b3;
                }
            }
            c4836a.m21514a(b3);
            afVar = b3;
        }
        list.add(c4836a.m21516c());
        C6441o.m28222a(this.f23913b, this.f23912a.mo7185f(), this.f23912a.mo7183d(), this.f23914c);
    }

    /* renamed from: a */
    private static void m28222a(List<aj> list, float f, int i, List<C7482p> list2) {
        list2.clear();
        i = C4754b.m21093a(i);
        for (aj ajVar : list) {
            if (ajVar.m21528b() > 0) {
                list2.add(new C7482p(ajVar, f, i, null));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo4954a(C5052d c5052d, com.google.android.m4b.maps.bx.aj ajVar) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void mo4952a(com.google.android.m4b.maps.bz.C6570b r3, com.google.android.m4b.maps.ca.C5052d r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f23912a;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0026;
    L_0x0005:
        r0 = r2.f23912a;	 Catch:{ all -> 0x0028 }
        r0 = r0.mo7187h();	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0026;
    L_0x000e:
        r0 = r2.f23914c;	 Catch:{ all -> 0x0028 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0028 }
    L_0x0014:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0024;
    L_0x001a:
        r1 = r0.next();	 Catch:{ all -> 0x0028 }
        r1 = (com.google.android.m4b.maps.bx.C7482p) r1;	 Catch:{ all -> 0x0028 }
        r1.mo7044a(r3, r4);	 Catch:{ all -> 0x0028 }
        goto L_0x0014;
    L_0x0024:
        monitor-exit(r2);
        return;
    L_0x0026:
        monitor-exit(r2);
        return;
    L_0x0028:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.o.a(com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.ca.d):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void mo4955a(com.google.android.m4b.maps.ca.C5052d r3, com.google.android.m4b.maps.bz.C6570b r4, com.google.android.m4b.maps.bx.C5009j r5) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f23912a;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0026;
    L_0x0005:
        r0 = r2.f23912a;	 Catch:{ all -> 0x0028 }
        r0 = r0.mo7187h();	 Catch:{ all -> 0x0028 }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0026;
    L_0x000e:
        r0 = r2.f23914c;	 Catch:{ all -> 0x0028 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0028 }
    L_0x0014:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0024;
    L_0x001a:
        r1 = r0.next();	 Catch:{ all -> 0x0028 }
        r1 = (com.google.android.m4b.maps.bx.C7482p) r1;	 Catch:{ all -> 0x0028 }
        r1.mo5222a(r3, r4, r5);	 Catch:{ all -> 0x0028 }
        goto L_0x0014;
    L_0x0024:
        monitor-exit(r2);
        return;
    L_0x0026:
        monitor-exit(r2);
        return;
    L_0x0028:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.o.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final synchronized boolean mo4960c() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f23912a;	 Catch:{ all -> 0x002e }
        r1 = 1;
        if (r0 == 0) goto L_0x002c;
    L_0x0006:
        r0 = r3.f23912a;	 Catch:{ all -> 0x002e }
        r0 = r0.mo7187h();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x002c;
    L_0x000f:
        r0 = r3.f23914c;	 Catch:{ all -> 0x002e }
        r0 = r0.iterator();	 Catch:{ all -> 0x002e }
    L_0x0015:
        r2 = r0.hasNext();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x002a;
    L_0x001b:
        r2 = r0.next();	 Catch:{ all -> 0x002e }
        r2 = (com.google.android.m4b.maps.bx.C7482p) r2;	 Catch:{ all -> 0x002e }
        r2 = r2.e_();	 Catch:{ all -> 0x002e }
        if (r2 != 0) goto L_0x0015;
    L_0x0027:
        r0 = 0;
        monitor-exit(r3);
        return r0;
    L_0x002a:
        monitor-exit(r3);
        return r1;
    L_0x002c:
        monitor-exit(r3);
        return r1;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.o.c():boolean");
    }

    /* renamed from: e */
    public final String mo4962e() {
        return this.f23912a.getId();
    }

    /* renamed from: f */
    public final float mo4963f() {
        return this.f23915d;
    }

    /* renamed from: a */
    public final void mo4985a(int i) {
        if ((i & 1) != 0) {
            m28223g();
        }
        if ((i & 8) != 0) {
            for (C7482p b : this.f23914c) {
                b.m32495b(C4754b.m21093a(this.f23912a.mo7183d()));
            }
        }
        if ((i & 4) != 0) {
            for (C7482p b2 : this.f23914c) {
                b2.m32491a(this.f23912a.mo7185f());
            }
        }
        if ((i & 64) != 0) {
            synchronized (this.f23916e) {
                this.f23915d = this.f23912a.mo7186g();
                this.f23916e.m32093c();
            }
            this.f23916e.m32092b();
        }
        this.f23916e.m32092b();
    }
}
