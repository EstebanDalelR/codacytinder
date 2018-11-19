package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

final class ai<K, V> extends al<K> {
    /* renamed from: a */
    private final af<K, V> f27147a;

    /* renamed from: com.google.android.m4b.maps.aa.ai$a */
    static class C4543a<K> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private af<K, ?> f16864a;

        C4543a(af<K, ?> afVar) {
            this.f16864a = afVar;
        }

        final Object readResolve() {
            return this.f16864a.mo6998g();
        }
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return true;
    }

    ai(af<K, V> afVar) {
        this.f27147a = afVar;
    }

    public final int size() {
        return this.f27147a.size();
    }

    /* renamed from: a */
    public final bw<K> mo4785a() {
        return mo4786b().mo4785a();
    }

    public final boolean contains(Object obj) {
        return this.f27147a.containsKey(obj);
    }

    /* renamed from: c */
    final ae<K> mo4790c() {
        final ae b = this.f27147a.mo6997f().mo4786b();
        return new C7423y<K>(this) {
            /* renamed from: b */
            private /* synthetic */ ai f28834b;

            public final K get(int i) {
                return ((Entry) b.get(i)).getKey();
            }

            /* renamed from: h */
            final aa<K> mo7522h() {
                return this.f28834b;
            }
        };
    }

    final Object writeReplace() {
        return new C4543a(this.f27147a);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo4786b().mo4785a();
    }
}
