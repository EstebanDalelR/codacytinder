package com.google.android.m4b.maps.aa;

/* renamed from: com.google.android.m4b.maps.aa.x */
final class C4588x {
    /* renamed from: a */
    private static int f16991a = 1073741824;

    /* renamed from: a */
    static int m20678a(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: a */
    static int m20679a(int i, double d) {
        i = Math.max(i, 1.0E-323d);
        d = Integer.highestOneBit(i);
        if (i <= ((int) (((double) d) * 1.2d))) {
            return d;
        }
        i = d << 1;
        if (i > 0) {
            return i;
        }
        return f16991a;
    }
}
