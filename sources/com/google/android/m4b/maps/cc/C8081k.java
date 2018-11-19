package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bb.C4749e;
import com.google.android.m4b.maps.bb.C4749e.C4748a;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C4854s;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ai;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.ak.C4991a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5056h;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C7492i;
import com.google.android.m4b.maps.ce.C5094b;
import com.tinder.domain.config.model.ProfileEditingConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.k */
public final class C8081k extends C7498h {
    /* renamed from: A */
    private float f28979A;
    /* renamed from: B */
    private final int f28980B;
    /* renamed from: C */
    private boolean f28981C;
    /* renamed from: D */
    private int f28982D;
    /* renamed from: E */
    private boolean f28983E;
    /* renamed from: F */
    private final String f28984F;
    /* renamed from: G */
    private final float f28985G;
    /* renamed from: H */
    private final float[] f28986H = new float[8];
    /* renamed from: h */
    private final String f28987h;
    /* renamed from: i */
    private final C4991a f28988i;
    /* renamed from: j */
    private final aj f28989j;
    /* renamed from: k */
    private aj f28990k;
    /* renamed from: l */
    private final float f28991l;
    /* renamed from: m */
    private ai f28992m;
    /* renamed from: n */
    private C5084a[] f28993n;
    /* renamed from: o */
    private final ak f28994o;
    /* renamed from: p */
    private C7490k f28995p;
    /* renamed from: q */
    private C6579g f28996q;
    /* renamed from: r */
    private C6579g f28997r;
    /* renamed from: s */
    private boolean f28998s = false;
    /* renamed from: t */
    private C6579g f28999t;
    /* renamed from: u */
    private C4749e f29000u;
    /* renamed from: v */
    private final float f29001v;
    /* renamed from: w */
    private final float f29002w;
    /* renamed from: x */
    private final float f29003x;
    /* renamed from: y */
    private int f29004y;
    /* renamed from: z */
    private int f29005z;

    /* renamed from: com.google.android.m4b.maps.cc.k$a */
    static class C5084a {
        /* renamed from: a */
        af f18833a;
        /* renamed from: b */
        float f18834b;
        /* renamed from: c */
        float f18835c;
        /* renamed from: d */
        float f18836d;
        /* renamed from: e */
        float f18837e;
        /* renamed from: f */
        float f18838f;

        private C5084a(af afVar, af afVar2, float f) {
            this.f18833a = afVar.m21474a(afVar2, 0.5f);
            this.f18834b = afVar.m21483c(afVar2) * 0.5f;
            this.f18835c = f;
            this.f18836d = ah.m21505b(afVar, afVar2);
        }
    }

    /* renamed from: a */
    public static C8081k m34356a(ao aoVar, C5094b c5094b, C4854s c4854s, aj ajVar, int i, boolean z, float f, float f2, C4991a c4991a, C6570b c6570b, ak akVar, boolean z2) {
        return C8081k.m34357a((C4848k) aoVar, c5094b, c4854s, ajVar, i, z, f, f2, c4991a, c6570b, akVar, z2);
    }

    /* renamed from: a */
    public static C8081k m34358a(C6527u c6527u, C5094b c5094b, C4854s c4854s, aj ajVar, boolean z, float f, C4991a c4991a, float f2, C6570b c6570b, ak akVar, boolean z2) {
        return C8081k.m34357a((C4848k) c6527u, c5094b, c4854s, ajVar, 0, z, f, f2, c4991a, c6570b, akVar, z2);
    }

    /* renamed from: a */
    private static C8081k m34357a(C4848k c4848k, C5094b c5094b, C4854s c4854s, aj ajVar, int i, boolean z, float f, float f2, C4991a c4991a, C6570b c6570b, ak akVar, boolean z2) {
        aj b;
        ay i2;
        C4991a c4991a2;
        ak akVar2;
        C4854s c4854s2 = c4854s;
        float f3 = f;
        float r = c6570b.m29262r();
        if (ajVar.m21528b() > 2) {
            b = ajVar.m21529b((f3 * r) * 0.2f);
        } else {
            b = ajVar;
        }
        as e = c4848k.mo5108e();
        for (int i3 = 0; i3 < c4854s.m21780b(); i3++) {
            if (c4854s2.m21778a(i3).m21764a()) {
                e = c4854s2.m21778a(i3).m21773j();
                break;
            }
        }
        as asVar = e;
        String a = c4854s.m21779a();
        if (asVar != null) {
            i2 = asVar.m21565i();
            c4991a2 = c4991a;
            akVar2 = akVar;
        } else {
            c4991a2 = c4991a;
            akVar2 = akVar;
            i2 = null;
        }
        float a2 = akVar2.m22314a(a, c4991a2, i2, f3);
        float a3 = c6570b.m29231a(a2 + 1.0f, c6570b.m29253i());
        if (a2 == 0.0f || a3 > b.m21534d()) {
            return null;
        }
        C8081k c8081k = r0;
        C8081k c8081k2 = new C8081k(c4848k, c5094b, a, asVar, c4848k.mo5110i(), i, z, -1.0f, -1.0f, r, (int) c6570b.m29254j(), b, f3, f2, c4991a2, a2, akVar, z2);
        c8081k2 = c8081k;
        if (c8081k2.m34359f()) {
            return c8081k2;
        }
        return null;
    }

