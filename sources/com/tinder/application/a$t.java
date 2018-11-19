package com.tinder.application;

import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.C10215g;
import com.tinder.places.injection.PlacesOnboardingComponent;
import com.tinder.places.injection.PlacesOnboardingComponent.Builder;
import com.tinder.places.onboarding.PlacesOnboardingActivity;
import dagger.internal.C15521i;

final class a$t implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33672a;
    /* renamed from: b */
    private C10213b f33673b;
    /* renamed from: c */
    private C10215g f33674c;
    /* renamed from: d */
    private PlacesOnboardingActivity f33675d;

    private a$t(C4423a c4423a) {
        this.f33672a = c4423a;
    }

    public /* synthetic */ Builder placesOnboardingActivity(PlacesOnboardingActivity placesOnboardingActivity) {
        return m42035a(placesOnboardingActivity);
    }

    public PlacesOnboardingComponent build() {
        if (this.f33673b == null) {
            this.f33673b = new C10213b();
        }
        if (this.f33674c == null) {
            this.f33674c = new C10215g();
        }
        if (this.f33675d != null) {
            return new a$u(this.f33672a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PlacesOnboardingActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$t m42035a(PlacesOnboardingActivity placesOnboardingActivity) {
        this.f33675d = (PlacesOnboardingActivity) C15521i.a(placesOnboardingActivity);
        return this;
    }
}
