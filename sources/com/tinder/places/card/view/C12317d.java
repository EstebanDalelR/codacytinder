package com.tinder.places.card.view;

import com.tinder.places.card.presenter.C10127a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.card.view.d */
public final class C12317d implements MembersInjector<PlaceCardAlternativesView> {
    /* renamed from: a */
    private final Provider<C10127a> f39888a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48654a((PlaceCardAlternativesView) obj);
    }

    /* renamed from: a */
    public void m48654a(PlaceCardAlternativesView placeCardAlternativesView) {
        C12317d.m48653a(placeCardAlternativesView, (C10127a) this.f39888a.get());
    }

    /* renamed from: a */
    public static void m48653a(PlaceCardAlternativesView placeCardAlternativesView, C10127a c10127a) {
        placeCardAlternativesView.f39850b = c10127a;
    }
}
