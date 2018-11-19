package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RetryFailedFeedComment_Factory implements Factory<RetryFailedFeedComment> {
    private final Provider<FeedRepository> feedRepositoryProvider;

    public RetryFailedFeedComment_Factory(Provider<FeedRepository> provider) {
        this.feedRepositoryProvider = provider;
    }

    public RetryFailedFeedComment get() {
        return provideInstance(this.feedRepositoryProvider);
    }

    public static RetryFailedFeedComment provideInstance(Provider<FeedRepository> provider) {
        return new RetryFailedFeedComment((FeedRepository) provider.get());
    }

    public static RetryFailedFeedComment_Factory create(Provider<FeedRepository> provider) {
        return new RetryFailedFeedComment_Factory(provider);
    }

    public static RetryFailedFeedComment newRetryFailedFeedComment(FeedRepository feedRepository) {
        return new RetryFailedFeedComment(feedRepository);
    }
}
