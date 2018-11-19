package com.tinder.recsads.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.recsads.C14760n.C14755a;
import com.tinder.recsads.C14760n.C14757c;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.view.listeners.DispatchTouchDownListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/recsads/view/RedGradientFillButtonView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dispatchTouchDownListener", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "grey", "", "greyBorderBackgroundView", "Landroid/view/View;", "loadingButtonText", "Landroid/widget/TextView;", "rectangleTouchFeedback", "Landroid/graphics/drawable/Drawable;", "redGradientBackgroundView", "white", "animateGradientFadeIn", "", "animateGradientFill", "animateGreyBackgroundFadeOut", "animateTextFadeToWhite", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "resetButtonColors", "setOnDispatchTouchEventListener", "setText", "charSequence", "", "startLoadingAnimation", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class RedGradientFillButtonView extends ConstraintLayout {
    /* renamed from: a */
    private View f51135a;
    /* renamed from: b */
    private View f51136b;
    /* renamed from: c */
    private TextView f51137c;
    /* renamed from: d */
    private final int f51138d;
    /* renamed from: e */
    private final int f51139e;
    /* renamed from: f */
    private Drawable f51140f;
    /* renamed from: g */
    private DispatchTouchDownListener f51141g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.RedGradientFillButtonView$a */
    static final class C14773a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ RedGradientFillButtonView f46342a;

        C14773a(RedGradientFillButtonView redGradientFillButtonView) {
            this.f46342a = redGradientFillButtonView;
        }

        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            C2668g.b(valueAnimator, "animation");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            valueAnimator = ((Integer) valueAnimator).intValue();
            LayoutParams layoutParams = this.f46342a.f51136b.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = valueAnimator;
            this.f46342a.f51136b.setLayoutParams(layoutParams2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.RedGradientFillButtonView$b */
    static final class C14774b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ RedGradientFillButtonView f46343a;

        C14774b(RedGradientFillButtonView redGradientFillButtonView) {
            this.f46343a = redGradientFillButtonView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView f = this.f46343a.f51137c;
            C2668g.a(valueAnimator, "animator");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            f.setTextColor(((Integer) valueAnimator).intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.RedGradientFillButtonView$c */
    static final class C14775c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ RedGradientFillButtonView f46344a;

        C14775c(RedGradientFillButtonView redGradientFillButtonView) {
            this.f46344a = redGradientFillButtonView;
        }

        public final void run() {
            this.f46344a.m61903c();
            this.f46344a.m61905d();
            this.f46344a.m61910f();
            this.f46344a.m61908e();
        }
    }

    public RedGradientFillButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f51138d = C0432b.c(context, C14755a.grey_medium_1);
        this.f51139e = C0432b.c(context, C14755a.white);
        View.inflate(context, C14759e.view_red_gradient_loading_button, this);
        this.f51140f = C0432b.a(context, C14757c.rectangle_touch_feedback);
        context = findViewById(C14758d.grey_border_background_view);
        C2668g.a(context, "findViewById(R.id.grey_border_background_view)");
        this.f51135a = context;
        context = findViewById(C14758d.red_gradient_background_view);
        C2668g.a(context, "findViewById(R.id.red_gradient_background_view)");
        this.f51136b = context;
        context = findViewById(C14758d.loading_button_text);
        C2668g.a(context, "findViewById(R.id.loading_button_text)");
        this.f51137c = (TextView) context;
        setClickable(true);
        if (VERSION.SDK_INT >= 23) {
            setForeground(this.f51140f);
        }
    }

    public final void setText(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "charSequence");
        this.f51137c.setText(charSequence);
    }

    public final void setOnDispatchTouchEventListener(@NotNull DispatchTouchDownListener dispatchTouchDownListener) {
        C2668g.b(dispatchTouchDownListener, "dispatchTouchDownListener");
        this.f51141g = dispatchTouchDownListener;
    }

    /* renamed from: a */
    public final void m61911a() {
        this.f51135a.setAlpha(1.0f);
        this.f51136b.setAlpha(0.0f);
        this.f51137c.setTextColor(this.f51138d);
    }

    /* renamed from: b */
    public final void m61912b() {
        if (this.f51136b.getAlpha() != 1.0f) {
            new Handler().postDelayed(new C14775c(this), (long) 2000);
        }
    }

    /* renamed from: c */
    private final void m61903c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f51136b.getWidth(), 0});
        C2668g.a(ofInt, "fillValueAnimator");
        ofInt.setDuration((long) MapboxConstants.ANIMATION_DURATION);
        ofInt.addUpdateListener(new C14773a(this));
        ofInt.start();
    }

    /* renamed from: d */
    private final void m61905d() {
        this.f51136b.animate().alpha(1.0f).setDuration((long) MapboxConstants.ANIMATION_DURATION).start();
    }

    /* renamed from: e */
    private final void m61908e() {
        this.f51135a.animate().alpha(0.0f).setDuration((long) MapboxConstants.ANIMATION_DURATION).start();
    }

    /* renamed from: f */
    private final void m61910f() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(this.f51138d), Integer.valueOf(this.f51139e)});
        ofObject.addUpdateListener(new C14774b(this));
        C2668g.a(ofObject, "colorAnimation");
        ofObject.setDuration((long) MapboxConstants.ANIMATION_DURATION);
        ofObject.start();
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        if (this.f51141g != null && motionEvent.getAction() == 0) {
            DispatchTouchDownListener dispatchTouchDownListener = this.f51141g;
            if (dispatchTouchDownListener == null) {
                C2668g.a();
            }
            dispatchTouchDownListener.onDispatchTouchEvent();
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
