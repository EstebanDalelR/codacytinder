package com.tinder.boost.dialog;

import com.tinder.boost.presenter.C12628f;
import com.tinder.paywall.viewmodels.C10084g;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.dialog.c */
public final class C10416c implements MembersInjector<BoostPaywallDialog> {
    /* renamed from: a */
    private final Provider<C12628f> f33979a;
    /* renamed from: b */
    private final Provider<C10084g> f33980b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42294a((BoostPaywallDialog) obj);
    }

    /* renamed from: a */
    public void m42294a(BoostPaywallDialog boostPaywallDialog) {
        C10416c.m42292a(boostPaywallDialog, (C12628f) this.f33979a.get());
        C10416c.m42293a(boostPaywallDialog, (C10084g) this.f33980b.get());
    }

    /* renamed from: a */
    public static void m42292a(BoostPaywallDialog boostPaywallDialog, C12628f c12628f) {
        boostPaywallDialog.f43476a = c12628f;
    }

    /* renamed from: a */
    public static void m42293a(BoostPaywallDialog boostPaywallDialog, C10084g c10084g) {
        boostPaywallDialog.f43477b = c10084g;
    }
}
