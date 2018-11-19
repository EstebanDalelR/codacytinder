package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UnMuteMatch_Factory implements Factory<UnMuteMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public UnMuteMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public UnMuteMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static UnMuteMatch provideInstance(Provider<MatchRepository> provider) {
        return new UnMuteMatch((MatchRepository) provider.get());
    }

    public static UnMuteMatch_Factory create(Provider<MatchRepository> provider) {
        return new UnMuteMatch_Factory(provider);
    }

    public static UnMuteMatch newUnMuteMatch(MatchRepository matchRepository) {
        return new UnMuteMatch(matchRepository);
    }
}
