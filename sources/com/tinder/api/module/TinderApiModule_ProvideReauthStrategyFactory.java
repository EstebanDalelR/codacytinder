package com.tinder.api.module;

import com.tinder.api.ReauthStrategy;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.common.repository.C10698c;
import com.tinder.managers.C2652a;
import com.tinder.model.auth.network.AuthRequestFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TinderApiModule_ProvideReauthStrategyFactory implements Factory<ReauthStrategy> {
    private final Provider<C10333h> analyticsInteractorProvider;
    private final Provider<C8279j> authInteractorProvider;
    private final Provider<AuthRequestFactory> authRequestFactoryProvider;
    private final Provider<C2652a> authenticationManagerProvider;
    private final TinderApiModule module;
    private final Provider<C10698c> tokenRepositoryProvider;

    public TinderApiModule_ProvideReauthStrategyFactory(TinderApiModule tinderApiModule, Provider<C8279j> provider, Provider<C10698c> provider2, Provider<C10333h> provider3, Provider<AuthRequestFactory> provider4, Provider<C2652a> provider5) {
        this.module = tinderApiModule;
        this.authInteractorProvider = provider;
        this.tokenRepositoryProvider = provider2;
        this.analyticsInteractorProvider = provider3;
        this.authRequestFactoryProvider = provider4;
        this.authenticationManagerProvider = provider5;
    }

    public ReauthStrategy get() {
        return provideInstance(this.module, this.authInteractorProvider, this.tokenRepositoryProvider, this.analyticsInteractorProvider, this.authRequestFactoryProvider, this.authenticationManagerProvider);
    }

    public static ReauthStrategy provideInstance(TinderApiModule tinderApiModule, Provider<C8279j> provider, Provider<C10698c> provider2, Provider<C10333h> provider3, Provider<AuthRequestFactory> provider4, Provider<C2652a> provider5) {
        return proxyProvideReauthStrategy(tinderApiModule, (C8279j) provider.get(), (C10698c) provider2.get(), (C10333h) provider3.get(), (AuthRequestFactory) provider4.get(), (C2652a) provider5.get());
    }

    public static TinderApiModule_ProvideReauthStrategyFactory create(TinderApiModule tinderApiModule, Provider<C8279j> provider, Provider<C10698c> provider2, Provider<C10333h> provider3, Provider<AuthRequestFactory> provider4, Provider<C2652a> provider5) {
        return new TinderApiModule_ProvideReauthStrategyFactory(tinderApiModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ReauthStrategy proxyProvideReauthStrategy(TinderApiModule tinderApiModule, C8279j c8279j, C10698c c10698c, C10333h c10333h, AuthRequestFactory authRequestFactory, C2652a c2652a) {
        return (ReauthStrategy) C15521i.a(tinderApiModule.provideReauthStrategy(c8279j, c10698c, c10333h, authRequestFactory, c2652a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
