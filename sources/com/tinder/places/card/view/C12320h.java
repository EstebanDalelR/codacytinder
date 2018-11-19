package com.tinder.places.card.view;

import com.tinder.places.card.presenter.C10129c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.card.view.h */
public final class C12320h implements MembersInjector<PlaceCardFrontView> {
    /* renamed from: a */
    private final Provider<C10129c> f39891a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48658a((PlaceCardFrontView) obj);
    }

    /* renamed from: a */
    public void m48658a(PlaceCardFrontView placeCardFrontView) {
        C12320h.m48657a(placeCardFrontView, (C10129c) this.f39891a.get());
    }

    /* renamed from: a */
    public static void m48657a(PlaceCardFrontView placeCardFrontView, C10129c c10129c) {
        placeCardFrontView.f39863b = c10129c;
    }
}
