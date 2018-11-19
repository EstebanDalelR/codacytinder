package com.tinder.main.p287c.p288a.p289a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tinder.base.p170a.p171a.C8299a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/main/view/tooltip/animations/TooltipAppearingAnimator;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "end", "", "start", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "anchorViewHeight", "", "startAnimationInternal", "view", "Landroid/view/View;", "tooltipOffsetX", "", "updateView", "translationY", "scale", "alpha", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.c.a.a.b */
public final class C9826b {
    /* renamed from: a */
    private final ValueAnimator f32534a = new ValueAnimator();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/main/view/tooltip/animations/TooltipAppearingAnimator$start$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lcom/tinder/main/view/tooltip/animations/TooltipAppearingAnimator;Ltinder/com/tooltip/TooltipView;I)V", "onPreDraw", "", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.a.a.b$a */
    public static final class C9823a implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ C9826b f32515a;
        /* renamed from: b */
        final /* synthetic */ TooltipView f32516b;
        /* renamed from: c */
        final /* synthetic */ int f32517c;

        C9823a(C9826b c9826b, TooltipView tooltipView, int i) {
            this.f32515a = c9826b;
            this.f32516b = tooltipView;
            this.f32517c = i;
        }

        public boolean onPreDraw() {
            this.f32516b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f32515a.m40436a(this.f32516b, this.f32517c, this.f32516b.getXOffset());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.a.a.b$b */
    static final class C9824b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9826b f32518a;
        /* renamed from: b */
        final /* synthetic */ float f32519b;
        /* renamed from: c */
        final /* synthetic */ float f32520c;
        /* renamed from: d */
        final /* synthetic */ float f32521d;
        /* renamed from: e */
        final /* synthetic */ float f32522e;
        /* renamed from: f */
        final /* synthetic */ float f32523f;
        /* renamed from: g */
        final /* synthetic */ float f32524g;
        /* renamed from: h */
        final /* synthetic */ View f32525h;

        C9824b(C9826b c9826b, float f, float f2, float f3, float f4, float f5, float f6, View view) {
            this.f32518a = c9826b;
            this.f32519b = f;
            this.f32520c = f2;
            this.f32521d = f3;
            this.f32522e = f4;
            this.f32523f = f5;
            this.f32524g = f6;
            this.f32525h = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedFraction();
            this.f32518a.m40435a(this.f32525h, this.f32519b + (this.f32520c * valueAnimator), this.f32521d + (this.f32522e * valueAnimator), this.f32523f + (valueAnimator * this.f32524g));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/main/view/tooltip/animations/TooltipAppearingAnimator$startAnimationInternal$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/main/view/tooltip/animations/TooltipAppearingAnimator;Landroid/view/View;FFFFFF)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.a.a.b$c */
    public static final class C9825c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9826b f32526a;
        /* renamed from: b */
        final /* synthetic */ View f32527b;
        /* renamed from: c */
        final /* synthetic */ float f32528c;
        /* renamed from: d */
        final /* synthetic */ float f32529d;
        /* renamed from: e */
        final /* synthetic */ float f32530e;
        /* renamed from: f */
        final /* synthetic */ float f32531f;
        /* renamed from: g */
        final /* synthetic */ float f32532g;
        /* renamed from: h */
        final /* synthetic */ float f32533h;

        C9825c(C9826b c9826b, View view, float f, float f2, float f3, float f4, float f5, float f6) {
            this.f32526a = c9826b;
            this.f32527b = view;
            this.f32528c = f;
            this.f32529d = f2;
            this.f32530e = f3;
            this.f32531f = f4;
            this.f32532g = f5;
            this.f32533h = f6;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f32527b.setPivotX(((float) this.f32527b.getWidth()) - this.f32528c);
            this.f32527b.setPivotY(0.0f);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32526a.f32534a.removeListener(this);
            this.f32526a.m40435a(this.f32527b, this.f32529d, this.f32530e, this.f32531f);
            this.f32527b.setPivotX(this.f32532g);
            this.f32527b.setPivotY(this.f32533h);
        }
    }

    /* renamed from: a */
    public final void m40440a(@NotNull TooltipView tooltipView, int i) {
        C2668g.b(tooltipView, "tooltipView");
        if (tooltipView.getWidth() <= 0 || tooltipView.getHeight() <= 0) {
            tooltipView.getViewTreeObserver().addOnPreDrawListener(new C9823a(this, tooltipView, i));
        } else {
            m40436a(tooltipView, i, tooltipView.getXOffset());
        }
    }

    /* renamed from: a */
    public final void m40439a() {
        if (this.f32534a.isRunning()) {
            C8299a.m35391a(this.f32534a);
        }
    }

    /* renamed from: a */
    private final void m40436a(View view, int i, float f) {
        C8299a.m35391a(this.f32534a);
        float pivotX = view.getPivotX();
        float pivotY = view.getPivotY();
        float translationY = view.getTranslationY();
        float f2 = translationY - (((float) i) / ((float) 2));
        this.f32534a.setFloatValues(new float[]{0.0f, 1.0f});
        View view2 = view;
        m40435a(view2, f2, 0.5f, 0.0f);
        this.f32534a.addUpdateListener(new C9824b(this, f2, translationY - f2, 0.5f, 0.5f, 0.0f, 1.0f, view2));
        this.f32534a.addListener(new C9825c(this, view2, f, translationY, 1.0f, 1.0f, pivotX, pivotY));
        this.f32534a.start();
    }

    /* renamed from: a */
    private final void m40435a(View view, float f, float f2, float f3) {
        view.setTranslationY(f);
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(f3);
    }
}
