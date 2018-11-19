package com.airbnb.lottie.p017b;

/* renamed from: com.airbnb.lottie.b.d */
public class C0782d {
    /* renamed from: a */
    private float f2125a;
    /* renamed from: b */
    private int f2126b;

    /* renamed from: a */
    public void m2757a(float f) {
        this.f2125a += f;
        this.f2126b++;
        if (this.f2126b == Integer.MAX_VALUE) {
            this.f2125a /= 2.0f;
            this.f2126b /= 2;
        }
    }
}
