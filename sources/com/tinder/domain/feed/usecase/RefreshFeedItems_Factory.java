package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RefreshFeedItems_Factory implements Factory<RefreshFeedItems> {
    private final Provider<FeedRepository> activityFeedRepositoryProvider;

    public RefreshFeedItems_Factory(Provider<FeedRepository> provider) {
        this.activityFeedRepositoryProvider = provider;
    }

    public RefreshFeedItems get() {
        return provideInstance(this.activityFeedRepositoryProvider);
    }

    public static RefreshFeedItems provideInstance(Provider<FeedRepository> provider) {
        return new RefreshFeedItems((FeedRepository) provider.get());
    }

    public static RefreshFeedItems_Factory create(Provider<FeedRepository> provider) {
        return new RefreshFeedItems_Factory(provider);
    }

    public static RefreshFeedItems newRefreshFeedItems(FeedRepository feedRepository) {
        return new RefreshFeedItems(feedRepository);
    }
}
