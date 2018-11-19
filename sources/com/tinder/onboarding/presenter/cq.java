package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cq implements Action1 {
    /* renamed from: a */
    static final Action1 f44675a = new cq();

    private cq() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).hideProgressDialog();
    }
}
