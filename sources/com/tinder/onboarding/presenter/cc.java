package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.GenderSelection;
import rx.functions.Action1;

final /* synthetic */ class cc implements Action1 {
    /* renamed from: a */
    private final by f44663a;
    /* renamed from: b */
    private final GenderSelection f44664b;

    cc(by byVar, GenderSelection genderSelection) {
        this.f44663a = byVar;
        this.f44664b = genderSelection;
    }

    public void call(Object obj) {
        this.f44663a.m52716a(this.f44664b, (Throwable) obj);
    }
}
