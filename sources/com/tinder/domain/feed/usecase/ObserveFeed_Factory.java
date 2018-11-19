package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveFeed_Factory implements Factory<ObserveFeed> {
    private final Provider<FeedRepository> activityFeedRepositoryProvider;

    public ObserveFeed_Factory(Provider<FeedRepository> provider) {
        this.activityFeedRepositoryProvider = provider;
    }

    public ObserveFeed get() {
        return provideInstance(this.activityFeedRepositoryProvider);
    }

    public static ObserveFeed provideInstance(Provider<FeedRepository> provider) {
        return new ObserveFeed((FeedRepository) provider.get());
    }

    public static ObserveFeed_Factory create(Provider<FeedRepository> provider) {
        return new ObserveFeed_Factory(provider);
    }

    public static ObserveFeed newObserveFeed(FeedRepository feedRepository) {
        return new ObserveFeed(feedRepository);
    }
}
