package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetMatch_Factory implements Factory<GetMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public GetMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public GetMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static GetMatch provideInstance(Provider<MatchRepository> provider) {
        return new GetMatch((MatchRepository) provider.get());
    }

    public static GetMatch_Factory create(Provider<MatchRepository> provider) {
        return new GetMatch_Factory(provider);
    }

    public static GetMatch newGetMatch(MatchRepository matchRepository) {
        return new GetMatch(matchRepository);
    }
}
