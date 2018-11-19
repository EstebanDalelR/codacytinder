package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.paywallflow.LegacyPaywall.DismissListener;

/* renamed from: com.tinder.paywall.paywallflow.v */
final /* synthetic */ class C12282v implements DismissListener {
    /* renamed from: a */
    private final PaywallFlowFailureListener f39729a;

    C12282v(PaywallFlowFailureListener paywallFlowFailureListener) {
        this.f39729a = paywallFlowFailureListener;
    }

    public void handleDismiss() {
        C10079r.m41180a(this.f39729a);
    }
}
