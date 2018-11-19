package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0784f;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.i */
public class C4055i implements C2965h, AnimationListener {
    /* renamed from: a */
    private final Path f12880a = new Path();
    /* renamed from: b */
    private final String f12881b;
    /* renamed from: c */
    private final C0792d f12882c;
    /* renamed from: d */
    private final Type f12883d;
    /* renamed from: e */
    private final BaseKeyframeAnimation<?, Float> f12884e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<?, PointF> f12885f;
    /* renamed from: g */
    private final BaseKeyframeAnimation<?, Float> f12886g;
    @Nullable
    /* renamed from: h */
    private final BaseKeyframeAnimation<?, Float> f12887h;
    /* renamed from: i */
    private final BaseKeyframeAnimation<?, Float> f12888i;
    @Nullable
    /* renamed from: j */
    private final BaseKeyframeAnimation<?, Float> f12889j;
    /* renamed from: k */
    private final BaseKeyframeAnimation<?, Float> f12890k;
    @Nullable
    /* renamed from: l */
    private C2966n f12891l;
    /* renamed from: m */
    private boolean f12892m;

    public C4055i(C0792d c0792d, C4077a c4077a, PolystarShape polystarShape) {
        this.f12882c = c0792d;
        this.f12881b = polystarShape.m11520a();
        this.f12883d = polystarShape.m11521b();
        this.f12884e = polystarShape.m11522c().createAnimation();
        this.f12885f = polystarShape.m11523d().createAnimation();
        this.f12886g = polystarShape.m11524e().createAnimation();
        this.f12888i = polystarShape.m11526g().createAnimation();
        this.f12890k = polystarShape.m11528i().createAnimation();
        if (this.f12883d == Type.Star) {
            this.f12887h = polystarShape.m11525f().createAnimation();
            this.f12889j = polystarShape.m11527h().createAnimation();
        } else {
            this.f12887h = null;
            this.f12889j = null;
        }
        c4077a.m15914a(this.f12884e);
        c4077a.m15914a(this.f12885f);
        c4077a.m15914a(this.f12886g);
        c4077a.m15914a(this.f12888i);
        c4077a.m15914a(this.f12890k);
        if (this.f12883d == Type.Star) {
            c4077a.m15914a(this.f12887h);
            c4077a.m15914a(this.f12889j);
        }
        this.f12884e.mo1165a((AnimationListener) this);
        this.f12885f.mo1165a((AnimationListener) this);
        this.f12886g.mo1165a((AnimationListener) this);
        this.f12888i.mo1165a((AnimationListener) this);
        this.f12890k.mo1165a((AnimationListener) this);
        if (this.f12883d == Type.Star) {
            this.f12888i.mo1165a((AnimationListener) this);
            this.f12890k.mo1165a((AnimationListener) this);
        }
    }

    public void onValueChanged() {
        m15864a();
    }

