package com.tinder.presenters;

import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.targets.MainActivityTarget;
import rx.functions.Action1;

final /* synthetic */ class fu implements Action1 {
    /* renamed from: a */
    private final C10076o f57945a;

    fu(C10076o c10076o) {
        this.f57945a = c10076o;
    }

    public void call(Object obj) {
        ((MainActivityTarget) obj).launchPaywall(this.f57945a);
    }
}
