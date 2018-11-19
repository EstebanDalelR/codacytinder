package com.tinder.paywall.paywallflow;

import android.app.Activity;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.purchase.domain.model.Transaction;
import rx.functions.Action1;

/* renamed from: com.tinder.paywall.paywallflow.w */
final /* synthetic */ class C14129w implements Action1 {
    /* renamed from: a */
    private final C10079r f44831a;
    /* renamed from: b */
    private final Activity f44832b;
    /* renamed from: c */
    private final LegacyPaywall f44833c;
    /* renamed from: d */
    private final C10074a f44834d;
    /* renamed from: e */
    private final PaywallTypeSource f44835e;
    /* renamed from: f */
    private final PaywallFlowSuccessListener f44836f;

    C14129w(C10079r c10079r, Activity activity, LegacyPaywall legacyPaywall, C10074a c10074a, PaywallTypeSource paywallTypeSource, PaywallFlowSuccessListener paywallFlowSuccessListener) {
        this.f44831a = c10079r;
        this.f44832b = activity;
        this.f44833c = legacyPaywall;
        this.f44834d = c10074a;
        this.f44835e = paywallTypeSource;
        this.f44836f = paywallFlowSuccessListener;
    }

    public void call(Object obj) {
        this.f44831a.m41187a(this.f44832b, this.f44833c, this.f44834d, this.f44835e, this.f44836f, (Transaction) obj);
    }
}
