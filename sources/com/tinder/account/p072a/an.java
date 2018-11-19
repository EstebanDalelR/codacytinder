package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.an */
final /* synthetic */ class an implements Action1 {
    /* renamed from: a */
    static final Action1 f14597a = new an();

    private an() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showPasswordRequirementHint();
    }
}
