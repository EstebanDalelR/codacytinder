package com.tinder.domain.feed.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import rx.C2671a;

public final class PollForNewFeedItems_Factory implements Factory<PollForNewFeedItems> {
    private final Provider<Logger> loggerProvider;
    private final Provider<FeedRepository> repositoryProvider;
    private final Provider<C2671a> timerSchedulerProvider;

    public PollForNewFeedItems_Factory(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        this.repositoryProvider = provider;
        this.timerSchedulerProvider = provider2;
        this.loggerProvider = provider3;
    }

    public PollForNewFeedItems get() {
        return provideInstance(this.repositoryProvider, this.timerSchedulerProvider, this.loggerProvider);
    }

    public static PollForNewFeedItems provideInstance(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        return new PollForNewFeedItems((FeedRepository) provider.get(), (C2671a) provider2.get(), (Logger) provider3.get());
    }

    public static PollForNewFeedItems_Factory create(Provider<FeedRepository> provider, Provider<C2671a> provider2, Provider<Logger> provider3) {
        return new PollForNewFeedItems_Factory(provider, provider2, provider3);
    }

    public static PollForNewFeedItems newPollForNewFeedItems(FeedRepository feedRepository, C2671a c2671a, Logger logger) {
        return new PollForNewFeedItems(feedRepository, c2671a, logger);
    }
}
