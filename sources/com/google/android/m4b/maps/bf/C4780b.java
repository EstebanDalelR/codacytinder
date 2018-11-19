package com.google.android.m4b.maps.bf;

/* renamed from: com.google.android.m4b.maps.bf.b */
public final class C4780b {
    /* renamed from: a */
    private int f17465a;
    /* renamed from: b */
    private int f17466b;
    /* renamed from: c */
    private int f17467c;
    /* renamed from: d */
    private int f17468d;
    /* renamed from: e */
    private int f17469e;
    /* renamed from: f */
    private int f17470f;

    public C4780b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 == 0 || i5 == 1) {
            this.f17465a = i;
            this.f17466b = i2;
            this.f17467c = i3;
            this.f17468d = i4;
            this.f17469e = i5;
            this.f17470f = i6;
            return;
        }
        i2 = new StringBuilder(30);
        i2.append("qualityAlgorithm = ");
        i2.append(i5);
        throw new IllegalArgumentException(i2.toString());
    }

    /* renamed from: a */
    public final int m21169a() {
        return this.f17465a;
    }

    /* renamed from: b */
    public final int m21170b() {
        return this.f17466b;
    }

    /* renamed from: c */
    public final int m21171c() {
        return this.f17467c;
    }

    /* renamed from: d */
    public final int m21172d() {
        return this.f17468d;
    }

    /* renamed from: e */
    public final int m21173e() {
        return this.f17469e;
    }
}
