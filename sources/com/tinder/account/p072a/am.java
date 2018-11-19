package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.am */
final /* synthetic */ class am implements Action1 {
    /* renamed from: a */
    static final Action1 f14596a = new am();

    private am() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).disableSubmitButton();
    }
}
