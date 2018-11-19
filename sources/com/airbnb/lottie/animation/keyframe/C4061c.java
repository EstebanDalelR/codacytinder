package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.model.content.C0834b;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.c */
public class C4061c extends C2967e<C0834b> {
    /* renamed from: b */
    private final C0834b f12917b;

    /* renamed from: a */
    /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15878b(c0768a, f);
    }

    public C4061c(List<? extends C0768a<C0834b>> list) {
        super(list);
        int i = 0;
        C0834b c0834b = (C0834b) ((C0768a) list.get(0)).f2089a;
        if (c0834b != null) {
            i = c0834b.m2907c();
        }
        this.f12917b = new C0834b(new float[i], new int[i]);
    }

    /* renamed from: b */
    C0834b m15878b(C0768a<C0834b> c0768a, float f) {
        this.f12917b.m2904a((C0834b) c0768a.f2089a, (C0834b) c0768a.f2090b, f);
        return this.f12917b;
    }
}
