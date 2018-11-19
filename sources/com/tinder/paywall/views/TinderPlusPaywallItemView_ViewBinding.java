package com.tinder.paywall.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class TinderPlusPaywallItemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private TinderPlusPaywallItemView f39807b;

    @UiThread
    public TinderPlusPaywallItemView_ViewBinding(TinderPlusPaywallItemView tinderPlusPaywallItemView, View view) {
        this.f39807b = tinderPlusPaywallItemView;
        tinderPlusPaywallItemView.numberOfItems = (TextView) C0761c.b(view, R.id.paywall_item_number_of_items, "field 'numberOfItems'", TextView.class);
        tinderPlusPaywallItemView.itemName = (TextView) C0761c.b(view, R.id.paywall_item_name, "field 'itemName'", TextView.class);
        tinderPlusPaywallItemView.strikeThroughPrice = (TextView) C0761c.b(view, R.id.strike_through_price, "field 'strikeThroughPrice'", TextView.class);
        tinderPlusPaywallItemView.pillInfo = (TextView) C0761c.b(view, R.id.pill_info_text, "field 'pillInfo'", TextView.class);
        tinderPlusPaywallItemView.itemPrice = (TextView) C0761c.b(view, R.id.paywall_item_price, "field 'itemPrice'", TextView.class);
        tinderPlusPaywallItemView.saveAmount = (TextView) C0761c.b(view, R.id.save_amount, "field 'saveAmount'", TextView.class);
        tinderPlusPaywallItemView.itemAmountContainer = C0761c.a(view, R.id.paywall_item_main_container, "field 'itemAmountContainer'");
        view = view.getContext().getResources();
        tinderPlusPaywallItemView.mainItemPadding = view.getDimensionPixelSize(R.dimen.paywall_months_padding);
        tinderPlusPaywallItemView.discountBottomPadding = view.getDimensionPixelSize(R.dimen.margin_small);
    }

    @CallSuper
    public void unbind() {
        TinderPlusPaywallItemView tinderPlusPaywallItemView = this.f39807b;
        if (tinderPlusPaywallItemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39807b = null;
        tinderPlusPaywallItemView.numberOfItems = null;
        tinderPlusPaywallItemView.itemName = null;
        tinderPlusPaywallItemView.strikeThroughPrice = null;
        tinderPlusPaywallItemView.pillInfo = null;
        tinderPlusPaywallItemView.itemPrice = null;
        tinderPlusPaywallItemView.saveAmount = null;
        tinderPlusPaywallItemView.itemAmountContainer = null;
    }
}
