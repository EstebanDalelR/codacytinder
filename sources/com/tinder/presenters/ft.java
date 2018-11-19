package com.tinder.presenters;

import com.tinder.R;
import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class ft implements Action1 {
    /* renamed from: a */
    static final Action1 f57944a = new ft();

    private ft() {
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).showSnackbar(R.string.purchase_failure_no_offers);
    }
}
