package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cj implements Action1 {
    /* renamed from: a */
    static final Action1 f57889a = new cj();

    private cj() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showIntroFragment();
    }
}
