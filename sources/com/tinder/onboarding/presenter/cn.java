package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.GenderStepTarget;
import rx.functions.Action1;

final /* synthetic */ class cn implements Action1 {
    /* renamed from: a */
    static final Action1 f44672a = new cn();

    private cn() {
    }

    public void call(Object obj) {
        ((GenderStepTarget) obj).showInvalidCustomGenderDialog();
    }
}
