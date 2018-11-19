package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class dy implements Action1 {
    /* renamed from: a */
    static final Action1 f44698a = new dy();

    private dy() {
    }

    public void call(Object obj) {
        ((OnboardingActivityTarget) obj).hideProgressDialog();
    }
}
