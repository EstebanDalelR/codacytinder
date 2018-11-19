package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.intropricing.controlla.GoldIntroPricingControllaView;
import com.tinder.shimmy.ShimmerFrameLayout;

public class ControllaView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ControllaView f50222b;
    /* renamed from: c */
    private View f50223c;
    /* renamed from: d */
    private View f50224d;
    /* renamed from: e */
    private View f50225e;
    /* renamed from: f */
    private View f50226f;
    /* renamed from: g */
    private View f50227g;

    @UiThread
    public ControllaView_ViewBinding(final ControllaView controllaView, View view) {
        this.f50222b = controllaView;
        controllaView.pageViewAnimator = (IdViewAnimator) C0761c.b(view, R.id.controlla_page_view_animator, "field 'pageViewAnimator'", IdViewAnimator.class);
        controllaView.stateViewAnimator = (IdViewAnimator) C0761c.b(view, R.id.controlla_state_view_animator, "field 'stateViewAnimator'", IdViewAnimator.class);
        controllaView.controllaCarouselView = (ControllaCarouselView) C0761c.b(view, R.id.controlla_carousel, "field 'controllaCarouselView'", ControllaCarouselView.class);
        View a = C0761c.a(view, R.id.controlla_superlike, "field 'superLikeView' and method 'showSuperlikePayWallDialog'");
        controllaView.superLikeView = (ControllaButtonView) C0761c.c(a, R.id.controlla_superlike, "field 'superLikeView'", ControllaButtonView.class);
        this.f50223c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ControllaView_ViewBinding f50213b;

            public void doClick(View view) {
                controllaView.showSuperlikePayWallDialog();
            }
        });
        a = C0761c.a(view, R.id.controlla_boost, "field 'boostView' and method 'openBoostPayWallDialog'");
        controllaView.boostView = (ControllaButtonView) C0761c.c(a, R.id.controlla_boost, "field 'boostView'", ControllaButtonView.class);
        this.f50224d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ControllaView_ViewBinding f50215b;

            public void doClick(View view) {
                controllaView.openBoostPayWallDialog();
            }
        });
        a = C0761c.a(view, R.id.controlla_gold, "field 'goldView' and method 'showGoldPaywall'");
        controllaView.goldView = (ControllaButtonView) C0761c.c(a, R.id.controlla_gold, "field 'goldView'", ControllaButtonView.class);
        this.f50225e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ControllaView_ViewBinding f50217b;

            public void doClick(View view) {
                controllaView.showGoldPaywall();
            }
        });
        a = C0761c.a(view, R.id.controlla_out_of_likes_view, "field 'outOfLikesView' and method 'outOfLikesClicked'");
        controllaView.outOfLikesView = (ControllaAdvertisingView) C0761c.c(a, R.id.controlla_out_of_likes_view, "field 'outOfLikesView'", ControllaAdvertisingView.class);
        this.f50226f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ControllaView_ViewBinding f50219b;

            public void doClick(View view) {
                controllaView.outOfLikesClicked();
            }
        });
        controllaView.subscriptionSettingsButtonText = (TextView) C0761c.b(view, R.id.controlla_subscription_settings_btn_text, "field 'subscriptionSettingsButtonText'", TextView.class);
        controllaView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.shimmer_frame_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        controllaView.introPricingView = (GoldIntroPricingControllaView) C0761c.b(view, R.id.intro_pricing_controlla, "field 'introPricingView'", GoldIntroPricingControllaView.class);
        view = C0761c.a(view, R.id.controlla_tinder_plus_btn, "method 'openMyTinderPlusOrPaywall'");
        this.f50227g = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ControllaView_ViewBinding f50221b;

            public void doClick(View view) {
                controllaView.openMyTinderPlusOrPaywall();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ControllaView controllaView = this.f50222b;
        if (controllaView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50222b = null;
        controllaView.pageViewAnimator = null;
        controllaView.stateViewAnimator = null;
        controllaView.controllaCarouselView = null;
        controllaView.superLikeView = null;
        controllaView.boostView = null;
        controllaView.goldView = null;
        controllaView.outOfLikesView = null;
        controllaView.subscriptionSettingsButtonText = null;
        controllaView.shimmerFrameLayout = null;
        controllaView.introPricingView = null;
        this.f50223c.setOnClickListener(null);
        this.f50223c = null;
        this.f50224d.setOnClickListener(null);
        this.f50224d = null;
        this.f50225e.setOnClickListener(null);
        this.f50225e = null;
        this.f50226f.setOnClickListener(null);
        this.f50226f = null;
        this.f50227g.setOnClickListener(null);
        this.f50227g = null;
    }
}
