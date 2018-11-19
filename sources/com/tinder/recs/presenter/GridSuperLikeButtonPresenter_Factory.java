package com.tinder.recs.presenter;

import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GridSuperLikeButtonPresenter_Factory implements Factory<GridSuperLikeButtonPresenter> {
    private final Provider<RatingProcessor> ratingProcessorProvider;
    private final Provider<SuperLikeRatingStatusNotifier> superLikeRatingStatusNotifierProvider;
    private final Provider<SuperLikeRatingStatusProvider> superLikeRatingStatusProvider;

    public GridSuperLikeButtonPresenter_Factory(Provider<SuperLikeRatingStatusProvider> provider, Provider<SuperLikeRatingStatusNotifier> provider2, Provider<RatingProcessor> provider3) {
        this.superLikeRatingStatusProvider = provider;
        this.superLikeRatingStatusNotifierProvider = provider2;
        this.ratingProcessorProvider = provider3;
    }

    public GridSuperLikeButtonPresenter get() {
        return provideInstance(this.superLikeRatingStatusProvider, this.superLikeRatingStatusNotifierProvider, this.ratingProcessorProvider);
    }

    public static GridSuperLikeButtonPresenter provideInstance(Provider<SuperLikeRatingStatusProvider> provider, Provider<SuperLikeRatingStatusNotifier> provider2, Provider<RatingProcessor> provider3) {
        return new GridSuperLikeButtonPresenter((SuperLikeRatingStatusProvider) provider.get(), (SuperLikeRatingStatusNotifier) provider2.get(), (RatingProcessor) provider3.get());
    }

    public static GridSuperLikeButtonPresenter_Factory create(Provider<SuperLikeRatingStatusProvider> provider, Provider<SuperLikeRatingStatusNotifier> provider2, Provider<RatingProcessor> provider3) {
        return new GridSuperLikeButtonPresenter_Factory(provider, provider2, provider3);
    }

    public static GridSuperLikeButtonPresenter newGridSuperLikeButtonPresenter(SuperLikeRatingStatusProvider superLikeRatingStatusProvider, SuperLikeRatingStatusNotifier superLikeRatingStatusNotifier, RatingProcessor ratingProcessor) {
        return new GridSuperLikeButtonPresenter(superLikeRatingStatusProvider, superLikeRatingStatusNotifier, ratingProcessor);
    }
}
