package com.tinder.fireboarding.view.animation.p255a;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/view/animation/interpolator/TooltipDisappearanceSpringInterpolator;", "Landroid/view/animation/Interpolator;", "interpolator", "Lcom/tinder/fireboarding/view/animation/interpolator/TooltipAppearanceSpringInterpolator;", "(Lcom/tinder/fireboarding/view/animation/interpolator/TooltipAppearanceSpringInterpolator;)V", "getInterpolation", "", "input", "reverseInterpolation", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.a.c */
public final class C9578c implements Interpolator {
    /* renamed from: a */
    private final C9577b f32016a;

    public C9578c(@NotNull C9577b c9577b) {
        C2668g.b(c9577b, "interpolator");
        this.f32016a = c9577b;
    }

    public float getInterpolation(float f) {
        return m39910a(f);
    }

    /* renamed from: a */
    private final float m39910a(float f) {
        float f2 = (float) 1;
        return f2 - this.f32016a.getInterpolation(f2 - f);
    }
}
