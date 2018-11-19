package com.tinder.domain.feed.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import rx.C2671a;

public final class PollFeed_Factory implements Factory<PollFeed> {
    private final Provider<Logger> loggerProvider;
    private final Provider<FeedRepository> repositoryProvider;
    private final Provider<C2671a> timerSchedulerProvider;

    public PollFeed_Factory(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        this.repositoryProvider = provider;
        this.timerSchedulerProvider = provider2;
        this.loggerProvider = provider3;
    }

    public PollFeed get() {
        return provideInstance(this.repositoryProvider, this.timerSchedulerProvider, this.loggerProvider);
    }

    public static PollFeed provideInstance(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        return new PollFeed((FeedRepository) provider.get(), (C2671a) provider2.get(), (Logger) provider3.get());
    }

    public static PollFeed_Factory create(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        return new PollFeed_Factory(provider, provider2, provider3);
    }

    public static PollFeed newPollFeed(FeedRepository feedRepository, C2671a c2671a, Logger logger) {
        return new PollFeed(feedRepository, c2671a, logger);
    }
}
