package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingDateWidgetTarget;
import rx.functions.Action1;

final /* synthetic */ class eu implements Action1 {
    /* renamed from: a */
    private final int f44718a;
    /* renamed from: b */
    private final int f44719b;

    eu(int i, int i2) {
        this.f44718a = i;
        this.f44719b = i2;
    }

    public void call(Object obj) {
        ((OnboardingDateWidgetTarget) obj).focusFieldNext(this.f44718a, this.f44719b + 1);
    }
}
