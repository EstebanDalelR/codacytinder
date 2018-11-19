package com.tinder.domain.match.usecase;

import com.tinder.domain.match.repository.MatchRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class BlockMatches_Factory implements Factory<BlockMatches> {
    private final Provider<MatchRepository> matchRepositoryProvider;

    public BlockMatches_Factory(Provider<MatchRepository> provider) {
        this.matchRepositoryProvider = provider;
    }

    public BlockMatches get() {
        return provideInstance(this.matchRepositoryProvider);
    }

    public static BlockMatches provideInstance(Provider<MatchRepository> provider) {
        return new BlockMatches((MatchRepository) provider.get());
    }

    public static BlockMatches_Factory create(Provider<MatchRepository> provider) {
        return new BlockMatches_Factory(provider);
    }

    public static BlockMatches newBlockMatches(MatchRepository matchRepository) {
        return new BlockMatches(matchRepository);
    }
}
