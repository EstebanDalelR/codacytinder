package com.tinder.domain.feed.usecase;

import com.tinder.domain.feed.FeedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteFailedFeedComment_Factory implements Factory<DeleteFailedFeedComment> {
    private final Provider<FeedRepository> feedRepositoryProvider;

    public DeleteFailedFeedComment_Factory(Provider<FeedRepository> provider) {
        this.feedRepositoryProvider = provider;
    }

    public DeleteFailedFeedComment get() {
        return provideInstance(this.feedRepositoryProvider);
    }

    public static DeleteFailedFeedComment provideInstance(Provider<FeedRepository> provider) {
        return new DeleteFailedFeedComment((FeedRepository) provider.get());
    }

    public static DeleteFailedFeedComment_Factory create(Provider<FeedRepository> provider) {
        return new DeleteFailedFeedComment_Factory(provider);
    }

    public static DeleteFailedFeedComment newDeleteFailedFeedComment(FeedRepository feedRepository) {
        return new DeleteFailedFeedComment(feedRepository);
    }
}
