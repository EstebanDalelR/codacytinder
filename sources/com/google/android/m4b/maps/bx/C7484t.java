package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.C7462l;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cb.C5062a;
import com.google.android.m4b.maps.cb.C6580k;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.t */
public final class C7484t extends C6561r {
    /* renamed from: a */
    private static final float f27612a = ((float) Math.tan(0.08726646259971647d));
    /* renamed from: b */
    private static final float f27613b = ((float) Math.tan(0.05235987755982989d));
    /* renamed from: c */
    private af f27614c;
    /* renamed from: d */
    private int f27615d = 1;
    /* renamed from: e */
    private C5008i f27616e = C5008i.NONE;
    /* renamed from: f */
    private boolean f27617f;
    /* renamed from: g */
    private final C6580k f27618g = new C6580k(6);
    /* renamed from: h */
    private final C5062a f27619h = new C5062a(6);
    /* renamed from: i */
    private final C5062a f27620i;
    /* renamed from: j */
    private final af f27621j = new af();
    /* renamed from: k */
    private final af f27622k = new af();

    public C7484t() {
        int a = C7484t.m32521a(ai.m29003a(C5008i.NORMAL));
        this.f27619h.m22668a(a, 2);
        this.f27619h.m22668a(a | 255, 4);
        this.f27620i = new C5062a(6);
        a = C7484t.m32521a(ai.m29003a(C5008i.NIGHT));
        this.f27620i.m22668a(a, 2);
        this.f27620i.m22668a(a | 255, 4);
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.SKY;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        Object obj;
        float b;
        C5008i a = c5009j.m22385a();
        if (!this.f27617f) {
            if (a == this.f27616e) {
                obj = null;
                if (obj != null) {
                    a = c5009j.m22385a();
                    this.f27618g.mo7120a(c5052d);
                    if (!(a == C5008i.NONE || a == C5008i.RASTER_ONLY)) {
                        if (c6570b.m29255k() == 0.0f) {
                            b = C6570b.m29228b((float) c6570b.m29258n().m21494h()) - (a != C5008i.HYBRID ? 3.0f : 5.0f);
                            if (c6570b.m29255k() + (c6570b.m29252h() * 0.5f) > b) {
                                int i = (int) c6570b.m29253i();
                                this.f27615d = i;
                                C7462l c7462l = (C7462l) c6570b.m29246c(b).mo5133c();
                                this.f27614c = c7462l.m32263d();
                                this.f27621j.m21487d(0, 0);
                                af.m21468b(c7462l.m32262c(), this.f27614c, this.f27622k);
                                this.f27618g.mo5257a(this.f27621j, this.f27615d);
                                this.f27618g.mo5257a(this.f27622k, this.f27615d);
                                int c = (int) (this.f27614c.m21483c(c6570b.m29258n()) * (a != C5008i.HYBRID ? f27613b : f27612a));
                                this.f27621j.m21476a(c);
                                this.f27622k.m21476a(c);
                                this.f27618g.mo5257a(this.f27621j, this.f27615d);
                                this.f27618g.mo5257a(this.f27622k, this.f27615d);
                                this.f27621j.m21476a(i);
                                this.f27622k.m21476a(i);
                                this.f27618g.mo5257a(this.f27621j, this.f27615d);
                                this.f27618g.mo5257a(this.f27622k, this.f27615d);
                            }
                        }
                    }
                }
                if (this.f27618g.mo5250a() == 0) {
                    GL10 x = c5052d.m22635x();
                    x.glPushMatrix();
                    an.m22324a(c5052d, c6570b, this.f27614c, (float) this.f27615d);
                    c5052d.m22625n();
                    c5052d.m22630s();
                    x.glBlendFunc(770, 771);
                    this.f27618g.mo7123d(c5052d);
                    if (c5009j.m22385a() != C5008i.NIGHT) {
                        this.f27620i.mo5269c(c5052d);
                    } else {
                        this.f27619h.mo5269c(c5052d);
                    }
                    x.glDrawArrays(5, 0, this.f27618g.mo5250a());
                    x.glPopMatrix();
                }
            }
        }
        this.f27616e = a;
        this.f27617f = false;
        obj = 1;
        if (obj != null) {
            a = c5009j.m22385a();
            this.f27618g.mo7120a(c5052d);
            if (c6570b.m29255k() == 0.0f) {
                if (a != C5008i.HYBRID) {
                }
                b = C6570b.m29228b((float) c6570b.m29258n().m21494h()) - (a != C5008i.HYBRID ? 3.0f : 5.0f);
                if (c6570b.m29255k() + (c6570b.m29252h() * 0.5f) > b) {
                    int i2 = (int) c6570b.m29253i();
                    this.f27615d = i2;
                    C7462l c7462l2 = (C7462l) c6570b.m29246c(b).mo5133c();
                    this.f27614c = c7462l2.m32263d();
                    this.f27621j.m21487d(0, 0);
                    af.m21468b(c7462l2.m32262c(), this.f27614c, this.f27622k);
                    this.f27618g.mo5257a(this.f27621j, this.f27615d);
                    this.f27618g.mo5257a(this.f27622k, this.f27615d);
                    if (a != C5008i.HYBRID) {
                    }
                    int c2 = (int) (this.f27614c.m21483c(c6570b.m29258n()) * (a != C5008i.HYBRID ? f27613b : f27612a));
                    this.f27621j.m21476a(c2);
                    this.f27622k.m21476a(c2);
                    this.f27618g.mo5257a(this.f27621j, this.f27615d);
                    this.f27618g.mo5257a(this.f27622k, this.f27615d);
                    this.f27621j.m21476a(i2);
                    this.f27622k.m21476a(i2);
                    this.f27618g.mo5257a(this.f27621j, this.f27615d);
                    this.f27618g.mo5257a(this.f27622k, this.f27615d);
                }
            }
        }
        if (this.f27618g.mo5250a() == 0) {
            GL10 x2 = c5052d.m22635x();
            x2.glPushMatrix();
            an.m22324a(c5052d, c6570b, this.f27614c, (float) this.f27615d);
            c5052d.m22625n();
            c5052d.m22630s();
            x2.glBlendFunc(770, 771);
            this.f27618g.mo7123d(c5052d);
            if (c5009j.m22385a() != C5008i.NIGHT) {
                this.f27619h.mo5269c(c5052d);
            } else {
                this.f27620i.mo5269c(c5052d);
            }
            x2.glDrawArrays(5, 0, this.f27618g.mo5250a());
            x2.glPopMatrix();
        }
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        this.f27617f = true;
        return true;
    }

    /* renamed from: a */
    private static int m32521a(int[] iArr) {
        return (iArr[2] & 65280) | (((iArr[0] & 65280) << 16) | ((iArr[1] & 65280) << 8));
    }
}
