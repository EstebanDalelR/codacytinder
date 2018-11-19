package com.tinder.superlike.p489d;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.R;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.presenters.PresenterBase;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.superlike.p419b.C15070b;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.superlike.target.SuperlikePaywallTarget;
import com.tinder.tinderplus.p428a.C15193i;
import javax.inject.Inject;

/* renamed from: com.tinder.superlike.d.a */
public class C18189a extends PresenterBase<SuperlikePaywallTarget> {
    /* renamed from: a */
    private final C15193i f56390a;
    /* renamed from: b */
    private final C15071e f56391b;
    /* renamed from: c */
    private final C15070b f56392c;
    /* renamed from: d */
    private final C10057a f56393d;
    /* renamed from: e */
    private final OfferRepository f56394e;
    @Nullable
    /* renamed from: f */
    private C10075b f56395f;

    @Inject
    public C18189a(C15193i c15193i, C15071e c15071e, C15070b c15070b, C10057a c10057a, OfferRepository offerRepository) {
        this.f56390a = c15193i;
        this.f56391b = c15071e;
        this.f56392c = c15070b;
        this.f56393d = c10057a;
        this.f56394e = offerRepository;
    }

    /* renamed from: a */
    public void m65947a(int i, @Nullable C10075b c10075b) {
        this.f56395f = c10075b;
        this.f56392c.m56809a(i);
        this.f56391b.m56822e();
    }

    /* renamed from: b */
    public void m65949b() {
        SuperlikePaywallTarget superlikePaywallTarget = (SuperlikePaywallTarget) H();
        Object offers = this.f56394e.getOffers(ProductType.SUPERLIKE);
        if (superlikePaywallTarget != null) {
            if (!C2641a.a(offers)) {
                SuperlikeStatus b = this.f56391b.m56818b();
                if (b != null) {
                    superlikePaywallTarget.displayPaywall(offers, ColorScheme.BLUE, PaywallItemViewModelColor.BLUE);
                    if (m65944d()) {
                        superlikePaywallTarget.startCountdownTimer(b.resetDateInMillis());
                    } else {
                        superlikePaywallTarget.showDefaultHeader();
                        superlikePaywallTarget.hideCountdownTimer();
                    }
                    if (this.f56390a.m57121a()) {
                        superlikePaywallTarget.hideTinderPlusUpsellSection();
                    } else {
                        superlikePaywallTarget.showTinderPlusUpsellSection(this.f56393d.a(R.plurals.superlike_tinder_plus_upsell_button_description, b));
                    }
                    this.f56392c.m56813c();
                }
            }
        }
    }

    /* renamed from: a */
    public void m65945a(int i) {
        SuperlikePaywallTarget superlikePaywallTarget = (SuperlikePaywallTarget) H();
        if (superlikePaywallTarget != null) {
            if (!m65944d()) {
                superlikePaywallTarget.showStarIcon(i);
            } else if (this.f56395f != null) {
                superlikePaywallTarget.showOutOfSuperlikesHeader(this.f56395f.a());
                superlikePaywallTarget.displayUserImage(i, this.f56395f.b());
            }
        }
    }

    /* renamed from: a */
    public void m65946a(int i, int i2) {
        SuperlikePaywallTarget superlikePaywallTarget = (SuperlikePaywallTarget) H();
        if (superlikePaywallTarget != null) {
            if (m65944d()) {
                superlikePaywallTarget.hideStarAnimation();
            } else {
                superlikePaywallTarget.startStarAnimation(i, i2);
            }
        }
    }

    /* renamed from: a */
    public void m65948a(@NonNull C14510e c14510e) {
        this.f56392c.m56810a(c14510e);
    }

    /* renamed from: c */
    public void m65950c() {
        this.f56392c.m56811b();
    }

    /* renamed from: d */
    private boolean m65944d() {
        return this.f56391b.m56820c() && this.f56392c.m56808a() == 4;
    }
}
