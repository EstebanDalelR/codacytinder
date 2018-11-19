package dagger.android;

import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: dagger.android.c */
public final class C18315c<T> implements Factory<DispatchingAndroidInjector<T>> {
    /* renamed from: a */
    private final Provider<Map<Class<? extends T>, Provider<AndroidInjector$Factory<? extends T>>>> f56774a;

    public /* synthetic */ Object get() {
        return m66329a();
    }

    /* renamed from: a */
    public DispatchingAndroidInjector<T> m66329a() {
        return C18315c.m66328a(this.f56774a);
    }

    /* renamed from: a */
    public static <T> DispatchingAndroidInjector<T> m66328a(Provider<Map<Class<? extends T>, Provider<AndroidInjector$Factory<? extends T>>>> provider) {
        return new DispatchingAndroidInjector((Map) provider.get());
    }

    /* renamed from: a */
    public static <T> DispatchingAndroidInjector<T> m66327a(Map<Class<? extends T>, Provider<AndroidInjector$Factory<? extends T>>> map) {
        return new DispatchingAndroidInjector(map);
    }
}
