package com.tinder.onboarding.view;

import com.tinder.onboarding.presenter.es;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.view.m */
public final class C12215m implements MembersInjector<OnboardingDateWidgetView> {
    /* renamed from: a */
    private final Provider<es> f39571a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48375a((OnboardingDateWidgetView) obj);
    }

    /* renamed from: a */
    public void m48375a(OnboardingDateWidgetView onboardingDateWidgetView) {
        C12215m.m48374a(onboardingDateWidgetView, (es) this.f39571a.get());
    }

    /* renamed from: a */
    public static void m48374a(OnboardingDateWidgetView onboardingDateWidgetView, es esVar) {
        onboardingDateWidgetView.f12427a = esVar;
    }
}
