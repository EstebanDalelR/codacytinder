package com.tinder.onboarding.presenter;

import com.tinder.onboarding.presenter.BirthdayStepPresenter.C9973b;
import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.onboarding.presenter.j */
final /* synthetic */ class C14092j implements Action1 {
    /* renamed from: a */
    private final C19785a f44764a;

    private C14092j(C19785a c19785a) {
        this.f44764a = c19785a;
    }

    /* renamed from: a */
    static Action1 m53820a(C19785a c19785a) {
        return new C14092j(c19785a);
    }

    public void call(Object obj) {
        this.f44764a.onNext((C9973b) obj);
    }
}
