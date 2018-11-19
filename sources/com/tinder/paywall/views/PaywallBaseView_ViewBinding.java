package com.tinder.paywall.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.Space;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class PaywallBaseView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PaywallBaseView f39790b;

    @UiThread
    public PaywallBaseView_ViewBinding(PaywallBaseView paywallBaseView, View view) {
        this.f39790b = paywallBaseView;
        paywallBaseView.mTitleText = (TextView) C0761c.b(view, R.id.paywall_title_text, "field 'mTitleText'", TextView.class);
        paywallBaseView.mDescriptionText = (TextView) C0761c.b(view, R.id.paywall_description_text, "field 'mDescriptionText'", TextView.class);
        paywallBaseView.mPaywallItems = (PaywallItemGroupView) C0761c.b(view, R.id.paywall_items, "field 'mPaywallItems'", PaywallItemGroupView.class);
        paywallBaseView.mInfoTitleText = (TextView) C0761c.b(view, R.id.paywall_info_title_text, "field 'mInfoTitleText'", TextView.class);
        paywallBaseView.mInfoTitleDescriptionText = (TextView) C0761c.b(view, R.id.paywall_info_title_description_text, "field 'mInfoTitleDescriptionText'", TextView.class);
        paywallBaseView.mTimer = (TextView) C0761c.b(view, R.id.paywall_timer, "field 'mTimer'", TextView.class);
        paywallBaseView.mPaywallButton = (Button) C0761c.b(view, R.id.paywall_button, "field 'mPaywallButton'", Button.class);
        paywallBaseView.mMainIconSpace = (Space) C0761c.b(view, R.id.icon_view_space, "field 'mMainIconSpace'", Space.class);
        paywallBaseView.mTopContainer = C0761c.a(view, R.id.paywall_top_container, "field 'mTopContainer'");
        paywallBaseView.mTinderPlusUpsellDivider = C0761c.a(view, R.id.tinder_plus_upsell_divider, "field 'mTinderPlusUpsellDivider'");
        paywallBaseView.mGetTinderPlusBtn = C0761c.a(view, R.id.tinder_plus_upsell_button, "field 'mGetTinderPlusBtn'");
        paywallBaseView.mUpsellButtonDescription = (TextView) C0761c.b(view, R.id.upsell_button_description, "field 'mUpsellButtonDescription'", TextView.class);
        paywallBaseView.mUpsellButtonTitle = (TextView) C0761c.b(view, R.id.upsell_button_title, "field 'mUpsellButtonTitle'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        PaywallBaseView paywallBaseView = this.f39790b;
        if (paywallBaseView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39790b = null;
        paywallBaseView.mTitleText = null;
        paywallBaseView.mDescriptionText = null;
        paywallBaseView.mPaywallItems = null;
        paywallBaseView.mInfoTitleText = null;
        paywallBaseView.mInfoTitleDescriptionText = null;
        paywallBaseView.mTimer = null;
        paywallBaseView.mPaywallButton = null;
        paywallBaseView.mMainIconSpace = null;
        paywallBaseView.mTopContainer = null;
        paywallBaseView.mTinderPlusUpsellDivider = null;
        paywallBaseView.mGetTinderPlusBtn = null;
        paywallBaseView.mUpsellButtonDescription = null;
        paywallBaseView.mUpsellButtonTitle = null;
    }
}
