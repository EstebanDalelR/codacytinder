package com.tinder.onboarding.repository;

import com.tinder.onboarding.model.OnboardingUser;
import rx.functions.Func1;

/* renamed from: com.tinder.onboarding.repository.z */
final /* synthetic */ class C13533z implements Func1 {
    /* renamed from: a */
    private final C12187s f43231a;
    /* renamed from: b */
    private final OnboardingUser f43232b;

    C13533z(C12187s c12187s, OnboardingUser onboardingUser) {
        this.f43231a = c12187s;
        this.f43232b = onboardingUser;
    }

    public Object call(Object obj) {
        return this.f43231a.m48339a(this.f43232b, (String) obj);
    }
}
