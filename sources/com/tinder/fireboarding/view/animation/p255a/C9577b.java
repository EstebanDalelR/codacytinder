package com.tinder.fireboarding.view.animation.p255a;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/view/animation/interpolator/TooltipAppearanceSpringInterpolator;", "Landroid/view/animation/Interpolator;", "interpolator", "Lkotlin/Pair;", "Lcom/tinder/fireboarding/view/animation/interpolator/SpringInterpolator;", "(Lkotlin/Pair;)V", "getInterpolation", "", "input", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.a.b */
public final class C9577b implements Interpolator {
    /* renamed from: a */
    private final Pair<C9576a, C9576a> f32015a;

    public C9577b(@NotNull Pair<C9576a, C9576a> pair) {
        C2668g.b(pair, "interpolator");
        this.f32015a = pair;
    }

    public float getInterpolation(float f) {
        return (((C9576a) this.f32015a.a()).getInterpolation(f) + ((C9576a) this.f32015a.b()).getInterpolation(f)) / ((float) 2.8E-45f);
    }
}
