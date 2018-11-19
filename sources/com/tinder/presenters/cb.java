package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import java8.util.Optional;
import rx.functions.Action1;

final /* synthetic */ class cb implements Action1 {
    /* renamed from: a */
    static final Action1 f57881a = new cb();

    private cb() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showLoginFailedDialog(Optional.m59119a());
    }
}
