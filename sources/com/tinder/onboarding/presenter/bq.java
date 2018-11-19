package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class bq implements Action1 {
    /* renamed from: a */
    static final Action1 f44657a = new bq();

    private bq() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showInvalidEmailErrorHint();
    }
}
