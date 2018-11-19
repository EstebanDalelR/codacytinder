package dagger.internal;

import javax.inject.Provider;

/* renamed from: dagger.internal.b */
public final class C18316b<T> implements Factory<T> {
    /* renamed from: a */
    private Provider<T> f56775a;

    public T get() {
        if (this.f56775a != null) {
            return this.f56775a.get();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void m66330a(Provider<T> provider) {
        if (provider == null) {
            throw new IllegalArgumentException();
        } else if (this.f56775a != null) {
            throw new IllegalStateException();
        } else {
            this.f56775a = provider;
        }
    }
}
