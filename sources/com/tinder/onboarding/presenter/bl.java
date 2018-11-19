package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class bl implements Action1 {
    /* renamed from: a */
    static final Action1 f44652a = new bl();

    private bl() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).hideProgressDialog();
    }
}
