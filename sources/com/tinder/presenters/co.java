package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class co implements Action1 {
    /* renamed from: a */
    static final Action1 f57894a = new co();

    private co() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showProgressDialog();
    }
}
