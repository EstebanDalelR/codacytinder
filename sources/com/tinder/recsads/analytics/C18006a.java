package com.tinder.recsads.analytics;

import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.a */
public final class C18006a implements Factory<C14729c> {
    /* renamed from: a */
    private final Provider<RecsAdsConfig> f55938a;

    public /* synthetic */ Object get() {
        return m65374a();
    }

    public C18006a(Provider<RecsAdsConfig> provider) {
        this.f55938a = provider;
    }

    /* renamed from: a */
    public C14729c m65374a() {
        return C18006a.m65372a(this.f55938a);
    }

    /* renamed from: a */
    public static C14729c m65372a(Provider<RecsAdsConfig> provider) {
        return new C14729c((RecsAdsConfig) provider.get());
    }

    /* renamed from: b */
    public static C18006a m65373b(Provider<RecsAdsConfig> provider) {
        return new C18006a(provider);
    }
}
