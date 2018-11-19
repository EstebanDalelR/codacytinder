package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.p011a.C2890b;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tinder.superlikeable.p422b.C15136b;
import com.tinder.superlikeable.view.BackgroundScalingView;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\nH\u0002J,\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator;", "", "moveUpAnimator", "Landroid/animation/ValueAnimator;", "rotateAnimator", "moveDownAnimator", "animatorSet", "Landroid/animation/AnimatorSet;", "(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;Landroid/animation/AnimatorSet;)V", "cancelIfRunning", "", "configureBackgroundScalingViewForAnimation", "backgroundScalingView", "Lcom/tinder/superlikeable/view/BackgroundScalingView;", "configureMoveDownAnimation", "moveDownStartTranslationY", "", "moveDownEndTranslationY", "configureMoveUpAnimation", "moveUpStartTranslationY", "moveUpEndTranslationY", "configureRotateAnimation", "isRunning", "", "resetAnimators", "start", "heightOffset", "screenHeight", "", "animationEndListener", "Lkotlin/Function0;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.a */
public final class C15102a {
    /* renamed from: a */
    private final ValueAnimator f46976a;
    /* renamed from: b */
    private final ValueAnimator f46977b;
    /* renamed from: c */
    private final ValueAnimator f46978c;
    /* renamed from: d */
    private final AnimatorSet f46979d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.a$a */
    static final class C15097a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BackgroundScalingView f46966a;
        /* renamed from: b */
        final /* synthetic */ float f46967b;
        /* renamed from: c */
        final /* synthetic */ float f46968c;

