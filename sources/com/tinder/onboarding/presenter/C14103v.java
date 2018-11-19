package com.tinder.onboarding.presenter;

import com.tinder.onboarding.presenter.BirthdayStepPresenter.C12169c;
import com.tinder.onboarding.target.BirthdayStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.v */
final /* synthetic */ class C14103v implements Action1 {
    /* renamed from: a */
    private final C12169c f44779a;
    /* renamed from: b */
    private final Throwable f44780b;

    C14103v(C12169c c12169c, Throwable th) {
        this.f44779a = c12169c;
        this.f44780b = th;
    }

    public void call(Object obj) {
        this.f44779a.m48313a(this.f44780b, (BirthdayStepTarget) obj);
    }
}
