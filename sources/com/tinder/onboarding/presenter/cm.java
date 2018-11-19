package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEventCode;

final /* synthetic */ class cm implements Runnable {
    /* renamed from: a */
    private final by f32816a;
    /* renamed from: b */
    private final OnboardingEventCode f32817b;

    cm(by byVar, OnboardingEventCode onboardingEventCode) {
        this.f32816a = byVar;
        this.f32817b = onboardingEventCode;
    }

    public void run() {
        this.f32816a.m52717a(this.f32817b);
    }
}
