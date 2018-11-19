package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bm.C4820a;
import com.google.android.m4b.maps.bm.C4824c;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.C6526r;
import com.google.android.m4b.maps.bo.C6526r.C4852a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bo.be;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bz.C6570b;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bj.a */
public final class C6462a implements C4787f {
    /* renamed from: a */
    private final C4787f f23975a;
    /* renamed from: b */
    private final C4824c f23976b;
    /* renamed from: c */
    private final C6534d f23977c;
    /* renamed from: d */
    private volatile boolean f23978d = false;
    /* renamed from: e */
    private List<ba> f23979e;
    /* renamed from: f */
    private List<ba> f23980f;
    /* renamed from: g */
    private Set<ba> f23981g;
    /* renamed from: h */
    private Set<C7436c> f23982h;
    /* renamed from: i */
    private C7436c f23983i = null;
    /* renamed from: j */
    private C6526r f23984j = null;
    /* renamed from: k */
    private final C4976e<ba, Collection<C4820a>> f23985k;
    /* renamed from: l */
    private final C6487i f23986l;
    /* renamed from: m */
    private long f23987m = 0;

    public C6462a(C4787f c4787f, C4824c c4824c, C6534d c6534d, int i, C6487i c6487i) {
        this.f23975a = c4787f;
        this.f23976b = c4824c;
        this.f23977c = c6534d;
        this.f23985k = new C4976e(i);
        this.f23986l = c6487i;
    }

    /* renamed from: e */
    private void m28321e(C6570b c6570b) {
        List<ba> a = this.f23975a.mo5020a(c6570b);
        if (this.f23978d || a == null || !a.equals(r1.f23979e)) {
            r1.f23987m++;
            boolean z = false;
            r1.f23978d = false;
            C6524p c = r1.f23986l.m28502c();
            Object a2;
            if (c != null) {
                a2 = c.mo5136a();
            } else {
                a2 = null;
            }
            Iterable hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            Set hashSet3 = new HashSet();
            for (ba baVar : a) {
                Collection collection = (Collection) r1.f23985k.m22251b((Object) baVar);
                if (collection == null) {
                    collection = r1.f23976b.mo5082a(baVar);
                    if (collection != C4824c.f17615a) {
                        r1.f23985k.m22255c(baVar, collection);
                    }
                }
                for (int i : r13) {
                    int i2;
                    List list;
                    be beVar;
                    hashSet3.add(i2.m21386a());
                    C4701c a3 = r1.f23986l.m28488a(i2.m21386a());
                    if (a3 == null) {
                        list = null;
                    } else {
                        list = new C4852a().m21760a(a3).m21761a();
                    }
                    if (list != null) {
                        beVar = new be();
                        beVar.m21645a((bd) list);
                        hashSet.add(baVar.mo5149a(beVar));
                    }
                    synchronized (this) {
                        try {
                            if (i2.m21386a().equals(r1.f23983i)) {
                                be beVar2 = new be();
                                beVar2.m21645a(r1.f23984j);
                                hashSet.add(baVar.mo5149a(beVar2));
                            }
                        } finally {
                            C6524p c6524p = 
/*
Method generation error in method: com.google.android.m4b.maps.bj.a.e(com.google.android.m4b.maps.bz.b):void, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r0_6 'c6524p' com.google.android.m4b.maps.bo.p) = (r0_1 'c6524p' com.google.android.m4b.maps.bo.p), (r5_3 'c' com.google.android.m4b.maps.bo.p) in method: com.google.android.m4b.maps.bj.a.e(com.google.android.m4b.maps.bz.b):void, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:229)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:201)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:201)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 46 more

*/

                            /* renamed from: a */
                            public final List<ba> mo5020a(C6570b c6570b) {
                                m28321e(c6570b);
                                return this.f23980f;
                            }

                            /* renamed from: a */
                            public final long mo5017a() {
                                return this.f23987m;
                            }

                            /* renamed from: b */
                            public final Set<ba> m28328b(C6570b c6570b) {
                                m28321e(c6570b);
                                return this.f23981g;
                            }

                            /* renamed from: c */
                            public final Set<C7436c> m28330c(C6570b c6570b) {
                                m28321e(c6570b);
                                return this.f23982h;
                            }

                            /* renamed from: d */
                            public final C7436c m28332d(C6570b c6570b) {
                                Object obj;
                                m28321e(c6570b);
                                Iterator it = this.f23979e.iterator();
                                do {
                                    C7436c c7436c = null;
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = (ba) it.next();
                                } while (!obj.m21626i().mo5090a(c6570b.m29245c()));
                                Collection<C4820a> collection = (Collection) this.f23985k.m22251b(obj);
                                if (collection == null) {
                                    return null;
                                }
                                af c = c6570b.m29245c();
                                double m = (double) c6570b.m29257m();
                                double d = 8.0d;
                                if (m > 19.0d) {
                                    d = 8.0d / Math.pow(2.0d, m - 19.0d);
                                }
                                c6570b = null;
                                am a = al.m32202a(c, (int) (c.m21488e() * d));
                                for (C4820a c4820a : collection) {
                                    if (c4820a.m21388a(a)) {
                                        float d2 = c4820a.m21390c().m21486d(c);
                                        if (c7436c == null || d2 < r12) {
                                            c7436c = c4820a.m21386a();
                                            c6570b = d2;
                                        }
                                    }
                                }
                                return c7436c;
                            }

                            /* renamed from: b */
                            public final void m28329b() {
                                this.f23978d = true;
                            }

                            /* renamed from: a */
                            public final synchronized void m28327a(C7436c c7436c, C4701c c4701c) {
                                this.f23983i = c7436c;
                                this.f23984j = new C4852a().m21760a(c4701c).m21761a();
                                this.f23978d = true;
                            }

                            /* renamed from: c */
                            public final synchronized void m28331c() {
                                this.f23983i = null;
                                this.f23984j = null;
                                this.f23978d = true;
                            }

                            /* renamed from: a */
                            public final ba mo5018a(ba baVar, af afVar) {
                                return this.f23975a.mo5018a(baVar, afVar);
                            }

                            /* renamed from: a */
                            public final float mo5016a(af afVar) {
                                return this.f23975a.mo5016a(afVar);
                            }

                            /* renamed from: a */
                            public final List<ba> mo5019a(int i, af afVar) {
                                return ae.m27685e();
                            }
                        }
