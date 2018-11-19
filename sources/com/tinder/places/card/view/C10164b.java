package com.tinder.places.card.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/card/view/LayoutSizeAnimationListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Landroid/view/View;", "newWidth", "", "isWidth", "", "(Landroid/view/View;IZ)V", "oldWidth", "(Landroid/view/View;IIZ)V", "getView", "()Landroid/view/View;", "onAnimationUpdate", "", "updatedAnimation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.b */
public final class C10164b implements AnimatorUpdateListener {
    @NotNull
    /* renamed from: a */
    private final View f33174a;
    /* renamed from: b */
    private final int f33175b;
    /* renamed from: c */
    private final int f33176c;
    /* renamed from: d */
    private final boolean f33177d;

    public C10164b(@NotNull View view, int i, int i2, boolean z) {
        C2668g.b(view, "view");
        this.f33174a = view;
        this.f33175b = i;
        this.f33176c = i2;
        this.f33177d = z;
    }

    public C10164b(@NotNull View view, int i, boolean z) {
        C2668g.b(view, "view");
        this(view, i, z ? view.getLayoutParams().width : view.getLayoutParams().height, z);
    }

    public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "updatedAnimation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        valueAnimator = C10184f.m41465a(this.f33176c, this.f33175b, ((Float) valueAnimator).floatValue());
        LayoutParams layoutParams = this.f33174a.getLayoutParams();
        if (this.f33177d) {
            layoutParams.width = valueAnimator;
        } else {
            layoutParams.height = valueAnimator;
        }
        this.f33174a.setLayoutParams(layoutParams);
    }
}
