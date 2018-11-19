package com.tinder.recs.view.tappy;

import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TappyImageDrawableCarouselView_MembersInjector implements MembersInjector<TappyImageDrawableCarouselView> {
    private final Provider<RecsPhotoUrlFactory> photoUrlFactoryProvider;
    private final Provider<TappyImageDrawableCarouselViewPresenter> presenterProvider;

    public TappyImageDrawableCarouselView_MembersInjector(Provider<TappyImageDrawableCarouselViewPresenter> provider, Provider<RecsPhotoUrlFactory> provider2) {
        this.presenterProvider = provider;
        this.photoUrlFactoryProvider = provider2;
    }

    public static MembersInjector<TappyImageDrawableCarouselView> create(Provider<TappyImageDrawableCarouselViewPresenter> provider, Provider<RecsPhotoUrlFactory> provider2) {
        return new TappyImageDrawableCarouselView_MembersInjector(provider, provider2);
    }

    public void injectMembers(TappyImageDrawableCarouselView tappyImageDrawableCarouselView) {
        injectPresenter(tappyImageDrawableCarouselView, (TappyImageDrawableCarouselViewPresenter) this.presenterProvider.get());
        injectPhotoUrlFactory(tappyImageDrawableCarouselView, (RecsPhotoUrlFactory) this.photoUrlFactoryProvider.get());
    }

    public static void injectPresenter(TappyImageDrawableCarouselView tappyImageDrawableCarouselView, TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        tappyImageDrawableCarouselView.presenter = tappyImageDrawableCarouselViewPresenter;
    }

    public static void injectPhotoUrlFactory(TappyImageDrawableCarouselView tappyImageDrawableCarouselView, RecsPhotoUrlFactory recsPhotoUrlFactory) {
        tappyImageDrawableCarouselView.photoUrlFactory = recsPhotoUrlFactory;
    }
}
