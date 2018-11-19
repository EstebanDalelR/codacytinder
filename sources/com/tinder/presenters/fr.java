package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fr implements Action1 {
    /* renamed from: a */
    static final Action1 f57942a = new fr();

    private fr() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showAppRatingDialog();
    }
}
