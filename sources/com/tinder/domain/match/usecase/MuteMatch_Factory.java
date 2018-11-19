package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MuteMatch_Factory implements Factory<MuteMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public MuteMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public MuteMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static MuteMatch provideInstance(Provider<MatchRepository> provider) {
        return new MuteMatch((MatchRepository) provider.get());
    }

    public static MuteMatch_Factory create(Provider<MatchRepository> provider) {
        return new MuteMatch_Factory(provider);
    }

    public static MuteMatch newMuteMatch(MatchRepository matchRepository) {
        return new MuteMatch(matchRepository);
    }
}
