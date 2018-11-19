package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.e */
final /* synthetic */ class C14090e implements Action1 {
    /* renamed from: a */
    static final Action1 f44700a = new C14090e();

    private C14090e() {
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).disableFocusForFields();
    }
}
