package com.tinder.places.onboarding;

import com.tinder.places.onboarding.presenter.C10267c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.places.onboarding.c */
public final class C12398c implements MembersInjector<PlacesOnboardingActivity> {
    /* renamed from: a */
    private final Provider<C10267c> f40037a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48822a((PlacesOnboardingActivity) obj);
    }

    /* renamed from: a */
    public void m48822a(PlacesOnboardingActivity placesOnboardingActivity) {
        C12398c.m48821a(placesOnboardingActivity, (C10267c) this.f40037a.get());
    }

    /* renamed from: a */
    public static void m48821a(PlacesOnboardingActivity placesOnboardingActivity, C10267c c10267c) {
        placesOnboardingActivity.f45404b = c10267c;
    }
}
