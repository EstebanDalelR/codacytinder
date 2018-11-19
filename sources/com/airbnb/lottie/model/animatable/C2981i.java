package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2970l;

/* renamed from: com.airbnb.lottie.model.animatable.i */
public class C2981i implements AnimatableValue<PointF, PointF> {
    /* renamed from: a */
    private final C4068b f9228a;
    /* renamed from: b */
    private final C4068b f9229b;

    C2981i(C4068b c4068b, C4068b c4068b2) {
        this.f9228a = c4068b;
        this.f9229b = c4068b2;
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new C2970l(this.f9228a.createAnimation(), this.f9229b.createAnimation());
    }

    public boolean hasAnimation() {
        if (!this.f9228a.hasAnimation()) {
            if (!this.f9229b.hasAnimation()) {
                return false;
            }
        }
        return true;
    }
}
