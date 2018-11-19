package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveHasNewFeedItems_Factory implements Factory<ObserveHasNewFeedItems> {
    private final Provider<FeedRepository> feedRepositoryProvider;

    public ObserveHasNewFeedItems_Factory(Provider<FeedRepository> provider) {
        this.feedRepositoryProvider = provider;
    }

    public ObserveHasNewFeedItems get() {
        return provideInstance(this.feedRepositoryProvider);
    }

    public static ObserveHasNewFeedItems provideInstance(Provider<FeedRepository> provider) {
        return new ObserveHasNewFeedItems((FeedRepository) provider.get());
    }

    public static ObserveHasNewFeedItems_Factory create(Provider<FeedRepository> provider) {
        return new ObserveHasNewFeedItems_Factory(provider);
    }

    public static ObserveHasNewFeedItems newObserveHasNewFeedItems(FeedRepository feedRepository) {
        return new ObserveHasNewFeedItems(feedRepository);
    }
}
