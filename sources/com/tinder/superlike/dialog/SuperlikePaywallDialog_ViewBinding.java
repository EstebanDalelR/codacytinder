package com.tinder.superlike.dialog;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.paywall.views.PaywallBaseView;

public class SuperlikePaywallDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SuperlikePaywallDialog f52049b;
    /* renamed from: c */
    private View f52050c;
    /* renamed from: d */
    private View f52051d;
    /* renamed from: e */
    private View f52052e;

    @UiThread
    public SuperlikePaywallDialog_ViewBinding(final SuperlikePaywallDialog superlikePaywallDialog, View view) {
        this.f52049b = superlikePaywallDialog;
        superlikePaywallDialog.paywallBaseView = (PaywallBaseView) C0761c.b(view, R.id.paywall_base_view, "field 'paywallBaseView'", PaywallBaseView.class);
        View a = C0761c.a(view, R.id.dialog_paywall_container, "field 'mainContainer' and method 'onBackgroundClick'");
        superlikePaywallDialog.mainContainer = a;
        this.f52050c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog_ViewBinding f52044b;

            public void doClick(View view) {
                superlikePaywallDialog.onBackgroundClick();
            }
        });
        superlikePaywallDialog.superlikeIconView = C0761c.a(view, R.id.superlike_icon_view, "field 'superlikeIconView'");
        superlikePaywallDialog.superlikeStarSpace = C0761c.a(view, R.id.superlike_star_icon_space, "field 'superlikeStarSpace'");
        superlikePaywallDialog.superlikeStar = C0761c.a(view, R.id.superlike_star_icon_view, "field 'superlikeStar'");
        superlikePaywallDialog.recImage = (ImageView) C0761c.b(view, R.id.piv_image, "field 'recImage'", ImageView.class);
        a = C0761c.a(view, R.id.tinder_plus_upsell_button, "method 'onGetTinderPlusClick'");
        this.f52051d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog_ViewBinding f52046b;

            public void doClick(View view) {
                superlikePaywallDialog.onGetTinderPlusClick();
            }
        });
        a = C0761c.a(view, R.id.paywall_button, "method 'onGetSuperlikeClick'");
        this.f52052e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SuperlikePaywallDialog_ViewBinding f52048b;

            public void doClick(View view) {
                superlikePaywallDialog.onGetSuperlikeClick();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        superlikePaywallDialog.superlikeGradient = C0432b.a(view, R.drawable.superlike_dialog_gradient);
        superlikePaywallDialog.upsellTitleText = resources.getString(R.string.superlike_alc_upsell_title);
        superlikePaywallDialog.depletedTitleText = resources.getString(R.string.superlike_alc_out_of_superlikes);
        superlikePaywallDialog.descriptionText = resources.getString(R.string.superlike_alc_out_countdown_details_bottom);
        superlikePaywallDialog.refillNowDescriptionText = resources.getString(R.string.superlike_alc_refill_now);
        superlikePaywallDialog.refillNowWithNameText = resources.getString(R.string.superlike_alc_refill_now_name);
        superlikePaywallDialog.likelyMatchDescriptionText = resources.getString(R.string.superlike_alc_likely_match);
        superlikePaywallDialog.standOutTitleText = resources.getString(R.string.superlike_alc_stand_out);
    }

    @CallSuper
    public void unbind() {
        SuperlikePaywallDialog superlikePaywallDialog = this.f52049b;
        if (superlikePaywallDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52049b = null;
        superlikePaywallDialog.paywallBaseView = null;
        superlikePaywallDialog.mainContainer = null;
        superlikePaywallDialog.superlikeIconView = null;
        superlikePaywallDialog.superlikeStarSpace = null;
        superlikePaywallDialog.superlikeStar = null;
        superlikePaywallDialog.recImage = null;
        this.f52050c.setOnClickListener(null);
        this.f52050c = null;
        this.f52051d.setOnClickListener(null);
        this.f52051d = null;
        this.f52052e.setOnClickListener(null);
        this.f52052e = null;
    }
}
