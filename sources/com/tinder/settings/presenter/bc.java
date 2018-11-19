package com.tinder.settings.presenter;

import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.settings.targets.SettingsTarget;
import rx.functions.Action1;

final /* synthetic */ class bc implements Action1 {
    /* renamed from: a */
    static final Action1 f58432a = new bc();

    private bc() {
    }

    public void call(Object obj) {
        ((SettingsTarget) obj).launchPaywallFlow(C10076o.a(BoostPaywallSource.SETTINGS_BOOST_BUTTON));
    }
}
