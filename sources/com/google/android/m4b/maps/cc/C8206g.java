package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bo.C4834a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bx.C5003c;
import com.google.android.m4b.maps.bx.C7481o;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C8082n.C5086a;
import com.google.android.m4b.maps.cc.C8082n.C5087b;
import com.google.android.m4b.maps.ce.C5094b;

/* renamed from: com.google.android.m4b.maps.cc.g */
public final class C8206g extends C8082n implements C5003c {
    /* renamed from: p */
    private final ag f29348p;
    /* renamed from: q */
    private boolean f29349q;
    /* renamed from: r */
    private final af f29350r = new af();

    /* renamed from: f */
    public final C4701c mo5284f() {
        return null;
    }

    /* renamed from: i */
    public final boolean mo5286i() {
        return true;
    }

    C8206g(ag agVar, C5094b c5094b, String str, C4834a c4834a, C4834a c4834a2, float f, float f2, boolean z, boolean z2, C6585i c6585i, C6585i c6585i2, C5087b[] c5087bArr, boolean z3) {
        super(agVar, c5094b, str, c4834a, null, f, f2, z, z2, c6585i, c6585i2, c5087bArr, z3, true, null);
        this.f29348p = agVar;
    }

    /* renamed from: j */
    public final ag m34997j() {
        return this.f29348p;
    }

    /* renamed from: a */
    public final void mo5281a() {
        this.f29349q = true;
    }

    public final void l_() {
        this.f29349q = false;
    }

    /* renamed from: c */
    public final af mo5283c() {
        return this.h.m21424b();
    }

    /* renamed from: b */
    public final boolean mo5282b(C6570b c6570b) {
        int[] b = c6570b.m29243b(this.h.m21424b());
        float f = (float) b[0];
        float f2 = (float) b[1];
        if (this.l + f >= ((float) c6570b.m29249e()) || f + this.m < 0.0f || this.n + f2 >= ((float) c6570b.m29250f()) || f2 + this.o < 0.0f) {
            return false;
        }
        return true;
    }

    public final af m_() {
        return this.f29350r;
    }

    /* renamed from: h */
    public final String mo5285h() {
        return this.f29348p.m28545d();
    }

    /* renamed from: a */
    public final int mo5280a(float f, float f2, C6570b c6570b) {
        c6570b = c6570b.m29243b(this.h.m21424b());
        f -= (float) c6570b[0];
        f2 -= (float) c6570b[1];
        return (int) ((f * f) + (f2 * f2));
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        af b = this.h.m21424b();
        float b2 = this.i.m29388b() / 2.0f;
        if (this.j != null && this.k.f18851a == C5086a.ABOVE_CENTER) {
            b2 += this.j.m29388b();
        }
        C7481o.m32471a(c6570b, b, 0, (int) b2, this.f29350r);
        return super.mo7044a(c6570b, c5052d);
    }
}
