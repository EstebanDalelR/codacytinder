package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bb.C4751l;
import com.google.android.m4b.maps.bm.C4824c;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6518e;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cb.C5062a;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C6576b;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7491e;
import com.google.android.m4b.maps.cb.C7493m;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.b */
public final class C7495b extends C6581d {
    /* renamed from: b */
    private static final af f27672b = new af(46340, 46340, 0);
    /* renamed from: c */
    private static final Comparator<C6518e> f27673c = new C50711();
    /* renamed from: d */
    private final C6580k f27674d;
    /* renamed from: e */
    private final C5062a f27675e;
    /* renamed from: f */
    private C4751l f27676f = new C4751l();
    /* renamed from: g */
    private final C6577c f27677g;
    /* renamed from: h */
    private final C6577c f27678h;
    /* renamed from: i */
    private final C5063d f27679i;
    /* renamed from: j */
    private final af f27680j;
    /* renamed from: k */
    private final af f27681k;
    /* renamed from: l */
    private final af f27682l;
    /* renamed from: m */
    private final af f27683m;
    /* renamed from: n */
    private final af f27684n;
    /* renamed from: o */
    private final af f27685o;
    /* renamed from: p */
    private final af f27686p;
    /* renamed from: q */
    private final af f27687q;
    /* renamed from: r */
    private final af f27688r;

