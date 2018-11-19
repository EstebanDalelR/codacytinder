package com.tinder.recs.module;

import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsViewModule_ProvidesTappyCarouselViewPresenterFactory implements Factory<TappyImageDrawableCarouselViewPresenter> {
    private final Provider<CarouselViewImageDownloader> carouselViewImageDownloaderProvider;
    private final RecsViewModule module;
    private final Provider<UserRecActivePhotoIndexProvider> userRecActivePhotoIndexProvider;

    public RecsViewModule_ProvidesTappyCarouselViewPresenterFactory(RecsViewModule recsViewModule, Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2) {
        this.module = recsViewModule;
        this.carouselViewImageDownloaderProvider = provider;
        this.userRecActivePhotoIndexProvider = provider2;
    }

    public TappyImageDrawableCarouselViewPresenter get() {
        return provideInstance(this.module, this.carouselViewImageDownloaderProvider, this.userRecActivePhotoIndexProvider);
    }

    public static TappyImageDrawableCarouselViewPresenter provideInstance(RecsViewModule recsViewModule, Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2) {
        return proxyProvidesTappyCarouselViewPresenter(recsViewModule, (CarouselViewImageDownloader) provider.get(), (UserRecActivePhotoIndexProvider) provider2.get());
    }

    public static RecsViewModule_ProvidesTappyCarouselViewPresenterFactory create(RecsViewModule recsViewModule, Provider<CarouselViewImageDownloader> provider, Provider<UserRecActivePhotoIndexProvider> provider2) {
        return new RecsViewModule_ProvidesTappyCarouselViewPresenterFactory(recsViewModule, provider, provider2);
    }

    public static TappyImageDrawableCarouselViewPresenter proxyProvidesTappyCarouselViewPresenter(RecsViewModule recsViewModule, CarouselViewImageDownloader carouselViewImageDownloader, UserRecActivePhotoIndexProvider userRecActivePhotoIndexProvider) {
        return (TappyImageDrawableCarouselViewPresenter) C15521i.m58001a(recsViewModule.providesTappyCarouselViewPresenter(carouselViewImageDownloader, userRecActivePhotoIndexProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
