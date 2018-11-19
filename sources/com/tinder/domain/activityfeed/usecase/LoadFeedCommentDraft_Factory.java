package com.tinder.domain.activityfeed.usecase;

import com.tinder.domain.feed.DraftRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadFeedCommentDraft_Factory implements Factory<LoadFeedCommentDraft> {
    private final Provider<DraftRepository> draftRepositoryProvider;

    public LoadFeedCommentDraft_Factory(Provider<DraftRepository> provider) {
        this.draftRepositoryProvider = provider;
    }

    public LoadFeedCommentDraft get() {
        return provideInstance(this.draftRepositoryProvider);
    }

    public static LoadFeedCommentDraft provideInstance(Provider<DraftRepository> provider) {
        return new LoadFeedCommentDraft((DraftRepository) provider.get());
    }

    public static LoadFeedCommentDraft_Factory create(Provider<DraftRepository> provider) {
        return new LoadFeedCommentDraft_Factory(provider);
    }

    public static LoadFeedCommentDraft newLoadFeedCommentDraft(DraftRepository draftRepository) {
        return new LoadFeedCommentDraft(draftRepository);
    }
}
