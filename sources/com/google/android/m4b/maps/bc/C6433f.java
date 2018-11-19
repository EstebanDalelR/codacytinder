package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bx.an;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cg.C7520v;
import com.google.android.m4b.maps.cg.C7520v.C5193a;
import com.google.android.m4b.maps.model.LatLngBounds;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bc.f */
public final class C6433f implements C4761l, C5193a {
    /* renamed from: a */
    private final C7446m f23868a;
    /* renamed from: b */
    private final C7520v f23869b;
    /* renamed from: c */
    private af f23870c = new af();
    /* renamed from: d */
    private bq f23871d;
    /* renamed from: e */
    private C6580k f23872e;
    /* renamed from: f */
    private C7490k f23873f;
    /* renamed from: g */
    private C6579g f23874g;
    /* renamed from: h */
    private float f23875h;

    /* renamed from: a */
    public final void mo4951a(long j) {
    }

    /* renamed from: a */
    public final void mo4952a(C6570b c6570b, C5052d c5052d) {
    }

    /* renamed from: a */
    public final void mo4954a(C5052d c5052d, aj ajVar) {
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

    /* renamed from: c */
    public final boolean mo4960c() {
        return true;
    }

    public C6433f(C7446m c7446m, C7520v c7520v) {
        this.f23868a = c7446m;
        this.f23869b = c7520v;
        mo4950a(-1);
    }

    /* renamed from: a */
    public final void mo4949a() {
        synchronized (this.f23868a) {
            this.f23868a.m32082a((C4761l) this);
        }
        this.f23868a.m32092b();
    }

    /* renamed from: a */
    public final synchronized void mo4953a(C5052d c5052d) {
        m28144g();
    }

    /* renamed from: a */
    public final synchronized void mo4955a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        synchronized (this.f23869b) {
            if (!this.f23869b.m33176h()) {
            } else if (c6570b.m29265u().mo5135b(this.f23871d.m28675b()) || this.f23871d.m28680f().m21490f() > this.f23871d.m28681g().m21490f()) {
                float b;
                GL10 x = c5052d.m22635x();
                this.f23872e.mo7123d(c5052d);
                c5052d.m22627p();
                if (this.f23873f == null) {
                    this.f23873f = new C7490k(c5052d);
                    this.f23873f.m32552c(true);
                    this.f23873f.m32555d(true);
                    this.f23873f.m32542a(this.f23869b.m33177i().m23127c());
                }
                if (this.f23874g == null) {
                    this.f23874g = new C6579g(8);
                    b = this.f23873f.m32546b();
                    float c = this.f23873f.m32550c();
                    this.f23874g.mo5251a(0.0f, 0.0f);
                    this.f23874g.mo5251a(0.0f, c);
                    this.f23874g.mo5251a(b, 0.0f);
                    this.f23874g.mo5251a(b, c);
                }
                x.glBlendFunc(1, 771);
                x.glTexEnvx(8960, 8704, 8448);
                b = 1.0f - this.f23869b.m33174f();
                x.glColor4f(b, b, b, b);
                x.glPushMatrix();
                an.m22324a(c5052d, c6570b, this.f23870c, 1.0f);
                x.glRotatef(this.f23869b.m33170b(), 0.0f, 0.0f, -1.0f);
                c6570b = C4754b.m21095a(this.f23869b.m33171c());
                x.glScalef((float) c6570b.m28678d(), (float) c6570b.m28679e(), 1.0f);
                this.f23874g.mo7118d(c5052d);
                this.f23873f.m32544a(x);
                x.glDrawArrays(5, null, 4);
                x.glPopMatrix();
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo4961d() {
        m28144g();
    }

    /* renamed from: e */
    public final String mo4962e() {
        return this.f23869b.getId();
    }

    /* renamed from: f */
    public final float mo4963f() {
        return this.f23875h;
    }

    /* renamed from: g */
    private void m28144g() {
        if (this.f23873f != null) {
            this.f23873f.m32557f();
            this.f23873f = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo4950a(int i) {
        if ((i & 16) != 0) {
            af e;
            LatLngBounds c = this.f23869b.m33171c();
            if (c.northeast.longitude < c.southwest.longitude) {
                e = C4754b.m21100b(c.northeast).m21489e(new af(1073741824, 0));
            } else {
                e = C4754b.m21100b(c.northeast);
            }
            af b = C4754b.m21100b(c.southwest);
            double d = (double) this.f23869b.m33172d();
            double e2 = (double) this.f23869b.m33173e();
            this.f23870c = new af((int) (((1.0d - d) * ((double) b.m21490f())) + (d * ((double) e.m21490f()))), (int) (((1.0d - e2) * ((double) e.m21492g())) + (e2 * ((double) b.m21492g()))));
        }
        if ((i & 23) != 0) {
            this.f23872e = new C6580k(4);
            this.f23872e.mo5252a(-this.f23869b.m33172d(), this.f23869b.m33173e(), 0.0f);
            this.f23872e.mo5252a(-this.f23869b.m33172d(), this.f23869b.m33173e() - 1.0f, 0.0f);
            this.f23872e.mo5252a(1.0f - this.f23869b.m33172d(), this.f23869b.m33173e(), 0.0f);
            this.f23872e.mo5252a(1.0f - this.f23869b.m33172d(), this.f23869b.m33173e() - 1.0f, 0.0f);
            bq a = C4754b.m21095a(this.f23869b.m33171c());
            if (this.f23869b.m33170b() == 0.0f) {
                this.f23871d = a;
            } else {
                int hypot = (int) Math.hypot((double) a.m28678d(), (double) a.m28679e());
                af afVar = new af(hypot, hypot);
                this.f23871d = bq.m28669a(new al(this.f23870c.m21491f(afVar), this.f23870c.m21489e(afVar)));
            }
        }
        if ((i & 4) != 0) {
            m28144g();
        }
        if ((i & 8) != 0) {
            synchronized (this.f23868a) {
                this.f23875h = this.f23869b.m33175g();
                this.f23868a.m32093c();
            }
        }
        this.f23868a.m32092b();
    }
}
