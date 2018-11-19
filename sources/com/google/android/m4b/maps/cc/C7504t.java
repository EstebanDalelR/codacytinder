package com.google.android.m4b.maps.cc;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.C6525q;
import com.google.android.m4b.maps.bo.C6526r;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.ad;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.ae;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.an;
import com.google.android.m4b.maps.bx.as;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7489i;
import com.google.android.m4b.maps.cc.C7494a.C5070b;
import com.google.android.m4b.maps.cc.C7499j.C5079a;
import com.google.android.m4b.maps.ce.C5094b;
import com.google.android.m4b.maps.ce.C5096d;
import com.google.android.m4b.maps.cf.C5101b;
import com.google.android.m4b.maps.cf.C5102c;
import com.google.android.m4b.maps.cf.C6598y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.t */
public final class C7504t implements C6587q {
    /* renamed from: K */
    private static float[] f27785K = new float[8];
    /* renamed from: a */
    public static final C4967a f27786a = C4967a.f18341a;
    /* renamed from: b */
    private static final C5070b f27787b = new C5070b(0.0f, 120.0f, false, -48.0f, 48.0f, true, 0.0f, 1879048191);
    /* renamed from: c */
    private static final C5070b f27788c = new C5070b(48.0f, 120.0f, true, -0.0f, 0.0f, false, 0.0f, -855638017);
    /* renamed from: d */
    private static final C5070b f27789d = new C5070b(0.0f, 60.0f, false, -24.0f, 24.0f, true, 0.0f, 1879048191);
    /* renamed from: e */
    private static final C5070b f27790e = new C5070b(24.0f, 60.0f, true, -0.0f, 0.0f, false, 0.0f, -855638017);
    /* renamed from: f */
    private static final C5070b f27791f = new C5070b(0.0f, 30.0f, false, -6.0f, 6.0f, true, 0.0f, 1879048191);
    /* renamed from: g */
    private static final C5070b f27792g = new C5070b(16.0f, 40.0f, true, -0.0f, 0.0f, false, 0.0f, -855638017);
    /* renamed from: A */
    private bg f27793A;
    /* renamed from: B */
    private int f27794B;
    /* renamed from: C */
    private float[] f27795C = new float[4];
    /* renamed from: D */
    private long f27796D = 0;
    /* renamed from: E */
    private volatile int f27797E = -1;
    /* renamed from: F */
    private C5094b f27798F = null;
    /* renamed from: G */
    private Boolean f27799G = null;
    /* renamed from: H */
    private long f27800H = -1;
    /* renamed from: I */
    private long f27801I = -1;
    /* renamed from: J */
    private long f27802J = 0;
    /* renamed from: L */
    private boolean f27803L = false;
    /* renamed from: M */
    private C6589a f27804M = null;
    /* renamed from: N */
    private final C4981g f27805N;
    /* renamed from: h */
    private C7489i f27806h = null;
    /* renamed from: i */
    private C7489i f27807i = null;
    /* renamed from: j */
    private final float[] f27808j = new float[4];
    /* renamed from: k */
    private C7501o[] f27809k;
    /* renamed from: l */
    private C6581d[] f27810l;
    /* renamed from: m */
    private C7499j[] f27811m;
    /* renamed from: n */
    private C7502p[][] f27812n;
    /* renamed from: o */
    private C6581d[] f27813o;
    /* renamed from: p */
    private C7499j[] f27814p;
    /* renamed from: q */
    private C7495b[] f27815q;
    /* renamed from: r */
    private C7503s[] f27816r;
    /* renamed from: s */
    private C7498h f27817s;
    /* renamed from: t */
    private ArrayList<C5096d> f27818t;
    /* renamed from: u */
    private Set<C4699a> f27819u;
    /* renamed from: v */
    private final ba f27820v;
    /* renamed from: w */
    private final al f27821w;
    /* renamed from: x */
    private final HashSet<String> f27822x;
    /* renamed from: y */
    private int f27823y;
    /* renamed from: z */
    private as f27824z;

    /* renamed from: com.google.android.m4b.maps.cc.t$1 */
    class C50911 implements Comparator<C5096d> {
        /* renamed from: a */
        private /* synthetic */ C7504t f18871a;

        C50911(C7504t c7504t) {
            this.f18871a = c7504t;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C5096d) obj2).m22748a().mo5110i() - ((C5096d) obj).m22748a().mo5110i();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.t$a */
    static class C6589a implements C5101b {
        /* renamed from: a */
        public final void mo5289a(C5102c c5102c) {
            c5102c.mo5292a(this, C6598y.f24747b);
        }

        /* renamed from: b */
        public final void mo5290b(C5102c c5102c) {
            c5102c.mo5292a(this, C6598y.f24747b);
        }
    }

    /* renamed from: a */
    public final void mo7131a(Collection<String> collection) {
    }

