package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingUser;
import rx.functions.Action1;
import rx.subjects.C19785a;

/* renamed from: com.tinder.onboarding.repository.v */
final /* synthetic */ class C14107v implements Action1 {
    /* renamed from: a */
    private final C19785a f44790a;

    private C14107v(C19785a c19785a) {
        this.f44790a = c19785a;
    }

    /* renamed from: a */
    static Action1 m53825a(C19785a c19785a) {
        return new C14107v(c19785a);
    }

    public void call(Object obj) {
        this.f44790a.onNext((OnboardingUser) obj);
    }
}
