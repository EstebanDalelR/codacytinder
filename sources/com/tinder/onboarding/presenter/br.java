package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class br implements Action1 {
    /* renamed from: a */
    static final Action1 f44658a = new br();

    private br() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showProgressDialog();
    }
}
