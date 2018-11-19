package com.tinder.toppicks.exhausted;

import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.exhausted.d */
public final class C17023d implements MembersInjector<TopPicksExhaustedView> {
    /* renamed from: a */
    private final Provider<C15265b> f52464a;
    /* renamed from: b */
    private final Provider<TopPicksPaywallViewFactory> f52465b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62814a((TopPicksExhaustedView) obj);
    }

    /* renamed from: a */
    public void m62814a(TopPicksExhaustedView topPicksExhaustedView) {
        C17023d.m62813a(topPicksExhaustedView, (C15265b) this.f52464a.get());
        C17023d.m62812a(topPicksExhaustedView, (TopPicksPaywallViewFactory) this.f52465b.get());
    }

    /* renamed from: a */
    public static void m62813a(TopPicksExhaustedView topPicksExhaustedView, C15265b c15265b) {
        topPicksExhaustedView.f52454a = c15265b;
    }

    /* renamed from: a */
    public static void m62812a(TopPicksExhaustedView topPicksExhaustedView, TopPicksPaywallViewFactory topPicksPaywallViewFactory) {
        topPicksExhaustedView.f52455b = topPicksPaywallViewFactory;
    }
}
