package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingUser;
import rx.functions.Func1;

/* renamed from: com.tinder.onboarding.presenter.i */
final /* synthetic */ class C13523i implements Func1 {
    /* renamed from: a */
    private final BirthdayStepPresenter f43196a;

    C13523i(BirthdayStepPresenter birthdayStepPresenter) {
        this.f43196a = birthdayStepPresenter;
    }

    public Object call(Object obj) {
        return this.f43196a.m52681a((OnboardingUser) obj);
    }
}
