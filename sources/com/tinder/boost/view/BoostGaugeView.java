package com.tinder.boost.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.utils.C15373v;
import com.tinder.utils.C15373v.C15372a;
import com.tinder.utils.an;

public class BoostGaugeView extends FrameLayout {
    /* renamed from: a */
    private GaugeListener f29687a;
    /* renamed from: b */
    private boolean f29688b;
    @BindView(2131361951)
    ImageView mBoltView;
    @BindView(2131361952)
    SweepAnimationView mGaugeView;
    @BindView(2131362974)
    View mMultiplierContainer;
    @BindView(2131362973)
    TextView mMultiplierView;

    /* renamed from: com.tinder.boost.view.BoostGaugeView$1 */
    class C83521 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f29683a;

        C83521(BoostGaugeView boostGaugeView) {
            this.f29683a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29683a.m35589d();
        }
    }

    /* renamed from: com.tinder.boost.view.BoostGaugeView$2 */
    class C83532 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f29684a;

        C83532(BoostGaugeView boostGaugeView) {
            this.f29684a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29684a.m35590e();
        }
    }

    /* renamed from: com.tinder.boost.view.BoostGaugeView$4 */
    class C83544 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f29685a;

        C83544(BoostGaugeView boostGaugeView) {
            this.f29685a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29685a.mGaugeView.m35584a(0.0f);
            if (this.f29685a.f29688b != null) {
                this.f29685a.postDelayed(new C8358f(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
            } else {
                this.f29685a.m35592g().start();
            }
        }

        /* renamed from: a */
        final /* synthetic */ void m35582a() {
            this.f29685a.m35593a();
        }
    }

    public interface GaugeListener {
        void onStrokeFadedIn();
    }

    public static class SweepAnimationView extends View {
        /* renamed from: a */
        private final C15373v f29686a = new C15372a().a(this.mStrokeThickness).c(this.mSweepStartColor).d(this.mSweepEndColor).b(this.mEmptyColor).a();
        @BindColor(2131099698)
        int mEmptyColor;
        @BindDimen(2131165300)
        int mStrokeThickness;
        @BindColor(2131099694)
        int mSweepEndColor;
        @BindColor(2131099695)
        int mSweepStartColor;

        public SweepAnimationView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            ButterKnife.a(this);
        }

        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f29686a.a(i, i2, 1);
        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f29686a.a(canvas);
        }

        /* renamed from: a */
        public void m35584a(float f) {
            this.f29686a.a(f);
            invalidate();
        }

        /* renamed from: a */
        public void m35583a() {
            this.f29686a.a();
            invalidate();
        }
    }

    /* renamed from: com.tinder.boost.view.BoostGaugeView$3 */
    class C104503 extends an {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f34046a;

        C104503(BoostGaugeView boostGaugeView) {
            this.f34046a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f34046a.m35596a(String.format("%.1fx", new Object[]{Float.valueOf(10.0f)}));
        }
    }

    /* renamed from: com.tinder.boost.view.BoostGaugeView$5 */
    class C104515 extends an {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f34047a;

        C104515(BoostGaugeView boostGaugeView) {
            this.f34047a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f34047a.mBoltView.setVisibility(8);
            this.f34047a.mMultiplierContainer.setVisibility(0);
            this.f34047a.setMultiplier("0.0x");
            ViewCompat.c(this.f34047a.mMultiplierContainer, 0.0f);
            this.f34047a.mMultiplierContainer.animate().setDuration(200).alpha(1.0f).setInterpolator(new AccelerateInterpolator()).start();
        }
    }

    /* renamed from: com.tinder.boost.view.BoostGaugeView$6 */
    class C104536 extends an {
        /* renamed from: a */
        final /* synthetic */ BoostGaugeView f34049a;

        /* renamed from: com.tinder.boost.view.BoostGaugeView$6$1 */
        class C104521 extends an {
            /* renamed from: a */
            final /* synthetic */ C104536 f34048a;

            C104521(C104536 c104536) {
                this.f34048a = c104536;
            }

            public void onAnimationEnd(Animator animator) {
                ViewCompat.c(this.f34048a.f34049a.mBoltView, 1.0f);
                ViewCompat.c(this.f34048a.f34049a.mMultiplierContainer, 0.0f);
                this.f34048a.f34049a.mMultiplierContainer.setVisibility(8);
            }
        }

        C104536(BoostGaugeView boostGaugeView) {
            this.f34049a = boostGaugeView;
        }

        public void onAnimationEnd(Animator animator) {
            this.f34049a.mMultiplierContainer.setVisibility(8);
            this.f34049a.mBoltView.setVisibility(0);
            ViewCompat.c(this.f34049a.mBoltView, 0.0f);
            this.f34049a.mBoltView.animate().setDuration(200).alpha(1.0f).setInterpolator(new AccelerateInterpolator()).setListener(new C104521(this)).start();
        }
    }

    public class SweepAnimationView_ViewBinding implements Unbinder {
        @CallSuper
        public void unbind() {
        }

        @UiThread
        @Deprecated
        public SweepAnimationView_ViewBinding(SweepAnimationView sweepAnimationView, View view) {
            this(sweepAnimationView, view.getContext());
        }

        @UiThread
        public SweepAnimationView_ViewBinding(SweepAnimationView sweepAnimationView, Context context) {
            Resources resources = context.getResources();
            sweepAnimationView.mSweepStartColor = C0432b.c(context, R.color.boost_gauge_sweep_start);
            sweepAnimationView.mSweepEndColor = C0432b.c(context, R.color.boost_gauge_sweep_end);
            sweepAnimationView.mEmptyColor = C0432b.c(context, R.color.boost_guage_empty_color);
            sweepAnimationView.mStrokeThickness = resources.getDimensionPixelSize(R.dimen.boost_stroke_thickness);
        }
    }

    public long getDuration() {
        return 12000;
    }

    public BoostGaugeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.merge_boost_gauge, this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setMultiplier(@NonNull String str) {
        if (this.mMultiplierContainer.getVisibility() == 0) {
            this.mMultiplierView.setText(str);
        }
    }

    /* renamed from: a */
    public void m35593a() {
        this.mGaugeView.animate().setDuration(500).alpha(1.0f).setListener(new C83521(this));
    }

    /* renamed from: b */
    public void m35597b() {
        this.f29687a.onStrokeFadedIn();
        this.mGaugeView.setAlpha(1.0f);
        this.mBoltView.setVisibility(8);
        this.mMultiplierContainer.setVisibility(0);
    }

    /* renamed from: a */
    public void m35596a(@NonNull String str) {
        this.mGaugeView.setAlpha(1.0f);
        this.mBoltView.setVisibility(8);
        this.mMultiplierContainer.setVisibility(0);
        this.mGaugeView.m35583a();
        setMultiplier(str);
    }

    /* renamed from: a */
    public void m35594a(float f) {
        this.mGaugeView.m35584a(f);
    }

    public void setGaugeListener(GaugeListener gaugeListener) {
        this.f29687a = gaugeListener;
    }

    public void setRepeats(boolean z) {
        this.f29688b = z;
    }

    /* renamed from: d */
    private void m35589d() {
        this.f29687a.onStrokeFadedIn();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(600);
        ofFloat.setDuration(10000);
        ofFloat.addUpdateListener(new C8355c(this));
        ofFloat.addListener(new C83532(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 10.0f});
        ofFloat2.setStartDelay(600);
        ofFloat2.setDuration(10000);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat2.addUpdateListener(new C8356d(this));
        m35591f().start();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
        animatorSet.addListener(new C104503(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m35598b(ValueAnimator valueAnimator) {
        this.mGaugeView.m35584a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: a */
    final /* synthetic */ void m35595a(ValueAnimator valueAnimator) {
        setMultiplier(String.format("%.1fx", new Object[]{Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue())}));
    }

    /* renamed from: e */
    private void m35590e() {
        postDelayed(new C8357e(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    }

    /* renamed from: c */
    final /* synthetic */ void m35599c() {
        this.mGaugeView.animate().alpha(0.0f).setDuration(500).setListener(new C83544(this));
    }

    /* renamed from: f */
    private ViewPropertyAnimator m35591f() {
        this.mBoltView.setVisibility(0);
        this.mMultiplierContainer.setVisibility(4);
        return this.mBoltView.animate().alpha(0.0f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new C104515(this));
    }

    /* renamed from: g */
    private ViewPropertyAnimator m35592g() {
        this.mBoltView.setVisibility(4);
        this.mMultiplierContainer.setVisibility(0);
        return this.mMultiplierContainer.animate().alpha(0.0f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new C104536(this));
    }
}
