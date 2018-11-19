package com.tinder.ads.module;

import com.tinder.ads.RecsAdSourceRegistrar;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recsads.C16470o;
import com.tinder.recsads.RecsAdsRegistrar;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideRecsAdRegistarFactory implements Factory<RecsAdsRegistrar> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<C16470o> recsAdLoaderRegistrarProvider;
    private final Provider<RecsAdSourceRegistrar> recsAdSourceRegistrarProvider;

    public RecsAdsModule_ProvideRecsAdRegistarFactory(Provider<AbTestUtility> provider, Provider<RecsAdSourceRegistrar> provider2, Provider<C16470o> provider3) {
        this.abTestUtilityProvider = provider;
        this.recsAdSourceRegistrarProvider = provider2;
        this.recsAdLoaderRegistrarProvider = provider3;
    }

    public RecsAdsRegistrar get() {
        return provideInstance(this.abTestUtilityProvider, this.recsAdSourceRegistrarProvider, this.recsAdLoaderRegistrarProvider);
    }

    public static RecsAdsRegistrar provideInstance(Provider<AbTestUtility> provider, Provider<RecsAdSourceRegistrar> provider2, Provider<C16470o> provider3) {
        return proxyProvideRecsAdRegistar((AbTestUtility) provider.get(), (RecsAdSourceRegistrar) provider2.get(), (C16470o) provider3.get());
    }

    public static RecsAdsModule_ProvideRecsAdRegistarFactory create(Provider<AbTestUtility> provider, Provider<RecsAdSourceRegistrar> provider2, Provider<C16470o> provider3) {
        return new RecsAdsModule_ProvideRecsAdRegistarFactory(provider, provider2, provider3);
    }

    public static RecsAdsRegistrar proxyProvideRecsAdRegistar(AbTestUtility abTestUtility, RecsAdSourceRegistrar recsAdSourceRegistrar, C16470o c16470o) {
        return (RecsAdsRegistrar) C15521i.a(RecsAdsModule.provideRecsAdRegistar(abTestUtility, recsAdSourceRegistrar, c16470o), "Cannot return null from a non-@Nullable @Provides method");
    }
}
