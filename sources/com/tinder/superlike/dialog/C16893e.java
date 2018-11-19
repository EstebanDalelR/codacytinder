package com.tinder.superlike.dialog;

import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.superlike.p489d.C18189a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.dialog.e */
public final class C16893e implements MembersInjector<SuperlikePaywallDialog> {
    /* renamed from: a */
    private final Provider<C18189a> f52053a;
    /* renamed from: b */
    private final Provider<C10084g> f52054b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62490a((SuperlikePaywallDialog) obj);
    }

    /* renamed from: a */
    public void m62490a(SuperlikePaywallDialog superlikePaywallDialog) {
        C16893e.m62489a(superlikePaywallDialog, (C18189a) this.f52053a.get());
        C16893e.m62488a(superlikePaywallDialog, (C10084g) this.f52054b.get());
    }

    /* renamed from: a */
    public static void m62489a(SuperlikePaywallDialog superlikePaywallDialog, C18189a c18189a) {
        superlikePaywallDialog.f56397a = c18189a;
    }

    /* renamed from: a */
    public static void m62488a(SuperlikePaywallDialog superlikePaywallDialog, C10084g c10084g) {
        superlikePaywallDialog.f56398b = c10084g;
    }
}
