package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.OnboardingDateWidgetTarget;
import rx.functions.Action1;

final /* synthetic */ class ev implements Action1 {
    /* renamed from: a */
    private final int f44720a;
    /* renamed from: b */
    private final int f44721b;

    ev(int i, int i2) {
        this.f44720a = i;
        this.f44721b = i2;
    }

    public void call(Object obj) {
        ((OnboardingDateWidgetTarget) obj).clearFieldValue(this.f44720a, this.f44721b);
    }
}
