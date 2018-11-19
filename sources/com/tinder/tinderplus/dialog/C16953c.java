package com.tinder.tinderplus.dialog;

import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.p429b.C15201k;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.dialog.c */
public final class C16953c implements MembersInjector<TinderPlusPaywallDialog> {
    /* renamed from: a */
    private final Provider<C15201k> f52254a;
    /* renamed from: b */
    private final Provider<C15071e> f52255b;
    /* renamed from: c */
    private final Provider<LikeStatusProvider> f52256c;
    /* renamed from: d */
    private final Provider<C10084g> f52257d;

    public /* synthetic */ void injectMembers(Object obj) {
        m62650a((TinderPlusPaywallDialog) obj);
    }

    /* renamed from: a */
    public void m62650a(TinderPlusPaywallDialog tinderPlusPaywallDialog) {
        C16953c.m62648a(tinderPlusPaywallDialog, (C15201k) this.f52254a.get());
        C16953c.m62647a(tinderPlusPaywallDialog, (C15071e) this.f52255b.get());
        C16953c.m62649a(tinderPlusPaywallDialog, (LikeStatusProvider) this.f52256c.get());
        C16953c.m62646a(tinderPlusPaywallDialog, (C10084g) this.f52257d.get());
    }

    /* renamed from: a */
    public static void m62648a(TinderPlusPaywallDialog tinderPlusPaywallDialog, C15201k c15201k) {
        tinderPlusPaywallDialog.f52228a = c15201k;
    }

    /* renamed from: a */
    public static void m62647a(TinderPlusPaywallDialog tinderPlusPaywallDialog, C15071e c15071e) {
        tinderPlusPaywallDialog.f52229b = c15071e;
    }

    /* renamed from: a */
    public static void m62649a(TinderPlusPaywallDialog tinderPlusPaywallDialog, LikeStatusProvider likeStatusProvider) {
        tinderPlusPaywallDialog.f52230c = likeStatusProvider;
    }

    /* renamed from: a */
    public static void m62646a(TinderPlusPaywallDialog tinderPlusPaywallDialog, C10084g c10084g) {
        tinderPlusPaywallDialog.f52231d = c10084g;
    }
}
