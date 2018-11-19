package com.tinder.places.carousel.view;

import com.tinder.places.carousel.adapter.PlacesCarouselAdapter;
import com.tinder.places.carousel.presenter.C10194c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.carousel.view.i */
public final class C12334i implements MembersInjector<PlacesCarouselView> {
    /* renamed from: a */
    private final Provider<PlacesCarouselAdapter> f39930a;
    /* renamed from: b */
    private final Provider<C10194c> f39931b;
    /* renamed from: c */
    private final Provider<CarouselLayoutManager> f39932c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48719a((PlacesCarouselView) obj);
    }

    /* renamed from: a */
    public void m48719a(PlacesCarouselView placesCarouselView) {
        C12334i.m48716a(placesCarouselView, (PlacesCarouselAdapter) this.f39930a.get());
        C12334i.m48717a(placesCarouselView, (C10194c) this.f39931b.get());
        C12334i.m48718a(placesCarouselView, (CarouselLayoutManager) this.f39932c.get());
    }

    /* renamed from: a */
    public static void m48716a(PlacesCarouselView placesCarouselView, PlacesCarouselAdapter placesCarouselAdapter) {
        placesCarouselView.f44995a = placesCarouselAdapter;
    }

    /* renamed from: a */
    public static void m48717a(PlacesCarouselView placesCarouselView, C10194c c10194c) {
        placesCarouselView.f44996b = c10194c;
    }

    /* renamed from: a */
    public static void m48718a(PlacesCarouselView placesCarouselView, CarouselLayoutManager carouselLayoutManager) {
        placesCarouselView.f44997c = carouselLayoutManager;
    }
}
