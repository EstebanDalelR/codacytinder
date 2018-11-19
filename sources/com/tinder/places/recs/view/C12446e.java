package com.tinder.places.recs.view;

import com.tinder.places.recs.presenter.C10279f;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.p449a.C15453a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.recs.view.e */
public final class C12446e implements MembersInjector<PlacesUserRecCardView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f40143a;
    /* renamed from: b */
    private final Provider<C15453a> f40144b;
    /* renamed from: c */
    private final Provider<C10279f> f40145c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48933a((PlacesUserRecCardView) obj);
    }

    /* renamed from: a */
    public void m48933a(PlacesUserRecCardView placesUserRecCardView) {
        C17263c.a(placesUserRecCardView, (UserRecActivePhotoIndexProvider) this.f40143a.get());
        C17263c.a(placesUserRecCardView, (C15453a) this.f40144b.get());
        C12446e.m48932a(placesUserRecCardView, (C10279f) this.f40145c.get());
    }

    /* renamed from: a */
    public static void m48932a(PlacesUserRecCardView placesUserRecCardView, C10279f c10279f) {
        placesUserRecCardView.f45090b = c10279f;
    }
}
