package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.PhotosStepTarget;
import rx.functions.Action1;

final /* synthetic */ class gv implements Action1 {
    /* renamed from: a */
    static final Action1 f44760a = new gv();

    private gv() {
    }

    public void call(Object obj) {
        ((PhotosStepTarget) obj).hideSoftInput();
    }
}
