package com.tinder.places.card.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/card/view/ResizeAnimationListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "view", "Landroid/view/View;", "newWidth", "", "newHeight", "newX", "", "newY", "(Landroid/view/View;IIFF)V", "oldWidth", "oldHeight", "oldX", "oldY", "(Landroid/view/View;IIFFIIFF)V", "getView", "()Landroid/view/View;", "onAnimationUpdate", "", "updatedAnimation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.view.n */
public final class C10187n implements AnimatorUpdateListener {
    @NotNull
    /* renamed from: a */
    private final View f33226a;
    /* renamed from: b */
    private final int f33227b;
    /* renamed from: c */
    private final int f33228c;
    /* renamed from: d */
    private final float f33229d;
    /* renamed from: e */
    private final float f33230e;
    /* renamed from: f */
    private final int f33231f;
    /* renamed from: g */
    private final int f33232g;
    /* renamed from: h */
    private final float f33233h;
    /* renamed from: i */
    private final float f33234i;

    public C10187n(@NotNull View view, int i, int i2, float f, float f2, int i3, int i4, float f3, float f4) {
        C2668g.b(view, "view");
        this.f33226a = view;
        this.f33227b = i;
        this.f33228c = i2;
        this.f33229d = f;
        this.f33230e = f2;
        this.f33231f = i3;
        this.f33232g = i4;
        this.f33233h = f3;
        this.f33234i = f4;
    }

    public C10187n(@NotNull View view, int i, int i2, float f, float f2) {
        View view2 = view;
        C2668g.b(view2, "view");
        this(view2, i, i2, f, f2, view2.getLayoutParams().width, view2.getLayoutParams().height, view2.getX(), view2.getY());
    }

    public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "updatedAnimation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
        float floatValue = ((Float) valueAnimator).floatValue();
        LayoutParams layoutParams = this.f33226a.getLayoutParams();
        layoutParams.height = C10184f.m41465a(this.f33232g, this.f33228c, floatValue);
        layoutParams.width = C10184f.m41465a(this.f33231f, this.f33227b, floatValue);
        this.f33226a.setLayoutParams(layoutParams);
        this.f33226a.setX(C10184f.m41464a(this.f33233h, this.f33229d, floatValue));
        this.f33226a.setY(C10184f.m41464a(this.f33234i, this.f33230e, floatValue));
    }
}
