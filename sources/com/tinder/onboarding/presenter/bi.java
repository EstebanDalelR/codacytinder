package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class bi implements Action1 {
    /* renamed from: a */
    static final Action1 f44647a = new bi();

    private bi() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).hideProgressDialog();
    }
}
