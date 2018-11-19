package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fy implements Action1 {
    /* renamed from: a */
    static final Action1 f44741a = new fy();

    private fy() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).disableActionButton();
    }
}
