package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bb.C4749e;
import com.google.android.m4b.maps.bb.C4749e.C4748a;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5049a;
import com.google.android.m4b.maps.ca.C5050b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5054e;
import com.google.android.m4b.maps.ca.C5057j;
import com.google.android.m4b.maps.ca.C6573f;
import com.google.android.m4b.maps.cb.C5062a;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5065h;
import com.google.android.m4b.maps.cb.C5067l;
import com.google.android.m4b.maps.cb.C6576b;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7491e;
import com.google.android.m4b.maps.cb.C7492i;
import com.google.android.m4b.maps.cb.C7493m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.p */
public final class C7502p extends C6581d {
    /* renamed from: b */
    private static final float[] f27746b = new float[]{0.7176471f, 0.7176471f, 0.8980392f, 1.0f};
    /* renamed from: c */
    private static final float f27747c = ((float) (1.0d / Math.sqrt(2.0d)));
    /* renamed from: A */
    private final ArrayList<ao> f27748A;
    /* renamed from: B */
    private final ArrayList<ao> f27749B;
    /* renamed from: C */
    private boolean f27750C = false;
    /* renamed from: D */
    private float f27751D;
    /* renamed from: E */
    private float f27752E;
    /* renamed from: d */
    private final ba f27753d;
    /* renamed from: e */
    private final float[] f27754e;
    /* renamed from: f */
    private final C6573f f27755f;
    /* renamed from: g */
    private final C6573f f27756g;
    /* renamed from: h */
    private final C6580k f27757h;
    /* renamed from: i */
    private final C6579g f27758i;
    /* renamed from: j */
    private final C5062a f27759j;
    /* renamed from: k */
    private final C5062a f27760k;
    /* renamed from: l */
    private final C6577c f27761l;
    /* renamed from: m */
    private final C5062a f27762m;
    /* renamed from: n */
    private final C6580k f27763n;
    /* renamed from: o */
    private final C6579g f27764o;
    /* renamed from: p */
    private final C6577c f27765p;
    /* renamed from: q */
    private final C5062a f27766q;
    /* renamed from: r */
    private final C6580k f27767r;
    /* renamed from: s */
    private final C5050b f27768s;
    /* renamed from: t */
    private final C6577c f27769t;
    /* renamed from: u */
    private final C6577c f27770u;
    /* renamed from: v */
    private final C6580k f27771v;
    /* renamed from: w */
    private final C6579g f27772w;
    /* renamed from: x */
    private final C6577c f27773x;
    /* renamed from: y */
    private C4749e f27774y;
    /* renamed from: z */
    private final af f27775z = new af();

    /* renamed from: com.google.android.m4b.maps.cc.p$a */
    static class C5088a {
        /* renamed from: a */
        int f18853a;
        /* renamed from: b */
        int f18854b;
        /* renamed from: c */
        int f18855c;
        /* renamed from: d */
        int f18856d;
        /* renamed from: e */
        int f18857e;
        /* renamed from: f */
        int f18858f;
        /* renamed from: g */
        int f18859g;
        /* renamed from: h */
        int f18860h;
        /* renamed from: i */
        Boolean f18861i;

        C5088a() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.p$b */
    static class C5089b {
        /* renamed from: a */
        boolean f18862a;
        /* renamed from: b */
        boolean f18863b;
        /* renamed from: c */
        float f18864c;
        /* renamed from: d */
        int f18865d;
        /* renamed from: e */
        int f18866e;
        /* renamed from: f */
        int f18867f;
        /* renamed from: g */
        int f18868g;

        C5089b() {
        }

