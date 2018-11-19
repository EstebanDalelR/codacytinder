package com.tinder.onboarding.presenter;

import com.tinder.onboarding.target.EmailStepTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.onboarding.presenter.z */
final /* synthetic */ class C14104z implements Action1 {
    /* renamed from: a */
    private final C13526y f44781a;
    /* renamed from: b */
    private final CharSequence f44782b;

    C14104z(C13526y c13526y, CharSequence charSequence) {
        this.f44781a = c13526y;
        this.f44782b = charSequence;
    }

    public void call(Object obj) {
        this.f44781a.m52868a(this.f44782b, (EmailStepTarget) obj);
    }
}
