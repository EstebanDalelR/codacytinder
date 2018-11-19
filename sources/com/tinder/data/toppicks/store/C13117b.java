package com.tinder.data.toppicks.store;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.toppicks.store.b */
public final class C13117b implements Factory<C8798a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f41743a;

    public /* synthetic */ Object get() {
        return m50988a();
    }

    public C13117b(Provider<SharedPreferences> provider) {
        this.f41743a = provider;
    }

    /* renamed from: a */
    public C8798a m50988a() {
        return C13117b.m50986a(this.f41743a);
    }

    /* renamed from: a */
    public static C8798a m50986a(Provider<SharedPreferences> provider) {
        return new C8798a((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C13117b m50987b(Provider<SharedPreferences> provider) {
        return new C13117b(provider);
    }
}
