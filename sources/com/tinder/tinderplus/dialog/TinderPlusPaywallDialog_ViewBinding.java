package com.tinder.tinderplus.dialog;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.paywall.views.DiscountBannerView;
import com.tinder.paywall.views.PaywallItemGroupView;
import com.tinder.paywall.views.PaywallPerksCarouselView;

public final class TinderPlusPaywallDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private TinderPlusPaywallDialog f52238b;
    /* renamed from: c */
    private View f52239c;
    /* renamed from: d */
    private View f52240d;
    /* renamed from: e */
    private View f52241e;

    @UiThread
    public TinderPlusPaywallDialog_ViewBinding(final TinderPlusPaywallDialog tinderPlusPaywallDialog, View view) {
        this.f52238b = tinderPlusPaywallDialog;
        View a = C0761c.a(view, R.id.card_background, "field 'cardBackground' and method 'onCardBackgroundClick$Tinder_release'");
        tinderPlusPaywallDialog.cardBackground = (CardView) C0761c.c(a, R.id.card_background, "field 'cardBackground'", CardView.class);
        this.f52239c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ TinderPlusPaywallDialog_ViewBinding f52233b;

            public void doClick(View view) {
                tinderPlusPaywallDialog.onCardBackgroundClick$Tinder_release();
            }
        });
        tinderPlusPaywallDialog.dialogTitle = (TextView) C0761c.b(view, R.id.paywall_dialog_title, "field 'dialogTitle'", TextView.class);
        tinderPlusPaywallDialog.paywallItems = (PaywallItemGroupView) C0761c.b(view, R.id.paywall_items, "field 'paywallItems'", PaywallItemGroupView.class);
        a = C0761c.a(view, R.id.subscribe_button, "field 'subscribeButton' and method 'onSubscribeButtonClick'");
        tinderPlusPaywallDialog.subscribeButton = (Button) C0761c.c(a, R.id.subscribe_button, "field 'subscribeButton'", Button.class);
        this.f52240d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ TinderPlusPaywallDialog_ViewBinding f52235b;

            public void doClick(View view) {
                tinderPlusPaywallDialog.onSubscribeButtonClick();
            }
        });
        tinderPlusPaywallDialog.paywallPerksCarouselView = (PaywallPerksCarouselView) C0761c.b(view, R.id.paywall_perks_view_pager, "field 'paywallPerksCarouselView'", PaywallPerksCarouselView.class);
        tinderPlusPaywallDialog.discountBanner = (DiscountBannerView) C0761c.b(view, R.id.discount_banner, "field 'discountBanner'", DiscountBannerView.class);
        tinderPlusPaywallDialog.progressBar = (ProgressBar) C0761c.b(view, R.id.paywall_items_progress_bar, "field 'progressBar'", ProgressBar.class);
        a = C0761c.a(view, R.id.dialog_background, "method 'onBackgroundWindowClick$Tinder_release'");
        this.f52241e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ TinderPlusPaywallDialog_ViewBinding f52237b;

            public void doClick(View view) {
                tinderPlusPaywallDialog.onBackgroundWindowClick$Tinder_release();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        tinderPlusPaywallDialog.white = C0432b.c(view, R.color.white);
        tinderPlusPaywallDialog.defaultTitleSize = resources.getDimensionPixelSize(R.dimen.tinder_plus_dialog_default_title);
        tinderPlusPaywallDialog.discountTitleSize = resources.getDimensionPixelSize(R.dimen.tinder_plus_dialog_discount_title);
        tinderPlusPaywallDialog.title = resources.getString(R.string.get_tinder_plus);
        tinderPlusPaywallDialog.special = resources.getString(R.string.special);
        tinderPlusPaywallDialog.limitedTime = resources.getString(R.string.limited_time_offer);
    }

    public void unbind() {
        TinderPlusPaywallDialog tinderPlusPaywallDialog = this.f52238b;
        if (tinderPlusPaywallDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52238b = null;
        tinderPlusPaywallDialog.cardBackground = null;
        tinderPlusPaywallDialog.dialogTitle = null;
        tinderPlusPaywallDialog.paywallItems = null;
        tinderPlusPaywallDialog.subscribeButton = null;
        tinderPlusPaywallDialog.paywallPerksCarouselView = null;
        tinderPlusPaywallDialog.discountBanner = null;
        tinderPlusPaywallDialog.progressBar = null;
        this.f52239c.setOnClickListener(null);
        this.f52239c = null;
        this.f52240d.setOnClickListener(null);
        this.f52240d = null;
        this.f52241e.setOnClickListener(null);
        this.f52241e = null;
    }
}