        public final String toString() {
            String valueOf = String.valueOf("RoadAttributes{draw?=");
            boolean z = this.f18862a;
            boolean z2 = this.f18863b;
            float f = this.f18864c;
            String valueOf2 = String.valueOf(Integer.toHexString(this.f18865d));
            String valueOf3 = String.valueOf(Integer.toHexString(this.f18866e));
            String valueOf4 = String.valueOf(Integer.toHexString(this.f18867f));
            String valueOf5 = String.valueOf(Integer.toHexString(this.f18868g));
            StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(valueOf).length() + 97) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(z);
            stringBuilder.append(", renderAsLine?=");
            stringBuilder.append(z2);
            stringBuilder.append(", width=");
            stringBuilder.append(f);
            stringBuilder.append(", outline=");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", fill=");
            stringBuilder.append(valueOf3);
            stringBuilder.append(", highlight=");
            stringBuilder.append(valueOf4);
            stringBuilder.append(", dashedHighlight=");
            stringBuilder.append(valueOf5);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static C7502p m32708a(ba baVar, String[] strArr, C4843b c4843b, C5057j c5057j, C5052d c5052d) {
        String[] strArr2 = strArr;
        al i = baVar.m21626i();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(512);
        int b = baVar.m21619b();
        C5088a c5088a = new C5088a();
        C5089b c5089b = new C5089b();
        int i2 = -1;
        while (true) {
            int i3 = 0;
            if (!c4843b.hasNext()) {
                break;
            }
            C4848k a = c4843b.mo5104a();
            if (!(a instanceof ao)) {
                break;
            }
            ao aoVar = (ao) a;
            if (aoVar.m28583f()) {
                if (aoVar.mo5108e().m21567k() != null) {
                    if (i2 != -1) {
                        if (i2 != aoVar.mo5108e().m21567k().m21546b()) {
                            break;
                        }
                    }
                    i2 = aoVar.mo5108e().m21567k().m21546b();
                } else {
                    i2 = -4737051;
                }
            }
            C7502p.m32710a(aoVar, c5089b);
            if (!C7502p.m32715a(b, aoVar, c5089b, c5088a)) {
                break;
            }
            int[] l = a.mo5111l();
            int length = l.length;
            while (i3 < length) {
                int i4 = l[i3];
                if (i4 >= 0 && i4 < strArr2.length) {
                    hashSet.add(strArr2[i4]);
                }
                i3++;
            }
            arrayList.add(aoVar);
            c4843b.next();
        }
        C7502p c7502p = new C7502p(baVar, c5088a, hashSet, c5052d, i2);
        C5054e a2 = C5054e.m22640a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ao aoVar2 = (ao) it.next();
            C7502p.m32710a(aoVar2, c5089b);
            if (c5089b.f18862a) {
                boolean g;
                boolean z;
                af c;
                aj b2;
                float a3;
                int a4;
                int b3;
                C6580k c6580k;
                C6579g c6579g;
                C5065h c5065h;
                C5067l c5067l;
                int a5;
                C6580k c6580k2;
                float f;
                C6580k c6580k3;
                as e = aoVar2.mo5108e();
                if (e.m21557b() > 0) {
                    ar b4 = e.m21558b(i3);
                    if (b4 != null) {
                        boolean f2 = b4.m21550f();
                        g = b4.m21551g();
                        z = f2;
                        c = i.m32212c();
                        i2 = i.m32215f();
                        b2 = aoVar2.m28579b();
                        a3 = c7502p.m32705a(c5089b.f18864c, i2);
                        if (!(c5089b.f18866e == 0 && c5089b.f18865d == 0 && c5089b.f18867f == 0)) {
                            a4 = c7502p.f27757h.mo5250a();
                            b3 = c7502p.f27761l.mo5261b();
                            c6580k = c7502p.f27757h;
                            c6579g = c7502p.f27758i;
                            c5065h = c6579g;
                            c5067l = c6580k;
                            i3 = b3;
                            a2.m22644a(b2, a3, c, i2, c5067l, c5065h, c7502p.f27761l, z, g, (byte) 0);
                            a5 = c7502p.f27757h.mo5250a() - a4;
                            c7502p.f27759j.m22672b(c5089b.f18866e, a5);
                            c7502p.f27760k.m22672b(c5089b.f18865d, a5);
                            if (!(c7502p.f27762m == null || c5089b.f18867f == 0)) {
                                c7502p.f27762m.m22672b(c5089b.f18867f, a5);
                            }
                            if (c7502p.f27767r != null) {
                                if (c5089b.f18863b) {
                                    c7502p.f27770u.m29312a(c7502p.f27761l, i3, c7502p.f27761l.mo5261b() - i3);
                                } else {
                                    c7502p.m32709a(b2, c, i2, c5089b.f18865d);
                                }
                            }
                        }
                        if (C7502p.m32714a(c7502p.f27753d.m21619b(), aoVar2)) {
                            a2.m22647a(b2, a3, false, c, i2, 1.0f, (C5067l) c7502p.f27771v, c7502p.f27773x, null);
                            c7502p.f27748A.add(aoVar2);
                        }
                        if (c5089b.f18868g != 0) {
                            i3 = c7502p.f27763n.mo5250a();
                            c6580k2 = c7502p.f27763n;
                            f = a3;
                            c6580k3 = c6580k2;
                            a2.m22647a(b2, f, false, c, i2, 1.0f, (C5067l) c6580k3, (C5063d) c7502p.f27765p, null);
                            c7502p.f27766q.m22672b(c5089b.f18868g, c7502p.f27763n.mo5250a() - i3);
                            c7502p.f27749B.add(aoVar2);
                        }
                        c7502p.f27750C = aoVar2.m28588k();
                    }
                }
                z = false;
                g = false;
                c = i.m32212c();
                i2 = i.m32215f();
                b2 = aoVar2.m28579b();
                a3 = c7502p.m32705a(c5089b.f18864c, i2);
                a4 = c7502p.f27757h.mo5250a();
                b3 = c7502p.f27761l.mo5261b();
                c6580k = c7502p.f27757h;
                c6579g = c7502p.f27758i;
                c5065h = c6579g;
                c5067l = c6580k;
                i3 = b3;
                a2.m22644a(b2, a3, c, i2, c5067l, c5065h, c7502p.f27761l, z, g, (byte) 0);
                a5 = c7502p.f27757h.mo5250a() - a4;
                c7502p.f27759j.m22672b(c5089b.f18866e, a5);
                c7502p.f27760k.m22672b(c5089b.f18865d, a5);
                c7502p.f27762m.m22672b(c5089b.f18867f, a5);
                if (c7502p.f27767r != null) {
                    if (c5089b.f18863b) {
                        c7502p.f27770u.m29312a(c7502p.f27761l, i3, c7502p.f27761l.mo5261b() - i3);
                    } else {
                        c7502p.m32709a(b2, c, i2, c5089b.f18865d);
                    }
                }
                if (C7502p.m32714a(c7502p.f27753d.m21619b(), aoVar2)) {
                    a2.m22647a(b2, a3, false, c, i2, 1.0f, (C5067l) c7502p.f27771v, c7502p.f27773x, null);
                    c7502p.f27748A.add(aoVar2);
                }
                if (c5089b.f18868g != 0) {
                    i3 = c7502p.f27763n.mo5250a();
                    c6580k2 = c7502p.f27763n;
                    f = a3;
                    c6580k3 = c6580k2;
                    a2.m22647a(b2, f, false, c, i2, 1.0f, (C5067l) c6580k3, (C5063d) c7502p.f27765p, null);
                    c7502p.f27766q.m22672b(c5089b.f18868g, c7502p.f27763n.mo5250a() - i3);
                    c7502p.f27749B.add(aoVar2);
                }
                c7502p.f27750C = aoVar2.m28588k();
            }
            i3 = 0;
        }
        return c7502p;
    }