    private C8081k(C4848k c4848k, C5094b c5094b, String str, as asVar, int i, int i2, boolean z, float f, float f2, float f3, int i3, aj ajVar, float f4, float f5, C4991a c4991a, float f6, ak akVar, boolean z2) {
        float f7 = f3;
        float f8 = f4;
        super(c4848k, c5094b, asVar, -1.0f, -1.0f, i, z, z2);
        this.f28987h = str;
        String str2 = "L";
        String valueOf = String.valueOf(this.f28987h);
        r9.f28984F = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
        r9.f28989j = ajVar;
        r9.f28991l = f6 * f7;
        r9.f28980B = i2;
        r9.f28994o = akVar;
        r9.f29001v = f7;
        r9.f29002w = f8;
        r9.f29003x = f5;
        r9.f28988i = c4991a;
        r9.f28983E = false;
        r9.f29005z = i3;
        r9.f28982D = 0;
        r9.f28985G = f6 * f8;
    }

    /* renamed from: m */
    public final float mo7568m() {
        return this.f28985G;
    }

    /* renamed from: s */
    public final String mo7571s() {
        return this.f28984F;
    }

    /* renamed from: b */
    public final boolean mo7567b(C6570b c6570b, C5052d c5052d) {
        this.f28982D++;
        return m34359f();
    }

