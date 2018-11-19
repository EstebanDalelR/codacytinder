package com.tinder.paywall.paywallflow;

import android.app.Activity;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.paywall.paywallflow.LegacyPaywall.PurchaseListener;

/* renamed from: com.tinder.paywall.paywallflow.u */
final /* synthetic */ class C12281u implements PurchaseListener {
    /* renamed from: a */
    private final C10079r f39723a;
    /* renamed from: b */
    private final Activity f39724b;
    /* renamed from: c */
    private final LegacyPaywall f39725c;
    /* renamed from: d */
    private final C10074a f39726d;
    /* renamed from: e */
    private final PaywallTypeSource f39727e;
    /* renamed from: f */
    private final PaywallFlowSuccessListener f39728f;

    C12281u(C10079r c10079r, Activity activity, LegacyPaywall legacyPaywall, C10074a c10074a, PaywallTypeSource paywallTypeSource, PaywallFlowSuccessListener paywallFlowSuccessListener) {
        this.f39723a = c10079r;
        this.f39724b = activity;
        this.f39725c = legacyPaywall;
        this.f39726d = c10074a;
        this.f39727e = paywallTypeSource;
        this.f39728f = paywallFlowSuccessListener;
    }

    public void handlePurchase(String str) {
        this.f39723a.m41188a(this.f39724b, this.f39725c, this.f39726d, this.f39727e, this.f39728f, str);
    }
}
