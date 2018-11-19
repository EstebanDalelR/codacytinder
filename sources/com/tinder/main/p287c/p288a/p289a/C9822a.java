package com.tinder.main.p287c.p288a.p289a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.base.p170a.p171a.C8299a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/main/view/tooltip/animations/OverlayFadeInFadeOutAnimator;", "", "()V", "tooltipOverlayAnimator", "Landroid/animation/ValueAnimator;", "end", "", "start", "view", "Landroid/view/View;", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.c.a.a.a */
public final class C9822a {
    /* renamed from: a */
    private final ValueAnimator f32514a = new ValueAnimator();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.a.a.a$a */
    static final class C9820a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f32512a;

        C9820a(View view) {
            this.f32512a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue() * 1159479296;
            if (valueAnimator <= 1128792064) {
                this.f32512a.setAlpha(valueAnimator / 1128792064);
            } else if (valueAnimator > 2100.0f) {
                this.f32512a.setAlpha((2500.0f - valueAnimator) / 400.0f);
            } else {
                this.f32512a.setAlpha(1.0f);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/main/view/tooltip/animations/OverlayFadeInFadeOutAnimator$start$2", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/view/View;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.a.a.a$b */
    public static final class C9821b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ View f32513a;

        C9821b(View view) {
            this.f32513a = view;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32513a.setAlpha(0.0f);
            this.f32513a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void m40433a(@NotNull View view) {
        C2668g.b(view, "view");
        view.setAlpha(0.0f);
        C8299a.m35391a(this.f32514a);
        this.f32514a.setFloatValues(new float[]{0.0f, 1.0f});
        this.f32514a.addUpdateListener(new C9820a(view));
        this.f32514a.addListener(new C9821b(view));
        this.f32514a.setDuration((long) 2500.0f);
        this.f32514a.start();
    }

    /* renamed from: a */
    public final void m40432a() {
        if (this.f32514a.isRunning()) {
            C8299a.m35391a(this.f32514a);
        }
    }
}
