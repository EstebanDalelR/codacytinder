package com.tinder.profile.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.res.C0441a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.deadshot.Deadshot;
import com.tinder.intropricing.controlla.C9729a;
import com.tinder.intropricing.controlla.GoldIntroPricingControllaView;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.p366e.C14408a;
import com.tinder.profile.target.ControllaTarget;
import com.tinder.profile.view.ControllaCarouselView.C14442b;
import com.tinder.profile.view.ControllaCarouselView.C14443c;
import com.tinder.profiletab.injector.ProfileTabViewInjector$Owner;
import com.tinder.profiletab.presenter.C14474d;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.tinderplus.activities.ActivityTPlusControl;
import java.util.List;
import javax.inject.Inject;

public class ControllaView extends LinearLayout implements ControllaTarget, C14442b, C14443c {
    @Inject
    /* renamed from: a */
    C14474d f50211a;
    @BindView(2131362226)
    ControllaButtonView boostView;
    @BindView(2131362231)
    ControllaCarouselView controllaCarouselView;
    @BindView(2131362234)
    ControllaButtonView goldView;
    @BindView(2131362770)
    GoldIntroPricingControllaView introPricingView;
    @BindView(2131362235)
    ControllaAdvertisingView outOfLikesView;
    @BindView(2131362238)
    IdViewAnimator pageViewAnimator;
    @BindView(2131363564)
    ShimmerFrameLayout shimmerFrameLayout;
    @BindView(2131362239)
    IdViewAnimator stateViewAnimator;
    @BindView(2131362240)
    TextView subscriptionSettingsButtonText;
    @BindView(2131362241)
    ControllaButtonView superLikeView;

    public enum Page {
        CONTROLLA(R.id.controlla_page),
        INTRO_PRICING(R.id.intro_pricing_controlla);
        
        @IdRes
        int layoutId;

        private Page(int i) {
            this.layoutId = i;
        }
    }

    public enum State {
        TINDER_GOLD(R.id.controlla_consumable_details, R.string.my_tinder_gold, R.color.gold3),
        TINDER_PLUS(R.id.controlla_consumable_details, R.string.my_tinder_plus, R.color.red1),
        CAROUSEL(R.id.controlla_carousel, R.string.my_tinder_plus, R.color.red1),
        OUT_OF_LIKES(R.id.controlla_out_of_likes_view, R.string.my_tinder_plus, R.color.red1);
        
        @IdRes
        int layoutId;
        @ColorRes
        int textColorId;
        @StringRes
        int tinderPlusButtonText;

        private State(int i, int i2, int i3) {
            this.layoutId = i;
            this.tinderPlusButtonText = i2;
            this.textColorId = i3;
        }
    }

    public ControllaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ((ProfileTabViewInjector$Owner) context).getGetProfileTabInjector().inject(this);
        inflate(context, R.layout.view_controlla, this);
        ButterKnife.a(this);
        setOrientation(1);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controllaCarouselView.setItemClickListener(this);
        this.controllaCarouselView.setAdvertisingPageChangeListener(this);
        Deadshot.take(this, this.f50211a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void bindState(State state, AdvertisingPageType advertisingPageType) {
        updateButton(state, advertisingPageType);
        this.stateViewAnimator.setDisplayedChildId(state.layoutId);
    }

    public void changePage(Page page) {
        this.pageViewAnimator.setDisplayedChildId(page.layoutId);
    }

    public void bindIntroPricing(C9729a c9729a) {
        this.introPricingView.a(c9729a);
        this.introPricingView.setOnClickListener(new C14453i(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m61009a(View view) {
        showGoldPaywall();
    }

    public void updateButton(State state, @Nullable AdvertisingPageType advertisingPageType) {
        int i = state.tinderPlusButtonText;
        boolean z = state == State.TINDER_GOLD;
        int i2 = state.textColorId;
        if (state == State.CAROUSEL && advertisingPageType == AdvertisingPageType.GOLD) {
            i = R.string.get_tinder_gold;
            i2 = R.color.gold3;
            z = true;
        }
        m61008a(z, i, i2);
    }

    /* renamed from: a */
    private void m61008a(boolean z, @StringRes int i, @ColorRes int i2) {
        this.shimmerFrameLayout.setEnabled(z);
        this.subscriptionSettingsButtonText.setEnabled(z);
        this.subscriptionSettingsButtonText.setText(i);
        this.subscriptionSettingsButtonText.setTextColor(C0441a.b(getResources(), i2, null));
    }

    public void setUpgradeGoldButtonVisibility(boolean z) {
        this.goldView.setVisibility(z ? false : true);
    }

    public void setViewModels(List<C14408a> list) {
        this.controllaCarouselView.setViewModels(list);
    }

    public void updateBoostTimer(long j) {
        this.boostView.setMillisRemaining(j);
    }

    public void updateBoostCount(int i) {
        this.boostView.setNumberRemaining(i);
    }

    public void updateSuperLikesCount(int i) {
        this.superLikeView.setNumberRemaining(i);
    }

    public void stopCarouselTimer() {
        this.controllaCarouselView.m55146a();
    }

    public void startCarouselTimer() {
        this.controllaCarouselView.m55149b();
    }

    /* renamed from: a */
    public void mo11742a(C14408a c14408a) {
        this.f50211a.m55250a(c14408a.mo11614e());
    }

    /* renamed from: b */
    public void mo11743b(C14408a c14408a) {
        this.f50211a.m55255a(c14408a);
    }

    public void launchPaywallFlow(C10076o c10076o) {
        c10076o.a(getContext());
    }

    @OnClick({2131362241})
    public void showSuperlikePayWallDialog() {
        this.f50211a.m55263f();
    }

    @OnClick({2131362226})
    public void openBoostPayWallDialog() {
        this.f50211a.m55264g();
    }

    @OnClick({2131362234})
    public void showGoldPaywall() {
        this.f50211a.m55265h();
    }

    @OnClick({2131362243})
    public void openMyTinderPlusOrPaywall() {
        this.f50211a.m55266i();
    }

    public void launchTPlusControlActivity() {
        getContext().startActivity(new Intent(getContext(), ActivityTPlusControl.class));
    }

    @OnClick({2131362235})
    public void outOfLikesClicked() {
        this.f50211a.m55250a(AdvertisingPageType.UNLIMITED_LIKES);
    }
}
