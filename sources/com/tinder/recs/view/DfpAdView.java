package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.doubleclick.C2346b;
import com.tinder.ads.source.dfp.BannerDfpAd;
import rx.functions.Action1;

public class DfpAdView extends FrameLayout {
    public DfpAdView(@NonNull Context context) {
        super(context);
    }

    public void bindDfpAd(@NonNull BannerDfpAd bannerDfpAd) {
        bannerDfpAd = bannerDfpAd.getPublisherAdView();
        ViewParent parent = bannerDfpAd.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(bannerDfpAd);
        }
        addView(bannerDfpAd, new LayoutParams(-1, -1));
        bannerDfpAd.c();
    }

    public void pause() {
        doOnPublisherAdsView(DfpAdView$$Lambda$0.$instance);
    }

    public void resume() {
        doOnPublisherAdsView(DfpAdView$$Lambda$1.$instance);
    }

    public void destroy() {
        doOnPublisherAdsView(DfpAdView$$Lambda$2.$instance);
    }

    private void doOnPublisherAdsView(Action1<C2346b> action1) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof C2346b) {
                action1.call((C2346b) childAt);
            }
        }
    }
}
