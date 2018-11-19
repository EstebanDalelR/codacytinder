package com.tinder.paywall.views;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public class DiscountBannerView_ViewBinding implements Unbinder {
    @CallSuper
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public DiscountBannerView_ViewBinding(DiscountBannerView discountBannerView, View view) {
        this(discountBannerView, view.getContext());
    }

    @UiThread
    public DiscountBannerView_ViewBinding(DiscountBannerView discountBannerView, Context context) {
        Resources resources = context.getResources();
        discountBannerView.startColor = C0432b.c(context, R.color.gradient_red);
        discountBannerView.endColor = C0432b.c(context, R.color.gradient_orange);
        discountBannerView.white = C0432b.c(context, R.color.white);
        discountBannerView.textSize = resources.getDimensionPixelSize(R.dimen.save_banner_textsize);
        discountBannerView.textLarge = resources.getDimensionPixelSize(R.dimen.text_xs);
        discountBannerView.topPadding = resources.getDimensionPixelSize(R.dimen.margin_small);
        discountBannerView.hoursLeft = resources.getString(R.string.hours_left);
        discountBannerView.left = resources.getString(R.string.left);
    }
}
