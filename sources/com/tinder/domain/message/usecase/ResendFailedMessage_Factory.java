package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ResendFailedMessage_Factory implements Factory<ResendFailedMessage> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public ResendFailedMessage_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public ResendFailedMessage get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static ResendFailedMessage provideInstance(Provider<MessageRepository> provider) {
        return new ResendFailedMessage((MessageRepository) provider.get());
    }

    public static ResendFailedMessage_Factory create(Provider<MessageRepository> provider) {
        return new ResendFailedMessage_Factory(provider);
    }

    public static ResendFailedMessage newResendFailedMessage(MessageRepository messageRepository) {
        return new ResendFailedMessage(messageRepository);
    }
}
