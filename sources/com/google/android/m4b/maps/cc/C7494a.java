package com.google.android.m4b.maps.cc;

import android.util.Log;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6517d;
import com.google.android.m4b.maps.bo.C6526r;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5049a;
import com.google.android.m4b.maps.ca.C5050b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5054e;
import com.google.android.m4b.maps.ca.C5060m;
import com.google.android.m4b.maps.cb.C5065h;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7491e;
import com.google.android.m4b.maps.cb.C7492i;
import com.google.android.m4b.maps.cb.C7493m;
import com.google.android.m4b.maps.cc.C7499j.C5079a;
import com.google.android.m4b.maps.cf.C6593l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.cc.a */
public final class C7494a extends C6581d {
    /* renamed from: b */
    private static final int[] f27660b = new int[]{0, 2, 2, 4, 2, 4, 4, 6};
    /* renamed from: c */
    private static int f27661c = 16384;
    /* renamed from: k */
    private static final as f27662k = new as(-1, 2, new int[0], new ar[]{new ar(-4551839, 2.0f, new int[0], 0)}, null, null, null, null);
    /* renamed from: l */
    private static final as f27663l = new as(-1, 2, new int[0], new ar[]{new ar(-4551839, 1.5f, new int[0], 0)}, null, null, null, null);
    /* renamed from: m */
    private static final ThreadLocal<af[]> f27664m = new C50681();
    /* renamed from: d */
    private final C6580k f27665d;
    /* renamed from: e */
    private final C6580k f27666e;
    /* renamed from: f */
    private final C5050b f27667f;
    /* renamed from: g */
    private final C5050b f27668g;
    /* renamed from: h */
    private C6593l f27669h = null;
    /* renamed from: i */
    private C6593l f27670i = null;
    /* renamed from: j */
    private final C5069a f27671j;

    /* renamed from: com.google.android.m4b.maps.cc.a$1 */
    class C50681 extends ThreadLocal<af[]> {
        C50681() {
        }

