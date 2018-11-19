package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.o */
public final class C18012o implements Factory<C16437n> {
    /* renamed from: a */
    private final Provider<RecsAdsConfig> f55950a;
    /* renamed from: b */
    private final Provider<C2630h> f55951b;

    public /* synthetic */ Object get() {
        return m65395a();
    }

    public C18012o(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        this.f55950a = provider;
        this.f55951b = provider2;
    }

    /* renamed from: a */
    public C16437n m65395a() {
        return C18012o.m65393a(this.f55950a, this.f55951b);
    }

    /* renamed from: a */
    public static C16437n m65393a(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        return new C16437n((RecsAdsConfig) provider.get(), (C2630h) provider2.get());
    }

    /* renamed from: b */
    public static C18012o m65394b(Provider<RecsAdsConfig> provider, Provider<C2630h> provider2) {
        return new C18012o(provider, provider2);
    }
}
