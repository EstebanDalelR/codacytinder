package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SendImageMessage_Factory implements Factory<SendImageMessage> {
    private final Provider<CommonMessagePropertiesAggregator> commonMessagePropertiesAggregatorProvider;
    private final Provider<LoadProfileOptionData> loadProfileUserProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;

    public SendImageMessage_Factory(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2, Provider<LoadProfileOptionData> provider3) {
        this.commonMessagePropertiesAggregatorProvider = provider;
        this.messageRepositoryProvider = provider2;
        this.loadProfileUserProvider = provider3;
    }

    public SendImageMessage get() {
        return provideInstance(this.commonMessagePropertiesAggregatorProvider, this.messageRepositoryProvider, this.loadProfileUserProvider);
    }

    public static SendImageMessage provideInstance(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2, Provider<LoadProfileOptionData> provider3) {
        return new SendImageMessage((CommonMessagePropertiesAggregator) provider.get(), (MessageRepository) provider2.get(), (LoadProfileOptionData) provider3.get());
    }

    public static SendImageMessage_Factory create(Provider<CommonMessagePropertiesAggregator> provider, Provider<MessageRepository> provider2, Provider<LoadProfileOptionData> provider3) {
        return new SendImageMessage_Factory(provider, provider2, provider3);
    }

    public static SendImageMessage newSendImageMessage(CommonMessagePropertiesAggregator commonMessagePropertiesAggregator, MessageRepository messageRepository, LoadProfileOptionData loadProfileOptionData) {
        return new SendImageMessage(commonMessagePropertiesAggregator, messageRepository, loadProfileOptionData);
    }
}
