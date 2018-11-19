package com.tinder.views;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class ReferralBannerViewLegacy_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ReferralBannerViewLegacy f52902b;

    @UiThread
    public ReferralBannerViewLegacy_ViewBinding(ReferralBannerViewLegacy referralBannerViewLegacy, View view) {
        this.f52902b = referralBannerViewLegacy;
        referralBannerViewLegacy.mAvatarView = (AvatarView) C0761c.b(view, R.id.referrer_avatar, "field 'mAvatarView'", AvatarView.class);
        referralBannerViewLegacy.mCustomTextView = (CustomTextView) C0761c.b(view, R.id.referred_by, "field 'mCustomTextView'", CustomTextView.class);
        referralBannerViewLegacy.mRecommendedByStringTemplate = view.getContext().getResources().getString(R.string.rec_referral_recommended_by);
    }

    public void unbind() {
        ReferralBannerViewLegacy referralBannerViewLegacy = this.f52902b;
        if (referralBannerViewLegacy == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52902b = null;
        referralBannerViewLegacy.mAvatarView = null;
        referralBannerViewLegacy.mCustomTextView = null;
    }
}
