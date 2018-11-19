package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.p017b.C0783e;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.d */
public class C4062d extends C2967e<Integer> {
    /* renamed from: a */
    /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15880b(c0768a, f);
    }

    public C4062d(List<C0768a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    Integer m15880b(C0768a<Integer> c0768a, float f) {
        if (c0768a.f2089a != null) {
            if (c0768a.f2090b != null) {
                return Integer.valueOf(C0783e.m2762a(((Integer) c0768a.f2089a).intValue(), ((Integer) c0768a.f2090b).intValue(), f));
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
