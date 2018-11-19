package com.tinder.paywall.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.paywall.viewmodels.C10087i;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.utils.C15358e;
import java8.util.Objects;

public class TinderGoldPaywallItemView extends FrameLayout implements PaywallItemView {
    /* renamed from: a */
    private C10090l f39793a;
    /* renamed from: b */
    private C10087i f39794b;
    /* renamed from: c */
    private boolean f39795c = false;
    /* renamed from: d */
    private int f39796d;
    @BindDimen(2131165739)
    int discountBottomPadding;
    /* renamed from: e */
    private ValueAnimator f39797e;
    /* renamed from: f */
    private AnimatorSet f39798f;
    @BindView(2131363138)
    View itemAmountContainer;
    @BindView(2131363139)
    TextView itemName;
    @BindView(2131363141)
    TextView itemPrice;
    @BindDimen(2131165868)
    int mainItemPadding;
    @BindView(2131363140)
    TextView numberOfItems;
    @BindView(2131363201)
    TextView pillInfo;
    @BindView(2131363200)
    View pillInfoBackground;
    @BindView(2131363495)
    TextView saveAmount;
    @BindView(2131363143)
    View shimmerContent;
    @BindView(2131363142)
    ShimmerFrameLayout shimmerFrameLayout;
    @BindView(2131363704)
    TextView strikeThroughPrice;

    /* renamed from: com.tinder.paywall.views.TinderGoldPaywallItemView$1 */
    class C101011 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TinderGoldPaywallItemView f33056a;

