package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.l */
public class C2970l extends BaseKeyframeAnimation<PointF, PointF> {
    /* renamed from: b */
    private final PointF f9211b = new PointF();
    /* renamed from: c */
    private final BaseKeyframeAnimation<Float, Float> f9212c;
    /* renamed from: d */
    private final BaseKeyframeAnimation<Float, Float> f9213d;

    /* renamed from: a */
    /* synthetic */ Object mo1161a(C0768a c0768a, float f) {
        return m11485b(c0768a, f);
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1163b() {
        return mo1164d();
    }

    public C2970l(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f9212c = baseKeyframeAnimation;
        this.f9213d = baseKeyframeAnimation2;
    }

    /* renamed from: a */
    public void mo1162a(float f) {
        this.f9212c.mo1162a(f);
        this.f9213d.mo1162a(f);
        this.f9211b.set(((Float) this.f9212c.mo1163b()).floatValue(), ((Float) this.f9213d.mo1163b()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((AnimationListener) this.a.get(i)).onValueChanged();
        }
    }

    /* renamed from: d */
    public PointF mo1164d() {
        return m11485b(null, 0.0f);
    }

    /* renamed from: b */
    PointF m11485b(C0768a<PointF> c0768a, float f) {
        return this.f9211b;
    }
}
