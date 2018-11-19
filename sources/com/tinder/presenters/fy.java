package com.tinder.presenters;

import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fy implements Action1 {
    /* renamed from: a */
    static final Action1 f57948a = new fy();

    private fy() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showBitmojiIntroDialog();
    }
}
