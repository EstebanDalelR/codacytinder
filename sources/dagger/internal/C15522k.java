package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dagger.internal.k */
public final class C15522k<T> {
    /* renamed from: a */
    private final List<T> f47950a;

    private C15522k(int i) {
        this.f47950a = new ArrayList(i);
    }

    /* renamed from: a */
    public static <T> C15522k<T> m58003a(int i) {
        return new C15522k(i);
    }

    /* renamed from: a */
    public C15522k<T> m58004a(T t) {
        this.f47950a.add(C15521i.m58001a(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: a */
    public C15522k<T> m58005a(Collection<? extends T> collection) {
        for (Object a : collection) {
            C15521i.m58001a(a, "Set contributions cannot be null");
        }
        this.f47950a.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public Set<T> m58006a() {
        switch (this.f47950a.size()) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(this.f47950a.get(0));
            default:
                return Collections.unmodifiableSet(new HashSet(this.f47950a));
        }
    }
}
