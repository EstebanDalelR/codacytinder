package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.tinder.superlikeable.p422b.C15136b;
import com.tinder.superlikeable.view.SuperLikeableViewDragHelper;
import java.util.Arrays;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011J\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator;", "", "dragHelper", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;", "valueAnimator", "Landroid/animation/ValueAnimator;", "(Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;Landroid/animation/ValueAnimator;)V", "animatorFloatValues", "", "createAnimationParams", "Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator$AnimationParams;", "view", "Landroid/view/View;", "start", "", "animationParams", "onAnimationEnd", "Lkotlin/Function0;", "stop", "AnimationParams", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.e */
public final class C15122e {
    /* renamed from: a */
    private final float[] f47066a;
    /* renamed from: b */
    private final SuperLikeableViewDragHelper f47067b;
    /* renamed from: c */
    private final ValueAnimator f47068c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator$AnimationParams;", "", "selectedView", "Landroid/view/View;", "startYOffset", "", "endYOffset", "startScale", "endScale", "animationDuration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "(Landroid/view/View;FFFFJLandroid/animation/TimeInterpolator;)V", "getAnimationDuration", "()J", "getEndScale", "()F", "getEndYOffset", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "getSelectedView", "()Landroid/view/View;", "getStartScale", "getStartYOffset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.e$a */
    public static final class C15119a {
        @NotNull
        /* renamed from: a */
        private final View f47054a;
        /* renamed from: b */
        private final float f47055b;
        /* renamed from: c */
        private final float f47056c;
        /* renamed from: d */
        private final float f47057d;
        /* renamed from: e */
        private final float f47058e;
        /* renamed from: f */
        private final long f47059f;
        @NotNull
        /* renamed from: g */
        private final TimeInterpolator f47060g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15119a) {
                C15119a c15119a = (C15119a) obj;
                if (C2668g.a(this.f47054a, c15119a.f47054a) && Float.compare(this.f47055b, c15119a.f47055b) == 0 && Float.compare(this.f47056c, c15119a.f47056c) == 0 && Float.compare(this.f47057d, c15119a.f47057d) == 0 && Float.compare(this.f47058e, c15119a.f47058e) == 0) {
                    return ((this.f47059f > c15119a.f47059f ? 1 : (this.f47059f == c15119a.f47059f ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f47060g, c15119a.f47060g);
                }
            }
        }

        public int hashCode() {
            View view = this.f47054a;
            int i = 0;
            int hashCode = (((((((((view != null ? view.hashCode() : 0) * 31) + Float.floatToIntBits(this.f47055b)) * 31) + Float.floatToIntBits(this.f47056c)) * 31) + Float.floatToIntBits(this.f47057d)) * 31) + Float.floatToIntBits(this.f47058e)) * 31;
            long j = this.f47059f;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            TimeInterpolator timeInterpolator = this.f47060g;
            if (timeInterpolator != null) {
                i = timeInterpolator.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimationParams(selectedView=");
            stringBuilder.append(this.f47054a);
            stringBuilder.append(", startYOffset=");
            stringBuilder.append(this.f47055b);
            stringBuilder.append(", endYOffset=");
            stringBuilder.append(this.f47056c);
            stringBuilder.append(", startScale=");
            stringBuilder.append(this.f47057d);
            stringBuilder.append(", endScale=");
            stringBuilder.append(this.f47058e);
            stringBuilder.append(", animationDuration=");
            stringBuilder.append(this.f47059f);
            stringBuilder.append(", interpolator=");
            stringBuilder.append(this.f47060g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15119a(@NotNull View view, float f, float f2, float f3, float f4, long j, @NotNull TimeInterpolator timeInterpolator) {
            C2668g.b(view, "selectedView");
            C2668g.b(timeInterpolator, "interpolator");
            this.f47054a = view;
            this.f47055b = f;
            this.f47056c = f2;
            this.f47057d = f3;
            this.f47058e = f4;
            this.f47059f = j;
            this.f47060g = timeInterpolator;
        }

        @NotNull
        /* renamed from: a */
        public final View m56945a() {
            return this.f47054a;
        }

        /* renamed from: b */
        public final float m56946b() {
            return this.f47055b;
        }

        /* renamed from: c */
        public final float m56947c() {
            return this.f47056c;
        }

        /* renamed from: d */
        public final float m56948d() {
            return this.f47057d;
        }

        /* renamed from: e */
        public final float m56949e() {
            return this.f47058e;
        }

        /* renamed from: f */
        public final long m56950f() {
            return this.f47059f;
        }

        @NotNull
        /* renamed from: g */
        public final TimeInterpolator m56951g() {
            return this.f47060g;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.e$b */
    static final class C15120b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C15122e f47061a;
        /* renamed from: b */
        final /* synthetic */ C15119a f47062b;

        C15120b(C15122e c15122e, C15119a c15119a) {
            this.f47061a = c15122e;
            this.f47062b = c15119a;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = ((Float) animatedValue).floatValue();
            if (((double) valueAnimator.getAnimatedFraction()) >= 0.5d) {
                valueAnimator = this.f47062b.m56948d() + ((this.f47062b.m56949e() - this.f47062b.m56948d()) * floatValue);
                this.f47062b.m56945a().setScaleX(valueAnimator);
                this.f47062b.m56945a().setScaleY(valueAnimator);
            }
            this.f47061a.f47067b.m57050a(this.f47062b.m56945a(), 0.0f, ((float) -1) * (this.f47062b.m56946b() + (floatValue * (this.f47062b.m56947c() - this.f47062b.m56946b()))), 0.0f, 0.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeableIntroAnimator$start$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator;Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator$AnimationParams;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.e$c */
    public static final class C15121c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C15122e f47063a;
        /* renamed from: b */
        final /* synthetic */ C15119a f47064b;
        /* renamed from: c */
        final /* synthetic */ Function0 f47065c;

        C15121c(C15122e c15122e, C15119a c15119a, Function0 function0) {
            this.f47063a = c15122e;
            this.f47064b = c15119a;
            this.f47065c = function0;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f47063a.f47067b.m57048a(this.f47064b.m56945a());
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f47063a.f47067b.m57053b(this.f47064b.m56945a());
            this.f47065c.invoke();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15122e(@org.jetbrains.annotations.NotNull com.tinder.superlikeable.view.SuperLikeableViewDragHelper r2, @org.jetbrains.annotations.NotNull android.animation.ValueAnimator r3) {
        /*
        r1 = this;
        r0 = "dragHelper";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r0 = "valueAnimator";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r1.<init>();
        r1.f47067b = r2;
        r1.f47068c = r3;
        r2 = 3;
        r2 = new float[r2];
        r2 = {0, 1065353216, 0};
        r1.f47066a = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.superlikeable.animation.e.<init>(com.tinder.superlikeable.view.SuperLikeableViewDragHelper, android.animation.ValueAnimator):void");
    }

    public /* synthetic */ C15122e(SuperLikeableViewDragHelper superLikeableViewDragHelper, ValueAnimator valueAnimator, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            valueAnimator = new ValueAnimator();
        }
        this(superLikeableViewDragHelper, valueAnimator);
    }

    /* renamed from: a */
    public final void m56955a(@NotNull C15119a c15119a, @NotNull Function0<C15813i> function0) {
        C2668g.b(c15119a, "animationParams");
        C2668g.b(function0, "onAnimationEnd");
        C15136b.m56961a(this.f47068c);
        ValueAnimator valueAnimator = this.f47068c;
        float[] fArr = this.f47066a;
        valueAnimator.setFloatValues(Arrays.copyOf(fArr, fArr.length));
        this.f47068c.setInterpolator(c15119a.m56951g());
        this.f47068c.setDuration(c15119a.m56950f());
        this.f47068c.addUpdateListener(new C15120b(this, c15119a));
        this.f47068c.addListener(new C15121c(this, c15119a, function0));
        this.f47068c.start();
    }

    /* renamed from: a */
    public final void m56954a() {
        if (this.f47068c.isRunning()) {
            C15136b.m56961a(this.f47068c);
        }
    }

    @NotNull
    /* renamed from: a */
    public final C15119a m56953a(@NotNull View view) {
        C2668g.b(view, "view");
        return new C15119a(view, 0.0f, ((float) view.getHeight()) * 0.75f, 1.0f, 1.05f, 1200, new DecelerateInterpolator());
    }
}
