package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.C0856k;
import com.airbnb.lottie.model.animatable.C2983l;
import com.airbnb.lottie.model.layer.C4077a;

/* renamed from: com.airbnb.lottie.animation.keyframe.o */
public class C0776o {
    /* renamed from: a */
    private final Matrix f2109a = new Matrix();
    /* renamed from: b */
    private final BaseKeyframeAnimation<PointF, PointF> f2110b;
    /* renamed from: c */
    private final BaseKeyframeAnimation<?, PointF> f2111c;
    /* renamed from: d */
    private final BaseKeyframeAnimation<C0856k, C0856k> f2112d;
    /* renamed from: e */
    private final BaseKeyframeAnimation<Float, Float> f2113e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<Integer, Integer> f2114f;
    @Nullable
    /* renamed from: g */
    private final BaseKeyframeAnimation<?, Float> f2115g;
    @Nullable
    /* renamed from: h */
    private final BaseKeyframeAnimation<?, Float> f2116h;

    public C0776o(C2983l c2983l) {
        this.f2110b = c2983l.m11508a().createAnimation();
        this.f2111c = c2983l.m11509b().createAnimation();
        this.f2112d = c2983l.m11510c().createAnimation();
        this.f2113e = c2983l.m11511d().createAnimation();
        this.f2114f = c2983l.m11512e().createAnimation();
        if (c2983l.m11513f() != null) {
            this.f2115g = c2983l.m11513f().createAnimation();
        } else {
            this.f2115g = null;
        }
        if (c2983l.m11514g() != null) {
            this.f2116h = c2983l.m11514g().createAnimation();
        } else {
            this.f2116h = null;
        }
    }

    /* renamed from: a */
    public void m2732a(C4077a c4077a) {
        c4077a.m15914a(this.f2110b);
        c4077a.m15914a(this.f2111c);
        c4077a.m15914a(this.f2112d);
        c4077a.m15914a(this.f2113e);
        c4077a.m15914a(this.f2114f);
        if (this.f2115g != null) {
            c4077a.m15914a(this.f2115g);
        }
        if (this.f2116h != null) {
            c4077a.m15914a(this.f2116h);
        }
    }

    /* renamed from: a */
    public void m2731a(AnimationListener animationListener) {
        this.f2110b.mo1165a(animationListener);
        this.f2111c.mo1165a(animationListener);
        this.f2112d.mo1165a(animationListener);
        this.f2113e.mo1165a(animationListener);
        this.f2114f.mo1165a(animationListener);
        if (this.f2115g != null) {
            this.f2115g.mo1165a(animationListener);
        }
        if (this.f2116h != null) {
            this.f2116h.mo1165a(animationListener);
        }
    }

    /* renamed from: a */
    public BaseKeyframeAnimation<?, Integer> m2730a() {
        return this.f2114f;
    }

    @Nullable
    /* renamed from: b */
    public BaseKeyframeAnimation<?, Float> m2733b() {
        return this.f2115g;
    }

    @Nullable
    /* renamed from: c */
    public BaseKeyframeAnimation<?, Float> m2734c() {
        return this.f2116h;
    }

    /* renamed from: d */
    public Matrix m2735d() {
        this.f2109a.reset();
        PointF pointF = (PointF) this.f2111c.mo1163b();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f2109a.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.f2113e.mo1163b()).floatValue();
        if (floatValue != 0.0f) {
            this.f2109a.preRotate(floatValue);
        }
        C0856k c0856k = (C0856k) this.f2112d.mo1163b();
        if (!(c0856k.m2932a() == 1.0f && c0856k.m2933b() == 1.0f)) {
            this.f2109a.preScale(c0856k.m2932a(), c0856k.m2933b());
        }
        pointF = (PointF) this.f2110b.mo1163b();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f2109a.preTranslate(-pointF.x, -pointF.y);
        }
        return this.f2109a;
    }

    /* renamed from: a */
    public Matrix m2729a(float f) {
        PointF pointF = (PointF) this.f2111c.mo1163b();
        PointF pointF2 = (PointF) this.f2110b.mo1163b();
        C0856k c0856k = (C0856k) this.f2112d.mo1163b();
        float floatValue = ((Float) this.f2113e.mo1163b()).floatValue();
        this.f2109a.reset();
        this.f2109a.preTranslate(pointF.x * f, pointF.y * f);
        double d = (double) f;
        this.f2109a.preScale((float) Math.pow((double) c0856k.m2932a(), d), (float) Math.pow((double) c0856k.m2933b(), d));
        this.f2109a.preRotate(floatValue * f, pointF2.x, pointF2.y);
        return this.f2109a;
    }
}
