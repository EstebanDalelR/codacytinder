package com.tinder.places.recs.view;

import com.tinder.chat.activity.C8406b;
import com.tinder.places.recs.presenter.C12433a;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.views.grid.C17264e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.recs.view.d */
public final class C12445d implements MembersInjector<PlacesRecsView> {
    /* renamed from: a */
    private final Provider<UserRecActivePhotoIndexProvider> f40140a;
    /* renamed from: b */
    private final Provider<C8406b> f40141b;
    /* renamed from: c */
    private final Provider<C12433a> f40142c;

    public /* synthetic */ void injectMembers(Object obj) {
        m48931a((PlacesRecsView) obj);
    }

    /* renamed from: a */
    public void m48931a(PlacesRecsView placesRecsView) {
        C17264e.a(placesRecsView, (UserRecActivePhotoIndexProvider) this.f40140a.get());
        C17264e.a(placesRecsView, (C8406b) this.f40141b.get());
        C12445d.m48930a(placesRecsView, (C12433a) this.f40142c.get());
    }

    /* renamed from: a */
    public static void m48930a(PlacesRecsView placesRecsView, C12433a c12433a) {
        placesRecsView.f43359b = c12433a;
    }
}
