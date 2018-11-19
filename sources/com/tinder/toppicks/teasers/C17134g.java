package com.tinder.toppicks.teasers;

import android.arch.lifecycle.Lifecycle;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.teasers.g */
public final class C17134g implements MembersInjector<TopPicksTeasersView> {
    /* renamed from: a */
    private final Provider<C15299c> f52643a;
    /* renamed from: b */
    private final Provider<LegacyPaywallLauncher> f52644b;
    /* renamed from: c */
    private final Provider<Lifecycle> f52645c;

    public /* synthetic */ void injectMembers(Object obj) {
        m63003a((TopPicksTeasersView) obj);
    }

    /* renamed from: a */
    public void m63003a(TopPicksTeasersView topPicksTeasersView) {
        C17134g.m63002a(topPicksTeasersView, (C15299c) this.f52643a.get());
        C17134g.m63001a(topPicksTeasersView, (LegacyPaywallLauncher) this.f52644b.get());
        C17134g.m63000a(topPicksTeasersView, (Lifecycle) this.f52645c.get());
    }

    /* renamed from: a */
    public static void m63002a(TopPicksTeasersView topPicksTeasersView, C15299c c15299c) {
        topPicksTeasersView.f12523a = c15299c;
    }

    /* renamed from: a */
    public static void m63001a(TopPicksTeasersView topPicksTeasersView, LegacyPaywallLauncher legacyPaywallLauncher) {
        topPicksTeasersView.f12524b = legacyPaywallLauncher;
    }

    /* renamed from: a */
    public static void m63000a(TopPicksTeasersView topPicksTeasersView, Lifecycle lifecycle) {
        topPicksTeasersView.f12525c = lifecycle;
    }
}
