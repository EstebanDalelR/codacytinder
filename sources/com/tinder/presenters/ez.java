package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ez implements Action1 {
    /* renamed from: a */
    static final Action1 f57931a = new ez();

    private ez() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).setupProfileAndMatchesTab();
    }
}
