package com.tinder.paywall.paywallflow;

import com.tinder.paywall.paywallflow.LegacyPaywall.PurchaseListener;
import rx.functions.Action1;

/* renamed from: com.tinder.paywall.paywallflow.e */
final /* synthetic */ class C14126e implements Action1 {
    /* renamed from: a */
    private final PurchaseListener f44824a;

    private C14126e(PurchaseListener purchaseListener) {
        this.f44824a = purchaseListener;
    }

    /* renamed from: a */
    static Action1 m53841a(PurchaseListener purchaseListener) {
        return new C14126e(purchaseListener);
    }

    public void call(Object obj) {
        this.f44824a.handlePurchase((String) obj);
    }
}
