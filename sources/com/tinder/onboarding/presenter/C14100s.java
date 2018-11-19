package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.s */
final /* synthetic */ class C14100s implements Action1 {
    /* renamed from: a */
    static final Action1 f44776a = new C14100s();

    private C14100s() {
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).showUnderageError();
    }
}
