package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import java8.util.function.Function;

final /* synthetic */ class bv implements Function {
    /* renamed from: a */
    static final Function f39449a = new bv();

    private bv() {
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((OnboardingEmail) obj).emailEditable());
    }
}
