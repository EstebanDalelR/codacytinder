package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bx.ah;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.ab;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bm.f */
public final class C6482f implements ah {
    /* renamed from: a */
    private final Map<C7436c, ab> f24021a = ax.m20623b();
    /* renamed from: b */
    private Set<? extends C4699a> f24022b;
    /* renamed from: c */
    private final float f24023c;
    /* renamed from: d */
    private long f24024d = 0;
    /* renamed from: e */
    private int f24025e = 0;
    /* renamed from: f */
    private float f24026f = 0.0f;
    /* renamed from: g */
    private boolean f24027g = false;

    /* renamed from: a */
    private static float m28446a(float f) {
        return (f * f) * (3.0f - (f * 2.0f));
    }

    /* renamed from: a */
    private static float m28447a(float f, float f2, float f3, float f4, float f5) {
        return f <= f2 ? f4 : f >= f3 ? f5 : f4 + (((f - f2) / (f3 - f2)) * (f5 - f4));
    }

    public final /* synthetic */ int compareTo(Object obj) {
        ah ahVar = (ah) obj;
        return ahVar instanceof C6482f ? Float.compare(this.f24023c, ((C6482f) ahVar).f24023c) : null;
    }

    C6482f(ab abVar) {
        this.f24023c = (float) abVar.mo5146f();
        m28455a(abVar);
    }

    private C6482f(float f) {
        this.f24023c = f;
    }

    /* renamed from: a */
    public final boolean m28455a(ab abVar) {
        C5571j.m24297a(((float) abVar.mo5146f()) == this.f24023c);
        if (this.f24022b != null || ((float) abVar.mo5146f()) != this.f24023c) {
            return false;
        }
        this.f24021a.put(abVar.mo5143b(), abVar);
        return true;
    }

    /* renamed from: a */
    public final Set<? extends C4699a> mo5086a() {
        if (this.f24022b == null) {
            this.f24022b = al.m27701a(this.f24021a.keySet());
        }
        return this.f24022b;
    }

    /* renamed from: a */
    final C6482f m28450a(C7436c c7436c) {
        if (!this.f24021a.containsKey(c7436c)) {
            return this;
        }
        C6482f c6482f = new C6482f((float) ((ab) this.f24021a.get(c7436c)).mo5146f());
        for (ab abVar : this.f24021a.values()) {
            if (!abVar.mo5143b().equals(c7436c)) {
                c6482f.m28455a(abVar);
            }
        }
        return c6482f;
    }

    /* renamed from: b */
    public final float m28456b() {
        return this.f24023c;
    }

    /* renamed from: g */
    private boolean m28448g() {
        return this.f24025e != 0 && this.f24026f < 1.0f;
    }

    /* renamed from: c */
    public final boolean m28457c() {
        return m28448g() && (this.f24025e & 3) != 0;
    }

    /* renamed from: a */
    public final float m28449a(C6570b c6570b, af afVar) {
        float k = c6570b.m29255k();
        c6570b = c6570b.m29256l();
        int i = this.f24025e;
        float f = this.f24026f;
        float f2 = this.f24023c;
        c6570b = f2 > 0.0f ? C6482f.m28447a(c6570b, 18.0f, 20.0f, 3.0f, 0.0f) : f2 < 0.0f ? C6482f.m28447a(c6570b, 18.0f, 20.0f, -3.0f, -1.0f) : null;
        c6570b = C6482f.m28447a(k, 0.0f, 10.0f, 0.0f, c6570b);
        k = C6482f.m28446a(f);
        if ((i & 2) != 0) {
            c6570b += k * 100.0f;
        } else if ((i & 1) != 0) {
            c6570b += (1.0f - k) * 100.0f;
        }
        return c6570b * ((float) afVar.m21488e());
    }

    /* renamed from: a */
    public final void mo5088a(C5052d c5052d, C6570b c6570b, C5009j c5009j, af afVar) {
        GL10 x = c5052d.m22635x();
        x.glPushMatrix();
        afVar = m28449a(c6570b, afVar) * c6570b.m29261q();
        x.glTranslatef(0.0f, 0.0f, afVar);
        int i = this.f24025e;
        float a = C6482f.m28446a(this.f24026f);
        if ((i & 4) == 0) {
            a = (i & 8) != 0 ? 1.0f - a : 1.0f;
        }
        if ((i & 16) != 0) {
            float a2 = C6482f.m28447a(a, 0.0f, 1.0f, 0.6f, 1.0f);
            i = C5051c.m22590a(1.0f, a2, a2, a2);
        } else {
            i = C5051c.m22590a(a, a, a, a);
        }
        C5051c.m22593a(x, i);
        c5009j = c5009j.m22389c().m22299b();
        if (!(c5009j == C4984a.UNDERGROUND_COLOR || c5009j == C4984a.DROP_SHADOWS_INNER)) {
            if (c5009j != C4984a.ANIMATED_ELEVATED_COLOR || afVar >= null) {
                c6570b = null;
                this.f24027g = c6570b;
                if (this.f24027g != null) {
                    c5052d.m22633v();
                    x.glStencilOp(7680, 7680, 7680);
                    x.glStencilFunc(514, 255, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                }
            }
        }
        c6570b = true;
        this.f24027g = c6570b;
        if (this.f24027g != null) {
            c5052d.m22633v();
            x.glStencilOp(7680, 7680, 7680);
            x.glStencilFunc(514, 255, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        }
    }

    /* renamed from: a */
    public final void mo5087a(C5052d c5052d, C5009j c5009j) {
        c5009j = c5052d.m22635x();
        if (this.f24027g) {
            c5052d.m22634w();
        }
        C5051c.m22593a(c5009j, -1);
        c5009j.glPopMatrix();
    }

    /* renamed from: a */
    public final void m28452a(int i) {
        C4712d.m20955a();
        long c = C4712d.m20957c();
        this.f24025e = i;
        this.f24024d = c;
        this.f24026f = 0;
    }

    /* renamed from: d */
    public final void m28458d() {
        this.f24025e = 0;
        this.f24026f = 0.0f;
    }

    /* renamed from: e */
    public final boolean m28459e() {
        C4712d.m20955a();
        float c = ((float) (C4712d.m20957c() - this.f24024d)) / 500.0f;
        if (c < 0.0f) {
            c = 0.0f;
        } else if (c > 1.0f) {
            c = 1.0f;
        }
        this.f24026f = c;
        return m28448g();
    }

    /* renamed from: f */
    public final Set<C7436c> m28460f() {
        return this.f24021a.keySet();
    }

    public final String toString() {
        return C5569h.m24283a(this).m24278a("height", this.f24023c).m24280a("animationStartTimeMs", this.f24024d).m24278a("animationPosition", this.f24026f).m24279a("animationType", this.f24025e).m24281a("featureIds", this.f24022b).toString();
    }
}
