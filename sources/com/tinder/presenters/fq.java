package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fq implements Action1 {
    /* renamed from: a */
    static final Action1 f57941a = new fq();

    private fq() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showCrashApologyDialog();
    }
}
