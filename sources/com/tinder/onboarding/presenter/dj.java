package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.NameStepTarget;
import java8.util.function.Consumer;

final /* synthetic */ class dj implements Consumer {
    /* renamed from: a */
    private final NameStepTarget f39453a;

    private dj(NameStepTarget nameStepTarget) {
        this.f39453a = nameStepTarget;
    }

    /* renamed from: a */
    static Consumer m48314a(NameStepTarget nameStepTarget) {
        return new dj(nameStepTarget);
    }

    public void accept(Object obj) {
        this.f39453a.setNameText((String) obj);
    }
}
