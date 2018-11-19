package com.google.android.m4b.maps.cf;

/* renamed from: com.google.android.m4b.maps.cf.m */
public final class C5116m {
    /* renamed from: a */
    private float[] f19009a = new float[9];

    public C5116m() {
        m22805a();
    }

    /* renamed from: a */
    private C5116m m22805a() {
        for (int i = 1; i < this.f19009a.length - 1; i++) {
            this.f19009a[i] = 0.0f;
        }
        this.f19009a[0] = 1.0f;
        this.f19009a[4] = 1.0f;
        this.f19009a[8] = 1.0f;
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            float f = this.f19009a[i];
            float f2 = this.f19009a[i + 1];
            float f3 = this.f19009a[i + 2];
            StringBuilder stringBuilder2 = new StringBuilder(50);
            stringBuilder2.append(f);
            stringBuilder2.append(", ");
            stringBuilder2.append(f2);
            stringBuilder2.append(", ");
            stringBuilder2.append(f3);
            stringBuilder2.append("\n");
            stringBuilder.append(stringBuilder2.toString());
        }
        return stringBuilder.toString();
    }
}
