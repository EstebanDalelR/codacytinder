package com.tinder.account.p072a;

import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.view.UpdateEmailPasswordTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.account.a.g */
final /* synthetic */ class C4408g implements Action1 {
    /* renamed from: a */
    private final Throwable f14609a;

    C4408g(Throwable th) {
        this.f14609a = th;
    }

    public void call(Object obj) {
        ((UpdateEmailPasswordTarget) obj).forwardUpdateException((UpdateAccountException) this.f14609a);
    }
}
