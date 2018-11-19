package com.tinder.data.profile;

import com.tinder.api.TinderUserApi;
import com.tinder.data.meta.p226a.C10844c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.f */
public final class C13078f implements Factory<C10935e> {
    /* renamed from: a */
    private final Provider<TinderUserApi> f41653a;
    /* renamed from: b */
    private final Provider<C10844c> f41654b;

    public /* synthetic */ Object get() {
        return m50896a();
    }

    public C13078f(Provider<TinderUserApi> provider, Provider<C10844c> provider2) {
        this.f41653a = provider;
        this.f41654b = provider2;
    }

    /* renamed from: a */
    public C10935e m50896a() {
        return C13078f.m50894a(this.f41653a, this.f41654b);
    }

    /* renamed from: a */
    public static C10935e m50894a(Provider<TinderUserApi> provider, Provider<C10844c> provider2) {
        return new C10935e((TinderUserApi) provider.get(), (C10844c) provider2.get());
    }

    /* renamed from: b */
    public static C13078f m50895b(Provider<TinderUserApi> provider, Provider<C10844c> provider2) {
        return new C13078f(provider, provider2);
    }
}
