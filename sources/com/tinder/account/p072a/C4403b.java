package com.tinder.account.p072a;

import com.tinder.account.view.UpdateAccountPage;
import com.tinder.account.view.UpdateEmailPasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.b */
final /* synthetic */ class C4403b implements Action1 {
    /* renamed from: a */
    private final UpdateAccountPage f14603a;

    C4403b(UpdateAccountPage updateAccountPage) {
        this.f14603a = updateAccountPage;
    }

    public void call(Object obj) {
        ((UpdateEmailPasswordTarget) obj).showCancelDialog(this.f14603a.getCancelWarningResId());
    }
}