        C101011(TinderGoldPaywallItemView tinderGoldPaywallItemView) {
            this.f33056a = tinderGoldPaywallItemView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f33056a.shimmerFrameLayout.setEnabled(true);
        }
    }

    public TinderGoldPaywallItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.paywall_item_gold, this, true);
        ButterKnife.a(this);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public void bindViewModel(@NonNull C10090l c10090l) {
        Objects.b(c10090l);
        this.f39793a = c10090l;
        this.f39794b = c10090l.m41251g();
        this.f39795c = c10090l.m41254j();
        m48557a();
        this.itemAmountContainer.setPadding(this.mainItemPadding, this.itemAmountContainer.getPaddingTop(), this.mainItemPadding, this.f39795c ? this.mainItemPadding / 2 : this.mainItemPadding);
    }

    public void setItemEnabled(boolean z) {
        setActivated(true);
        if (!this.f39793a.m41253i() || this.f39795c) {
            this.pillInfo.setVisibility(0);
            this.pillInfoBackground.setVisibility(0);
            this.saveAmount.setVisibility(this.f39795c ? 8 : 0);
            this.saveAmount.setTextColor(this.f39794b.mo10761i().intValue());
            this.pillInfoBackground.setBackground(this.f39794b.mo10756d());
            this.itemAmountContainer.setBackgroundColor(this.f39794b.mo10762j().intValue());
        } else {
            this.pillInfo.setVisibility(4);
            this.pillInfoBackground.setVisibility(4);
            this.saveAmount.setVisibility(4);
            this.itemAmountContainer.setBackground(this.f39794b.mo10753a());
        }
        if (z) {
            m48558b();
        } else {
            this.numberOfItems.setTextColor(this.f39794b.mo10761i().intValue());
            this.itemName.setTextColor(this.f39794b.mo10761i().intValue());
            this.shimmerFrameLayout.setEnabled(true);
        }
        if (!this.f39797e || this.f39795c) {
            this.itemName.setTextColor(this.f39794b.mo10761i().intValue());
            this.numberOfItems.setTextColor(this.f39794b.mo10761i().intValue());
        }
        this.itemPrice.setTextColor(this.f39794b.mo10763k().intValue());
        this.itemPrice.setBackgroundColor(this.f39794b.mo10764l().intValue());
        this.shimmerContent.setBackground(this.f39794b.mo10754b());
        if (!this.strikeThroughPrice.getVisibility()) {
            this.strikeThroughPrice.setTextColor(this.f39794b.mo10765m().intValue());
            this.strikeThroughPrice.setBackgroundColor(0);
        }
    }

    @TargetApi(19)
    public void setItemDisabled() {
        setActivated(false);
        this.shimmerFrameLayout.setEnabled(false);
        if (this.f39798f != null && this.f39798f.isRunning()) {
            this.f39798f.pause();
        }
        this.saveAmount.setVisibility(this.f39795c ? 8 : 4);
        this.numberOfItems.setTextColor(this.f39794b.mo10757e().intValue());
        this.itemName.setTextColor(this.f39794b.mo10757e().intValue());
        this.itemPrice.setBackgroundColor(this.f39794b.mo10760h().intValue());
        this.itemPrice.setTextColor(this.f39794b.mo10759g().intValue());
        this.pillInfo.setVisibility(4);
        this.pillInfoBackground.setVisibility(4);
        this.itemAmountContainer.setBackgroundColor(this.f39794b.mo10760h().intValue());
        this.shimmerContent.setBackground(this.f39794b.mo10755c());
        if (this.strikeThroughPrice.getVisibility() == 0) {
            this.strikeThroughPrice.setTextColor(this.f39794b.mo10766n().intValue());
            this.strikeThroughPrice.setBackgroundColor(this.f39794b.mo10760h().intValue());
        }
    }

    public int getPosition() {
        return this.f39796d;
    }

    public void setPosition(int i) {
        this.f39796d = i;
    }

    /* renamed from: a */
    private void m48557a() {
        this.numberOfItems.setText(String.valueOf(this.f39793a.m41244a()));
        this.itemName.setText(this.f39793a.m41246b());
        this.itemName.setTextSize(0, (float) getResources().getDimensionPixelSize(this.f39793a.m41252h()));
        this.saveAmount.setText(getContext().getString(R.string.paywall_save_string, new Object[]{this.f39793a.m41250f()}));
        this.pillInfoBackground.setBackground(this.f39794b.mo10756d());
        CharSequence d = this.f39795c ? this.f39793a.m41248d() : this.f39793a.m41247c();
        if (d != null) {
            this.itemPrice.setText(d);
        }
        if (this.f39795c) {
            this.strikeThroughPrice.setVisibility(0);
            this.strikeThroughPrice.setText(this.f39793a.m41247c());
            this.strikeThroughPrice.setPaintFlags(this.strikeThroughPrice.getPaintFlags() | 16);
            this.itemPrice.setPadding(this.itemPrice.getPaddingLeft(), this.itemPrice.getPaddingTop(), this.itemPrice.getPaddingRight(), this.discountBottomPadding);
            this.pillInfo.setText(getContext().getString(R.string.paywall_save_string, new Object[]{this.f39793a.m41250f()}));
        } else {
            this.strikeThroughPrice.setVisibility(8);
            this.pillInfo.setText(this.f39793a.m41249e().toUpperCase());
        }
        setItemDisabled();
    }

    /* renamed from: b */
    private void m48558b() {
        this.f39798f = new AnimatorSet();
        if (C15358e.f47625a.a()) {
            this.f39797e = ValueAnimator.ofArgb(new int[]{this.f39794b.mo10757e().intValue(), this.f39794b.mo10761i().intValue()});
            this.f39797e.setDuration(300);
            this.f39797e.setInterpolator(new AccelerateInterpolator());
            this.f39797e.addUpdateListener(new C10107e(this));
            this.f39797e.setRepeatCount(0);
        }
        this.pillInfo.setScaleX(0.0f);
        this.pillInfo.animate().setDuration(250).setInterpolator(new OvershootInterpolator(1.5f)).scaleX(1.0f).start();
        if (!(this.f39795c || this.f39797e == null)) {
            this.f39798f.play(this.f39797e);
        }
        this.f39798f.addListener(new C101011(this));
        this.f39798f.start();
    }

    /* renamed from: a */
    final /* synthetic */ void m48559a(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.numberOfItems.setTextColor(num.intValue());
        this.itemName.setTextColor(num.intValue());
    }
}
