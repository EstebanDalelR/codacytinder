package com.tinder.domain.pushnotifications.usecase;

import com.tinder.domain.pushnotifications.repository.PushTokenRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UnregisterPushToken_Factory implements Factory<UnregisterPushToken> {
    private final Provider<PushTokenRepository> tokenRepositoryProvider;

    public UnregisterPushToken_Factory(Provider<PushTokenRepository> provider) {
        this.tokenRepositoryProvider = provider;
    }

    public UnregisterPushToken get() {
        return provideInstance(this.tokenRepositoryProvider);
    }

    public static UnregisterPushToken provideInstance(Provider<PushTokenRepository> provider) {
        return new UnregisterPushToken((PushTokenRepository) provider.get());
    }

    public static UnregisterPushToken_Factory create(Provider<PushTokenRepository> provider) {
        return new UnregisterPushToken_Factory(provider);
    }

    public static UnregisterPushToken newUnregisterPushToken(PushTokenRepository pushTokenRepository) {
        return new UnregisterPushToken(pushTokenRepository);
    }
}
