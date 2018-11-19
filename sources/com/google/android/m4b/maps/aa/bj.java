package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class bj<K, V> extends ao<K, V> {
    /* renamed from: a */
    private final transient bk<K> f28866a;
    /* renamed from: b */
    private final transient ae<V> f28867b;

    /* renamed from: com.google.android.m4b.maps.aa.bj$a */
    class C8058a extends ah<K, V> {
        /* renamed from: a */
        final /* synthetic */ bj f28865a;

        /* renamed from: com.google.android.m4b.maps.aa.bj$a$1 */
        class C80571 extends C7423y<Entry<K, V>> {
            /* renamed from: a */
            private final ae<K> f28863a = this.f28864b.f28865a.mo7534i().mo4786b();
            /* renamed from: b */
            private /* synthetic */ C8058a f28864b;

            C80571(C8058a c8058a) {
                this.f28864b = c8058a;
            }

            /* renamed from: h */
            final aa<Entry<K, V>> mo7522h() {
                return this.f28864b;
            }

            public final /* synthetic */ Object get(int i) {
                return ax.m20620a(this.f28863a.get(i), this.f28864b.f28865a.f28867b.get(i));
            }
        }

        private C8058a(bj bjVar) {
            this.f28865a = bjVar;
        }

        /* renamed from: a */
        public final bw<Entry<K, V>> mo4785a() {
            return mo4786b().mo4785a();
        }

        /* renamed from: c */
        final ae<Entry<K, V>> mo4790c() {
            return new C80571(this);
        }

        /* renamed from: e */
        final af<K, V> mo7518e() {
            return this.f28865a;
        }

        public final /* synthetic */ Iterator iterator() {
            return mo4786b().mo4785a();
        }
    }

    bj(bk<K> bkVar, ae<V> aeVar) {
        this.f28866a = bkVar;
        this.f28867b = aeVar;
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        return new C8058a();
    }

    /* renamed from: i */
    public final aq<K> mo7534i() {
        return this.f28866a;
    }

    /* renamed from: h */
    public final aa<V> mo4838h() {
        return this.f28867b;
    }

    public final V get(Object obj) {
        obj = this.f28866a.mo7629b(obj);
        if (obj == -1) {
            return null;
        }
        return this.f28867b.get(obj);
    }

    /* renamed from: a */
    private ao<K, V> m34183a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return ao.m31864a(comparator());
        }
        return ao.m31863a(this.f28866a.m34942a(i, i2), (ae) this.f28867b.mo6981a(i, i2));
    }

    /* renamed from: a */
    public final ao<K, V> mo7532a(K k, boolean z) {
        return m34183a((int) false, this.f28866a.m34948c(C5571j.m24292a((Object) k), z));
    }

    /* renamed from: b */
    public final ao<K, V> mo7533b(K k, boolean z) {
        return m34183a(this.f28866a.m34950d(C5571j.m24292a((Object) k), z), size());
    }

    public final /* synthetic */ Collection values() {
        return this.f28867b;
    }

    public final /* synthetic */ Set keySet() {
        return this.f28866a;
    }

    /* renamed from: g */
    public final /* synthetic */ al mo6998g() {
        return this.f28866a;
    }
}
