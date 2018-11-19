package dagger.android;

import dagger.BindsInstance;

public abstract class AndroidInjector$a<T> implements AndroidInjector$Factory<T> {
    @BindsInstance
    /* renamed from: a */
    public abstract void mo13976a(T t);

    /* renamed from: b */
    public abstract AndroidInjector<T> mo13977b();

    public final AndroidInjector<T> create(T t) {
        mo13976a(t);
        return mo13977b();
    }
}
