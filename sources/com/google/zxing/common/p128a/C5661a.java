package com.google.zxing.common.p128a;

/* renamed from: com.google.zxing.common.a.a */
public final class C5661a {
    /* renamed from: a */
    public static final C5661a f20968a = new C5661a(4201, 4096, 1);
    /* renamed from: b */
    public static final C5661a f20969b = new C5661a(1033, 1024, 1);
    /* renamed from: c */
    public static final C5661a f20970c = new C5661a(67, 64, 1);
    /* renamed from: d */
    public static final C5661a f20971d = new C5661a(19, 16, 1);
    /* renamed from: e */
    public static final C5661a f20972e = new C5661a(285, 256, 0);
    /* renamed from: f */
    public static final C5661a f20973f;
    /* renamed from: g */
    public static final C5661a f20974g;
    /* renamed from: h */
    public static final C5661a f20975h = f20970c;
    /* renamed from: i */
    private final int[] f20976i;
    /* renamed from: j */
    private final int[] f20977j;
    /* renamed from: k */
    private final C5662b f20978k;
    /* renamed from: l */
    private final C5662b f20979l;
    /* renamed from: m */
    private final int f20980m;
    /* renamed from: n */
    private final int f20981n;
    /* renamed from: o */
    private final int f20982o;

    /* renamed from: b */
    static int m24731b(int i, int i2) {
        return i ^ i2;
    }

    static {
        C5661a c5661a = new C5661a(301, 256, 1);
        f20973f = c5661a;
        f20974g = c5661a;
    }

    public C5661a(int i, int i2, int i3) {
        this.f20981n = i;
        this.f20980m = i2;
        this.f20982o = i3;
        this.f20976i = new int[i2];
        this.f20977j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f20976i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (i = 0; i < i2 - 1; i++) {
            this.f20977j[this.f20976i[i]] = i;
        }
        this.f20978k = new C5662b(this, new int[]{null});
        this.f20979l = new C5662b(this, new int[]{1});
    }

    /* renamed from: a */
    C5662b m24733a() {
        return this.f20978k;
    }

    /* renamed from: a */
    C5662b m24734a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f20978k;
        } else {
            i = new int[(i + 1)];
            i[0] = i2;
            return new C5662b(this, i);
        }
    }

    /* renamed from: a */
    int m24732a(int i) {
        return this.f20976i[i];
    }

    /* renamed from: b */
    int m24736b(int i) {
        if (i != 0) {
            return this.f20977j[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    int m24737c(int i) {
        if (i != 0) {
            return this.f20976i[(this.f20980m - this.f20977j[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    int m24738c(int i, int i2) {
        if (i != 0) {
            if (i2 != 0) {
                return this.f20976i[(this.f20977j[i] + this.f20977j[i2]) % (this.f20980m - 1)];
            }
        }
        return 0;
    }

    /* renamed from: b */
    public int m24735b() {
        return this.f20982o;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString(this.f20981n));
        stringBuilder.append(',');
        stringBuilder.append(this.f20980m);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
