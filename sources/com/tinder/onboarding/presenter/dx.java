package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class dx implements Action1 {
    /* renamed from: a */
    static final Action1 f44697a = new dx();

    private dx() {
    }

    public void call(Object obj) {
        ((OnboardingActivityTarget) obj).showProgressDialog();
    }
}