    /* renamed from: f */
    private boolean m34359f() {
        while (this.f28982D < 6) {
            if (this.f28982D > 1 && this.f28989j.m21534d() < this.f28991l * 2.0f) {
                return false;
            }
            if (this.f28982D > 3 && this.f28989j.m21534d() < this.f28991l * 3.0f) {
                return false;
            }
            int i;
            float b;
            aj a;
            af afVar;
            af afVar2;
            af afVar3;
            af afVar4;
            int b2;
            float f;
            af[] afVarArr;
            int i2;
            int b3 = this.f28989j.m21528b() - 1;
            aj ajVar = null;
            if (this.f28982D == 0) {
                for (i = 0; i < b3; i++) {
                    b = this.f28989j.m21527b(i);
                    if (b > this.f28991l) {
                        C5056h c5056h = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                        af afVar5 = c5056h.f18735a;
                        af afVar6 = c5056h.f18736b;
                        af afVar7 = c5056h.f18737c;
                        af afVar8 = c5056h.f18738d;
                        this.f28989j.m21524a(i, afVar7);
                        this.f28989j.m21524a(i + 1, afVar8);
                        float f2 = (b - this.f28991l) / b;
                        af.m21462a(afVar7, afVar8, 0.25f * f2, afVar5);
                        af.m21462a(afVar8, afVar7, f2 * 0.75f, afVar6);
                        a = aj.m21518a(afVar5, afVar6);
                        break;
                    }
                }
                this.f28982D = 1;
            }
            float d = this.f28989j.m21534d();
            switch (this.f28982D) {
                case 1:
                    d = (d - this.f28991l) * 0.25f;
                    a = C8081k.m34355a(this.f28989j, d, this.f28991l + d);
                    break;
                case 2:
                    d = Math.min((this.f29001v * 2.0f) * this.f29002w, d - this.f28991l);
                    a = C8081k.m34355a(this.f28989j, d, this.f28991l + d);
                    break;
                case 3:
                    d = Math.max(0.0f, (d - this.f28991l) - ((this.f29001v * 2.0f) * this.f29002w));
                    a = C8081k.m34355a(this.f28989j, d, this.f28991l + d);
                    break;
                case 4:
                    d = (d - this.f28991l) * 0.33f;
                    a = C8081k.m34355a(this.f28989j, d, this.f28991l + d);
                    break;
                case 5:
                    d = (d - this.f28991l) * 0.67f;
                    a = C8081k.m34355a(this.f28989j, d, this.f28991l + d);
                    break;
                default:
                    a = null;
                    break;
            }
            i = a.m21528b();
            if (i > 2) {
                if ((i - 1) * 3 <= this.f28987h.length()) {
                    Object obj;
                    int b4 = a.m21528b() - 1;
                    if (b4 >= 2) {
                        f2 = a.m21535d(0);
                        int i3 = 1;
                        while (i3 < b4) {
                            b = Math.abs(a.m21535d(i3) - f2);
                            if (b <= 60.0f || b >= 300.0f) {
                                i3++;
                            } else {
                                obj = 1;
                                if (obj != null) {
                                }
                            }
                        }
                    }
                    obj = null;
                    if (obj != null) {
                    }
                }
                this.f28990k = ajVar;
                if (this.f28990k == null) {
                    d = this.f29003x;
                    C5056h c5056h2 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                    afVar = c5056h2.f18735a;
                    afVar2 = c5056h2.f18736b;
                    afVar3 = c5056h2.f18737c;
                    afVar4 = c5056h2.f18738d;
                    b2 = this.f28990k.m21528b();
                    f = ((this.f29001v * this.f29002w) * d) / 2.0f;
                    b3 = b2 * 2;
                    afVarArr = new af[b3];
                    this.f28990k.m21524a(0, afVar4);
                    for (i2 = 1; i2 < b2; i2++) {
                        this.f28990k.m21524a(i2, afVar3);
                        af.m21468b(afVar3, afVar4, afVar);
                        ah.m21501a(afVar, f, afVar2);
                        afVarArr[i2] = afVar3.m21491f(afVar2);
                        afVarArr[(b3 - i2) - 1] = afVar3.m21489e(afVar2);
                        if (i2 == 1) {
                            afVarArr[0] = afVar4.m21491f(afVar2);
                            afVarArr[b3 - 1] = afVar4.m21489e(afVar2);
                        }
                        afVar4.m21482b(afVar3);
                    }
                    this.f28992m = new ai(afVarArr);
                    a = this.f28990k;
                    C5056h c5056h3 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                    afVar4 = c5056h3.f18735a;
                    af afVar9 = c5056h3.f18736b;
                    a.m21524a(0, afVar4);
                    a.m21526a(afVar9);
                    this.f29004y = (int) ah.m21505b(afVar4, afVar9);
                    return true;
                }
                this.f28982D++;
            }
            ajVar = a;
            this.f28990k = ajVar;
            if (this.f28990k == null) {
                this.f28982D++;
            } else {
                d = this.f29003x;
                C5056h c5056h22 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar = c5056h22.f18735a;
                afVar2 = c5056h22.f18736b;
                afVar3 = c5056h22.f18737c;
                afVar4 = c5056h22.f18738d;
                b2 = this.f28990k.m21528b();
                f = ((this.f29001v * this.f29002w) * d) / 2.0f;
                b3 = b2 * 2;
                afVarArr = new af[b3];
                this.f28990k.m21524a(0, afVar4);
                for (i2 = 1; i2 < b2; i2++) {
                    this.f28990k.m21524a(i2, afVar3);
                    af.m21468b(afVar3, afVar4, afVar);
                    ah.m21501a(afVar, f, afVar2);
                    afVarArr[i2] = afVar3.m21491f(afVar2);
                    afVarArr[(b3 - i2) - 1] = afVar3.m21489e(afVar2);
                    if (i2 == 1) {
                        afVarArr[0] = afVar4.m21491f(afVar2);
                        afVarArr[b3 - 1] = afVar4.m21489e(afVar2);
                    }
                    afVar4.m21482b(afVar3);
                }
                this.f28992m = new ai(afVarArr);
                a = this.f28990k;
                C5056h c5056h32 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar4 = c5056h32.f18735a;
                af afVar92 = c5056h32.f18736b;
                a.m21524a(0, afVar4);
                a.m21526a(afVar92);
                this.f29004y = (int) ah.m21505b(afVar4, afVar92);
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final am mo7569n() {
        return this.f28992m;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        super.mo5223b(c5052d);
        if (this.f28995p != null) {
            this.f28995p.m32557f();
            this.f28995p = null;
        }
        if (this.f28996q != null) {
            this.f28996q.mo7116b(c5052d);
            this.f28997r.mo7116b(c5052d);
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        super.mo5224c(c5052d);
        if (this.f28996q != null) {
            this.f28996q.m29340c(c5052d);
            this.f28997r.m29340c(c5052d);
        }
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        Object obj;
        c5052d = c6570b.m29262r() / this.f29001v;
        if (m32657l() && this.f) {
            obj = (c5052d < 0.25f || c5052d > 2.0f) ? null : 1;
            this.g = C7498h.m32644a((float) c5052d);
        } else {
            obj = (c5052d < 0.9f || c5052d > 1.25f) ? null : 1;
            this.g = 65536;
        }
        if (obj == null) {
            return false;
        }
        this.f29005z = (int) c6570b.m29254j();
        this.f28979A = c6570b.m29255k();
        return true;
    }

    /* renamed from: r */
    public final int mo7570r() {
        int i = 0;
        int i2 = this.d + (this.f28982D == 0 ? 1 : 0);
        if (this.f28979A >= 30.0f) {
            i = (int) (((float) this.f28980B) * Math.abs((float) Math.sin((double) (((float) Math.abs(this.f29005z - this.f29004y)) * 0.017453292f))));
        }
        return i2 + i;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        int i;
        C5056h c5056h;
        af afVar;
        af afVar2;
        float c;
        float f;
        int i2;
        float f2;
        C5052d c5052d2 = c5052d;
        C6570b c6570b2 = c6570b;
        if (this.f28983E) {
            i = 1;
        } else {
            int b;
            int i3;
            ay i4;
            int i5;
            Object obj;
            float d;
            aj ajVar;
            C5056h c5056h2;
            af afVar3;
            int b2;
            int i6;
            float[] fArr;
            af afVar4;
            int i7;
            af afVar5;
            float[] a;
            float[] fArr2;
            int i8;
            float f3;
            C5008i a2 = c5009j.m22385a();
            int a3 = C7498h.m32646a(r0.b, a2);
            as asVar = r0.b;
            if ((r0.a.mo5109h() == 2 ? 1 : null) != null && a2 == C5008i.NORMAL && asVar.m21557b() > 0 && asVar.m21557b() <= 2) {
                b = asVar.m21558b(asVar.m21557b() - 1).m21546b();
                if (C5051c.m22591a(b) >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    i3 = b;
                    i4 = r0.b == null ? r0.b.m21565i() : null;
                    r0.f28995p = r0.f28994o.m22316a(r0.f28987h, r0.f28988i, i4, r0.f29002w, a3, i3, 0);
                    if (r0.f28995p == null) {
                        i5 = 2;
                        i = true;
                    } else if (c5052d2.m22610a(10000)) {
                        obj = null;
                        i = true;
                        if (obj == null) {
                            return;
                        }
                    } else {
                        i5 = 2;
                        i = true;
                        r0.f28995p = r0.f28994o.m22315a(c5052d2, r0.f28987h, r0.f28988i, i4, r0.f29002w, a3, i3, 0);
                    }
                    d = ((((float) r0.f28995p.m32553d()) * r0.f29001v) * 0.5f) / 1.5f;
                    if (r0.f28990k.m21528b() != i5) {
                        c5056h = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                        afVar = c5056h.f18735a;
                        afVar2 = c5056h.f18736b;
                        r0.f28990k.m21524a(0, afVar);
                        r0.f28990k.m21524a(i, afVar2);
                        r0.f28993n = new C5084a[i];
                        r0.f28993n[0] = new C5084a(afVar, afVar2, d);
                        d = r0.f28995p.m32546b();
                        c = r0.f28995p.m32550c();
                        r0.f28993n[0].f18837e = d;
                        r0.f28993n[0].f18838f = c;
                    } else {
                        ajVar = r0.f28990k;
                        c5056h2 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                        afVar3 = c5056h2.f18735a;
                        afVar = c5056h2.f18736b;
                        b2 = ajVar.m21528b();
                        i6 = b2 - 1;
                        a3 = i6 * 4;
                        r0.f28996q = new C7492i(a3, i);
                        r0.f28997r = new C7492i(a3, i);
                        r0.f28993n = new C5084a[i6];
                        fArr = new float[b2];
                        fArr[0] = 0.0f;
                        ajVar.m21524a(0, afVar3);
                        afVar4 = afVar3;
                        afVar3 = afVar;
                        b = 0;
                        while (b < i6) {
                            i7 = b + 1;
                            ajVar.m21524a(i7, afVar3);
                            r0.f28993n[b] = new C5084a(afVar4, afVar3, d);
                            fArr[i7] = fArr[b] + afVar4.m21483c(afVar3);
                            b = i7;
                            afVar5 = afVar4;
                            afVar4 = afVar3;
                            afVar3 = afVar5;
                        }
                        a = r0.f28994o.m22319a(r0.f28987h, r0.f28988i, r0.b == null ? r0.b.m21565i() : null, r0.f29002w, true);
                        c = 1.0f / a[a.length - i];
                        for (b = 0; b < a.length; b++) {
                            a[b] = a[b] * c;
                        }
                        f = 1.0f;
                        c = 1.0f / fArr[fArr.length - i];
                        fArr2 = new float[b2];
                        i8 = 0;
                        while (i8 < b2) {
                            fArr[i8] = fArr[i8] * c;
                            fArr2[i6 - i8] = f - fArr[i8];
                            i8++;
                            f = 1.0f;
                        }
                        b = 0;
                        i6 = 0;
                        for (i2 = 0; i2 < b2; i2++) {
                            b = C8081k.m34354a(fArr[i2], a, b);
                            fArr[i2] = a[b];
                            i6 = C8081k.m34354a(fArr2[i2], a, i6);
                            fArr2[i2] = a[i6];
                        }
                        d = r0.f28995p.m32546b();
                        c = r0.f28995p.m32550c();
                        for (b = 0; b < b2; b++) {
                            f2 = fArr[b] * d;
                            f3 = fArr2[(b2 - b) - i] * d;
                            r0.f28996q.mo5251a(f2, 0.0f);
                            r0.f28996q.mo5251a(f2, c);
                            r0.f28997r.mo5251a(f3, c);
                            r0.f28997r.mo5251a(f3, 0.0f);
                            if (b > 0) {
                                i7 = b - 1;
                                r0.f28993n[i7].f18837e = f2;
                                r0.f28993n[i7].f18838f = c;
                            }
                        }
                    }
                    if (r0.f28993n.length > i) {
                        d = r0.f28993n[0].f18836d;
                        for (i2 = 1; i2 < r0.f28993n.length; i2++) {
                            f = Math.abs(r0.f28993n[i2].f18836d - d);
                            if (f <= 30.0f && f < 330.0f) {
                                r0.f28981C = i;
                                break;
                            }
                        }
                    }
                    if (r0.e) {
                        r0.f29000u = new C4749e(500, C4748a.FADE_IN);
                    }
                    r0.f28983E = i;
                    obj = 1;
                    if (obj == null) {
                        return;
                    }
                }
            }
            i3 = C7498h.m32648b(asVar, a2);
            if (r0.b == null) {
            }
            r0.f28995p = r0.f28994o.m22316a(r0.f28987h, r0.f28988i, i4, r0.f29002w, a3, i3, 0);
            if (r0.f28995p == null) {
                i5 = 2;
                i = true;
            } else if (c5052d2.m22610a(10000)) {
                i5 = 2;
                i = true;
                r0.f28995p = r0.f28994o.m22315a(c5052d2, r0.f28987h, r0.f28988i, i4, r0.f29002w, a3, i3, 0);
            } else {
                obj = null;
                i = true;
                if (obj == null) {
                    return;
                }
            }
            d = ((((float) r0.f28995p.m32553d()) * r0.f29001v) * 0.5f) / 1.5f;
            if (r0.f28990k.m21528b() != i5) {
                ajVar = r0.f28990k;
                c5056h2 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar3 = c5056h2.f18735a;
                afVar = c5056h2.f18736b;
                b2 = ajVar.m21528b();
                i6 = b2 - 1;
                a3 = i6 * 4;
                r0.f28996q = new C7492i(a3, i);
                r0.f28997r = new C7492i(a3, i);
                r0.f28993n = new C5084a[i6];
                fArr = new float[b2];
                fArr[0] = 0.0f;
                ajVar.m21524a(0, afVar3);
                afVar4 = afVar3;
                afVar3 = afVar;
                b = 0;
                while (b < i6) {
                    i7 = b + 1;
                    ajVar.m21524a(i7, afVar3);
                    r0.f28993n[b] = new C5084a(afVar4, afVar3, d);
                    fArr[i7] = fArr[b] + afVar4.m21483c(afVar3);
                    b = i7;
                    afVar5 = afVar4;
                    afVar4 = afVar3;
                    afVar3 = afVar5;
                }
                if (r0.b == null) {
                }
                a = r0.f28994o.m22319a(r0.f28987h, r0.f28988i, r0.b == null ? r0.b.m21565i() : null, r0.f29002w, true);
                c = 1.0f / a[a.length - i];
                for (b = 0; b < a.length; b++) {
                    a[b] = a[b] * c;
                }
                f = 1.0f;
                c = 1.0f / fArr[fArr.length - i];
                fArr2 = new float[b2];
                i8 = 0;
                while (i8 < b2) {
                    fArr[i8] = fArr[i8] * c;
                    fArr2[i6 - i8] = f - fArr[i8];
                    i8++;
                    f = 1.0f;
                }
                b = 0;
                i6 = 0;
                for (i2 = 0; i2 < b2; i2++) {
                    b = C8081k.m34354a(fArr[i2], a, b);
                    fArr[i2] = a[b];
                    i6 = C8081k.m34354a(fArr2[i2], a, i6);
                    fArr2[i2] = a[i6];
                }
                d = r0.f28995p.m32546b();
                c = r0.f28995p.m32550c();
                for (b = 0; b < b2; b++) {
                    f2 = fArr[b] * d;
                    f3 = fArr2[(b2 - b) - i] * d;
                    r0.f28996q.mo5251a(f2, 0.0f);
                    r0.f28996q.mo5251a(f2, c);
                    r0.f28997r.mo5251a(f3, c);
                    r0.f28997r.mo5251a(f3, 0.0f);
                    if (b > 0) {
                        i7 = b - 1;
                        r0.f28993n[i7].f18837e = f2;
                        r0.f28993n[i7].f18838f = c;
                    }
                }
            } else {
                c5056h = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar = c5056h.f18735a;
                afVar2 = c5056h.f18736b;
                r0.f28990k.m21524a(0, afVar);
                r0.f28990k.m21524a(i, afVar2);
                r0.f28993n = new C5084a[i];
                r0.f28993n[0] = new C5084a(afVar, afVar2, d);
                d = r0.f28995p.m32546b();
                c = r0.f28995p.m32550c();
                r0.f28993n[0].f18837e = d;
                r0.f28993n[0].f18838f = c;
            }
            if (r0.f28993n.length > i) {
                d = r0.f28993n[0].f18836d;
                for (i2 = 1; i2 < r0.f28993n.length; i2++) {
                    f = Math.abs(r0.f28993n[i2].f18836d - d);
                    if (f <= 30.0f) {
                    }
                }
            }
            if (r0.e) {
                r0.f29000u = new C4749e(500, C4748a.FADE_IN);
            }
            r0.f28983E = i;
            obj = 1;
            if (obj == null) {
                return;
            }
        }
        if (c5009j.m22388b() == 0 && r0.f28993n.length > 0) {
            float k;
            C5084a c5084a;
            GL10 x;
            C5056h c5056h3;
            af afVar6;
            af afVar7;
            float q;
            GL10 x2 = c5052d.m22635x();
            c5052d.m22627p();
            if (r0.f28993n.length == i) {
                c5052d2.f18686d.m22682a(c5052d2);
            } else {
                c5052d2.f18689g.mo7123d(c5052d2);
            }
            r0.f28995p.m32544a(x2);
            if (r0.f29000u != null) {
                i2 = r0.f29000u.m21087a(c5052d2);
                if (i2 == 65536) {
                    r0.f29000u = null;
                }
            } else {
                i2 = r0.g;
            }
            c5052d.m22635x().glColor4x(i2, i2, i2, i2);
            if (r0.f28999t == null || c6570b.m29255k() > 0.0f || c6570b.m29254j() > 0.0f) {
                c5056h = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar = c5056h.f18735a;
                afVar2 = c5056h.f18736b;
                r0.f28990k.m21524a(0, afVar);
                r0.f28990k.m21526a(afVar2);
                c6570b2.m29238a(afVar, r0.f28986H);
                f = r0.f28986H[0];
                float f4 = r0.f28986H[i];
                c6570b2.m29238a(afVar2, r0.f28986H);
                float[] fArr3 = r0.f28986H;
                fArr3[0] = fArr3[0] - f;
                fArr3 = r0.f28986H;
                fArr3[i] = fArr3[i] - f4;
                c = r0.f28986H[0];
                f = r0.f28986H[i];
                f4 = (float) Math.sqrt((double) ((c * c) + (f * f)));
                f2 = -1.0f;
                c = c >= 0.0f ? 1.0f : -1.0f;
                if (f >= 0.0f) {
                    f2 = 1.0f;
                }
                c *= 1.0f - ((f * f2) / f4);
                if (r0.f28999t == null) {
                    r0.f28999t = f2 > 0.0f ? r0.f28997r : r0.f28996q;
                    r0.f28998s = f2 > 0.0f;
                }
                if (r0.f28999t == r0.f28997r) {
                    r0.f28999t = c < 0.001f ? r0.f28997r : r0.f28996q;
                    r0.f28998s = c < 0.001f;
                } else {
                    r0.f28999t = c < -0.001f ? r0.f28997r : r0.f28996q;
                    r0.f28998s = c < -0.001f;
                }
                if (!r0.f28981C && (c > 0.75f || c < -0.75f)) {
                    k = c * c6570b.m29255k();
                    for (i2 = 0; i2 < r0.f28993n.length; i2++) {
                        if (r0.f28993n.length != i) {
                            x2.glMatrixMode(5890);
                            x2.glLoadIdentity();
                            if (r0.f28998s) {
                                x2.glTranslatef(r0.f28993n[i2].f18837e / 2.0f, r0.f28993n[i2].f18838f / 2.0f, 0.0f);
                                x2.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                                x2.glTranslatef((-r0.f28993n[i2].f18837e) / 2.0f, (-r0.f28993n[i2].f18838f) / 2.0f, 0.0f);
                            }
                            x2.glScalef(r0.f28993n[i2].f18837e, r0.f28993n[i2].f18838f, 1.0f);
                            x2.glMatrixMode(5888);
                        } else {
                            r0.f28999t.mo7115a(c5052d2, i2 * 2);
                        }
                        x2.glPushMatrix();
                        c5084a = r0.f28993n[i2];
                        x = c5052d.m22635x();
                        c5056h3 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                        afVar6 = c5056h3.f18735a;
                        afVar7 = c5056h3.f18736b;
                        c6570b2.m29237a(afVar7);
                        af.m21468b(c5084a.f18833a, afVar7, afVar6);
                        q = c6570b.m29261q();
                        x.glTranslatef(((float) afVar6.m21490f()) * q, ((float) afVar6.m21492g()) * q, ((float) afVar6.m21494h()) * q);
                        x.glRotatef(90.0f - c5084a.f18836d, 0.0f, 0.0f, 1.0f);
                        if (k != 0.0f) {
                            x.glRotatef(k, 1.0f, 0.0f, 0.0f);
                        }
                        x.glScalef(c5084a.f18834b * q, q * c5084a.f18835c, 1.0f);
                        x.glDrawArrays(5, 0, 4);
                        x2.glPopMatrix();
                    }
                    if (r0.f28993n.length == i) {
                        x2.glMatrixMode(5890);
                        x2.glLoadIdentity();
                        x2.glMatrixMode(5888);
                    }
                }
            }
            k = 0.0f;
            for (i2 = 0; i2 < r0.f28993n.length; i2++) {
                if (r0.f28993n.length != i) {
                    r0.f28999t.mo7115a(c5052d2, i2 * 2);
                } else {
                    x2.glMatrixMode(5890);
                    x2.glLoadIdentity();
                    if (r0.f28998s) {
                        x2.glTranslatef(r0.f28993n[i2].f18837e / 2.0f, r0.f28993n[i2].f18838f / 2.0f, 0.0f);
                        x2.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                        x2.glTranslatef((-r0.f28993n[i2].f18837e) / 2.0f, (-r0.f28993n[i2].f18838f) / 2.0f, 0.0f);
                    }
                    x2.glScalef(r0.f28993n[i2].f18837e, r0.f28993n[i2].f18838f, 1.0f);
                    x2.glMatrixMode(5888);
                }
                x2.glPushMatrix();
                c5084a = r0.f28993n[i2];
                x = c5052d.m22635x();
                c5056h3 = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
                afVar6 = c5056h3.f18735a;
                afVar7 = c5056h3.f18736b;
                c6570b2.m29237a(afVar7);
                af.m21468b(c5084a.f18833a, afVar7, afVar6);
                q = c6570b.m29261q();
                x.glTranslatef(((float) afVar6.m21490f()) * q, ((float) afVar6.m21492g()) * q, ((float) afVar6.m21494h()) * q);
                x.glRotatef(90.0f - c5084a.f18836d, 0.0f, 0.0f, 1.0f);
                if (k != 0.0f) {
                    x.glRotatef(k, 1.0f, 0.0f, 0.0f);
                }
                x.glScalef(c5084a.f18834b * q, q * c5084a.f18835c, 1.0f);
                x.glDrawArrays(5, 0, 4);
                x2.glPopMatrix();
            }
            if (r0.f28993n.length == i) {
                x2.glMatrixMode(5890);
                x2.glLoadIdentity();
                x2.glMatrixMode(5888);
            }
        }
    }

    /* renamed from: a */
    private static int m34354a(float f, float[] fArr, int i) {
        float f2 = f - fArr[i];
        if (f2 <= 0.0f) {
            return i;
        }
        while (f2 > 0.0f && i < fArr.length - 1) {
            int i2 = i + 1;
            float f3 = f - fArr[i2];
            if (f3 <= 0.0f) {
                return (-f3) < f2 ? i2 : i;
            } else {
                i = i2;
                f2 = f3;
            }
        }
        return fArr.length - 1;
    }

    /* renamed from: a */
    private static aj m34355a(aj ajVar, float f, float f2) {
        int i;
        float b;
        int i2;
        int i3;
        int[] iArr;
        C5056h c5056h = (C5056h) com.google.android.m4b.maps.bx.ai.f24418b.get();
        af afVar = c5056h.f18741g;
        af afVar2 = c5056h.f18742h;
        af afVar3 = c5056h.f18743i;
        af afVar4 = c5056h.f18744j;
        int i4 = 1;
        int b2 = ajVar.m21528b() - 1;
        float f3 = f2;
        f2 = f;
        for (i = 0; i < b2; i++) {
            b = ajVar.m21527b(i);
            f2 -= b;
            float b3;
            int i5;
            if (f2 <= 1.0E-4f) {
                if (f2 < -1.0E-4f) {
                    f2 = (f2 / b) + 1.0f;
                    ajVar.m21524a(i, afVar4);
                    ajVar.m21524a(i + 1, afVar3);
                    af.m21462a(afVar4, afVar3, f2, afVar);
                    f2 = Float.MIN_VALUE;
                    b = f3;
                    for (i2 = i; i2 < b2; i2++) {
                        b3 = ajVar.m21527b(i2);
                        b -= b3;
                        if (b <= 1.0E-4f) {
                            if (b < 1.0E-4f) {
                                b = (b / b3) + 1.0f;
                                ajVar.m21524a(i2, afVar4);
                                ajVar.m21524a(i2 + 1, afVar3);
                                af.m21462a(afVar4, afVar3, b, afVar2);
                                i3 = 1;
                                i += Float.MIN_VALUE;
                                iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                                if (f2 != null) {
                                    afVar.m21480a(iArr, 0);
                                } else {
                                    i4 = 0;
                                }
                                while (i <= i2) {
                                    ajVar.m21524a(i, afVar3);
                                    i5 = i4 + 1;
                                    afVar3.m21480a(iArr, i4);
                                    i++;
                                    i4 = i5;
                                }
                                if (i3 != 0) {
                                    afVar2.m21480a(iArr, i4);
                                }
                                return aj.m21520a(iArr);
                            }
                            i3 = 0;
                            i += Float.MIN_VALUE;
                            iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                            if (f2 != null) {
                                i4 = 0;
                            } else {
                                afVar.m21480a(iArr, 0);
                            }
                            while (i <= i2) {
                                ajVar.m21524a(i, afVar3);
                                i5 = i4 + 1;
                                afVar3.m21480a(iArr, i4);
                                i++;
                                i4 = i5;
                            }
                            if (i3 != 0) {
                                afVar2.m21480a(iArr, i4);
                            }
                            return aj.m21520a(iArr);
                        }
                    }
                    i3 = 0;
                    i += Float.MIN_VALUE;
                    iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                    if (f2 != null) {
                        afVar.m21480a(iArr, 0);
                    } else {
                        i4 = 0;
                    }
                    while (i <= i2) {
                        ajVar.m21524a(i, afVar3);
                        i5 = i4 + 1;
                        afVar3.m21480a(iArr, i4);
                        i++;
                        i4 = i5;
                    }
                    if (i3 != 0) {
                        afVar2.m21480a(iArr, i4);
                    }
                    return aj.m21520a(iArr);
                }
                f2 = 0.0f;
                b = f3;
                while (i2 < b2) {
                    b3 = ajVar.m21527b(i2);
                    b -= b3;
                    if (b <= 1.0E-4f) {
                    } else {
                        if (b < 1.0E-4f) {
                            b = (b / b3) + 1.0f;
                            ajVar.m21524a(i2, afVar4);
                            ajVar.m21524a(i2 + 1, afVar3);
                            af.m21462a(afVar4, afVar3, b, afVar2);
                            i3 = 1;
                            i += Float.MIN_VALUE;
                            iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                            if (f2 != null) {
                                i4 = 0;
                            } else {
                                afVar.m21480a(iArr, 0);
                            }
                            while (i <= i2) {
                                ajVar.m21524a(i, afVar3);
                                i5 = i4 + 1;
                                afVar3.m21480a(iArr, i4);
                                i++;
                                i4 = i5;
                            }
                            if (i3 != 0) {
                                afVar2.m21480a(iArr, i4);
                            }
                            return aj.m21520a(iArr);
                        }
                        i3 = 0;
                        i += Float.MIN_VALUE;
                        iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                        if (f2 != null) {
                            afVar.m21480a(iArr, 0);
                        } else {
                            i4 = 0;
                        }
                        while (i <= i2) {
                            ajVar.m21524a(i, afVar3);
                            i5 = i4 + 1;
                            afVar3.m21480a(iArr, i4);
                            i++;
                            i4 = i5;
                        }
                        if (i3 != 0) {
                            afVar2.m21480a(iArr, i4);
                        }
                        return aj.m21520a(iArr);
                    }
                }
                i3 = 0;
                i += Float.MIN_VALUE;
                iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                if (f2 != null) {
                    i4 = 0;
                } else {
                    afVar.m21480a(iArr, 0);
                }
                while (i <= i2) {
                    ajVar.m21524a(i, afVar3);
                    i5 = i4 + 1;
                    afVar3.m21480a(iArr, i4);
                    i++;
                    i4 = i5;
                }
                if (i3 != 0) {
                    afVar2.m21480a(iArr, i4);
                }
                return aj.m21520a(iArr);
            }
            f3 -= b;
        }
        f2 = 0.0f;
        b = f3;
        for (i2 = i; i2 < b2; i2++) {
            b3 = ajVar.m21527b(i2);
            b -= b3;
            if (b <= 1.0E-4f) {
                if (b < 1.0E-4f) {
                    b = (b / b3) + 1.0f;
                    ajVar.m21524a(i2, afVar4);
                    ajVar.m21524a(i2 + 1, afVar3);
                    af.m21462a(afVar4, afVar3, b, afVar2);
                    i3 = 1;
                    i += Float.MIN_VALUE;
                    iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                    if (f2 != null) {
                        afVar.m21480a(iArr, 0);
                    } else {
                        i4 = 0;
                    }
                    while (i <= i2) {
                        ajVar.m21524a(i, afVar3);
                        i5 = i4 + 1;
                        afVar3.m21480a(iArr, i4);
                        i++;
                        i4 = i5;
                    }
                    if (i3 != 0) {
                        afVar2.m21480a(iArr, i4);
                    }
                    return aj.m21520a(iArr);
                }
                i3 = 0;
                i += Float.MIN_VALUE;
                iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
                if (f2 != null) {
                    i4 = 0;
                } else {
                    afVar.m21480a(iArr, 0);
                }
                while (i <= i2) {
                    ajVar.m21524a(i, afVar3);
                    i5 = i4 + 1;
                    afVar3.m21480a(iArr, i4);
                    i++;
                    i4 = i5;
                }
                if (i3 != 0) {
                    afVar2.m21480a(iArr, i4);
                }
                return aj.m21520a(iArr);
            }
        }
        i3 = 0;
        i += Float.MIN_VALUE;
        iArr = new int[(((((i2 - i) + 1) + f2) + i3) * 3)];
        if (f2 != null) {
            afVar.m21480a(iArr, 0);
        } else {
            i4 = 0;
        }
        while (i <= i2) {
            ajVar.m21524a(i, afVar3);
            i5 = i4 + 1;
            afVar3.m21480a(iArr, i4);
            i++;
            i4 = i5;
        }
        if (i3 != 0) {
            afVar2.m21480a(iArr, i4);
        }
        return aj.m21520a(iArr);
    }

    /* renamed from: a */
    public final boolean mo7566a(br brVar) {
        if (!brVar.mo5131a(this.f28990k.m21522a(0)) || brVar.mo5131a(this.f28990k.m21531c()) == null) {
            return false;
        }
        return true;
    }
}
