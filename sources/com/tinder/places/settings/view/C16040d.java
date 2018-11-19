package com.tinder.places.settings.view;

import com.tinder.places.settings.presenter.C14321h;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.settings.view.d */
public final class C16040d implements MembersInjector<PlacesSurveyOtherView> {
    /* renamed from: a */
    private final Provider<C14321h> f49814a;

    public /* synthetic */ void injectMembers(Object obj) {
        m60808a((PlacesSurveyOtherView) obj);
    }

    /* renamed from: a */
    public void m60808a(PlacesSurveyOtherView placesSurveyOtherView) {
        C16040d.m60807a(placesSurveyOtherView, (C14321h) this.f49814a.get());
    }

    /* renamed from: a */
    public static void m60807a(PlacesSurveyOtherView placesSurveyOtherView, C14321h c14321h) {
        placesSurveyOtherView.f57845f = c14321h;
    }
}
