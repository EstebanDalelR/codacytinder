package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingPassword;
import rx.functions.Action1;
import rx.subjects.C19785a;

final /* synthetic */ class fa implements Action1 {
    /* renamed from: a */
    private final C19785a f44723a;

    private fa(C19785a c19785a) {
        this.f44723a = c19785a;
    }

    /* renamed from: a */
    static Action1 m53819a(C19785a c19785a) {
        return new fa(c19785a);
    }

    public void call(Object obj) {
        this.f44723a.onNext((OnboardingPassword) obj);
    }
}