    /* renamed from: a */
    private void m15864a() {
        this.f12892m = false;
        this.f12882c.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            Content content = (Content) list.get(list2);
            if (content instanceof C2966n) {
                C2966n c2966n = (C2966n) content;
                if (c2966n.m11474a() == ShapeTrimPath.Type.Simultaneously) {
                    this.f12891l = c2966n;
                    this.f12891l.m11475a(this);
                }
            }
        }
    }

    /* renamed from: c */
    public Path mo3174c() {
        if (this.f12892m) {
            return this.f12880a;
        }
        this.f12880a.reset();
        switch (this.f12883d) {
            case Star:
                m15865b();
                break;
            case Polygon:
                m15866d();
                break;
            default:
                break;
        }
        this.f12880a.close();
        C0784f.m2772a(this.f12880a, this.f12891l);
        this.f12892m = true;
        return this.f12880a;
    }

    public String getName() {
        return this.f12881b;
    }

    /* renamed from: b */
    private void m15865b() {
        float f;
        double d;
        float sin;
        float f2;
        float f3;
        float f4;
        double d2;
        float floatValue = ((Float) this.f12884e.mo1163b()).floatValue();
        double toRadians = Math.toRadians((this.f12886g == null ? 0.0d : (double) ((Float) r0.f12886g.mo1163b()).floatValue()) - 90.0d);
        double d3 = (double) floatValue;
        float f5 = (float) (6.283185307179586d / d3);
        float f6 = f5 / 2.0f;
        floatValue -= (float) ((int) floatValue);
        if (floatValue != 0.0f) {
            toRadians += (double) ((1.0f - floatValue) * f6);
        }
        float floatValue2 = ((Float) r0.f12888i.mo1163b()).floatValue();
        float floatValue3 = ((Float) r0.f12887h.mo1163b()).floatValue();
        float floatValue4 = r0.f12889j != null ? ((Float) r0.f12889j.mo1163b()).floatValue() / 100.0f : 0.0f;
        float floatValue5 = r0.f12890k != null ? ((Float) r0.f12890k.mo1163b()).floatValue() / 100.0f : 0.0f;
        double d4;
        float cos;
        if (floatValue != 0.0f) {
            f = ((floatValue2 - floatValue3) * floatValue) + floatValue3;
            float f7 = floatValue2;
            d = (double) f;
            d4 = d3;
            cos = (float) (d * Math.cos(toRadians));
            sin = (float) (d * Math.sin(toRadians));
            r0.f12880a.moveTo(cos, sin);
            f2 = cos;
            f3 = sin;
            f4 = f7;
            d2 = toRadians + ((double) ((f5 * floatValue) / 2.0f));
            toRadians = d4;
        } else {
            d4 = d3;
            cos = floatValue2;
            d3 = (double) cos;
            f2 = (float) (Math.cos(toRadians) * d3);
            sin = (float) (d3 * Math.sin(toRadians));
            r0.f12880a.moveTo(f2, sin);
            f4 = cos;
            f3 = sin;
            d2 = toRadians + ((double) f6);
            toRadians = d4;
            f = 0.0f;
        }
        toRadians = Math.ceil(toRadians) * 2.0d;
        int i = 0;
        float f8 = f2;
        float f9 = floatValue3;
        float f10 = floatValue4;
        d = d2;
        sin = f3;
        int i2 = 0;
        while (true) {
            double d5 = (double) i;
            if (d5 < toRadians) {
                float f11;
                float f12;
                double d6;
                double d7;
                float f13;
                float f14;
                float f15 = i2 != 0 ? f4 : f9;
                if (f == 0.0f || d5 != toRadians - 2.0d) {
                    f11 = f5;
                    f5 = f6;
                } else {
                    f11 = f5;
                    f5 = (f5 * floatValue) / 2.0f;
                }
                if (f == 0.0f || d5 != toRadians - 1.0d) {
                    f12 = f6;
                    d6 = d5;
                    f6 = f15;
                } else {
                    f12 = f6;
                    d6 = d5;
                    f6 = f;
                }
                d5 = (double) f6;
                double d8 = toRadians;
                float cos2 = (float) (d5 * Math.cos(d));
                float sin2 = (float) (d5 * Math.sin(d));
                if (f10 == 0.0f && floatValue5 == 0.0f) {
                    r0.f12880a.lineTo(cos2, sin2);
                    d7 = d;
                    f13 = floatValue5;
                    f14 = f;
                } else {
                    d7 = d;
                    double atan2 = (double) ((float) (Math.atan2((double) sin, (double) f8) - 1.5707963267948966d));
                    floatValue2 = (float) Math.cos(atan2);
                    f6 = (float) Math.sin(atan2);
                    f13 = floatValue5;
                    f14 = f;
                    d5 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    f2 = (float) Math.cos(d5);
                    floatValue3 = (float) Math.sin(d5);
                    floatValue4 = i2 != 0 ? f10 : f13;
                    f = ((i2 != 0 ? f9 : f4) * floatValue4) * 0.47829f;
                    floatValue2 *= f;
                    f *= f6;
                    f15 = ((i2 != 0 ? f4 : f9) * (i2 != 0 ? f13 : f10)) * 0.47829f;
                    f2 *= f15;
                    f15 *= floatValue3;
                    if (floatValue != 0.0f) {
                        if (i == 0) {
                            floatValue2 *= floatValue;
                            f *= floatValue;
                        } else if (d6 == d8 - 1.0d) {
                            f2 *= floatValue;
                            f15 *= floatValue;
                        }
                    }
                    r0.f12880a.cubicTo(f8 - floatValue2, sin - f, cos2 + f2, sin2 + f15, cos2, sin2);
                }
                d = d7 + ((double) f5);
                i2 ^= 1;
                i++;
                f8 = cos2;
                sin = sin2;
                f5 = f11;
                f6 = f12;
                toRadians = d8;
                floatValue5 = f13;
                f = f14;
            } else {
                PointF pointF = (PointF) r0.f12885f.mo1163b();
                r0.f12880a.offset(pointF.x, pointF.y);
                r0.f12880a.close();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m15866d() {
        int floor = (int) Math.floor((double) ((Float) this.f12884e.mo1163b()).floatValue());
        double toRadians = Math.toRadians((this.f12886g == null ? 0.0d : (double) ((Float) r0.f12886g.mo1163b()).floatValue()) - 90.0d);
        double d = (double) floor;
        float f = (float) (6.283185307179586d / d);
        float floatValue = ((Float) r0.f12890k.mo1163b()).floatValue() / 100.0f;
        float floatValue2 = ((Float) r0.f12888i.mo1163b()).floatValue();
        double d2 = (double) floatValue2;
        float cos = (float) (Math.cos(toRadians) * d2);
        float sin = (float) (Math.sin(toRadians) * d2);
        r0.f12880a.moveTo(cos, sin);
        double d3 = (double) f;
        toRadians += d3;
        d = Math.ceil(d);
        floor = 0;
        while (((double) floor) < d) {
            double d4;
            int i;
            double d5;
            double d6;
            float cos2 = (float) (Math.cos(toRadians) * d2);
            double d7 = d;
            float sin2 = (float) (d2 * Math.sin(toRadians));
            if (floatValue != 0.0f) {
                d4 = d2;
                i = floor;
                d5 = toRadians;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                d6 = d3;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f2 = (floatValue2 * floatValue) * 0.25f;
                r0.f12880a.cubicTo(cos - (((float) Math.cos(atan2)) * f2), sin - (((float) Math.sin(atan2)) * f2), cos2 + (((float) Math.cos(atan22)) * f2), sin2 + (f2 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = floor;
                d5 = toRadians;
                d4 = d2;
                d6 = d3;
                r0.f12880a.lineTo(cos2, sin2);
            }
            toRadians = d5 + d6;
            floor = i + 1;
            sin = sin2;
            cos = cos2;
            d = d7;
            d2 = d4;
            d3 = d6;
        }
        PointF pointF = (PointF) r0.f12885f.mo1163b();
        r0.f12880a.offset(pointF.x, pointF.y);
        r0.f12880a.close();
    }
}
