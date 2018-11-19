package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveHasUntouchedMatches_Factory implements Factory<ObserveHasUntouchedMatches> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public ObserveHasUntouchedMatches_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public ObserveHasUntouchedMatches get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static ObserveHasUntouchedMatches provideInstance(Provider<MatchRepository> provider) {
        return new ObserveHasUntouchedMatches((MatchRepository) provider.get());
    }

    public static ObserveHasUntouchedMatches_Factory create(Provider<MatchRepository> provider) {
        return new ObserveHasUntouchedMatches_Factory(provider);
    }

    public static ObserveHasUntouchedMatches newObserveHasUntouchedMatches(MatchRepository matchRepository) {
        return new ObserveHasUntouchedMatches(matchRepository);
    }
}
