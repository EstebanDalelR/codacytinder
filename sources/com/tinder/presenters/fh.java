package com.tinder.presenters;

import com.tinder.main.model.MainPage;
import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fh implements Action1 {
    /* renamed from: a */
    static final Action1 f57938a = new fh();

    private fh() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showPage(MainPage.FEED);
    }
}
