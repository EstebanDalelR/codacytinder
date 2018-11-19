package com.tinder.places.carousel.view;

import com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.carousel.view.h */
public final class C12333h implements MembersInjector<PlacesCarouselLoadingContainerView> {
    /* renamed from: a */
    private final Provider<PlacesCarouselLoadingContainerPresenter> f39929a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48715a((PlacesCarouselLoadingContainerView) obj);
    }

    /* renamed from: a */
    public void m48715a(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        C12333h.m48714a(placesCarouselLoadingContainerView, (PlacesCarouselLoadingContainerPresenter) this.f39929a.get());
    }

    /* renamed from: a */
    public static void m48714a(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView, PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
        placesCarouselLoadingContainerView.f39913b = placesCarouselLoadingContainerPresenter;
    }
}
