package com.tinder.application;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.injection.PlacesDisabledSurveyComponent;
import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter;
import com.tinder.places.settings.view.C16038a;
import com.tinder.places.settings.view.PlacesDisabledSurveyView;

final class a$s implements PlacesDisabledSurveyComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33671a;

    private a$s(C4423a c4423a, a$r a_r) {
        this.f33671a = c4423a;
    }

    /* renamed from: a */
    private AddPlacesManageEnabledEvent m42030a() {
        return new AddPlacesManageEnabledEvent((C2630h) C4423a.u(this.f33671a).get());
    }

    /* renamed from: b */
    private PlacesDisabledSurveyPresenter m42032b() {
        return new PlacesDisabledSurveyPresenter(m42030a());
    }

    public void inject(PlacesDisabledSurveyView placesDisabledSurveyView) {
        m42031a(placesDisabledSurveyView);
    }

    /* renamed from: a */
    private PlacesDisabledSurveyView m42031a(PlacesDisabledSurveyView placesDisabledSurveyView) {
        C16038a.a(placesDisabledSurveyView, m42032b());
        return placesDisabledSurveyView;
    }
}
