package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class InsertMatches_Factory implements Factory<InsertMatches> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public InsertMatches_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public InsertMatches get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static InsertMatches provideInstance(Provider<MatchRepository> provider) {
        return new InsertMatches((MatchRepository) provider.get());
    }

    public static InsertMatches_Factory create(Provider<MatchRepository> provider) {
        return new InsertMatches_Factory(provider);
    }

    public static InsertMatches newInsertMatches(MatchRepository matchRepository) {
        return new InsertMatches(matchRepository);
    }
}
