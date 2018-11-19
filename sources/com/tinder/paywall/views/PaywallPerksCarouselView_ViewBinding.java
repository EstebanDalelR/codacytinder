package com.tinder.paywall.views;

import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.viewpagerindicator.CirclePageIndicator;

public final class PaywallPerksCarouselView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PaywallPerksCarouselView f39792b;

    @UiThread
    public PaywallPerksCarouselView_ViewBinding(PaywallPerksCarouselView paywallPerksCarouselView, View view) {
        this.f39792b = paywallPerksCarouselView;
        paywallPerksCarouselView.perksPager = (ViewPager) C0761c.b(view, R.id.paywall_perks_pager, "field 'perksPager'", ViewPager.class);
        paywallPerksCarouselView.pagerIndicator = (CirclePageIndicator) C0761c.b(view, R.id.paywall_pager_indicator, "field 'pagerIndicator'", CirclePageIndicator.class);
        paywallPerksCarouselView.white = C0432b.c(view.getContext(), R.color.white);
    }

    public void unbind() {
        PaywallPerksCarouselView paywallPerksCarouselView = this.f39792b;
        if (paywallPerksCarouselView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39792b = null;
        paywallPerksCarouselView.perksPager = null;
        paywallPerksCarouselView.pagerIndicator = null;
    }
}
