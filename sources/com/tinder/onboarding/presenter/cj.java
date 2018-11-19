package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cj implements Action1 {
    /* renamed from: a */
    static final Action1 f44671a = new cj();

    private cj() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).setIncludeMeInSearchesForWomen();
    }
}
