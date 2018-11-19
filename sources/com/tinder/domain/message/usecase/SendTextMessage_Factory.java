package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SendTextMessage_Factory implements Factory<SendTextMessage> {
    private final Provider<CommonMessagePropertiesAggregator> commonMessagePropertiesAggregatorProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;

    public SendTextMessage_Factory(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        this.commonMessagePropertiesAggregatorProvider = provider;
        this.messageRepositoryProvider = provider2;
    }

    public SendTextMessage get() {
        return provideInstance(this.commonMessagePropertiesAggregatorProvider, this.messageRepositoryProvider);
    }

    public static SendTextMessage provideInstance(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendTextMessage((CommonMessagePropertiesAggregator) provider.get(), (MessageRepository) provider2.get());
    }

    public static SendTextMessage_Factory create(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendTextMessage_Factory(provider, provider2);
    }

    public static SendTextMessage newSendTextMessage(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, MessageRepository messageRepository) {
        return new SendTextMessage(commonMessagePropertiesAggregator, messageRepository);
    }
}
