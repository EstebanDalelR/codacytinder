package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveMessages_Factory implements Factory<ObserveMessages> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public ObserveMessages_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public ObserveMessages get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static ObserveMessages provideInstance(Provider<MessageRepository> provider) {
        return new ObserveMessages((MessageRepository) provider.get());
    }

    public static ObserveMessages_Factory create(Provider<MessageRepository> provider) {
        return new ObserveMessages_Factory(provider);
    }

    public static ObserveMessages newObserveMessages(MessageRepository messageRepository) {
        return new ObserveMessages(messageRepository);
    }
}
