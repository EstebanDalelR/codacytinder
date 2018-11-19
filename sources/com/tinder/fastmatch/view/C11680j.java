package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C9399q;
import com.tinder.paywall.viewmodels.C10084g;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.j */
public final class C11680j implements MembersInjector<TinderGoldPaywallDialog> {
    /* renamed from: a */
    private final Provider<C9399q> f38176a;
    /* renamed from: b */
    private final Provider<C10084g> f38177b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47484a((TinderGoldPaywallDialog) obj);
    }

    /* renamed from: a */
    public void m47484a(TinderGoldPaywallDialog tinderGoldPaywallDialog) {
        C11680j.m47482a(tinderGoldPaywallDialog, (C9399q) this.f38176a.get());
        C11680j.m47483a(tinderGoldPaywallDialog, (C10084g) this.f38177b.get());
    }

    /* renamed from: a */
    public static void m47482a(TinderGoldPaywallDialog tinderGoldPaywallDialog, C9399q c9399q) {
        tinderGoldPaywallDialog.f38151a = c9399q;
    }

    /* renamed from: a */
    public static void m47483a(TinderGoldPaywallDialog tinderGoldPaywallDialog, C10084g c10084g) {
        tinderGoldPaywallDialog.f38152b = c10084g;
    }
}
