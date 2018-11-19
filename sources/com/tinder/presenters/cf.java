package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class cf implements Action1 {
    /* renamed from: a */
    static final Action1 f57885a = new cf();

    private cf() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showProgressDialog();
    }
}
