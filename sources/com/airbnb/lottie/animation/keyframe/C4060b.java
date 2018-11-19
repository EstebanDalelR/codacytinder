package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.p017b.C0783e;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.b */
public class C4060b extends C2967e<Float> {
    /* renamed from: a */
    /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15876b(c0768a, f);
    }

    public C4060b(List<C0768a<Float>> list) {
        super(list);
    }

    /* renamed from: b */
    Float m15876b(C0768a<Float> c0768a, float f) {
        if (c0768a.f2089a != null) {
            if (c0768a.f2090b != null) {
                return Float.valueOf(C0783e.m2759a(((Float) c0768a.f2089a).floatValue(), ((Float) c0768a.f2090b).floatValue(), f));
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
