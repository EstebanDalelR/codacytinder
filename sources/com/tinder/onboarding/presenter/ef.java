package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ef implements Action1 {
    /* renamed from: a */
    private final Throwable f44706a;

    ef(Throwable th) {
        this.f44706a = th;
    }

    public void call(Object obj) {
        dn.m52754a(this.f44706a, (OnboardingActivityTarget) obj);
    }
}
