package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UnMatch_Factory implements Factory<UnMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public UnMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public UnMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static UnMatch provideInstance(Provider<MatchRepository> provider) {
        return new UnMatch((MatchRepository) provider.get());
    }

    public static UnMatch_Factory create(Provider<MatchRepository> provider) {
        return new UnMatch_Factory(provider);
    }

    public static UnMatch newUnMatch(MatchRepository matchRepository) {
        return new UnMatch(matchRepository);
    }
}
