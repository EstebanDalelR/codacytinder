package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteAllMatches_Factory implements Factory<DeleteAllMatches> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public DeleteAllMatches_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public DeleteAllMatches get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static DeleteAllMatches provideInstance(Provider<MatchRepository> provider) {
        return new DeleteAllMatches((MatchRepository) provider.get());
    }

    public static DeleteAllMatches_Factory create(Provider<MatchRepository> provider) {
        return new DeleteAllMatches_Factory(provider);
    }

    public static DeleteAllMatches newDeleteAllMatches(MatchRepository matchRepository) {
        return new DeleteAllMatches(matchRepository);
    }
}
