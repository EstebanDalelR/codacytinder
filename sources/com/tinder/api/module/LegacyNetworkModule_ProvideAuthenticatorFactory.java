package com.tinder.api.module;

import com.tinder.api.TinderAuthenticator;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.common.repository.C10698c;
import com.tinder.model.auth.network.AuthRequestFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class LegacyNetworkModule_ProvideAuthenticatorFactory implements Factory<TinderAuthenticator> {
    private final Provider<C10333h> analyticsInteractorProvider;
    private final Provider<C8279j> authInteractorProvider;
    private final Provider<AuthRequestFactory> authRequestFactoryProvider;
    private final Provider<C2664c> busProvider;
    private final LegacyNetworkModule module;
    private final Provider<C10698c> tokenRepositoryProvider;

    public LegacyNetworkModule_ProvideAuthenticatorFactory(LegacyNetworkModule legacyNetworkModule, Provider<C2664c> provider, Provider<C8279j> provider2, Provider<C10698c> provider3, Provider<C10333h> provider4, Provider<AuthRequestFactory> provider5) {
        this.module = legacyNetworkModule;
        this.busProvider = provider;
        this.authInteractorProvider = provider2;
        this.tokenRepositoryProvider = provider3;
        this.analyticsInteractorProvider = provider4;
        this.authRequestFactoryProvider = provider5;
    }

    public TinderAuthenticator get() {
        return provideInstance(this.module, this.busProvider, this.authInteractorProvider, this.tokenRepositoryProvider, this.analyticsInteractorProvider, this.authRequestFactoryProvider);
    }

    public static TinderAuthenticator provideInstance(LegacyNetworkModule legacyNetworkModule, Provider<C2664c> provider, Provider<C8279j> provider2, Provider<C10698c> provider3, Provider<C10333h> provider4, Provider<AuthRequestFactory> provider5) {
        return proxyProvideAuthenticator(legacyNetworkModule, (C2664c) provider.get(), (C8279j) provider2.get(), (C10698c) provider3.get(), (C10333h) provider4.get(), (AuthRequestFactory) provider5.get());
    }

    public static LegacyNetworkModule_ProvideAuthenticatorFactory create(LegacyNetworkModule legacyNetworkModule, Provider<C2664c> provider, Provider<C8279j> provider2, Provider<C10698c> provider3, Provider<C10333h> provider4, Provider<AuthRequestFactory> provider5) {
        return new LegacyNetworkModule_ProvideAuthenticatorFactory(legacyNetworkModule, provider, provider2, provider3, provider4, provider5);
    }

    public static TinderAuthenticator proxyProvideAuthenticator(LegacyNetworkModule legacyNetworkModule, C2664c c2664c, C8279j c8279j, C10698c c10698c, C10333h c10333h, AuthRequestFactory authRequestFactory) {
        return (TinderAuthenticator) C15521i.a(legacyNetworkModule.provideAuthenticator(c2664c, c8279j, c10698c, c10333h, authRequestFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
