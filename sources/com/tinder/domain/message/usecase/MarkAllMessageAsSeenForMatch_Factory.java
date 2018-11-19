package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MarkAllMessageAsSeenForMatch_Factory implements Factory<MarkAllMessageAsSeenForMatch> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public MarkAllMessageAsSeenForMatch_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public MarkAllMessageAsSeenForMatch get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static MarkAllMessageAsSeenForMatch provideInstance(Provider<MessageRepository> provider) {
        return new MarkAllMessageAsSeenForMatch((MessageRepository) provider.get());
    }

    public static MarkAllMessageAsSeenForMatch_Factory create(Provider<MessageRepository> provider) {
        return new MarkAllMessageAsSeenForMatch_Factory(provider);
    }

    public static MarkAllMessageAsSeenForMatch newMarkAllMessageAsSeenForMatch(MessageRepository messageRepository) {
        return new MarkAllMessageAsSeenForMatch(messageRepository);
    }
}
