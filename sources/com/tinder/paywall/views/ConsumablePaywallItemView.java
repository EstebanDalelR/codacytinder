package com.tinder.paywall.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;
import com.tinder.R;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.paywall.viewmodels.C10087i;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.utils.C15358e;
import com.tinder.utils.C15374w;
import com.tinder.utils.av;
import java8.util.Objects;

public class ConsumablePaywallItemView extends LinearLayout implements PaywallItemView {
    /* renamed from: a */
    protected C10090l f39780a;
    /* renamed from: b */
    protected C10087i f39781b;
    /* renamed from: c */
    private int f39782c;
    /* renamed from: d */
    private boolean f39783d;
    /* renamed from: e */
    private LayoutInflater f39784e;
    /* renamed from: f */
    private ValueAnimator f39785f;
    /* renamed from: g */
    private ValueAnimator f39786g;
    /* renamed from: h */
    private AnimatorSet f39787h;
    /* renamed from: i */
    private C1811f f39788i;
    @BindView(2131363139)
    TextView mItemName;
    @BindView(2131363141)
    TextView mItemPrice;
    @BindView(2131363138)
    View mMainContainer;
    @BindDimen(2131165868)
    int mMonthsPadding;
    @BindView(2131363140)
    TextView mNumberOfItems;
    @BindView(2131363498)
    TextView mSavePercentText;
    @BindView(2131363704)
    TextView mStrikeThroughPrice;
    @BindColor(2131100278)
    int transparentColor;

    /* renamed from: com.tinder.paywall.views.ConsumablePaywallItemView$2 */
    class C100952 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ConsumablePaywallItemView f33016a;

