package com.tinder.domain.message.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CleanUpPendingMessages_Factory implements Factory<CleanUpPendingMessages> {
    private final Provider<Logger> loggerProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;

    public CleanUpPendingMessages_Factory(Provider<MessageRepository> provider, Provider<Logger> provider2) {
        this.messageRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    public CleanUpPendingMessages get() {
        return provideInstance(this.messageRepositoryProvider, this.loggerProvider);
    }

    public static CleanUpPendingMessages provideInstance(Provider<MessageRepository> provider, Provider<Logger> provider2) {
        return new CleanUpPendingMessages((MessageRepository) provider.get(), (Logger) provider2.get());
    }

    public static CleanUpPendingMessages_Factory create(Provider<MessageRepository> provider, Provider<Logger> provider2) {
        return new CleanUpPendingMessages_Factory(provider, provider2);
    }

    public static CleanUpPendingMessages newCleanUpPendingMessages(MessageRepository messageRepository, Logger logger) {
        return new CleanUpPendingMessages(messageRepository, logger);
    }
}