    /* renamed from: a */
    public static C7504t m32731a(az azVar, C4967a c4967a, C5052d c5052d, C4981g c4981g) {
        az azVar2 = azVar;
        C5052d c5052d2 = c5052d;
        C7504t c7504t = new C7504t(azVar.mo5099d(), c4981g);
        if (azVar2 instanceof bo) {
            int g;
            int i;
            C5070b c5070b;
            C4843b k;
            long uptimeMillis;
            Object obj;
            C4848k a;
            bo boVar;
            C4843b c4843b;
            C5079a c5079a;
            C5079a c5079a2;
            ArrayList arrayList;
            ArrayList arrayList2;
            C7502p a2;
            long uptimeMillis2;
            List list;
            ArrayList arrayList3;
            bo boVar2;
            int i2;
            C4848k a3;
            int h;
            ag agVar;
            float d;
            bo boVar3 = (bo) azVar2;
            c7504t.f27823y = boVar3.m32253n();
            for (Object add : boVar3.mo7543c()) {
                c7504t.f27822x.add(add);
            }
            c7504t.f27793A = boVar3.mo5101h();
            c7504t.f27794B = boVar3.mo5102i();
            String[] f = boVar3.mo7544f();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            C5079a c5079a3 = new C5079a(c7504t.f27820v, f);
            C5079a c5079a4 = new C5079a(c7504t.f27820v, f);
            arrayList6.add(arrayList7);
            C6526r c6526r = (C6526r) boVar3.mo5099d().m21616a(C4839a.INDOOR);
            if (c6526r != null) {
                C7436c b = c6526r.m28766b();
                C6534d a4 = C6534d.m28802a();
                if (a4 != null) {
                    C6524p a5 = a4.m28809a(b);
                    if (a5 != null) {
                        C6525q a6 = a5.m28744a(b);
                        if (a6 != null) {
                            C5070b c5070b2;
                            if (a6.mo5146f() > 0) {
                                if (((float) boVar3.mo5099d().m21619b()) > 18.5f) {
                                    c5070b2 = f27791f;
                                } else if (((float) boVar3.mo5099d().m21619b()) > 16.5f) {
                                    c5070b2 = f27789d;
                                } else {
                                    c5070b2 = f27787b;
                                }
                            } else if (a6.mo5146f() < 0) {
                                if (((float) boVar3.mo5099d().m21619b()) > 18.5f) {
                                    c5070b2 = f27792g;
                                } else if (((float) boVar3.mo5099d().m21619b()) > 16.5f) {
                                    c5070b2 = f27790e;
                                } else {
                                    c5070b2 = f27788c;
                                }
                            }
                            c5070b = c5070b2;
                            k = boVar3.mo7546k();
                            uptimeMillis = SystemClock.uptimeMillis();
                            obj = 1;
                            while (k.hasNext()) {
                                a = k.mo5104a();
                                boVar = boVar3;
                                if (c4967a.m22231a(a.mo5109h())) {
                                    k.next();
                                    boVar3 = boVar;
                                } else {
                                    switch (a.mo5109h()) {
                                        case 2:
                                            c4843b = k;
                                            c5079a = c5079a4;
                                            c5079a2 = c5079a3;
                                            arrayList = arrayList10;
                                            arrayList2 = arrayList9;
                                            a2 = C7502p.m32708a(c7504t.f27820v, f, c4843b, null, c5052d2);
                                            if (obj != null && a2.m32723c()) {
                                                obj = null;
                                            }
                                            arrayList7.add(a2);
                                            break;
                                        case 3:
                                            if (obj == null) {
                                                c4843b = k;
                                                c5079a = c5079a4;
                                                c5079a2 = c5079a3;
                                                arrayList = arrayList10;
                                                arrayList2 = arrayList9;
                                                arrayList8.add(C7494a.m32579a(c7504t.f27820v, f, c4843b, c5079a, c5070b, c5052d2));
                                                break;
                                            }
                                            c4843b = k;
                                            c5079a = c5079a4;
                                            c5079a2 = c5079a3;
                                            arrayList = arrayList10;
                                            arrayList2 = arrayList9;
                                            arrayList5.add(C7494a.m32579a(c7504t.f27820v, f, c4843b, c5079a3, c5070b, c5052d2));
                                            break;
                                        case 4:
                                            arrayList9.add(C7495b.m32592a(c7504t.f27820v, f, k));
                                            break;
                                        case 5:
                                            if (obj == null) {
                                                arrayList8.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                                break;
                                            }
                                            arrayList5.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                            break;
                                        case 6:
                                            arrayList4.add(C7501o.m32692a(c7504t.f27820v, f, k, c5052d2));
                                            break;
                                        case 8:
                                            if (!C7500l.m32685a((C6527u) a)) {
                                                if (obj == null) {
                                                    arrayList8.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                                    break;
                                                }
                                                arrayList5.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                                break;
                                            } else if (obj == null) {
                                                c5079a4.m22727a(k);
                                                break;
                                            } else {
                                                c5079a3.m22727a(k);
                                                break;
                                            }
                                        case 9:
                                            arrayList10.add(C7503s.m32724a(c7504t.f27820v, f, k));
                                            break;
                                        default:
                                            c4843b = k;
                                            c5079a = c5079a4;
                                            c5079a2 = c5079a3;
                                            arrayList = arrayList10;
                                            arrayList2 = arrayList9;
                                            c4843b.next();
                                            break;
                                    }
                                    c4843b = k;
                                    c5079a = c5079a4;
                                    c5079a2 = c5079a3;
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    uptimeMillis2 = SystemClock.uptimeMillis();
                                    if (uptimeMillis2 - uptimeMillis > 10) {
                                        Thread.yield();
                                        uptimeMillis = uptimeMillis2;
                                    }
                                    k = c4843b;
                                    boVar3 = boVar;
                                    c5079a4 = c5079a;
                                    c5079a3 = c5079a2;
                                    arrayList10 = arrayList;
                                    arrayList9 = arrayList2;
                                }
                            }
                            c5079a = c5079a4;
                            c5079a2 = c5079a3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList9;
                            boVar = boVar3;
                            if (arrayList4.size() > 0) {
                                c7504t.f27809k = (C7501o[]) arrayList4.toArray(new C7501o[arrayList4.size()]);
                            }
                            if (arrayList5.size() > 0) {
                                c7504t.f27810l = (C6581d[]) arrayList5.toArray(new C6581d[arrayList5.size()]);
                            }
                            if (((ArrayList) arrayList6.get(0)).size() > 0) {
                                c7504t.f27812n = new C7502p[arrayList6.size()][];
                                for (i = 0; i < c7504t.f27812n.length; i++) {
                                    list = (List) arrayList6.get(i);
                                    c7504t.f27812n[i] = (C7502p[]) list.toArray(new C7502p[list.size()]);
                                }
                            }
                            if (arrayList8.size() > 0) {
                                c7504t.f27813o = (C6581d[]) arrayList8.toArray(new C6581d[arrayList8.size()]);
                            }
                            arrayList3 = arrayList2;
                            if (arrayList3.size() > 0) {
                                c7504t.f27815q = (C7495b[]) arrayList3.toArray(new C7495b[arrayList3.size()]);
                            }
                            arrayList3 = arrayList;
                            if (arrayList3.size() > 0) {
                                c7504t.f27816r = (C7503s[]) arrayList3.toArray(new C7503s[arrayList3.size()]);
                            }
                            c7504t.f27811m = c5079a2.m22729a(3);
                            c7504t.f27814p = c5079a.m22729a(10);
                            boVar2 = boVar;
                            g = boVar2.mo7545g();
                            c7504t.f27818t = new ArrayList(g);
                            for (i2 = 0; i2 < g; i2++) {
                                a3 = boVar2.mo7542a(i2);
                                h = a3.mo5109h();
                                if (h != 2) {
                                    if (h != 11) {
                                        switch (h) {
                                            case 7:
                                                c7504t.m32732a(a3);
                                                agVar = (ag) a3;
                                                if (c7504t.f27824z == null) {
                                                    c7504t.f27824z = c7504t.f27805N.m22274a().m22369a(c7504t.f27821w.m32214e(), c7504t.f27793A);
                                                }
                                                d = c7504t.f27824z.m22359d(agVar.m28548g());
                                                if (d < 0.0f) {
                                                    d = (float) agVar.m28548g();
                                                }
                                                agVar.m28541a(d);
                                                d = c7504t.f27824z.m22360e(agVar.m28551j());
                                                if (d < 0.0f) {
                                                    d = (float) Math.min(22, agVar.m28551j() + 1);
                                                }
                                                agVar.m28543b(d);
                                                for (int i3 : a3.mo5111l()) {
                                                    if (i3 >= 0 && i3 < f.length) {
                                                        c7504t.f27822x.add(f[i3]);
                                                    }
                                                }
                                                continue;
                                                continue;
                                            case 8:
                                                break;
                                            default:
                                                continue;
                                                continue;
                                        }
                                    }
                                    if (((C6527u) a3).m28773c() > 0) {
                                        c7504t.m32732a(a3);
                                    }
                                } else if (((ao) a3).m28580c() > 0) {
                                    c7504t.m32732a(a3);
                                }
                            }
                            Collections.sort(c7504t.f27818t, new C50911(c7504t));
                            if (boVar2 instanceof ad) {
                                c7504t.f27819u = ((ad) boVar2).mo7547l();
                            }
                            c7504t.m32745b(boVar2.mo7073a());
                        }
                    }
                }
            }
            c5070b = null;
            k = boVar3.mo7546k();
            uptimeMillis = SystemClock.uptimeMillis();
            obj = 1;
            while (k.hasNext()) {
                a = k.mo5104a();
                boVar = boVar3;
                if (c4967a.m22231a(a.mo5109h())) {
                    switch (a.mo5109h()) {
                        case 2:
                            c4843b = k;
                            c5079a = c5079a4;
                            c5079a2 = c5079a3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList9;
                            a2 = C7502p.m32708a(c7504t.f27820v, f, c4843b, null, c5052d2);
                            obj = null;
                            arrayList7.add(a2);
                            break;
                        case 3:
                            if (obj == null) {
                                c4843b = k;
                                c5079a = c5079a4;
                                c5079a2 = c5079a3;
                                arrayList = arrayList10;
                                arrayList2 = arrayList9;
                                arrayList5.add(C7494a.m32579a(c7504t.f27820v, f, c4843b, c5079a3, c5070b, c5052d2));
                                break;
                            }
                            c4843b = k;
                            c5079a = c5079a4;
                            c5079a2 = c5079a3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList9;
                            arrayList8.add(C7494a.m32579a(c7504t.f27820v, f, c4843b, c5079a, c5070b, c5052d2));
                            break;
                        case 4:
                            arrayList9.add(C7495b.m32592a(c7504t.f27820v, f, k));
                            break;
                        case 5:
                            if (obj == null) {
                                arrayList5.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                break;
                            }
                            arrayList8.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                            break;
                        case 6:
                            arrayList4.add(C7501o.m32692a(c7504t.f27820v, f, k, c5052d2));
                            break;
                        case 8:
                            if (!C7500l.m32685a((C6527u) a)) {
                                if (obj == null) {
                                    c5079a3.m22727a(k);
                                    break;
                                }
                                c5079a4.m22727a(k);
                                break;
                            } else if (obj == null) {
                                arrayList5.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                break;
                            } else {
                                arrayList8.add(C7500l.m32680a(c7504t.f27820v, f, k, c5052d2));
                                break;
                            }
                        case 9:
                            arrayList10.add(C7503s.m32724a(c7504t.f27820v, f, k));
                            break;
                        default:
                            c4843b = k;
                            c5079a = c5079a4;
                            c5079a2 = c5079a3;
                            arrayList = arrayList10;
                            arrayList2 = arrayList9;
                            c4843b.next();
                            break;
                    }
                    c4843b = k;
                    c5079a = c5079a4;
                    c5079a2 = c5079a3;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    uptimeMillis2 = SystemClock.uptimeMillis();
                    if (uptimeMillis2 - uptimeMillis > 10) {
                        Thread.yield();
                        uptimeMillis = uptimeMillis2;
                    }
                    k = c4843b;
                    boVar3 = boVar;
                    c5079a4 = c5079a;
                    c5079a3 = c5079a2;
                    arrayList10 = arrayList;
                    arrayList9 = arrayList2;
                } else {
                    k.next();
                    boVar3 = boVar;
                }
            }
            c5079a = c5079a4;
            c5079a2 = c5079a3;
            arrayList = arrayList10;
            arrayList2 = arrayList9;
            boVar = boVar3;
            if (arrayList4.size() > 0) {
                c7504t.f27809k = (C7501o[]) arrayList4.toArray(new C7501o[arrayList4.size()]);
            }
            if (arrayList5.size() > 0) {
                c7504t.f27810l = (C6581d[]) arrayList5.toArray(new C6581d[arrayList5.size()]);
            }
            if (((ArrayList) arrayList6.get(0)).size() > 0) {
                c7504t.f27812n = new C7502p[arrayList6.size()][];
                for (i = 0; i < c7504t.f27812n.length; i++) {
                    list = (List) arrayList6.get(i);
                    c7504t.f27812n[i] = (C7502p[]) list.toArray(new C7502p[list.size()]);
                }
            }
            if (arrayList8.size() > 0) {
                c7504t.f27813o = (C6581d[]) arrayList8.toArray(new C6581d[arrayList8.size()]);
            }
            arrayList3 = arrayList2;
            if (arrayList3.size() > 0) {
                c7504t.f27815q = (C7495b[]) arrayList3.toArray(new C7495b[arrayList3.size()]);
            }
            arrayList3 = arrayList;
            if (arrayList3.size() > 0) {
                c7504t.f27816r = (C7503s[]) arrayList3.toArray(new C7503s[arrayList3.size()]);
            }
            c7504t.f27811m = c5079a2.m22729a(3);
            c7504t.f27814p = c5079a.m22729a(10);
            boVar2 = boVar;
            g = boVar2.mo7545g();
            c7504t.f27818t = new ArrayList(g);
            for (i2 = 0; i2 < g; i2++) {
                a3 = boVar2.mo7542a(i2);
                h = a3.mo5109h();
                if (h != 2) {
                    if (h != 11) {
                        switch (h) {
                            case 7:
                                c7504t.m32732a(a3);
                                agVar = (ag) a3;
                                if (c7504t.f27824z == null) {
                                    c7504t.f27824z = c7504t.f27805N.m22274a().m22369a(c7504t.f27821w.m32214e(), c7504t.f27793A);
                                }
                                d = c7504t.f27824z.m22359d(agVar.m28548g());
                                if (d < 0.0f) {
                                    d = (float) agVar.m28548g();
                                }
                                agVar.m28541a(d);
                                d = c7504t.f27824z.m22360e(agVar.m28551j());
                                if (d < 0.0f) {
                                    d = (float) Math.min(22, agVar.m28551j() + 1);
                                }
                                agVar.m28543b(d);
                                while (r6 < h) {
                                    c7504t.f27822x.add(f[i3]);
                                    break;
                                }
                                continue;
                                continue;
                            case 8:
                                break;
                            default:
                                continue;
                                continue;
                        }
                    }
                    if (((C6527u) a3).m28773c() > 0) {
                        c7504t.m32732a(a3);
                    }
                } else if (((ao) a3).m28580c() > 0) {
                    c7504t.m32732a(a3);
                }
            }
            Collections.sort(c7504t.f27818t, new C50911(c7504t));
            if (boVar2 instanceof ad) {
                c7504t.f27819u = ((ad) boVar2).mo7547l();
            }
            c7504t.m32745b(boVar2.mo7073a());
        }
        return c7504t;
    }

