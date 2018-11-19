package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C5007g;
import com.google.android.m4b.maps.bx.ad;
import com.google.android.m4b.maps.bx.ap;
import com.google.android.m4b.maps.bx.ap.C4995e;
import com.google.android.m4b.maps.bz.C5044d;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: com.google.android.m4b.maps.bc.u */
public final class C4769u {
    /* renamed from: a */
    private int f17442a = 0;
    /* renamed from: b */
    private int f17443b = 0;
    /* renamed from: c */
    private int f17444c = 0;
    /* renamed from: d */
    private int f17445d = 0;
    /* renamed from: e */
    private int[] f17446e;
    /* renamed from: f */
    private C6450v f17447f = null;
    /* renamed from: g */
    private final ap f17448g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4769u(com.google.android.m4b.maps.bx.ap r2, com.google.android.m4b.maps.bc.C6450v r3) {
        /*
        r1 = this;
        r1.<init>();
        r0 = 0;
        r1.f17442a = r0;
        r1.f17443b = r0;
        r1.f17444c = r0;
        r1.f17445d = r0;
        r0 = 0;
        r1.f17447f = r0;
        r1.f17448g = r2;
        r1.f17447f = r3;
        r2 = 4;
        r2 = new int[r2];
        r2 = {0, 0, 0, 0};
        r1.f17446e = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.u.<init>(com.google.android.m4b.maps.bx.ap, com.google.android.m4b.maps.bc.v):void");
    }

    /* renamed from: a */
    public final void m21132a(int i, int i2, int i3, int i4) {
        this.f17446e[0] = i;
        this.f17446e[1] = i2;
        this.f17446e[2] = i3;
        this.f17446e[3] = i4;
    }

    /* renamed from: a */
    public final int[] m21138a() {
        return this.f17446e;
    }

    /* renamed from: b */
    public final int m21139b() {
        return this.f17446e[0] + this.f17446e[2];
    }

    /* renamed from: c */
    public final int m21141c() {
        return this.f17446e[1] + this.f17446e[3];
    }

    /* renamed from: g */
    private void m21126g() {
        if (this.f17447f != null) {
            this.f17442a = (this.f17447f.getWidth() - this.f17446e[0]) - this.f17446e[2];
            this.f17443b = (this.f17447f.getHeight() - this.f17446e[1]) - this.f17446e[3];
            this.f17444c = this.f17446e[0] + (this.f17442a / 2);
            this.f17445d = this.f17446e[1] + (this.f17443b / 2);
        }
    }

    /* renamed from: a */
    public final C6571c m21130a(C6571c c6571c, float f) {
        m21126g();
        C6570b o = this.f17447f.m28301o();
        f *= (float) Math.pow(2.0d, (double) (o.m29256l() - c6571c.m29269a()));
        float width = (((float) ((((double) this.f17447f.getWidth()) / 2.0d) - ((double) this.f17444c))) * f) * o.m29262r();
        f = ((-(((float) ((((double) this.f17447f.getHeight()) / 2.0d) - ((double) this.f17445d))) * f)) * o.m29262r()) / ((float) Math.cos((double) (o.m29255k() * 0.017453292f)));
        af o2 = o.m29259o();
        af p = o.m29260p();
        af afVar = new af(o2.m21490f(), o2.m21492g());
        o2 = new af(p.m21490f(), p.m21492g());
        af.m21467b(afVar, width, afVar);
        af.m21467b(o2, f, o2);
        f = c6571c.m29272c();
        float a = c6571c.m29269a();
        int h = f.m21494h();
        af e = f.m21489e(afVar);
        af.m21463a(e, o2, e);
        e.m21476a(h);
        return new C6571c(e, a, c6571c.m29273d(), c6571c.m29274e(), 0.0f);
    }

    /* renamed from: a */
    private void m21125a(C5044d c5044d, int i) {
        m21137a(c5044d, i, i == 0 ? 0 : -1);
    }

    /* renamed from: a */
    public final void m21133a(af afVar, int i) {
        i = this.f17447f.m28301o();
        m21125a(new C6571c(afVar, i.m29256l(), i.m29255k(), i.m29254j(), 0.0f), (int) MapboxConstants.ANIMATION_DURATION);
    }

    /* renamed from: d */
    public final C6571c m21142d() {
        return m21130a(this.f17448g.m29064b(), -1.0f);
    }

    /* renamed from: a */
    public final float m21129a(af afVar) {
        return this.f17448g.m29052a(afVar);
    }

    /* renamed from: e */
    public final float m21143e() {
        return this.f17448g.m29048a();
    }

    /* renamed from: a */
    public final void m21131a(float f, float f2) {
        this.f17448g.m29055a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m21134a(ad adVar) {
        this.f17448g.m29056a(adVar);
    }

    /* renamed from: a */
    public final void m21136a(C5007g c5007g) {
        this.f17448g.m29060a(c5007g);
    }

    /* renamed from: f */
    public final float m21144f() {
        return this.f17448g.m29067c();
    }

    /* renamed from: a */
    public final float m21128a(float f, int i) {
        m21126g();
        return m21127a(f, (float) this.f17444c, (float) this.f17445d, i);
    }

    /* renamed from: b */
    public final void m21140b(float f, int i) {
        m21126g();
        C6571c d = m21142d();
        m21125a(new C6571c(d.m29272c(), f, d.m29273d(), d.m29274e(), d.m29275f()), i);
    }

    /* renamed from: a */
    public final float m21127a(float f, float f2, float f3, int i) {
        return this.f17448g.m29050a(f, f2, f3, i);
    }

    /* renamed from: a */
    public final void m21135a(C4995e c4995e) {
        this.f17448g.m29058a(c4995e);
    }

    /* renamed from: a */
    public final void m21137a(C5044d c5044d, int i, int i2) {
        int i3 = 1;
        if (this.f17447f != null) {
            if (this.f17446e[0] == 0 && this.f17446e[2] == 0 && this.f17446e[1] == 0) {
                if (this.f17446e[3] != 0) {
                }
            }
            if (i3 == 0) {
                this.f17448g.m29061a(m21130a(c5044d.mo5249b(), 1.0f), i, i2);
            }
            this.f17448g.m29061a(c5044d, i, i2);
            return;
        }
        i3 = 0;
        if (i3 == 0) {
            this.f17448g.m29061a(c5044d, i, i2);
            return;
        }
        this.f17448g.m29061a(m21130a(c5044d.mo5249b(), 1.0f), i, i2);
    }
}
