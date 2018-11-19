package com.google.android.m4b.maps.bl;

/* renamed from: com.google.android.m4b.maps.bl.n */
public final class C7455n extends C6470b {
    /* renamed from: b */
    private float f27353b;
    /* renamed from: c */
    private float f27354c;

    public C7455n(int i, C4816i c4816i) {
        super(i, c4816i);
    }

    /* renamed from: a */
    public final void mo5052a(float f, float f2) {
        this.f27353b = f / 2.0f;
        this.f27354c = f2 / 2.0f;
    }

    /* renamed from: a */
    public final float mo5051a() {
        return this.f27353b;
    }

    /* renamed from: b */
    public final float mo5053b() {
        return this.f27354c;
    }

    /* renamed from: c */
    public final float mo5054c() {
        float c = this.a.m21370c();
        return (float) ((((double) ((this.a.m21367a() - c) * Math.signum(this.a.m21369b() - this.f27354c))) * 3.141592653589793d) / 256.0d);
    }
}
