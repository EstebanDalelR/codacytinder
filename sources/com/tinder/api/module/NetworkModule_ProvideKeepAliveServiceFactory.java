package com.tinder.api.module;

import android.app.Application;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.api.retrofit.TinderAuthenticator;
import com.tinder.core.experiment.C8597m;
import com.tinder.scarlet.Lifecycle;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.Interceptor;

public final class NetworkModule_ProvideKeepAliveServiceFactory implements Factory<KeepAliveScarletApi> {
    private final Provider<Application> applicationProvider;
    private final Provider<EnvironmentProvider> environmentProvider;
    private final Provider<Set<Interceptor>> interceptorsProvider;
    private final Provider<Lifecycle> loggedInLifecycleProvider;
    private final NetworkModule module;
    private final Provider<C17692o> okHttpClientProvider;
    private final Provider<C8597m> persistentConnectionExperimentUtilityProvider;
    private final Provider<TinderAuthenticator> tinderAuthenticatorProvider;

    public NetworkModule_ProvideKeepAliveServiceFactory(NetworkModule networkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2, Provider<Set<Interceptor>> provider3, Provider<Lifecycle> provider4, Provider<C8597m> provider5, Provider<Application> provider6, Provider<EnvironmentProvider> provider7) {
        this.module = networkModule;
        this.okHttpClientProvider = provider;
        this.tinderAuthenticatorProvider = provider2;
        this.interceptorsProvider = provider3;
        this.loggedInLifecycleProvider = provider4;
        this.persistentConnectionExperimentUtilityProvider = provider5;
        this.applicationProvider = provider6;
        this.environmentProvider = provider7;
    }

    public KeepAliveScarletApi get() {
        return provideInstance(this.module, this.okHttpClientProvider, this.tinderAuthenticatorProvider, this.interceptorsProvider, this.loggedInLifecycleProvider, this.persistentConnectionExperimentUtilityProvider, this.applicationProvider, this.environmentProvider);
    }

    public static KeepAliveScarletApi provideInstance(NetworkModule networkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2, Provider<Set<Interceptor>> provider3, Provider<Lifecycle> provider4, Provider<C8597m> provider5, Provider<Application> provider6, Provider<EnvironmentProvider> provider7) {
        return proxyProvideKeepAliveService(networkModule, (C17692o) provider.get(), (TinderAuthenticator) provider2.get(), (Set) provider3.get(), (Lifecycle) provider4.get(), (C8597m) provider5.get(), (Application) provider6.get(), (EnvironmentProvider) provider7.get());
    }

    public static NetworkModule_ProvideKeepAliveServiceFactory create(NetworkModule networkModule, Provider<C17692o> provider, Provider<TinderAuthenticator> provider2, Provider<Set<Interceptor>> provider3, Provider<Lifecycle> provider4, Provider<C8597m> provider5, Provider<Application> provider6, Provider<EnvironmentProvider> provider7) {
        return new NetworkModule_ProvideKeepAliveServiceFactory(networkModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static KeepAliveScarletApi proxyProvideKeepAliveService(NetworkModule networkModule, C17692o c17692o, TinderAuthenticator tinderAuthenticator, Set<Interceptor> set, Lifecycle lifecycle, C8597m c8597m, Application application, EnvironmentProvider environmentProvider) {
        return (KeepAliveScarletApi) C15521i.a(networkModule.provideKeepAliveService(c17692o, tinderAuthenticator, set, lifecycle, c8597m, application, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
