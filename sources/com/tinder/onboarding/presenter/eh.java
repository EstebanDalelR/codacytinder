package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class eh implements Action1 {
    /* renamed from: a */
    private final Throwable f44708a;

    eh(Throwable th) {
        this.f44708a = th;
    }

    public void call(Object obj) {
        ((OnboardingActivityTarget) obj).finishOnboardingWithError(this.f44708a);
    }
}
