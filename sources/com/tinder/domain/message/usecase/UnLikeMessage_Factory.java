package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UnLikeMessage_Factory implements Factory<UnLikeMessage> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public UnLikeMessage_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public UnLikeMessage get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static UnLikeMessage provideInstance(Provider<MessageRepository> provider) {
        return new UnLikeMessage((MessageRepository) provider.get());
    }

    public static UnLikeMessage_Factory create(Provider<MessageRepository> provider) {
        return new UnLikeMessage_Factory(provider);
    }

    public static UnLikeMessage newUnLikeMessage(MessageRepository messageRepository) {
        return new UnLikeMessage(messageRepository);
    }
}
