package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ej implements Action1 {
    /* renamed from: a */
    private final dn f44710a;
    /* renamed from: b */
    private final Throwable f44711b;

    ej(dn dnVar, Throwable th) {
        this.f44710a = dnVar;
        this.f44711b = th;
    }

    public void call(Object obj) {
        this.f44710a.m52782c(this.f44711b, (OnboardingActivityTarget) obj);
    }
}
