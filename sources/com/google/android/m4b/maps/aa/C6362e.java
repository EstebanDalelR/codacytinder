package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.ax.C6347d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.e */
abstract class C6362e<K, V> implements ay<K, V> {
    /* renamed from: a */
    private transient Set<K> f23689a;
    /* renamed from: b */
    private transient Map<K, Collection<V>> f23690b;

    /* renamed from: a */
    abstract Map<K, Collection<V>> mo6989a();

    C6362e() {
    }

    /* renamed from: f */
    public boolean mo4835f() {
        return mo6990b() == 0;
    }

    /* renamed from: a */
    public boolean mo4834a(K k, V v) {
        return mo6988a(k).add(v);
    }

    /* renamed from: c */
    public Set<K> mo6991c() {
        Set<K> set = this.f23689a;
        if (set != null) {
            return set;
        }
        set = mo7015g();
        this.f23689a = set;
        return set;
    }

    /* renamed from: g */
    Set<K> mo7015g() {
        return new C6347d(mo4836h());
    }

    /* renamed from: h */
    public Map<K, Collection<V>> mo4836h() {
        Map<K, Collection<V>> map = this.f23690b;
        if (map != null) {
            return map;
        }
        map = mo6989a();
        this.f23690b = map;
        return map;
    }

    public int hashCode() {
        return mo4836h().hashCode();
    }

    public String toString() {
        return mo4836h().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return null;
        }
        return mo4836h().equals(((ay) obj).mo4836h());
    }
}
