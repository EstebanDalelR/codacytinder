package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.BirthdayStepTarget;
import org.joda.time.LocalDate;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.u */
final /* synthetic */ class C14102u implements Action1 {
    /* renamed from: a */
    private final LocalDate f44778a;

    C14102u(LocalDate localDate) {
        this.f44778a = localDate;
    }

    public void call(Object obj) {
        ((BirthdayStepTarget) obj).setBirthday(this.f44778a);
    }
}
