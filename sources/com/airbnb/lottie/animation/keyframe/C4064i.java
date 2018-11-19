package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.C0768a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.i */
public class C4064i extends C2967e<PointF> {
    /* renamed from: b */
    private final PointF f12922b = new PointF();

    /* renamed from: a */
    public /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15884b(c0768a, f);
    }

    public C4064i(List<C0768a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF m15884b(C0768a<PointF> c0768a, float f) {
        if (c0768a.f2089a != null) {
            if (c0768a.f2090b != null) {
                PointF pointF = (PointF) c0768a.f2089a;
                PointF pointF2 = (PointF) c0768a.f2090b;
                this.f12922b.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
                return this.f12922b;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
