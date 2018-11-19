package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cd implements Action1 {
    /* renamed from: a */
    static final Action1 f44665a = new cd();

    private cd() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).hideSoftInput();
    }
}
