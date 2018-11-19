package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: dagger.internal.e */
public final class C15515e<K, V> {
    /* renamed from: a */
    private final Map<K, V> f47947a;

    private C15515e(int i) {
        this.f47947a = C15514a.m57991c(i);
    }

    /* renamed from: a */
    public static <K, V> C15515e<K, V> m57993a(int i) {
        return new C15515e(i);
    }

    /* renamed from: a */
    public C15515e<K, V> m57994a(K k, V v) {
        this.f47947a.put(k, v);
        return this;
    }

    /* renamed from: a */
    public Map<K, V> m57995a() {
        if (this.f47947a.size() != 0) {
            return Collections.unmodifiableMap(this.f47947a);
        }
        return Collections.emptyMap();
    }
}
