package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cl implements Action1 {
    /* renamed from: a */
    static final Action1 f57891a = new cl();

    private cl() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).launchFacebookAuth();
    }
}
