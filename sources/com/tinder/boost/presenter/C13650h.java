package com.tinder.boost.presenter;

import p000a.p001a.C0001a;
import rx.functions.Action1;

/* renamed from: com.tinder.boost.presenter.h */
final /* synthetic */ class C13650h implements Action1 {
    /* renamed from: a */
    static final Action1 f43493a = new C13650h();

    private C13650h() {
    }

    public void call(Object obj) {
        C0001a.c((Throwable) obj, "Error on BoostPaywallDialog BoostStateProvider: %s", new Object[]{((Throwable) obj).getMessage()});
    }
}
