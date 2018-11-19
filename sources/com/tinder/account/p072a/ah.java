package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.ah */
final /* synthetic */ class ah implements Action1 {
    /* renamed from: a */
    static final Action1 f14591a = new ah();

    private ah() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showStrongPasswordHint();
    }
}
