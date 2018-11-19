package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cw implements Action1 {
    /* renamed from: a */
    static final Action1 f44680a = new cw();

    private cw() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).showProgressDialog();
    }
}
