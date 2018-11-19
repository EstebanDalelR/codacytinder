package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class au implements Action1 {
    /* renamed from: a */
    static final Action1 f44638a = new au();

    private au() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).hideMarketingCheckbox();
    }
}
