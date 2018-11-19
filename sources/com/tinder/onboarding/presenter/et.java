package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingDateWidgetTarget;
import rx.functions.Action1;

final /* synthetic */ class et implements Action1 {
    /* renamed from: a */
    private final int f44717a;

    et(int i) {
        this.f44717a = i;
    }

    public void call(Object obj) {
        ((OnboardingDateWidgetTarget) obj).focusFieldNext(this.f44717a + 1);
    }
}
