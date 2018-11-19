package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import java8.util.Optional;
import rx.functions.Action1;

final /* synthetic */ class cr implements Action1 {
    /* renamed from: a */
    static final Action1 f57897a = new cr();

    private cr() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showLoginFailedDialog(Optional.m59119a());
    }
}
