package com.tinder.recs.presenter;

import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter.CurrentDisplayedImageIndexHolder;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TappyImageDrawableCarouselViewPresenter_Factory implements Factory<TappyImageDrawableCarouselViewPresenter> {
    private final Provider<UserRecActivePhotoIndexProvider> activePhotoIndexProvider;
    private final Provider<CarouselViewImageDownloader> carouselViewImageDownloaderProvider;
    private final Provider<CurrentDisplayedImageIndexHolder> currentDisplayedImageIndexHolderProvider;
    private final Provider<Integer> maxPhotosAllowedProvider;

    public TappyImageDrawableCarouselViewPresenter_Factory(Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<Integer> provider3, Provider<CurrentDisplayedImageIndexHolder> provider4) {
        this.carouselViewImageDownloaderProvider = provider;
        this.activePhotoIndexProvider = provider2;
        this.maxPhotosAllowedProvider = provider3;
        this.currentDisplayedImageIndexHolderProvider = provider4;
    }

    public TappyImageDrawableCarouselViewPresenter get() {
        return provideInstance(this.carouselViewImageDownloaderProvider, this.activePhotoIndexProvider, this.maxPhotosAllowedProvider, this.currentDisplayedImageIndexHolderProvider);
    }

    public static TappyImageDrawableCarouselViewPresenter provideInstance(Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<Integer> provider3, Provider<CurrentDisplayedImageIndexHolder> provider4) {
        return new TappyImageDrawableCarouselViewPresenter((CarouselViewImageDownloader) provider.get(), (UserRecActivePhotoIndexProvider) provider2.get(), ((Integer) provider3.get()).intValue(), (CurrentDisplayedImageIndexHolder) provider4.get());
    }

    public static TappyImageDrawableCarouselViewPresenter_Factory create(Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2, Provider<Integer> provider3, Provider<CurrentDisplayedImageIndexHolder> provider4) {
        return new TappyImageDrawableCarouselViewPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static TappyImageDrawableCarouselViewPresenter newTappyImageDrawableCarouselViewPresenter(CarouselViewImageDownloader carouselViewImageDownloader, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider, int i, CurrentDisplayedImageIndexHolder currentDisplayedImageIndexHolder) {
        return new TappyImageDrawableCarouselViewPresenter(carouselViewImageDownloader, userRecActivePhotoIndexProvider, i, currentDisplayedImageIndexHolder);
    }
}
