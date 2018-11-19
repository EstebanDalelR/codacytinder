package com.tinder.ads.analytics;

import com.tinder.recsads.model.RecsAdsConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AdEventFields_Factory_Factory implements Factory<AdEventFields.Factory> {
    private final Provider<RecsAdsConfig> recsAdsConfigProvider;

    public AdEventFields_Factory_Factory(Provider<RecsAdsConfig> provider) {
        this.recsAdsConfigProvider = provider;
    }

    public AdEventFields.Factory get() {
        return provideInstance(this.recsAdsConfigProvider);
    }

    public static AdEventFields.Factory provideInstance(Provider<RecsAdsConfig> provider) {
        return new AdEventFields.Factory((RecsAdsConfig) provider.get());
    }

    public static AdEventFields_Factory_Factory create(Provider<RecsAdsConfig> provider) {
        return new AdEventFields_Factory_Factory(provider);
    }

    public static AdEventFields.Factory newFactory(RecsAdsConfig recsAdsConfig) {
        return new AdEventFields.Factory(recsAdsConfig);
    }
}
