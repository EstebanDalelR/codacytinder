package com.tinder.tinderplus.p429b;

import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.tinderplus.target.TinderPlusControlTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.tinderplus.b.e */
final /* synthetic */ class C18974e implements Action1 {
    /* renamed from: a */
    private final C10076o f58671a;

    C18974e(C10076o c10076o) {
        this.f58671a = c10076o;
    }

    public void call(Object obj) {
        ((TinderPlusControlTarget) obj).launchPaywallFlow(this.f58671a);
    }
}
