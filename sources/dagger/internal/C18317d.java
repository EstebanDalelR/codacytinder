package dagger.internal;

import dagger.Lazy;

/* renamed from: dagger.internal.d */
public final class C18317d<T> implements Lazy<T>, Factory<T> {
    /* renamed from: a */
    private static final C18317d<Object> f56776a = new C18317d(null);
    /* renamed from: b */
    private final T f56777b;

    /* renamed from: a */
    public static <T> Factory<T> m66331a(T t) {
        return new C18317d(C15521i.m58001a(t, "instance cannot be null"));
    }

    private C18317d(T t) {
        this.f56777b = t;
    }

    public T get() {
        return this.f56777b;
    }
}
