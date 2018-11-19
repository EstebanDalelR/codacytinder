package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.C6524p;
import com.google.android.m4b.maps.bo.C6525q;
import com.google.android.m4b.maps.bq.C6534d;
import com.google.android.m4b.maps.br.C4874b;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.cg.C5196z;
import com.google.android.m4b.maps.cg.ab;
import com.google.android.m4b.maps.cg.ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.m4b.maps.bm.i */
public final class C6487i implements C4874b {
    /* renamed from: c */
    private static C6487i f24038c;
    /* renamed from: q */
    private static final C4701c f24039q = new C4701c(new C7436c(0, 0), 0);
    /* renamed from: a */
    private final Map<C4828a, Object> f24040a = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: b */
    private final Map<ad, Object> f24041b = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: d */
    private final C4976e<C7436c, C4701c> f24042d = new C4976e(100);
    /* renamed from: e */
    private final C4976e<C7436c, C4701c> f24043e = new C4976e(100);
    /* renamed from: f */
    private C7436c f24044f;
    /* renamed from: g */
    private C4701c f24045g;
    /* renamed from: h */
    private C6524p f24046h;
    /* renamed from: i */
    private final Set<C7436c> f24047i = new HashSet();
    /* renamed from: j */
    private final List<C5196z> f24048j = new ArrayList();
    /* renamed from: k */
    private final Set<C7436c> f24049k = new HashSet();
    /* renamed from: l */
    private final Object f24050l = new Object();
    /* renamed from: m */
    private final C6534d f24051m;
    /* renamed from: n */
    private final Map<Integer, C6482f> f24052n = ax.m20623b();
    /* renamed from: o */
    private final Map<C7436c, C6482f> f24053o = Collections.synchronizedMap(new HashMap());
    /* renamed from: p */
    private final C4824c f24054p;
    /* renamed from: r */
    private volatile C4701c f24055r;
    /* renamed from: s */
    private volatile C4701c f24056s;

    /* renamed from: com.google.android.m4b.maps.bm.i$a */
    public interface C4828a {
        /* renamed from: a */
        void mo7555a(C6487i c6487i);

        /* renamed from: a */
        void mo7556a(C5196z c5196z);

        /* renamed from: c */
        void mo7560c();
    }

    /* renamed from: com.google.android.m4b.maps.bm.i$1 */
    class C64861 implements C4874b {
        /* renamed from: a */
        private /* synthetic */ C6487i f24037a;

        C64861(C6487i c6487i) {
            this.f24037a = c6487i;
        }

        /* renamed from: a */
        public final void mo5078a(C7436c c7436c, int i, C6524p c6524p) {
            if (i == 2) {
                if (C4728u.m21050a("IndoorState", 3) != 0) {
                    c7436c = String.valueOf(c7436c);
                    c6524p = new StringBuilder(String.valueOf(c7436c).length() + 22);
                    c6524p.append("Building id ");
                    c6524p.append(c7436c);
                    c6524p.append(" not found");
                    Log.d("IndoorState", c6524p.toString());
                }
            } else if (i == 0) {
                this.f24037a.m28484e(c6524p);
            }
        }
    }

    /* renamed from: a */
    public static C6487i m28477a(C6534d c6534d, C4981g c4981g) {
        if (f24038c == null) {
            f24038c = new C6487i(c6534d, c4981g);
        }
        return f24038c;
    }

    /* renamed from: a */
    public static C6487i m28476a() {
        return f24038c;
    }

    private C6487i(C6534d c6534d, C4981g c4981g) {
        this.f24051m = c6534d;
        this.f24054p = new C6480d(c4981g);
    }

    /* renamed from: a */
    public final void m28493a(C4828a c4828a) {
        this.f24040a.put(c4828a, null);
    }

    /* renamed from: b */
    public final void m28500b(C4828a c4828a) {
        this.f24040a.remove(c4828a);
    }

    /* renamed from: a */
    public final void m28494a(ad adVar) {
        this.f24041b.put(adVar, null);
    }

