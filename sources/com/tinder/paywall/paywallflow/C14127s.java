package com.tinder.paywall.paywallflow;

import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.purchase.domain.model.Transaction;
import java.lang.ref.WeakReference;
import rx.functions.Action1;

/* renamed from: com.tinder.paywall.paywallflow.s */
final /* synthetic */ class C14127s implements Action1 {
    /* renamed from: a */
    private final C10079r f44825a;
    /* renamed from: b */
    private final WeakReference f44826b;
    /* renamed from: c */
    private final PaywallTypeSource f44827c;
    /* renamed from: d */
    private final C10074a f44828d;
    /* renamed from: e */
    private final LegacyPaywall f44829e;

    C14127s(C10079r c10079r, WeakReference weakReference, PaywallTypeSource paywallTypeSource, C10074a c10074a, LegacyPaywall legacyPaywall) {
        this.f44825a = c10079r;
        this.f44826b = weakReference;
        this.f44827c = paywallTypeSource;
        this.f44828d = c10074a;
        this.f44829e = legacyPaywall;
    }

    public void call(Object obj) {
        this.f44825a.m41191a(this.f44826b, this.f44827c, this.f44828d, this.f44829e, (Transaction) obj);
    }
}
