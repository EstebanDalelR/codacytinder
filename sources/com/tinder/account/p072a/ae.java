package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.ae */
final /* synthetic */ class ae implements Action1 {
    /* renamed from: a */
    static final Action1 f14588a = new ae();

    private ae() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showSimplePasswordHint();
    }
}
