package com.tinder.toppicks.counter;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.counter.d */
public final class C16993d implements MembersInjector<TopPicksBottomCounterView> {
    /* renamed from: a */
    private final Provider<C15237a> f52398a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62759a((TopPicksBottomCounterView) obj);
    }

    /* renamed from: a */
    public void m62759a(TopPicksBottomCounterView topPicksBottomCounterView) {
        C16993d.m62758a(topPicksBottomCounterView, (C15237a) this.f52398a.get());
    }

    /* renamed from: a */
    public static void m62758a(TopPicksBottomCounterView topPicksBottomCounterView, C15237a c15237a) {
        topPicksBottomCounterView.f52389a = c15237a;
    }
}
