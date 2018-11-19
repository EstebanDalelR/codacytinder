package com.tinder.presenters;

import com.tinder.targets.LoginTarget;
import rx.functions.Action1;

final /* synthetic */ class bx implements Action1 {
    /* renamed from: a */
    static final Action1 f57877a = new bx();

    private bx() {
    }

    public void call(Object obj) {
        ((LoginTarget) obj).showProgressDialog();
    }
}
