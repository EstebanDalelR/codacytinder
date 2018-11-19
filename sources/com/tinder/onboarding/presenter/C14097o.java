package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEventCode;
import org.joda.time.LocalDate;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.o */
final /* synthetic */ class C14097o implements Action1 {
    /* renamed from: a */
    private final BirthdayStepPresenter f44771a;
    /* renamed from: b */
    private final LocalDate f44772b;
    /* renamed from: c */
    private final OnboardingEventCode f44773c;

    C14097o(BirthdayStepPresenter birthdayStepPresenter, LocalDate localDate, OnboardingEventCode onboardingEventCode) {
        this.f44771a = birthdayStepPresenter;
        this.f44772b = localDate;
        this.f44773c = onboardingEventCode;
    }

    public void call(Object obj) {
        this.f44771a.m52685a(this.f44772b, this.f44773c, (Throwable) obj);
    }
}
