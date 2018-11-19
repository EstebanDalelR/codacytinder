package com.tinder.fireboarding.view.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FractionUpdateCalculator;", "", "startValue", "", "endValue", "diff", "(FFF)V", "calculateNewValue", "fraction", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.g */
public final class C9604g {
    /* renamed from: a */
    private final float f32095a;
    /* renamed from: b */
    private final float f32096b;

    public C9604g(float f, float f2, float f3) {
        this.f32095a = f;
        this.f32096b = f3;
    }

    public /* synthetic */ C9604g(float f, float f2, float f3, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            f3 = f2 - f;
        }
        this(f, f2, f3);
    }

    /* renamed from: a */
    public final float m39970a(float f) {
        return this.f32095a + (this.f32096b * f);
    }
}
