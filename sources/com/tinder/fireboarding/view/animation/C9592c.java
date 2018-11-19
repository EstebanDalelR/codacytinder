package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.fireboarding.view.C9571a;
import com.tinder.fireboarding.view.C9617b;
import com.tinder.fireboarding.view.animation.C9600e.C9596a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory;", "", "()V", "iconScaleUpdateCalculator", "Lcom/tinder/fireboarding/view/animation/FractionUpdateCalculator;", "iconXTranslationUpdateCalculator", "iconYTranslationUpdateCalculator", "create", "Landroid/animation/ValueAnimator;", "backgroundView", "Landroid/view/View;", "iconView", "textContainer", "iconParams", "Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory$IconParams;", "initializeCalclulators", "", "updateAlpha", "fraction", "", "updateIconScale", "updateIconTranslation", "Companion", "IconParams", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.c */
public final class C9592c {
    /* renamed from: a */
    public static final C9588a f32062a = new C9588a();
    /* renamed from: b */
    private C9604g f32063b;
    /* renamed from: c */
    private C9604g f32064c;
    /* renamed from: d */
    private C9604g f32065d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory$Companion;", "", "()V", "START_ICON_TRANSLATION", "", "createIconParams", "Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory$IconParams;", "iconView", "Landroid/view/View;", "startIconScale", "animationParams", "Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$AnimationParams;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.c$a */
    public static final class C9588a {
        private C9588a() {
        }

