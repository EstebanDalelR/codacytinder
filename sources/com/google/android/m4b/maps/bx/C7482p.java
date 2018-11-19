package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C4846f;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.aj.C4836a;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5054e;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.p */
public final class C7482p extends C6561r {
    /* renamed from: a */
    private static final af f27570a = new af(1073741824, 0);
    /* renamed from: b */
    private static final af f27571b = new af(-1073741824, 0);
    /* renamed from: c */
    private final aj f27572c;
    /* renamed from: d */
    private aj f27573d;
    /* renamed from: e */
    private aj f27574e;
    /* renamed from: f */
    private final List<aj> f27575f;
    /* renamed from: g */
    private final C7436c f27576g;
    /* renamed from: h */
    private al f27577h;
    /* renamed from: i */
    private float f27578i;
    /* renamed from: j */
    private float f27579j;
    /* renamed from: k */
    private final C6580k f27580k;
    /* renamed from: l */
    private final C6577c f27581l;
    /* renamed from: m */
    private final C6579g f27582m;
    /* renamed from: n */
    private float f27583n;
    /* renamed from: o */
    private int f27584o;
    /* renamed from: p */
    private boolean f27585p;
    /* renamed from: q */
    private final int f27586q;
    /* renamed from: r */
    private boolean f27587r;

    public C7482p(aj ajVar, float f, int i, C7436c c7436c, boolean z) {
        this.f27587r = false;
        this.f27572c = ajVar;
        this.f27583n = f;
        this.f27584o = i;
        this.f27575f = new ArrayList();
        this.f27576g = c7436c;
        this.f27587r = z;
        List arrayList = new ArrayList();
        arrayList.add(ajVar);
        this.f27586q = C5054e.m22639a(arrayList);
        this.f27580k = new C6580k(this.f27586q);
        this.f27582m = new C6579g(this.f27586q);
        this.f27581l = new C6577c(C5054e.m22643b(arrayList));
    }

    public C7482p(aj ajVar, float f, int i, C7436c c7436c) {
        this(ajVar, f, i, null, false);
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.UNUSED;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (c5009j.m22388b() == 0) {
            if (this.f27577h == null) {
                m32490b(c6570b);
            }
            if (m32489a(c6570b)) {
                this.f27580k.mo7120a(c5052d);
                this.f27581l.mo7109a(c5052d);
                this.f27582m.mo7114a(c5052d);
                for (aj a : this.f27575f) {
                    m32487a(a, c6570b);
                }
                this.f27579j = c6570b.m29253i();
            }
            if (this.f27580k.mo5250a() > 0) {
                ah d;
                GL10 x = c5052d.m22635x();
                x.glPushMatrix();
                GL10 x2 = c5052d.m22635x();
                if (!(this.f27576g == null || this.f27575f.size() == 0)) {
                    if (((aj) this.f27575f.get(0)).m21528b() != 0) {
                        d = C6487i.m28476a().m28504d(this.f27576g);
                        if (d != null) {
                            d.mo5088a(c5052d, c6570b, c5009j, ((aj) this.f27575f.get(0)).m21522a(0));
                        }
                        an.m22329b(c5052d, c6570b, this.f27577h.m32212c(), (float) this.f27577h.m32215f());
                        c5052d.m22627p();
                        x2.glBlendFunc(1, 771);
                        x2.glTexEnvx(8960, 8704, 8448);
                        m32488a(x2);
                        c5052d.m22607a().m22653a(24).m32544a(c5052d.m22635x());
                        this.f27580k.mo7123d(c5052d);
                        this.f27582m.mo7118d(c5052d);
                        this.f27581l.mo7110a(c5052d, 4);
                        c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
                        if (d != null) {
                            d.mo5087a(c5052d, c5009j);
                        }
                        x.glPopMatrix();
                    }
                }
                d = null;
                if (d != null) {
                    d.mo5088a(c5052d, c6570b, c5009j, ((aj) this.f27575f.get(0)).m21522a(0));
                }
                an.m22329b(c5052d, c6570b, this.f27577h.m32212c(), (float) this.f27577h.m32215f());
                c5052d.m22627p();
                x2.glBlendFunc(1, 771);
                x2.glTexEnvx(8960, 8704, 8448);
                m32488a(x2);
                c5052d.m22607a().m22653a(24).m32544a(c5052d.m22635x());
                this.f27580k.mo7123d(c5052d);
                this.f27582m.mo7118d(c5052d);
                this.f27581l.mo7110a(c5052d, 4);
                c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
                if (d != null) {
                    d.mo5087a(c5052d, c5009j);
                }
                x.glPopMatrix();
            }
        }
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        mo5223b(c5052d);
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27580k.m29354c(c5052d);
        this.f27581l.m29319c(c5052d);
        this.f27582m.m29340c(c5052d);
    }

