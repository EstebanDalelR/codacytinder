package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LikeMessage_Factory implements Factory<LikeMessage> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public LikeMessage_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public LikeMessage get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static LikeMessage provideInstance(Provider<MessageRepository> provider) {
        return new LikeMessage((MessageRepository) provider.get());
    }

    public static LikeMessage_Factory create(Provider<MessageRepository> provider) {
        return new LikeMessage_Factory(provider);
    }

    public static LikeMessage newLikeMessage(MessageRepository messageRepository) {
        return new LikeMessage(messageRepository);
    }
}
