package com.google.android.m4b.maps.ag;

import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.p125y.C5571j;
import java.math.BigInteger;

/* renamed from: com.google.android.m4b.maps.ag.b */
public final class C4610b {
    /* renamed from: a */
    private static final long[] f17024a = new long[37];
    /* renamed from: b */
    private static final int[] f17025b = new int[37];
    /* renamed from: c */
    private static final int[] f17026c = new int[37];

    /* renamed from: a */
    private static int m20699a(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        j = j2 ^ Long.MIN_VALUE;
        return j3 < j ? -1 : j3 > j ? 1 : 0;
    }

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j;
            long j2;
            long[] jArr = f17024a;
            long j3 = (long) i;
            long j4 = -1;
            if (j3 < 0) {
                j = C4610b.m20699a(-1, j3) < 0 ? 0 : 1;
            } else {
                j2 = (Format.OFFSET_SAMPLE_RELATIVE / j3) << 1;
                j = j2 + ((long) (C4610b.m20699a(-1 - (j2 * j3), j3) >= 0 ? 1 : 0));
            }
            jArr[i] = j;
            int[] iArr = f17025b;
            if (j3 >= 0) {
                j2 = -1 - (((Format.OFFSET_SAMPLE_RELATIVE / j3) << 1) * j3);
                if (C4610b.m20699a(j2, j3) < 0) {
                    j3 = 0;
                }
            } else if (C4610b.m20699a(-1, j3) < 0) {
                iArr[i] = (int) j4;
                f17026c[i] = bigInteger.toString(i).length() - 1;
            } else {
                j2 = -1;
            }
            j4 = j2 - j3;
            iArr[i] = (int) j4;
            f17026c[i] = bigInteger.toString(i).length() - 1;
        }
    }

    /* renamed from: a */
    public static long m20700a(String str) {
        C5571j.m24292a((Object) str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = f17026c[10] - 1;
        long j = 0;
        int i2 = 0;
        while (i2 < str.length()) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit == -1) {
                throw new NumberFormatException(str);
            }
            if (i2 > i) {
                Object obj;
                if (j < 0 || (j >= f17024a[10] && (j > f17024a[10] || digit > f17025b[10]))) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    StringBuilder stringBuilder = new StringBuilder("Too large for unsigned long: ");
                    stringBuilder.append(str);
                    throw new NumberFormatException(stringBuilder.toString());
                }
            }
            i2++;
            j = (j * 10) + ((long) digit);
        }
        return j;
    }
}
