package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetLastMessageSentDate_Factory implements Factory<GetLastMessageSentDate> {
    private final Provider<MessageRepository> messageRepositoryProvider;

    public GetLastMessageSentDate_Factory(Provider<MessageRepository> provider) {
        this.messageRepositoryProvider = provider;
    }

    public GetLastMessageSentDate get() {
        return provideInstance(this.messageRepositoryProvider);
    }

    public static GetLastMessageSentDate provideInstance(Provider<MessageRepository> provider) {
        return new GetLastMessageSentDate((MessageRepository) provider.get());
    }

    public static GetLastMessageSentDate_Factory create(Provider<MessageRepository> provider) {
        return new GetLastMessageSentDate_Factory(provider);
    }

    public static GetLastMessageSentDate newGetLastMessageSentDate(MessageRepository messageRepository) {
        return new GetLastMessageSentDate(messageRepository);
    }
}
