package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.InstagramRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ConnectInstagram_Factory implements Factory<ConnectInstagram> {
    private final Provider<InstagramRepository> repositoryProvider;

    public ConnectInstagram_Factory(Provider<InstagramRepository> provider) {
        this.repositoryProvider = provider;
    }

    public ConnectInstagram get() {
        return provideInstance(this.repositoryProvider);
    }

    public static ConnectInstagram provideInstance(Provider<InstagramRepository> provider) {
        return new ConnectInstagram((InstagramRepository) provider.get());
    }

    public static ConnectInstagram_Factory create(Provider<InstagramRepository> provider) {
        return new ConnectInstagram_Factory(provider);
    }

    public static ConnectInstagram newConnectInstagram(InstagramRepository instagramRepository) {
        return new ConnectInstagram(instagramRepository);
    }
}
