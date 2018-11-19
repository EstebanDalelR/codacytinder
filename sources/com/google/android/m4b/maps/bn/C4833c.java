package com.google.android.m4b.maps.bn;

/* renamed from: com.google.android.m4b.maps.bn.c */
public final class C4833c {
    /* renamed from: c */
    private static int f17634c = 1;
    /* renamed from: d */
    private static int f17635d = 22;
    /* renamed from: e */
    private static final C4833c[] f17636e = new C4833c[22];
    /* renamed from: a */
    private final int f17637a;
    /* renamed from: b */
    private final int f17638b;

    static {
        int i = 256;
        for (int i2 = 1; i2 <= 22; i2++) {
            f17636e[i2 - 1] = new C4833c(i2, i);
            i *= 2;
        }
    }

    private C4833c(int i, int i2) {
        this.f17638b = i;
        this.f17637a = i2;
    }

    /* renamed from: a */
    public static C4833c m21420a(int i) {
        if (22 < f17634c) {
            return 0;
        }
        if (22 > f17635d) {
            i = f17635d;
        }
        return f17636e[i - 1];
    }

    /* renamed from: a */
    public final int m21421a() {
        return this.f17637a;
    }

    public final String toString() {
        return super.toString();
    }
}
