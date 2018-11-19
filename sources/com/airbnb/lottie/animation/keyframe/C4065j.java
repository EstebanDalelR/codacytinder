package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.model.C0856k;
import com.airbnb.lottie.p017b.C0783e;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.j */
public class C4065j extends C2967e<C0856k> {
    /* renamed from: a */
    public /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15886b(c0768a, f);
    }

    public C4065j(List<C0768a<C0856k>> list) {
        super(list);
    }

    /* renamed from: b */
    public C0856k m15886b(C0768a<C0856k> c0768a, float f) {
        if (c0768a.f2089a != null) {
            if (c0768a.f2090b != null) {
                C0856k c0856k = (C0856k) c0768a.f2089a;
                C0856k c0856k2 = (C0856k) c0768a.f2090b;
                return new C0856k(C0783e.m2759a(c0856k.m2932a(), c0856k2.m2932a(), f), C0783e.m2759a(c0856k.m2933b(), c0856k2.m2933b(), f));
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