    /* renamed from: a */
    public final void mo5078a(C7436c c7436c, int i, C6524p c6524p) {
        if (i == 2) {
            if (C4728u.m21050a("IndoorState", 3) != 0) {
                c7436c = String.valueOf(c7436c);
                c6524p = new StringBuilder(String.valueOf(c7436c).length() + 22);
                c6524p.append("Building id ");
                c6524p.append(c7436c);
                c6524p.append(" not found");
                Log.d("IndoorState", c6524p.toString());
            }
        } else if (i == 0) {
            C4701c c4701c;
            Object obj;
            synchronized (this.f24050l) {
                if (this.f24045g == null || !this.f24045g.m20902a().equals(c7436c)) {
                    c4701c = null;
                } else {
                    c4701c = this.f24045g;
                    this.f24045g = null;
                }
            }
            if (c4701c != null) {
                m28480a(c6524p, c4701c);
            }
            m28475a(c6524p);
            synchronized (this.f24050l) {
                obj = null;
                if (c7436c.equals(this.f24044f) != 0) {
                    if (this.f24046h == 0 || c6524p.mo5136a().equals(this.f24046h.mo5136a()) == 0) {
                        if (c6524p.mo5138b().isEmpty() == 0) {
                            this.f24046h = c6524p;
                        } else if (this.f24046h != 0) {
                            this.f24046h = null;
                        }
                        i = 1;
                        this.f24044f = null;
                    }
                    i = 0;
                    this.f24044f = null;
                } else {
                    i = 0;
                }
            }
            if (i != 0) {
                m28485h();
            }
            synchronized (this.f24050l) {
                if (this.f24047i.contains(c7436c)) {
                    this.f24047i.remove(c7436c);
                    this.f24048j.add(c6524p);
                    obj = 1;
                }
            }
            if (obj != null) {
                m28486i();
            }
        }
    }

    /* renamed from: a */
    private void m28478a(C7436c c7436c, C4874b c4874b) {
        if (!this.f24051m.m28815b(c7436c)) {
            this.f24051m.m28811a(c7436c, c4874b);
        }
    }

