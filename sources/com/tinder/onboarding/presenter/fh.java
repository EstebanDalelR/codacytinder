package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PasswordStepTarget;
import rx.functions.Action1;

final /* synthetic */ class fh implements Action1 {
    /* renamed from: a */
    static final Action1 f44729a = new fh();

    private fh() {
    }

    public void call(Object obj) {
        ((PasswordStepTarget) obj).showGenericErrorDialog();
    }
}
