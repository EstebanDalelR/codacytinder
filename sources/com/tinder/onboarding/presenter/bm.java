package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class bm implements Action1 {
    /* renamed from: a */
    static final Action1 f44653a = new bm();

    private bm() {
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showProgressDialog();
    }
}
