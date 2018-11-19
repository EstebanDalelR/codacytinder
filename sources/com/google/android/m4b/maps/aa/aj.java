package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

final class aj<K, V> extends aa<V> {
    /* renamed from: a */
    private final af<K, V> f23631a;

    /* renamed from: com.google.android.m4b.maps.aa.aj$a */
    static class C4544a<V> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private af<?, V> f16865a;

        C4544a(af<?, V> afVar) {
            this.f16865a = afVar;
        }

        final Object readResolve() {
            return this.f16865a.mo4838h();
        }
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    aj(af<K, V> afVar) {
        this.f23631a = afVar;
    }

    public final int size() {
        return this.f23631a.size();
    }

    /* renamed from: a */
    public final bw<V> mo4785a() {
        return ax.m20614a(this.f23631a.mo6997f().mo4785a());
    }

    public final boolean contains(Object obj) {
        return (obj == null || at.m20513a(mo4785a(), obj) == null) ? null : true;
    }

    /* renamed from: c */
    final ae<V> mo4790c() {
        final ae b = this.f23631a.mo6997f().mo4786b();
        return new C7423y<V>(this) {
            /* renamed from: b */
            private /* synthetic */ aj f28836b;

            public final V get(int i) {
                return ((Entry) b.get(i)).getValue();
            }

            /* renamed from: h */
            final aa<V> mo7522h() {
                return this.f28836b;
            }
        };
    }

    final Object writeReplace() {
        return new C4544a(this.f23631a);
    }
}
