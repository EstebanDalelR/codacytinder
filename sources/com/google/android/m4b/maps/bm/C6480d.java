package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.bm.C4824c.C4823a;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bw.C4981g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bm.d */
public final class C6480d implements C4824c {
    /* renamed from: b */
    private final Object f24011b = new Object();
    /* renamed from: c */
    private boolean f24012c = true;
    /* renamed from: d */
    private boolean f24013d;
    /* renamed from: e */
    private volatile C4824c f24014e;
    /* renamed from: f */
    private volatile C4824c f24015f;
    /* renamed from: g */
    private final List<C4823a> f24016g = new ArrayList();
    /* renamed from: h */
    private final C4825a f24017h;
    /* renamed from: i */
    private final C4981g f24018i;

    /* renamed from: com.google.android.m4b.maps.bm.d$a */
    public interface C4825a {
        /* renamed from: a */
        C4824c mo5080a();

        /* renamed from: a */
        C4824c mo5081a(String str);
    }

    /* renamed from: com.google.android.m4b.maps.bm.d$1 */
    class C64791 implements C4825a {
        /* renamed from: a */
        private /* synthetic */ C6480d f24010a;

        C64791(C6480d c6480d) {
            this.f24010a = c6480d;
        }

        /* renamed from: a */
        public final C4824c mo5080a() {
            return new C6490k();
        }

        /* renamed from: a */
        public final C4824c mo5081a(String str) {
            return new C6488j(str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m28435a() {
        /*
        r4 = this;
        r0 = r4.f24011b;
        monitor-enter(r0);
        r1 = r4.f24013d;	 Catch:{ all -> 0x007a }
        r2 = 1;
        if (r1 == 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r0);	 Catch:{ all -> 0x007a }
        return r2;
    L_0x000a:
        r1 = r4.f24012c;	 Catch:{ all -> 0x007a }
        r3 = 0;
        if (r1 == 0) goto L_0x001b;
    L_0x000f:
        r1 = r4.f24018i;	 Catch:{ all -> 0x007a }
        r1 = r1.m22276b();	 Catch:{ all -> 0x007a }
        if (r1 == 0) goto L_0x001b;
    L_0x0017:
        r4.f24012c = r3;	 Catch:{ all -> 0x007a }
        r1 = 1;
        goto L_0x001c;
    L_0x001b:
        r1 = 0;
    L_0x001c:
        monitor-exit(r0);	 Catch:{ all -> 0x007a }
        if (r1 != 0) goto L_0x0020;
    L_0x001f:
        return r3;
    L_0x0020:
        r0 = "CompositeBuildingBoundProvider";
        r1 = 3;
        r0 = com.google.android.m4b.maps.ay.C4728u.m21050a(r0, r1);
        if (r0 == 0) goto L_0x0043;
    L_0x0029:
        r0 = "CompositeBuildingBoundProvider";
        r1 = new java.lang.StringBuilder;
        r3 = 71;
        r1.<init>(r3);
        r3 = "Creating providers with baseTiles = true";
        r1.append(r3);
        r3 = " and supplemental list = true";
        r1.append(r3);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0043:
        r0 = r4.f24017h;
        r0 = r0.mo5080a();
        r1 = r4.f24017h;
        r3 = "/new.building.list";
        r1 = r1.mo5081a(r3);
        r4.f24015f = r1;
        r4.f24014e = r0;
        r1 = r4.f24011b;
        monitor-enter(r1);
        r4.f24013d = r2;	 Catch:{ all -> 0x0077 }
        r0 = r4.f24016g;	 Catch:{ all -> 0x0077 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0077 }
    L_0x0060:
        r3 = r0.hasNext();	 Catch:{ all -> 0x0077 }
        if (r3 == 0) goto L_0x0070;
    L_0x0066:
        r3 = r0.next();	 Catch:{ all -> 0x0077 }
        r3 = (com.google.android.m4b.maps.bm.C4824c.C4823a) r3;	 Catch:{ all -> 0x0077 }
        r4.m28436c(r3);	 Catch:{ all -> 0x0077 }
        goto L_0x0060;
    L_0x0070:
        r0 = r4.f24016g;	 Catch:{ all -> 0x0077 }
        r0.clear();	 Catch:{ all -> 0x0077 }
        monitor-exit(r1);	 Catch:{ all -> 0x0077 }
        return r2;
    L_0x0077:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0077 }
        throw r0;
    L_0x007a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.d.a():boolean");
    }

    public C6480d(C4981g c4981g) {
        this.f24018i = c4981g;
        this.f24017h = new C64791(this);
        m28435a();
    }

    /* renamed from: a */
    public final Collection<C4820a> mo5082a(ba baVar) {
        if (!m28435a()) {
            return C4824c.f17615a;
        }
        Iterable e = ae.m27685e();
        Collection e2 = ae.m27685e();
        if (this.f24015f != null) {
            e = this.f24015f.mo5082a(baVar);
        }
        if (this.f24014e != null) {
            e2 = this.f24014e.mo5082a(baVar);
        }
        if (r0 != C4824c.f17615a) {
            if (r1 != C4824c.f17615a) {
                if (r0.isEmpty() != null && r1.isEmpty() != null) {
                    return ae.m27685e();
                }
                baVar = new HashSet();
                for (C4820a a : r0) {
                    baVar.add(a.m21386a());
                }
                Collection<C4820a> a2 = au.m20525a((Iterable) r0);
                for (C4820a c4820a : r1) {
                    if (!baVar.contains(c4820a.m21386a())) {
                        a2.add(c4820a);
                    }
                }
                return a2;
            }
        }
        return C4824c.f17615a;
    }

    /* renamed from: a */
    public final boolean mo5084a(C4699a c4699a) {
        boolean z = false;
        if (!m28435a()) {
            return false;
        }
        if (this.f24015f != null) {
            z = this.f24015f.mo5084a(c4699a);
        }
        if (!(z || this.f24014e == null)) {
            z = this.f24014e.mo5084a(c4699a);
        }
        return z;
    }

    /* renamed from: c */
    private void m28436c(C4823a c4823a) {
        if (this.f24015f != null) {
            this.f24015f.mo5083a(c4823a);
        }
        if (this.f24014e != null) {
            this.f24014e.mo5083a(c4823a);
        }
    }

    /* renamed from: a */
    public final void mo5083a(C4823a c4823a) {
        m28435a();
        synchronized (this.f24011b) {
            if (this.f24013d) {
                m28436c(c4823a);
                return;
            }
            this.f24016g.add(c4823a);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo5085b(com.google.android.m4b.maps.bm.C4824c.C4823a r3) {
        /*
        r2 = this;
        r2.m28435a();
        r0 = r2.f24011b;
        monitor-enter(r0);
        r1 = r2.f24013d;	 Catch:{ all -> 0x0025 }
        if (r1 != 0) goto L_0x0011;
    L_0x000a:
        r1 = r2.f24016g;	 Catch:{ all -> 0x0025 }
        r1.remove(r3);	 Catch:{ all -> 0x0025 }
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        return;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        r0 = r2.f24015f;
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r2.f24015f;
        r0.mo5085b(r3);
    L_0x001b:
        r0 = r2.f24014e;
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r2.f24014e;
        r0.mo5085b(r3);
    L_0x0024:
        return;
    L_0x0025:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bm.d.b(com.google.android.m4b.maps.bm.c$a):void");
    }
}
