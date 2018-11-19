package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.p017b.C0777a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.a */
public class C4059a extends C2967e<Integer> {
    /* renamed from: a */
    public /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15874b(c0768a, f);
    }

    public C4059a(List<C0768a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    public Integer m15874b(C0768a<Integer> c0768a, float f) {
        if (c0768a.f2089a != null) {
            if (c0768a.f2090b != null) {
                return Integer.valueOf(C0777a.m2737a(f, ((Integer) c0768a.f2089a).intValue(), ((Integer) c0768a.f2090b).intValue()));
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
