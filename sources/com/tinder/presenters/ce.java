package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class ce implements Action1 {
    /* renamed from: a */
    static final Action1 f57884a = new ce();

    private ce() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showIntroFragment();
    }
}
