package com.tinder.activities;

import com.tinder.managers.ManagerDeepLinking.DeepLinkListener;
import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;

class MainActivity$2 implements DeepLinkListener {
    /* renamed from: a */
    final /* synthetic */ MainActivity f26198a;

    MainActivity$2(MainActivity mainActivity) {
        this.f26198a = mainActivity;
    }

    public void launchTinderPlusPaywall() {
        C10076o.a(PlusPaywallSource.DEEPLINK_PLUS).a(this.f26198a);
    }

    public void launchBoostPaywall() {
        C10076o.a(BoostPaywallSource.DEEPLINK_BOOST).a(this.f26198a);
    }

    public void launchTinderGoldPaywall() {
        C10076o.a(GoldPaywallSource.DEEPLINK).a(this.f26198a);
    }
}
