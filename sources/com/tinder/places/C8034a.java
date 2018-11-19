package com.tinder.places;

import com.tinder.discovery.domain.C11144b;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.p238f.p239a.C9363a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a */
public final class C8034a implements Factory<PlacesMainActivityLifecycleObserver> {
    /* renamed from: a */
    private final Provider<C11144b> f28699a;
    /* renamed from: b */
    private final Provider<PlacesAvailableProvider> f28700b;
    /* renamed from: c */
    private final Provider<C9363a> f28701c;

    public /* synthetic */ Object get() {
        return m33965a();
    }

    public C8034a(Provider<C11144b> provider, Provider<PlacesAvailableProvider> provider2, Provider<C9363a> provider3) {
        this.f28699a = provider;
        this.f28700b = provider2;
        this.f28701c = provider3;
    }

    /* renamed from: a */
    public PlacesMainActivityLifecycleObserver m33965a() {
        return C8034a.m33963a(this.f28699a, this.f28700b, this.f28701c);
    }

    /* renamed from: a */
    public static PlacesMainActivityLifecycleObserver m33963a(Provider<C11144b> provider, Provider<PlacesAvailableProvider> provider2, Provider<C9363a> provider3) {
        return new PlacesMainActivityLifecycleObserver((C11144b) provider.get(), (PlacesAvailableProvider) provider2.get(), (C9363a) provider3.get());
    }

    /* renamed from: b */
    public static C8034a m33964b(Provider<C11144b> provider, Provider<PlacesAvailableProvider> provider2, Provider<C9363a> provider3) {
        return new C8034a(provider, provider2, provider3);
    }
}
