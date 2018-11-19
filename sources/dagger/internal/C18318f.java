package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Provider;

/* renamed from: dagger.internal.f */
public final class C18318f<K, V> implements Factory<Map<K, V>> {
    /* renamed from: a */
    private static final Provider<Map<Object, Object>> f56778a = C18317d.m66331a(Collections.emptyMap());
    /* renamed from: b */
    private final Map<K, Provider<V>> f56779b;

    /* renamed from: dagger.internal.f$a */
    public static final class C15517a<K, V> {
        /* renamed from: a */
        private final LinkedHashMap<K, Provider<V>> f47948a;

        private C15517a(int i) {
            this.f47948a = C15514a.m57991c(i);
        }

        /* renamed from: a */
        public C15517a<K, V> m57996a(K k, Provider<V> provider) {
            this.f47948a.put(C15521i.m58001a(k, "key"), C15521i.m58001a(provider, "provider"));
            return this;
        }

        /* renamed from: a */
        public C18318f<K, V> m57997a() {
            return new C18318f(this.f47948a);
        }
    }

    public /* synthetic */ Object get() {
        return m66333a();
    }

    /* renamed from: a */
    public static <K, V> C15517a<K, V> m66332a(int i) {
        return new C15517a(i);
    }

    private C18318f(Map<K, Provider<V>> map) {
        this.f56779b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<K, V> m66333a() {
        Map c = C15514a.m57991c(this.f56779b.size());
        for (Entry entry : this.f56779b.entrySet()) {
            c.put(entry.getKey(), ((Provider) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(c);
    }
}
