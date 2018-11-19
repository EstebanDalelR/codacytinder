package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class ao implements Action1 {
    /* renamed from: a */
    static final Action1 f44636a = new ao();

    private ao() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showInvalidEmailErrorHint();
    }
}
