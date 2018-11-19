package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C5660c;

/* renamed from: com.google.zxing.datamatrix.encoder.k */
public class C5672k {
    /* renamed from: a */
    static final C5672k[] f21017a;
    /* renamed from: d */
    private static C5672k[] f21018d;
    /* renamed from: b */
    public final int f21019b;
    /* renamed from: c */
    public final int f21020c;
    /* renamed from: e */
    private final boolean f21021e;
    /* renamed from: f */
    private final int f21022f;
    /* renamed from: g */
    private final int f21023g;
    /* renamed from: h */
    private final int f21024h;
    /* renamed from: i */
    private final int f21025i;
    /* renamed from: j */
    private final int f21026j;

    static {
        C5672k[] c5672kArr = new C5672k[]{new C5672k(false, 3, 5, 8, 8, 1), new C5672k(false, 5, 7, 10, 10, 1), new C5672k(true, 5, 7, 16, 6, 1), new C5672k(false, 8, 10, 12, 12, 1), new C5672k(true, 10, 11, 14, 6, 2), new C5672k(false, 12, 12, 14, 14, 1), new C5672k(true, 16, 14, 24, 10, 1), new C5672k(false, 18, 14, 16, 16, 1), new C5672k(false, 22, 18, 18, 18, 1), new C5672k(true, 22, 18, 16, 10, 2), new C5672k(false, 30, 20, 20, 20, 1), new C5672k(true, 32, 24, 16, 14, 2), new C5672k(false, 36, 24, 22, 22, 1), new C5672k(false, 44, 28, 24, 24, 1), new C5672k(true, 49, 28, 22, 14, 2), new C5672k(false, 62, 36, 14, 14, 4), new C5672k(false, 86, 42, 16, 16, 4), new C5672k(false, 114, 48, 18, 18, 4), new C5672k(false, 144, 56, 20, 20, 4), new C5672k(false, 174, 68, 22, 22, 4), new C5672k(false, 204, 84, 24, 24, 4, 102, 42), new C5672k(false, 280, 112, 14, 14, 16, 140, 56), new C5672k(false, 368, 144, 16, 16, 16, 92, 36), new C5672k(false, 456, 192, 18, 18, 16, 114, 48), new C5672k(false, 576, 224, 20, 20, 16, 144, 56), new C5672k(false, 696, 272, 22, 22, 16, 174, 68), new C5672k(false, 816, 336, 24, 24, 16, 136, 56), new C5672k(false, 1050, 408, 18, 18, 36, 175, 68), new C5672k(false, 1304, 496, 20, 20, 36, 163, 62), new C6998d()};
        f21017a = c5672kArr;
        f21018d = c5672kArr;
    }

    public C5672k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    C5672k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f21021e = z;
        this.f21022f = i;
        this.f21023g = i2;
        this.f21019b = i3;
        this.f21020c = i4;
        this.f21024h = i5;
        this.f21025i = i6;
        this.f21026j = i7;
    }

    /* renamed from: a */
    public static C5672k m24827a(int i, SymbolShapeHint symbolShapeHint, C5660c c5660c, C5660c c5660c2, boolean z) {
        for (C5672k c5672k : f21018d) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !c5672k.f21021e) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || c5672k.f21021e) && ((c5660c == null || (c5672k.m24835d() >= c5660c.m24729a() && c5672k.m24836e() >= c5660c.m24730b())) && ((c5660c2 == null || (c5672k.m24835d() <= c5660c2.m24729a() && c5672k.m24836e() <= c5660c2.m24730b())) && i <= c5672k.f21022f)))) {
                return c5672k;
            }
        }
        if (!z) {
            return 0;
        }
        c5660c = new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ");
        c5660c.append(i);
        throw new IllegalArgumentException(c5660c.toString());
    }

    /* renamed from: h */
    private int m24828h() {
        int i = this.f21024h;
        if (i != 4) {
            if (i == 16) {
                return 4;
            }
            if (i == 36) {
                return 6;
            }
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    break;
                default:
                    throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return 2;
    }

    /* renamed from: i */
    private int m24829i() {
        int i = this.f21024h;
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        switch (i) {
            case 1:
            case 2:
                return 1;
            default:
                throw new IllegalStateException("Cannot handle this number of data regions");
        }
    }

    /* renamed from: b */
    public final int m24832b() {
        return m24828h() * this.f21019b;
    }

    /* renamed from: c */
    public final int m24834c() {
        return m24829i() * this.f21020c;
    }

    /* renamed from: d */
    public final int m24835d() {
        return m24832b() + (m24828h() << 1);
    }

    /* renamed from: e */
    public final int m24836e() {
        return m24834c() + (m24829i() << 1);
    }

    /* renamed from: a */
    public int mo6178a() {
        return this.f21022f / this.f21025i;
    }

    /* renamed from: f */
    public final int m24837f() {
        return this.f21022f;
    }

    /* renamed from: g */
    public final int m24838g() {
        return this.f21023g;
    }

    /* renamed from: a */
    public int mo6179a(int i) {
        return this.f21025i;
    }

    /* renamed from: b */
    public final int m24833b(int i) {
        return this.f21026j;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21021e ? "Rectangular Symbol:" : "Square Symbol:");
        stringBuilder.append(" data region ");
        stringBuilder.append(this.f21019b);
        stringBuilder.append('x');
        stringBuilder.append(this.f21020c);
        stringBuilder.append(", symbol size ");
        stringBuilder.append(m24835d());
        stringBuilder.append('x');
        stringBuilder.append(m24836e());
        stringBuilder.append(", symbol data size ");
        stringBuilder.append(m24832b());
        stringBuilder.append('x');
        stringBuilder.append(m24834c());
        stringBuilder.append(", codewords ");
        stringBuilder.append(this.f21022f);
        stringBuilder.append('+');
        stringBuilder.append(this.f21023g);
        return stringBuilder.toString();
    }
}
