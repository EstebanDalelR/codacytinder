package com.tinder.paywall.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.shimmy.ShimmerFrameLayout;

public class TinderGoldPaywallItemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private TinderGoldPaywallItemView f39799b;

    @UiThread
    public TinderGoldPaywallItemView_ViewBinding(TinderGoldPaywallItemView tinderGoldPaywallItemView, View view) {
        this.f39799b = tinderGoldPaywallItemView;
        tinderGoldPaywallItemView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.paywall_item_shimmer_container, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        tinderGoldPaywallItemView.shimmerContent = C0761c.a(view, R.id.paywall_item_shimmer_container_content, "field 'shimmerContent'");
        tinderGoldPaywallItemView.numberOfItems = (TextView) C0761c.b(view, R.id.paywall_item_number_of_items, "field 'numberOfItems'", TextView.class);
        tinderGoldPaywallItemView.itemName = (TextView) C0761c.b(view, R.id.paywall_item_name, "field 'itemName'", TextView.class);
        tinderGoldPaywallItemView.strikeThroughPrice = (TextView) C0761c.b(view, R.id.strike_through_price, "field 'strikeThroughPrice'", TextView.class);
        tinderGoldPaywallItemView.pillInfo = (TextView) C0761c.b(view, R.id.pill_info_text, "field 'pillInfo'", TextView.class);
        tinderGoldPaywallItemView.pillInfoBackground = C0761c.a(view, R.id.pill_info_background, "field 'pillInfoBackground'");
        tinderGoldPaywallItemView.itemPrice = (TextView) C0761c.b(view, R.id.paywall_item_price, "field 'itemPrice'", TextView.class);
        tinderGoldPaywallItemView.saveAmount = (TextView) C0761c.b(view, R.id.save_amount, "field 'saveAmount'", TextView.class);
        tinderGoldPaywallItemView.itemAmountContainer = C0761c.a(view, R.id.paywall_item_main_container, "field 'itemAmountContainer'");
        view = view.getContext().getResources();
        tinderGoldPaywallItemView.mainItemPadding = view.getDimensionPixelSize(R.dimen.paywall_months_padding);
        tinderGoldPaywallItemView.discountBottomPadding = view.getDimensionPixelSize(R.dimen.margin_small);
    }

    @CallSuper
    public void unbind() {
        TinderGoldPaywallItemView tinderGoldPaywallItemView = this.f39799b;
        if (tinderGoldPaywallItemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39799b = null;
        tinderGoldPaywallItemView.shimmerFrameLayout = null;
        tinderGoldPaywallItemView.shimmerContent = null;
        tinderGoldPaywallItemView.numberOfItems = null;
        tinderGoldPaywallItemView.itemName = null;
        tinderGoldPaywallItemView.strikeThroughPrice = null;
        tinderGoldPaywallItemView.pillInfo = null;
        tinderGoldPaywallItemView.pillInfoBackground = null;
        tinderGoldPaywallItemView.itemPrice = null;
        tinderGoldPaywallItemView.saveAmount = null;
        tinderGoldPaywallItemView.itemAmountContainer = null;
    }
}
