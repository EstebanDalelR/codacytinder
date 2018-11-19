package com.tinder.domain.pushnotifications.usecase;

import com.tinder.domain.pushnotifications.repository.PushTokenRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RegisterPushToken_Factory implements Factory<RegisterPushToken> {
    private final Provider<PushTokenRepository> tokenRepositoryProvider;

    public RegisterPushToken_Factory(Provider<PushTokenRepository> provider) {
        this.tokenRepositoryProvider = provider;
    }

    public RegisterPushToken get() {
        return provideInstance(this.tokenRepositoryProvider);
    }

    public static RegisterPushToken provideInstance(Provider<PushTokenRepository> provider) {
        return new RegisterPushToken((PushTokenRepository) provider.get());
    }

    public static RegisterPushToken_Factory create(Provider<PushTokenRepository> provider) {
        return new RegisterPushToken_Factory(provider);
    }

    public static RegisterPushToken newRegisterPushToken(PushTokenRepository pushTokenRepository) {
        return new RegisterPushToken(pushTokenRepository);
    }
}
