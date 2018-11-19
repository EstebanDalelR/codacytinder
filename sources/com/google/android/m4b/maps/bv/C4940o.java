package com.google.android.m4b.maps.bv;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.google.android.m4b.maps.bv.o */
public final class C4940o {
    /* renamed from: a */
    private final float[] f18242a;
    /* renamed from: b */
    private int f18243b;
    /* renamed from: c */
    private final float[] f18244c;

    public C4940o() {
        this(32);
    }

    private C4940o(int i) {
        this.f18242a = new float[512];
        this.f18244c = new float[32];
        m22134a();
    }

    /* renamed from: a */
    public final void m22137a(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.frustumM(this.f18242a, this.f18243b, f, f2, f3, f4, f5, f6);
    }

    /* renamed from: a */
    public final void m22140a(int i, int i2, int i3, int i4, int i5, int i6) {
        m22137a(((float) i) * 1.5258789E-5f, ((float) i2) * 1.5258789E-5f, ((float) i3) * 1.5258789E-5f, ((float) i4) * 1.5258789E-5f, ((float) i5) * 1.5258789E-5f, ((float) i6) * 1.5258789E-5f);
    }

    /* renamed from: a */
    public final void m22134a() {
        Matrix.setIdentityM(this.f18242a, this.f18243b);
    }

    /* renamed from: a */
    public final void m22143a(float[] fArr, int i) {
        System.arraycopy(fArr, i, this.f18242a, this.f18243b, 16);
    }

    /* renamed from: a */
    public final void m22141a(FloatBuffer floatBuffer) {
        floatBuffer.get(this.f18242a, this.f18243b, 16);
    }

    /* renamed from: a */
    public final void m22144a(int[] iArr, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            this.f18242a[this.f18243b + i2] = ((float) iArr[i + i2]) * 1.5258789E-5f;
        }
    }

    /* renamed from: a */
    public final void m22142a(IntBuffer intBuffer) {
        for (int i = 0; i < 16; i++) {
            this.f18242a[this.f18243b + i] = ((float) intBuffer.get()) * 1.5258789E-5f;
        }
    }

    /* renamed from: b */
    public final void m22152b(float[] fArr, int i) {
        System.arraycopy(this.f18242a, this.f18243b, this.f18244c, 0, 16);
        Matrix.multiplyMM(this.f18242a, this.f18243b, this.f18244c, 0, fArr, i);
    }

    /* renamed from: b */
    public final void m22150b(FloatBuffer floatBuffer) {
        floatBuffer.get(this.f18244c, 16, 16);
        m22152b(this.f18244c, 16);
    }

    /* renamed from: b */
    public final void m22153b(int[] iArr, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            this.f18244c[i2 + 16] = ((float) iArr[i + i2]) * 1.5258789E-5f;
        }
        m22152b(this.f18244c, 16);
    }

    /* renamed from: b */
    public final void m22151b(IntBuffer intBuffer) {
        for (int i = 0; i < 16; i++) {
            this.f18244c[i + 16] = ((float) intBuffer.get()) * 1.5258789E-5f;
        }
        m22152b(this.f18244c, 16);
    }

    /* renamed from: b */
    public final void m22147b(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(this.f18242a, this.f18243b, f, f2, f3, f4, f5, f6);
    }

    /* renamed from: b */
    public final void m22149b(int i, int i2, int i3, int i4, int i5, int i6) {
        m22147b(((float) i) * 1.5258789E-5f, ((float) i2) * 1.5258789E-5f, ((float) i3) * 1.5258789E-5f, ((float) i4) * 1.5258789E-5f, ((float) i5) * 1.5258789E-5f, ((float) i6) * 1.5258789E-5f);
    }

    /* renamed from: b */
    public final void m22145b() {
        m22132a(-1);
        m22133b(-1);
    }

    /* renamed from: c */
    public final void m22154c() {
        m22132a(1);
        System.arraycopy(this.f18242a, this.f18243b, this.f18242a, this.f18243b + 16, 16);
        m22133b(1);
    }

    /* renamed from: a */
    public final void m22136a(float f, float f2, float f3, float f4) {
        Matrix.setRotateM(this.f18244c, 0, f, f2, f3, f4);
        System.arraycopy(this.f18242a, this.f18243b, this.f18244c, 16, 16);
        Matrix.multiplyMM(this.f18242a, this.f18243b, this.f18244c, 16, this.f18244c, 0);
    }

    /* renamed from: a */
    public final void m22139a(int i, int i2, int i3, int i4) {
        m22136a((float) i, ((float) i2) * 931135488, ((float) i3) * 931135488, ((float) i4) * 931135488);
    }

    /* renamed from: a */
    public final void m22135a(float f, float f2, float f3) {
        Matrix.scaleM(this.f18242a, this.f18243b, f, f2, f3);
    }

    /* renamed from: a */
    public final void m22138a(int i, int i2, int i3) {
        m22135a(((float) i) * 931135488, ((float) i2) * 931135488, ((float) i3) * 931135488);
    }

    /* renamed from: b */
    public final void m22146b(float f, float f2, float f3) {
        Matrix.translateM(this.f18242a, this.f18243b, f, f2, f3);
    }

    /* renamed from: b */
    public final void m22148b(int i, int i2, int i3) {
        m22146b(((float) i) * 931135488, ((float) i2) * 931135488, ((float) i3) * 931135488);
    }

    /* renamed from: c */
    public final void m22155c(float[] fArr, int i) {
        System.arraycopy(this.f18242a, this.f18243b, fArr, i, 16);
    }

    /* renamed from: a */
    private void m22132a(int i) {
        int i2 = this.f18243b + (i * 16);
        if (i2 < 0) {
            throw new IllegalArgumentException("stack underflow");
        } else if (i2 + 16 > this.f18242a.length) {
            throw new IllegalArgumentException("stack overflow");
        }
    }

    /* renamed from: b */
    private void m22133b(int i) {
        this.f18243b += i * 16;
    }
}
