package com.tinder.intropricing.paywall.view;

import com.tinder.intropricing.paywall.p265a.C9734a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.intropricing.paywall.view.a */
public final class C11890a implements MembersInjector<IntroPricingPaywallView> {
    /* renamed from: a */
    private final Provider<C9734a> f38749a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47877a((IntroPricingPaywallView) obj);
    }

    /* renamed from: a */
    public void m47877a(IntroPricingPaywallView introPricingPaywallView) {
        C11890a.m47876a(introPricingPaywallView, (C9734a) this.f38749a.get());
    }

    /* renamed from: a */
    public static void m47876a(IntroPricingPaywallView introPricingPaywallView, C9734a c9734a) {
        introPricingPaywallView.f38741b = c9734a;
    }
}
