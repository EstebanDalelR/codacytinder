package com.tinder.places.main.view;

import com.tinder.places.main.presenter.C10220d;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.main.view.d */
public final class C12373d implements MembersInjector<PlacesPinDropView> {
    /* renamed from: a */
    private final Provider<C10220d> f39997a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48776a((PlacesPinDropView) obj);
    }

    /* renamed from: a */
    public void m48776a(PlacesPinDropView placesPinDropView) {
        C12373d.m48775a(placesPinDropView, (C10220d) this.f39997a.get());
    }

    /* renamed from: a */
    public static void m48775a(PlacesPinDropView placesPinDropView, C10220d c10220d) {
        placesPinDropView.f39984b = c10220d;
    }
}
