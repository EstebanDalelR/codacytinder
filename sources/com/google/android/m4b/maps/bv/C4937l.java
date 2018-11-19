package com.google.android.m4b.maps.bv;

import android.os.SystemClock;

/* renamed from: com.google.android.m4b.maps.bv.l */
final class C4937l {
    /* renamed from: a */
    final int f18216a;
    /* renamed from: b */
    final int f18217b;
    /* renamed from: c */
    private final int f18218c;
    /* renamed from: d */
    private final C4936a f18219d;
    /* renamed from: e */
    private int f18220e;
    /* renamed from: f */
    private final int f18221f;
    /* renamed from: g */
    private final int f18222g;
    /* renamed from: h */
    private final int f18223h;
    /* renamed from: i */
    private final int f18224i;
    /* renamed from: j */
    private final int f18225j;
    /* renamed from: k */
    private final int f18226k;
    /* renamed from: l */
    private final int f18227l;
    /* renamed from: m */
    private final int f18228m;
    /* renamed from: n */
    private C4926f[] f18229n;
    /* renamed from: o */
    private final float f18230o;
    /* renamed from: p */
    private final float f18231p;
    /* renamed from: q */
    private final float f18232q;
    /* renamed from: r */
    private final float f18233r;
    /* renamed from: s */
    private float[] f18234s;
    /* renamed from: t */
    private boolean f18235t = false;

    /* renamed from: com.google.android.m4b.maps.bv.l$a */
    interface C4936a {
        /* renamed from: a */
        int mo7097a(int i);

        /* renamed from: a */
        C4926f mo7098a(int i, int i2, float f, float f2, int i3, float f3, float f4, float f5, float f6, boolean z);
    }

    public C4937l(int i, int i2, C4936a c4936a, int i3, int i4, int i5, int i6, float f, int i7) {
        if (i2 < 0) {
            throw new IllegalArgumentException("zoomShift");
        }
        this.f18219d = c4936a;
        this.f18218c = i;
        this.f18221f = i3 >> i2;
        this.f18222g = i4 >> i2;
        this.f18223h = i5;
        this.f18224i = i6;
        this.f18225j = this.f18221f / this.f18223h;
        this.f18227l = this.f18221f - (this.f18225j * this.f18223h);
        this.f18226k = this.f18222g / this.f18224i;
        this.f18228m = this.f18222g - (this.f18226k * this.f18224i);
        this.f18220e = i7;
        c4936a = true;
        this.f18216a = this.f18225j + (this.f18227l > 0 ? 1 : 0);
        i = this.f18226k;
        if (this.f18228m <= 0) {
            c4936a = null;
        }
        this.f18217b = i + c4936a;
        this.f18230o = ((float) this.f18223h) / ((float) this.f18221f);
        this.f18231p = ((float) this.f18227l) / ((float) this.f18221f);
        this.f18232q = (((float) this.f18224i) / ((float) this.f18222g)) * f;
        this.f18233r = f * (((float) this.f18228m) / ((float) this.f18222g));
    }

    /* renamed from: a */
    public final int m22122a() {
        return (this.f18216a * this.f18217b) * this.f18220e;
    }

    /* renamed from: a */
    public final int m22124a(int i, int i2, int i3) {
        if (i >= 0) {
            if (i < this.f18216a) {
                if (i2 >= 0) {
                    if (i2 < this.f18217b) {
                        if (i3 >= 0) {
                            if (i3 < this.f18220e) {
                                return (i + (i2 * this.f18216a)) + ((i3 * this.f18216a) * this.f18217b);
                            }
                        }
                        throw new IllegalArgumentException("tileFace");
                    }
                }
                throw new IllegalArgumentException("tileY");
            }
        }
        throw new IllegalArgumentException("tileX");
    }

    /* renamed from: a */
    private static int m22121a(float f, boolean z, int i) {
        return Math.max((int) Math.ceil((double) ((!z ? f / true : f / true) / ((float) i))), true);
    }

