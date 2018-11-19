package com.tinder.places.settings.view;

import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.settings.view.a */
public final class C16038a implements MembersInjector<PlacesDisabledSurveyView> {
    /* renamed from: a */
    private final Provider<PlacesDisabledSurveyPresenter> f49811a;

    public /* synthetic */ void injectMembers(Object obj) {
        m60803a((PlacesDisabledSurveyView) obj);
    }

    /* renamed from: a */
    public void m60803a(PlacesDisabledSurveyView placesDisabledSurveyView) {
        C16038a.m60802a(placesDisabledSurveyView, (PlacesDisabledSurveyPresenter) this.f49811a.get());
    }

    /* renamed from: a */
    public static void m60802a(PlacesDisabledSurveyView placesDisabledSurveyView, PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter) {
        placesDisabledSurveyView.f57838f = placesDisabledSurveyPresenter;
    }
}
