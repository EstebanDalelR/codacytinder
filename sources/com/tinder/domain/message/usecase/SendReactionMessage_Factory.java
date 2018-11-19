package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SendReactionMessage_Factory implements Factory<SendReactionMessage> {
    private final Provider<CommonMessagePropertiesAggregator> commonMessagePropertiesAggregatorProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;

    public SendReactionMessage_Factory(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        this.commonMessagePropertiesAggregatorProvider = provider;
        this.messageRepositoryProvider = provider2;
    }

    public SendReactionMessage get() {
        return provideInstance(this.commonMessagePropertiesAggregatorProvider, this.messageRepositoryProvider);
    }

    public static SendReactionMessage provideInstance(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendReactionMessage((CommonMessagePropertiesAggregator) provider.get(), (MessageRepository) provider2.get());
    }

    public static SendReactionMessage_Factory create(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2) {
        return new SendReactionMessage_Factory(provider, provider2);
    }

    public static SendReactionMessage newSendReactionMessage(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, MessageRepository messageRepository) {
        return new SendReactionMessage(commonMessagePropertiesAggregator, messageRepository);
    }
}