    /* renamed from: a */
    private void m32488a(GL10 gl10) {
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            i = (this.f27584o >> 16) & 65280;
            i2 = (this.f27584o >> 8) & 65280;
            i3 = this.f27584o & 65280;
            i4 = 65280 & (this.f27584o << 8);
        }
        gl10.glColor4x(i2, i3, i4, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m32489a(com.google.android.m4b.maps.bz.C6570b r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f27585p;	 Catch:{ all -> 0x0024 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r4.f27585p = r2;	 Catch:{ all -> 0x0024 }
        monitor-exit(r4);	 Catch:{ all -> 0x0024 }
        return r1;
    L_0x000b:
        monitor-exit(r4);	 Catch:{ all -> 0x0024 }
        r5 = r5.m29253i();
        r0 = r4.f27579j;
        r3 = 1067450368; // 0x3fa00000 float:1.25 double:5.273905555E-315;
        r0 = r0 * r3;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0023;
    L_0x001a:
        r0 = r4.f27579j;
        r0 = r0 / r3;
        r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r5 >= 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        return r2;
    L_0x0023:
        return r1;
    L_0x0024:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0024 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.p.a(com.google.android.m4b.maps.bz.b):boolean");
    }

    /* renamed from: b */
    private void m32490b(C6570b c6570b) {
        aj ajVar;
        af f;
        af e;
        List<aj> arrayList;
        List a;
        List arrayList2;
        C4836a c4836a;
        af a2;
        af afVar;
        int f2;
        int i;
        C4836a c4836a2;
        this.f27575f.clear();
        float l = c6570b.m29256l();
        if (l > 10.0f) {
            ajVar = r0.f27572c;
        } else {
            if (r0.f27573d == null) {
                r0.f27573d = r0.f27572c.m21529b((float) C7483s.m32499a(10, r0.f27587r));
                r0.f27574e = r0.f27573d.m21529b((float) C7483s.m32499a(6, r0.f27587r));
            }
            if (l > 6.0f) {
                ajVar = r0.f27573d;
            } else {
                ajVar = r0.f27574e;
            }
        }
        al b = c6570b.m29265u().m28662b();
        int f3 = b.m32215f();
        int g = b.m32216g();
        int i2 = 536870912;
        int i3 = 1;
        if (f3 <= 119304647) {
            if (g <= 119304647) {
                af afVar2 = new af(f3 * 4, g * 4);
                f = b.m32212c().m21491f(afVar2);
                e = b.m32213d().m21489e(afVar2);
                r0.f27577h = new al(f, e);
                arrayList = new ArrayList();
                ajVar = ajVar.m21529b((float) C7483s.m32499a(((int) c6570b.m29256l()) + 1, r0.f27587r));
                if (ajVar.m21528b() >= 2) {
                    a = au.m20527a(ajVar);
                } else {
                    arrayList2 = new ArrayList();
                    c4836a = new C4836a(ajVar.m21528b());
                    a2 = ajVar.m21522a(0);
                    c4836a.m21514a(a2);
                    afVar = new af();
                    while (i3 < ajVar.m21528b()) {
                        ajVar.m21524a(i3, afVar);
                        if (afVar.m21490f() >= a2.m21490f()) {
                            f2 = (afVar.m21490f() - a2.m21490f()) + 1073741824;
                            if (f2 >= a2.m21490f() - afVar.m21490f()) {
                                int g2 = afVar.m21492g() - a2.m21492g();
                                i = i3;
                                i2 = a2.m21492g() + ((int) Math.round((((double) g2) * ((double) (i2 - a2.m21490f()))) / ((double) f2)));
                                c4836a.m21514a(new af(536870911, i2));
                                arrayList2.add(c4836a.m21516c());
                                c4836a.m21515b();
                                c4836a.m21514a(new af(-536870912, i2));
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                            if (afVar.m21490f() > a2.m21490f()) {
                                i3 = (a2.m21490f() - afVar.m21490f()) + 1073741824;
                                if (i3 < afVar.m21490f() - a2.m21490f()) {
                                    int g3 = afVar.m21492g() - a2.m21492g();
                                    f2 = a2.m21492g() + ((int) Math.round((((double) g3) * ((double) (a2.m21490f() + 536870912))) / ((double) i3)));
                                    c4836a2 = c4836a;
                                    c4836a2.m21514a(new af(-536870912, f2));
                                    arrayList2.add(c4836a2.m21516c());
                                    c4836a2.m21515b();
                                    c4836a2.m21514a(new af(536870911, f2));
                                    c4836a2.m21514a(afVar);
                                    a2.m21482b(afVar);
                                    c4836a = c4836a2;
                                    i3 = i + 1;
                                    i2 = 536870912;
                                }
                            }
                        }
                        c4836a2 = c4836a;
                        c4836a2.m21514a(afVar);
                        a2.m21482b(afVar);
                        c4836a = c4836a2;
                        i3 = i + 1;
                        i2 = 536870912;
                    }
                    ajVar = c4836a.m21516c();
                    if (ajVar.m21528b() >= 2) {
                        arrayList2.add(ajVar);
                    }
                    a = arrayList2;
                }
                for (aj ajVar2 : r1) {
                    new C4846f(r0.f27577h).m21746a(ajVar2, arrayList);
                    r0.f27575f.addAll(arrayList);
                    arrayList.clear();
                    new C4846f(new al(f.m21489e(f27570a), e.m21489e(f27570a))).m21746a(ajVar2, arrayList);
                    for (aj b2 : arrayList) {
                        r0.f27575f.add(b2.m21530b(f27571b));
                    }
                    arrayList.clear();
                    new C4846f(new al(f.m21489e(f27571b), e.m21489e(f27571b))).m21746a(ajVar2, arrayList);
                    for (aj b3 : arrayList) {
                        r0.f27575f.add(b3.m21530b(f27570a));
                    }
                    arrayList.clear();
                }
                r0.f27578i = c6570b.m29253i();
            }
        }
        f = new af(b.m32214e().m21490f() - 536870912, -1073741824);
        e = new af((b.m32214e().m21490f() + 536870912) - 1, 1073741823);
        r0.f27577h = new al(f, e);
        arrayList = new ArrayList();
        ajVar = ajVar.m21529b((float) C7483s.m32499a(((int) c6570b.m29256l()) + 1, r0.f27587r));
        if (ajVar.m21528b() >= 2) {
            arrayList2 = new ArrayList();
            c4836a = new C4836a(ajVar.m21528b());
            a2 = ajVar.m21522a(0);
            c4836a.m21514a(a2);
            afVar = new af();
            while (i3 < ajVar.m21528b()) {
                ajVar.m21524a(i3, afVar);
                if (afVar.m21490f() >= a2.m21490f()) {
                    i = i3;
                    if (afVar.m21490f() > a2.m21490f()) {
                        i3 = (a2.m21490f() - afVar.m21490f()) + 1073741824;
                        if (i3 < afVar.m21490f() - a2.m21490f()) {
                            int g32 = afVar.m21492g() - a2.m21492g();
                            f2 = a2.m21492g() + ((int) Math.round((((double) g32) * ((double) (a2.m21490f() + 536870912))) / ((double) i3)));
                            c4836a2 = c4836a;
                            c4836a2.m21514a(new af(-536870912, f2));
                            arrayList2.add(c4836a2.m21516c());
                            c4836a2.m21515b();
                            c4836a2.m21514a(new af(536870911, f2));
                            c4836a2.m21514a(afVar);
                            a2.m21482b(afVar);
                            c4836a = c4836a2;
                            i3 = i + 1;
                            i2 = 536870912;
                        }
                    }
                } else {
                    f2 = (afVar.m21490f() - a2.m21490f()) + 1073741824;
                    if (f2 >= a2.m21490f() - afVar.m21490f()) {
                        i = i3;
                    } else {
                        int g22 = afVar.m21492g() - a2.m21492g();
                        i = i3;
                        i2 = a2.m21492g() + ((int) Math.round((((double) g22) * ((double) (i2 - a2.m21490f()))) / ((double) f2)));
                        c4836a.m21514a(new af(536870911, i2));
                        arrayList2.add(c4836a.m21516c());
                        c4836a.m21515b();
                        c4836a.m21514a(new af(-536870912, i2));
                    }
                }
                c4836a2 = c4836a;
                c4836a2.m21514a(afVar);
                a2.m21482b(afVar);
                c4836a = c4836a2;
                i3 = i + 1;
                i2 = 536870912;
            }
            ajVar = c4836a.m21516c();
            if (ajVar.m21528b() >= 2) {
                arrayList2.add(ajVar);
            }
            a = arrayList2;
        } else {
            a = au.m20527a(ajVar);
        }
        for (aj ajVar22 : r1) {
            new C4846f(r0.f27577h).m21746a(ajVar22, arrayList);
            r0.f27575f.addAll(arrayList);
            arrayList.clear();
            new C4846f(new al(f.m21489e(f27570a), e.m21489e(f27570a))).m21746a(ajVar22, arrayList);
            while (r6.hasNext()) {
                r0.f27575f.add(b2.m21530b(f27571b));
            }
            arrayList.clear();
            new C4846f(new al(f.m21489e(f27571b), e.m21489e(f27571b))).m21746a(ajVar22, arrayList);
            while (r5.hasNext()) {
                r0.f27575f.add(b3.m21530b(f27570a));
            }
            arrayList.clear();
        }
        r0.f27578i = c6570b.m29253i();
    }

    /* renamed from: a */
    private void m32487a(aj ajVar, C6570b c6570b) {
        float r;
        af c = this.f27577h.m32212c();
        int f = this.f27577h.m32215f();
        synchronized (this) {
            r = (((c6570b.m29262r() * this.f27583n) * 0.5f) / 7.0f) * 8.0f;
        }
        C5054e.m22640a().m22645a(ajVar, r, r, c, f, 0, 65536, this.f27580k, this.f27581l, this.f27582m);
    }

    /* renamed from: b */
    public final synchronized void m32495b(int i) {
        this.f27584o = i;
    }

    /* renamed from: a */
    public final synchronized void m32491a(float f) {
        this.f27583n = f;
        this.f27585p = true;
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        if (this.f27577h != null) {
            c5052d = c6570b.m29253i();
            if (c5052d <= this.f27578i * 2.0f) {
                if (c5052d >= this.f27578i / 2.0f) {
                    if (this.f27577h.mo7069b(c6570b.m29265u().mo5133c()) != null) {
                        c5052d = null;
                        if (c5052d != null) {
                            m32490b(c6570b);
                            synchronized (this) {
                                this.f27585p = true;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        c5052d = true;
        if (c5052d != null) {
            m32490b(c6570b);
            synchronized (this) {
                this.f27585p = true;
            }
        }
        return true;
    }
}
