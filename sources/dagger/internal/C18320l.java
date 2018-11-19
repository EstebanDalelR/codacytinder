package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: dagger.internal.l */
public final class C18320l<T> implements Factory<Set<T>> {
    /* renamed from: a */
    private static final Factory<Set<Object>> f56781a = C18317d.m66331a(Collections.emptySet());
    /* renamed from: b */
    private final List<Provider<T>> f56782b;
    /* renamed from: c */
    private final List<Provider<Collection<T>>> f56783c;

    /* renamed from: dagger.internal.l$a */
    public static final class C15524a<T> {
        /* renamed from: a */
        static final /* synthetic */ boolean f47951a = true;
        /* renamed from: b */
        private final List<Provider<T>> f47952b;
        /* renamed from: c */
        private final List<Provider<Collection<T>>> f47953c;

        static {
            Class cls = C18320l.class;
        }

        private C15524a(int i, int i2) {
            this.f47952b = C15514a.m57988a(i);
            this.f47953c = C15514a.m57988a(i2);
        }

        /* renamed from: a */
        public C15524a<T> m58007a(Provider<? extends T> provider) {
            if (f47951a || provider != null) {
                this.f47952b.add(provider);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        /* renamed from: b */
        public C15524a<T> m58009b(Provider<? extends Collection<? extends T>> provider) {
            if (f47951a || provider != null) {
                this.f47953c.add(provider);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        /* renamed from: a */
        public C18320l<T> m58008a() {
            if (!f47951a && C15514a.m57989a(this.f47952b)) {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            } else if (f47951a || !C15514a.m57989a(this.f47953c)) {
                return new C18320l(this.f47952b, this.f47953c);
            } else {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            }
        }
    }

    public /* synthetic */ Object get() {
        return m66337a();
    }

    /* renamed from: a */
    public static <T> C15524a<T> m66336a(int i, int i2) {
        return new C15524a(i, i2);
    }

    private C18320l(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f56782b = list;
        this.f56783c = list2;
    }

    /* renamed from: a */
    public Set<T> m66337a() {
        int size = this.f56782b.size();
        List arrayList = new ArrayList(this.f56783c.size());
        int size2 = this.f56783c.size();
        int i = size;
        for (size = 0; size < size2; size++) {
            Collection collection = (Collection) ((Provider) this.f56783c.get(size)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        Set b = C15514a.m57990b(i);
        size2 = this.f56782b.size();
        for (i = 0; i < size2; i++) {
            b.add(C15521i.m58000a(((Provider) this.f56782b.get(i)).get()));
        }
        size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            for (Object a : (Collection) arrayList.get(i2)) {
                b.add(C15521i.m58000a(a));
            }
        }
        return Collections.unmodifiableSet(b);
    }
}
