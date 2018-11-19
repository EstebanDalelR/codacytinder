package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ga implements Action1 {
    /* renamed from: a */
    static final Action1 f57949a = new ga();

    private ga() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showTinderGoldIntro();
    }
}
