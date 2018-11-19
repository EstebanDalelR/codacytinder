package com.tinder.paywall.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ConsumablePaywallItemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ConsumablePaywallItemView f39789b;

    @UiThread
    public ConsumablePaywallItemView_ViewBinding(ConsumablePaywallItemView consumablePaywallItemView, View view) {
        this.f39789b = consumablePaywallItemView;
        consumablePaywallItemView.mSavePercentText = (TextView) C0761c.b(view, R.id.save_percentage, "field 'mSavePercentText'", TextView.class);
        consumablePaywallItemView.mNumberOfItems = (TextView) C0761c.b(view, R.id.paywall_item_number_of_items, "field 'mNumberOfItems'", TextView.class);
        consumablePaywallItemView.mItemPrice = (TextView) C0761c.b(view, R.id.paywall_item_price, "field 'mItemPrice'", TextView.class);
        consumablePaywallItemView.mItemName = (TextView) C0761c.b(view, R.id.paywall_item_name, "field 'mItemName'", TextView.class);
        consumablePaywallItemView.mMainContainer = C0761c.a(view, R.id.paywall_item_main_container, "field 'mMainContainer'");
        consumablePaywallItemView.mStrikeThroughPrice = (TextView) C0761c.b(view, R.id.strike_through_price, "field 'mStrikeThroughPrice'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        consumablePaywallItemView.transparentColor = C0432b.c(view, R.color.transparent);
        consumablePaywallItemView.mMonthsPadding = resources.getDimensionPixelSize(R.dimen.paywall_months_padding);
    }

    @CallSuper
    public void unbind() {
        ConsumablePaywallItemView consumablePaywallItemView = this.f39789b;
        if (consumablePaywallItemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39789b = null;
        consumablePaywallItemView.mSavePercentText = null;
        consumablePaywallItemView.mNumberOfItems = null;
        consumablePaywallItemView.mItemPrice = null;
        consumablePaywallItemView.mItemName = null;
        consumablePaywallItemView.mMainContainer = null;
        consumablePaywallItemView.mStrikeThroughPrice = null;
    }
}
