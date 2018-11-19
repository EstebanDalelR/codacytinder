package com.tinder.places.card.view;

import com.tinder.places.card.presenter.C10133f;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.card.view.l */
public final class C12323l implements MembersInjector<PlaceRecTeasersView> {
    /* renamed from: a */
    private final Provider<C10133f> f39893a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48662a((PlaceRecTeasersView) obj);
    }

    /* renamed from: a */
    public void m48662a(PlaceRecTeasersView placeRecTeasersView) {
        C12323l.m48661a(placeRecTeasersView, (C10133f) this.f39893a.get());
    }

    /* renamed from: a */
    public static void m48661a(PlaceRecTeasersView placeRecTeasersView, C10133f c10133f) {
        placeRecTeasersView.f39886a = c10133f;
    }
}
