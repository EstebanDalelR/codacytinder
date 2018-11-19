package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetMatchByUserId_Factory implements Factory<GetMatchByUserId> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public GetMatchByUserId_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public GetMatchByUserId get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static GetMatchByUserId provideInstance(Provider<MatchRepository> provider) {
        return new GetMatchByUserId((MatchRepository) provider.get());
    }

    public static GetMatchByUserId_Factory create(Provider<MatchRepository> provider) {
        return new GetMatchByUserId_Factory(provider);
    }

    public static GetMatchByUserId newGetMatchByUserId(MatchRepository matchRepository) {
        return new GetMatchByUserId(matchRepository);
    }
}
