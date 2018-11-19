package com.tinder.ads.module;

import com.tinder.activities.MainActivity;
import com.tinder.ads.source.dfp.BannerDfpSource.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideDfpSourceBuilderFactory implements Factory<Builder> {
    private final Provider<MainActivity> mainActivityProvider;

    public RecsAdsModule_ProvideDfpSourceBuilderFactory(Provider<MainActivity> provider) {
        this.mainActivityProvider = provider;
    }

    public Builder get() {
        return provideInstance(this.mainActivityProvider);
    }

    public static Builder provideInstance(Provider<MainActivity> provider) {
        return proxyProvideDfpSourceBuilder((MainActivity) provider.get());
    }

    public static RecsAdsModule_ProvideDfpSourceBuilderFactory create(Provider<MainActivity> provider) {
        return new RecsAdsModule_ProvideDfpSourceBuilderFactory(provider);
    }

    public static Builder proxyProvideDfpSourceBuilder(MainActivity mainActivity) {
        return (Builder) C15521i.a(RecsAdsModule.provideDfpSourceBuilder(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
