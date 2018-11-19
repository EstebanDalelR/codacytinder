package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteMatch_Factory implements Factory<DeleteMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public DeleteMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public DeleteMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static DeleteMatch provideInstance(Provider<MatchRepository> provider) {
        return new DeleteMatch((MatchRepository) provider.get());
    }

    public static DeleteMatch_Factory create(Provider<MatchRepository> provider) {
        return new DeleteMatch_Factory(provider);
    }

    public static DeleteMatch newDeleteMatch(MatchRepository matchRepository) {
        return new DeleteMatch(matchRepository);
    }
}
