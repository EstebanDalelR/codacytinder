package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.l */
final /* synthetic */ class C14094l implements Action1 {
    /* renamed from: a */
    static final Action1 f44766a = new C14094l();

    private C14094l() {
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).showProgressDialog();
    }
}
