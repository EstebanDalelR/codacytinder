package com.tinder.places.main.view;

import com.tinder.places.main.presenter.C10223f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.main.view.g */
public final class C12376g implements MembersInjector<PlacesView> {
    /* renamed from: a */
    private final Provider<C10223f> f39998a;
    /* renamed from: b */
    private final Provider<PlacesView$Decorator> f39999b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48779a((PlacesView) obj);
    }

    /* renamed from: a */
    public void m48779a(PlacesView placesView) {
        C12376g.m48777a(placesView, (C10223f) this.f39998a.get());
        C12376g.m48778a(placesView, (PlacesView$Decorator) this.f39999b.get());
    }

    /* renamed from: a */
    public static void m48777a(PlacesView placesView, C10223f c10223f) {
        placesView.f12453b = c10223f;
    }

    /* renamed from: a */
    public static void m48778a(PlacesView placesView, PlacesView$Decorator placesView$Decorator) {
        placesView.f12454c = placesView$Decorator;
    }
}
