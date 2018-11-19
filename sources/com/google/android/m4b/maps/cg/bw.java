package com.google.android.m4b.maps.cg;

import android.opengl.Matrix;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.p110j.C5461u;
import java.util.Arrays;

public final class bw {
    /* renamed from: a */
    private float f19138a;
    /* renamed from: b */
    private float f19139b;
    /* renamed from: c */
    private float f19140c;
    /* renamed from: d */
    private final float[] f19141d;
    /* renamed from: e */
    private final float[] f19142e;
    /* renamed from: f */
    private boolean f19143f;
    /* renamed from: g */
    private final float[] f19144g;

    public bw() {
        this.f19139b = 0.5f;
        this.f19141d = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.f19142e = new float[16];
        this.f19144g = new float[3];
    }

    public bw(float f, float f2, float f3) {
        this.f19139b = 0.5f;
        this.f19141d = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.f19142e = new float[16];
        this.f19144g = new float[3];
        this.f19138a = f;
        this.f19139b = f2;
        this.f19140c = f3;
        this.f19143f = false;
    }

    public bw(bw bwVar) {
        this.f19139b = 0.5f;
        this.f19141d = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.f19142e = new float[16];
        this.f19144g = new float[3];
        this.f19138a = bwVar.f19138a;
        this.f19139b = bwVar.f19139b;
        this.f19140c = bwVar.f19140c;
        System.arraycopy(bwVar.f19141d, 0, this.f19141d, 0, 16);
        this.f19143f = bwVar.f19143f;
    }

    /* renamed from: a */
    public static bw m23045a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new bw(streetViewPanoramaCamera.bearing, (streetViewPanoramaCamera.tilt / 180.0f) + 0.5f, streetViewPanoramaCamera.zoom);
    }

    /* renamed from: a */
    public final float[] m23048a() {
        if (!this.f19143f) {
            Matrix.setIdentityM(this.f19141d, 0);
            Matrix.rotateM(this.f19141d, 0, 90.0f - (this.f19139b * 180.0f), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.f19141d, 0, this.f19138a, 0.0f, 1.0f, 0.0f);
            this.f19143f = true;
        }
        return this.f19141d;
    }

    /* renamed from: b */
    public final float m23049b() {
        return this.f19138a;
    }

    /* renamed from: a */
    public final void m23046a(float f) {
        this.f19138a = f;
        this.f19143f = false;
    }

    /* renamed from: c */
    public final float m23051c() {
        return this.f19139b;
    }

    /* renamed from: b */
    public final void m23050b(float f) {
        this.f19139b = f;
        this.f19143f = false;
    }

    /* renamed from: d */
    public final float m23053d() {
        return (this.f19139b - 0.5f) * 180.0f;
    }

    /* renamed from: e */
    public final float m23054e() {
        return this.f19140c;
    }

    /* renamed from: c */
    public final void m23052c(float f) {
        this.f19140c = f;
    }

    /* renamed from: a */
    public final void m23047a(float f, int i) {
        f = bp.m22985a(this.f19140c + f, (float) 0, (float) i);
        if (f < 0.05f) {
            f = 0.0f;
        }
        this.f19140c = f;
    }

    /* renamed from: f */
    public final float m23055f() {
        return bp.m22997e(-this.f19140c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return Float.floatToIntBits(this.f19138a) == Float.floatToIntBits(bwVar.f19138a) && Float.floatToIntBits(this.f19139b) == Float.floatToIntBits(bwVar.f19139b) && Float.floatToIntBits(this.f19140c) == Float.floatToIntBits(bwVar.f19140c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19138a), Float.valueOf(this.f19139b), Float.valueOf(this.f19140c)});
    }

    public final String toString() {
        return C5461u.m23765a(this).m23764a("pitch", Float.valueOf(m23053d())).m23764a("yaw", Float.valueOf(this.f19138a)).m23764a("zoom", Float.valueOf(this.f19140c)).toString();
    }
}
