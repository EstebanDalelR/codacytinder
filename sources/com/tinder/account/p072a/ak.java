package com.tinder.account.p072a;

import com.tinder.account.view.UpdatePasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.ak */
final /* synthetic */ class ak implements Action1 {
    /* renamed from: a */
    static final Action1 f14594a = new ak();

    private ak() {
    }

    public void call(Object obj) {
        ((UpdatePasswordTarget) obj).showPasswordRequirementHint();
    }
}
