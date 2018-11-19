package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;

public final class ReferralBannerViewLegacy extends LinearLayout {
    @BindView(2131363448)
    AvatarView mAvatarView;
    @BindView(2131363447)
    CustomTextView mCustomTextView;
    @BindString(2131821731)
    String mRecommendedByStringTemplate;

    public ReferralBannerViewLegacy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.referral_banner, this);
        ButterKnife.a(this);
    }

    public void setTextAppearance(@StyleRes int i) {
        TextViewCompat.a(this.mCustomTextView, i);
    }

    /* renamed from: a */
    public void m57921a(@Nullable String str, @NonNull String str2) {
        this.mAvatarView.setAvatars(str);
        this.mCustomTextView.setText(String.format(this.mRecommendedByStringTemplate, new Object[]{str2}));
    }
}
