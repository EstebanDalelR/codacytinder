package com.tinder.boost.presenter;

import com.tinder.R;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C8337b;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.target.BoostSummaryTarget;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.boost.model.BoostStatusExt;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.presenters.PresenterBase;
import com.tinder.tinderplus.p428a.C15193i;
import javax.inject.Inject;

/* renamed from: com.tinder.boost.presenter.r */
public class C12629r extends PresenterBase<BoostSummaryTarget> {
    /* renamed from: a */
    private final C15193i f40748a;
    /* renamed from: b */
    private final C10400d f40749b;
    /* renamed from: c */
    private final C10057a f40750c;
    /* renamed from: d */
    private final C8337b f40751d;
    /* renamed from: e */
    private final C2639c f40752e;

    @Inject
    public C12629r(C15193i c15193i, C10400d c10400d, C10057a c10057a, C8337b c8337b, C2639c c2639c) {
        this.f40748a = c15193i;
        this.f40749b = c10400d;
        this.f40750c = c10057a;
        this.f40751d = c8337b;
        this.f40752e = c2639c;
    }

    /* renamed from: b */
    public void m49873b() {
        BoostSummaryTarget boostSummaryTarget = (BoostSummaryTarget) H();
        if (boostSummaryTarget != null) {
            boolean a = this.f40748a.a();
            BoostStatus e = this.f40749b.m42282e();
            if (e != null) {
                String multiplierString = BoostStatusExt.multiplierString(e);
                if (a) {
                    boostSummaryTarget.displaySubscriberSummary(multiplierString);
                } else {
                    boostSummaryTarget.displayNonSubscriberSummary(multiplierString, this.f40750c.m41124a((int) R.string.boost_summary_info_title_upsell, e), this.f40750c.m41124a((int) R.string.boost_summary_info_description_upsell, e));
                }
                this.f40751d.m35507c();
            }
        }
    }

    /* renamed from: c */
    public void m49874c() {
        this.f40749b.m42289l();
        this.f40752e.a(BoostState.INACTIVE);
    }

    /* renamed from: d */
    public void m49875d() {
        BoostSummaryTarget boostSummaryTarget = (BoostSummaryTarget) H();
        if (boostSummaryTarget != null) {
            this.f40749b.m42289l();
            if (this.f40748a.a()) {
                boostSummaryTarget.onBoostAgainClick();
            } else {
                boostSummaryTarget.onGetTinderPlusClick();
            }
        }
    }
}
