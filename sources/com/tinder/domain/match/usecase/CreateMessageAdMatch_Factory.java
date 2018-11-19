package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CreateMessageAdMatch_Factory implements Factory<CreateMessageAdMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<MetaGateway> metaGatewayProvider;

    public CreateMessageAdMatch_Factory(Provider<MatchRepository> provider, Provider<MessageRepository> provider2, Provider<MetaGateway> provider3) {
        this.matchRepositoryProvider = provider;
        this.messageRepositoryProvider = provider2;
        this.metaGatewayProvider = provider3;
    }

    public CreateMessageAdMatch get() {
        return provideInstance(this.matchRepositoryProvider, this.messageRepositoryProvider, this.metaGatewayProvider);
    }

    public static CreateMessageAdMatch provideInstance(Provider<MatchRepository> provider, Provider<MessageRepository> provider2, Provider<MetaGateway> provider3) {
        return new CreateMessageAdMatch((MatchRepository) provider.get(), (MessageRepository) provider2.get(), (MetaGateway) provider3.get());
    }

    public static CreateMessageAdMatch_Factory create(Provider<MatchRepository> provider, Provider<MessageRepository> provider2, Provider<MetaGateway> provider3) {
        return new CreateMessageAdMatch_Factory(provider, provider2, provider3);
    }

    public static CreateMessageAdMatch newCreateMessageAdMatch(MatchRepository matchRepository, MessageRepository messageRepository, MetaGateway metaGateway) {
        return new CreateMessageAdMatch(matchRepository, messageRepository, metaGateway);
    }
}
