package com.tinder.places.card.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/card/view/MarginAnimationListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Landroid/view/View;", "newX", "", "newY", "(Landroid/view/View;II)V", "oldX", "oldY", "getView", "()Landroid/view/View;", "onAnimationUpdate", "", "updatedAnimation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.c */
public final class C10165c implements AnimatorUpdateListener {
    /* renamed from: a */
    private final int f33178a;
    /* renamed from: b */
    private final int f33179b;
    @NotNull
    /* renamed from: c */
    private final View f33180c;
    /* renamed from: d */
    private final int f33181d;
    /* renamed from: e */
    private final int f33182e;

    public C10165c(@NotNull View view, int i, int i2) {
        C2668g.b(view, "view");
        this.f33180c = view;
        this.f33181d = i;
        this.f33182e = i2;
        view = this.f33180c.getLayoutParams();
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams = (LayoutParams) view;
        this.f33178a = layoutParams.leftMargin;
        this.f33179b = layoutParams.topMargin;
    }

    public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "updatedAnimation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        float floatValue = ((Float) valueAnimator).floatValue();
        ViewGroup.LayoutParams layoutParams = this.f33180c.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.leftMargin = C10184f.m41465a(this.f33178a, this.f33181d, floatValue);
        layoutParams2.topMargin = C10184f.m41465a(this.f33179b, this.f33182e, floatValue);
        this.f33180c.setLayoutParams(layoutParams2);
    }
}
