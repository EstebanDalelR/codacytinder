package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.animation.C0768a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.h */
public class C4063h extends C2967e<PointF> {
    /* renamed from: b */
    private final PointF f12918b = new PointF();
    /* renamed from: c */
    private final float[] f12919c = new float[2];
    /* renamed from: d */
    private C2968g f12920d;
    /* renamed from: e */
    private PathMeasure f12921e;

    /* renamed from: a */
    public /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m15882b(c0768a, f);
    }

    public C4063h(List<? extends C0768a<PointF>> list) {
        super(list);
    }

    /* renamed from: b */
    public PointF m15882b(C0768a<PointF> c0768a, float f) {
        C0768a c0768a2 = (C2968g) c0768a;
        Path e = c0768a2.m11480e();
        if (e == null) {
            return (PointF) c0768a.f2089a;
        }
        if (this.f12920d != c0768a2) {
            this.f12921e = new PathMeasure(e, false);
            this.f12920d = c0768a2;
        }
        this.f12921e.getPosTan(f * this.f12921e.getLength(), this.f12919c, null);
        this.f12918b.set(this.f12919c[0], this.f12919c[1]);
        return this.f12918b;
    }
}
