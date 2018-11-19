package com.tinder.application;

import com.tinder.places.injection.PlacesDisabledSurveyComponent;
import com.tinder.places.injection.PlacesDisabledSurveyComponent.Builder;
import com.tinder.places.settings.activity.PlacesDisabledSurveyActivity;
import dagger.internal.C15521i;

final class a$r implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33669a;
    /* renamed from: b */
    private PlacesDisabledSurveyActivity f33670b;

    private a$r(C4423a c4423a) {
        this.f33669a = c4423a;
    }

    public /* synthetic */ Builder placesDisabledSurveyActivity(PlacesDisabledSurveyActivity placesDisabledSurveyActivity) {
        return m42029a(placesDisabledSurveyActivity);
    }

    public PlacesDisabledSurveyComponent build() {
        if (this.f33670b != null) {
            return new a$s(this.f33669a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PlacesDisabledSurveyActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$r m42029a(PlacesDisabledSurveyActivity placesDisabledSurveyActivity) {
        this.f33670b = (PlacesDisabledSurveyActivity) C15521i.a(placesDisabledSurveyActivity);
        return this;
    }
}
