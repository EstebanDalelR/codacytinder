package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.function.Function;

final /* synthetic */ class bu implements Function {
    /* renamed from: a */
    static final Function f39448a = new bu();

    private bu() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((OnboardingEmail) obj).isEmailRequired());
    }
}
