package com.google.android.m4b.maps.bl;

/* renamed from: com.google.android.m4b.maps.bl.h */
public abstract class C4812h {
    /* renamed from: a */
    private Float f17565a;
    /* renamed from: b */
    private Float f17566b;

    /* renamed from: a */
    public abstract float mo5044a(int i);

    /* renamed from: a */
    public abstract long mo5045a();

    /* renamed from: b */
    public abstract float mo5046b(int i);

    /* renamed from: b */
    public abstract int mo5047b();

    /* renamed from: c */
    public abstract float mo5048c();

    /* renamed from: d */
    public abstract float mo5049d();

    /* renamed from: e */
    public abstract void mo5050e();

    /* renamed from: f */
    public final float m21343f() {
        if (this.f17565a == null) {
            this.f17565a = Float.valueOf(C4812h.m21335a(mo5044a(0), mo5046b(0), mo5044a(mo5047b() - 1), mo5046b(mo5047b() - 1)));
        }
        return this.f17565a.floatValue();
    }

    /* renamed from: a */
    public static float m21335a(float f, float f2, float f3, float f4) {
        return (float) Math.atan2((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: g */
    public final float m21344g() {
        if (this.f17566b == null) {
            float a = mo5044a(0) - mo5044a(mo5047b() - 1);
            float b = mo5046b(0) - mo5046b(mo5047b() - 1);
            this.f17566b = Float.valueOf((float) Math.sqrt((double) ((a * a) + (b * b))));
        }
        return this.f17566b.floatValue();
    }
}
