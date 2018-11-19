package com.tinder.application;

import com.tinder.places.injection.PlacesSurveyOtherComponent;
import com.tinder.places.injection.PlacesSurveyOtherComponent.Builder;
import com.tinder.places.settings.activity.PlacesSurveyOtherActivity;
import dagger.internal.C15521i;

final class a$z implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33694a;
    /* renamed from: b */
    private PlacesSurveyOtherActivity f33695b;

    private a$z(C4423a c4423a) {
        this.f33694a = c4423a;
    }

    public /* synthetic */ Builder placesSurveyOtherActivity(PlacesSurveyOtherActivity placesSurveyOtherActivity) {
        return m42084a(placesSurveyOtherActivity);
    }

    public PlacesSurveyOtherComponent build() {
        if (this.f33695b != null) {
            return new a$aa(this.f33694a, this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PlacesSurveyOtherActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$z m42084a(PlacesSurveyOtherActivity placesSurveyOtherActivity) {
        this.f33695b = (PlacesSurveyOtherActivity) C15521i.a(placesSurveyOtherActivity);
        return this;
    }
}
