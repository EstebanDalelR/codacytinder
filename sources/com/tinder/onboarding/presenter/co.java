package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class co implements Action1 {
    /* renamed from: a */
    static final Action1 f44673a = new co();

    private co() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).showGenericErrorDialog();
    }
}
