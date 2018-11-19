package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.as;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bj.C4787f;
import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bj.C6462a;
import com.google.android.m4b.maps.bj.C7452e;
import com.google.android.m4b.maps.bm.C4824c;
import com.google.android.m4b.maps.bm.C4824c.C4823a;
import com.google.android.m4b.maps.bm.C6482f;
import com.google.android.m4b.maps.bm.C6485h;
import com.google.android.m4b.maps.bm.C6485h.C4827a;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bm.C6487i.C4828a;
import com.google.android.m4b.maps.bo.C4847g;
import com.google.android.m4b.maps.bo.C6519h;
import com.google.android.m4b.maps.bo.C6525q.C4851a;
import com.google.android.m4b.maps.bo.C6526r;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.bt.C4909c;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.ce.C5094b;
import com.google.android.m4b.maps.ce.C6590a;
import com.google.android.m4b.maps.cg.C5196z;
import com.google.android.m4b.maps.cg.ab;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class aa extends al implements C4823a, C4827a, C4828a, C5002b {
    /* renamed from: d */
    private volatile boolean f28897d = true;
    /* renamed from: e */
    private final C6487i f28898e;
    /* renamed from: f */
    private final C6485h f28899f;
    /* renamed from: g */
    private C6462a f28900g;
    /* renamed from: h */
    private final C8069a f28901h;
    /* renamed from: i */
    private final Set<C6482f> f28902i = new HashSet();
    /* renamed from: j */
    private volatile Set<C4699a> f28903j = al.m27704f();
    /* renamed from: k */
    private final Map<C5094b, C6519h> f28904k = ax.m20623b();
    /* renamed from: l */
    private final Map<C7436c, C5094b> f28905l = ax.m20623b();
    /* renamed from: m */
    private final List<C6561r> f28906m = new ArrayList();
    /* renamed from: n */
    private final ah f28907n = new C65551(this);

    /* renamed from: com.google.android.m4b.maps.bx.aa$1 */
    class C65551 implements ah {
        /* renamed from: a */
        private /* synthetic */ aa f24409a;

        /* renamed from: a */
        public final void mo5087a(C5052d c5052d, C5009j c5009j) {
        }

        /* renamed from: a */
        public final void mo5088a(C5052d c5052d, C6570b c6570b, C5009j c5009j, af afVar) {
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return 0;
        }

        C65551(aa aaVar) {
            this.f24409a = aaVar;
        }

        /* renamed from: a */
        public final Set<C4699a> mo5086a() {
            return this.f24409a.f28903j;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.aa$b */
    static class C6556b implements ah {
        /* renamed from: a */
        private final Set<? extends C4699a> f24410a;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return 0;
        }

        public C6556b(Set<C7436c> set) {
            this.f24410a = al.m27701a((Collection) set);
        }

        /* renamed from: a */
        public final Set<? extends C4699a> mo5086a() {
            return this.f24410a;
        }

        /* renamed from: a */
        public final void mo5088a(C5052d c5052d, C6570b c6570b, C5009j c5009j, af afVar) {
            c6570b = c5052d.m22635x();
            if (c5009j.m22389c().m22299b() == C4984a.UNDERGROUND_STENCIL) {
                c5052d.m22633v();
                c6570b.glStencilOp(7681, 7681, 7681);
                c6570b.glStencilFunc(519, 255, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                c6570b.glStencilMask(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                c6570b.glTexEnvx(8960, 8704, 7681);
                C5051c.m22593a(c6570b, -10461088);
            }
        }

        /* renamed from: a */
        public final void mo5087a(C5052d c5052d, C5009j c5009j) {
            if (c5009j.m22389c().m22299b() == C4984a.UNDERGROUND_STENCIL) {
                c5052d.m22634w();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.aa$c */
    static class C6557c implements C4788h {
        /* renamed from: a */
        private final C4788h f24411a;
        /* renamed from: b */
        private final int f24412b;
        /* renamed from: c */
        private C6534d f24413c;
        /* renamed from: d */
        private C4824c f24414d;
        /* renamed from: e */
        private final C6487i f24415e;

        public C6557c(C4788h c4788h, int i, C6487i c6487i) {
            this.f24411a = c4788h;
            this.f24412b = i;
            this.f24415e = c6487i;
        }

        /* renamed from: a */
        public final C4787f mo5022a(bg bgVar, int i, boolean z, bf bfVar, C4981g c4981g) {
            C4787f a = this.f24411a.mo5022a(bgVar, i, z, bfVar, c4981g);
            if (this.f24413c == null) {
                this.f24413c = C6534d.m28802a();
            }
            if (this.f24414d == null) {
                this.f24414d = this.f24415e.m28508g();
            }
            return new C6462a(a, this.f24414d, this.f24413c, this.f24412b, this.f24415e);
        }

        /* renamed from: a */
        public final C7452e mo5021a(bg bgVar, boolean z, bf bfVar, C4981g c4981g) {
            return new C7452e(bgVar, bfVar, c4981g);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.aa$a */
    static class C8069a extends C7485u {
        /* renamed from: a */
        private int f28892a;
        /* renamed from: b */
        private boolean f28893b;
        /* renamed from: c */
        private float f28894c;
        /* renamed from: d */
        private long f28895d;
        /* renamed from: e */
        private final int f28896e = MapboxConstants.ANIMATION_DURATION;

        public C8069a(C5016a c5016a, int i) {
            super(c5016a);
        }

        /* renamed from: b */
        public final void mo7551b(int i) {
            this.f28892a = i;
        }

        /* renamed from: b */
        public final synchronized void m34253b(boolean z) {
            C4712d.m20955a();
            long c = C4712d.m20957c();
            if (z != this.f28893b) {
                this.f28893b = z;
                long j = (long) this.f28896e;
                z = this.f28894c;
                if (!this.f28893b) {
                    z = true - z;
                }
                this.f28895d = c - ((long) ((int) (z * ((float) j))));
                this.f28894c = C8069a.m34251a(this.f28895d, this.f28895d, this.f28896e, this.f28893b);
            }
        }

        /* renamed from: b */
        public final synchronized boolean m34254b() {
            boolean z;
            if (this.f28894c <= 0.0f) {
                if (!this.f28893b) {
                    z = false;
                }
            }
            z = true;
            return z;
        }

        /* renamed from: c */
        public final synchronized boolean m34255c() {
            C4712d.m20955a();
            float a = C8069a.m34251a(this.f28895d, C4712d.m20957c(), this.f28896e, this.f28893b);
            if ((!this.f28893b || this.f28894c >= 1.0f) && (this.f28893b || this.f28894c <= 0.0f)) {
                return false;
            }
            this.f28894c = a;
            a = this.f28894c;
            int i = this.f28892a;
            super.mo7551b((16777215 & i) | (((int) (((float) ((i >> 24) & 255)) * a)) << 24));
            return true;
        }

        /* renamed from: a */
        private static float m34251a(long j, long j2, int i, boolean z) {
            j = Math.min(1.0f, Math.max(0.0f, ((float) (j2 - j)) / ((float) i)));
            return z ? j : 1.0f - j;
        }
    }

    /* renamed from: e */
    public final C6571c mo5217e() {
        return null;
    }

    /* renamed from: g */
    public final C5002b mo7561g() {
        return this;
    }

    protected aa(C4909c c4909c, C4788h c4788h, int i, int i2, int i3, C5016a c5016a, int i4, C6487i c6487i, C4981g c4981g) {
        C6487i c6487i2 = c6487i;
        int i5 = i;
        super(bg.f17758n, c4909c, new C6557c(c4788h, i5, c6487i2), i5, i2, 4, c5016a, 256, 256, false, true, false, true, true, false, c4981g);
        this.f28898e = c6487i;
        this.f28899f = new C6485h();
        this.f28901h = new C8069a(C5016a.NIGHT_DIMMER, MapboxConstants.ANIMATION_DURATION);
        this.f28901h.mo7551b(-2142220208);
    }

    /* renamed from: b */
    public final void m34273b() {
        this.f28898e.m28493a((C4828a) this);
        this.f28899f.m28471a((C4827a) this);
        this.f28898e.m28508g().mo5083a((C4823a) this);
    }

    /* renamed from: f */
    public final void m34276f() {
        this.f28898e.m28500b((C4828a) this);
        this.f28899f.m28473b((C4827a) this);
        this.f28898e.m28508g().mo5085b(this);
    }

    /* renamed from: b */
    protected final Set<ba> mo7559b(C6570b c6570b) {
        if (this.f28900g == null) {
            return al.m27704f();
        }
        return this.f28900g.m28328b(c6570b);
    }

    /* renamed from: a */
    public final boolean mo7558a(List<ag> list) {
        return m34258b((List) list);
    }

    /* renamed from: b */
    private boolean m34258b(List<ag> list) {
        if (!this.f28897d) {
            return false;
        }
        this.f28897d = false;
        list.clear();
        if (this.f28901h.m34254b()) {
            list.add(m29097a(C4984a.UNDERGROUND_MODE_MASK));
        }
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Set<Object> hashSet3 = new HashSet();
        hashSet3.addAll(this.f28898e.m28507f());
        synchronized (this.f28902i) {
            hashSet3.addAll(this.f28902i);
        }
        for (Object obj : hashSet3) {
            Object a;
            if (obj.m28457c()) {
                a = m29099a(C4984a.ANIMATED_ELEVATED_COLOR, obj);
            } else if (obj.m28456b() < 0.0f) {
                a = m29098a(C4984a.UNDERGROUND_COLOR, ae.m27680a(obj), ae.m27680a(this.f28907n));
            } else {
                a = m29098a(C4984a.ELEVATED_COLOR, ae.m27680a(obj), ae.m27680a(this.f28907n));
            }
            list.add(a);
            if (obj.m28456b() > 0.0f && !obj.m28457c()) {
                hashSet.addAll(obj.m28460f());
            } else if (obj.m28456b() < 0.0f && !obj.m28457c()) {
                hashSet2.addAll(obj.m28460f());
                list.add(m29099a(C4984a.DROP_SHADOWS_INNER, obj));
            }
        }
        if (!hashSet.isEmpty()) {
            list.add(m29099a(C4984a.DROP_SHADOWS_OUTER, new C6556b(hashSet)));
        }
        if (!hashSet2.isEmpty()) {
            list.add(m29099a(C4984a.UNDERGROUND_STENCIL, new C6556b(hashSet2)));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (c5009j.m22389c().m22299b() == C4984a.UNDERGROUND_MODE_MASK) {
            if (this.f28901h.m34254b()) {
                this.f28901h.mo5222a(c5052d, c6570b, c5009j);
            }
        } else if (c6570b.m29257m() > 14.9f) {
            super.mo5222a(c5052d, c6570b, c5009j);
        } else {
            this.b = true;
        }
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        super.mo7040a(c5052d);
        this.f28898e.m28503c(null);
        this.f28898e.m28496a(null);
    }

    /* renamed from: n */
    private void m34259n() {
        if (this.f28900g != null) {
            this.f28900g.m28329b();
            aj ajVar = this.a;
            if (ajVar != null) {
                ajVar.mo5221a(true, false);
            }
        }
    }

    /* renamed from: o */
    private void m34260o() {
        ab abVar;
        C5196z c = this.f28898e.m28502c();
        if (c == null) {
            abVar = null;
        } else {
            abVar = this.f28898e.m28498b(c);
        }
        C8069a c8069a = this.f28901h;
        boolean z = abVar != null && abVar.mo5142a().m20903b() < 0;
        c8069a.m34253b(z);
    }

    /* renamed from: a */
    public final void mo7555a(C6487i c6487i) {
        this.f28897d = true;
        m34260o();
        c6487i = c6487i.m28502c();
        if (c6487i != null) {
            this.f28903j = al.m27699a(as.m20500a(c6487i.mo5138b(), C4851a.f17817a));
        } else {
            this.f28903j = al.m27704f();
        }
        m34259n();
    }

    /* renamed from: a */
    public final void mo7556a(C5196z c5196z) {
        this.f28897d = true;
        m34260o();
        if (this.f28900g != null) {
            C4701c a = this.f28898e.m28488a(c5196z.mo5136a());
            C4701c b = this.f28898e.m28497b(c5196z.mo5136a());
            if (a != null) {
                if (b != null) {
                    if (!this.f28898e.m28501b(b, a)) {
                        this.f28900g.m28331c();
                        this.f28898e.m28492a(b, a);
                        C6482f a2 = this.f28898e.m28489a(a.m20902a(), true, true, true);
                        C6482f a3 = this.f28898e.m28489a(b.m20902a(), true, true, false);
                        if (a2 != null) {
                            if (a3 != null) {
                                synchronized (this.f28902i) {
                                    for (C6482f d : this.f28902i) {
                                        d.m28458d();
                                    }
                                    if (a2.m28456b() > a3.m28456b()) {
                                        a2.m28452a(5);
                                        a3.m28452a(24);
                                    } else {
                                        a2.m28452a(20);
                                        a3.m28452a(10);
                                    }
                                    this.f28902i.clear();
                                    this.f28902i.add(a2);
                                    this.f28902i.add(a3);
                                }
                                this.f28900g.m28327a(c5196z.mo5136a(), b);
                            }
                        }
                    }
                }
            }
        }
        m34259n();
    }

    /* renamed from: c */
    public final void mo7560c() {
        this.f28897d = true;
    }

    /* renamed from: a */
    protected final void mo7554a(C4787f c4787f) {
        this.f28900g = (C6462a) c4787f;
        super.mo7554a(c4787f);
    }

    /* renamed from: a */
    public final int mo7552a(bp bpVar, ae aeVar, Set<C4699a> set) {
        set = this.f28898e;
        List<C5196z> d = set.m28505d();
        Set hashSet = new HashSet();
        for (C5196z b : d) {
            ab b2 = set.m28498b(b);
            if (b2 != null) {
                hashSet.add(b2.mo5142a());
            }
        }
        set = m32460l().iterator();
        while (set.hasNext()) {
            C6587q c6587q = (C6587q) set.next();
            if (c6587q != null) {
                C7436c b3 = ((C6526r) c6587q.mo7136b().m21616a(C4839a.INDOOR)).m28766b();
                if (hashSet.contains(b3) && (bpVar == null || bpVar.mo5135b(c6587q.mo7136b().m21626i()))) {
                    c6587q.mo7130a(m34256a(b3));
                    c6587q.mo7135a(aeVar);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo7557a(Set<C5094b> set, Map<C5094b, C4847g> map) {
        for (ab b : this.f28898e.m28506e()) {
            set.add(m34256a(b.mo5143b()));
        }
        map.putAll(this.f28904k);
    }

    /* renamed from: a */
    private C5094b m34256a(C7436c c7436c) {
        return new C6590a(this.c, c7436c, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final int mo5216a(com.google.android.m4b.maps.bz.C6570b r5) {
        /*
        r4 = this;
        r5 = r4.f28901h;
        r5 = r5.m34255c();
        r0 = 2;
        if (r5 == 0) goto L_0x000b;
    L_0x0009:
        r5 = 2;
        goto L_0x000c;
    L_0x000b:
        r5 = 0;
    L_0x000c:
        r1 = r4.f28902i;
        monitor-enter(r1);
        r2 = r4.f28902i;	 Catch:{ all -> 0x0050 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        return r5;
    L_0x0019:
        r2 = r4.f28902i;	 Catch:{ all -> 0x0050 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0050 }
    L_0x001f:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0050 }
        if (r3 == 0) goto L_0x0039;
    L_0x0025:
        r5 = r2.next();	 Catch:{ all -> 0x0050 }
        r5 = (com.google.android.m4b.maps.bm.C6482f) r5;	 Catch:{ all -> 0x0050 }
        r5 = r5.m28459e();	 Catch:{ all -> 0x0050 }
        if (r5 != 0) goto L_0x0037;
    L_0x0031:
        r2.remove();	 Catch:{ all -> 0x0050 }
        r5 = 1;
        r4.f28897d = r5;	 Catch:{ all -> 0x0050 }
    L_0x0037:
        r5 = 2;
        goto L_0x001f;
    L_0x0039:
        r0 = r4.f28902i;	 Catch:{ all -> 0x0050 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x004e;
    L_0x0041:
        r0 = r4.f28900g;	 Catch:{ all -> 0x0050 }
        r0.m28331c();	 Catch:{ all -> 0x0050 }
        r0 = r4.f28898e;	 Catch:{ all -> 0x0050 }
        r0.m28499b();	 Catch:{ all -> 0x0050 }
        r4.m34259n();	 Catch:{ all -> 0x0050 }
    L_0x004e:
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        return r5;
    L_0x0050:
        r5 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.aa.a(com.google.android.m4b.maps.bz.b):int");
    }

    public final void h_() {
        m34259n();
    }

    /* renamed from: a */
    public final void mo7553a() {
        m34259n();
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        if (this.f28900g != null) {
            this.f28898e.m28503c(c6570b.m29257m() > 17.0f ? this.f28900g.m28332d(c6570b) : null);
        }
        if (this.f28900g != null) {
            if (c6570b.m29257m() > 14.9f) {
                this.f28898e.m28496a(this.f28900g.m28330c(c6570b));
                for (ba a : this.f28900g.mo5020a(c6570b)) {
                    this.f28899f.m28469a(a);
                }
            } else {
                this.f28898e.m28496a(null);
            }
        }
        this.f28904k.clear();
        if (c6570b.m29257m() <= 14.9f) {
            return true;
        }
        c5052d = super.mo7044a(c6570b, c5052d);
        this.f28904k.clear();
        this.f28905l.clear();
        if (c6570b.m29257m() > 1099431936) {
            for (C6587q c6587q : m32460l()) {
                C7436c b = ((C6526r) c6587q.mo7136b().m21616a(C4839a.INDOOR)).m28766b();
                Object obj = (C5094b) this.f28905l.get(b);
                if (obj == null) {
                    obj = m34256a(b);
                    this.f28905l.put(b, obj);
                }
                C4847g a2 = this.f28899f.m28469a(c6587q.mo7136b());
                if (!(a2 == null || a2 == C6485h.f24030a)) {
                    C6519h c6519h = (C6519h) this.f28904k.get(obj);
                    if (c6519h == null) {
                        this.f28904k.put(obj, new C6519h(a2));
                    } else {
                        c6519h.m28714a(a2);
                    }
                }
            }
        }
        return c5052d;
    }
}
