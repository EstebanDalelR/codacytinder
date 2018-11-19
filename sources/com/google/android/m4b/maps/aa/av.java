package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.aw.C4564p;
import com.google.android.m4b.maps.p125y.C5562c;
import com.google.android.m4b.maps.p125y.C5563e;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5569h.C5568a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class av extends C4587w<Object, Object> {
    /* renamed from: a */
    boolean f23645a;
    /* renamed from: b */
    int f23646b = -1;
    /* renamed from: c */
    int f23647c = -1;
    /* renamed from: d */
    int f23648d = -1;
    /* renamed from: e */
    C4564p f23649e;
    /* renamed from: f */
    C4564p f23650f;
    /* renamed from: g */
    long f23651g = -1;
    /* renamed from: h */
    long f23652h = -1;
    /* renamed from: i */
    C4553b f23653i;
    /* renamed from: j */
    C5563e<Object> f23654j;

    /* renamed from: com.google.android.m4b.maps.aa.av$a */
    static class C4552a<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final C4554c<K, V> f16879a;
        /* renamed from: b */
        private final C4553b f16880b;

        public final boolean containsKey(Object obj) {
            return false;
        }

        public final boolean containsValue(Object obj) {
            return false;
        }

        public final V get(Object obj) {
            return null;
        }

        public final V remove(Object obj) {
            return null;
        }

        public final boolean remove(Object obj, Object obj2) {
            return false;
        }

        C4552a(av avVar) {
            this.f16879a = avVar.m20677e();
            this.f16880b = avVar.f23653i;
        }

        public final V put(K k, V v) {
            C5571j.m24292a((Object) k);
            C5571j.m24292a((Object) v);
            C7403d c7403d = new C7403d(k, v, this.f16880b);
            return null;
        }

        public final V putIfAbsent(K k, V v) {
            return put(k, v);
        }

        public final V replace(K k, V v) {
            C5571j.m24292a((Object) k);
            C5571j.m24292a((Object) v);
            return null;
        }

        public final boolean replace(K k, V v, V v2) {
            C5571j.m24292a((Object) k);
            C5571j.m24292a((Object) v2);
            return null;
        }

        public final Set<Entry<K, V>> entrySet() {
            return Collections.emptySet();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.av$b */
    enum C4553b {
        EXPLICIT {
        },
        REPLACED {
        },
        COLLECTED {
        },
        EXPIRED {
        },
        SIZE {
        };
    }

    /* renamed from: com.google.android.m4b.maps.aa.av$c */
    interface C4554c<K, V> {
    }

    /* renamed from: com.google.android.m4b.maps.aa.av$d */
    static final class C7403d<K, V> extends ab<K, V> {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final C4553b f27154a;

        C7403d(K k, V v, C4553b c4553b) {
            super(k, v);
            this.f27154a = c4553b;
        }
    }

    /* renamed from: a */
    final int m27717a() {
        return this.f23646b == -1 ? 16 : this.f23646b;
    }

    /* renamed from: b */
    final int m27719b() {
        return this.f23647c == -1 ? 4 : this.f23647c;
    }

    /* renamed from: c */
    final C4564p m27721c() {
        return (C4564p) C5569h.m24285b(this.f23649e, C4564p.STRONG);
    }

    @Deprecated
    /* renamed from: a */
    final av m27718a(long j, TimeUnit timeUnit) {
        m27716c(j, timeUnit);
        this.f23651g = timeUnit.toNanos(j);
        if (j == 0 && this.f23653i == null) {
            this.f23653i = C4553b.EXPIRED;
        }
        this.f23645a = 1;
        return this;
    }

    /* renamed from: c */
    private void m27716c(long j, TimeUnit timeUnit) {
        C5571j.m24303b(this.f23651g == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(this.f23651g));
        C5571j.m24303b(this.f23652h == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(this.f23652h));
        C5571j.m24299a(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
    }

    @Deprecated
    /* renamed from: b */
    final av m27720b(long j, TimeUnit timeUnit) {
        m27716c(j, timeUnit);
        this.f23652h = timeUnit.toNanos(j);
        if (j == 0 && this.f23653i == null) {
            this.f23653i = C4553b.EXPIRED;
        }
        this.f23645a = 1;
        return this;
    }

    /* renamed from: d */
    public final <K, V> ConcurrentMap<K, V> m27722d() {
        if (!this.f23645a) {
            return new ConcurrentHashMap(m27717a(), 0.75f, m27719b());
        }
        return this.f23653i == null ? new aw(this) : new C4552a(this);
    }

    public final String toString() {
        C5568a a = C5569h.m24283a(this);
        if (this.f23646b != -1) {
            a.m24279a("initialCapacity", this.f23646b);
        }
        if (this.f23647c != -1) {
            a.m24279a("concurrencyLevel", this.f23647c);
        }
        if (this.f23648d != -1) {
            a.m24279a("maximumSize", this.f23648d);
        }
        if (this.f23651g != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f23651g);
            stringBuilder.append("ns");
            a.m24281a("expireAfterWrite", stringBuilder.toString());
        }
        if (this.f23652h != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.f23652h);
            stringBuilder.append("ns");
            a.m24281a("expireAfterAccess", stringBuilder.toString());
        }
        if (this.f23649e != null) {
            a.m24281a("keyStrength", C5562c.m24256a(this.f23649e.toString()));
        }
        if (this.f23650f != null) {
            a.m24281a("valueStrength", C5562c.m24256a(this.f23650f.toString()));
        }
        if (this.f23654j != null) {
            a.m24277a("keyEquivalence");
        }
        if (this.k != null) {
            a.m24277a("removalListener");
        }
        return a.toString();
    }
}
