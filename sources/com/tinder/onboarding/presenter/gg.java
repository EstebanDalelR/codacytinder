package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingPassword;
import rx.functions.Func1;

final /* synthetic */ class gg implements Func1 {
    /* renamed from: a */
    static final Func1 f43191a = new gg();

    private gg() {
    }

    public Object call(Object obj) {
        return Boolean.valueOf(((OnboardingPassword) obj).exists());
    }
}
