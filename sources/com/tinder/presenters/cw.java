package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cw implements Action1 {
    /* renamed from: a */
    static final Action1 f57900a = new cw();

    private cw() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).dismissProgressDialog();
    }
}
