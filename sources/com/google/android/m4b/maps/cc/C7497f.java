package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.C4856x;
import com.google.android.m4b.maps.bo.C6523o;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.ae;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.an;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ce.C5094b;
import java.util.Collection;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.f */
public final class C7497f implements C6587q {
    /* renamed from: a */
    private final al f27692a;
    /* renamed from: b */
    private final ba f27693b;
    /* renamed from: c */
    private final bg f27694c;
    /* renamed from: d */
    private String[] f27695d;
    /* renamed from: e */
    private String[] f27696e;
    /* renamed from: f */
    private int f27697f;
    /* renamed from: g */
    private C7501o f27698g;
    /* renamed from: h */
    private List<C4856x> f27699h;
    /* renamed from: i */
    private final float[] f27700i = new float[4];
    /* renamed from: j */
    private long f27701j = 0;
    /* renamed from: k */
    private C7498h f27702k;

    /* renamed from: a */
    public final void mo7130a(C5094b c5094b) {
    }

    /* renamed from: a */
    public final void mo7132a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo7133a() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo7134a(C4712d c4712d) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo7135a(ae aeVar) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo7138b(C4712d c4712d) {
        return false;
    }

    /* renamed from: a */
    public static C7497f m32621a(az azVar, C5052d c5052d) {
        C7497f c7497f = new C7497f(azVar.mo5099d(), azVar.mo5101h());
        if (azVar instanceof C6523o) {
            C6523o c6523o = (C6523o) azVar;
            c7497f.f27698g = C7501o.m32693a(c6523o.m28738g(), c7497f.f27693b, c5052d);
            c7497f.f27695d = c6523o.m28730a();
            c7497f.f27696e = c6523o.m28732b();
            c7497f.f27697f = c6523o.m28733c();
            c7497f.f27699h = c6523o.m28737f();
        } else {
            c7497f.f27695d = new String[0];
            c7497f.f27696e = new String[0];
            c7497f.f27697f = -1;
        }
        return c7497f;
    }

    private C7497f(ba baVar, bg bgVar) {
        this.f27693b = baVar;
        this.f27694c = bgVar;
        this.f27692a = baVar.m21626i();
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        if (this.f27698g != null) {
            this.f27698g.mo5223b(c5052d);
        }
        if (this.f27702k != null) {
            this.f27702k.mo5223b(c5052d);
            this.f27702k = null;
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        if (this.f27698g != null) {
            this.f27698g.mo5224c(c5052d);
        }
        if (this.f27702k != null) {
            this.f27702k.mo5224c(c5052d);
            this.f27702k = null;
        }
    }

    /* renamed from: a */
    public final int mo7127a(C6570b c6570b, C5008i c5008i) {
        c6570b = ai.f24417a;
        return this.f27698g != null ? 2 : null;
    }

    /* renamed from: b */
    public final void mo7137b(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C7501o.m32694a(c5052d);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (this.f27698g != null || c5009j.m22388b() != 1) {
            GL10 x = c5052d.m22635x();
            x.glPushMatrix();
            if (c6570b.mo5248a() != this.f27701j) {
                this.f27701j = c6570b.mo5248a();
                af c = this.f27692a.m32212c();
                if (!c6570b.m29248d() && c6570b.m29255k() == 0.0f && c6570b.m29254j() == 0.0f && c6570b.m29256l() == ((float) ((int) c6570b.m29256l()))) {
                    c6570b.m29238a(c, c5052d.f18692j);
                    c = c6570b.m29247d((float) Math.round(c5052d.f18692j[0]), (float) Math.round(c5052d.f18692j[1]));
                }
                an.m22326a(c5052d, c6570b, c, (float) this.f27692a.m32215f(), this.f27700i);
            }
            an.m22328a(x, this.f27700i);
            if (c5009j.m22388b() == 1) {
                this.f27698g.mo5222a(c5052d, c6570b, c5009j);
            } else if (c5009j.m22388b() == 15) {
                C6588r.f24719a.mo5222a(c5052d, c6570b, c5009j);
            }
            x.glPopMatrix();
        }
    }

    /* renamed from: b */
    public final ba mo7136b() {
        return this.f27693b;
    }

    /* renamed from: c */
    public final boolean mo7139c() {
        return this.f27698g != null && this.f27698g.m32702c();
    }

    /* renamed from: d */
    public final void mo7140d() {
        if (this.f27698g != null) {
            this.f27698g.m32703e();
        }
    }

    /* renamed from: a */
    public final void mo7129a(long j) {
        if (this.f27698g != null) {
            this.f27698g.m32697a(3000);
        }
    }

    /* renamed from: a */
    public final void mo7128a(int i, Collection collection) {
        for (Object add : this.f27695d) {
            collection.add(add);
        }
    }

    /* renamed from: a */
    public final void mo7131a(Collection<String> collection) {
        for (Object add : this.f27696e) {
            collection.add(add);
        }
    }

    /* renamed from: e */
    public final int mo7141e() {
        return this.f27697f;
    }

    /* renamed from: h */
    public final List<C4856x> m32642h() {
        return this.f27699h;
    }

    /* renamed from: f */
    public final int mo7142f() {
        return this.f27698g == null ? 0 : this.f27698g.mo7125a();
    }

    /* renamed from: g */
    public final int mo7143g() {
        if (this.f27698g != null) {
            return 136 + this.f27698g.mo7126b();
        }
        return 136;
    }
}
