package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.function.Function;

final /* synthetic */ class dv implements Function {
    /* renamed from: a */
    static final Function f39457a = new dv();

    private dv() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((OnboardingEmail) obj).isEmailRequired());
    }
}
