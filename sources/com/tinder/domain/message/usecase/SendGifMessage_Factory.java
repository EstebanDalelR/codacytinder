package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SendGifMessage_Factory implements Factory<SendGifMessage> {
    private final Provider<CommonMessagePropertiesAggregator> commonMessagePropertiesAggregatorProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;

    public SendGifMessage_Factory(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        this.commonMessagePropertiesAggregatorProvider = provider;
        this.messageRepositoryProvider = provider2;
    }

    public SendGifMessage get() {
        return provideInstance(this.commonMessagePropertiesAggregatorProvider, this.messageRepositoryProvider);
    }

    public static SendGifMessage provideInstance(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendGifMessage((CommonMessagePropertiesAggregator) provider.get(), (MessageRepository) provider2.get());
    }

    public static SendGifMessage_Factory create(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendGifMessage_Factory(provider, provider2);
    }

    public static SendGifMessage newSendGifMessage(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, MessageRepository messageRepository) {
        return new SendGifMessage(commonMessagePropertiesAggregator, messageRepository);
    }
}
