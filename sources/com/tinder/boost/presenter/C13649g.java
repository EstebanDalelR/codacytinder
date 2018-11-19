package com.tinder.boost.presenter;

import com.tinder.boost.model.BoostState;
import com.tinder.boost.target.BoostPaywallTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.boost.presenter.g */
final /* synthetic */ class C13649g implements Action1 {
    /* renamed from: a */
    private final BoostPaywallTarget f43492a;

    C13649g(BoostPaywallTarget boostPaywallTarget) {
        this.f43492a = boostPaywallTarget;
    }

    public void call(Object obj) {
        C12628f.m49856a(this.f43492a, (BoostState) obj);
    }
}
