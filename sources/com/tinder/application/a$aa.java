package com.tinder.application;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.injection.PlacesSurveyOtherComponent;
import com.tinder.places.settings.presenter.C14321h;
import com.tinder.places.settings.view.C16040d;
import com.tinder.places.settings.view.PlacesSurveyOtherView;

final class a$aa implements PlacesSurveyOtherComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33436a;

    private a$aa(C4423a c4423a, a$z a_z) {
        this.f33436a = c4423a;
    }

    /* renamed from: a */
    private AddPlacesManageEnabledEvent m41688a() {
        return new AddPlacesManageEnabledEvent((C2630h) C4423a.u(this.f33436a).get());
    }

    /* renamed from: b */
    private C14321h m41690b() {
        return new C14321h(m41688a());
    }

    public void inject(PlacesSurveyOtherView placesSurveyOtherView) {
        m41689a(placesSurveyOtherView);
    }

    /* renamed from: a */
    private PlacesSurveyOtherView m41689a(PlacesSurveyOtherView placesSurveyOtherView) {
        C16040d.a(placesSurveyOtherView, m41690b());
        return placesSurveyOtherView;
    }
}
