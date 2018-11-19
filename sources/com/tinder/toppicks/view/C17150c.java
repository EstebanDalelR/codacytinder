package com.tinder.toppicks.view;

import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.C16995d;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.view.c */
public final class C17150c implements MembersInjector<GoldShimmerTimerView> {
    /* renamed from: a */
    private final Provider<C16995d> f52668a;
    /* renamed from: b */
    private final Provider<C15256e> f52669b;

    public /* synthetic */ void injectMembers(Object obj) {
        m63018a((GoldShimmerTimerView) obj);
    }

    /* renamed from: a */
    public void m63018a(GoldShimmerTimerView goldShimmerTimerView) {
        C17150c.m63016a(goldShimmerTimerView, (C16995d) this.f52668a.get());
        C17150c.m63017a(goldShimmerTimerView, (C15256e) this.f52669b.get());
    }

    /* renamed from: a */
    public static void m63016a(GoldShimmerTimerView goldShimmerTimerView, C16995d c16995d) {
        goldShimmerTimerView.f47474a = c16995d;
    }

    /* renamed from: a */
    public static void m63017a(GoldShimmerTimerView goldShimmerTimerView, C15256e c15256e) {
        goldShimmerTimerView.f47475b = c15256e;
    }
}
