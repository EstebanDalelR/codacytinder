package com.tinder.ads.module;

import com.tinder.activities.MainActivity;
import com.tinder.ads.source.fan.FanSource.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideFanSourceBuilderFactory implements Factory<Builder> {
    private final Provider<MainActivity> mainActivityProvider;

    public RecsAdsModule_ProvideFanSourceBuilderFactory(Provider<MainActivity> provider) {
        this.mainActivityProvider = provider;
    }

    public Builder get() {
        return provideInstance(this.mainActivityProvider);
    }

    public static Builder provideInstance(Provider<MainActivity> provider) {
        return proxyProvideFanSourceBuilder((MainActivity) provider.get());
    }

    public static RecsAdsModule_ProvideFanSourceBuilderFactory create(Provider<MainActivity> provider) {
        return new RecsAdsModule_ProvideFanSourceBuilderFactory(provider);
    }

    public static Builder proxyProvideFanSourceBuilder(MainActivity mainActivity) {
        return (Builder) C15521i.a(RecsAdsModule.provideFanSourceBuilder(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
