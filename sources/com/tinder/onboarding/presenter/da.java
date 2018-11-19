package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.NameStepTarget;
import rx.functions.Action0;

final /* synthetic */ class da implements Action0 {
    /* renamed from: a */
    private final NameStepTarget f44683a;

    private da(NameStepTarget nameStepTarget) {
        this.f44683a = nameStepTarget;
    }

    /* renamed from: a */
    static Action0 m53818a(NameStepTarget nameStepTarget) {
        return new da(nameStepTarget);
    }

    public void call() {
        this.f44683a.hideProgressDialog();
    }
}
