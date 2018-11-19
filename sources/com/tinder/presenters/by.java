package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class by implements Action1 {
    /* renamed from: a */
    static final Action1 f57878a = new by();

    private by() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showIntroFragment();
    }
}