    private C7504t(ba baVar, C4981g c4981g) {
        this.f27820v = baVar;
        this.f27805N = c4981g;
        this.f27821w = this.f27820v.m21626i();
        this.f27822x = new HashSet();
    }

    /* renamed from: a */
    public final void mo7132a(boolean z) {
        if (this.f27803L != z) {
            this.f27803L = z;
        }
    }

    /* renamed from: a */
    public final boolean mo7133a() {
        if (this.f27799G != null) {
            if (!this.f27799G.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7135a(ae aeVar) {
        if (this.f27818t.isEmpty()) {
            return null;
        }
        aeVar.m22287a(this.f27818t.iterator());
        return true;
    }

    /* renamed from: a */
    public final boolean m32743a(Set<C4699a> set) {
        if (this.f27819u == null) {
            return null;
        }
        set.addAll(this.f27819u);
        this.f27819u = null;
        return true;
    }

    /* renamed from: a */
    private void m32732a(C4848k c4848k) {
        this.f27818t.add(new C5096d(c4848k, null));
    }

    /* renamed from: a */
    public final void mo7130a(C5094b c5094b) {
        if (!C5094b.m22746a(c5094b, this.f27798F)) {
            this.f27798F = c5094b;
            for (int i = 0; i < this.f27818t.size(); i++) {
                this.f27818t.set(i, new C5096d(((C5096d) this.f27818t.get(i)).m22748a(), c5094b));
            }
            this.f27797E = -1;
        }
    }

    /* renamed from: a */
    public final int mo7127a(C6570b c6570b, C5008i c5008i) {
        if (c5008i == C5008i.AMBIENT && this.f27809k != null) {
            return 2;
        }
        int i = 0;
        if (this.f27809k != null) {
            i = 2;
        }
        if (this.f27810l != null) {
            i |= 4;
        }
        if (this.f27811m != null) {
            i |= 8;
        }
        if (this.f27812n != null) {
            i |= C7502p.m32707a(c6570b, c5008i);
        }
        if (this.f27813o != null) {
            i |= 512;
        }
        if (this.f27814p != null) {
            i |= 1024;
        }
        if (this.f27815q != null) {
            if (c6570b.m29255k() > null) {
                i |= ItemAnimator.FLAG_MOVED;
            }
            i |= 4096;
        }
        if (this.f27816r != null) {
            i |= 8192;
        }
        c6570b = ai.f24417a;
        return i;
    }

    /* renamed from: b */
    public final void mo7137b(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C5008i a = c5009j.m22385a();
        int b = c5009j.m22388b();
        switch (b) {
            case 1:
                C7501o.m32694a(c5052d);
                return;
            case 2:
                C7494a.m32581a(c5052d, c5009j);
                return;
            case 3:
                C7499j.m32669a(c5052d);
                return;
            case 4:
                C7502p.m32712a(c5052d, c6570b.m29256l(), this.f27820v.m21619b());
                return;
            case 5:
                C7502p.m32713a(c5052d, c6570b.m29256l(), this.f27820v.m21619b(), a);
                return;
            case 6:
                c6570b.m29256l();
                C7502p.m32711a(c5052d);
                return;
            case 7:
                C7502p.m32716b(c5052d, c6570b.m29256l(), this.f27820v.m21619b());
                return;
            case 8:
                c6570b.m29256l();
                C7502p.m32717d(c5052d);
                return;
            case 9:
                C7494a.m32581a(c5052d, c5009j);
                return;
            case 10:
                C7499j.m32669a(c5052d);
                return;
            case 11:
                C7495b.m32595a(c5052d, b);
                return;
            case 12:
                C7495b.m32595a(c5052d, b);
                return;
            case 13:
                C7503s.m32725a(c5052d);
                return;
            case 15:
                C6588r.m29449a(c5052d, c5009j);
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C7504t c7504t = this;
        C5052d c5052d2 = c5052d;
        C6570b c6570b2 = c6570b;
        C5009j c5009j2 = c5009j;
        boolean z = true;
        Object obj = (c5052d.m22603G() <= 0 || !c5052d.m22604H()) ? null : 1;
        GL10 x = c5052d.m22635x();
        x.glPushMatrix();
        if (c6570b.mo5248a() != c7504t.f27796D) {
            c7504t.f27796D = c6570b.mo5248a();
            af c = c7504t.f27821w.m32212c();
            if (!c6570b.m29248d() && c6570b.m29255k() == 0.0f && c6570b.m29254j() == 0.0f && c6570b.m29256l() == ((float) ((int) c6570b.m29256l()))) {
                c6570b2.m29238a(c, f27785K);
                c = c6570b2.m29247d((float) Math.round(f27785K[0]), (float) Math.round(f27785K[1]));
            }
            an.m22326a(c5052d2, c6570b2, c, (float) c7504t.f27821w.m32215f(), c7504t.f27795C);
        }
        an.m22328a(x, c7504t.f27795C);
        int a;
        switch (c5009j.m22388b()) {
            case 1:
                if (c7504t.f27809k != null) {
                    for (C7501o a2 : c7504t.f27809k) {
                        a2.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 2:
                if (c7504t.f27810l != null) {
                    for (C5073c a3 : c7504t.f27810l) {
                        a3.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                }
                if (c7504t.f27812n != null) {
                    for (C7502p[] c7502pArr : c7504t.f27812n) {
                        for (C7502p a4 : r4[a]) {
                            a4.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                    break;
                }
                break;
            case 3:
                if (c7504t.f27811m != null) {
                    for (C7499j a5 : c7504t.f27811m) {
                        a5.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 4:
                if (obj == null && c7504t.f27812n != null) {
                    for (C7502p[] c7502pArr2 : c7504t.f27812n) {
                        for (C7502p a42 : r4[a]) {
                            a42.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                    break;
                }
            case 5:
                if (obj == null || c7504t.f27812n == null) {
                    if (c7504t.f27812n != null) {
                        for (C7502p[] c7502pArr3 : c7504t.f27812n) {
                            for (C7502p a422 : r4[a]) {
                                a422.mo5222a(c5052d2, c6570b2, c5009j2);
                            }
                        }
                        break;
                    }
                }
                C5008i a6 = c5009j.m22385a();
                a = C7502p.m32707a(c6570b2, a6);
                C5009j c5009j3 = new C5009j(a6, 4);
                C5009j c5009j4 = new C5009j(a6, 6);
                for (C7502p[] c7502pArr4 : c7504t.f27812n) {
                    if ((a & 16) != 0) {
                        mo7137b(c5052d2, c6570b2, c5009j3);
                        for (C7502p a7 : c7502pArr4) {
                            a7.mo5222a(c5052d2, c6570b2, c5009j3);
                        }
                    }
                    if ((a & 32) != 0) {
                        mo7137b(c5052d, c6570b, c5009j);
                        for (C7502p a8 : c7502pArr4) {
                            a8.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                    if ((a & 64) != 0) {
                        c5052d.m22626o();
                        mo7137b(c5052d2, c6570b2, c5009j4);
                        for (C7502p a82 : c7502pArr4) {
                            a82.mo5222a(c5052d2, c6570b2, c5009j4);
                        }
                    }
                    if ((a & 384) != 0) {
                        c5052d.m22625n();
                        mo7137b(c5052d, c6570b, c5009j);
                        for (C7502p a822 : c7502pArr4) {
                            a822.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                }
                break;
                break;
            case 6:
                if (obj == null && c7504t.f27812n != null) {
                    for (C7502p[] c7502pArr5 : c7504t.f27812n) {
                        for (C7502p a9 : r4[r9]) {
                            a9.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                    break;
                }
            case 7:
            case 8:
                if (obj == null && c7504t.f27812n != null) {
                    for (C7502p[] c7502pArr6 : c7504t.f27812n) {
                        for (C7502p a92 : r4[r9]) {
                            a92.mo5222a(c5052d2, c6570b2, c5009j2);
                        }
                    }
                    break;
                }
            case 9:
                if (c7504t.f27813o != null) {
                    for (C5073c a10 : c7504t.f27813o) {
                        a10.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 10:
                if (c7504t.f27814p != null) {
                    for (C7499j a11 : c7504t.f27814p) {
                        a11.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 11:
            case 12:
                if (c7504t.f27815q != null) {
                    for (C7495b a12 : c7504t.f27815q) {
                        a12.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 13:
                if (c7504t.f27816r != null) {
                    for (C7503s a13 : c7504t.f27816r) {
                        a13.mo5222a(c5052d2, c6570b2, c5009j2);
                    }
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                C6588r.f24719a.mo5222a(c5052d2, c6570b2, c5009j2);
                break;
            default:
                break;
        }
        x.glPopMatrix();
        if (c7504t.f27799G == null) {
            if (!c5052d.m22602F() || C4743b.f17387a) {
                c7504t.f27799G = Boolean.TRUE;
            } else {
                if (c7504t.f27810l != null || c7504t.f27812n != null || c7504t.f27811m != null || c7504t.f27813o != null || c7504t.f27814p != null || c7504t.f27815q != null || c7504t.f27816r != null) {
                    z = false;
                }
                c7504t.f27799G = Boolean.valueOf(z);
            }
        }
    }

    /* renamed from: b */
    public final ba mo7136b() {
        return this.f27820v;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        if (this.f27809k != null) {
            for (C7501o b : this.f27809k) {
                b.mo5223b(c5052d);
            }
        }
        if (this.f27810l != null) {
            for (C5073c b2 : this.f27810l) {
                b2.mo5223b(c5052d);
            }
        }
        if (this.f27811m != null) {
            for (C7499j b3 : this.f27811m) {
                b3.mo5223b(c5052d);
            }
        }
        if (this.f27812n != null) {
            for (C7502p[] c7502pArr : this.f27812n) {
                for (C7502p b4 : r0[r3]) {
                    b4.mo5223b(c5052d);
                }
            }
        }
        if (this.f27813o != null) {
            for (C5073c b22 : this.f27813o) {
                b22.mo5223b(c5052d);
            }
        }
        if (this.f27814p != null) {
            for (C7499j b32 : this.f27814p) {
                b32.mo5223b(c5052d);
            }
        }
        if (this.f27815q != null) {
            for (C7495b b5 : this.f27815q) {
                b5.mo5223b(c5052d);
            }
        }
        if (this.f27817s != null) {
            this.f27817s.mo5223b(c5052d);
            this.f27817s = null;
        }
        if (this.f27816r != null) {
            for (C7503s b6 : this.f27816r) {
                b6.mo5223b(c5052d);
            }
        }
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27799G = Boolean.FALSE;
        if (this.f27809k != null) {
            for (C7501o c : this.f27809k) {
                c.mo5224c(c5052d);
            }
        }
        if (this.f27810l != null) {
            for (C5073c c2 : this.f27810l) {
                c2.mo5224c(c5052d);
            }
        }
        if (this.f27811m != null) {
            for (C7499j c3 : this.f27811m) {
                c3.mo5224c(c5052d);
            }
        }
        if (this.f27812n != null) {
            for (C7502p[] c7502pArr : this.f27812n) {
                for (C7502p c4 : r0[r3]) {
                    c4.mo5224c(c5052d);
                }
            }
        }
        if (this.f27813o != null) {
            for (C5073c c22 : this.f27813o) {
                c22.mo5224c(c5052d);
            }
        }
        if (this.f27814p != null) {
            for (C7499j c32 : this.f27814p) {
                c32.mo5224c(c5052d);
            }
        }
        if (this.f27815q != null) {
            for (C7495b c5 : this.f27815q) {
                c5.mo5224c(c5052d);
            }
        }
        if (this.f27817s != null) {
            this.f27817s.mo5224c(c5052d);
            this.f27817s = null;
        }
        if (this.f27816r != null) {
            for (C7503s c6 : this.f27816r) {
                c6.mo5224c(c5052d);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7134a(C4712d c4712d) {
        return (this.f27800H < 0 || C4712d.m20957c() <= this.f27800H) ? null : true;
    }

    /* renamed from: b */
    public final boolean mo7138b(C4712d c4712d) {
        return (this.f27801I < 0 || C4712d.m20957c() <= this.f27801I) ? null : true;
    }

    /* renamed from: b */
    public final void m32745b(long j) {
        if (j >= 0) {
            if (this.f27800H < 0 || j < this.f27800H) {
                this.f27800H = j;
                this.f27801I = j + 60000;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo7139c() {
        if (this.f27809k != null) {
            for (C7501o c : this.f27809k) {
                if (c.m32702c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo7140d() {
        if (this.f27809k != null) {
            for (C7501o e : this.f27809k) {
                e.m32703e();
            }
        }
    }

    /* renamed from: a */
    public final void mo7129a(long j) {
        if (this.f27809k != null) {
            for (C7501o a : this.f27809k) {
                a.m32697a(3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo7128a(int i, Collection collection) {
        collection.addAll(this.f27822x);
        if (this.f27809k != 0) {
            for (C7501o d : this.f27809k) {
                collection.addAll(d.m29360d());
            }
        }
        if (this.f27810l != 0) {
            for (C6581d d2 : this.f27810l) {
                collection.addAll(d2.m29360d());
            }
        }
        if (this.f27811m != 0) {
            for (C7499j d3 : this.f27811m) {
                collection.addAll(d3.m29360d());
            }
        }
        if (this.f27812n != 0) {
            for (C7502p[] c7502pArr : this.f27812n) {
                for (C7502p d4 : r8[r2]) {
                    collection.addAll(d4.m29360d());
                }
            }
        }
        if (this.f27813o != 0) {
            for (C6581d d22 : this.f27813o) {
                collection.addAll(d22.m29360d());
            }
        }
        if (this.f27814p != 0) {
            for (C7499j d32 : this.f27814p) {
                collection.addAll(d32.m29360d());
            }
        }
        if (this.f27815q != 0) {
            for (C7495b d5 : this.f27815q) {
                collection.addAll(d5.m29360d());
            }
        }
        if (this.f27816r != 0) {
            for (C7503s d6 : this.f27816r) {
                collection.addAll(d6.m29360d());
            }
        }
    }

    /* renamed from: e */
    public final int mo7141e() {
        return this.f27823y;
    }

    /* renamed from: f */
    public final int mo7142f() {
        int i;
        int i2;
        if (this.f27809k != null) {
            i = 0;
            for (C7501o a : this.f27809k) {
                i += a.mo7125a();
            }
        } else {
            i = 0;
        }
        if (this.f27811m != null) {
            for (C7499j a2 : this.f27811m) {
                i += a2.mo7125a();
            }
        }
        if (this.f27812n != null) {
            C7502p[][] c7502pArr = this.f27812n;
            int length = c7502pArr.length;
            i2 = 0;
            while (i2 < length) {
                int i3 = i;
                for (C7502p a3 : c7502pArr[i2]) {
                    i3 += a3.mo7125a();
                }
                i2++;
                i = i3;
            }
        }
        if (this.f27814p != null) {
            for (C7499j a22 : this.f27814p) {
                i += a22.mo7125a();
            }
        }
        if (this.f27815q != null) {
            for (C7495b a4 : this.f27815q) {
                i += a4.mo7125a();
            }
        }
        if (this.f27816r != null) {
            for (C7503s a5 : this.f27816r) {
                i += a5.mo7125a();
            }
        }
        if (this.f27810l != null) {
            for (C6581d a6 : this.f27810l) {
                i += a6.mo7125a();
            }
        }
        if (this.f27813o != null) {
            for (C6581d a7 : this.f27813o) {
                i += a7.mo7125a();
            }
        }
        return i;
    }

    /* renamed from: g */
    public final int mo7143g() {
        int i;
        int i2;
        if (this.f27809k != null) {
            i = 272;
            for (C7501o b : this.f27809k) {
                i += b.mo7126b();
            }
        } else {
            i = 256;
        }
        if (this.f27811m != null) {
            i += 16;
            for (C7499j b2 : this.f27811m) {
                i += b2.mo7126b();
            }
        }
        if (this.f27812n != null) {
            i += 16;
            C7502p[][] c7502pArr = this.f27812n;
            int length = c7502pArr.length;
            i2 = 0;
            while (i2 < length) {
                int i3 = i;
                for (C7502p b3 : c7502pArr[i2]) {
                    i3 += b3.mo7126b();
                }
                i2++;
                i = i3;
            }
        }
        if (this.f27814p != null) {
            i += 16;
            for (C7499j b22 : this.f27814p) {
                i += b22.mo7126b();
            }
        }
        if (this.f27815q != null) {
            i += 16;
            for (C7495b b4 : this.f27815q) {
                i += b4.mo7126b();
            }
        }
        if (this.f27816r != null) {
            i += 16;
            for (C7503s b5 : this.f27816r) {
                i += b5.mo7126b();
            }
        }
        if (this.f27810l != null) {
            i += 16;
            for (C6581d b6 : this.f27810l) {
                i += b6.mo7126b();
            }
        }
        if (this.f27813o != null) {
            i += 16;
            for (C6581d b7 : this.f27813o) {
                i += b7.mo7126b();
            }
        }
        int i4 = this.f27797E;
        if (i4 == -1) {
            i4 = 24;
            Iterator it = this.f27818t.iterator();
            while (it.hasNext()) {
                i4 += ((C5096d) it.next()).m22751d();
            }
            this.f27797E = i4;
        }
        return i + i4;
    }
}