        @NotNull
        /* renamed from: a */
        public final C9589b m39939a(@NotNull View view, float f, @NotNull C9596a c9596a) {
            C2668g.b(view, "iconView");
            C2668g.b(c9596a, "animationParams");
            C9571a a = C9617b.m40012a(view);
            return new C9589b(0.0f, 0.0f, ((float) (C9617b.m40011a(c9596a.m39959c()) - C9617b.m40011a(a))) + view.getTranslationX(), ((float) (C9617b.m40013b(c9596a.m39959c()) - C9617b.m40013b(a))) + view.getTranslationY(), f, ((float) c9596a.m39959c().m39896c()) / ((float) view.getHeight()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory$IconParams;", "", "startXTranslation", "", "startYTranslation", "endXTranslation", "endYTranslation", "startScale", "endScale", "(FFFFFF)V", "getEndScale", "()F", "getEndXTranslation", "getEndYTranslation", "getStartScale", "getStartXTranslation", "getStartYTranslation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.c$b */
    public static final class C9589b {
        /* renamed from: a */
        private final float f32048a;
        /* renamed from: b */
        private final float f32049b;
        /* renamed from: c */
        private final float f32050c;
        /* renamed from: d */
        private final float f32051d;
        /* renamed from: e */
        private final float f32052e;
        /* renamed from: f */
        private final float f32053f;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9589b) {
                    C9589b c9589b = (C9589b) obj;
                    if (Float.compare(this.f32048a, c9589b.f32048a) == 0 && Float.compare(this.f32049b, c9589b.f32049b) == 0 && Float.compare(this.f32050c, c9589b.f32050c) == 0 && Float.compare(this.f32051d, c9589b.f32051d) == 0 && Float.compare(this.f32052e, c9589b.f32052e) == 0 && Float.compare(this.f32053f, c9589b.f32053f) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f32048a) * 31) + Float.floatToIntBits(this.f32049b)) * 31) + Float.floatToIntBits(this.f32050c)) * 31) + Float.floatToIntBits(this.f32051d)) * 31) + Float.floatToIntBits(this.f32052e)) * 31) + Float.floatToIntBits(this.f32053f);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IconParams(startXTranslation=");
            stringBuilder.append(this.f32048a);
            stringBuilder.append(", startYTranslation=");
            stringBuilder.append(this.f32049b);
            stringBuilder.append(", endXTranslation=");
            stringBuilder.append(this.f32050c);
            stringBuilder.append(", endYTranslation=");
            stringBuilder.append(this.f32051d);
            stringBuilder.append(", startScale=");
            stringBuilder.append(this.f32052e);
            stringBuilder.append(", endScale=");
            stringBuilder.append(this.f32053f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9589b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f32048a = f;
            this.f32049b = f2;
            this.f32050c = f3;
            this.f32051d = f4;
            this.f32052e = f5;
            this.f32053f = f6;
        }

        /* renamed from: a */
        public final float m39940a() {
            return this.f32048a;
        }

        /* renamed from: b */
        public final float m39941b() {
            return this.f32049b;
        }

        /* renamed from: c */
        public final float m39942c() {
            return this.f32050c;
        }

        /* renamed from: d */
        public final float m39943d() {
            return this.f32051d;
        }

        /* renamed from: e */
        public final float m39944e() {
            return this.f32052e;
        }

        /* renamed from: f */
        public final float m39945f() {
            return this.f32053f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fireboarding/view/animation/ExitAnimatorFactory$create$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.c$c */
    static final class C9590c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9592c f32054a;
        /* renamed from: b */
        final /* synthetic */ View f32055b;
        /* renamed from: c */
        final /* synthetic */ View f32056c;
        /* renamed from: d */
        final /* synthetic */ View f32057d;

        C9590c(C9592c c9592c, View view, View view2, View view3) {
            this.f32054a = c9592c;
            this.f32055b = view;
            this.f32056c = view2;
            this.f32057d = view3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            this.f32054a.m39947a(this.f32055b, this.f32056c, animatedFraction);
            this.f32054a.m39946a(animatedFraction, this.f32057d);
            this.f32054a.m39951b(animatedFraction, this.f32057d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/ExitAnimatorFactory$create$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory$create$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.c$d */
    public static final class C9591d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9592c f32058a;
        /* renamed from: b */
        final /* synthetic */ View f32059b;
        /* renamed from: c */
        final /* synthetic */ View f32060c;
        /* renamed from: d */
        final /* synthetic */ View f32061d;

        C9591d(C9592c c9592c, View view, View view2, View view3) {
            this.f32058a = c9592c;
            this.f32059b = view;
            this.f32060c = view2;
            this.f32061d = view3;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32059b.setAlpha(0.0f);
            this.f32058a.m39946a(1.0f, this.f32061d);
            this.f32058a.m39951b(1.0f, this.f32061d);
        }
    }

    @NotNull
    /* renamed from: a */
    public final ValueAnimator m39953a(@NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull C9589b c9589b) {
        C2668g.b(view, "backgroundView");
        C2668g.b(view2, "iconView");
        C2668g.b(view3, "textContainer");
        C2668g.b(c9589b, "iconParams");
        m39948a(c9589b);
        c9589b = new ValueAnimator();
        c9589b.setDuration(1000);
        c9589b.setFloatValues(new float[]{0.0f, 1.0f});
        c9589b.addUpdateListener(new C9590c(this, view, view3, view2));
        c9589b.addListener(new C9591d(this, view, view3, view2));
        return c9589b;
    }

    /* renamed from: a */
    private final void m39948a(C9589b c9589b) {
        this.f32063b = new C9604g(c9589b.m39940a(), c9589b.m39942c(), 0.0f, 4, null);
        this.f32064c = new C9604g(c9589b.m39941b(), c9589b.m39943d(), 0.0f, 4, null);
        this.f32065d = new C9604g(c9589b.m39944e(), c9589b.m39945f(), 0.0f, 4, null);
    }

    /* renamed from: a */
    private final void m39947a(View view, View view2, float f) {
        float f2 = ((float) 1) - f;
        view.setAlpha(f2);
        view2.setAlpha(f2);
    }

    /* renamed from: a */
    private final void m39946a(float f, View view) {
        C9604g c9604g = this.f32063b;
        if (c9604g != null) {
            view.setTranslationX(c9604g.m39970a(f));
        }
        c9604g = this.f32064c;
        if (c9604g != null) {
            view.setTranslationY(c9604g.m39970a(f));
        }
    }

    /* renamed from: b */
    private final void m39951b(float f, View view) {
        C9604g c9604g = this.f32065d;
        if (c9604g != null) {
            f = c9604g.m39970a(f);
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }
}
