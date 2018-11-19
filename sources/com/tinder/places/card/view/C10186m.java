package com.tinder.places.card.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/card/view/PositionAnimationListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Landroid/view/View;", "newX", "", "isX", "", "(Landroid/view/View;FZ)V", "oldX", "(Landroid/view/View;FFZ)V", "getView", "()Landroid/view/View;", "onAnimationUpdate", "", "updatedAnimation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.m */
public final class C10186m implements AnimatorUpdateListener {
    @NotNull
    /* renamed from: a */
    private final View f33222a;
    /* renamed from: b */
    private final float f33223b;
    /* renamed from: c */
    private final float f33224c;
    /* renamed from: d */
    private final boolean f33225d;

    public C10186m(@NotNull View view, float f, float f2, boolean z) {
        C2668g.b(view, "view");
        this.f33222a = view;
        this.f33223b = f;
        this.f33224c = f2;
        this.f33225d = z;
    }

    public C10186m(@NotNull View view, float f, boolean z) {
        C2668g.b(view, "view");
        this(view, f, z ? view.getX() : view.getY(), z);
    }

    public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "updatedAnimation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        valueAnimator = C10184f.m41464a(this.f33224c, this.f33223b, ((Float) valueAnimator).floatValue());
        if (this.f33225d) {
            this.f33222a.setX(valueAnimator);
        } else {
            this.f33222a.setY(valueAnimator);
        }
    }
}
