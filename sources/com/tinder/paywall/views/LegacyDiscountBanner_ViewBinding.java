package com.tinder.paywall.views;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public class LegacyDiscountBanner_ViewBinding implements Unbinder {
    @CallSuper
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public LegacyDiscountBanner_ViewBinding(LegacyDiscountBanner legacyDiscountBanner, View view) {
        this(legacyDiscountBanner, view.getContext());
    }

    @UiThread
    public LegacyDiscountBanner_ViewBinding(LegacyDiscountBanner legacyDiscountBanner, Context context) {
        Resources resources = context.getResources();
        legacyDiscountBanner.mStartColor = C0432b.c(context, R.color.gradient_red);
        legacyDiscountBanner.mEndColor = C0432b.c(context, R.color.gradient_orange);
        legacyDiscountBanner.mWhite = C0432b.c(context, R.color.white);
        legacyDiscountBanner.mTextSize = resources.getDimensionPixelSize(R.dimen.save_banner_textsize);
        legacyDiscountBanner.mTextLarge = resources.getDimensionPixelSize(R.dimen.text_xs);
        legacyDiscountBanner.mTopPadding = resources.getDimensionPixelSize(R.dimen.margin_small);
    }
}
