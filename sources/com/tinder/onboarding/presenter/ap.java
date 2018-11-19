package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ap implements Action1 {
    /* renamed from: a */
    static final Action1 f44637a = new ap();

    private ap() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showGenericErrorMessage();
    }
}
