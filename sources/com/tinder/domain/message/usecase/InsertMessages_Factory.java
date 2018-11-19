package com.tinder.domain.message.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class InsertMessages_Factory implements Factory<InsertMessages> {
    private final Provider<MatchRepository> matchRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<MetaGateway> metaGatewayProvider;

    public InsertMessages_Factory(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        this.messageRepositoryProvider = provider;
        this.matchRepositoryProvider = provider2;
        this.metaGatewayProvider = provider3;
    }

    public InsertMessages get() {
        return provideInstance(this.messageRepositoryProvider, this.matchRepositoryProvider, this.metaGatewayProvider);
    }

    public static InsertMessages provideInstance(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        return new InsertMessages((MessageRepository) provider.get(), (MatchRepository) provider2.get(), (MetaGateway) provider3.get());
    }

    public static InsertMessages_Factory create(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        return new InsertMessages_Factory(provider, provider2, provider3);
    }

    public static InsertMessages newInsertMessages(MessageRepository messageRepository, MatchRepository matchRepository, MetaGateway metaGateway) {
        return new InsertMessages(messageRepository, matchRepository, metaGateway);
    }
}