        C15097a(BackgroundScalingView backgroundScalingView, float f, float f2) {
            this.f46966a = backgroundScalingView;
            this.f46967b = f;
            this.f46968c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedFraction();
            this.f46966a.setTranslationY(this.f46967b + ((this.f46968c - this.f46967b) * valueAnimator));
            this.f46966a.setSuperLikeCounterViewAlpha(((float) 1) - valueAnimator);
            float f = 1.54f - (valueAnimator * 0.54f);
            this.f46966a.setScaleX(f);
            this.f46966a.setScaleY(f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.a$b */
    static final class C15098b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BackgroundScalingView f46969a;
        /* renamed from: b */
        final /* synthetic */ float f46970b;
        /* renamed from: c */
        final /* synthetic */ float f46971c;

        C15098b(BackgroundScalingView backgroundScalingView, float f, float f2) {
            this.f46969a = backgroundScalingView;
            this.f46970b = f;
            this.f46971c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedFraction();
            float f = ((float) 1) + (0.54f * valueAnimator);
            this.f46969a.setTranslationY(this.f46970b + ((this.f46971c - this.f46970b) * valueAnimator));
            this.f46969a.setScaleX(f);
            this.f46969a.setScaleY(f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.a$c */
    static final class C15099c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BackgroundScalingView f46972a;

        C15099c(BackgroundScalingView backgroundScalingView) {
            this.f46972a = backgroundScalingView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            this.f46972a.setRotationY(((Float) valueAnimator).floatValue());
            if (animatedFraction >= 0.5f && this.f46972a.getSuperLikeCounterViewVisibility() != null) {
                this.f46972a.setSuperLikeCounterViewVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator$configureRotateAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/view/BackgroundScalingView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.a$d */
    public static final class C15100d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ BackgroundScalingView f46973a;

        C15100d(BackgroundScalingView backgroundScalingView) {
            this.f46973a = backgroundScalingView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f46973a.setSuperLikeCounterViewRotationY(0.0f);
            this.f46973a.setRotationY(0.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator$start$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.a$e */
    public static final class C15101e extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C15102a f46974a;
        /* renamed from: b */
        final /* synthetic */ Function0 f46975b;

        C15101e(C15102a c15102a, Function0 function0) {
            this.f46974a = c15102a;
            this.f46975b = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f46974a.f46979d.removeListener(this);
            this.f46975b.invoke();
        }
    }

    public C15102a() {
        this(null, null, null, null, 15, null);
    }

    public C15102a(@NotNull ValueAnimator valueAnimator, @NotNull ValueAnimator valueAnimator2, @NotNull ValueAnimator valueAnimator3, @NotNull AnimatorSet animatorSet) {
        C2668g.b(valueAnimator, "moveUpAnimator");
        C2668g.b(valueAnimator2, "rotateAnimator");
        C2668g.b(valueAnimator3, "moveDownAnimator");
        C2668g.b(animatorSet, "animatorSet");
        this.f46976a = valueAnimator;
        this.f46977b = valueAnimator2;
        this.f46978c = valueAnimator3;
        this.f46979d = animatorSet;
    }

    public /* synthetic */ C15102a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3, AnimatorSet animatorSet, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            valueAnimator = new ValueAnimator();
        }
        if ((i & 2) != null) {
            valueAnimator2 = new ValueAnimator();
        }
        if ((i & 4) != null) {
            valueAnimator3 = new ValueAnimator();
        }
        if ((i & 8) != 0) {
            animatorSet = new AnimatorSet();
        }
        this(valueAnimator, valueAnimator2, valueAnimator3, animatorSet);
    }

    /* renamed from: a */
    public final void m56877a() {
        if (this.f46976a.isRunning()) {
            C15136b.m56961a(this.f46976a);
        }
        if (this.f46977b.isRunning()) {
            C15136b.m56961a(this.f46977b);
        }
        if (this.f46978c.isRunning()) {
            C15136b.m56961a(this.f46978c);
        }
        if (this.f46979d.isRunning()) {
            this.f46979d.removeAllListeners();
            this.f46979d.cancel();
        }
    }

    /* renamed from: a */
    public final void m56878a(@NotNull BackgroundScalingView backgroundScalingView, float f, int i, @NotNull Function0<C15813i> function0) {
        C2668g.b(backgroundScalingView, "backgroundScalingView");
        C2668g.b(function0, "animationEndListener");
        m56876c();
        m56872a(backgroundScalingView);
        float translationY = backgroundScalingView.getTranslationY();
        i = translationY - (((float) i) * 1048576000);
        m56873a(backgroundScalingView, translationY, i);
        m56874b(backgroundScalingView);
        m56875b(backgroundScalingView, i, translationY + f);
        this.f46979d.addListener((AnimatorListener) new C15101e(this, function0));
        this.f46979d.playSequentially(new Animator[]{(Animator) this.f46976a, (Animator) this.f46977b, (Animator) this.f46978c});
        this.f46979d.start();
    }

    /* renamed from: b */
    public final boolean m56879b() {
        if (!(this.f46976a.isRunning() || this.f46977b.isRunning() || this.f46978c.isRunning())) {
            if (!this.f46979d.isRunning()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final void m56876c() {
        C15136b.m56961a(this.f46976a);
        C15136b.m56961a(this.f46977b);
        C15136b.m56961a(this.f46978c);
        this.f46979d.cancel();
        this.f46979d.removeAllListeners();
        this.f46979d.setStartDelay(0);
        this.f46979d.setInterpolator((TimeInterpolator) null);
    }

    /* renamed from: a */
    private final void m56872a(BackgroundScalingView backgroundScalingView) {
        int height = (int) (((float) backgroundScalingView.getHeight()) * backgroundScalingView.getScaleY());
        int width = (int) (((float) backgroundScalingView.getWidth()) * backgroundScalingView.getScaleX());
        LayoutParams layoutParams = backgroundScalingView.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = height;
        layoutParams2.width = width;
        layoutParams2.gravity = 17;
        backgroundScalingView.setLayoutParams(layoutParams2);
        backgroundScalingView.setScaleX(1.0f);
        backgroundScalingView.setScaleY(1.0f);
        backgroundScalingView.setRotationY(180.0f);
        layoutParams2 = new FrameLayout.LayoutParams(width / 3, height / 3);
        layoutParams2.gravity = 17;
        backgroundScalingView.m57011a(layoutParams2);
    }

    /* renamed from: a */
    private final void m56873a(BackgroundScalingView backgroundScalingView, float f, float f2) {
        this.f46976a.setDuration(400);
        this.f46976a.setFloatValues(new float[]{0.0f, 1.0f});
        this.f46976a.setInterpolator(new C2890b());
        this.f46976a.addUpdateListener(new C15098b(backgroundScalingView, f, f2));
    }

    /* renamed from: b */
    private final void m56874b(BackgroundScalingView backgroundScalingView) {
        this.f46977b.setDuration(336);
        this.f46977b.setFloatValues(new float[]{180.0f, 0.0f});
        this.f46977b.setInterpolator(new C2890b());
        this.f46977b.addUpdateListener(new C15099c(backgroundScalingView));
        this.f46977b.addListener(new C15100d(backgroundScalingView));
    }

    /* renamed from: b */
    private final void m56875b(BackgroundScalingView backgroundScalingView, float f, float f2) {
        this.f46978c.setDuration(260);
        this.f46978c.setFloatValues(new float[]{0.0f, 1.0f});
        this.f46978c.setInterpolator(new C2890b());
        this.f46978c.addUpdateListener(new C15097a(backgroundScalingView, f, f2));
    }
}
