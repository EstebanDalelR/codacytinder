package com.mapbox.android.gestures;

/* renamed from: com.mapbox.android.gestures.b */
public final class C5768b {
    /* renamed from: a */
    private final float f21528a;
    /* renamed from: b */
    private final float f21529b;
    /* renamed from: c */
    private float f21530c;
    /* renamed from: d */
    private float f21531d;
    /* renamed from: e */
    private float f21532e;
    /* renamed from: f */
    private float f21533f;
    /* renamed from: g */
    private float f21534g;
    /* renamed from: h */
    private float f21535h;
    /* renamed from: i */
    private float f21536i;
    /* renamed from: j */
    private float f21537j;

    public C5768b(float f, float f2) {
        this.f21528a = f;
        this.f21529b = f2;
    }

    /* renamed from: a */
    public void m25371a(float f, float f2) {
        this.f21530c = this.f21532e;
        this.f21531d = this.f21533f;
        this.f21532e = f;
        this.f21533f = f2;
        this.f21534g = this.f21530c - this.f21532e;
        this.f21535h = this.f21531d - this.f21533f;
        this.f21536i = this.f21528a - this.f21532e;
        this.f21537j = this.f21529b - this.f21533f;
    }

    /* renamed from: a */
    public float m25370a() {
        return this.f21536i;
    }

    /* renamed from: b */
    public float m25372b() {
        return this.f21537j;
    }
}
