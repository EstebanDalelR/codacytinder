package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.h */
final /* synthetic */ class C14091h implements Action1 {
    /* renamed from: a */
    static final Action1 f44763a = new C14091h();

    private C14091h() {
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).hideProgressDialog();
    }
}