        protected final /* synthetic */ Object initialValue() {
            return new af[]{new af(), new af(), new af()};
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.a$a */
    static class C5069a {
        /* renamed from: a */
        private final C6580k f18784a;
        /* renamed from: b */
        private final C6577c f18785b;
        /* renamed from: c */
        private final C6579g f18786c;
        /* renamed from: d */
        private final C6580k f18787d;
        /* renamed from: e */
        private final C6579g f18788e;
        /* renamed from: f */
        private final int f18789f;

        public C5069a(al alVar, List<aj> list, List<C6517d> list2, C5070b c5070b) {
            int a = C5054e.m22639a((List) list);
            this.f18784a = new C7493m(a);
            this.f18786c = new C7492i(a);
            this.f18785b = new C7491e(C5054e.m22643b((List) list));
            Iterator it = list.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                aj ajVar = (aj) it.next();
                af afVar = new af(alVar.m32212c().m21490f() + ((int) c5070b.m22710d()), alVar.m32212c().m21492g() + ((int) c5070b.m22711e()));
                int f = alVar.m32215f();
                int i2 = c5070b.m22709c() ? 65536 : 0;
                int i3 = c5070b.m22709c() ? 0 : 65536;
                if (c5070b.m22713g() > 0.0f) {
                    ajVar = ajVar.m21532c(c5070b.m22713g());
                }
                C5054e.m22640a().m22645a(ajVar, c5070b.m22709c() ? c5070b.m22708b() : c5070b.m22707a(), c5070b.m22709c() ? c5070b.m22707a() : c5070b.m22708b(), afVar, f, i2, i3, r0.f18784a, r0.f18785b, (C5065h) r0.f18786c);
            }
            for (C6517d a2 : list2) {
                i += C7494a.m32578a(a2);
            }
            C5070b c5070b2;
            if (!c5070b.m22712f() || i <= 0) {
                c5070b2 = c5070b;
                r0.f18787d = null;
                r0.f18788e = null;
            } else {
                r0.f18787d = new C7493m(i);
                r0.f18788e = new C7492i(i);
                for (C6517d a22 : list2) {
                    m22701a(alVar, a22, c5070b);
                }
                c5070b2 = c5070b;
            }
            r0.f18789f = c5070b.m22714h();
        }

        /* renamed from: a */
        private void m22701a(al alVar, C6517d c6517d, C5070b c5070b) {
            C5069a c5069a = this;
            if (c6517d.mo5108e().m21559c() != 0) {
                bj b = c6517d.m28688b();
                int a = b.m21691a();
                if (a != 0) {
                    af afVar = new af(alVar.m32212c().m21490f() + ((int) c5070b.m22710d()), alVar.m32212c().m21492g() + ((int) c5070b.m22711e()));
                    int f = alVar.m32215f();
                    af afVar2 = ((af[]) C7494a.f27664m.get())[0];
                    af afVar3 = ((af[]) C7494a.f27664m.get())[1];
                    af afVar4 = ((af[]) C7494a.f27664m.get())[2];
                    int i = 0;
                    for (int i2 = 0; i2 < a; i2++) {
                        int i3 = i;
                        b.m21693a(i2, afVar, afVar2, afVar3, afVar4);
                        c5069a.f18787d.mo5257a(afVar2, f);
                        c5069a.f18787d.mo5257a(afVar3, f);
                        c5069a.f18787d.mo5257a(afVar4, f);
                        i = i3 + 3;
                    }
                    c5069a.f18788e.m29329a(c5070b.m22709c() ? 65536 : 0, 0, i);
                }
            }
        }

        /* renamed from: a */
        public final void m22703a(C5052d c5052d) {
            C5051c.m22593a(c5052d.m22635x(), this.f18789f);
            c5052d.m22607a().m22653a(23).m32544a(c5052d.m22635x());
            this.f18784a.mo7123d(c5052d);
            this.f18786c.mo7118d(c5052d);
            this.f18785b.mo7110a(c5052d, 4);
            if (!(this.f18787d == null || this.f18788e == null)) {
                this.f18787d.mo7123d(c5052d);
                this.f18788e.mo7118d(c5052d);
                c5052d.m22635x().glDrawArrays(4, 0, this.f18787d.mo5250a());
            }
            c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
        }

        /* renamed from: b */
        public final void m22705b(C5052d c5052d) {
            this.f18784a.mo7121b(c5052d);
            this.f18785b.mo7111b(c5052d);
            this.f18786c.mo7116b(c5052d);
        }

        /* renamed from: c */
        public final void m22706c(C5052d c5052d) {
            this.f18784a.m29354c(c5052d);
            this.f18785b.m29319c(c5052d);
            this.f18786c.m29340c(c5052d);
        }

        /* renamed from: a */
        public final int m22702a() {
            int i = 0;
            int c = ((this.f18784a.m29353c() + this.f18785b.m29318c()) + this.f18786c.m29336b()) + (this.f18787d != null ? this.f18787d.m29353c() : 0);
            if (this.f18788e != null) {
                i = this.f18788e.m29336b();
            }
            return c + i;
        }

        /* renamed from: b */
        public final int m22704b() {
            int i = 0;
            int d = (((this.f18784a.mo7122d() + 156) + this.f18785b.mo7112d()) + this.f18786c.mo7117c()) + (this.f18787d != null ? this.f18787d.mo7122d() : 0);
            if (this.f18788e != null) {
                i = this.f18788e.mo7117c();
            }
            return d + i;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.a$b */
    static class C5070b {
        /* renamed from: a */
        private final float f18790a;
        /* renamed from: b */
        private final float f18791b;
        /* renamed from: c */
        private final boolean f18792c;
        /* renamed from: d */
        private final float f18793d;
        /* renamed from: e */
        private final float f18794e;
        /* renamed from: f */
        private final boolean f18795f;
        /* renamed from: g */
        private final float f18796g = 0.0f;
        /* renamed from: h */
        private final int f18797h;

        public C5070b(float f, float f2, boolean z, float f3, float f4, boolean z2, float f5, int i) {
            this.f18790a = f;
            this.f18791b = f2;
            this.f18792c = z;
            this.f18793d = f3;
            this.f18794e = f4;
            this.f18795f = z2;
            this.f18797h = i;
        }

        /* renamed from: a */
        public final float m22707a() {
            return this.f18790a;
        }

        /* renamed from: b */
        public final float m22708b() {
            return this.f18791b;
        }

        /* renamed from: c */
        public final boolean m22709c() {
            return this.f18792c;
        }

        /* renamed from: d */
        public final float m22710d() {
            return this.f18793d;
        }

        /* renamed from: e */
        public final float m22711e() {
            return this.f18794e;
        }

        /* renamed from: f */
        public final boolean m22712f() {
            return this.f18795f;
        }

        /* renamed from: g */
        public final float m22713g() {
            return this.f18796g;
        }

        /* renamed from: h */
        public final int m22714h() {
            return this.f18797h;
        }
    }

    /* renamed from: a */
    private static void m32582a(C5079a c5079a, C6517d c6517d, List<aj> list, ba baVar) {
        C4699a b;
        as asVar;
        ba baVar2 = baVar;
        if (baVar2 != null) {
            b = ((C6526r) baVar2.m21616a(C4839a.INDOOR)).m28766b();
            if (((float) baVar.m21619b()) > 18.0f) {
                asVar = f27662k;
            } else {
                asVar = f27663l;
            }
        } else {
            b = c6517d.mo5107a();
            asVar = c6517d.mo5108e();
        }
        if (!(c6517d.m28688b().m21691a() == 0 || asVar.m21557b() == 0)) {
            if (c6517d.m28689c()) {
                int i = c6517d.mo5110i();
                int f = c6517d.m28692f();
                String g = c6517d.m28693g();
                int[] l = c6517d.mo5111l();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6527u c6527u = r2;
                    Iterator it2 = it;
                    C6527u c6527u2 = new C6527u(-1, b, (aj) it.next(), null, asVar, f, g, i, 0.0f, 0, l, b != null);
                    c5079a.m22728a((C4848k) c6527u);
                    it = it2;
                }
            }
        }
    }

    /* renamed from: a */
    public static C7494a m32579a(ba baVar, String[] strArr, C4843b c4843b, C5079a c5079a, C5070b c5070b, C5052d c5052d) {
        C5069a c5069a;
        Iterator it;
        String[] strArr2 = strArr;
        C5079a c5079a2 = c5079a;
        C5070b c5070b2 = c5070b;
        al i = baVar.m21626i();
        ArrayList arrayList = new ArrayList();
        Set hashSet = new HashSet();
        ba baVar2 = null;
        List arrayList2 = c5070b2 != null ? new ArrayList() : null;
        int i2 = 0;
        int i3 = 0;
        while (c4843b.hasNext()) {
            C4848k a = c4843b.mo5104a();
            if (!(a instanceof C6517d)) {
                break;
            }
            int i4;
            ba baVar3;
            C6517d c6517d = (C6517d) a;
            int a2 = C7494a.m32578a(c6517d);
            int c = C7494a.m32584c(c6517d);
            if (a2 <= f27661c) {
                if (c <= f27661c) {
                    a2 += i2;
                    if (a2 > f27661c) {
                        break;
                    }
                    c += i3;
                    if (c > f27661c) {
                        break;
                    }
                    for (int i42 : a.mo5111l()) {
                        if (i42 >= 0 && i42 < strArr2.length) {
                            hashSet.add(strArr2[i42]);
                        }
                    }
                    arrayList.add(c6517d);
                    Object obj = (c5070b2 == null || !c6517d.m28696j()) ? null : 1;
                    boolean b = C7494a.m32583b(c6517d);
                    if (obj == null) {
                        if (!b) {
                        }
                        baVar3 = baVar;
                        c4843b.next();
                        i2 = a2;
                        i3 = c;
                    }
                    if (c6517d.m28689c()) {
                        Collection a3 = C5060m.m22659a(c6517d.m28688b(), c6517d.m28690d());
                        if (!b) {
                            C7494a.m32582a(c5079a2, c6517d, a3, baVar2);
                        }
                        if (c6517d.m28696j()) {
                            C7494a.m32582a(c5079a2, c6517d, a3, baVar);
                        } else {
                            baVar3 = baVar;
                        }
                        if (obj != null) {
                            arrayList2.addAll(a3);
                        }
                        c4843b.next();
                        i2 = a2;
                        i3 = c;
                    }
                    baVar3 = baVar;
                    c4843b.next();
                    i2 = a2;
                    i3 = c;
                }
            }
            baVar3 = baVar;
            if (C4728u.m21050a("GLAreaGroup", 3)) {
                String valueOf = String.valueOf(baVar);
                i42 = f27661c;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 132);
                stringBuilder.append("unable to handle the Area with fillVertexCount = ");
                stringBuilder.append(a2);
                stringBuilder.append(" and strokeVertexCount = ");
                stringBuilder.append(c);
                stringBuilder.append(" for ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" since the limit is ");
                stringBuilder.append(i42);
                Log.d("GLAreaGroup", stringBuilder.toString());
            }
            c4843b.next();
            strArr2 = strArr;
            baVar2 = null;
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            c5069a = null;
        } else {
            List arrayList3 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                C6517d c6517d2 = (C6517d) it.next();
                if (c6517d2.m28696j()) {
                    arrayList3.add(c6517d2);
                }
            }
            c5069a = new C5069a(i, arrayList2, arrayList3, c5070b2);
        }
        C7494a c7494a = new C7494a(i2, i3, hashSet, c5069a, c5052d);
        it = arrayList.iterator();
        while (it.hasNext()) {
            c7494a.m32580a(i, (C6517d) it.next());
        }
        return c7494a;
    }

