package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.Optional;
import java8.util.function.Consumer;

final /* synthetic */ class aq implements Consumer {
    /* renamed from: a */
    private final C13526y f39444a;
    /* renamed from: b */
    private final Optional f39445b;

    aq(C13526y c13526y, Optional optional) {
        this.f39444a = c13526y;
        this.f39445b = optional;
    }

    public void accept(Object obj) {
        this.f39444a.m52872a(this.f39445b, (OnboardingEmail) obj);
    }
}
