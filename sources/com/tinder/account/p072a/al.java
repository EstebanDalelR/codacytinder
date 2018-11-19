package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.al */
final /* synthetic */ class al implements Action1 {
    /* renamed from: a */
    static final Action1 f14595a = new al();

    private al() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).enableSubmitButton();
    }
}
