package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.ag.C8041a;
import java.util.Iterator;
import java.util.Map.Entry;

final class bh<K, V> extends af<K, V> {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private final transient ag<K, V>[] f23678a;
    /* renamed from: b */
    private final transient ag<K, V>[] f23679b;
    /* renamed from: c */
    private final transient int f23680c;

    /* renamed from: com.google.android.m4b.maps.aa.bh$a */
    class C8055a extends ah<K, V> {
        /* renamed from: a */
        private /* synthetic */ bh f28861a;

        private C8055a(bh bhVar) {
            this.f28861a = bhVar;
        }

        /* renamed from: e */
        final af<K, V> mo7518e() {
            return this.f28861a;
        }

        /* renamed from: a */
        public final bw<Entry<K, V>> mo4785a() {
            return mo4786b().mo4785a();
        }

        /* renamed from: c */
        final ae<Entry<K, V>> mo4790c() {
            return new be((aa) this, this.f28861a.f23678a);
        }

        public final /* synthetic */ Iterator iterator() {
            return mo4786b().mo4785a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.bh$b */
    static final class C8056b<K, V> extends ag<K, V> {
        /* renamed from: a */
        private final ag<K, V> f28862a;

        /* renamed from: b */
        final ag<K, V> mo7521b() {
            return null;
        }

        C8056b(K k, V v, ag<K, V> agVar) {
            super(k, v);
            this.f28862a = agVar;
        }

        C8056b(ag<K, V> agVar, ag<K, V> agVar2) {
            super(agVar);
            this.f28862a = agVar2;
        }

        /* renamed from: a */
        final ag<K, V> mo7520a() {
            return this.f28862a;
        }
    }

    /* renamed from: c */
    final boolean mo4780c() {
        return false;
    }

    bh(int i, C8041a<?, ?>[] c8041aArr) {
        this.f23678a = new ag[i];
        int a = C4588x.m20679a(i, 1.2d);
        this.f23679b = new ag[a];
        this.f23680c = a - 1;
        for (a = 0; a < i; a++) {
            ag agVar = c8041aArr[a];
            Object key = agVar.getKey();
            int a2 = C4588x.m20678a(key.hashCode()) & this.f23680c;
            ag agVar2 = this.f23679b[a2];
            if (agVar2 != null) {
                agVar = new C8056b(agVar, agVar2);
            }
            this.f23679b[a2] = agVar;
            this.f23678a[a] = agVar;
            m27819a(key, agVar, agVar2);
        }
    }

    bh(Entry<?, ?>[] entryArr) {
        int length = entryArr.length;
        this.f23678a = new ag[length];
        int a = C4588x.m20679a(length, 1.2d);
        this.f23679b = new ag[a];
        this.f23680c = a - 1;
        for (a = 0; a < length; a++) {
            Entry entry = entryArr[a];
            Object key = entry.getKey();
            Object value = entry.getValue();
            C4583i.m20669a(key, value);
            int a2 = C4588x.m20678a(key.hashCode()) & this.f23680c;
            ag agVar = this.f23679b[a2];
            ag c8041a = agVar == null ? new C8041a(key, value) : new C8056b(key, value, agVar);
            this.f23679b[a2] = c8041a;
            this.f23678a[a] = c8041a;
            m27819a(key, c8041a, agVar);
        }
    }

    /* renamed from: a */
    private static void m27819a(K k, ag<K, V> agVar, ag<K, V> agVar2) {
        while (agVar2 != null) {
            af.m20490a(k.equals(agVar2.getKey()) ^ 1, "key", agVar, agVar2);
            agVar2 = agVar2.mo7520a();
        }
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        for (ag agVar = this.f23679b[C4588x.m20678a(obj.hashCode()) & this.f23680c]; agVar != null; agVar = agVar.mo7520a()) {
            if (obj.equals(agVar.getKey())) {
                return agVar.getValue();
            }
        }
        return null;
    }

    public final int size() {
        return this.f23678a.length;
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        return new C8055a();
    }
}
