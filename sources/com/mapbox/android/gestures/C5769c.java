package com.mapbox.android.gestures;

/* renamed from: com.mapbox.android.gestures.c */
public class C5769c {
    /* renamed from: a */
    private final float f21538a;
    /* renamed from: b */
    private final float f21539b;
    /* renamed from: c */
    private final float f21540c;
    /* renamed from: d */
    private final float f21541d;
    /* renamed from: e */
    private final float f21542e;
    /* renamed from: f */
    private final float f21543f;

    public C5769c(float f, float f2, float f3, float f4) {
        this.f21538a = f;
        this.f21539b = f2;
        this.f21540c = f3;
        this.f21541d = f4;
        this.f21542e = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        this.f21543f = (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    /* renamed from: a */
    public float m25373a() {
        return this.f21538a;
    }

    /* renamed from: b */
    public float m25374b() {
        return this.f21539b;
    }

    /* renamed from: c */
    public float m25375c() {
        return this.f21540c;
    }

    /* renamed from: d */
    public float m25376d() {
        return this.f21541d;
    }

    /* renamed from: e */
    public float m25377e() {
        return this.f21543f;
    }
}
