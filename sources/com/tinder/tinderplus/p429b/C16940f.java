package com.tinder.tinderplus.p429b;

import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.views.FeatureRow;

/* renamed from: com.tinder.tinderplus.b.f */
final /* synthetic */ class C16940f implements PaywallFlowSuccessListener {
    /* renamed from: a */
    private final C18211a f52218a;
    /* renamed from: b */
    private final String f52219b;
    /* renamed from: c */
    private final FeatureRow f52220c;

    C16940f(C18211a c18211a, String str, FeatureRow featureRow) {
        this.f52218a = c18211a;
        this.f52219b = str;
        this.f52220c = featureRow;
    }

    public void handleSuccess() {
        this.f52218a.m66029a(this.f52219b, this.f52220c);
    }
}
