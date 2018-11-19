package com.tinder.places.carousel.p309a;

import android.support.v4.view.p011a.C0581f;
import android.view.animation.Interpolator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/carousel/util/CubicBezierInterpolator;", "Landroid/view/animation/Interpolator;", "x1", "", "y1", "x2", "y2", "(FFFF)V", "backingInterpolator", "kotlin.jvm.PlatformType", "getInterpolation", "input", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.a.a */
public final class C10189a implements Interpolator {
    /* renamed from: a */
    private final Interpolator f33236a;

    public C10189a(float f, float f2, float f3, float f4) {
        this.f33236a = C0581f.a(f, f2, f3, f4);
    }

    public float getInterpolation(float f) {
        return this.f33236a.getInterpolation(f);
    }
}
