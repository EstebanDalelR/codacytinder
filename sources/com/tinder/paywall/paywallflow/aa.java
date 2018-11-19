package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.paywallflow.LegacyPaywall.DismissListener;

final /* synthetic */ class aa implements DismissListener {
    /* renamed from: a */
    private final PaywallFlowSuccessListener f39690a;

    aa(PaywallFlowSuccessListener paywallFlowSuccessListener) {
        this.f39690a = paywallFlowSuccessListener;
    }

    public void handleDismiss() {
        C10079r.m41181a(this.f39690a);
    }
}