    private C7494a(int i, int i2, Set<String> set, C5069a c5069a, C5052d c5052d) {
        super(set);
        this.f27666e = new C7493m(i, true);
        this.f27665d = new C7493m(i2, true);
        this.f27668g = new C5050b(i, c5052d.m22601E());
        this.f27667f = new C5050b(i2, c5052d.m22601E());
        this.f27671j = c5069a;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27666e.mo7121b(c5052d);
        this.f27665d.mo7121b(c5052d);
        this.f27668g.m22588b(c5052d);
        this.f27667f.m22588b(c5052d);
        if (this.f27671j != null) {
            this.f27671j.m22705b(c5052d);
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27666e.m29354c(c5052d);
        this.f27665d.m29354c(c5052d);
        this.f27668g.m22589c(c5052d);
        this.f27667f.m22589c(c5052d);
        if (this.f27671j != null) {
            this.f27671j.m22706c(c5052d);
        }
    }

    /* renamed from: a */
    public static void m32581a(C5052d c5052d, C5009j c5009j) {
        if (c5009j.m22389c().m22304e() == null) {
            c5052d.m22627p();
        }
        c5052d.m22635x().glLineWidthx(65536);
        c5052d.m22635x().glBlendFunc(1, 771);
        c5052d.m22635x().glTexEnvx(8960, 8704, 8448);
        c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        c6570b = c5052d.m22635x();
        c5009j = c5009j.m22389c();
        if (c5009j.m22302c()) {
            C5049a.m22577c(c5052d);
            if (this.f27666e.mo5250a() > null) {
                this.f27666e.mo7123d(c5052d);
                this.f27668g.m22586a(c5052d);
                c6570b.glDrawArrays(4, 0, this.f27666e.mo5250a());
            }
            if (this.f27665d.mo5250a() > null) {
                this.f27665d.mo7123d(c5052d);
                this.f27667f.m22586a(c5052d);
                c6570b.glDrawArrays(1, 0, this.f27665d.mo5250a());
            }
            C5049a.m22578d(c5052d);
            return;
        }
        if (c5009j.m22304e()) {
            if (this.f27666e.mo5250a() > null) {
                this.f27666e.mo7123d(c5052d);
                c6570b.glDrawArrays(4, 0, this.f27666e.mo5250a());
            }
            if (this.f27665d.mo5250a() > null) {
                this.f27665d.mo7123d(c5052d);
                c6570b.glDrawArrays(1, 0, this.f27665d.mo5250a());
            }
        } else if (!(c5009j.m22303d() == null || this.f27671j == null)) {
            this.f27671j.m22703a(c5052d);
        }
    }

    /* renamed from: a */
    static int m32578a(C6517d c6517d) {
        if (c6517d.mo5108e().m21559c() == 0) {
            return null;
        }
        return c6517d.m28688b().m21691a() * 3;
    }

    /* renamed from: b */
    private static boolean m32583b(C6517d c6517d) {
        as e = c6517d.mo5108e();
        if (e.m21557b() != 0) {
            if (c6517d.m28689c() != null) {
                c6517d = null;
                while (c6517d < e.m21557b()) {
                    if (e.m21558b(c6517d).m21547c() > 1.0f || e.m21558b(c6517d).m21549e()) {
                        return false;
                    }
                    c6517d++;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static int m32584c(C6517d c6517d) {
        int i = 0;
        if (!C7494a.m32583b(c6517d)) {
            return 0;
        }
        c6517d = c6517d.m28690d();
        int i2 = 0;
        while (i < c6517d.length) {
            i2 += f27660b[c6517d[i] & 7];
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private void m32580a(al alVar, C6517d c6517d) {
        C7494a c7494a = this;
        as e = c6517d.mo5108e();
        bj b = c6517d.m28688b();
        int a = b.m21691a();
        if (a != 0) {
            int i = 0;
            Object obj = e.m21559c() > 0 ? 1 : null;
            boolean b2 = C7494a.m32583b(c6517d);
            if (obj != null || b2) {
                int i2;
                af c = alVar.m32212c();
                int f = alVar.m32215f();
                int a2 = obj != null ? e.m21556a(0) : 0;
                int b3 = b2 ? e.m21558b(0).m21546b() : 0;
                byte[] d = c6517d.m28690d();
                af afVar = ((af[]) f27664m.get())[0];
                af afVar2 = ((af[]) f27664m.get())[1];
                af afVar3 = ((af[]) f27664m.get())[2];
                int i3 = 0;
                int i4 = 0;
                while (i4 < a) {
                    af afVar4;
                    af afVar5;
                    int i5 = i3;
                    int i6 = i;
                    int i7 = i4;
                    af afVar6 = afVar3;
                    af afVar7 = afVar2;
                    bj bjVar = b;
                    af afVar8 = afVar;
                    b.m21693a(i4, c, afVar, afVar2, afVar6);
                    if (obj != null) {
                        c7494a.f27666e.mo5257a(afVar8, f);
                        afVar4 = afVar7;
                        c7494a.f27666e.mo5257a(afVar4, f);
                        afVar5 = afVar6;
                        c7494a.f27666e.mo5257a(afVar5, f);
                        i3 = i6 + 3;
                    } else {
                        afVar5 = afVar6;
                        afVar4 = afVar7;
                        i3 = i6;
                    }
                    if (b2) {
                        if ((d[i7] & 1) != 0) {
                            c7494a.f27665d.mo5257a(afVar8, f);
                            c7494a.f27665d.mo5257a(afVar4, f);
                            i2 = i5 + 2;
                        } else {
                            i2 = i5;
                        }
                        if ((d[i7] & 2) != 0) {
                            c7494a.f27665d.mo5257a(afVar4, f);
                            c7494a.f27665d.mo5257a(afVar5, f);
                            i2 += 2;
                        }
                        if ((d[i7] & 4) != 0) {
                            c7494a.f27665d.mo5257a(afVar5, f);
                            c7494a.f27665d.mo5257a(afVar8, f);
                            i2 += 2;
                        }
                    } else {
                        i2 = i5;
                    }
                    afVar2 = afVar4;
                    i = i3;
                    i3 = i2;
                    afVar3 = afVar5;
                    i4 = i7 + 1;
                    afVar = afVar8;
                    b = bjVar;
                }
                i2 = i3;
                c7494a.f27668g.m22585a(a2, i);
                c7494a.f27667f.m22585a(b3, i2);
            }
        }
    }

    /* renamed from: a */
    public final int mo7125a() {
        int i;
        int c = ((this.f27665d.m29353c() + this.f27666e.m29353c()) + this.f27667f.m22584a()) + this.f27668g.m22584a();
        if (this.f27671j == null) {
            i = 0;
        } else {
            i = this.f27671j.m22702a();
        }
        return c + i;
    }

    /* renamed from: b */
    public final int mo7126b() {
        int i;
        int d = (((this.f27665d.mo7122d() + 156) + this.f27666e.mo7122d()) + this.f27667f.m22587b()) + this.f27668g.m22587b();
        if (this.f27671j == null) {
            i = 0;
        } else {
            i = this.f27671j.m22704b();
        }
        return d + i;
    }
}
