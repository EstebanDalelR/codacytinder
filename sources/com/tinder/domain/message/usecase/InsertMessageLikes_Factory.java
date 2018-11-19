package com.tinder.domain.message.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class InsertMessageLikes_Factory implements Factory<InsertMessageLikes> {
    private final Provider<MatchRepository> matchRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<MetaGateway> userGatewayProvider;

    public InsertMessageLikes_Factory(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        this.messageRepositoryProvider = provider;
        this.matchRepositoryProvider = provider2;
        this.userGatewayProvider = provider3;
    }

    public InsertMessageLikes get() {
        return provideInstance(this.messageRepositoryProvider, this.matchRepositoryProvider, this.userGatewayProvider);
    }

    public static InsertMessageLikes provideInstance(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        return new InsertMessageLikes((MessageRepository) provider.get(), (MatchRepository) provider2.get(), (MetaGateway) provider3.get());
    }

    public static InsertMessageLikes_Factory create(Provider<MessageRepository> provider, Provider<MatchRepository> provider2, Provider<MetaGateway> provider3) {
        return new InsertMessageLikes_Factory(provider, provider2, provider3);
    }

    public static InsertMessageLikes newInsertMessageLikes(MessageRepository messageRepository, MatchRepository matchRepository, MetaGateway metaGateway) {
        return new InsertMessageLikes(messageRepository, matchRepository, metaGateway);
    }
}
