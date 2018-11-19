package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.model.content.C0843g;
import com.airbnb.lottie.p017b.C0783e;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.k */
public class C2969k extends BaseKeyframeAnimation<C0843g, Path> {
    /* renamed from: b */
    private final C0843g f9209b = new C0843g();
    /* renamed from: c */
    private final Path f9210c = new Path();

    /* renamed from: a */
    public /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m11482b(c0768a, f);
    }

    public C2969k(List<C0768a<C0843g>> list) {
        super(list);
    }

    /* renamed from: b */
    public Path m11482b(C0768a<C0843g> c0768a, float f) {
        this.f9209b.m2914a((C0843g) c0768a.f2089a, (C0843g) c0768a.f2090b, f);
        C0783e.m2764a(this.f9209b, this.f9210c);
        return this.f9210c;
    }
}
