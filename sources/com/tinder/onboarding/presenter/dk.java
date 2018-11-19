package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.NameStepTarget;

final /* synthetic */ class dk implements Runnable {
    /* renamed from: a */
    private final NameStepTarget f32820a;

    private dk(NameStepTarget nameStepTarget) {
        this.f32820a = nameStepTarget;
    }

    /* renamed from: a */
    static Runnable m40952a(NameStepTarget nameStepTarget) {
        return new dk(nameStepTarget);
    }

    public void run() {
        this.f32820a.disableContinueButton();
    }
}
