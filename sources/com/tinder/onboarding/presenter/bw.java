package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.function.Function;

final /* synthetic */ class bw implements Function {
    /* renamed from: a */
    static final Function f39450a = new bw();

    private bw() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((OnboardingEmail) obj).allowMarketingEditable());
    }
}
