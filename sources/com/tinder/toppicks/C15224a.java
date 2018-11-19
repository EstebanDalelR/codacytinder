package com.tinder.toppicks;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/MultiViewFadeAnimator;", "", "views", "", "Landroid/view/View;", "([Landroid/view/View;)V", "[Landroid/view/View;", "getFadeAnimation", "Landroid/animation/ValueAnimator;", "fade", "Lcom/tinder/toppicks/FadeAnimation;", "duration", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.a */
public final class C15224a {
    /* renamed from: a */
    private final View[] f47317a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "update", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/toppicks/MultiViewFadeAnimator$getFadeAnimation$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.a$a */
    static final class C15221a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C15224a f47310a;
        /* renamed from: b */
        final /* synthetic */ FadeAnimation f47311b;
        /* renamed from: c */
        final /* synthetic */ long f47312c;

        C15221a(C15224a c15224a, FadeAnimation fadeAnimation, long j) {
            this.f47310a = c15224a;
            this.f47311b = fadeAnimation;
            this.f47312c = j;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            for (View view : this.f47310a.f47317a) {
                C2668g.a(valueAnimator, "update");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                view.setAlpha(((Float) animatedValue).floatValue());
            }
        }
    }

    public C15224a(@NotNull View... viewArr) {
        C2668g.b(viewArr, "views");
        this.f47317a = viewArr;
    }

    @NotNull
    /* renamed from: a */
    public final ValueAnimator m57292a(@NotNull FadeAnimation fadeAnimation, long j) {
        C2668g.b(fadeAnimation, "fade");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(new float[]{fadeAnimation.getStartAlpha(), fadeAnimation.getEndAlpha()});
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new C15221a(this, fadeAnimation, j));
        return valueAnimator;
    }
}
