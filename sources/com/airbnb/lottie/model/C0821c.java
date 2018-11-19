package com.airbnb.lottie.model;

import android.graphics.PointF;

/* renamed from: com.airbnb.lottie.model.c */
public class C0821c {
    /* renamed from: a */
    private final PointF f2192a;
    /* renamed from: b */
    private final PointF f2193b;
    /* renamed from: c */
    private final PointF f2194c;

    public C0821c() {
        this.f2192a = new PointF();
        this.f2193b = new PointF();
        this.f2194c = new PointF();
    }

    public C0821c(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2192a = pointF;
        this.f2193b = pointF2;
        this.f2194c = pointF3;
    }

    /* renamed from: a */
    public void m2890a(float f, float f2) {
        this.f2192a.set(f, f2);
    }

    /* renamed from: a */
    public PointF m2889a() {
        return this.f2192a;
    }

    /* renamed from: b */
    public void m2892b(float f, float f2) {
        this.f2193b.set(f, f2);
    }

    /* renamed from: b */
    public PointF m2891b() {
        return this.f2193b;
    }

    /* renamed from: c */
    public void m2894c(float f, float f2) {
        this.f2194c.set(f, f2);
    }

    /* renamed from: c */
    public PointF m2893c() {
        return this.f2194c;
    }
}
