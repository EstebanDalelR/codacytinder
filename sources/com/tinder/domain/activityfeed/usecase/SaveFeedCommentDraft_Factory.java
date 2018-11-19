package com.tinder.domain.activityfeed.usecase;

import com.tinder.domain.feed.DraftRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SaveFeedCommentDraft_Factory implements Factory<SaveFeedCommentDraft> {
    private final Provider<DraftRepository> draftRepositoryProvider;

    public SaveFeedCommentDraft_Factory(Provider<DraftRepository> provider) {
        this.draftRepositoryProvider = provider;
    }

    public SaveFeedCommentDraft get() {
        return provideInstance(this.draftRepositoryProvider);
    }

    public static SaveFeedCommentDraft provideInstance(Provider<DraftRepository> provider) {
        return new SaveFeedCommentDraft((DraftRepository) provider.get());
    }

    public static SaveFeedCommentDraft_Factory create(Provider<DraftRepository> provider) {
        return new SaveFeedCommentDraft_Factory(provider);
    }

    public static SaveFeedCommentDraft newSaveFeedCommentDraft(DraftRepository draftRepository) {
        return new SaveFeedCommentDraft(draftRepository);
    }
}