    /* renamed from: a */
    public final void m28491a(C4701c c4701c) {
        synchronized (this.f24050l) {
            if (!c4701c.equals(this.f24045g)) {
                if (!this.f24042d.m22256d().contains(c4701c)) {
                    this.f24045g = c4701c;
                    m28478a(c4701c.m20902a(), (C4874b) this);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m28495a(C5196z c5196z) {
        if (c5196z != null) {
            m28481a(c5196z.mo5136a(), f24039q);
            m28484e(c5196z);
        }
    }

    /* renamed from: b */
    public final ab m28498b(C5196z c5196z) {
        C4701c a = m28488a(c5196z.mo5136a());
        return a != null ? c5196z.mo5139c(a) : null;
    }

    /* renamed from: c */
    public static int m28482c(C5196z c5196z) {
        return c5196z.mo5140d();
    }

    /* renamed from: d */
    public static boolean m28483d(C5196z c5196z) {
        return c5196z.mo5141e();
    }

    /* renamed from: a */
    public final void m28492a(C4701c c4701c, C4701c c4701c2) {
        this.f24055r = c4701c;
        this.f24056s = c4701c2;
        m28487j();
    }

    /* renamed from: b */
    public final void m28499b() {
        this.f24055r = null;
        this.f24056s = null;
        m28487j();
    }

    /* renamed from: b */
    public final boolean m28501b(C4701c c4701c, C4701c c4701c2) {
        return (c4701c == null || c4701c2 == null || c4701c.equals(this.f24055r) == null || c4701c2.equals(this.f24056s) == null) ? null : true;
    }

    /* renamed from: a */
    public final C4701c m28488a(C7436c c7436c) {
        C4701c c4701c;
        synchronized (this.f24042d) {
            c4701c = (C4701c) this.f24042d.m22251b((Object) c7436c);
        }
        if (c4701c == null) {
            C6524p a = this.f24051m.m28809a(c7436c);
            if (a != null) {
                c4701c = m28475a(a);
            } else {
                m28478a(c7436c, (C4874b) this);
            }
        }
        return c4701c == f24039q ? null : c4701c;
    }

    /* renamed from: b */
    public final C4701c m28497b(C7436c c7436c) {
        synchronized (this.f24042d) {
            c7436c = (C4701c) this.f24043e.m22251b((Object) c7436c);
            if (c7436c == f24039q) {
                c7436c = null;
            }
        }
        return c7436c;
    }

    /* renamed from: c */
    public final void m28503c(C7436c c7436c) {
        if (c7436c == null) {
            c7436c = null;
            synchronized (this.f24050l) {
                if (this.f24046h != null) {
                    this.f24044f = null;
                    this.f24046h = null;
                    c7436c = true;
                }
            }
            if (c7436c != null) {
                m28485h();
            }
            return;
        }
        synchronized (this.f24050l) {
            if (!c7436c.equals(this.f24044f)) {
                if (this.f24046h == null || !this.f24046h.mo5136a().equals(c7436c)) {
                    this.f24044f = c7436c;
                    m28478a(c7436c, (C4874b) this);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final C6524p m28502c() {
        C6524p c6524p;
        synchronized (this.f24050l) {
            c6524p = this.f24046h;
        }
        return c6524p;
    }

    /* renamed from: h */
    private void m28485h() {
        synchronized (this.f24041b) {
            for (C4828a a : this.f24040a.keySet()) {
                a.mo7555a(this);
            }
            for (ad a2 : this.f24041b.keySet()) {
                a2.mo4964a();
            }
        }
    }

    /* renamed from: a */
    public final void m28496a(Set<C7436c> set) {
        synchronized (this.f24050l) {
            if (set == null) {
                set = al.m27704f();
            }
            if (set.equals(this.f24049k)) {
                return;
            }
            this.f24049k.clear();
            this.f24049k.addAll(set);
            this.f24047i.clear();
            this.f24047i.addAll(set);
            this.f24048j.clear();
            for (C7436c c7436c : this.f24049k) {
                C6524p a = this.f24051m.m28809a(c7436c);
                if (a != null) {
                    this.f24048j.add(a);
                    this.f24047i.remove(c7436c);
                } else {
                    m28478a(c7436c, (C4874b) this);
                }
            }
            m28486i();
        }
    }

    /* renamed from: d */
    public final List<C5196z> m28505d() {
        List a;
        synchronized (this.f24050l) {
            a = ae.m27681a(this.f24048j);
        }
        return a;
    }

    /* renamed from: e */
    public final Set<ab> m28506e() {
        List<C5196z> d = m28505d();
        Set<ab> hashSet = new HashSet();
        for (C5196z b : d) {
            ab b2 = m28498b(b);
            if (b2 != null) {
                hashSet.add(b2);
            }
        }
        return hashSet;
    }

    /* renamed from: i */
    private void m28486i() {
        m28487j();
        synchronized (this.f24041b) {
            for (C4828a c : this.f24040a.keySet()) {
                c.mo7560c();
            }
        }
    }

    /* renamed from: a */
    private C4701c m28475a(C6524p c6524p) {
        C4701c c4701c;
        synchronized (this.f24042d) {
            c4701c = (C4701c) this.f24042d.m22251b(c6524p.mo5136a());
            Object obj = null;
            if (c4701c == null) {
                C6525q c = c6524p.m28749c();
                c4701c = c == null ? f24039q : c.mo5142a();
                this.f24042d.m22255c(c6524p.mo5136a(), c4701c);
                if (c4701c != f24039q) {
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            m28484e(c6524p);
        }
        return c4701c;
    }

    /* renamed from: e */
    private void m28484e(C5196z c5196z) {
        m28487j();
        synchronized (this.f24041b) {
            for (C4828a a : this.f24040a.keySet()) {
                a.mo7556a(c5196z);
            }
            for (ad a2 : this.f24041b.keySet()) {
                a2.mo4965a(c5196z);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m28481a(com.google.android.m4b.maps.ax.C4699a.C7436c r7, com.google.android.m4b.maps.ax.C4701c r8) {
        /*
        r6 = this;
        r0 = r6.f24042d;
        monitor-enter(r0);
        r1 = r6.f24042d;	 Catch:{ all -> 0x0087 }
        r1 = r1.m22251b(r7);	 Catch:{ all -> 0x0087 }
        r1 = (com.google.android.m4b.maps.ax.C4701c) r1;	 Catch:{ all -> 0x0087 }
        r2 = r8.equals(r1);	 Catch:{ all -> 0x0087 }
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r7 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x0087 }
        return r7;
    L_0x0014:
        r2 = r6.f24042d;	 Catch:{ all -> 0x0087 }
        r2.m22255c(r7, r8);	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0084;
    L_0x001b:
        r2 = r6.f24042d;	 Catch:{ all -> 0x0087 }
        monitor-enter(r2);	 Catch:{ all -> 0x0087 }
        r3 = r6.f24043e;	 Catch:{ all -> 0x0081 }
        r3.m22255c(r7, r1);	 Catch:{ all -> 0x0081 }
        r3 = r6.f24051m;	 Catch:{ all -> 0x0081 }
        r1 = r1.m20902a();	 Catch:{ all -> 0x0081 }
        r1 = r3.m28816c(r1);	 Catch:{ all -> 0x0081 }
        if (r1 != 0) goto L_0x0031;
    L_0x002f:
        monitor-exit(r2);	 Catch:{ all -> 0x0081 }
        goto L_0x0084;
    L_0x0031:
        r3 = f24039q;	 Catch:{ all -> 0x0081 }
        if (r8 != r3) goto L_0x003a;
    L_0x0035:
        r8 = com.google.android.m4b.maps.aa.ae.m27685e();	 Catch:{ all -> 0x0081 }
        goto L_0x004c;
    L_0x003a:
        r3 = r6.f24051m;	 Catch:{ all -> 0x0081 }
        r8 = r8.m20902a();	 Catch:{ all -> 0x0081 }
        r8 = r3.m28816c(r8);	 Catch:{ all -> 0x0081 }
        if (r8 != 0) goto L_0x0048;
    L_0x0046:
        monitor-exit(r2);	 Catch:{ all -> 0x0081 }
        goto L_0x0084;
    L_0x0048:
        r8 = r8.m28757c();	 Catch:{ all -> 0x0081 }
    L_0x004c:
        r1 = r1.m28757c();	 Catch:{ all -> 0x0081 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0081 }
    L_0x0054:
        r3 = r1.hasNext();	 Catch:{ all -> 0x0081 }
        if (r3 == 0) goto L_0x007f;
    L_0x005a:
        r3 = r1.next();	 Catch:{ all -> 0x0081 }
        r3 = (com.google.android.m4b.maps.ax.C4699a.C7436c) r3;	 Catch:{ all -> 0x0081 }
        r4 = r3.equals(r7);	 Catch:{ all -> 0x0081 }
        if (r4 != 0) goto L_0x0054;
    L_0x0066:
        r4 = r8.contains(r3);	 Catch:{ all -> 0x0081 }
        if (r4 != 0) goto L_0x0054;
    L_0x006c:
        r4 = r6.f24043e;	 Catch:{ all -> 0x0081 }
        r5 = r6.f24042d;	 Catch:{ all -> 0x0081 }
        r5 = r5.m22251b(r3);	 Catch:{ all -> 0x0081 }
        r4.m22255c(r3, r5);	 Catch:{ all -> 0x0081 }
        r4 = r6.f24042d;	 Catch:{ all -> 0x0081 }
        r5 = f24039q;	 Catch:{ all -> 0x0081 }
        r4.m22255c(r3, r5);	 Catch:{ all -> 0x0081 }
        goto L_0x0054;
    L_0x007f:
        monitor-exit(r2);	 Catch:{ all -> 0x0081 }
        goto L_0x0084;
    L_0x0081:
        r7 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0081 }
        throw r7;	 Catch:{ all -> 0x0087 }
    L_0x0084:
        monitor-exit(r0);	 Catch:{ all -> 0x0087 }
        r7 = 1;
        return r7;
    L_0x0087:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0087 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.i.a(com.google.android.m4b.maps.ax.a$c, com.google.android.m4b.maps.ax.c):boolean");
    }

    /* renamed from: a */
    private void m28480a(C6524p c6524p, C4701c c4701c) {
        C6525q a = c6524p.m28745a(c4701c);
        if (a != null) {
            for (C7436c c7436c : a.m28757c()) {
                if (m28481a(c7436c, a.mo5142a())) {
                    m28478a(c7436c, new C64861(this));
                }
            }
            return;
        }
        if (C4728u.m21050a("IndoorState", 3)) {
            c4701c = String.valueOf(c4701c);
            c6524p = String.valueOf(c6524p.mo5136a());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c4701c).length() + 37) + String.valueOf(c6524p).length());
            stringBuilder.append("Failed to look up level ");
            stringBuilder.append(c4701c);
            stringBuilder.append(" in building ");
            stringBuilder.append(c6524p);
            Log.d("IndoorState", stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final com.google.android.m4b.maps.bm.C6482f m28489a(com.google.android.m4b.maps.ax.C4699a.C7436c r4, boolean r5, boolean r6, boolean r7) {
        /*
        r3 = this;
        r5 = r3.f24053o;
        monitor-enter(r5);
        r0 = r3.f24053o;	 Catch:{ all -> 0x0066 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0066 }
        r0 = (com.google.android.m4b.maps.bm.C6482f) r0;	 Catch:{ all -> 0x0066 }
        r1 = 0;
        if (r6 == 0) goto L_0x001e;
    L_0x000e:
        if (r0 == 0) goto L_0x001e;
    L_0x0010:
        r6 = r0.m28460f();	 Catch:{ all -> 0x0066 }
        r6 = r6.size();	 Catch:{ all -> 0x0066 }
        r2 = 1;
        if (r6 <= r2) goto L_0x001e;
    L_0x001b:
        r6 = r0;
        r0 = r1;
        goto L_0x001f;
    L_0x001e:
        r6 = r1;
    L_0x001f:
        if (r0 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r5);	 Catch:{ all -> 0x0066 }
        return r0;
    L_0x0023:
        r0 = r3.f24051m;	 Catch:{ all -> 0x0066 }
        r0 = r0.m28809a(r4);	 Catch:{ all -> 0x0066 }
        if (r0 != 0) goto L_0x0030;
    L_0x002b:
        r3.m28478a(r4, r1);	 Catch:{ all -> 0x0066 }
        monitor-exit(r5);	 Catch:{ all -> 0x0066 }
        return r1;
    L_0x0030:
        r0 = r0.m28744a(r4);	 Catch:{ all -> 0x0066 }
        if (r0 != 0) goto L_0x0038;
    L_0x0036:
        monitor-exit(r5);	 Catch:{ all -> 0x0066 }
        return r1;
    L_0x0038:
        r1 = new com.google.android.m4b.maps.bm.f;	 Catch:{ all -> 0x0066 }
        r1.<init>(r0);	 Catch:{ all -> 0x0066 }
        if (r7 == 0) goto L_0x0064;
    L_0x003f:
        r7 = r3.f24053o;	 Catch:{ all -> 0x0066 }
        r7.put(r4, r1);	 Catch:{ all -> 0x0066 }
        if (r6 == 0) goto L_0x0064;
    L_0x0046:
        r4 = r6.m28450a(r4);	 Catch:{ all -> 0x0066 }
        r6 = r4.m28460f();	 Catch:{ all -> 0x0066 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0066 }
    L_0x0052:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0066 }
        if (r7 == 0) goto L_0x0064;
    L_0x0058:
        r7 = r6.next();	 Catch:{ all -> 0x0066 }
        r7 = (com.google.android.m4b.maps.ax.C4699a.C7436c) r7;	 Catch:{ all -> 0x0066 }
        r0 = r3.f24053o;	 Catch:{ all -> 0x0066 }
        r0.put(r7, r4);	 Catch:{ all -> 0x0066 }
        goto L_0x0052;
    L_0x0064:
        monitor-exit(r5);	 Catch:{ all -> 0x0066 }
        return r1;
    L_0x0066:
        r4 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0066 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.i.a(com.google.android.m4b.maps.ax.a$c, boolean, boolean, boolean):com.google.android.m4b.maps.bm.f");
    }

    /* renamed from: d */
    public final C6482f m28504d(C7436c c7436c) {
        return m28489a(c7436c, true, false, false);
    }

    /* renamed from: f */
    public final Set<C6482f> m28507f() {
        Set a;
        synchronized (this.f24053o) {
            a = al.m27701a(this.f24053o.values());
        }
        return a;
    }

    /* renamed from: j */
    private void m28487j() {
        synchronized (this.f24053o) {
            this.f24052n.clear();
            this.f24053o.clear();
            for (ab abVar : m28506e()) {
                C4701c a = abVar.mo5142a();
                Object obj = (a == null || !(a.equals(this.f24055r) || a.equals(this.f24056s))) ? null : 1;
                if (obj == null) {
                    obj = (C6482f) this.f24052n.get(Integer.valueOf(abVar.mo5146f()));
                    if (obj == null) {
                        obj = new C6482f(abVar);
                        this.f24052n.put(Integer.valueOf(abVar.mo5146f()), obj);
                    } else {
                        obj.m28455a(abVar);
                    }
                    this.f24053o.put(abVar.mo5143b(), obj);
                }
            }
        }
    }

    /* renamed from: g */
    public final C4824c m28508g() {
        return this.f24054p;
    }
}
