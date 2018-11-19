package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEventCode;
import org.joda.time.LocalDate;
import rx.functions.Action0;

/* renamed from: com.tinder.onboarding.presenter.n */
final /* synthetic */ class C14096n implements Action0 {
    /* renamed from: a */
    private final BirthdayStepPresenter f44768a;
    /* renamed from: b */
    private final LocalDate f44769b;
    /* renamed from: c */
    private final OnboardingEventCode f44770c;

    C14096n(BirthdayStepPresenter birthdayStepPresenter, LocalDate localDate, OnboardingEventCode onboardingEventCode) {
        this.f44768a = birthdayStepPresenter;
        this.f44769b = localDate;
        this.f44770c = onboardingEventCode;
    }

    public void call() {
        this.f44768a.m52684a(this.f44769b, this.f44770c);
    }
}
