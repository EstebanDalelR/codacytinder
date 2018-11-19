package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteFailedMessage_Factory implements Factory<DeleteFailedMessage> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public DeleteFailedMessage_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public DeleteFailedMessage get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static DeleteFailedMessage provideInstance(Provider<MessageRepository> provider) {
        return new DeleteFailedMessage((MessageRepository) provider.get());
    }

    public static DeleteFailedMessage_Factory create(Provider<MessageRepository> provider) {
        return new DeleteFailedMessage_Factory(provider);
    }

    public static DeleteFailedMessage newDeleteFailedMessage(MessageRepository messageRepository) {
        return new DeleteFailedMessage(messageRepository);
    }
}
