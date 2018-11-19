package com.tinder.api.module;

import com.tinder.api.TinderAuthenticator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.api.module.LegacyNetworkModule_ProvideReauthAuthenticatorOkHttpClientFactory */
public final class C12449x9ee21d96 implements Factory<C17692o> {
    private final Provider<TinderAuthenticator> authenticatorProvider;
    private final Provider<C17692o> clientProvider;
    private final LegacyNetworkModule module;

    public C12449x9ee21d96(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2) {
        this.module = legacyNetworkModule;
        this.clientProvider = provider;
        this.authenticatorProvider = provider2;
    }

    public C17692o get() {
        return C12449x9ee21d96.provideInstance(this.module, this.clientProvider, this.authenticatorProvider);
    }

    public static C17692o provideInstance(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2) {
        return C12449x9ee21d96.proxyProvideReauthAuthenticatorOkHttpClient(legacyNetworkModule, (C17692o) provider.get(), (TinderAuthenticator) provider2.get());
    }

    public static C12449x9ee21d96 create(LegacyNetworkModule legacyNetworkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2) {
        return new C12449x9ee21d96(legacyNetworkModule, provider, provider2);
    }

    public static C17692o proxyProvideReauthAuthenticatorOkHttpClient(LegacyNetworkModule legacyNetworkModule, C17692o c17692o, TinderAuthenticator tinderAuthenticator) {
        return (C17692o) C15521i.a(legacyNetworkModule.provideReauthAuthenticatorOkHttpClient(c17692o, tinderAuthenticator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
