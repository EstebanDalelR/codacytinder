package com.tinder.api;

import com.tinder.domain.auth.UniqueIdFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class InstallIdHeaderInterceptor_Factory implements Factory<InstallIdHeaderInterceptor> {
    private final Provider<UniqueIdFactory> uniqueIdFactoryProvider;

    public InstallIdHeaderInterceptor_Factory(Provider<UniqueIdFactory> provider) {
        this.uniqueIdFactoryProvider = provider;
    }

    public InstallIdHeaderInterceptor get() {
        return provideInstance(this.uniqueIdFactoryProvider);
    }

    public static InstallIdHeaderInterceptor provideInstance(Provider<UniqueIdFactory> provider) {
        return new InstallIdHeaderInterceptor((UniqueIdFactory) provider.get());
    }

    public static InstallIdHeaderInterceptor_Factory create(Provider<UniqueIdFactory> provider) {
        return new InstallIdHeaderInterceptor_Factory(provider);
    }

    public static InstallIdHeaderInterceptor newInstallIdHeaderInterceptor(UniqueIdFactory uniqueIdFactory) {
        return new InstallIdHeaderInterceptor(uniqueIdFactory);
    }
}
