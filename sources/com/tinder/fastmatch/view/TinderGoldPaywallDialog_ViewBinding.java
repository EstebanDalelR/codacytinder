package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.paywall.views.PaywallItemGroupView;
import com.tinder.paywall.views.PaywallPerksCarouselView;

public final class TinderGoldPaywallDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private TinderGoldPaywallDialog f38158b;
    /* renamed from: c */
    private View f38159c;
    /* renamed from: d */
    private View f38160d;

    @UiThread
    public TinderGoldPaywallDialog_ViewBinding(final TinderGoldPaywallDialog tinderGoldPaywallDialog, View view) {
        this.f38158b = tinderGoldPaywallDialog;
        View a = C0761c.a(view, R.id.card_background, "field 'cardBackground' and method 'onCardBackgroundClicked'");
        tinderGoldPaywallDialog.cardBackground = (CardView) C0761c.c(a, R.id.card_background, "field 'cardBackground'", CardView.class);
        this.f38159c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ TinderGoldPaywallDialog_ViewBinding f38155b;

            public void doClick(View view) {
                tinderGoldPaywallDialog.onCardBackgroundClicked();
            }
        });
        tinderGoldPaywallDialog.perksPager = (PaywallPerksCarouselView) C0761c.b(view, R.id.paywall_perks_view_pager, "field 'perksPager'", PaywallPerksCarouselView.class);
        tinderGoldPaywallDialog.paywallItems = (PaywallItemGroupView) C0761c.b(view, R.id.paywall_items, "field 'paywallItems'", PaywallItemGroupView.class);
        tinderGoldPaywallDialog.paywallTitle = (TextView) C0761c.b(view, R.id.paywall_dialog_title, "field 'paywallTitle'", TextView.class);
        tinderGoldPaywallDialog.upgradePaywallItem = (UpgradeGoldPaywallItem) C0761c.b(view, R.id.upgrade_paywall_item, "field 'upgradePaywallItem'", UpgradeGoldPaywallItem.class);
        tinderGoldPaywallDialog.continueButton = (TinderGoldButtonView) C0761c.b(view, R.id.subscribe_button, "field 'continueButton'", TinderGoldButtonView.class);
        a = C0761c.a(view, R.id.dialog_background, "method 'onDialogBackgroundClicked'");
        this.f38160d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ TinderGoldPaywallDialog_ViewBinding f38157b;

            public void doClick(View view) {
                tinderGoldPaywallDialog.onDialogBackgroundClicked();
            }
        });
        view = view.getContext().getResources();
        tinderGoldPaywallDialog.defaultTitle = view.getString(R.string.get_tinder_gold);
        tinderGoldPaywallDialog.upgradeTitle = view.getString(R.string.upgrade_to_tinder_gold);
    }

    public void unbind() {
        TinderGoldPaywallDialog tinderGoldPaywallDialog = this.f38158b;
        if (tinderGoldPaywallDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38158b = null;
        tinderGoldPaywallDialog.cardBackground = null;
        tinderGoldPaywallDialog.perksPager = null;
        tinderGoldPaywallDialog.paywallItems = null;
        tinderGoldPaywallDialog.paywallTitle = null;
        tinderGoldPaywallDialog.upgradePaywallItem = null;
        tinderGoldPaywallDialog.continueButton = null;
        this.f38159c.setOnClickListener(null);
        this.f38159c = null;
        this.f38160d.setOnClickListener(null);
        this.f38160d = null;
    }
}
