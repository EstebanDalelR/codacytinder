package android.support.v4.util;

/* renamed from: android.support.v4.util.c */
class C0547c {
    /* renamed from: a */
    static final int[] f1699a = new int[0];
    /* renamed from: b */
    static final long[] f1700b = new long[0];
    /* renamed from: c */
    static final Object[] f1701c = new Object[0];

    /* renamed from: c */
    public static int m2020c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m2015a(int i) {
        return C0547c.m2020c(i * 4) / 4;
    }

    /* renamed from: b */
    public static int m2019b(int i) {
        return C0547c.m2020c(i * 8) / 8;
    }

    /* renamed from: a */
    public static boolean m2018a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static int m2016a(int[] iArr, int i, int i2) {
        i--;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            int i5 = iArr[i4];
            if (i5 < i2) {
                i3 = i4 + 1;
            } else if (i5 <= i2) {
                return i4;
            } else {
                i = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    static int m2017a(long[] jArr, int i, long j) {
        i--;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j2 = jArr[i3];
            if (j2 < j) {
                i2 = i3 + 1;
            } else if (j2 <= j) {
                return i3;
            } else {
                i = i3 - 1;
            }
        }
        return i2 ^ -1;
    }
}
