package com.tinder.recs.module;

import com.bumptech.glide.C0994i;
import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import com.tinder.module.ViewScope;
import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.data.CarouselViewImageDownloaderImpl;
import com.tinder.recs.data.CarouselViewImageDownloaderImpl.DownloadRequestManager;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter.CurrentDisplayedImageIndexHolder;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.RecsView;
import com.tinder.recs.view.fireboarding.FireboardingGamepadIconViewFactory;
import com.tinder.superlikeable.provider.SuperLikeableViewStateNotifier;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProvider;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier;
import dagger.Module;
import dagger.Provides;

@Module
public class RecsViewModule {
    static final int MAX_PHOTOS_COUNT_FOR_A_REC = 6;

    @Provides
    SuperLikeableViewStateNotifier bindSuperLikeableViewStateNotifier(SuperLikeableViewStateProviderAndNotifier superLikeableViewStateProviderAndNotifier) {
        return superLikeableViewStateProviderAndNotifier;
    }

    @Provides
    SuperLikeableViewStateProvider bindSuperLikeableViewStateProvider(SuperLikeableViewStateProviderAndNotifier superLikeableViewStateProviderAndNotifier) {
        return superLikeableViewStateProviderAndNotifier;
    }

    @Provides
    TappyConfig providesTappyConfig(TappyConfigProvider tappyConfigProvider) {
        return tappyConfigProvider.get();
    }

    @Provides
    TappyImageDrawableCarouselViewPresenter providesTappyCarouselViewPresenter(CarouselViewImageDownloader carouselViewImageDownloader, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        return new TappyImageDrawableCarouselViewPresenter(carouselViewImageDownloader, userRecActivePhotoIndexProvider, 6, new CurrentDisplayedImageIndexHolder());
    }

    @Provides
    CarouselViewImageDownloader providesRecsImageDownloader(RecsView recsView) {
        return new CarouselViewImageDownloaderImpl(new DownloadRequestManager(C0994i.b(recsView.getContext())), 6, new int[6]);
    }

    @ViewScope
    @Provides
    SuperLikeableViewStateProviderAndNotifier provideSuperLikeableViewStateProviderAndNotifier() {
        return new SuperLikeableViewStateProviderAndNotifier();
    }

    @ViewScope
    @Provides
    FireboardingLevelIconViewFactory provideFireboardingLevelIconViewFactory() {
        return new FireboardingGamepadIconViewFactory();
    }
}
