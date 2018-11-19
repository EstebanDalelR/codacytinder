package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

final /* synthetic */ class av implements Action1 {
    /* renamed from: a */
    private final Boolean f44639a;

    av(Boolean bool) {
        this.f44639a = bool;
    }

    public void call(Object obj) {
        ((EmailStepTarget) obj).showMarketingCheckbox(this.f44639a.booleanValue());
    }
}
