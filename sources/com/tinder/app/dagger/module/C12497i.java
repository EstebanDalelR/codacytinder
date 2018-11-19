package com.tinder.app.dagger.module;

import com.tinder.activities.MainActivity;
import com.tinder.main.BackPressInterceptor;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.i */
public final class C12497i implements Factory<BackPressInterceptor> {
    /* renamed from: a */
    private final Provider<MainActivity> f40290a;

    public /* synthetic */ Object get() {
        return m49160a();
    }

    /* renamed from: a */
    public BackPressInterceptor m49160a() {
        return C12497i.m49159a(this.f40290a);
    }

    /* renamed from: a */
    public static BackPressInterceptor m49159a(Provider<MainActivity> provider) {
        return C12497i.m49158a((MainActivity) provider.get());
    }

    /* renamed from: a */
    public static BackPressInterceptor m49158a(MainActivity mainActivity) {
        return (BackPressInterceptor) C15521i.a(C8250h.m35197b(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
