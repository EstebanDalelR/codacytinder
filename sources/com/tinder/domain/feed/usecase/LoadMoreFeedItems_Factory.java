package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadMoreFeedItems_Factory implements Factory<LoadMoreFeedItems> {
    private final Provider<FeedRepository> feedRepositoryProvider;

    public LoadMoreFeedItems_Factory(Provider<FeedRepository> provider) {
        this.feedRepositoryProvider = provider;
    }

    public LoadMoreFeedItems get() {
        return provideInstance(this.feedRepositoryProvider);
    }

    public static LoadMoreFeedItems provideInstance(Provider<FeedRepository> provider) {
        return new LoadMoreFeedItems((FeedRepository) provider.get());
    }

    public static LoadMoreFeedItems_Factory create(Provider<FeedRepository> provider) {
        return new LoadMoreFeedItems_Factory(provider);
    }

    public static LoadMoreFeedItems newLoadMoreFeedItems(FeedRepository feedRepository) {
        return new LoadMoreFeedItems(feedRepository);
    }
}
