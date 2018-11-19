package com.tinder.boost.presenter;

import com.tinder.boost.target.BoostPaywallTarget;
import com.tinder.domain.profile.model.TutorialViewStatus;
import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.boost.presenter.l */
final /* synthetic */ class C10436l implements Consumer {
    /* renamed from: a */
    private final C12628f f34017a;
    /* renamed from: b */
    private final boolean f34018b;
    /* renamed from: c */
    private final BoostPaywallTarget f34019c;

    C10436l(C12628f c12628f, boolean z, BoostPaywallTarget boostPaywallTarget) {
        this.f34017a = c12628f;
        this.f34018b = z;
        this.f34019c = boostPaywallTarget;
    }

    public void accept(Object obj) {
        this.f34017a.m49869a(this.f34018b, this.f34019c, (TutorialViewStatus) obj);
    }
}
