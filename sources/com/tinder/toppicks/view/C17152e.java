package com.tinder.toppicks.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.toppicks.presenter.C15284a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.view.e */
public final class C17152e implements MembersInjector<TopPicksGoldView> {
    /* renamed from: a */
    private final Provider<LegacyPaywallLauncher> f52670a;
    /* renamed from: b */
    private final Provider<C15284a> f52671b;
    /* renamed from: c */
    private final Provider<Lifecycle> f52672c;

    public /* synthetic */ void injectMembers(Object obj) {
        m63022a((TopPicksGoldView) obj);
    }

    /* renamed from: a */
    public void m63022a(TopPicksGoldView topPicksGoldView) {
        C17152e.m63020a(topPicksGoldView, (LegacyPaywallLauncher) this.f52670a.get());
        C17152e.m63021a(topPicksGoldView, (C15284a) this.f52671b.get());
        C17152e.m63019a(topPicksGoldView, (Lifecycle) this.f52672c.get());
    }

    /* renamed from: a */
    public static void m63020a(TopPicksGoldView topPicksGoldView, LegacyPaywallLauncher legacyPaywallLauncher) {
        topPicksGoldView.f12529a = legacyPaywallLauncher;
    }

    /* renamed from: a */
    public static void m63021a(TopPicksGoldView topPicksGoldView, C15284a c15284a) {
        topPicksGoldView.f12530b = c15284a;
    }

    /* renamed from: a */
    public static void m63019a(TopPicksGoldView topPicksGoldView, Lifecycle lifecycle) {
        topPicksGoldView.f12531c = lifecycle;
    }
}