    /* renamed from: com.google.android.m4b.maps.cc.b$1 */
    class C50711 implements Comparator<C6518e> {
        C50711() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C6518e) obj2).m28707f() - ((C6518e) obj).m28707f();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.b$a */
    static class C5072a {
        /* renamed from: a */
        int f18798a;
        /* renamed from: b */
        int f18799b;
        /* renamed from: c */
        int f18800c;
        /* renamed from: d */
        int f18801d;

        C5072a() {
        }
    }

    /* renamed from: a */
    public static C7495b m32592a(ba baVar, String[] strArr, C4843b c4843b) {
        C4824c g = C6487i.m28476a().m28508g();
        Object arrayList = new ArrayList(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        C5072a c5072a = new C5072a();
        Set hashSet = new HashSet();
        while (c4843b.hasNext()) {
            C4848k a = c4843b.mo5104a();
            if (!(a instanceof C6518e)) {
                break;
            }
            Object obj;
            C6518e c6518e = (C6518e) a;
            int a2 = c6518e.m28703b().m21691a();
            int c = c6518e.m28704c();
            a2 *= 3;
            int i = (c5072a.f18798a + a2) + (c * 4);
            Object obj2 = 1;
            if (i <= 16384 || c5072a.f18798a <= 0) {
                c5072a.f18798a = i;
                c5072a.f18799b += a2;
                c5072a.f18800c += c * 6;
                c5072a.f18801d += c * 2;
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                break;
            }
            for (int i2 : a.mo5111l()) {
                if (i2 >= 0 && i2 < strArr.length) {
                    hashSet.add(strArr[i2]);
                }
            }
            if (!c6518e.m28705d()) {
                if (g == null || !g.mo5084a(c6518e.mo5107a())) {
                    obj2 = null;
                }
            }
            if (obj2 == null) {
                arrayList.add(c6518e);
            }
            c4843b.next();
        }
        Collections.sort(arrayList, f27673c);
        al i3 = baVar.m21626i();
        float a3 = (float) af.m21452a(i3.m32212c().m21481b());
        c4843b = new C7495b(c5072a, hashSet);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c4843b.m32594a(i3, (C6518e) it.next(), a3);
        }
        c4843b.f27677g.m29312a((C6577c) c4843b.f27679i, 0, c4843b.f27679i.mo5261b());
        ((C6577c) c4843b.f27679i).mo7109a(null);
        return c4843b;
    }

    private C7495b(C5072a c5072a, Set<String> set) {
        super(set);
        this.f27674d = new C7493m(c5072a.f18798a);
        this.f27675e = new C6576b(c5072a.f18798a);
        this.f27677g = new C7491e(c5072a.f18800c + c5072a.f18799b);
        this.f27678h = new C7491e(c5072a.f18801d);
        this.f27679i = new C6577c(c5072a.f18800c);
        this.f27680j = new af();
        this.f27681k = new af();
        this.f27682l = new af();
        this.f27683m = new af();
        this.f27684n = new af();
        this.f27685o = new af();
        this.f27686p = new af();
        this.f27687q = new af();
        this.f27688r = new af();
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27674d.mo7121b(c5052d);
        this.f27675e.mo5267a(c5052d);
        this.f27677g.mo7111b(c5052d);
        this.f27678h.mo7111b(c5052d);
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27674d.m29354c(c5052d);
        this.f27675e.m22673b(c5052d);
        this.f27677g.m29319c(c5052d);
        this.f27678h.m29319c(c5052d);
    }

    /* renamed from: a */
    public static void m32595a(C5052d c5052d, int i) {
        GL10 x = c5052d.m22635x();
        c5052d.m22631t();
        c5052d.m22632u();
        x.glPolygonOffsetx(65536, 65536);
        if (i == 11) {
            x.glBlendFunc(null, 1);
            x.glDepthFunc(513);
            return;
        }
        if (i == 12) {
            c5052d.m22625n();
            x.glDepthFunc(515);
            x.glBlendFunc(770, 771);
            x.glLineWidthx(65536);
        }
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (this.f27674d.mo5250a() != null) {
            this.f27674d.mo7123d(c5052d);
            this.f27675e.mo5269c(c5052d);
            if (this.f27676f != null) {
                c6570b = this.f27676f.m21091a(c5052d);
                if (c6570b == 65536) {
                    this.f27676f = null;
                } else {
                    c5052d.m22635x().glScalex(65536, 65536, c6570b);
                }
            } else {
                c6570b = 65536;
            }
            if (c5009j.m22388b() == 11) {
                this.f27677g.mo7110a(c5052d, 4);
                return;
            }
            if (c5009j.m22388b() == 12) {
                this.f27677g.mo7110a(c5052d, 4);
                if (c6570b == 65536) {
                    this.f27678h.mo7110a(c5052d, 1);
                }
            }
        }
    }

    /* renamed from: a */
    private void m32594a(al alVar, C6518e c6518e, float f) {
        C7495b c7495b = this;
        C6518e c6518e2 = c6518e;
        as e = c6518e.mo5108e();
        bj b = c6518e.m28703b();
        int a = b.m21691a();
        int c = e.m21559c();
        if (a != 0) {
            if (c != 0) {
                int a2;
                af c2 = alVar.m32212c();
                int f2 = alVar.m32215f();
                int f3 = c6518e.m28707f();
                int g = c6518e.m28708g();
                int i = 0;
                c7495b.f27686p.m21477a(0, 0, (int) (((float) f3) * f));
                int a3 = C7495b.m32591a(e.m21556a(0), 160);
                if (c > 1) {
                    a2 = C7495b.m32591a(e.m21556a(1), 160);
                } else {
                    a2 = (((((((a3 >> 16) & 255) + 765) >> 2) << 16) | (-16777216 & a3)) | (((((a3 >> 8) & 255) + 765) >> 2) << 8)) | (((a3 & 255) + 765) >> 2);
                }
                int i2 = a2;
                f3 = 0;
                while (f3 < a) {
                    int i3;
                    int i4;
                    int i5;
                    a2 = c7495b.f27674d.mo5250a();
                    b.m21692a(f3, c7495b.f27680j, c7495b.f27681k, c7495b.f27682l);
                    af.m21468b(c7495b.f27680j, c2, c7495b.f27680j);
                    af.m21468b(c7495b.f27681k, c2, c7495b.f27681k);
                    af.m21468b(c7495b.f27682l, c2, c7495b.f27682l);
                    if (g != 0) {
                        c7495b.f27687q.m21477a(i, i, (int) (((float) g) * f));
                        af.m21463a(c7495b.f27680j, c7495b.f27687q, c7495b.f27680j);
                        af.m21463a(c7495b.f27681k, c7495b.f27687q, c7495b.f27681k);
                        af.m21463a(c7495b.f27682l, c7495b.f27687q, c7495b.f27682l);
                    }
                    af.m21463a(c7495b.f27680j, c7495b.f27686p, c7495b.f27683m);
                    af.m21463a(c7495b.f27681k, c7495b.f27686p, c7495b.f27684n);
                    af.m21463a(c7495b.f27682l, c7495b.f27686p, c7495b.f27685o);
                    c7495b.f27674d.mo5257a(c7495b.f27683m, f2);
                    c7495b.f27674d.mo5257a(c7495b.f27684n, f2);
                    c7495b.f27674d.mo5257a(c7495b.f27685o, f2);
                    c7495b.f27675e.m22672b(i2, 3);
                    c7495b.f27677g.m29314a((short) a2, (short) (a2 + 1), (short) (a2 + 2));
                    if (c6518e2.m28702a(f3, i)) {
                        i = f3;
                        i3 = i2;
                        i4 = 1;
                        i5 = a3;
                        m32593a(c7495b.f27680j, c7495b.f27681k, c7495b.f27683m, c7495b.f27684n, f2, a3);
                    } else {
                        i = f3;
                        i3 = i2;
                        i5 = a3;
                        i4 = 1;
                    }
                    if (c6518e2.m28702a(i, i4)) {
                        m32593a(c7495b.f27681k, c7495b.f27682l, c7495b.f27684n, c7495b.f27685o, f2, i5);
                    }
                    if (c6518e2.m28702a(i, 2)) {
                        m32593a(c7495b.f27682l, c7495b.f27680j, c7495b.f27685o, c7495b.f27683m, f2, i5);
                    }
                    f3 = i + 1;
                    a3 = i5;
                    i2 = i3;
                    i = 0;
                }
            }
        }
    }

    /* renamed from: a */
    private void m32593a(af afVar, af afVar2, af afVar3, af afVar4, int i, int i2) {
        int a = this.f27674d.mo5250a();
        this.f27674d.mo5257a(afVar, i);
        this.f27674d.mo5257a(afVar3, i);
        this.f27674d.mo5257a(afVar2, i);
        this.f27674d.mo5257a(afVar4, i);
        afVar4 = a + 1;
        i = a + 3;
        this.f27679i.mo5256a(afVar4, a, i, a + 2);
        this.f27678h.m29313a((short) afVar4, (short) i);
        af.m21468b(afVar2, afVar, this.f27688r);
        afVar = this.f27675e;
        afVar2 = this.f27688r;
        afVar3 = -16777216 & i2;
        afVar4 = (i2 >> 16) & 255;
        i = (i2 >> 8) & 255;
        i2 &= 255;
        afVar2 = (int) (af.m21453a(afVar2, f27672b) / afVar2.m21496i());
        if (afVar2 < null) {
            afVar2 = -afVar2;
        }
        afVar2 = ((afVar2 * 19660) >> 16) + 45875;
        afVar.m22672b(((i2 * afVar2) >> 16) | ((afVar3 | (((afVar4 * afVar2) >> 16) << 16)) | (((i * afVar2) >> 16) << 8)), 4);
    }

    /* renamed from: a */
    public final int mo7125a() {
        return (((this.f27674d.m29353c() + this.f27675e.m22666a()) + this.f27677g.m29318c()) + this.f27678h.m29318c()) + ((C6577c) this.f27679i).m29318c();
    }

    /* renamed from: b */
    public final int mo7126b() {
        return ((((this.f27674d.mo7122d() + 352) + this.f27675e.mo5268b()) + this.f27677g.mo7112d()) + this.f27678h.mo7112d()) + ((C6577c) this.f27679i).mo7112d();
    }

    /* renamed from: a */
    private static int m32591a(int i, int i2) {
        return (i & 16777215) | (Math.min((i >> 24) & 255, 160) << 24);
    }
}
