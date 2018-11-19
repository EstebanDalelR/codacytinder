package com.tinder.ads.module;

import com.tinder.activities.MainActivity;
import com.tinder.ads.NativeDfpSourceBuilderFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory implements Factory<NativeDfpSourceBuilderFactory> {
    private final Provider<MainActivity> mainActivityProvider;

    public RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory(Provider<MainActivity> provider) {
        this.mainActivityProvider = provider;
    }

    public NativeDfpSourceBuilderFactory get() {
        return provideInstance(this.mainActivityProvider);
    }

    public static NativeDfpSourceBuilderFactory provideInstance(Provider<MainActivity> provider) {
        return proxyProvideNativeDfpSourceBuilderFactory((MainActivity) provider.get());
    }

    public static RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory create(Provider<MainActivity> provider) {
        return new RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory(provider);
    }

    public static NativeDfpSourceBuilderFactory proxyProvideNativeDfpSourceBuilderFactory(MainActivity mainActivity) {
        return (NativeDfpSourceBuilderFactory) C15521i.a(RecsAdsModule.provideNativeDfpSourceBuilderFactory(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
