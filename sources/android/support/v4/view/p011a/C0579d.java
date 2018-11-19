package android.support.v4.view.p011a;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.a.d */
abstract class C0579d implements Interpolator {
    /* renamed from: a */
    private final float[] f1780a;
    /* renamed from: b */
    private final float f1781b = (1.0f / ((float) (this.f1780a.length - 1)));

    protected C0579d(float[] fArr) {
        this.f1780a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1780a.length - 1)) * f), this.f1780a.length - 2);
        return this.f1780a[min] + (((f - (((float) min) * this.f1781b)) / this.f1781b) * (this.f1780a[min + 1] - this.f1780a[min]));
    }
}
