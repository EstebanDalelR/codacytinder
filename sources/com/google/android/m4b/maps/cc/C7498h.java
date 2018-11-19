package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ce.C5094b;
import com.google.android.m4b.maps.cf.C5108f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cc.h */
public abstract class C7498h extends C6561r {
    /* renamed from: a */
    protected final C4848k f27703a;
    /* renamed from: b */
    protected final as f27704b;
    /* renamed from: c */
    protected final C5094b f27705c;
    /* renamed from: d */
    protected final int f27706d;
    /* renamed from: e */
    protected boolean f27707e;
    /* renamed from: f */
    protected boolean f27708f = false;
    /* renamed from: g */
    protected int f27709g = 65536;
    /* renamed from: h */
    private float f27710h;
    /* renamed from: i */
    private float f27711i;
    /* renamed from: j */
    private boolean f27712j;
    /* renamed from: k */
    private boolean f27713k;
    /* renamed from: l */
    private boolean f27714l = false;
    /* renamed from: m */
    private List<C5108f> f27715m = new ArrayList();

    /* renamed from: b */
    public boolean mo7567b(C6570b c6570b, C5052d c5052d) {
        return false;
    }

    /* renamed from: m */
    public abstract float mo7568m();

    /* renamed from: n */
    public abstract am mo7569n();

    /* renamed from: s */
    public abstract String mo7571s();

    protected C7498h(C4848k c4848k, C5094b c5094b, as asVar, float f, float f2, int i, boolean z, boolean z2) {
        this.f27703a = c4848k;
        this.f27704b = asVar;
        this.f27705c = c5094b;
        this.f27710h = f;
        this.f27711i = f2;
        this.f27706d = i;
        this.f27712j = z;
        this.f27714l = z2;
    }

    /* renamed from: l */
    protected final boolean m32657l() {
        return this.f27714l;
    }

    /* renamed from: a */
    public final void mo7038a(int i) {
        this.f27708f = (i & 2) != 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m32644a(float f) {
        return (f >= 1.0f || f < 0.25f) ? 65536 : (int) (Math.sqrt(((double) (f - 0.25f)) * 1.3333333730697632d) * 65536.0d);
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.LABELS;
    }

    /* renamed from: c */
    public void mo5224c(C5052d c5052d) {
        super.mo5224c(c5052d);
        this.f27713k = true;
    }

    /* renamed from: b */
    public void mo5223b(C5052d c5052d) {
        super.mo5223b(c5052d);
    }

    /* renamed from: o */
    public final C5094b m32660o() {
        return this.f27705c;
    }

    /* renamed from: p */
    public final float m32661p() {
        return this.f27710h;
    }

    /* renamed from: q */
    public final float m32662q() {
        return this.f27711i;
    }

    /* renamed from: r */
    public int mo7570r() {
        return this.f27706d;
    }

    /* renamed from: t */
    public final C4848k m32665t() {
        return this.f27703a;
    }

    /* renamed from: u */
    public final boolean m32666u() {
        return this.f27712j;
    }

    /* renamed from: a */
    public boolean mo7566a(br brVar) {
        return (!brVar.mo5129a().mo5132a(mo7569n().mo5089a()) || brVar.mo5132a(mo7569n()) == null) ? null : true;
    }

    /* renamed from: a */
    public static int m32646a(as asVar, C5008i c5008i) {
        switch (c5008i) {
            case HYBRID:
                return -1;
            case NIGHT:
                return -4144960;
            case AMBIENT:
                return -1;
            default:
                asVar = asVar.m21561e() != null ? asVar.m21565i().m21587d() : -16777216;
                if (asVar == null) {
                    return -16777216;
                }
                return asVar;
        }
    }

    /* renamed from: b */
    public static int m32648b(as asVar, C5008i c5008i) {
        switch (c5008i) {
            case HYBRID:
                return -1610612736;
            case NIGHT:
                return Integer.MIN_VALUE;
            case AMBIENT:
                return -1610612736;
            default:
                if (asVar.m21561e()) {
                    return asVar.m21565i().m21588e();
                }
                int a = C7498h.m32646a(asVar, c5008i);
                c5008i = C7498h.m32645a(a, 160);
                return C7498h.m32649c(a) >= 192 ? 8421504 | c5008i : 16777215 | c5008i;
        }
    }

    /* renamed from: b */
    static int m32647b(int i) {
        int a = C7498h.m32645a(i, 255);
        return C7498h.m32649c(i) >= 192 ? a : 16777215 | a;
    }

    /* renamed from: a */
    private static int m32645a(int i, int i2) {
        return (((i >>> 24) * i2) / 255) << 24;
    }

    /* renamed from: c */
    private static int m32649c(int i) {
        return (((((i >>> 16) & 255) * 77) + (((i >>> 8) & 255) * 151)) + ((i & 255) * 28)) / 256;
    }

    /* renamed from: a */
    public static float m32643a(as asVar, float f, int i, int i2, float f2) {
        return Math.max((float) i, Math.min((float) i2, ((float) (asVar.m21561e() ? asVar.m21565i().m21589f() : null)) * f)) * f2;
    }

    /* renamed from: b */
    public final void m32653b(boolean z) {
        this.f27707e = true;
    }
}
