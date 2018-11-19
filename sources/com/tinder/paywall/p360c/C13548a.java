package com.tinder.paywall.p360c;

import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.target.PaywallLauncherTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.tinderplus.p428a.C15192e;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import rx.p500e.C19573b;

/* renamed from: com.tinder.paywall.c.a */
public class C13548a extends PresenterBase<PaywallLauncherTarget> {
    /* renamed from: a */
    private final C15192e f43270a;
    /* renamed from: b */
    private final OfferRepository f43271b;
    /* renamed from: c */
    private final C19573b f43272c = new C19573b();

    @Inject
    public C13548a(C15192e c15192e, OfferRepository offerRepository) {
        this.f43270a = c15192e;
        this.f43271b = offerRepository;
    }

    /* renamed from: a */
    public void m52940a() {
        super.a();
        this.f43272c.unsubscribe();
    }

    /* renamed from: a */
    public void m52941a(boolean z) {
        PaywallLauncherTarget paywallLauncherTarget = (PaywallLauncherTarget) H();
        if (paywallLauncherTarget != null) {
            this.f43272c.a(this.f43271b.observeOfferUpdates().a(bindToLifecycle()).a(RxUtils.a()).a(new C14124b(this, z, paywallLauncherTarget), C14125c.f44823a));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m52942a(boolean z, PaywallLauncherTarget paywallLauncherTarget, Void voidR) {
        if (z) {
            paywallLauncherTarget.launchPaywallFlow(C10076o.m41167a(PlusPaywallSource.DISCOUNT_NOTIFICATION));
        } else if (this.f43270a.a()) {
            paywallLauncherTarget.launchPaywallFlow(C10076o.m41167a(PlusPaywallSource.DISCOUNT_AVAILABLE));
        } else if (this.f43270a.e()) {
            paywallLauncherTarget.launchPaywallFlow(C10076o.m41167a(PlusPaywallSource.DISCOUNT_REMINDER));
        }
    }
}
