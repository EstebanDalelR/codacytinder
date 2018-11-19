package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import java8.util.Optional;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.c */
final /* synthetic */ class C14087c implements Action1 {
    /* renamed from: a */
    private final Optional f44660a;

    C14087c(Optional optional) {
        this.f44660a = optional;
    }

    public void call(Object obj) {
        BirthdayStepPresenter.m52669a(this.f44660a, (BirthdayStepTarget) obj);
    }
}
