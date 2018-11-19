package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.superlikeable.p422b.C15136b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\t"}, d2 = {"prepareForTextAppearanceAnimation", "", "Landroid/animation/ValueAnimator;", "duration", "", "startDelay", "bottomTextView", "Landroid/view/View;", "topTextView", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.i */
public final class C15134i {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/ValueAnimatorTextAppearanceExtKt$prepareForTextAppearanceAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/view/View;Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.i$a */
    public static final class C15132a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ View f47102a;
        /* renamed from: b */
        final /* synthetic */ View f47103b;

        C15132a(View view, View view2) {
            this.f47102a = view;
            this.f47103b = view2;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f47102a.setVisibility(0);
            this.f47103b.setVisibility(0);
            this.f47102a.setAlpha(0.0f);
            this.f47103b.setAlpha(0.0f);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47102a.setAlpha(1.0f);
            this.f47103b.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "updatedAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.i$b */
    static final class C15133b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47104a;
        /* renamed from: b */
        final /* synthetic */ View f47105b;

        C15133b(View view, View view2) {
            this.f47104a = view;
            this.f47105b = view2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "updatedAnimator");
            valueAnimator = valueAnimator.getAnimatedFraction();
            this.f47104a.setAlpha(valueAnimator);
            this.f47105b.setAlpha(valueAnimator);
        }
    }

    /* renamed from: a */
    public static final void m56959a(@NotNull ValueAnimator valueAnimator, long j, long j2, @NotNull View view, @NotNull View view2) {
        C2668g.b(valueAnimator, "$receiver");
        C2668g.b(view, "bottomTextView");
        C2668g.b(view2, "topTextView");
        C15136b.m56961a(valueAnimator);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(j);
        valueAnimator.setStartDelay(j2);
        valueAnimator.addListener((AnimatorListener) new C15132a(view2, view));
        valueAnimator.addUpdateListener((AnimatorUpdateListener) new C15133b(view2, view));
    }
}
