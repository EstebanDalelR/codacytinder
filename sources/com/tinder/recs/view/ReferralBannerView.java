package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.views.ReferralBannerViewLegacy;

public class ReferralBannerView extends FrameLayout {
    @BindView(2131363446)
    ReferralBannerViewLegacy referralBannerViewLegacy;

    public ReferralBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.referral_banner_edgelesscards, this);
        ButterKnife.a(this);
        this.referralBannerViewLegacy.setTextAppearance(R.style.ReferralBannerReferredByTextStyle);
    }

    public void setReferralData(@NonNull String str, @NonNull String str2) {
        this.referralBannerViewLegacy.m57921a(str, str2);
    }
}
