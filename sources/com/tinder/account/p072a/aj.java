package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.aj */
final /* synthetic */ class aj implements Action1 {
    /* renamed from: a */
    static final Action1 f14593a = new aj();

    private aj() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showSimplePasswordHint();
    }
}
