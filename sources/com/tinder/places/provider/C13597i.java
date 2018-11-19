package com.tinder.places.provider;

import com.tinder.core.experiment.C8598o;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.places.analytics.C10113b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.provider.i */
public final class C13597i implements Factory<C12421h> {
    /* renamed from: a */
    private final Provider<C10275k> f43342a;
    /* renamed from: b */
    private final Provider<PlacesAvailableProvider> f43343b;
    /* renamed from: c */
    private final Provider<PlacesEnabledProvider> f43344c;
    /* renamed from: d */
    private final Provider<C8598o> f43345d;
    /* renamed from: e */
    private final Provider<C10113b> f43346e;

    public /* synthetic */ Object get() {
        return m53055a();
    }

    public C13597i(Provider<C10275k> provider, Provider<PlacesAvailableProvider> provider2, Provider<PlacesEnabledProvider> provider3, Provider<C8598o> provider4, Provider<C10113b> provider5) {
        this.f43342a = provider;
        this.f43343b = provider2;
        this.f43344c = provider3;
        this.f43345d = provider4;
        this.f43346e = provider5;
    }

    /* renamed from: a */
    public C12421h m53055a() {
        return C13597i.m53053a(this.f43342a, this.f43343b, this.f43344c, this.f43345d, this.f43346e);
    }

    /* renamed from: a */
    public static C12421h m53053a(Provider<C10275k> provider, Provider<PlacesAvailableProvider> provider2, Provider<PlacesEnabledProvider> provider3, Provider<C8598o> provider4, Provider<C10113b> provider5) {
        return new C12421h((C10275k) provider.get(), (PlacesAvailableProvider) provider2.get(), (PlacesEnabledProvider) provider3.get(), (C8598o) provider4.get(), (C10113b) provider5.get());
    }

    /* renamed from: b */
    public static C13597i m53054b(Provider<C10275k> provider, Provider<PlacesAvailableProvider> provider2, Provider<PlacesEnabledProvider> provider3, Provider<C8598o> provider4, Provider<C10113b> provider5) {
        return new C13597i(provider, provider2, provider3, provider4, provider5);
    }
}
