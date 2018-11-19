package com.tinder.boost.presenter;

import com.tinder.boost.model.BoostState;
import com.tinder.boost.target.BoostUpdateTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.boost.presenter.t */
final /* synthetic */ class C13651t implements Action1 {
    /* renamed from: a */
    private final BoostUpdateTarget f43494a;

    C13651t(BoostUpdateTarget boostUpdateTarget) {
        this.f43494a = boostUpdateTarget;
    }

    public void call(Object obj) {
        C12633s.m49879a(this.f43494a, (BoostState) obj);
    }
}
