package com.tinder.places.p312g.p313a;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/tinder/places/view/util/PlacesGradientDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "startColor", "", "endColor", "(II)V", "getEndColor", "()I", "getStartColor", "getColors", "", "getInterpolatedColor", "Companion", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.g.a.a */
public final class C10211a extends GradientDrawable {
    /* renamed from: a */
    public static final C10210a f33278a = new C10210a();
    @NotNull
    /* renamed from: d */
    private static final ArgbEvaluator f33279d = new ArgbEvaluator();
    /* renamed from: b */
    private final int f33280b;
    /* renamed from: c */
    private final int f33281c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/view/util/PlacesGradientDrawable$Companion;", "", "()V", "evaluator", "Landroid/animation/ArgbEvaluator;", "getEvaluator", "()Landroid/animation/ArgbEvaluator;", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.g.a.a$a */
    public static final class C10210a {
        private C10210a() {
        }
    }

    public C10211a(@ColorInt int i, @ColorInt int i2) {
        this.f33280b = i;
        this.f33281c = i2;
        setOrientation(Orientation.TOP_BOTTOM);
        setColors(new int[]{this.f33280b, this.f33281c});
    }

    @NotNull
    public int[] getColors() {
        return new int[]{this.f33280b, this.f33281c};
    }

    /* renamed from: a */
    public final int m41531a() {
        Object evaluate = f33279d.evaluate(0.25f, Integer.valueOf(this.f33280b), Integer.valueOf(this.f33281c));
        if (evaluate != null) {
            return ((Integer) evaluate).intValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }
}
