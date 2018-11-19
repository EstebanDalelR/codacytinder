package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cp implements Action1 {
    /* renamed from: a */
    static final Action1 f44674a = new cp();

    private cp() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).showGenericErrorDialog();
    }
}