        C100952(ConsumablePaywallItemView consumablePaywallItemView) {
            this.f33016a = consumablePaywallItemView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f33016a.mo11287b();
        }
    }

    /* renamed from: com.tinder.paywall.views.ConsumablePaywallItemView$1 */
    class C135551 extends C3442e {
        /* renamed from: a */
        final /* synthetic */ ConsumablePaywallItemView f43279a;

        C135551(ConsumablePaywallItemView consumablePaywallItemView) {
            this.f43279a = consumablePaywallItemView;
        }

        public void onSpringUpdate(C1811f c1811f) {
            av.c(this.f43279a, C15374w.a((float) c1811f.c(), 0.0f, 0.97f, 1.03f, 1.04f));
        }

        public void onSpringActivate(C1811f c1811f) {
            if (this.f43279a.f39786g != null) {
                this.f43279a.f39786g.start();
            }
        }
    }

    /* renamed from: a */
    protected boolean mo11286a() {
        return false;
    }

    /* renamed from: b */
    protected void mo11287b() {
    }

    @LayoutRes
    protected int getLayoutRes() {
        return R.layout.consumable_paywall_item;
    }

    public ConsumablePaywallItemView(Context context) {
        this(context, null);
    }

    public ConsumablePaywallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39783d = false;
        this.f39784e = LayoutInflater.from(getContext());
        this.f39784e.inflate(getLayoutRes(), this, true);
        setOrientation(1);
        ButterKnife.a(this);
        setClipToPadding(false);
        setClipChildren(false);
        this.f39788i = C9661a.m40067a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39788i.a();
    }

    public void bindViewModel(@NonNull C10090l c10090l) {
        Objects.b(c10090l);
        this.f39780a = c10090l;
        this.f39783d = c10090l.m41254j();
        this.f39781b = c10090l.m41251g();
        this.mNumberOfItems.setText(String.valueOf(c10090l.m41244a()));
        this.mItemName.setText(c10090l.m41246b());
        this.mItemName.setTextSize(0, (float) getResources().getDimensionPixelSize(c10090l.m41252h()));
        this.mSavePercentText.setText(getContext().getString(R.string.paywall_save_string, new Object[]{c10090l.m41250f()}));
        this.mSavePercentText.setBackground(this.f39781b.mo10756d());
        CharSequence d = this.f39783d ? c10090l.m41248d() : c10090l.m41247c();
        if (d != null) {
            this.mItemPrice.setText(d);
        }
        if (this.f39783d) {
            this.mStrikeThroughPrice.setVisibility(0);
            this.mStrikeThroughPrice.setText(c10090l.m41247c());
            this.mStrikeThroughPrice.setPaintFlags(this.mStrikeThroughPrice.getPaintFlags() | 16);
        } else {
            this.mStrikeThroughPrice.setVisibility(8);
        }
        setItemDisabled();
        this.mMainContainer.setPadding(this.mMonthsPadding, this.mMonthsPadding, this.mMonthsPadding, this.f39783d ? this.mMonthsPadding / 2 : this.mMonthsPadding);
    }

    @TargetApi(16)
    public void setItemEnabled(boolean z) {
        setActivated(true);
        if (!this.f39780a.m41253i() || this.f39783d) {
            this.mSavePercentText.setVisibility(0);
            this.mSavePercentText.setBackground(this.f39781b.mo10756d());
            this.mMainContainer.setBackgroundColor(mo11286a() ? this.transparentColor : this.f39781b.mo10762j().intValue());
        } else {
            Drawable colorDrawable;
            this.mSavePercentText.setVisibility(8);
            View view = this.mMainContainer;
            if (mo11286a()) {
                colorDrawable = new ColorDrawable(this.transparentColor);
            } else {
                colorDrawable = this.f39781b.mo10753a();
            }
            view.setBackground(colorDrawable);
        }
        if (z) {
            m48552c();
        } else {
            this.mNumberOfItems.setTextColor(this.f39781b.mo10761i().intValue());
            this.mItemName.setTextColor(this.f39781b.mo10761i().intValue());
            if (C15358e.f47625a.a()) {
                setScaleX(1.08f);
                setScaleY(1.08f);
            }
            ViewCompat.i(this, 6.0f);
            ViewCompat.j(this, 6.0f);
        }
        if (!this.f39785f || this.f39783d) {
            this.mItemName.setTextColor(this.f39781b.mo10761i().intValue());
            this.mNumberOfItems.setTextColor(this.f39781b.mo10761i().intValue());
        }
        this.mItemPrice.setTextColor(this.f39781b.mo10763k().intValue());
        this.mItemPrice.setBackgroundColor(this.f39781b.mo10764l().intValue());
        setBackground(this.f39781b.mo10754b());
        if (!this.mStrikeThroughPrice.getVisibility()) {
            this.mStrikeThroughPrice.setTextColor(this.f39781b.mo10765m().intValue());
            this.mStrikeThroughPrice.setBackgroundColor(0);
        }
    }

    @TargetApi(19)
    public void setItemDisabled() {
        setActivated(false);
        if (this.f39787h != null && this.f39787h.isRunning()) {
            this.f39787h.pause();
        }
        if (this.f39786g != null && this.f39786g.isRunning()) {
            this.f39786g.pause();
        }
        if (!(this.f39788i == null || this.f39788i.g())) {
            this.f39788i.i();
            this.f39788i.h();
            this.f39788i.a(1.0d, true);
        }
        this.mNumberOfItems.setTextColor(this.f39781b.mo10757e().intValue());
        this.mItemName.setTextColor(this.f39781b.mo10757e().intValue());
        this.mItemPrice.setBackgroundColor(this.f39781b.mo10760h().intValue());
        this.mItemPrice.setTextColor(this.f39781b.mo10759g().intValue());
        this.mSavePercentText.setVisibility(8);
        this.mMainContainer.setBackgroundColor(this.f39781b.mo10760h().intValue());
        setScaleX(1.0f);
        setScaleY(1.0f);
        setBackground(this.f39781b.mo10755c());
        ViewCompat.j(this, 0.0f);
        ViewCompat.i(this, 0.0f);
        if (this.mStrikeThroughPrice.getVisibility() == 0) {
            this.mStrikeThroughPrice.setTextColor(this.f39781b.mo10766n().intValue());
            this.mStrikeThroughPrice.setBackgroundColor(this.f39781b.mo10758f().intValue());
        }
    }

    public void setPosition(int i) {
        this.f39782c = i;
    }

    public int getPosition() {
        return this.f39782c;
    }

    /* renamed from: c */
    private void m48552c() {
        this.f39787h = new AnimatorSet();
        if (C15358e.f47625a.a()) {
            this.f39785f = ValueAnimator.ofArgb(new int[]{this.f39781b.mo10757e().intValue(), this.f39781b.mo10761i().intValue()});
            this.f39785f.setDuration(300);
            this.f39785f.setInterpolator(new AccelerateInterpolator());
            this.f39785f.addUpdateListener(new C10103a(this));
            this.f39785f.setRepeatCount(0);
            this.f39786g = ValueAnimator.ofInt(new int[]{0, 6});
            this.f39786g.setDuration(400);
            this.f39786g.setInterpolator(new AnticipateOvershootInterpolator());
            this.f39786g.addUpdateListener(new C10104b(this));
            this.f39786g.setRepeatCount(0);
        }
        if (getPosition() == 0) {
            setPivotX(0.0f);
            setPivotY((float) (getHeight() / 2));
        }
        if (getPosition() == 2) {
            setPivotX((float) getWidth());
            setPivotY((float) (getHeight() / 2));
        }
        ViewCompat.j(this, 6.0f);
        if (C15358e.f47625a.a()) {
            this.f39788i.c(80.0d);
            this.f39788i.a(new C135551(this));
            this.f39788i.b(1.0d);
            this.f39787h.play(this.f39786g);
        } else {
            this.mSavePercentText.setScaleY(0.0f);
            this.mSavePercentText.setPivotY(0.0f);
            this.mSavePercentText.setPivotX(0.5f);
            this.mSavePercentText.animate().setDuration(200).scaleY(1.0f).setInterpolator(new AccelerateInterpolator()).start();
        }
        if (!this.f39783d) {
            this.f39787h.play(this.f39785f);
        }
        this.f39787h.addListener(new C100952(this));
        this.f39787h.start();
    }

    /* renamed from: b */
    final /* synthetic */ void m48556b(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.mNumberOfItems.setTextColor(num.intValue());
        this.mItemName.setTextColor(num.intValue());
    }

    /* renamed from: a */
    final /* synthetic */ void m48553a(ValueAnimator valueAnimator) {
        setElevation((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
