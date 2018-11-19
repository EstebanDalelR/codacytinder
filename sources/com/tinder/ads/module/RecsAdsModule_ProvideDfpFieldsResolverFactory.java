package com.tinder.ads.module;

import com.tinder.ads.DfpFieldsResolverImpl;
import com.tinder.recsads.DfpFieldsResolver;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideDfpFieldsResolverFactory implements Factory<DfpFieldsResolver> {
    private final Provider<DfpFieldsResolverImpl> dfpFieldsResolverProvider;

    public RecsAdsModule_ProvideDfpFieldsResolverFactory(Provider<DfpFieldsResolverImpl> provider) {
        this.dfpFieldsResolverProvider = provider;
    }

    public DfpFieldsResolver get() {
        return provideInstance(this.dfpFieldsResolverProvider);
    }

    public static DfpFieldsResolver provideInstance(Provider<DfpFieldsResolverImpl> provider) {
        return proxyProvideDfpFieldsResolver((DfpFieldsResolverImpl) provider.get());
    }

    public static RecsAdsModule_ProvideDfpFieldsResolverFactory create(Provider<DfpFieldsResolverImpl> provider) {
        return new RecsAdsModule_ProvideDfpFieldsResolverFactory(provider);
    }

    public static DfpFieldsResolver proxyProvideDfpFieldsResolver(DfpFieldsResolverImpl dfpFieldsResolverImpl) {
        return (DfpFieldsResolver) C15521i.a(RecsAdsModule.provideDfpFieldsResolver(dfpFieldsResolverImpl), "Cannot return null from a non-@Nullable @Provides method");
    }
}
