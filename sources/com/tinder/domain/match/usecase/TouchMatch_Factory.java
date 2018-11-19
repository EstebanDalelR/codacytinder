package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TouchMatch_Factory implements Factory<TouchMatch> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public TouchMatch_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public TouchMatch get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static TouchMatch provideInstance(Provider<MatchRepository> provider) {
        return new TouchMatch((MatchRepository) provider.get());
    }

    public static TouchMatch_Factory create(Provider<MatchRepository> provider) {
        return new TouchMatch_Factory(provider);
    }

    public static TouchMatch newTouchMatch(MatchRepository matchRepository) {
        return new TouchMatch(matchRepository);
    }
}
