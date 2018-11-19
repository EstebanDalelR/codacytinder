package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cz implements Action1 {
    /* renamed from: a */
    static final Action1 f57903a = new cz();

    private cz() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).launchActivityMain();
    }
}
