package com.google.android.m4b.maps.bx;

import java.util.Arrays;
import java.util.TreeSet;

public final class as {
    /* renamed from: a */
    public static final as f18464a = new as(21);
    /* renamed from: b */
    private final int f18465b;
    /* renamed from: c */
    private final int[] f18466c;
    /* renamed from: d */
    private final int f18467d;
    /* renamed from: e */
    private final int f18468e;
    /* renamed from: f */
    private final int f18469f;
    /* renamed from: g */
    private final int f18470g;
    /* renamed from: h */
    private final int[] f18471h;
    /* renamed from: i */
    private final int[] f18472i;
    /* renamed from: j */
    private final float[] f18473j;
    /* renamed from: k */
    private TreeSet<Integer> f18474k;
    /* renamed from: l */
    private final float[] f18475l;

    public as(int[] iArr, int i, int i2, int i3) {
        this.f18466c = iArr;
        this.f18465b = i2;
        i2 = 1065353216 / ((float) i2);
        this.f18470g = i3;
        iArr = this.f18466c.length;
        int i4 = 0;
        this.f18468e = this.f18466c[0];
        this.f18469f = this.f18466c[iArr - 1];
        this.f18467d = i;
        this.f18473j = new float[(this.f18469f + 1)];
        this.f18475l = new float[(this.f18469f + 1)];
        Arrays.fill(this.f18473j, -1.0f);
        Arrays.fill(this.f18475l, -1.0f);
        this.f18474k = new TreeSet();
        i = this.f18467d;
        i3 = (float) this.f18467d;
        while (i4 < iArr) {
            this.f18474k.add(Integer.valueOf(this.f18466c[i4]));
            if (this.f18473j[this.f18466c[i4]] < 0.0f) {
                int i5 = (((float) i4) * i2) + ((float) this.f18467d);
                while (i < this.f18466c[i4]) {
                    this.f18473j[i] = i3;
                    this.f18475l[i] = i5;
                    i++;
                }
                this.f18473j[i] = i5;
                i3 = i5;
            }
            i4++;
        }
        this.f18471h = new int[(this.f18469f + 1)];
        this.f18472i = new int[(this.f18469f + 1)];
        i = -1;
        Arrays.fill(this.f18471h, -1);
        Arrays.fill(this.f18472i, -1);
        iArr = this.f18474k.iterator();
        while (iArr.hasNext() != 0) {
            i2 = ((Integer) iArr.next()).intValue();
            this.f18471h[i2] = i;
            if (i >= 0) {
                this.f18472i[i] = i2;
            }
            i = i2;
        }
    }

    private as(int i) {
        this.f18466c = new int[0];
        this.f18465b = 1;
        this.f18470g = 21;
        this.f18468e = -1;
        this.f18469f = 21;
        this.f18467d = 22;
        this.f18473j = new float[0];
        this.f18475l = new float[0];
        this.f18474k = new TreeSet();
        this.f18471h = new int[0];
        this.f18472i = new int[0];
    }

    /* renamed from: a */
    public final int m22353a() {
        return this.f18470g;
    }

    /* renamed from: a */
    public final int m22354a(float f) {
        int i = (int) ((f - ((float) this.f18467d)) * ((float) this.f18465b));
        if (i >= this.f18466c.length) {
            return this.f18469f;
        }
        if (i < 0) {
            return -1;
        }
        return this.f18466c[i];
    }

    /* renamed from: a */
    public final int m22355a(int i) {
        if (i >= 0) {
            if (i < this.f18471h.length) {
                return this.f18471h[i];
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m22357b(int i) {
        if (i >= 0) {
            if (i < this.f18472i.length) {
                return this.f18472i[i];
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m22356b() {
        return this.f18469f;
    }

    /* renamed from: c */
    public final boolean m22358c(int i) {
        return this.f18474k.contains(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final float m22359d(int i) {
        if (i >= 0) {
            if (i < this.f18473j.length) {
                return this.f18473j[i];
            }
        }
        return -1082130432;
    }

    /* renamed from: e */
    public final float m22360e(int i) {
        if (i >= 0) {
            if (i < this.f18473j.length) {
                return this.f18475l[i];
            }
        }
        return -1082130432;
    }
}
