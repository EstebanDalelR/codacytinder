package com.tinder.onboarding.activity;

import com.tinder.onboarding.presenter.C13525x;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.activity.a */
public final class C12161a implements MembersInjector<CountdownActivity> {
    /* renamed from: a */
    private final Provider<C13525x> f39422a;

    public /* synthetic */ void injectMembers(Object obj) {
        m48310a((CountdownActivity) obj);
    }

    /* renamed from: a */
    public void m48310a(CountdownActivity countdownActivity) {
        C12161a.m48309a(countdownActivity, (C13525x) this.f39422a.get());
    }

    /* renamed from: a */
    public static void m48309a(CountdownActivity countdownActivity, C13525x c13525x) {
        countdownActivity.f45398b = c13525x;
    }
}
