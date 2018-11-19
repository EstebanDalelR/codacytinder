package com.tinder.boost.dialog;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostGaugeView;
import com.tinder.paywall.views.PaywallBaseView;

public class BoostPaywallDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private BoostPaywallDialog f33950b;
    /* renamed from: c */
    private View f33951c;
    /* renamed from: d */
    private View f33952d;
    /* renamed from: e */
    private View f33953e;
    /* renamed from: f */
    private View f33954f;

    @UiThread
    public BoostPaywallDialog_ViewBinding(final BoostPaywallDialog boostPaywallDialog, View view) {
        this.f33950b = boostPaywallDialog;
        boostPaywallDialog.mPaywallView = (PaywallBaseView) C0761c.b(view, R.id.paywall_base_view, "field 'mPaywallView'", PaywallBaseView.class);
        boostPaywallDialog.mGaugeView = (BoostGaugeView) C0761c.b(view, R.id.boost_gauge_view, "field 'mGaugeView'", BoostGaugeView.class);
        View a = C0761c.a(view, R.id.dialog_boost_paywall_container, "field 'mMainContainer' and method 'onWindowBackgroundClick'");
        boostPaywallDialog.mMainContainer = (ViewGroup) C0761c.c(a, R.id.dialog_boost_paywall_container, "field 'mMainContainer'", ViewGroup.class);
        this.f33951c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostPaywallDialog_ViewBinding f33943b;

            public void doClick(View view) {
                boostPaywallDialog.onWindowBackgroundClick();
            }
        });
        a = C0761c.a(view, R.id.card_view, "method 'onCardClick'");
        this.f33952d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostPaywallDialog_ViewBinding f33945b;

            public void doClick(View view) {
                boostPaywallDialog.onCardClick();
            }
        });
        a = C0761c.a(view, R.id.paywall_button, "method 'onBoostButtonClick'");
        this.f33953e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostPaywallDialog_ViewBinding f33947b;

            public void doClick(View view) {
                boostPaywallDialog.onBoostButtonClick();
            }
        });
        a = C0761c.a(view, R.id.tinder_plus_upsell_button, "method 'onGetTinderPlusClick'");
        this.f33954f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ BoostPaywallDialog_ViewBinding f33949b;

            public void doClick(View view) {
                boostPaywallDialog.onGetTinderPlusClick();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        boostPaywallDialog.mBoostEmitterYDelta = resources.getDimensionPixelSize(R.dimen.boost_dialog_y_delta);
        boostPaywallDialog.mBoostGradient = C0432b.a(view, R.drawable.boost_dialog_gradient);
        boostPaywallDialog.mTitle = resources.getString(R.string.boost_paywall_title);
        boostPaywallDialog.mOutOfBoost = resources.getString(R.string.boost_paywall_title_out_of_boost);
        boostPaywallDialog.mTitleDescription = resources.getString(R.string.boost_paywall_title_description);
        boostPaywallDialog.mDescriptionOutOfBoost = resources.getString(R.string.boost_paywall_title_description_out_of_boost);
        boostPaywallDialog.mBoostMe = resources.getString(R.string.boost_paywall_button_boost_me);
    }

    @CallSuper
    public void unbind() {
        BoostPaywallDialog boostPaywallDialog = this.f33950b;
        if (boostPaywallDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33950b = null;
        boostPaywallDialog.mPaywallView = null;
        boostPaywallDialog.mGaugeView = null;
        boostPaywallDialog.mMainContainer = null;
        this.f33951c.setOnClickListener(null);
        this.f33951c = null;
        this.f33952d.setOnClickListener(null);
        this.f33952d = null;
        this.f33953e.setOnClickListener(null);
        this.f33953e = null;
        this.f33954f.setOnClickListener(null);
        this.f33954f = null;
    }
}