    private C7502p(ba baVar, C5088a c5088a, HashSet<String> hashSet, C5052d c5052d, int i) {
        super(hashSet);
        this.f27753d = baVar;
        this.f27754e = new float[]{((float) ((i >>> 16) & 255)) / 255.0f, ((float) ((i >>> 8) & 255)) / 1132396544, ((float) (i & 255)) / 1132396544, ((float) ((i >>> 24) & 255)) / 1132396544};
        this.f27755f = null;
        this.f27756g = null;
        this.f27757h = new C7493m(c5088a.f18853a, true);
        this.f27758i = new C7492i(c5088a.f18853a, true);
        this.f27760k = new C6576b(c5088a.f18853a, true);
        this.f27759j = new C6576b(c5088a.f18853a, true);
        this.f27761l = new C7491e(c5088a.f18854b, true);
        if (c5088a.f18861i == Boolean.TRUE) {
            this.f27762m = new C6576b(c5088a.f18853a);
        } else {
            this.f27762m = null;
        }
        if (c5088a.f18855c > null) {
            this.f27767r = new C7493m(c5088a.f18855c);
            this.f27768s = new C5050b(c5088a.f18855c, c5052d.m22601E());
            this.f27769t = new C7491e(c5088a.f18856d);
            this.f27770u = new C7491e(c5088a.f18854b);
        } else {
            this.f27767r = null;
            this.f27768s = null;
            this.f27769t = null;
            this.f27770u = null;
        }
        if (c5088a.f18857e > null) {
            this.f27771v = new C7493m(c5088a.f18857e);
            this.f27772w = new C7492i(c5088a.f18857e);
            this.f27773x = new C7491e(c5088a.f18858f);
        } else {
            this.f27771v = null;
            this.f27772w = null;
            this.f27773x = null;
        }
        this.f27748A = new ArrayList();
        this.f27751D = -1.0f;
        if (c5088a.f18859g > null) {
            this.f27763n = new C7493m(c5088a.f18859g);
            this.f27764o = new C7492i(c5088a.f18859g);
            this.f27765p = new C7491e(c5088a.f18860h);
            this.f27766q = new C6576b(c5088a.f18859g);
        } else {
            this.f27763n = null;
            this.f27764o = null;
            this.f27765p = null;
            this.f27766q = null;
        }
        this.f27749B = new ArrayList();
        this.f27752E = -1.0f;
    }

