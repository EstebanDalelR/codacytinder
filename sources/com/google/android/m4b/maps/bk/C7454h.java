package com.google.android.m4b.maps.bk;

import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bk.h */
final class C7454h extends C6466g {
    /* renamed from: b */
    private int[] f27352b;

    protected C7454h(double[] dArr, int[] iArr) {
        super(dArr);
        this.f27352b = iArr;
    }

    /* renamed from: c */
    public final int mo5027c(int i) {
        int f = mo7060f(i);
        i--;
        if (m32174c(i, f)) {
            return i;
        }
        return this.f27352b[f + 1] - 1;
    }

    /* renamed from: d */
    public final int mo5028d(int i) {
        int f = mo7060f(i);
        i++;
        if (m32174c(i, f)) {
            return i;
        }
        return this.f27352b[f];
    }

    /* renamed from: f */
    public final int mo7060f(int i) {
        if (i >= 0) {
            if (i < this.a) {
                int i2 = 0;
                while (i >= this.f27352b[i2]) {
                    i2++;
                }
                return i2 - 1;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public final int mo7061g(int i) {
        return this.f27352b[i];
    }

    /* renamed from: a */
    public final int mo5024a() {
        return this.f27352b.length - 2;
    }

    /* renamed from: c */
    private boolean m32174c(int i, int i2) {
        return i >= this.f27352b[i2] && i < this.f27352b[i2 + 1];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7454h)) {
            return false;
        }
        C7454h c7454h = (C7454h) obj;
        if ((this instanceof C7454h) && super.equals(obj) != null) {
            if (Arrays.equals(this.f27352b, c7454h.f27352b) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected final boolean mo7058a(Object obj) {
        return obj instanceof C7454h;
    }

    public final int hashCode() {
        return super.hashCode() + (Arrays.hashCode(this.f27352b) * 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(m32175i());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    private String m32175i() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while (i < this.f27352b.length - 1) {
            stringBuilder.append("\nHole ");
            stringBuilder.append(i);
            stringBuilder.append(":");
            int i2 = this.f27352b[i];
            i++;
            stringBuilder.append(m28351b(i2, this.f27352b[i]));
        }
        return stringBuilder.toString();
    }
}
