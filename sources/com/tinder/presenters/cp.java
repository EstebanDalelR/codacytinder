package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cp implements Action1 {
    /* renamed from: a */
    static final Action1 f57895a = new cp();

    private cp() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).dismissProgressDialog();
    }
}
