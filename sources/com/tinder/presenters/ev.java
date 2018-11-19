package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ev implements Action1 {
    /* renamed from: a */
    static final Action1 f57930a = new ev();

    private ev() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).dismissVerificationDialog();
    }
}
