package com.tinder.recs.view;

import com.tinder.superlikeable.provider.SuperLikeableViewStateNotifier;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SuperLikeableGameTeaserRecCardView_MembersInjector implements MembersInjector<SuperLikeableGameTeaserRecCardView> {
    private final Provider<SuperLikeableViewStateNotifier> superLikeableViewStateNotifierProvider;

    public SuperLikeableGameTeaserRecCardView_MembersInjector(Provider<SuperLikeableViewStateNotifier> provider) {
        this.superLikeableViewStateNotifierProvider = provider;
    }

    public static MembersInjector<SuperLikeableGameTeaserRecCardView> create(Provider<SuperLikeableViewStateNotifier> provider) {
        return new SuperLikeableGameTeaserRecCardView_MembersInjector(provider);
    }

    public void injectMembers(SuperLikeableGameTeaserRecCardView superLikeableGameTeaserRecCardView) {
        injectSuperLikeableViewStateNotifier(superLikeableGameTeaserRecCardView, (SuperLikeableViewStateNotifier) this.superLikeableViewStateNotifierProvider.get());
    }

    public static void injectSuperLikeableViewStateNotifier(SuperLikeableGameTeaserRecCardView superLikeableGameTeaserRecCardView, SuperLikeableViewStateNotifier superLikeableViewStateNotifier) {
        superLikeableGameTeaserRecCardView.superLikeableViewStateNotifier = superLikeableViewStateNotifier;
    }
}