    /* renamed from: a */
    public static int m32707a(C6570b c6570b, C5008i c5008i) {
        int i;
        c6570b = c6570b.m29256l();
        if (c5008i == C5008i.HYBRID) {
            if (c6570b > 17.5f) {
                i = 0;
                if (c5008i == C5008i.NORMAL) {
                    i |= 20;
                }
                if (c6570b >= 15.5f && (c5008i == C5008i.NORMAL || c5008i == C5008i.NIGHT)) {
                    i |= 64;
                }
                return i | 384;
            }
        }
        i = 32;
        if (c5008i == C5008i.NORMAL) {
            i |= 20;
        }
        i |= 64;
        return i | 384;
    }

    /* renamed from: a */
    public static void m32712a(C5052d c5052d, float f, int i) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(770, 771);
        x.glTexEnvx(8960, 8704, 7681);
        c5052d.m22625n();
        c5052d.m22627p();
        f -= (float) i;
        f = f >= 4.0f ? 2.8E-45f : f >= 3.0f ? 4.2E-45f : f >= 2.25f ? 5.6E-45f : (f < 1.0f || i < 17) ? 3.1E-44f : 7.0E-45f;
        c5052d.m22607a().m22653a(f).m32544a(x);
    }

    /* renamed from: a */
    public static void m32713a(C5052d c5052d, float f, int i, C5008i c5008i) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(770, 771);
        x.glTexEnvx(8960, 8704, 7681);
        c5052d.m22625n();
        c5052d.m22627p();
        if (c5008i == C5008i.HYBRID) {
            f = f < 1098907648 ? 9.8E-45f : 2.9E-44f;
        } else {
            f -= (float) i;
            f = f >= 4.0f ? Float.MIN_VALUE : f >= 3.0f ? 2.8E-45f : f >= 2.25f ? 4.2E-45f : (f < 1.0f || i < 17) ? 8.4E-45f : 5.6E-45f;
        }
        c5052d.m22607a().m22653a(f).m32544a(x);
    }

    /* renamed from: a */
    public static void m32711a(C5052d c5052d) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(770, 771);
        x.glTexEnvx(8960, 8704, 8448);
        c5052d.m22627p();
        c5052d.m22607a().m22653a(0).m32544a(x);
    }

    /* renamed from: b */
    public static void m32716b(C5052d c5052d, float f, int i) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(770, 771);
        x.glTexEnvx(8960, 8704, 7681);
        c5052d.m22625n();
        c5052d.m22627p();
        f -= (float) i;
        f = f >= 4.0f ? 3.5E-44f : f >= 3.0f ? 3.6E-44f : f >= 2.25f ? 3.8E-44f : (f < 1.0f || i < 17) ? 4.1E-44f : 3.9E-44f;
        c5052d.m22607a().m22653a(f).m32544a(x);
    }

    /* renamed from: d */
    public static void m32717d(C5052d c5052d) {
        GL10 x = c5052d.m22635x();
        x.glBlendFunc(770, 771);
        x.glTexEnvx(8960, 8704, 7681);
        c5052d.m22625n();
        c5052d.m22627p();
        c5052d.m22607a().m22653a(30).m32544a(x);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C5052d c5052d2 = c5052d;
        float l = c6570b.m29256l() - ((float) this.f27753d.m21619b());
        int b = c5009j.m22388b();
        int i = 1;
        if (b != 2) {
            float f = 65536.0f;
            float f2 = 32768.0f;
            float f3 = 2.0f;
            float f4 = 16.0f;
            int i2 = 32768;
            float f5 = 1.0f;
            ao aoVar;
            int f6;
            int b2;
            switch (b) {
                case 4:
                    r0.f27758i.mo7118d(c5052d2);
                    r0.f27757h.mo7123d(c5052d2);
                    r0.f27760k.mo5269c(c5052d2);
                    if (r0.f27770u != null) {
                        if (l <= 0.25f) {
                            r0.f27770u.mo7110a(c5052d2, 4);
                            return;
                        }
                    }
                    r0.f27761l.mo7110a(c5052d2, 4);
                    return;
                case 5:
                    r0.f27758i.mo7118d(c5052d2);
                    r0.f27757h.mo7123d(c5052d2);
                    r0.f27759j.mo5269c(c5052d2);
                    if (r0.f27770u != null) {
                        if (l <= 0.25f) {
                            r0.f27770u.mo7110a(c5052d2, 4);
                            return;
                        }
                    }
                    r0.f27761l.mo7110a(c5052d2, 4);
                    return;
                case 6:
                    if (r0.f27771v != null) {
                        l = C7502p.m32704a(c6570b.m29256l()) * 6.0f;
                        if (((double) l) > 0.0d) {
                            if (l != r0.f27751D) {
                                r0.f27751D = l;
                                r0.f27772w.mo7114a(c5052d2);
                                C5065h c5065h = r0.f27772w;
                                Iterator it = r0.f27748A.iterator();
                                while (it.hasNext()) {
                                    aoVar = (ao) it.next();
                                    f3 = f5 / l;
                                    f = f5 / (l * f4);
                                    f6 = r0.f27753d.m21626i().m32215f();
                                    aj b3 = aoVar.m28579b();
                                    b2 = b3.m21528b() - i;
                                    float a = m32705a(C7502p.m32706a(aoVar.mo5108e()), f6) * 2.0f;
                                    int i3 = 0;
                                    while (i3 < b2) {
                                        int i4;
                                        int i5;
                                        float f7;
                                        float b4 = b3.m21527b(i3) * f;
                                        if (b4 > 0.5f) {
                                            i4 = (int) ((a * f3) * f2);
                                            i5 = (int) (b4 * 65536.0f);
                                            b4 -= (float) ((int) b4);
                                            i = (b4 <= 0.125f || b4 >= 0.375f) ? 0 : 40960;
                                            f7 = l;
                                            i2 = 32768;
                                        } else {
                                            i = 49152;
                                            f7 = l;
                                            i5 = 0;
                                            i2 = 32768;
                                            i4 = 0;
                                        }
                                        int i6 = i2 - i4;
                                        i4 += i2;
                                        if (aoVar.m28581d()) {
                                            i5 += i;
                                            c5065h.mo5254a(i4, i5);
                                            c5065h.mo5254a(i6, i5);
                                            c5065h.mo5254a(i6, i);
                                            c5065h.mo5254a(i4, i);
                                        } else {
                                            c5065h.mo5254a(i6, i);
                                            c5065h.mo5254a(i4, i);
                                            i5 += i;
                                            c5065h.mo5254a(i4, i5);
                                            c5065h.mo5254a(i6, i5);
                                        }
                                        i3++;
                                        l = f7;
                                        i = 1;
                                        f2 = 32768.0f;
                                        f5 = 1.0f;
                                    }
                                    f4 = 16.0f;
                                }
                                r0.f27774y = new C4749e(0, 500, C4748a.FADE_BETWEEN, 0, 100);
                            }
                            if (r0.f27774y != null) {
                                f5 = ((float) r0.f27774y.m21087a(c5052d2)) / 100.0f;
                                if (f5 > 0.99f) {
                                    r0.f27774y = null;
                                }
                            } else {
                                f5 = 1.0f;
                            }
                            c5052d.m22635x().glColor4f(r0.f27754e[0], r0.f27754e[1], r0.f27754e[2], r0.f27754e[3] * f5);
                            r0.f27772w.mo7118d(c5052d2);
                            r0.f27771v.mo7123d(c5052d2);
                            r0.f27773x.mo7110a(c5052d2, 4);
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    if (r0.f27762m != null) {
                        r0.f27758i.mo7118d(c5052d2);
                        r0.f27757h.mo7123d(c5052d2);
                        r0.f27762m.mo5269c(c5052d2);
                        if (r0.f27770u != null) {
                            if (l <= 0.25f) {
                                r0.f27770u.mo7110a(c5052d2, 4);
                                return;
                            }
                        }
                        r0.f27761l.mo7110a(c5052d2, 4);
                        return;
                    }
                    return;
                case 8:
                    if (r0.f27763n != null) {
                        l = C7502p.m32704a(c6570b.m29256l()) * 6.0f;
                        if (((double) l) > 0.0d) {
                            if (l != r0.f27752E) {
                                r0.f27752E = l;
                                f4 = 16.0f * l;
                                l = 1.0f / l;
                                f5 = 1.0f / f4;
                                r0.f27764o.mo7114a(c5052d2);
                                Iterator it2 = r0.f27749B.iterator();
                                int f8 = r0.f27753d.m21626i().m32215f();
                                while (it2.hasNext()) {
                                    aoVar = (ao) it2.next();
                                    aj b5 = aoVar.m28579b();
                                    f6 = b5.m21528b() - 1;
                                    float a2 = m32705a(C7502p.m32706a(aoVar.mo5108e()), f8) * f3;
                                    int i7 = 0;
                                    while (i7 < f6) {
                                        int i8 = (int) ((a2 * l) * 32768.0f);
                                        b2 = (int) ((b5.m21527b(i7) * f5) * f);
                                        int i9 = i2 - i8;
                                        i8 += i2;
                                        r0.f27764o.mo5254a(i8, b2);
                                        r0.f27764o.mo5254a(i9, b2);
                                        r0.f27764o.mo5254a(i9, 0);
                                        r0.f27764o.mo5254a(i8, 0);
                                        i7++;
                                        f = 65536.0f;
                                        f3 = 2.0f;
                                        i2 = 32768;
                                    }
                                }
                            }
                            r0.f27764o.mo7118d(c5052d2);
                            r0.f27763n.mo7123d(c5052d2);
                            r0.f27766q.mo5269c(c5052d2);
                            r0.f27765p.mo7110a(c5052d2, 4);
                            break;
                        }
                        return;
                    }
                    return;
                default:
                    break;
            }
            return;
        }
        if (r0.f27767r != null) {
            if (l <= 0.25f) {
                r0.f27767r.mo7123d(c5052d2);
                r0.f27768s.m22586a(c5052d2);
                C5049a.m22577c(c5052d);
                r0.f27769t.mo7110a(c5052d2, 1);
                C5049a.m22578d(c5052d);
            }
        }
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27757h.mo7121b(c5052d);
        this.f27758i.mo7116b(c5052d);
        this.f27760k.mo5267a(c5052d);
        this.f27759j.mo5267a(c5052d);
        this.f27761l.mo7111b(c5052d);
        if (this.f27762m != null) {
            this.f27762m.mo5267a(c5052d);
        }
        if (this.f27767r != null) {
            this.f27767r.mo7121b(c5052d);
            this.f27768s.m22588b(c5052d);
            this.f27769t.mo7111b(c5052d);
            this.f27770u.mo7111b(c5052d);
        }
        if (this.f27771v != null) {
            this.f27771v.mo7121b(c5052d);
            this.f27772w.mo7116b(c5052d);
            this.f27773x.mo7111b(c5052d);
        }
        if (this.f27763n != null) {
            this.f27763n.mo7121b(c5052d);
            this.f27764o.mo7116b(c5052d);
            this.f27765p.mo7111b(c5052d);
            this.f27766q.mo5267a(c5052d);
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27757h.m29354c(c5052d);
        this.f27758i.m29340c(c5052d);
        this.f27760k.m22673b(c5052d);
        this.f27759j.m22673b(c5052d);
        this.f27761l.m29319c(c5052d);
        if (this.f27762m != null) {
            this.f27762m.m22673b(c5052d);
        }
        if (this.f27767r != null) {
            this.f27767r.m29354c(c5052d);
            this.f27768s.m22589c(c5052d);
            this.f27769t.m29319c(c5052d);
            this.f27770u.m29319c(c5052d);
        }
        if (this.f27771v != null) {
            this.f27771v.m29354c(c5052d);
            this.f27772w.m29340c(c5052d);
            this.f27773x.m29319c(c5052d);
        }
        if (this.f27763n != null) {
            this.f27763n.m29354c(c5052d);
            this.f27764o.m29340c(c5052d);
            this.f27765p.m29319c(c5052d);
            this.f27766q.m22673b(c5052d);
        }
    }

    /* renamed from: c */
    public final boolean m32723c() {
        return this.f27757h.mo5250a() > 0;
    }

    /* renamed from: a */
    private static float m32704a(float f) {
        int i = (int) f;
        return (((float) (1 << (30 - i))) * (f - ((float) i) > 0.5f ? f27747c : 1.0f)) / 256.0f;
    }

    /* renamed from: a */
    private static float m32706a(as asVar) {
        float f = 0.0f;
        if (asVar.m21557b() == 0) {
            return 0.0f;
        }
        for (int i = 0; i < asVar.m21557b(); i++) {
            f = Math.max(f, asVar.m21558b(i).m21547c());
        }
        return f;
    }

    /* renamed from: a */
    private float m32705a(float f, int i) {
        return ((((float) i) * f) / 1132462080) * (this.f27753d.m21619b() > 14 ? 0.5f : 0.3f);
    }

    /* renamed from: a */
    private static boolean m32715a(int i, ao aoVar, C5089b c5089b, C5088a c5088a) {
        aj b = aoVar.m28579b();
        int b2 = b.m21528b();
        int i2 = b2 - 1;
        if (!c5089b.f18862a) {
            return true;
        }
        int a = C5054e.m22638a(b);
        int i3 = 0;
        if (c5088a.f18853a > 0 && c5088a.f18853a + a > 16384) {
            return false;
        }
        as e = aoVar.mo5108e();
        boolean z = c5089b.f18867f != 0;
        if (c5088a.f18861i == null) {
            c5088a.f18861i = Boolean.valueOf(z);
        } else if (c5088a.f18861i.booleanValue() != z) {
            return false;
        }
        if (c5089b.f18868g != 0) {
            while (i3 < e.m21557b()) {
                if (e.m21558b(i3).m21548d().length != 0) {
                    int i4 = i2 * 2;
                    c5088a.f18859g += i2 * 4;
                    c5088a.f18860h += i4 * 3;
                }
                i3++;
            }
        }
        c5088a.f18853a += a;
        c5088a.f18854b += C5054e.m22642b(b);
        if (c5089b.f18863b != null) {
            c5088a.f18855c += b2;
            c5088a.f18856d += i2 * 2;
        }
        if (C7502p.m32714a(i, aoVar) != 0) {
            i = i2 * 4;
            i2 *= 2;
            c5088a.f18857e += i;
            c5088a.f18858f += i2 * 3;
        }
        return true;
    }

    /* renamed from: a */
    private void m32709a(aj ajVar, af afVar, int i, int i2) {
        int a = this.f27767r.mo5250a();
        int b = ajVar.m21528b();
        for (int i3 = 0; i3 < b; i3++) {
            ajVar.m21524a(i3, this.f27775z);
            af.m21468b(this.f27775z, afVar, this.f27775z);
            this.f27767r.mo5257a(this.f27775z, i);
            if (i3 > 0) {
                int i4 = a + i3;
                this.f27769t.m29313a((short) (i4 - 1), (short) i4);
            }
        }
        this.f27768s.m22585a(i2, b);
    }

    /* renamed from: a */
    private static boolean m32714a(int i, ao aoVar) {
        return i >= 14 && aoVar.m28583f() != 0;
    }

    /* renamed from: a */
    public final int mo7125a() {
        int c = (((this.f27757h.m29353c() + this.f27758i.m29336b()) + this.f27759j.m22666a()) + this.f27760k.m22666a()) + this.f27761l.m29318c();
        if (this.f27762m != null) {
            c += this.f27762m.m22666a();
        }
        if (this.f27767r != null) {
            c += this.f27767r.m29353c();
        }
        if (this.f27768s != null) {
            c += this.f27768s.m22584a();
        }
        if (this.f27769t != null) {
            c += this.f27769t.m29318c();
        }
        if (this.f27770u != null) {
            c += this.f27770u.m29318c();
        }
        if (this.f27771v != null) {
            c += this.f27771v.m29353c();
        }
        if (this.f27772w != null) {
            c += this.f27772w.m29336b();
        }
        if (this.f27773x != null) {
            c += this.f27773x.m29318c();
        }
        if (this.f27763n != null) {
            c += this.f27763n.m29353c();
        }
        if (this.f27764o != null) {
            c += this.f27764o.m29336b();
        }
        if (this.f27765p != null) {
            c += this.f27765p.m29318c();
        }
        return this.f27766q != null ? c + this.f27766q.m22666a() : c;
    }

    /* renamed from: b */
    public final int mo7126b() {
        int d = ((((this.f27757h.mo7122d() + 464) + this.f27758i.mo7117c()) + this.f27759j.mo5268b()) + this.f27760k.mo5268b()) + this.f27761l.mo7112d();
        if (this.f27762m != null) {
            d += this.f27762m.mo5268b();
        }
        if (this.f27767r != null) {
            d += this.f27767r.mo7122d();
        }
        if (this.f27768s != null) {
            d += this.f27768s.m22587b();
        }
        if (this.f27769t != null) {
            d += this.f27769t.mo7112d();
        }
        if (this.f27770u != null) {
            d += this.f27770u.mo7112d();
        }
        if (this.f27771v != null) {
            d += this.f27771v.mo7122d();
        }
        if (this.f27772w != null) {
            d += this.f27772w.mo7117c();
        }
        if (this.f27773x != null) {
            d += this.f27773x.mo7112d();
        }
        if (this.f27763n != null) {
            d += this.f27763n.mo7122d();
        }
        if (this.f27764o != null) {
            d += this.f27764o.mo7117c();
        }
        if (this.f27765p != null) {
            d += this.f27765p.mo7112d();
        }
        if (this.f27766q != null) {
            d += this.f27766q.mo5268b();
        }
        d += 24;
        Iterator it = this.f27748A.iterator();
        while (it.hasNext()) {
            d += ((ao) it.next()).mo5112m();
        }
        d += 24;
        it = this.f27749B.iterator();
        while (it.hasNext()) {
            d += ((ao) it.next()).mo5112m();
        }
        return d;
    }

    /* renamed from: a */
    private static void m32710a(ao aoVar, C5089b c5089b) {
        int i;
        as e = aoVar.mo5108e();
        c5089b.f18864c = C7502p.m32706a(e);
        boolean z = false;
        c5089b.f18865d = 0;
        c5089b.f18866e = 0;
        c5089b.f18867f = 0;
        if (e.m21557b() >= 2) {
            c5089b.f18865d = e.m21558b(0).m21546b();
            c5089b.f18866e = e.m21558b(1).m21546b();
            if (e.m21557b() > 2) {
                i = 2;
                while (i < e.m21557b()) {
                    if (e.m21558b(i).m21548d().length == 0) {
                        break;
                    }
                    i++;
                }
                i = 2;
                c5089b.f18867f = e.m21558b(i).m21546b();
            }
        } else if (e.m21557b() > 0) {
            c5089b.f18866e = e.m21558b(0).m21546b();
        }
        c5089b.f18868g = 0;
        if (e.m21557b() > 2) {
            i = 2;
            float f = 0.0f;
            while (i < e.m21557b()) {
                if (e.m21558b(i).m21548d().length > 0) {
                    f = e.m21558b(i).m21547c();
                    c5089b.f18868g = e.m21558b(i).m21546b();
                } else if (c5089b.f18868g != 0 && e.m21558b(i).m21547c() > r6) {
                    c5089b.f18868g = 0;
                }
                i++;
            }
        }
        if (c5089b.f18868g != 0) {
            c5089b.f18867f = 0;
        }
        if (c5089b.f18867f != 0 && (C5051c.m22591a(c5089b.f18866e) < C5051c.m22591a(c5089b.f18865d) || c5089b.f18864c < 9.0f)) {
            c5089b.f18866e = c5089b.f18867f;
        }
        boolean z2 = (aoVar.m28579b().m21528b() < 2 || c5089b.f18864c == 0.0f || (c5089b.f18866e == 0 && c5089b.f18865d == 0 && c5089b.f18867f == 0 && c5089b.f18868g == 0 && !aoVar.m28584g())) ? false : true;
        c5089b.f18862a = z2;
        if (aoVar.m28587j() != null && c5089b.f18868g == null && c5089b.f18867f == null) {
            aoVar = c5089b.f18866e;
            float f2 = (float) ((aoVar >> 16) & 255);
            float f3 = (float) ((aoVar >> 8) & 255);
            aoVar = (float) (aoVar & 255);
            aoVar = (f2 == f3 && f3 == aoVar) ? -1082130432 : (f2 < f3 || f3 < aoVar) ? (f3 <= f2 || f2 < aoVar) ? (f3 < aoVar || aoVar <= f2) ? (aoVar <= f3 || f3 <= f2) ? (aoVar <= f2 || f2 < f3) ? (6.0f - ((aoVar - f3) / (f2 - f3))) * 1114636288 : (((f2 - f3) / (aoVar - f3)) + 4.0f) * 1114636288 : (4.0f - ((f3 - f2) / (aoVar - f2))) * 1114636288 : (((aoVar - f2) / (f3 - f2)) + 1073741824) * 1114636288 : (2.0f - ((f2 - aoVar) / (f3 - aoVar))) * 1114636288 : ((f3 - aoVar) * 60.0f) / (f2 - aoVar);
            aoVar = (aoVar < 80.0f || aoVar > 160.0f) ? null : true;
            if (aoVar == null) {
                z = true;
            }
        }
        c5089b.f18863b = z;
    }
}
