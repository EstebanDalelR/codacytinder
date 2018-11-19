package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.InstagramRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DisconnectInstagram_Factory implements Factory<DisconnectInstagram> {
    private final Provider<InstagramRepository> repositoryProvider;

    public DisconnectInstagram_Factory(Provider<InstagramRepository> provider) {
        this.repositoryProvider = provider;
    }

    public DisconnectInstagram get() {
        return provideInstance(this.repositoryProvider);
    }

    public static DisconnectInstagram provideInstance(Provider<InstagramRepository> provider) {
        return new DisconnectInstagram((InstagramRepository) provider.get());
    }

    public static DisconnectInstagram_Factory create(Provider<InstagramRepository> provider) {
        return new DisconnectInstagram_Factory(provider);
    }

    public static DisconnectInstagram newDisconnectInstagram(InstagramRepository instagramRepository) {
        return new DisconnectInstagram(instagramRepository);
    }
}
