package com.tinder.onboarding.presenter;

import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.model.OnboardingPassword;
import rx.functions.Func1;

final /* synthetic */ class fb implements Func1 {
    /* renamed from: a */
    private final C9965a f43187a;

    private fb(C9965a c9965a) {
        this.f43187a = c9965a;
    }

    /* renamed from: a */
    static Func1 m52834a(C9965a c9965a) {
        return new fb(c9965a);
    }

    public Object call(Object obj) {
        return this.f43187a.m40933a((OnboardingPassword) obj);
    }
}
