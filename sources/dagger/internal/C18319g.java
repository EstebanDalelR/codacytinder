package dagger.internal;

import dagger.Lazy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: dagger.internal.g */
public final class C18319g<K, V> implements Lazy<Map<K, Provider<V>>>, Factory<Map<K, Provider<V>>> {
    /* renamed from: a */
    private final Map<K, Provider<V>> f56780a;

    /* renamed from: dagger.internal.g$a */
    public static final class C15519a<K, V> {
        /* renamed from: a */
        private final LinkedHashMap<K, Provider<V>> f47949a;

        private C15519a(int i) {
            this.f47949a = C15514a.m57991c(i);
        }

        /* renamed from: a */
        public C15519a<K, V> m57998a(K k, Provider<V> provider) {
            this.f47949a.put(C15521i.m58001a(k, "key"), C15521i.m58001a(provider, "provider"));
            return this;
        }

        /* renamed from: a */
        public C18319g<K, V> m57999a() {
            return new C18319g(this.f47949a);
        }
    }

    public /* synthetic */ Object get() {
        return m66335a();
    }

    /* renamed from: a */
    public static <K, V> C15519a<K, V> m66334a(int i) {
        return new C15519a(i);
    }

    private C18319g(Map<K, Provider<V>> map) {
        this.f56780a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Map<K, Provider<V>> m66335a() {
        return this.f56780a;
    }
}
