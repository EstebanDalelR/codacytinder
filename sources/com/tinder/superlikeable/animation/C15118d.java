package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateInterpolator;
import com.tinder.superlikeable.p422b.C15136b;
import com.tinder.superlikeable.p422b.C15138d;
import com.tinder.superlikeable.view.BackgroundScalingView;
import com.tinder.superlikeable.view.SuperLikeableGridView;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator;", "", "exitAnimationHelper", "Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$ExitAnimationHelper;", "(Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$ExitAnimationHelper;)V", "cancelAnimator", "", "createAnimationParams", "Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$AnimationParams;", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "superLikeableGridView", "Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "backgroundScalingView", "Lcom/tinder/superlikeable/view/BackgroundScalingView;", "exitAnimationViewBounds", "Landroid/graphics/Rect;", "backgroundStarDrawable", "Landroid/graphics/drawable/Drawable;", "start", "params", "exitAnimationEndListener", "Lkotlin/Function0;", "AnimationParams", "ExitAnimationHelper", "GetLocationOnScreenProxy", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.d */
public final class C15118d {
    /* renamed from: a */
    private final C15115b f47053a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$AnimationParams;", "", "superLikeableViewContainer", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "superLikeableGridView", "Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "backgroundScalingView", "Lcom/tinder/superlikeable/view/BackgroundScalingView;", "exitAnimationViewBounds", "Landroid/graphics/Rect;", "backgroundStarDrawable", "Landroid/graphics/drawable/Drawable;", "(Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;Lcom/tinder/superlikeable/view/SuperLikeableGridView;Lcom/tinder/superlikeable/view/BackgroundScalingView;Landroid/graphics/Rect;Landroid/graphics/drawable/Drawable;)V", "getBackgroundScalingView", "()Lcom/tinder/superlikeable/view/BackgroundScalingView;", "getBackgroundStarDrawable", "()Landroid/graphics/drawable/Drawable;", "getExitAnimationViewBounds", "()Landroid/graphics/Rect;", "getSuperLikeableGridView", "()Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "getSuperLikeableViewContainer", "()Lcom/tinder/superlikeable/view/SuperLikeableViewContainer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.d$a */
    public static final class C15112a {
        @NotNull
        /* renamed from: a */
        private final SuperLikeableViewContainer f47027a;
        @NotNull
        /* renamed from: b */
        private final SuperLikeableGridView f47028b;
        @NotNull
        /* renamed from: c */
        private final BackgroundScalingView f47029c;
        @NotNull
        /* renamed from: d */
        private final Rect f47030d;
        @NotNull
        /* renamed from: e */
        private final Drawable f47031e;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15112a) {
                    C15112a c15112a = (C15112a) obj;
                    if (C2668g.a(this.f47027a, c15112a.f47027a) && C2668g.a(this.f47028b, c15112a.f47028b) && C2668g.a(this.f47029c, c15112a.f47029c) && C2668g.a(this.f47030d, c15112a.f47030d) && C2668g.a(this.f47031e, c15112a.f47031e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            SuperLikeableViewContainer superLikeableViewContainer = this.f47027a;
            int i = 0;
            int hashCode = (superLikeableViewContainer != null ? superLikeableViewContainer.hashCode() : 0) * 31;
            SuperLikeableGridView superLikeableGridView = this.f47028b;
            hashCode = (hashCode + (superLikeableGridView != null ? superLikeableGridView.hashCode() : 0)) * 31;
            BackgroundScalingView backgroundScalingView = this.f47029c;
            hashCode = (hashCode + (backgroundScalingView != null ? backgroundScalingView.hashCode() : 0)) * 31;
            Rect rect = this.f47030d;
            hashCode = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
            Drawable drawable = this.f47031e;
            if (drawable != null) {
                i = drawable.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimationParams(superLikeableViewContainer=");
            stringBuilder.append(this.f47027a);
            stringBuilder.append(", superLikeableGridView=");
            stringBuilder.append(this.f47028b);
            stringBuilder.append(", backgroundScalingView=");
            stringBuilder.append(this.f47029c);
            stringBuilder.append(", exitAnimationViewBounds=");
            stringBuilder.append(this.f47030d);
            stringBuilder.append(", backgroundStarDrawable=");
            stringBuilder.append(this.f47031e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15112a(@NotNull SuperLikeableViewContainer superLikeableViewContainer, @NotNull SuperLikeableGridView superLikeableGridView, @NotNull BackgroundScalingView backgroundScalingView, @NotNull Rect rect, @NotNull Drawable drawable) {
            C2668g.b(superLikeableViewContainer, "superLikeableViewContainer");
            C2668g.b(superLikeableGridView, "superLikeableGridView");
            C2668g.b(backgroundScalingView, "backgroundScalingView");
            C2668g.b(rect, "exitAnimationViewBounds");
            C2668g.b(drawable, "backgroundStarDrawable");
            this.f47027a = superLikeableViewContainer;
            this.f47028b = superLikeableGridView;
            this.f47029c = backgroundScalingView;
            this.f47030d = rect;
            this.f47031e = drawable;
        }

        @NotNull
        /* renamed from: a */
        public final SuperLikeableViewContainer m56931a() {
            return this.f47027a;
        }

        @NotNull
        /* renamed from: b */
        public final BackgroundScalingView m56932b() {
            return this.f47029c;
        }

        @NotNull
        /* renamed from: c */
        public final Rect m56933c() {
            return this.f47030d;
        }

        @NotNull
        /* renamed from: d */
        public final Drawable m56934d() {
            return this.f47031e;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$ExitAnimationHelper;", "", "animator", "Landroid/animation/ValueAnimator;", "superLikeCounterSpinAnimator", "Lcom/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator;", "getLocationOnScreenProxy", "Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$GetLocationOnScreenProxy;", "backgroundScalingViewBounds", "Landroid/graphics/Rect;", "(Landroid/animation/ValueAnimator;Lcom/tinder/superlikeable/animation/SuperLikeCounterSpinAnimator;Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$GetLocationOnScreenProxy;Landroid/graphics/Rect;)V", "cancelAnimationIfRunning", "", "isRunning", "", "startAnimation", "params", "Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$AnimationParams;", "exitAnimationEndListener", "Lkotlin/Function0;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.d$b */
    public static final class C15115b {
        /* renamed from: a */
        private final ValueAnimator f47044a;
        /* renamed from: b */
        private final C15102a f47045b;
        /* renamed from: c */
        private final C15116c f47046c;
        /* renamed from: d */
        private final Rect f47047d;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.animation.d$b$a */
        static final class C15113a implements AnimatorUpdateListener {
            /* renamed from: a */
            final /* synthetic */ float f47032a;
            /* renamed from: b */
            final /* synthetic */ float f47033b;
            /* renamed from: c */
            final /* synthetic */ float f47034c;
            /* renamed from: d */
            final /* synthetic */ float f47035d;
            /* renamed from: e */
            final /* synthetic */ float f47036e;
            /* renamed from: f */
            final /* synthetic */ float f47037f;
            /* renamed from: g */
            final /* synthetic */ BackgroundScalingView f47038g;

            C15113a(float f, float f2, float f3, float f4, float f5, float f6, BackgroundScalingView backgroundScalingView) {
                this.f47032a = f;
                this.f47033b = f2;
                this.f47034c = f3;
                this.f47035d = f4;
                this.f47036e = f5;
                this.f47037f = f6;
                this.f47038g = backgroundScalingView;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2668g.a(valueAnimator, "animation");
                valueAnimator = valueAnimator.getAnimatedFraction();
                float f = this.f47034c + ((this.f47035d - this.f47034c) * valueAnimator);
                float f2 = this.f47036e + ((this.f47037f - this.f47036e) * valueAnimator);
                this.f47038g.setTranslationX(this.f47032a + ((this.f47033b - this.f47032a) * valueAnimator));
                this.f47038g.setTranslationY(f);
                this.f47038g.setScaleX(f2);
                this.f47038g.setScaleY(f2);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$ExitAnimationHelper$startAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$ExitAnimationHelper;Lcom/tinder/superlikeable/view/BackgroundScalingView;ILcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$AnimationParams;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.animation.d$b$b */
        public static final class C15114b extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C15115b f47039a;
            /* renamed from: b */
            final /* synthetic */ BackgroundScalingView f47040b;
            /* renamed from: c */
            final /* synthetic */ int f47041c;
            /* renamed from: d */
            final /* synthetic */ C15112a f47042d;
            /* renamed from: e */
            final /* synthetic */ Function0 f47043e;

            C15114b(C15115b c15115b, BackgroundScalingView backgroundScalingView, int i, C15112a c15112a, Function0 function0) {
                this.f47039a = c15115b;
                this.f47040b = backgroundScalingView;
                this.f47041c = i;
                this.f47042d = c15112a;
                this.f47043e = function0;
            }

            public void onAnimationEnd(@Nullable Animator animator) {
                this.f47039a.f47044a.removeListener(this);
                this.f47039a.f47045b.m56878a(this.f47040b, (float) this.f47041c, this.f47042d.m56931a().getHeight(), this.f47043e);
            }
        }

        public C15115b() {
            this(null, null, null, null, 15, null);
        }

        public C15115b(@NotNull ValueAnimator valueAnimator, @NotNull C15102a c15102a, @NotNull C15116c c15116c, @NotNull Rect rect) {
            C2668g.b(valueAnimator, "animator");
            C2668g.b(c15102a, "superLikeCounterSpinAnimator");
            C2668g.b(c15116c, "getLocationOnScreenProxy");
            C2668g.b(rect, "backgroundScalingViewBounds");
            this.f47044a = valueAnimator;
            this.f47045b = c15102a;
            this.f47046c = c15116c;
            this.f47047d = rect;
        }

        public /* synthetic */ C15115b(ValueAnimator valueAnimator, C15102a c15102a, C15116c c15116c, Rect rect, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                valueAnimator = new ValueAnimator();
            }
            if ((i & 2) != null) {
                C15102a c15102a2 = new C15102a(null, null, null, null, 15, null);
            }
            if ((i & 4) != null) {
                c15116c = new C15116c();
            }
            if ((i & 8) != 0) {
                rect = new Rect();
            }
            this(valueAnimator, c15102a, c15116c, rect);
        }

        /* renamed from: a */
        public final void m56937a(@NotNull C15112a c15112a, @NotNull Function0<C15813i> function0) {
            C2668g.b(c15112a, "params");
            C2668g.b(function0, "exitAnimationEndListener");
            if (!m56938a()) {
                Rect c = c15112a.m56933c();
                BackgroundScalingView b = c15112a.m56932b();
                this.f47046c.m56940a(b, this.f47047d);
                float min = ((float) Math.min(c.right - c.left, c.bottom - c.top)) / ((float) b.getWidth());
                int i = (c.left + c.right) / 2;
                int i2 = (c.top + c.bottom) / 2;
                int i3 = (c.bottom - c.top) / 2;
                i -= (this.f47047d.left + this.f47047d.right) / 2;
                i2 = (i2 - ((this.f47047d.top + this.f47047d.bottom) / 2)) - i3;
                b.setScaleX(min);
                b.setScaleY(min);
                float f = (float) i;
                b.setTranslationX(f);
                float f2 = (float) i2;
                b.setTranslationY(f2);
                C15136b.m56961a(this.f47044a);
                this.f47044a.setFloatValues(new float[]{0.0f, 1.0f});
                this.f47044a.setDuration(450);
                this.f47044a.setInterpolator(new AccelerateInterpolator());
                this.f47044a.addUpdateListener(new C15113a(f, 0.0f, f2, 0.0f, min, 8.0f, b));
                this.f47044a.addListener(new C15114b(this, b, i3, c15112a, function0));
                this.f47044a.reverse();
            }
        }

        /* renamed from: a */
        public final boolean m56938a() {
            if (!this.f47044a.isRunning()) {
                if (!this.f47045b.m56879b()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final void m56939b() {
            if (this.f47044a.isRunning()) {
                C15136b.m56961a(this.f47044a);
            }
            this.f47045b.m56877a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$GetLocationOnScreenProxy;", "", "()V", "getLocationOnScreen", "", "view", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.d$c */
    public static final class C15116c {
        /* renamed from: a */
        public final void m56940a(@NotNull View view, @NotNull Rect rect) {
            C2668g.b(view, "view");
            C2668g.b(rect, "rect");
            C15138d.m56966a(view, rect);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$start$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator;Lcom/tinder/superlikeable/view/BackgroundScalingView;ILcom/tinder/superlikeable/animation/SuperLikeableFlingCompleteExitAnimator$AnimationParams;Lkotlin/jvm/functions/Function0;)V", "onGlobalLayout", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.d$d */
    public static final class C15117d implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C15118d f47048a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f47049b;
        /* renamed from: c */
        final /* synthetic */ int f47050c;
        /* renamed from: d */
        final /* synthetic */ C15112a f47051d;
        /* renamed from: e */
        final /* synthetic */ Function0 f47052e;

        C15117d(C15118d c15118d, BackgroundScalingView backgroundScalingView, int i, C15112a c15112a, Function0 function0) {
            this.f47048a = c15118d;
            this.f47049b = backgroundScalingView;
            this.f47050c = i;
            this.f47051d = c15112a;
            this.f47052e = function0;
        }

        public void onGlobalLayout() {
            if (this.f47049b.getWidth() == this.f47050c && this.f47049b.getHeight() == this.f47050c) {
                this.f47049b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f47048a.f47053a.m56937a(this.f47051d, this.f47052e);
            }
        }
    }

    public C15118d() {
        this(null, 1, null);
    }

    public C15118d(@NotNull C15115b c15115b) {
        C2668g.b(c15115b, "exitAnimationHelper");
        this.f47053a = c15115b;
    }

    public /* synthetic */ C15118d(C15115b c15115b, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            C15115b c15115b2 = new C15115b(null, null, null, null, 15, null);
        }
        this(c15115b);
    }

    /* renamed from: a */
    public final void m56944a(@NotNull C15112a c15112a, @NotNull Function0<C15813i> function0) {
        C2668g.b(c15112a, "params");
        C2668g.b(function0, "exitAnimationEndListener");
        if (!this.f47053a.m56938a()) {
            SuperLikeableViewContainer a = c15112a.m56931a();
            BackgroundScalingView b = c15112a.m56932b();
            int childCount = a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = a.getChildAt(i);
                if (!C2668g.a(childAt, b)) {
                    C2668g.a(childAt, "childView");
                    childAt.setVisibility(8);
                }
            }
            int min = Math.min(a.getWidth(), a.getHeight());
            b.getViewTreeObserver().addOnGlobalLayoutListener(new C15117d(this, b, min, c15112a, function0));
            b.setBackground(c15112a.m56934d());
            b.setScaleX(1.0f);
            b.setScaleY(1.0f);
            b.setTranslationX(0.0f);
            b.setTranslationY(0.0f);
            c15112a = b.getLayoutParams();
            c15112a.width = min;
            c15112a.height = min;
            b.setLayoutParams(c15112a);
        }
    }

    /* renamed from: a */
    public final void m56943a() {
        this.f47053a.m56939b();
    }

    @NotNull
    /* renamed from: a */
    public final C15112a m56942a(@NotNull SuperLikeableViewContainer superLikeableViewContainer, @NotNull SuperLikeableGridView superLikeableGridView, @NotNull BackgroundScalingView backgroundScalingView, @NotNull Rect rect, @NotNull Drawable drawable) {
        C2668g.b(superLikeableViewContainer, "superLikeableViewContainer");
        C2668g.b(superLikeableGridView, "superLikeableGridView");
        C2668g.b(backgroundScalingView, "backgroundScalingView");
        C2668g.b(rect, "exitAnimationViewBounds");
        C2668g.b(drawable, "backgroundStarDrawable");
        return new C15112a(superLikeableViewContainer, superLikeableGridView, backgroundScalingView, rect, drawable);
    }
}
