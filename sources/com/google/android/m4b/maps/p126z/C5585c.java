package com.google.android.m4b.maps.p126z;

import com.google.android.m4b.maps.p125y.C5562c;
import com.google.android.m4b.maps.p125y.C5563e;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5569h.C5568a;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5580q;
import com.google.android.m4b.maps.p125y.C5581r;
import com.google.android.m4b.maps.p125y.C5582s;
import com.google.android.m4b.maps.p125y.C6849f;
import com.google.android.m4b.maps.p126z.C5599g.C5597s;
import com.google.android.m4b.maps.p126z.C5599g.C6883m;
import com.google.android.m4b.maps.p126z.C5599g.C7728l;
import com.google.android.m4b.maps.p126z.C6861a.C5583b;
import com.google.android.m4b.maps.p126z.C6861a.C6860a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.m4b.maps.z.c */
public final class C5585c<K, V> {
    /* renamed from: a */
    static final C5582s f20582a = new C68643();
    /* renamed from: q */
    private static C5580q<? extends C5583b> f20583q = C5581r.m24321a(new C68621());
    /* renamed from: r */
    private static C5588e f20584r = new C5588e(0, 0, 0, 0, 0, 0);
    /* renamed from: s */
    private static C5580q<C5583b> f20585s = new C68632();
    /* renamed from: t */
    private static final Logger f20586t = Logger.getLogger(C5585c.class.getName());
    /* renamed from: b */
    boolean f20587b = true;
    /* renamed from: c */
    int f20588c = -1;
    /* renamed from: d */
    int f20589d = -1;
    /* renamed from: e */
    long f20590e = -1;
    /* renamed from: f */
    long f20591f = -1;
    /* renamed from: g */
    C5610o<? super K, ? super V> f20592g;
    /* renamed from: h */
    C5597s f20593h;
    /* renamed from: i */
    long f20594i = -1;
    /* renamed from: j */
    long f20595j = -1;
    /* renamed from: k */
    long f20596k = -1;
    /* renamed from: l */
    C5563e<Object> f20597l;
    /* renamed from: m */
    C5563e<Object> f20598m;
    /* renamed from: n */
    C5603l<? super K, ? super V> f20599n;
    /* renamed from: o */
    C5582s f20600o;
    /* renamed from: p */
    C5580q<? extends C5583b> f20601p = f20583q;
    /* renamed from: u */
    private C5597s f20602u;

    /* renamed from: com.google.android.m4b.maps.z.c$1 */
    static class C68621 implements C5583b {
        /* renamed from: a */
        public final void mo5825a() {
        }

        /* renamed from: a */
        public final void mo5826a(int i) {
        }

        /* renamed from: a */
        public final void mo5827a(long j) {
        }

        /* renamed from: b */
        public final void mo5828b(int i) {
        }

        /* renamed from: b */
        public final void mo5829b(long j) {
        }

        C68621() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.c$2 */
    static class C68632 implements C5580q<C5583b> {
        C68632() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo5823a() {
            return new C6860a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.c$3 */
    static class C68643 extends C5582s {
        /* renamed from: a */
        public final long mo5824a() {
            return 0;
        }

        C68643() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.c$a */
    enum C6865a implements C5603l<Object, Object> {
        INSTANCE
    }

    /* renamed from: com.google.android.m4b.maps.z.c$b */
    enum C6866b implements C5610o<Object, Object> {
        INSTANCE
    }

    C5585c() {
    }

    /* renamed from: a */
    public static C5585c<Object, Object> m24329a() {
        return new C5585c();
    }

    /* renamed from: b */
    public final C5585c<K, V> m24333b() {
        return m24332a(C5597s.WEAK);
    }

    /* renamed from: a */
    final C5585c<K, V> m24332a(C5597s c5597s) {
        C5571j.m24303b(this.f20602u == null, "Key strength was already set to %s", this.f20602u);
        this.f20602u = (C5597s) C5571j.m24292a((Object) c5597s);
        return this;
    }

    /* renamed from: c */
    final C5597s m24334c() {
        return (C5597s) C5569h.m24285b(this.f20602u, C5597s.STRONG);
    }

    /* renamed from: d */
    final C5597s m24335d() {
        return (C5597s) C5569h.m24285b(this.f20593h, C5597s.STRONG);
    }

    /* renamed from: a */
    public final <K1 extends K, V1 extends V> C6849f m24331a(C5587d<? super K1, V1> c5587d) {
        m24330f();
        return new C7728l(this, c5587d);
    }

    /* renamed from: e */
    public final <K1 extends K, V1 extends V> C5584b<K1, V1> m24336e() {
        m24330f();
        C5571j.m24302b(this.f20596k == -1, (Object) "refreshAfterWrite requires a LoadingCache");
        return new C6883m(this);
    }

    /* renamed from: f */
    private void m24330f() {
        boolean z = false;
        if (this.f20592g == null) {
            if (this.f20591f == -1) {
                z = true;
            }
            C5571j.m24302b(z, (Object) "maximumWeight requires weigher");
        } else if (this.f20587b) {
            if (this.f20591f != -1) {
                z = true;
            }
            C5571j.m24302b(z, (Object) "weigher requires maximumWeight");
        } else {
            if (this.f20591f == -1) {
                f20586t.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
            }
        }
    }

    public final String toString() {
        C5568a a = C5569h.m24283a(this);
        if (this.f20588c != -1) {
            a.m24279a("initialCapacity", this.f20588c);
        }
        if (this.f20589d != -1) {
            a.m24279a("concurrencyLevel", this.f20589d);
        }
        if (this.f20590e != -1) {
            a.m24280a("maximumSize", this.f20590e);
        }
        if (this.f20591f != -1) {
            a.m24280a("maximumWeight", this.f20591f);
        }
        if (this.f20594i != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f20594i);
            stringBuilder.append("ns");
            a.m24281a("expireAfterWrite", stringBuilder.toString());
        }
        if (this.f20595j != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f20595j);
            stringBuilder.append("ns");
            a.m24281a("expireAfterAccess", stringBuilder.toString());
        }
        if (this.f20602u != null) {
            a.m24281a("keyStrength", C5562c.m24256a(this.f20602u.toString()));
        }
        if (this.f20593h != null) {
            a.m24281a("valueStrength", C5562c.m24256a(this.f20593h.toString()));
        }
        if (this.f20597l != null) {
            a.m24277a("keyEquivalence");
        }
        if (this.f20598m != null) {
            a.m24277a("valueEquivalence");
        }
        if (this.f20599n != null) {
            a.m24277a("removalListener");
        }
        return a.toString();
    }
}
