package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ci implements Action1 {
    /* renamed from: a */
    static final Action1 f44670a = new ci();

    private ci() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).setIncludeMeInSearchesForMen();
    }
}
