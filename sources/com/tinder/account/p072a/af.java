package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.af */
final /* synthetic */ class af implements Action1 {
    /* renamed from: a */
    static final Action1 f14589a = new af();

    private af() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showPasswordRequirementHint();
    }
}
