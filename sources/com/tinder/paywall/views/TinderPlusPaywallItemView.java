package com.tinder.paywall.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.paywall.viewmodels.C10087i;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.utils.C15358e;
import java8.util.Objects;

public class TinderPlusPaywallItemView extends FrameLayout implements PaywallItemView {
    /* renamed from: a */
    private C10090l f39800a;
    /* renamed from: b */
    private C10087i f39801b;
    /* renamed from: c */
    private boolean f39802c = false;
    /* renamed from: d */
    private int f39803d;
    @BindDimen(2131165739)
    int discountBottomPadding;
    /* renamed from: e */
    private ValueAnimator f39804e;
    /* renamed from: f */
    private ValueAnimator f39805f;
    /* renamed from: g */
    private AnimatorSet f39806g;
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
    @BindView(2131363495)
    TextView saveAmount;
    @BindView(2131363704)
    TextView strikeThroughPrice;

    /* renamed from: com.tinder.paywall.views.TinderPlusPaywallItemView$1 */
    class C101021 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ TinderPlusPaywallItemView f33057a;

        C101021(TinderPlusPaywallItemView tinderPlusPaywallItemView) {
            this.f33057a = tinderPlusPaywallItemView;
        }

        public void onGlobalLayout() {
            this.f33057a.pillInfo.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Rect rect = new Rect();
            this.f33057a.pillInfo.getGlobalVisibleRect(rect);
            this.f33057a.pillInfo.setTranslationY((float) (-(rect.height() / 2)));
        }
    }

    public TinderPlusPaywallItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.paywall_item, this, true);
        ButterKnife.a(this);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public void bindViewModel(@NonNull C10090l c10090l) {
        Objects.b(c10090l);
        this.f39800a = c10090l;
        this.f39801b = c10090l.m41251g();
        this.f39802c = c10090l.m41254j();
        m48561b();
        m48560a();
        this.itemAmountContainer.setPadding(this.mainItemPadding, this.itemAmountContainer.getPaddingTop(), this.mainItemPadding, this.f39802c ? this.mainItemPadding / 2 : this.mainItemPadding);
    }

    public void setItemEnabled(boolean z) {
        setActivated(true);
        if (!this.f39800a.m41253i() || this.f39802c) {
            this.pillInfo.setVisibility(0);
            this.saveAmount.setVisibility(this.f39802c ? 8 : 0);
            this.saveAmount.setTextColor(this.f39801b.mo10761i().intValue());
            this.pillInfo.setBackground(this.f39801b.mo10756d());
            this.itemAmountContainer.setBackgroundColor(this.f39801b.mo10762j().intValue());
        } else {
            this.pillInfo.setVisibility(4);
            this.saveAmount.setVisibility(4);
            this.itemAmountContainer.setBackground(this.f39801b.mo10753a());
        }
        if (z) {
            m48562c();
        } else {
            this.numberOfItems.setTextColor(this.f39801b.mo10761i().intValue());
            this.itemName.setTextColor(this.f39801b.mo10761i().intValue());
        }
        if (!this.f39805f || this.f39802c) {
            this.itemName.setTextColor(this.f39801b.mo10761i().intValue());
            this.numberOfItems.setTextColor(this.f39801b.mo10761i().intValue());
        }
        this.itemPrice.setTextColor(this.f39801b.mo10763k().intValue());
        this.itemPrice.setBackgroundColor(this.f39801b.mo10764l().intValue());
        setBackground(this.f39801b.mo10754b());
        if (!this.strikeThroughPrice.getVisibility()) {
            this.strikeThroughPrice.setTextColor(this.f39801b.mo10765m().intValue());
            this.strikeThroughPrice.setBackgroundColor(0);
        }
    }

    @TargetApi(19)
    public void setItemDisabled() {
        setActivated(false);
        if (this.f39806g != null && this.f39806g.isRunning()) {
            this.f39806g.pause();
        }
        this.saveAmount.setVisibility(this.f39802c ? 8 : 4);
        this.numberOfItems.setTextColor(this.f39801b.mo10757e().intValue());
        this.itemName.setTextColor(this.f39801b.mo10757e().intValue());
        this.itemPrice.setBackgroundColor(this.f39801b.mo10760h().intValue());
        this.itemPrice.setTextColor(this.f39801b.mo10759g().intValue());
        this.pillInfo.setVisibility(4);
        this.itemAmountContainer.setBackgroundColor(this.f39801b.mo10760h().intValue());
        ViewCompat.i(this, 0.0f);
        setBackground(this.f39801b.mo10755c());
        if (this.strikeThroughPrice.getVisibility() == 0) {
            this.strikeThroughPrice.setTextColor(this.f39801b.mo10766n().intValue());
            this.strikeThroughPrice.setBackgroundColor(this.f39801b.mo10760h().intValue());
        }
    }

    public int getPosition() {
        return this.f39803d;
    }

    public void setPosition(int i) {
        this.f39803d = i;
    }

    /* renamed from: a */
    private void m48560a() {
        this.pillInfo.setVisibility(4);
        this.pillInfo.getViewTreeObserver().addOnGlobalLayoutListener(new C101021(this));
    }

    /* renamed from: b */
    private void m48561b() {
        this.numberOfItems.setText(String.valueOf(this.f39800a.m41244a()));
        this.itemName.setText(this.f39800a.m41246b());
        this.itemName.setTextSize(0, (float) getResources().getDimensionPixelSize(this.f39800a.m41252h()));
        this.saveAmount.setText(getContext().getString(R.string.paywall_save_string, new Object[]{this.f39800a.m41250f()}));
        this.pillInfo.setBackground(this.f39801b.mo10756d());
        CharSequence d = this.f39802c ? this.f39800a.m41248d() : this.f39800a.m41247c();
        if (d != null) {
            this.itemPrice.setText(d);
        }
        if (this.f39802c) {
            this.strikeThroughPrice.setVisibility(0);
            this.strikeThroughPrice.setText(this.f39800a.m41247c());
            this.strikeThroughPrice.setPaintFlags(this.strikeThroughPrice.getPaintFlags() | 16);
            this.itemPrice.setPadding(this.itemPrice.getPaddingLeft(), this.itemPrice.getPaddingTop(), this.itemPrice.getPaddingRight(), this.discountBottomPadding);
            this.pillInfo.setText(getContext().getString(R.string.paywall_save_string, new Object[]{this.f39800a.m41250f()}));
        } else {
            this.strikeThroughPrice.setVisibility(8);
            this.pillInfo.setText(this.f39800a.m41249e().toUpperCase());
        }
        setItemDisabled();
    }

    /* renamed from: c */
    private void m48562c() {
        this.f39806g = new AnimatorSet();
        if (C15358e.f47625a.a()) {
            this.f39805f = ValueAnimator.ofArgb(new int[]{this.f39801b.mo10757e().intValue(), this.f39801b.mo10761i().intValue()});
            this.f39805f.setDuration(300);
            this.f39805f.setInterpolator(new AccelerateInterpolator());
            this.f39805f.addUpdateListener(new C10108f(this));
            this.f39805f.setRepeatCount(0);
        }
        this.f39804e = ValueAnimator.ofInt(new int[]{0, 6});
        this.f39804e.setDuration(400);
        this.f39804e.setInterpolator(new AnticipateOvershootInterpolator());
        this.f39804e.addUpdateListener(new C10109g(this));
        this.f39804e.setRepeatCount(0);
        this.pillInfo.setScaleX(0.0f);
        this.pillInfo.animate().setDuration(250).setInterpolator(new OvershootInterpolator(1.5f)).scaleX(1.0f).start();
        this.f39806g.play(this.f39804e);
        if (!(this.f39802c || this.f39805f == null)) {
            this.f39806g.play(this.f39805f);
        }
        this.f39806g.start();
    }

    /* renamed from: b */
    final /* synthetic */ void m48564b(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.numberOfItems.setTextColor(num.intValue());
        this.itemName.setTextColor(num.intValue());
    }

    /* renamed from: a */
    final /* synthetic */ void m48563a(ValueAnimator valueAnimator) {
        ViewCompat.i(this, (float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
