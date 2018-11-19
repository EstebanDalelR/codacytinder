package com.tinder.application;

import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.PlacesSettingsComponent;
import com.tinder.places.injection.PlacesSettingsComponent.Builder;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import dagger.internal.C15521i;

final class a$x implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33689a;
    /* renamed from: b */
    private C10213b f33690b;
    /* renamed from: c */
    private PlacesSettingsActivity f33691c;

    private a$x(C4423a c4423a) {
        this.f33689a = c4423a;
    }

    public /* synthetic */ Builder placesSettingsActivity(PlacesSettingsActivity placesSettingsActivity) {
        return m42072a(placesSettingsActivity);
    }

    public PlacesSettingsComponent build() {
        if (this.f33690b == null) {
            this.f33690b = new C10213b();
        }
        if (this.f33691c != null) {
            return new a$y(this.f33689a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PlacesSettingsActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$x m42072a(PlacesSettingsActivity placesSettingsActivity) {
        this.f33691c = (PlacesSettingsActivity) C15521i.a(placesSettingsActivity);
        return this;
    }
}
