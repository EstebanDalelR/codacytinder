package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.bm.C6482f;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5061n;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6580k;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.a */
public final class C7477a extends C6561r {
    /* renamed from: i */
    private static C6580k f27495i = new C6580k(100);
    /* renamed from: j */
    private static C6577c f27496j = new C6577c(100);
    /* renamed from: k */
    private static C6580k f27497k = new C6580k(101);
    /* renamed from: l */
    private static C6577c f27498l = new C6577c(102);
    /* renamed from: a */
    private String f27499a;
    /* renamed from: b */
    private af f27500b = null;
    /* renamed from: c */
    private C7436c f27501c;
    /* renamed from: d */
    private al f27502d;
    /* renamed from: e */
    private int f27503e = 0;
    /* renamed from: f */
    private float f27504f;
    /* renamed from: g */
    private int f27505g;
    /* renamed from: h */
    private int f27506h;
    /* renamed from: m */
    private float f27507m;

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        return true;
    }

    static {
        C5061n.m22661a(f27495i, f27496j);
        C5061n.m22662b(f27497k, f27498l);
    }

    public C7477a(af afVar, int i, int i2, int i3, C7436c c7436c, String str) {
        m32417f();
        this.f27505g = 0;
        this.f27506h = 0;
        this.f27507m = 1065353216;
        this.f27501c = null;
        this.f27499a = str;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.UNUSED;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (c5009j.m22388b() <= null && this.f27500b != null) {
            if (this.f27504f != 0.0f) {
                if (c6570b.m29265u().mo5129a().mo5135b(this.f27502d) != null) {
                    c5009j = c5052d.m22635x();
                    c5009j.glPushMatrix();
                    if (this.f27501c != null) {
                        C6482f d = C6487i.m28476a().m28504d(this.f27501c);
                        if (d != null) {
                            this.f27500b.m21476a((int) d.m28449a(c6570b, this.f27500b));
                        }
                    }
                    float r = c6570b.m29262r();
                    an.m22324a(c5052d, c6570b, this.f27500b, r);
                    c6570b = this.f27504f / r;
                    GL10 x = c5052d.m22635x();
                    x.glScalef(c6570b, c6570b, c6570b);
                    x.glBlendFunc(770, 771);
                    f27497k.mo7123d(c5052d);
                    C5051c.m22593a(x, this.f27506h);
                    f27498l.mo7110a(c5052d, 6);
                    f27495i.mo7123d(c5052d);
                    C5051c.m22593a(x, this.f27505g);
                    x.glLineWidth(this.f27507m);
                    f27496j.mo7110a(c5052d, 2);
                    c5009j.glPopMatrix();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m32419a(af afVar, int i) {
        if (afVar != this.f27500b || this.f27503e != i) {
            this.f27500b = afVar;
            this.f27503e = i;
            m32417f();
        }
    }

    /* renamed from: b */
    public final void m32422b(int i) {
        this.f27505g = i;
    }

    /* renamed from: c */
    public final void m32423c(int i) {
        this.f27506h = i;
    }

    /* renamed from: a */
    public final void m32418a(float f) {
        this.f27507m = 2.0f;
    }

    /* renamed from: f */
    private void m32417f() {
        float e;
        int i = this.f27503e / 2;
        af afVar = this.f27500b;
        if (afVar != null) {
            if (i != 0) {
                e = ((float) i) * ((float) afVar.m21488e());
                this.f27504f = e;
                if (this.f27500b != null) {
                    this.f27502d = al.m32202a(this.f27500b, ((int) this.f27504f) + 1);
                }
            }
        }
        e = 0.0f;
        this.f27504f = e;
        if (this.f27500b != null) {
            this.f27502d = al.m32202a(this.f27500b, ((int) this.f27504f) + 1);
        }
    }
}
