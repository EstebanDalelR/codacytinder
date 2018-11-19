package com.tinder.onboarding.presenter;

import java8.util.function.Consumer;
import org.joda.time.LocalDate;

/* renamed from: com.tinder.onboarding.presenter.f */
final /* synthetic */ class C12170f implements Consumer {
    /* renamed from: a */
    private final BirthdayStepPresenter f39459a;

    C12170f(BirthdayStepPresenter birthdayStepPresenter) {
        this.f39459a = birthdayStepPresenter;
    }

    public void accept(Object obj) {
        this.f39459a.m52690c((LocalDate) obj);
    }
}