    /* renamed from: a */
    public final C4926f m22125a(int i, boolean z) {
        m22126a(z);
        return this.f18229n[i];
    }

    /* renamed from: a */
    public final float[] m22126a(boolean z) {
        boolean z2 = z;
        if (this.f18234s == null || z2 != r0.f18235t) {
            long j;
            int i;
            long uptimeMillis = SystemClock.uptimeMillis();
            int a = C4937l.m22121a(r0.f18230o, z2, r0.f18220e);
            int a2 = C4937l.m22121a(r0.f18231p, z2, r0.f18220e);
            int a3 = C4937l.m22121a(r0.f18232q, z2, r0.f18220e);
            int a4 = C4937l.m22121a(r0.f18233r, z2, r0.f18220e);
            float f = ((float) r0.f18227l) / ((float) r0.f18223h);
            float f2 = ((float) r0.f18228m) / ((float) r0.f18224i);
            r0.f18229n = new C4926f[m22122a()];
            int i2 = 0;
            while (i2 < r0.f18220e) {
                int i3 = 0;
                float f3 = 0.0f;
                while (i3 < r0.f18217b) {
                    int i4 = 0;
                    float f4 = 0.0f;
                    while (i4 < r0.f18216a) {
                        int i5;
                        int i6;
                        int i7;
                        C4926f a5;
                        if (i3 >= r0.f18226k) {
                            i5 = i2;
                            j = uptimeMillis;
                            i6 = i4;
                            i7 = i3;
                            if (i6 < r0.f18225j) {
                                a5 = r0.f18219d.mo7098a(a, a4, f4, f3, i5, r0.f18230o, r0.f18233r, 1.0f, f2, z2);
                            } else {
                                a5 = r0.f18219d.mo7098a(a2, a4, f4, f3, i5, r0.f18231p, r0.f18233r, f, f2, z2);
                            }
                        } else if (i4 < r0.f18225j) {
                            j = uptimeMillis;
                            i6 = i4;
                            i7 = i3;
                            i5 = i2;
                            a5 = r0.f18219d.mo7098a(a, a3, f4, f3, i2, r0.f18230o, r0.f18232q, 1.0f, 1.0f, z2);
                        } else {
                            i5 = i2;
                            j = uptimeMillis;
                            i6 = i4;
                            i7 = i3;
                            a5 = r0.f18219d.mo7098a(a2, a3, f4, f3, i5, r0.f18231p, r0.f18232q, f, 1.0f, z2);
                        }
                        i = i5;
                        r0.f18229n[m22124a(i6, i7, i)] = a5;
                        f4 += r0.f18230o;
                        i4 = i6 + 1;
                        i2 = i;
                        i3 = i7;
                        uptimeMillis = j;
                    }
                    i = i2;
                    f3 += r0.f18232q;
                    i3++;
                    uptimeMillis = uptimeMillis;
                }
                j = uptimeMillis;
                i2++;
            }
            j = uptimeMillis;
            int a6 = m22122a();
            r0.f18234s = new float[(a6 * 4)];
            for (int i8 = 0; i8 < a6; i8++) {
                r0.f18229n[i8].m22082a(r0.f18234s, i8 * 4);
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            i = r0.f18216a;
            int i9 = r0.f18217b;
            int i10 = r0.f18218c;
            long j2 = uptimeMillis2 - j;
            StringBuilder stringBuilder = new StringBuilder(97);
            stringBuilder.append("LevelInfo.genGridsAndBoundingSpheres ");
            stringBuilder.append(i);
            stringBuilder.append("*");
            stringBuilder.append(i9);
            stringBuilder.append("@");
            stringBuilder.append(i10);
            stringBuilder.append(": ");
            stringBuilder.append(j2);
            stringBuilder.append(" ms");
            ac.m22036a(stringBuilder.toString());
            r0.f18235t = z2;
        }
        return r0.f18234s;
    }

    /* renamed from: a */
    public final int m22123a(int i) {
        return this.f18219d.mo7097a(i);
    }
}
