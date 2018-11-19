package com.airbnb.lottie.model.content;

import com.airbnb.lottie.p017b.C0777a;
import com.airbnb.lottie.p017b.C0783e;

/* renamed from: com.airbnb.lottie.model.content.b */
public class C0834b {
    /* renamed from: a */
    private final float[] f2200a;
    /* renamed from: b */
    private final int[] f2201b;

    public C0834b(float[] fArr, int[] iArr) {
        this.f2200a = fArr;
        this.f2201b = iArr;
    }

    /* renamed from: a */
    public float[] m2905a() {
        return this.f2200a;
    }

    /* renamed from: b */
    public int[] m2906b() {
        return this.f2201b;
    }

    /* renamed from: c */
    public int m2907c() {
        return this.f2201b.length;
    }

    /* renamed from: a */
    public void m2904a(C0834b c0834b, C0834b c0834b2, float f) {
        if (c0834b.f2201b.length != c0834b2.f2201b.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot interpolate between gradients. Lengths vary (");
            stringBuilder.append(c0834b.f2201b.length);
            stringBuilder.append(" vs ");
            stringBuilder.append(c0834b2.f2201b.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        for (int i = 0; i < c0834b.f2201b.length; i++) {
            this.f2200a[i] = C0783e.m2759a(c0834b.f2200a[i], c0834b2.f2200a[i], f);
            this.f2201b[i] = C0777a.m2737a(f, c0834b.f2201b[i], c0834b2.f2201b[i]);
        }
    }
}
