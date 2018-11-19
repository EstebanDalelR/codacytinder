package com.tinder.profiletab.presenter;

import com.tinder.boost.p178a.C10400d;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;

/* renamed from: com.tinder.profiletab.presenter.j */
final /* synthetic */ class C16187j implements PaywallFlowSuccessListener {
    /* renamed from: a */
    private final C10400d f50414a;

    private C16187j(C10400d c10400d) {
        this.f50414a = c10400d;
    }

    /* renamed from: a */
    static PaywallFlowSuccessListener m61147a(C10400d c10400d) {
        return new C16187j(c10400d);
    }

    public void handleSuccess() {
        this.f50414a.j();
    }
}
