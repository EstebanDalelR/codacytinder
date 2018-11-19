package com.tinder.recs.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.ReferralBannerViewLegacy;

public class ReferralBannerView_ViewBinding implements Unbinder {
    private ReferralBannerView target;

    @UiThread
    public ReferralBannerView_ViewBinding(ReferralBannerView referralBannerView) {
        this(referralBannerView, referralBannerView);
    }

    @UiThread
    public ReferralBannerView_ViewBinding(ReferralBannerView referralBannerView, View view) {
        this.target = referralBannerView;
        referralBannerView.referralBannerViewLegacy = (ReferralBannerViewLegacy) C0761c.b(view, R.id.referral_banner_edgeless_cards, "field 'referralBannerViewLegacy'", ReferralBannerViewLegacy.class);
    }

    @CallSuper
    public void unbind() {
        ReferralBannerView referralBannerView = this.target;
        if (referralBannerView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        referralBannerView.referralBannerViewLegacy = null;
    }
}
