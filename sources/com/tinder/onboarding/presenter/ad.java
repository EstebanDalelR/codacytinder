package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEmail;
import rx.functions.Func1;

final /* synthetic */ class ad implements Func1 {
    /* renamed from: a */
    private final C13526y f43132a;
    /* renamed from: b */
    private final String f43133b;
    /* renamed from: c */
    private final boolean f43134c;

    ad(C13526y c13526y, String str, boolean z) {
        this.f43132a = c13526y;
        this.f43133b = str;
        this.f43134c = z;
    }

    public Object call(Object obj) {
        return this.f43132a.m52862a(this.f43133b, this.f43134c, (OnboardingEmail) obj);
    }
}
