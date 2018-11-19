package com.tinder.places.card.view;

import com.tinder.places.card.presenter.PlacesCardViewPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.card.view.k */
public final class C12322k implements MembersInjector<PlaceCardView> {
    /* renamed from: a */
    private final Provider<PlacesCardViewPresenter> f39892a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48660a((PlaceCardView) obj);
    }

    /* renamed from: a */
    public void m48660a(PlaceCardView placeCardView) {
        C12322k.m48659a(placeCardView, (PlacesCardViewPresenter) this.f39892a.get());
    }

    /* renamed from: a */
    public static void m48659a(PlaceCardView placeCardView, PlacesCardViewPresenter placesCardViewPresenter) {
        placeCardView.f39874b = placesCardViewPresenter;
    }
}
